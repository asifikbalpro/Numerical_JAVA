import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class hyperbolic_cosecant { // this is the function
    double phi = (Math.sqrt(5) + 1) / 2;    // this is phi value

    private double cosech(double x){ // this is the function that done the all the equetions.
        int n = 20;
        double sum = 0;
        for (int k = 1; k <= n; k++){ // this is loop
            sum += Math.pow(-1, k) / (x * x + k * k * phi * phi); // this is the equation
        }
        return 2 * x * sum + 1 / x; // return value
    }

    public void cosech_data() throws IOException { // this is function.
        BufferedWriter writer; //for file writing
        writer = new BufferedWriter(new FileWriter("Files/cosech_data.txt")); // file name.
        writer.write("#cosech fresnel integral");
        double dx = 0.01;
        for (double x = 0.1; x <= 1.0; x += dx){ // this is loop
            writer.write(x + "\t" + cosech(x) + "\n"); // writing files
        }
        writer.close(); // closeing file
    }
}
