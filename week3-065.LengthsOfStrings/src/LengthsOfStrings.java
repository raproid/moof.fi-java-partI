
import java.util.ArrayList;

public class LengthsOfStrings {

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        //calculate the length of each word in the list given in args, add it to a new array and return the array 
        for (String word : list) {
            int wordLength = word.length();
            lengthList.add(wordLength);
        }

        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
