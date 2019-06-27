import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Pride and Prejudice");
//
//        ArrayList<String> word1 = new ArrayList<>();
//        if (FileOperation.readFile("pride-and-prejudice.txt", word1)) {
//            System.out.println("Total words: " + word1.size());
//
//            BSTSet<String> set1 = new BSTSet<String>();
//            for (String word : word1)
//                set1.add(word);
//            System.out.println("Total different words: " + set1.getSize());
//        }
//
//        System.out.println("A Tale of Two Cities");
//
//        ArrayList<String> word2 = new ArrayList<>();
//        if (FileOperation.readFile("a-tale-of-two-cities.txt", word2)) {
//            System.out.println("Total words: " + word2.size());
//
//            BSTSet<String> set2 = new BSTSet<String>();
//            for (String word : word2)
//                set2.add(word);
//            System.out.println("Total different words: " + set2.getSize());
//        }

        System.out.println("Pride and Prejudice");

        ArrayList<String> word1 = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", word1)) {
            System.out.println("Total words: " + word1.size());

            LinkedListSet<String> set1 = new LinkedListSet<>();
            for (String word : word1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println("A Tale of Two Cities");

        ArrayList<String> word2 = new ArrayList<>();
        if (FileOperation.readFile("a-tale-of-two-cities.txt", word2)) {
            System.out.println("Total words: " + word2.size());

            LinkedListSet<String> set2 = new LinkedListSet<>();
            for (String word : word2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
    }
}
