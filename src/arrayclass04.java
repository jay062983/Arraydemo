public class arrayclass04 {

    public static void main(String[]args){
        char [] letters={'A','B','c'};
                letters[0]='z';// updating the element at index 0
        for (int i = 0; i < letters.length ; i++) {
            System.out.println(letters[i]);
        }
    }
}
