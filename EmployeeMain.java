package fasterxml;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class EmployeeMain {
	public static void main(String args[])throws Exception{
		XmlMapper mapper=new XmlMapper();
		Skill skill1=new Skill();
		skill1.skillName="java";
		Skill skill2=new Skill();
		skill2.skillName="python";
		Skill skill3=new Skill();
		skill3.skillName=".net";
		
		ArrayList<Skill> list = new ArrayList<Skill>();
		list.add(skill1);list.add(skill2);list.add(skill3);
		
		Employee e = new Employee();
		e.eId="570";
		e.eName="hobi";
		e.setSkills(list);
		
		mapper.writeValue(new File("D:\\employee1.xml"),e);
		System.out.println("marshalled");
		
		System.out.println("******marshalling******");
		Employee emp=mapper.readValue(new File("D:\\Employee1.xml"),Employee.class);
		System.out.println(emp.geteName());
		
		
		
		
		
		
		

	}

}
