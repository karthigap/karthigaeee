import java.io.*;
import java.util.*;
public class Workday
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
String str=s.next();
if(str.equalsIgnoreCase("sunday"))
{
System.out.println(false);
}
else
{
System.out.print(true);
}
}
}