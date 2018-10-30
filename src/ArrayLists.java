import java.util.*;


public class ArrayLists {


    //Sorting an ArrayList in ascending order
    public static void collectionSort() {

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
        System.out.println("List after the use of" + " Collection.sort() :\n" + al);

            /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("List after the use of" + " Collection.sort(al, Collections.reverseOrder()) :\n" + al);

    }


    public static void arrayTests() {
        System.out.println("Enter 20 numbers please!");
        Scanner sc = new Scanner(System.in);
        ArrayList numbersAL = new ArrayList();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number to be stored in the " + i + " index:");
            double numberSC = sc.nextDouble();
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

        for (int i = 0; i < al.size(); i++) {
            System.out.println("Donnée à l'indice " + i + " = " + al.get(i));
        }

    }

    //
    public static void listToArray() {

        List<String> list = Arrays.asList("value");

        //list.add("foobar");
        // will throw an exception since the list is backed by the array
        // (the size of the list is not modifiable)

        list.set(0, "foobar");
        // will works if the args array has at least one element,
        // the list is mutable

        /*
        This is a short hand only available when constructing and assigning an array.

            String[] array = {"a", "b", "c"};
            List<String> list = Arrays.asList(array);

            You can do this though:
            List<String> list = Arrays.asList("a","b","c");
            As asList can take "vararg" arguments.
         */



        List<String> aNewList = new ArrayList<>();
        String[] array = list.toArray(new String[0]);



        List<Integer> list2 = new ArrayList<>();

        list2.add(0);

        list2.add(1);

        list2.add(2);

        list2.add(4);

        // convert to an array of Objects

        Object[] elements = list2.toArray();
        // convert to a typed array (it is required to instantiate an array
        // since the toArray method cannot instantiate a "generically" typed array

        Integer[] typedElements = list2.toArray(new Integer[elements.length]);


        System.out.println("elements= " + elements + "," + Arrays.toString(elements));
        System.out.println("typedElements= " + typedElements + "," + Arrays.toString(elements));
    }


    //rechercher un élément dans une arraylist.
    public static void recherche(){
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        al.add("Rouge");
        al.add("Noir");
        al.add("Vert");
        al.add("Jaune");
        al.add("Marron");
        al.add("Mauve");
        al.add("Turquoise");

        System.out.println("Tapez la couleur que vous voulez rechercher.");
        String myColor = sc.next();

        System.out.println("Nous recherchons la couleur : " + myColor);
            for(String color : al) {
                if(color.equals(myColor)) {
                    System.out.println("Nous avons trouvé la couleur demandée : " + color);
                } else {
                    System.out.println("Parcours de l'ArrayList ...");
                }
            }

    }



    static void forEachEnhanced(){
        ArrayList al = new ArrayList();
        al.add("Rouge");
        al.add("Noir");
        al.add("Vert");
        al.add("Jaune");
        al.add("Marron");
        al.add("Mauve");
        al.add("Turquoise");

        for (Object element : al) {
            System.out.println("Element: " + element);
        }
    }


    static  void copyList(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Rouge");
        list1.add("Noir");
        list1.add("Vert");
        list1.add("Jaune");
        list1.add("Marron");
        list1.add("Mauve");
        list1.add("Turquoise");
        System.out.println("Contenu de la première liste.");
        for(String color1 : list1) {
            System.out.println(color1);
        }

        System.out.println("************************************");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Voiture");
        list2.add("Camion");
        list2.add("Banane");
        list2.add("Pwar");
        list2.add("oWo");
        list2.add("UmU");
        list2.add("uWu");
        System.out.println("Contenu de la deuxième liste.");
        for(String color2: list2) {
            System.out.println(color2);
        }

        System.out.println("*********************************");
        list2.addAll(list1);

        System.out.println("Contenue de la première liste copié dans la deuxième liste.");
        for(String value : list2) {
            System.out.println(value);
        }

        System.out.println("*********************************\n");
        //mélanger les éléments dans une arraylist.
        Collections.shuffle(list1);
        System.out.println("List1 mélangé:\n");
        for(String element: list1){
            System.out.println(element);
        }

    }
    public static void main(String[] args) {

        //collectionSort();

        //arrayTests();

        //listToArray();

        //recherche();

        //forEachEnhanced();
        copyList();

    }
}
