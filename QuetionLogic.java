package sanika.logic;

public class QuetionLogic {
	public int[] sum(int arr[]) {
		int add = 0;
		for (int i = 0; i < arr.length; i++) {
			add = add + arr[i];
		}
		int answer[] = { add };
		// System.out.println("ans sum "+answer[0]);
		return answer;
	}

	// Given an sorted*** array A of size N. Find ***number of elements****=i which
	// are less than or equal to given element X.
	public long countOfElements(long arr[], long x) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				break;
			}
		}
		return i;
	}

	// find the alternative elements of array and print

	public int[] printAlternate(int arr[], int n) {
		int newARR[] = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				newARR[k] = arr[i];
				k++;
			}

		}
		for (int i = 0; i < newARR.length; i++) {
			// System.out.println("ans alternate"+newARR[i]);
		}
		return newARR;
	}

	// find 2nd largest element
	public int[] print2largest(int arr[], int n) {
		int largest = 0;
		int nextLargest = 0; // 2 7 3
		for (int i = 0; i < n; i++) { // i=0 1 2
			if (largest < arr[i]) { // 0< 2 true 2<7true 7<3 flase
				nextLargest = largest; // nextL=0 =2
				largest = arr[i]; // larggest=2 =7
			}

			if (nextLargest < arr[i] && arr[i] != largest)// 0<2 && 2!=2 false ;;flse ;; arrr=3 nd lar=7 true
			{
				nextLargest = arr[i];
			}
		}
//System.out.println("ans 2nd l "+nextLargest);
		int ans[] = { nextLargest };
		ans[0] = nextLargest;
		return ans;

	}

	// swap kth element from beggining with kth element from last
	public int[] swapKth(int arr[], int n, int k) {
		int beggining = arr[k - 1];
		int end = arr[n - k];
		arr[k - 1] = end;
		arr[n - k] = beggining;
		return arr;
	}

	// Given an unsorted array Arr[] of N integers and a Key which is present in
	// this array. You need to write a program to find the start index( index where
	// the element is first found from left in the array ) and end index( index
	// where the element is first found from right in the array ).
	// Input:
	// N = 6 arr[] = { 1, 2, 3, 4, 5, 5 } Key = 5 Output: 4 5
	public int[] findIndex(int a[], int key) {
		int k = 0;
		int flag2 = 0;
		int leftRight[] = new int[2];
		for (int i = 0; i < a.length; i++) {

			if (a[i] == key) {
				leftRight[0] = i;
				k = i;
				flag2 = 1;
				break;
			}

		}
		int flag = 0;
		for (int i = k + 1; i < a.length; i++) {
			if (key == a[i]) {
				leftRight[1] = i;
				flag = 1;

			}

		}
		if (flag == 0) {
			leftRight[1] = leftRight[0];
		}
		if (flag2 == 0) {
			leftRight[1] = leftRight[0] = -1;
		}
		// System.out.println("ans index"+leftRight[0]);
		return leftRight;
	}

	// Given an array of N distinct elements, the task is to find all elements in
	// array except two greatest elements in sorted order.
	public int[] findElements(int a[]) {
		int ans[] = new int[a.length - 2];
		for (int i = 0; i < a.length - 1; i++) {
			for (int g = 0; g < a.length - 1; g++) {
				if (a[g] > a[g + 1]) {
					int temp = a[g + 1];
					a[g + 1] = a[g];
					a[g] = temp;
				}
			}
		}

		for (int j = 0; j < (a.length - 2); j++) {
			ans[j] = a[j];
			// System.out.println(ans[j]);
		}
		return ans;
	}

	//

	// binary search
	public int[] binarysearch(int arr[], int k) {
		// int position; find 9 5 7 8 9 10 2 low=0 high=5 mid=2 as arr[2]=8<9
		// low=mid+1=3
		// 0 1 2 3 4 5 low=3 high=5 mid=4 as arr[4]=10>9 high=mid-1=3
		// low=3 high=3 as 3-3=0 enter in if else arr[low]=9 return 33333333333
		int ans[] = { 4 };
		int low = 0;
		int high = arr.length - 1;
		while ((high - low) > 1) {
			int mid = (high + low) / 2;
			if (arr[mid] < k) {
				low = mid + 1;
			} else if (arr[mid] > k) {
				high = mid - 1;
			} else {
				ans[0] = mid;
				return ans;
			}
		}
		if (arr[low] == k) {
			ans[0] = low;
			return ans;
		}
		if (arr[high] == k) {
			ans[0] = high;
			return ans;
		} else {
			ans[0] = -1;
		
			return ans;
		}

	}

	// largest
	public int[] largest(int arr[], int n) {
		int la = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > la) {
				la = arr[i];
			}
		}
		int ans[] = { la };
		// System.out.println("ans "+ans[0]);
		return ans;

	}

}
