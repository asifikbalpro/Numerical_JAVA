

class Fibo{
    private double mygold(int n){    // this is the function
       double x = 1;
       while (n >= 1){
           x = 1 + 1 / x; // the equation
           n--; // every loop n is going to - 1 number
//           System.out.println("x is : " + x);
       }
        return x; // every time x will be returned
    }

    public double myfibo(int n){
        double golden = mygold(100); // call the function once and save the value
        double a = Math.pow(golden, n+1) - Math.pow((1 - golden), n+1); // the equation
        double b = 2 * golden - 1;  //the equations
        return a/b; // return value
    }

}

public class Main {
    public static void main(String[] args){ // this is the main function

        //mygold function
//        Fibo Mygold = new Fibo(); making new
//        Mygold.mygold(100);   //caling the mygold funtion on fibo

        // fibonacci numbers

        Fibo myfibo_1 = new Fibo();
        for (int i = 0; i <= 11; i++){ // this for the new value
            System.out.println(myfibo_1.myfibo(i)); //printing new value everytime
        }

    }
}
