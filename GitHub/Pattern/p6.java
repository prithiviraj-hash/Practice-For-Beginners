import java.util.*;
class main{
    public static void main(String args[]){
        System.out.println("ENTER THE VALUE:");
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
int k=n/2;
int l=n/2+1;
int m=n/2+2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==k&&j==l|| i==l&&(j==k || j==m) || i==m&&j==l){
                    System.out.print("0 ");

                }
                else {
                    System.out.print("1 ");
                }

            }
            System.out.println();
        }
    }
}