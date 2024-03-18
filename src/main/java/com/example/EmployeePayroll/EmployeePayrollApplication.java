package com.example.EmployeePayroll;

import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@SpringBootApplication
public class EmployeePayrollApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollApplication.class, args);
		/*Set<String> setString = new HashSet<>();
		setString.add("Manohar");
		setString.add("Asish");
		setString.add("Yashwanth");
		setString.add("Sankar");
		setString.add("Manohar");
		setString.stream().forEach(
				str -> {
					System.out.println(str);
				}
		);*/

//		abc a = new abc(1,2);
//		abc b = new abc(2,3);
//		abc c = new abc(1,2);
//		Set<abc> abcSet = new HashSet<>();
//		abcSet.add(a);
//		abcSet.add(b);
//		abcSet.add(c);
//		abcSet.stream().forEach(
//				aa -> System.out.println(aa)
//		);
	}
}

/*
@ToString
class abc{
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		abc abc = (abc) o;
		return i == abc.i && j == abc.j;
	}

	@Override
	public int hashCode() {
		return Objects.hash(i, j);
	}

	abc(int k, int l){
		i=k;
		j=l;
	}
	int i;
	int j;
}*/
