#include<stdio.h>
#include<stdlib.h>
int main()
{   
    int count=2;
    int i=1;
    int arr[100];
    int h=0;
    int arr2[100];
    while(i<=285)
    {
        printf("%d ",i);
        
        i+=count;
        arr[h]=i;
        count++;
    }
    
    int len=sizeof(arr)/sizeof(arr[0]);
    int n;
    int fs;
    for(int i=0;i<185;i++)
    {
        int fo=i*(3*(i)-1)/2;
        
        for(int j=0;j<len;j++)
        {
            n=arr[j];
        fs=n*n+1/2;
        }
        if(fo==fs)
        {
            printf("%d ",fo);
        }
    }
    //while()
    return 0;
}