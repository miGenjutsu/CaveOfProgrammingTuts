public class MainArray {
    public static void main(String[] args) {
        //Interger Array
        System.out.println("integer array");
        int values[] = {2, 4, 6, 8};
        for(int value : values){
            System.out.println(value);
        }

        //String Array
        System.out.println("\nstring array");
        String words[] = {"Hello", "World"};
        for (String word : words) {
            System.out.println(word);
            //System.out.print(word); //puts "word" on one line
        }
    }
}
