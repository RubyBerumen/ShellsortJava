import java.util.Arrays;

class Shellsort{
	
	public void ordenar(int[] numeros) {
		int salto,j,k,aux;
		salto = numeros.length/2;
		
		while(salto>0) {
			for(int i = salto; i<numeros.length; i++) {
				j=i-salto;
				while(j>=0) {
					k=j+salto;
					if(numeros[j] <= numeros[k]) {
						j-=1;
					}else {
						aux = numeros[j];
						numeros[j] = numeros[k];
						numeros[k] = aux;
						j-=salto;
					}
				}
			}
			salto=salto/2;
		}
		
	}//public void ordenar
	
	
	public void imprimir(int[] numeros) {
		System.out.println(Arrays.toString(numeros));
	}
	
}//class shellsort

public class PruebaShellSort {

	public static void main(String[] args) {
		
		
		Shellsort ss = new Shellsort();
		int numeros[] = {12, 34, 54, 2, 3}; 
		System.out.println("Arreglo desordenado: " + Arrays.toString(numeros));
        ss.ordenar(numeros);
		System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
	}

}
