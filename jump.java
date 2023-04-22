import java.util.*;  


public class jump 
{  
public static void main(String args[])  
{  
int num, temp,d1,d2,dif=0;    
boolean flag = true;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
  
num=sc.nextInt();  

  
 temp=num;
while(num != 0)  
{  
      
 d1 = num % 10;  
num = num/10;  
if(num != 0)  
{  
 d2 = num % 10;  
if(Math.abs(d1 - d2) != 1)  
{  
flag = false;  
break;  
}
}
}
if(flag)  
System.out.println(temp + " is a jumping number.");  
else  
System.out.println(temp + " is not a jumping number.");  
}  
}  
