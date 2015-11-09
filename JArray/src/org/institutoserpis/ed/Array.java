package org.institutoserpis.ed;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v = new int []{5,9,7,12,21};
	
		for (int index=0; index < v.length; index++) {
			System.out.println("elemento con index "+index+ " vale " +v[index]);
		}
		System.out.println("suma del array "+suma(v));
		System.out.println("el menor es " +menor(v));
	}

	private static int suma(int[]v){
		int suma =0;
		for (int item:v)
			suma = suma + item;
		return suma;
	}
	static int menor(int[]v){
	
		int menor, num;
		menor=v[0];
		
		for (int index = 0; index<v.length; index ++){
		num = v[index];
			if (menor>num){
			menor = num;
			}
		}
		return menor;
	}
	public static int indexOf(int[]v,int item){
		return 0;
	}
	public static void sort(int[] v){
//		for (int stepIndex = 0; stepIndex < v.length -1; stepIndex++){
//			int minIndex = stepIndex ;
//			for (int index = stepIndex + 1; index < v.length; index++){
//				if (v[index] < v[minIndex])
//					minIndex = index;
//			int aux = v[stepIndex];
//			v[stepIndex] = v[minIndex];
//			v[minIndex] = aux;
//			}
//		}
		for (int stepIndex = 0; stepIndex < v.length -1; stepIndex++){
			int minIndex = minIndex (v, stepIndex) ;
			swap(v, stepIndex, minIndex);
			}
		}
		private static int minIndex(int[] v, int initialIndex){
			int minIndex = initialIndex ;
			for (int index = initialIndex + 1; index < v.length; index++)
				if (v[index] < v[minIndex])
					minIndex = index;
			return minIndex;
		}
		private static void swap(int[] v, int oneIndex, int otherIndex){
			int aux = v[oneIndex];
			v[oneIndex] = v[otherIndex];
			v[otherIndex] = aux;
		}


	}


