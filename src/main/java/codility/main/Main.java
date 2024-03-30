package codility.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor [] = {1,2,3};
		int vetor2 [] = {1,3,4,5};
		int vetor3 [] = {1,2,3,8,6,7,5};
		int resultado = solution(vetor);
		int resultado2= solution(vetor2);
		int resultado3 = solution(vetor3);
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
	}
	
	public static int solution(int[] A) {
		// Implement your solution here
        if(A == null || A.length <= 0) {
			return 1;
		}
		List<Integer> lista = Arrays.stream(A).boxed().collect(Collectors.toList());
		lista = lista.stream().filter(num -> num > 0).distinct().sorted((num1, num2) -> num1.compareTo(num2)).collect(Collectors.toList());
		int result = 1;
		for(int i = 0; i < lista.size() - 1; i++) {
			if(lista.get(i+1) - 1 != lista.get(i)) {
				result = lista.get(i) + 1;
				break;
			} else {
				result = lista.get(i+1) + 1;
			}
		}
        // Implement your solution here
		return result;
    }

}
