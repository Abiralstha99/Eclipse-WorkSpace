public class Floor {
    public static void main(String[] args) {
       //Floor : greatest integer smaller or equal to target
        int[] arr = { 0, 2, 3, 4, 15, 16, 18 };
        int target = 5;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    public static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[0]) {
            return -1;  // Or some other indicator for "no floor value"
        }
        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target > arr[mid]) {
                start = mid + 1;
            }

            else if (target < arr[mid]) {
                end = mid - 1;
            }

            else {
                return arr[mid];
            }

        }
        return arr[end];

    }
}