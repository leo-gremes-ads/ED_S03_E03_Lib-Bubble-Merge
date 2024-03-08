package lib.controller;

public class BubbleSortController
{
	public BubbleSortController()
	{
		super();
	}
	
	public int[] bubbleSort(int[] vet)
	{
		int len = vet.length;
		
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		return vet;
	}
}