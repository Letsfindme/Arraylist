import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayLists {


    //Sorting an ArrayList in ascending order
    public static void collectionSort(){

            // Create a list of strings
            ArrayList<String> al = new ArrayList<String>();
            al.add("Geeks For Geeks");
            al.add("Friends");
            al.add("Dear");
            al.add("Is");
            al.add("Superb");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
            Collections.sort(al);

            // Let us print the sorted list
            System.out.println("List after the use of" +" Collection.sort() :\n" + al);

            /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("List after the use of" +" Collection.sort(al, Collections.reverseOrder()) :\n" + al);

    }

    public static void arrayTests(){
        System.out.println("Enter 20 numbers please!");
        Scanner  sc = new Scanner(System.in);
        ArrayList numbersAL= new ArrayList();

        for (int i =0; i<5; i++){
            System.out.println("Enter the number to be stored in the "+i+" index:");
            double numberSC =sc.nextDouble();
            numbersAL.add(numberSC);
        }
        System.out.println(numbersAL);

        //Sort the elements present in list of Collection in ascending order.
        Collections.sort(numbersAL);
        System.out.println(numbersAL);


        ArrayList al = new ArrayList();
        al.add("hello");
        al.add(4);
        al.add(12.20f);
        al.add("hi");

        for (int i = 0; i<al.size();i++){
            System.out.println("Donnée à l'indice "+i+" = "+ al.get(i));
        }

    }


    public static void main(String[] args){

        collectionSort();

        //arrayTests();



    }
}
