package lib.controller;

public class MergeSortController
{
	public MergeSortController()
	{
		super();
	}
	
	public int[] mergeSort(int[] vet)
	{
		return mergeSort(vet, 0, vet.length - 1);
	}
	
	public int[] mergeSort(int[] vet, int inicio, int fim)
	{
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vet, inicio, meio);
			mergeSort(vet, meio + 1, fim);
			merge(vet, inicio, meio, fim);
		}
		return vet;
	}
	
	private void merge(int[] vet, int inicio, int meio, int fim)
	{
		int[] aux = new int[vet.length];
		int e = inicio;
		int d = meio + 1;
		
		for (int i = inicio; i <= fim; i++)
			aux[i] = vet[i];
		for (int i = inicio; i <= fim; i++) {
			if (e > meio) vet[i] = aux[d++];
			else if (d > fim) vet[i] = aux[e++];
			else if (aux[d] < aux[e]) vet[i] = aux[d++];
			else vet[i] = aux[e++];
		}
	}
}
