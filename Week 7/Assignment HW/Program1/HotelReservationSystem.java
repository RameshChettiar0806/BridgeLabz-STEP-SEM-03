/*
 * You're building a hotel reservation system that calculates room prices in various ways:
 * ● Standard booking (just room type and nights)
 * ● Seasonal booking (room type, nights + seasonal multiplier)
 * ● Corporate booking (room type, nights + corporate discount + meal package)
 * ● Wedding package (room type, nights + guest count + decoration fee + catering options)
 * Each calculation should display a detailed breakdown of costs and savings applied.
 * Hint: Multiple ways to book the same room - let method signatures handle the complexity!
 */

class Room {
	String type;
	double basePricePerNight;

	Room(String type, double basePricePerNight) {
		this.type = type;
		this.basePricePerNight = basePricePerNight;
	}
}

class BookingCalculator {
	// Standard booking
	static double calculateStandard(Room room, int nights) {
		return room.basePricePerNight * nights;
	}

	// Seasonal booking
	static double calculateSeasonal(Room room, int nights, double seasonalMultiplier) {
		return room.basePricePerNight * nights * seasonalMultiplier;
	}

	// Corporate booking
	static double calculateCorporate(Room room, int nights, double discountPercent, double mealPackagePerNight) {
		double base = room.basePricePerNight * nights;
		double discount = base * (discountPercent / 100.0);
		double meals = mealPackagePerNight * nights;
		return base - discount + meals;
	}

	// Wedding package
	static double calculateWedding(Room room, int nights, int guestCount, double decorationFee, double cateringPerGuest) {
		double base = room.basePricePerNight * nights;
		double catering = cateringPerGuest * guestCount;
		return base + decorationFee + catering;
	}
}

public class HotelReservationSystem {
	public static void main(String[] args) {
		Room deluxe = new Room("Deluxe", 3000);
		Room suite = new Room("Suite", 5000);

		// Standard booking
		int nights = 3;
		double stdTotal = BookingCalculator.calculateStandard(deluxe, nights);
		System.out.println("--- Standard Booking ---");
		System.out.println("Room: " + deluxe.type);
		System.out.println("Nights: " + nights);
		System.out.println("Base Price: Rs. " + deluxe.basePricePerNight + " x " + nights + " = Rs. " + stdTotal);

		// Seasonal booking
		double seasonalMultiplier = 1.2;
		double seasonalTotal = BookingCalculator.calculateSeasonal(suite, nights, seasonalMultiplier);
		System.out.println("\n--- Seasonal Booking ---");
		System.out.println("Room: " + suite.type);
		System.out.println("Nights: " + nights);
		System.out.println("Base Price: Rs. " + suite.basePricePerNight + " x " + nights + " = Rs. " + (suite.basePricePerNight * nights));
		System.out.println("Seasonal Multiplier: " + seasonalMultiplier);
		System.out.println("Total Price: Rs. " + seasonalTotal);

		// Corporate booking
		double discountPercent = 15;
		double mealPackagePerNight = 500;
		double corpTotal = BookingCalculator.calculateCorporate(deluxe, nights, discountPercent, mealPackagePerNight);
		double baseCorp = deluxe.basePricePerNight * nights;
		double discountCorp = baseCorp * (discountPercent / 100.0);
		double mealsCorp = mealPackagePerNight * nights;
		System.out.println("\n--- Corporate Booking ---");
		System.out.println("Room: " + deluxe.type);
		System.out.println("Nights: " + nights);
		System.out.println("Base Price: Rs. " + baseCorp);
		System.out.println("Corporate Discount: " + discountPercent + "% (-Rs. " + discountCorp + ")");
		System.out.println("Meal Package: Rs. " + mealPackagePerNight + " x " + nights + " = Rs. " + mealsCorp);
		System.out.println("Total Price: Rs. " + corpTotal);

		// Wedding package
		int guestCount = 100;
		double decorationFee = 20000;
		double cateringPerGuest = 800;
		double wedTotal = BookingCalculator.calculateWedding(suite, nights, guestCount, decorationFee, cateringPerGuest);
		double baseWed = suite.basePricePerNight * nights;
		double cateringWed = cateringPerGuest * guestCount;
		System.out.println("\n--- Wedding Package ---");
		System.out.println("Room: " + suite.type);
		System.out.println("Nights: " + nights);
		System.out.println("Base Price: Rs. " + baseWed);
		System.out.println("Decoration Fee: Rs. " + decorationFee);
		System.out.println("Catering: Rs. " + cateringPerGuest + " x " + guestCount + " = Rs. " + cateringWed);
		System.out.println("Total Price: Rs. " + wedTotal);
	}
}
