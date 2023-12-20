// Program to change the date format from dd/mm/yyyy to mm/dd/yyyy
import java.util.Scanner;
public class DateChange {
    public static void main(String[] args){
        try (Scanner dateScanner = new Scanner(System.in)) {
            Scanner typeScanner = new Scanner(System.in);
            System.out.println("Enter the date and type");
            int date = dateScanner.nextInt();
            String type = typeScanner.nextLine();
            if(type.equals("AD")){
                System.out.println("The date is "+ (date-543));
            } else {
                System.out.println("The date is "+ (date+543));
            }
        }
    }
    
}
