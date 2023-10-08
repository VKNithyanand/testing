import java.util.Scanner;
class foreach{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int nithya[]=new int[6];
        for(int i=0;i<6;i++){
            nithya[i]=sc.nextInt();
        }
        for(int n:nithya){
            System.out.println(n);
        }
    }

}
