

class num
{
static int sum(int n)
{
int s=0;
while(n>0||s>9)
{
if(n==0)
{
n=s;
s=0;
}
s=s+n%10;
n=n/10;
}
return s;
}
public static void main (String args[])
{
int n=2411;
System.out.println("sum of digits:"+sum(n));
}
}
