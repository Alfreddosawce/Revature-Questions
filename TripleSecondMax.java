import java.util.*;
import java.io.*;

public class TripleSecondMax {

    public static void main(String[]args) throws Exception
    {
        File inputFile = new File("input.txt");
        Scanner scanObj = new Scanner(inputFile);
        ArrayList<String> inputDataList = new ArrayList<String>();
        while(scanObj.hasNextLine()){
            String dataInput = scanObj.nextLine();
            inputDataList.add(dataInput);
        }

        int numberOfTriplets = Integer.parseInt(inputDataList.get(0));
        for(int i = 1; i < numberOfTriplets+1; i++){
            String inputData = inputDataList.get(i);
            String[] tripletArr = inputData.split(" ");
            int first = Integer.parseInt(tripletArr[0]);
            int second = Integer.parseInt(tripletArr[1]);
            int third = Integer.parseInt(tripletArr[2]);

            int[] tempArr = {first, second, third};
            Arrays.sort(tempArr);
            System.out.println("Second largest in triplet: " + tempArr[1]);
        }

    }


}
