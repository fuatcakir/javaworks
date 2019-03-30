package lamda.collection.works;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -3729420078134672209L;
	String name;
	Integer age;
	String location;

 

	public Person(String name, Integer age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

    public void printAllInfo() {
    	System.out.println("Ad: "+this.name +", Yas: "+this.age+", Lokasyon:"+this.location);
    }

}
