import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Fibo{ // this is the fibonacci class
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
    double phi = (Math.sqrt(5) + 1) / 2;
    double g = 360 / (phi * phi);

    double a = 0.001;
    double b = Math.log(phi) / 90;

    private void fibonnaci(int n, double fib[]){ // this is a another way
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    public void golden_ratio_data() throws IOException { // this function writes all the data in txt file
        BufferedWriter writer;  // this is how get parmition for data write
        writer = new BufferedWriter(new FileWriter("Files/golden_ratio_data.txt")); // name the data file
        writer.write("Golden ratio data \n");
        int n = 30;
        double[] fib = new double[n + 1];
        fibonnaci(n, fib);
        for (int i = 1; i < n; i++){
            writer.write(i + "\t" + fib[i+1] / fib[i] + "\n"); // this is the line where all data start writing
        }
        writer.close(); // this is the line that close the file after it's work is done.
    }

    private void sunflower_coordinate(int i, double x[]){ // this is the same thing nothing's new
        double r = Math.sqrt(i);
        double theta = i * g;
        x[0] = r * Math.cos(theta); // equation
        x[1] = r * Math.sin(theta); // equation
    }

    public void sunflower_coordinate_data() throws IOException {
        BufferedWriter writer;  //importing parmition for writing
        writer = new BufferedWriter(new FileWriter("Files/sunflower_coordinate_data.txt")); // file name
        writer.write("#sunflower shape of Fibonacci sequence \n");
        writer.write("# <x> \\t <y> \n");
        double[] x = new double[2];
        for (int i = 0; i < 1500; i++){
            sunflower_coordinate(i, x);
            writer.write(x[0] + "\t" + x[1] + "\n"); // writing file
        }
        writer.close(); // closeing file
    }

   private void spiral_coordinate(int i, double x[]){ //funtion and equation
        double factor = i * b;
        double theta = i * phi / 180;
        x[0] = a * Math.cos(theta) * Math.exp(factor); // equations
        x[1] = a * Math.sin(theta) * Math.exp(factor); // equations
   }

    public void spiral_coordinates_data() throws IOException {
        BufferedWriter writer;  // importing file writeing parmition
        writer = new BufferedWriter(new FileWriter("Files/spiral_coordinate_data.txt")); // name a file name
        writer.write("spiral_coordinate_data");
        writer.write("# <x> \\t <y>");
        double[] x = new double[2];
        for (int i = 0; i < 3000; i++){ // loop o to 3000
            spiral_coordinate(i, x); // calling the function
            writer.write(x[0] + "\t" + x[1] + "\n"); // writing data into file
        }
        writer.close(); // closeing file
    }

}
// this is the main class.
public class Main {
    public static void main(String[] args) throws IOException { // this is the main function

        //mygold function
//        Fibo Mygold = new Fibo(); making new
//        Mygold.mygold(100);   //caling the mygold funtion on fibo

        // fibonacci numbers

        Fibo myfibo_1 = new Fibo();
        for (int i = 0; i <= 11; i++){ // this for the new value
            System.out.println(myfibo_1.myfibo(i)); //printing new value everytime
        }

        // sunflower_data
        Fibo Sunflower_coordinate_data = new Fibo(); // this is how enter the inside class and make acces the functions.
        Sunflower_coordinate_data.sunflower_coordinate_data(); // this how call the function
        // golden ratio data
        Fibo golden_ratio_data = new Fibo(); // this is how enter the inside class and make acces the functions.
        golden_ratio_data.golden_ratio_data();  // this how call the function
        // spiral_coordinate_data
        Fibo spiral_coordinate_data = new Fibo(); // this is how enter the inside class and make acces the functions.
        spiral_coordinate_data.spiral_coordinates_data();   // this how call the function

    }
}
