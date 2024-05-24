
public class SortinganArrayBubble {

	public static void main(String[] args) {
		int[] arr= {23,98,11,45,76,86};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
//				if(arr[j]<=arr[j+1]) {//98 86 76 45 23 11
				if(arr[j]>=arr[j+1]) { //11 23 45 76 86 98
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}

}
