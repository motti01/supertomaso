public class arrays {
    public static void main(String[] args) {

        //declaration first then initialization
        int [] victims;
        victims=new int[4];

        //declaration and initialization at the same time
        int[]foods=new int[34];

        //declaration and initialization with values
        String[] artists = {"sosa","tommy lee","kartel"};
        System.out.println("this array is not modified " + " = " + artists[0].toUpperCase());

        //changing the value in the second index in the arrray
        artists[0]="munga";
        //print after the change
        System.out.println(" modified array " + " = "+artists[0].toUpperCase());

        int[] numbers ={1,2,3,4,5,};

        for(int i =0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("\nworking with the decrement");
        for (int i = 4; i < numbers.length; i--){

        System.out.println(numbers[i]);
        }
    }
    
}
