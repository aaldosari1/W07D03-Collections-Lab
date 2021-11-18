import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Arrays;
public class ReadFile {
    public static void main(String[] args) {
        String[] Words = new String[8];
        System.out.print("Orignal: ");
        try {
            File myObj = new File("randomWords.txt");
            Scanner myReader = new Scanner(myObj);
            String data = "";
            String str = "";
            int arrCount = 0;
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);

                //put it in array and sort it 
            }
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) != ' ') {
                    str += data.charAt(i);
                    if (i == data.length() - 1)
                        Words[arrCount] = str;
                } else {
                    Words[arrCount] = str;
                    str = "";
                    arrCount += 1;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Arrays.sort(Words);
        System.out.print("Sorted: ");
        for (int j = 0; j < Words.length; j++)
            System.out.print(Words[j] + " ");
    }
}