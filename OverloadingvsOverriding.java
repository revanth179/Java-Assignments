class Calculator{
    int add(int a, int b){
        return a + b;

    }
    double add(double a, double b){
        return a + b;
    }
}
class Advancecalculator extends Calculator{
    @Override
    int add(int a, int b){
        System.out.println("Overriden add() method");
        return a + b;
    }
}


public class OverloadingvsOverriding {
    public static void main(String[] args) {
        Advancecalculator obj = new Advancecalculator();

        int result1 = obj.add(10,20);
        double result2 = obj.add(10.5,20.5);
        System.out.println("Integer addition: " + result1);
        System.out.println("Double addition: " + result2); 
        
    }
    
}
