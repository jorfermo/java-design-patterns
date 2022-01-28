package creational.factory;

import java.io.*;

public class GenerateBill {
public static void main(String[] args) throws IOException {
    PlanFactory planFactory = new PlanFactory();
    Plan p = null;
    System.out.print("Enter the name of plan for which the bill will be generated: ");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String planName=br.readLine();
    System.out.print("Enter the number of units for bill will be calculated: ");
    int units=Integer.parseInt(br.readLine());

    try {
        p = planFactory.getPlan(Plan.Type.valueOf(planName));
    } catch (Exception e){
        System.out.print("Invalid plan " + planName);
        System.exit(1);
    }


    System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
    p.getRate();
    p.calculateBill(units);

}
}
