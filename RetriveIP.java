import java.net.InetAddress; 
importjava.net.UnknownHostException; 
import java.util.Scanner; 

public class RetriveIP { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter Host Name: ");
 String host = sc.nextLine(); 
try { 
InetAddress ip = InetAddress.getByName(host); 
System.out.println("IP Address of Computer is: " + ip.getHostAddress()); 
} 
catch (UnknownHostException e) { 
System.out.println(e); 
} 
} 
} 
