package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregado> list = new ArrayList<>();
		
		//leitura de dados
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.println("Employee #"+i+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			//add na lista agora
			list.add(new Empregado(id,nome,salario));
			System.out.println();
		}
		
		//seleciona empregado para dar aumento
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		//função com predicado que compara o valor da id com a dos empregados e retorna o empregado ou null
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			emp.incrementaSalario(porcentagem);
		}
		
		//mostrando os dados
		
		System.out.println();
		System.out.println("List of employees:");
		for(Empregado obj:list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
