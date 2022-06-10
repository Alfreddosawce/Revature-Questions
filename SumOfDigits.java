import java.io.File;
import java.util.*;

public class SumOfDigits {
    public static void main(String[]args) throws Exception
    {
        File inputFile = new File("SODInput.txt");
        Scanner scanObj = new Scanner(inputFile);
        String dataInput = "";
        while(scanObj.hasNextLine()){
            dataInput = scanObj.nextLine();
        }
        System.out.println("dataInput: " + dataInput);
        dataInput = dataInput.replaceAll("[a-z]", "");
        System.out.println("dataInput replaced: " + dataInput);
        String[] tempArr = dataInput.split("");

        int total = 0;
        for(String arrElement : tempArr){
            total += Integer.parseInt(arrElement);
        }
        System.out.println("Total of data is: " + total);





    }
}
