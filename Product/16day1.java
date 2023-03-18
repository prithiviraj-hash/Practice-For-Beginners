import java.util.Scanner;
class rectangle
{
    int width;
    int height;
    void display()
    {
        System.out.printf("\nThe Width is%d the height is%d",this.width,this.height);
    }
}
class rectanglearea extends rectangle
{
    Scanner s=new Scanner(System.in);
    void read_input()
    {   
        System.out.println("Enter the Width:");
        this.width=s.nextInt();
        System.out.println("Enter the Height:");
        this.height=s.nextInt();
    }
    void display(int width,int height)
    {
        System.out.println("ANS:"+(width*height));
    }
}
class main
{
    public static void main(String[] args)
    {
        rectangle r=new rectangle();
        rectanglearea ra=new rectanglearea();
        ra.read_input();
        ra.display();
        ra.display(ra.width,ra.height);
    }
}