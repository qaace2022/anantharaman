package qaace22training;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[]{2001,1998,2022,1997,2021};

        int smallest = nums[0];

        int largest = nums[0];

        for (int i = 0; i < nums.length; i++) {

         if (nums[i] > largest)

          largest = nums[i];

         else if (nums[i] < smallest)

          smallest = nums[i];

        }

        System.out.println("Largest Number is : " + largest);

        System.out.println("Smallest Number is : " + smallest);

	}

}
