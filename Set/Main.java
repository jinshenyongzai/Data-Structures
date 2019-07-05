import java.util.ArrayList;

public class Main {

    private static double testSet(Set<String> set, String filename) {

        long startTime = System.nanoTime();

        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words)) {
            System.out.println("Total words: " + words.size());

            for (String word : words)
                set.add(word);
            System.out.println("Total different words: " + set.getSize());
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;

    }

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

//        System.out.println("Pride and Prejudice");
//
//        ArrayList<String> word1 = new ArrayList<>();
//        if (FileOperation.readFile("pride-and-prejudice.txt", word1)) {
//            System.out.println("Total words: " + word1.size());
//
//            LinkedListSet<String> set1 = new LinkedListSet<>();
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
//            LinkedListSet<String> set2 = new LinkedListSet<>();
//            for (String word : word2)
//                set2.add(word);
//            System.out.println("Total different words: " + set2.getSize());
//        }

        String filename = "pride-and-prejudice.txt";
//        String filename = "a-tale-of-two-cities.txt";

        BSTSet<String> bstSet = new BSTSet<String>();
        double time1 = testSet(bstSet, filename);
        System.out.println("BST Set: " + time1 + " s");

        System.out.println();

        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        double time2 = testSet(linkedListSet, filename);
        System.out.println("Linked List Set: " + time2 + " s");

        System.out.println();

        AVLSet<String> avlSet = new AVLSet<>();
        double time3 = testSet(avlSet, filename);
        System.out.println("AVL Set: " + time3 + " s");
    }
}
