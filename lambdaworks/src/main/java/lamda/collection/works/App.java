package lamda.collection.works;

import java.util.Arrays;
import java.util.List;

/**
 * fuat.cakir Lambda Expressions Works in Java Collection
 *
 */
public class App {
	public static void main( String[] args )
    {
     Person p1 = new Person("Fuat",32,"kadikoy");
     Person p2 = new Person("Meryem",62,"golhisar");
     Person p3 = new Person("Hasibe",60,"bahcelievler");
     Person p4 = new Person("Kubra",32,"kadikoy");
     Person p5 = new Person("Emir",2,"kadikoy");
     
     List<Person> personList= Arrays.asList(p1,p2,p3,p4,p5);
     
     System.out.println("Listedeki butun isimler:");
     personList.forEach(p-> System.out.println(p.getName()));
      
     System.out.println("\nYasi 60'ı geçenler:"); 
     personList.stream().filter(p -> p.getAge() > 60).forEach(Person::printAllInfo);
     
      System.out.println("\nKadikoyde oturup yasi 30'dan buyuk olanlar:"); 
     personList.stream().filter(p ->  p.getAge() > 30 && p.getLocation().equals("kadikoy")).forEach(Person::printAllInfo);
 	
		
    }
}
