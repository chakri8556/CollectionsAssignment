import java.util.Hashset;
class HashsetDemo {
public static void main (String args[]) {
Hashset hs = new Hashset ();
hs.add("chakri");
hs.add("kumar");
hs.add("lakshmi");
hs.add("capgemini");
hs.add("pawan");
hs.add("kalyan");
hs.add("rao");
hs.add("raju");
hs.add("kumar");
hs.add("raju");
Iterator it = hs.iterator();
while(it.hasNext());
System.out.println(it.next());
 }
}