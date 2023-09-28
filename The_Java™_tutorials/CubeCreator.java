import java.util.Scanner;

class CubeCreator {
    public static void main(String[] args) {
        int width, length, height, myCubic, yourCubic;
        String unit, myShape, yourShape;

        Scanner sc = new Scanner(System.in);

        System.out.print("Välj figurens bredd: ");
        width = sc.nextInt();

        System.out.print("Välj figurens längd: ");
        length = sc.nextInt();

        System.out.print("Välj figurens höjd: ");
        height = sc.nextInt();
        
        System.out.print("Välj enhet: ");
        unit = sc.next();

        sc.close();
        
        Cube myCube = new Cube("röd");
        myCubic = myCube.getCubic(width, length, height);
        myShape = myCube.determineShape();

        Cube yourCube = new Cube("svart");
        yourCubic = yourCube.getCubic(20, 10, 50);
        yourShape = yourCube.determineShape();

        System.out.println("Min " + myShape + " är " + myCube.colour + " och " + myCubic + " " + unit + "³ stor.");
        System.out.println("Din " + yourShape + " är " + yourCube.colour + " och " + yourCubic + " " + unit + "³ stor.");
    }   
}

class Cube {
    public String colour = "grön";
    private int width = 1, length = 1, height = 1;

    Cube(String colour) {
        this.colour = colour;
    }

    public int getCubic(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;

        return width * length * height;
    }

    public String determineShape() {
        if(width == length && width == height) {
            return "kub";
        } else {
            return "rätblock";
        }
    }
} 

