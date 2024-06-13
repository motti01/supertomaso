

public class linearsearch {
    public static int linearsearch(int[]numbers, int key){
        for (int index = 0; index<numbers.length;index++) {
            if (numbers[index] == key) {
                return index;
            }

        
    }

    return -1;
    
}

public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    int key = 3;

    int result = linearsearch(numbers,key);
    if (result != -1) {
        System.out.println("element found at index: " + result);
        }else {
            System.out.println("element not found");
        }
    }
    
}