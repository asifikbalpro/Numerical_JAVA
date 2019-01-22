import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
