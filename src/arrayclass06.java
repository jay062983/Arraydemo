public class arrayclass06 {
    public static void main(String[]args){
        /*create an empty array then store 45 44 33 20 and 10
        in it then use loop to add all the elements which are present in even indexes
        and print it after adding them.
         */

        int sum=0;
        int[]num1=new int[5];// an empty array of size 5 will be created
        num1[0]=45;// 45+0
        num1[1]=44;
        num1[2]=33;//45+33=78
        num1[3]=20;
        num1[4]=10;//78+10=88

        for (int i = 0; i <num1.length ; i++) {
            if(i%2==0)
            sum= sum+num1[i];


    }
        System.out.println(sum);

}}
