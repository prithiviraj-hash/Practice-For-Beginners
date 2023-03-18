import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        matrix m=new matrix();
        m.rows();
        m.column();
        m.get();
        m.add();
        m.displayadd();
    }
}
class matrix
{
    Scanner s=new Scanner(System.in);
    int row;
    int column;
    void rows()
    {
        System.out.println("Enter the number of row:");
        this.row=s.nextInt();
    }
    void column()
    {
        System.out.println("Enter the number of columns:");
        this.column=s.nextInt();
    }
        
    int arr[][]=new int[this.row][this.column];
    void get()
    {
        System.out.println("Row:"+this.row);
        System.out.println("Column:"+this.column);
        //int n=this.row*this.column;
        int ele;
        int i;
        int j;
        arr=new int[this.row][this.column];
        for(i=0;i<this.row;i++)
        {
            for(j=0;j<this.column;j++)
            {
                System.out.printf("\nEnter the elements at%d %d:",i,j);
                ele=s.nextInt();
                this.arr[i][j]=ele;
            }
        }
    }
    void add()
    {
        //int n=this.row*this.column;
        for(int i=0;i<this.row;i++)
        {
            for(int j=0;j<this.column;j++)
            {
                this.arr[i][j]+=this.arr[i][j];
            }
        }
    }
    void displayadd()
    {
        System.out.println("Addition");
        int n=this.row*this.column;
        for(int i=0;i<this.row;i++)
        {
            for(int j=0;j<this.column;j++)
            {
                System.out.printf("%d ",this.arr[i][j]);
            }
            System.out.println();
        }
    }
}
