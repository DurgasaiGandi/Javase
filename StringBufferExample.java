import java.lang.String;
class StringBufferExample
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("Hello Java");
System.out.println(sb.capacity());
System.out.println(sb);
sb.insert(1,"C++");
System.out.println(sb);
}
}