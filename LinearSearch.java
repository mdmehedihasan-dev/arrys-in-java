public class LinearSearch {
    public static int SearchNumber(int numbers[] , int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int numbers[] = {1,2,3,6,5,4,7,8,9};
        int key =  7;
        int index = SearchNumber(numbers , key);

        if(index != -1){
            System.out.println("the target key is : " + index);
        }else{
             System.out.println("the target key not found :");
        }

    }
}