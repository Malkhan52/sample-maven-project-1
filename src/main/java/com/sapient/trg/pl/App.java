package com.sapient.trg.pl;

import java.time.LocalDate;

import com.sapient.trg.service.Person;

public class App 
{
    public static void main( String[] args )
    {
    	//  Creating instance/object of class
    	// ClassName objectName = new ClassName();
    	
    	Person person1 = new Person();
    	person1.setPersonId(1);
    	person1.setFirstName("Ravi");
    	person1.setLastName("Kumar");
    	System.out.println(person1.getPersonId()+","+person1.getFirstName()+" "+person1.getLastName());
    	System.out.println(person1.getMobile());
    	Person person2 = new Person(1, "Hari", "Singh",LocalDate.of(1998, 1,15),9090890980L);
    	
    }
}
