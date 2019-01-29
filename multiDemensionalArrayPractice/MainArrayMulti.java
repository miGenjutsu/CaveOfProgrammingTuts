public class MainArrayMulti {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 2, 3, 4},
                {0, 2, 4, 6, 8},
        };
        System.out.println("\n2xs In Array Format:");
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                System.out.print(grid[row][col]+ "\t");
            }
            System.out.println();
        }

//      System.out.println(grid[1][2]); //this line singles out specific spot in the array.

        System.out.println("Block of code below tests String Multi-Array:");

        String[][] words = new String[2][3];

        words[0][1] = "Hello World";

        System.out.println(words[0][1]);


    }
}
