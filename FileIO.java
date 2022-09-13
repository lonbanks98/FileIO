import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        //Declare an array of employee names
        String[] names = {"Abdi", "Chue", "Halima", "Rosa"};
        String[] classNames = {"Bruk, Ann, Brian, Briyonna, Anderson, Skylar, Brian"};

        //Declare a try-catch block to catch an exception that is thrown if the file cannot
        //be created.
        try {
            //Create a new BufferedWriter to write to the file called output.txt.
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("classmates.txt"));

            //Write a header to the file
            writer.write("Employee Names: \n");
            writer2.write("Classmate Names: \n");

            //Loop through the array of names and write each one to the file.
            for (String name : names) {
                writer.write("\n" + name);
            }//end for loop
            for (String classname : classNames) {
                writer2.write("\n" + classname);
            }
            //Close the file
            writer.close();
            writer2.close();
        } catch (IOException e) {
            //This catch block will catch any exceptions.
            //If an exception is caught, print the stack trace.
            e.printStackTrace();
        }//end try-catch

        //Declare a try-catch block to catch an exception that is thrown if the file cannot be read.
        try {
            //Create a new BufferedReader to read in the file.
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("classmates.txt"));

            //Declare a string variable to hold the value of the current line of the file.
            String line;

            //While there is another line in the file, read it and display it to the user
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //Close the file.
            reader.close();

            while((line = reader2.readLine()) != null){
                System.out.println (line);
            }
            reader2.close();

        } catch (IOException e) {
            //This catch block will catch any exceptions.
            //If an exception is caught, print the stack trace.
            e.printStackTrace();
        }//end try-catch
    }// end main
}//end class
