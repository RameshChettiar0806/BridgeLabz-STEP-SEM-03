 class Vehicle {
    private String registrationNo;
    private double ratePerDay;
    private String type;
    // TODO: Create constructor initializing all fields
    Vehicle(String registrationNo, String type, double ratePerDay){
        this.registrationNo = registrationNo;
        this.type = type;
        this.ratePerDay = ratePerDay;
    }

    // TODO: Override toString() to print: "Vehicle:[registrationNo], Type: [type], Rate: $[ratePerDay]/day"
    @Override
    public String toString(){
        return "Vehicle:[ " + registrationNo + "], Type: [ "+ type + "], Rate = $[" + ratePerDay + "]"; 
    }
    // TODO: Create getters for all fields
    public String getRegistrationNo(){
        return registrationNo;
    }
    public String getType(){
        return type;
    }
    public double getRatePerDay(){
        return ratePerDay;
    }
    }
    
    public class VehicleRental {
        public static void main(String[] args) {
        // 1. Create Vehicle("MH12AB1234", "Sedan", 1500)
        Vehicle obj1 = new Vehicle("MH12AB1234", "Sedan", 1500);
        // 2. Print the Vehicle object and observe output
        System.out.println(obj1);
        // 3. Create another vehicle and compare
        Vehicle obj2 = new Vehicle("MH04FR4851","Hatchback",1200);
        
        System.out.println(obj1 == obj2);
        }
    }