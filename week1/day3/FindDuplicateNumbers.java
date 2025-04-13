package week1.day3;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		int arr[]= {2,5,7,7,5,9,2,3};
		for(int i=0;i<arr.length;i++) {
			boolean value=false;
			for(int k=0;k<i;k++) {
                if(arr[i] == arr[k]) {
                    value = true;
                    break;
                }
            }
			if(value)
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
