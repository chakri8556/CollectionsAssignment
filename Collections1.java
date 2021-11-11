import java.util.*;
class Treemap {
public static void main (String args[]){
Treemap tm = new Treemap();
tm.put("phno","90890988");
tm.put("name","Abhishek");
tm.put("email","abhi@gmail.com");

Set s = tm.Keyset();
Iterator it = s.iterator();
while(it.hasNext()) { 
Object obj=it.next();
String str= (String)obj;
System.out.println(str+":"+tm.get(str));
   }
 }
}
