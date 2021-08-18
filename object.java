class object
{
static int c=0;

object()
{
c=c+1;

}
public static void main(String args[])
{
object obj1=new object();
object obj2=new object();
object obj3=new object();

System.out.println("No.of objects created:"+c);
}
}
