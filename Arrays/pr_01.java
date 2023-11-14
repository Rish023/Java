class pr_01
{
    public static void main(String[]args)
    {
        int i,sum=0;
        int n[] = {2,3,4,5,6};
        for(i=0;i<n.length;i++){
            sum = sum+n[i];
        }
        System.out.println("The sum of array elements "+sum);
    }
}