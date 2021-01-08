package Ordenar;

import java.util.Comparator;

public class MergeSortGenerico <T extends Comparator <? super T>> {
	
	public void mergeSort (T [] array, int inicio, int fin){
		if (inicio<fin){
			int mitadArray=(inicio+fin)/2;
			mergeSort (array, inicio, mitadArray);
			mergeSort(array, mitadArray+1, fin);
			merge(array, inicio, mitadArray, fin);
		}
	}
	
	public void merge (T [] array, int inicio, int mitadArray, int fin){
		T [] arrayIzqu=(T[]) new Comparator [mitadArray-inicio+1];
		T [] arrayDcha=(T[]) new Comparator [fin-mitadArray];
		
		for (int i=0; i<arrayIzqu.length; i++){
			arrayIzqu[i]=array[inicio+1];
		}
		for (int i=0; i<arrayDcha.length; i++){
			arrayDcha[i]=array [mitadArray+1+i];
		}
		
		int valorIzq=0;
		int valorDcha=0;
		int valorActual = inicio;
		
		while (valorIzq < arrayIzqu.length && valorDcha < arrayDcha.length){
			if (compare (arrayIzqu [valorIzq], arrayDcha [valorDcha]) <=0){
				array[valorActual]=arrayIzqu [valorIzq];
				valorIzq++;
			}else{
				array [valorActual] = arrayDcha [valorDcha];
				valorDcha++;
			}
			valorActual++;
	}
	
	while (valorIzq < arrayIzqu.length){
		array[valorActual++]=arrayIzqu[valorIzq++];
		
	}
	
	while (valorDcha < arrayDcha.length){
		array[valorActual++]=arrayDcha[valorDcha++];
	}
	}
private int compare (T t, T t2){
	return 0;

}
}
