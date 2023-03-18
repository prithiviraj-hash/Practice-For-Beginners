class main
{
    public static void main(String[] args)
    {
        int[][] arr={{1,2},{3,4}};
        for(int[] x:arr)
        {   
            for(int xy: x)
            {
            System.out.println(xy);
            }
            System.out.println();
        }
        //System.out.println(arr);
    }
}