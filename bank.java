import java.util.Scanner ;
class Main
{
String nm, addr ;
double bal ;
int accno;
static int num= 1001;
private void uniqueacc()
{
accno=num++ ;
}
Main()
{
uniqueacc();
}
public void input()
{
Scanner sc= new Scanner(System.in) ;
System.out.print("Enter Name: ");
nm= sc.nextLine();
System.out.print("Enter Address: ");
addr= sc.nextLine(); 
System.out.print("Enter Balance: ");
bal = sc.nextDouble();
}
public void disp()
{
System.out.println("Name="+nm+"\nAddress="+addr+ "\nBalance=" + bal+ "\nAccount no= "+
accno);
}
public void deposit(int amt)
{
bal+= amt;
}
public void withdraw(int dep)
{
if(bal>dep)
bal-= dep ;
else
System.out.println("Insufficient balance") ;}
public static void main( String s[]){
System.out.println( “Name – Himanshu Panwar, Sec- B, Class_Roll_No-44,
University_Roll_No=2016774”); Main m=new Main();
m.input();
Scanner obj=new Scanner(System.in);
System.out.println("Enter Amount to deposit: ");
int amt=obj.nextInt();
m.deposit(amt);
System.out.println("Enter Amount to Withdraw: ");
int dr=obj.nextInt();
m.withdraw(dr);
m.disp();
}
} 