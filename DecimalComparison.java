public class DecimalComparison {
    public static void main(String Args[]) {
areEqualByThreeDecimalPlaces(3.17588, 3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
       double a = (int)(num1*1000);
       double b = (int)(num2*1000);
       if (a == b){
           System.out.println(a);
           System.out.println(b);
           System.out.println("They are the same!!");
           return true;
       }
        else {
           System.out.println("Not the same!!!");
           return false;
       }
    }
}

