import java.util.*;

public class MarkCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many subjects are there??");
        int subjNo = input.nextInt();
        float totalMarkObtained = 0;
        int totalMark = subjNo * 100;
        for (int i = 1; i <= subjNo; i++) {
            System.out.println("Enter mark obtained in Subject " + i + ": ");
            float numberObtained = input.nextFloat();
            if(numberObtained<0 || numberObtained>100){
                System.out.println("Invalid Input.");
                i--;
                continue;
            }
            totalMarkObtained += numberObtained;
        }
        float avrgPercentage = (totalMarkObtained / totalMark) * 100;
        if (avrgPercentage >= 0 && avrgPercentage <= 100) {
            System.out.println("You obtained "+totalMarkObtained+" out of "+totalMark+"\nAverage Percentage is: "+avrgPercentage);
            if (avrgPercentage >= 90) {
                System.out.println("GRADE 'E' !");
            } else if (avrgPercentage>=80) {
                System.out.println("GRADE 'A' !");
            } else if (avrgPercentage>=70) {
                System.out.println("GRADE 'B' !");
            } else if (avrgPercentage>=60) {
                System.out.println("GRADE 'C' !");
            } else if (avrgPercentage>=40 && avrgPercentage<50) {
                System.out.println("GRADE 'D' !");
            }
            else {
                System.out.println("FAIL !");
            }
        }
        else {
            System.out.println("There is something ERROR !!");
        }
    }
}
