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
		int vetor4 [] = {1};
		int vetor5 [] = {4, 1, 5, 6, 2};
		int resultado = solution(vetor);
		int resultado2= solution(vetor2);
		int resultado3 = solution(vetor3);
		int resultado4 = solution(vetor4);
		int resultado5 = solution(vetor5);
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println(resultado5);
	}
	
	public static int solution(int[] A) {
		if(A == null || A.length <= 0) {
			return 1;
		}
        List<Integer> lista = Arrays.stream(A).boxed().collect(Collectors.toList());
        lista = lista.stream().filter(num -> num > 0).distinct().sorted((num1, num2) -> num1.compareTo(num2)).collect(Collectors.toList());
        if(lista == null || lista.size() <= 0 || lista.get(0) != 1) {
			return 1;
		}
        if(lista.size() == 1 && lista.get(0) == 1) {
        	return 2;
        }
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
