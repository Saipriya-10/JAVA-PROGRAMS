import java.util.Scanner;
class ArrayMan{
public static void main(String[]args)
{
Scanner scan= new Scanner(System.in);
int[] rollno=new int[3];
for(int i=0;i<rollno.length;i++)
{
rollno[i]=scan.nextInt();
}
for(int i=0;i<rollno.length;i++)
{
System.out.println(rollno[i]);
}
}
}