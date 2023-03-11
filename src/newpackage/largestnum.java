package newpackage;

public class largestnum {
    public static void main(String[] args) {
        int[] num={12,20,30,-140,-70};
        int largest=num [0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("the largest numberis"+ largest);
    }
}
