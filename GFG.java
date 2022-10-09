
import java.util.*;

class GFG
{

    public  static void main(String arg[])
    {

HashMap< String , Integer> HH=new HashMap<>();

//INSERT METHOD
HH.put("india",100);
HH.put("US",10);
HH.put("nepal",5);
HH.put("indoneshia",1);


//GET METHOD 
System.out.println(HH.get("china"));


//SIZE OF HASHMAP
System.out.println("Size of HashMap is:"+HH.size());



//PRINT HASHMAP
System.out.println(HH);


//containsKey

if(HH.containsKey("indi"))
{
    System.out.println("HashMaP contains this key");
}else{
    System.out.println("kEY DOSENOT EXISTS");
}


//Remove method
int population=HH.remove("india");
System.out.println(population);

System.out.println(HH);


Set<String>  keys=HH.keySet();
System.out.println(keys);


// System.out.println(HH.isEmpty());


//foreach loop
for(String k:keys)
{
    System.out.println("keys="+k+ "," +"value"+HH.get(k));
}
    }
}