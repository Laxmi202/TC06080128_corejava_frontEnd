import java.util.Scanner;

class Tile {
    private double edgeLength;

    public Tile(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }
}

class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double totalTiles(Tile tile) {
        double tileArea = tile.getEdgeLength() * tile.getEdgeLength();
        double floorArea = calculateArea();
        return (int) Math.ceil(floorArea / tileArea);
    }
}

class TileFloorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the Tile
        System.out.print("Enter the edge length of the tile: ");
        double tileEdgeLength = scanner.nextDouble();
        Tile tile = new Tile(tileEdgeLength);

        // Get input for the Floor
        System.out.print("Enter the length of the floor: ");
        double floorLength = scanner.nextDouble();

        System.out.print("Enter the width of the floor: ");
        double floorWidth = scanner.nextDouble();

        Floor floor = new Floor(floorLength, floorWidth);

        // Calculate the total number of tiles needed to cover the floor
        double totalTilesNeeded = floor.totalTiles(tile);

        // Output the result
        System.out.println("Total tiles needed: " + totalTilesNeeded);

        // Close the scanner
        scanner.close();
    }
}
