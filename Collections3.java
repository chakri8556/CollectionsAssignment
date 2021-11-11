class TreesetDemo{
public static void main(String args[]){
Treeset ts = new Treeset();
ts.add("ID","123");
ts.add("Name","chakri");
ts.add("Dep","Bioinformatics");
ts.add("salary","20k");
Iterator it = ts.iterator();
while(it.hasNext());
System.out.println(it.next());
 }
}
