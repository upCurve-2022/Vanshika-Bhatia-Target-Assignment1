import java.util.Scanner;

public class Q2_VolOfCylinder {
    static float volume(float radius, float height){
        float vol = (float)Math.PI*radius*radius*height;
        return vol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        float radius = sc.nextFloat();
        System.out.println();
        System.out.print("Enter height of cylinder: ");
        float height = sc.nextFloat();
        System.out.println("Volume of cylinder: " + volume(radius,height));
    }
}
