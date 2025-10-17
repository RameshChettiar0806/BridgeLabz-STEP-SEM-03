/*
 * Concept: Downcasting
Create an art gallery system handling different artwork types:
● Paintings have brush techniques, color palettes, and frame specifications
● Sculptures have material composition, dimensions, and lighting requirements
● Digital art has resolution, file formats, and interactive elements
● Photography has camera settings, editing details, and print specifications
Sometimes curators need access to specific artwork features for exhibition planning.
Hint: From general art piece to specific medium - unlock the details when needed!
 */

abstract class ArtPiece {
    String title;
    String artist;

    ArtPiece(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void displayBasicInfo() {
        System.out.println("Title: " + title + ", Artist: " + artist);
    }
}

class Painting extends ArtPiece {
    String brushTechnique;
    String colorPalette;
    String frameSpec;

    Painting(String title, String artist, String brushTechnique, String colorPalette, String frameSpec) {
        super(title, artist);
        this.brushTechnique = brushTechnique;
        this.colorPalette = colorPalette;
        this.frameSpec = frameSpec;
    }

    void displayPaintingDetails() {
        System.out.println("Brush Technique: " + brushTechnique);
        System.out.println("Color Palette: " + colorPalette);
        System.out.println("Frame Specification: " + frameSpec);
    }
}

class Sculpture extends ArtPiece {
    String material;
    String dimensions;
    String lightingReq;

    Sculpture(String title, String artist, String material, String dimensions, String lightingReq) {
        super(title, artist);
        this.material = material;
        this.dimensions = dimensions;
        this.lightingReq = lightingReq;
    }

    void displaySculptureDetails() {
        System.out.println("Material Composition: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Lighting Requirements: " + lightingReq);
    }
}

class DigitalArt extends ArtPiece {
    String resolution;
    String fileFormat;
    String interactiveElements;

    DigitalArt(String title, String artist, String resolution, String fileFormat, String interactiveElements) {
        super(title, artist);
        this.resolution = resolution;
        this.fileFormat = fileFormat;
        this.interactiveElements = interactiveElements;
    }

    void displayDigitalArtDetails() {
        System.out.println("Resolution: " + resolution);
        System.out.println("File Format: " + fileFormat);
        System.out.println("Interactive Elements: " + interactiveElements);
    }
}

class Photography extends ArtPiece {
    String cameraSettings;
    String editingDetails;
    String printSpec;

    Photography(String title, String artist, String cameraSettings, String editingDetails, String printSpec) {
        super(title, artist);
        this.cameraSettings = cameraSettings;
        this.editingDetails = editingDetails;
        this.printSpec = printSpec;
    }

    void displayPhotographyDetails() {
        System.out.println("Camera Settings: " + cameraSettings);
        System.out.println("Editing Details: " + editingDetails);
        System.out.println("Print Specification: " + printSpec);
    }
}

public class DigitalArtGallery {
    public static void main(String[] args) {
        // Create an array of general ArtPiece references
        ArtPiece[] gallery = new ArtPiece[4];
        gallery[0] = new Painting("Sunset Bliss", "A. Kumar", "Impressionist", "Warm Tones", "Ornate Gold Frame");
        gallery[1] = new Sculpture("The Thinker", "B. Singh", "Bronze", "2m x 1m x 1m", "Spotlight");
        gallery[2] = new DigitalArt("Virtual Dreams", "C. Rao", "4K", "PNG", "Touch Responsive");
        gallery[3] = new Photography("City Lights", "D. Patel", "ISO 800, f/2.8", "HDR, Cropped", "Glossy A3");

        for (ArtPiece art : gallery) {
            art.displayBasicInfo();

            // Downcasting to access specific details
            if (art instanceof Painting) {
                System.out.println("-- Painting Details --");
                ((Painting) art).displayPaintingDetails();
            } else if (art instanceof Sculpture) {
                System.out.println("-- Sculpture Details --");
                ((Sculpture) art).displaySculptureDetails();
            } else if (art instanceof DigitalArt) {
                System.out.println("-- Digital Art Details --");
                ((DigitalArt) art).displayDigitalArtDetails();
            } else if (art instanceof Photography) {
                System.out.println("-- Photography Details --");
                ((Photography) art).displayPhotographyDetails();
            }
            System.out.println();
        }
    }
}
