import java.rmi.Naming;

public class CalculatorClient{

    public static void main(String args[]){
        try{
            Calculator stub=(Calculator)Naming.lookup("rmi://localhost:1099/CalculatorService");
            System.out.println("Adding 5 and 6:\n");
            System.out.println(stub.add(5,6));
        }catch(Exception e){}
    }
}
