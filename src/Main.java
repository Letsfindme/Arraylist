import model.Etudiant;
import sun.reflect.generics.tree.LongSignature;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List l=new LinkedList();
        l.add(12);
        l.add("tuto !!");
        l.add(12.12f);


        for (int i= 0; i<l.size();i++){
            System.out.println("element à l'index "+i+"="+l.get(i));

        }


        System.out.println("\n \tParcours avec un itérateur");
        System.out.println("-------------------");
        ListIterator li= l.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }


        Etudiant Jean = new Etudiant();
        Jean.setNom("Jean");
        Jean.setLongeur(1.70);
        Etudiant Dark = new Etudiant();
        Dark.setLongeur(1.80);
        Dark.setNom("Dark");

        List etudiantList = new LinkedList();
        etudiantList.add(Jean);
        etudiantList.add(Dark);

        ListIterator listIterator = etudiantList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }



        System.out.println("-------------------");
        ListIterator listIterator2 = etudiantList.listIterator(etudiantList.size());
        while (listIterator2.hasPrevious()){
            System.out.println(listIterator2.previous().toString());
        }


        // foods which helps in weight loss
        System.out.println("-------------------");
        List<String> listOfWeightLossFood = new LinkedList<>(
                Arrays.asList("beans", "oats", "avocados", "broccoli"));

        System.out.println("before sorting: " + listOfWeightLossFood);
        listOfWeightLossFood.sort(Comparator.reverseOrder());
        System.out.println("after sorting: " + listOfWeightLossFood);


        System.out.println("-------------------");
        String fadi = "Fadi";
        String matilde= "Matilde";
        String manon= "Manon";

        List nameList = new LinkedList();
        nameList.add("my name is "+fadi+ " that's "+ fadi.length() +" lettres");
        nameList.add("my name is "+matilde+ " that's "+ matilde.length() +" lettres");
        nameList.add("my name is "+manon+ " that's "+ manon.length() +" lettres");

        for(int i=0; i< nameList.size(); i++){
            System.out.println(nameList.get(i));
        }


    }





}
