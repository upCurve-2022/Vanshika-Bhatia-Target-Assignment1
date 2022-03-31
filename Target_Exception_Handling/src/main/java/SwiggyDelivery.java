import java.util.Scanner;
class myException extends Exception{
    @Override
    public String getMessage() {
        return "Delivery is not available in your area!";
    }
}
public class SwiggyDelivery {
    static void validZip(int zip){
        if(zip==123||zip==456||zip==789){
            try{
                throw new myException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Delivery is available in your area!");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Zip Code: ");
        int zipCode = sc.nextInt();
        validZip(zipCode);
    }
}
