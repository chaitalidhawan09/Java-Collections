package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RotateArray 
{
	public static void rotateArray(List<Integer> nums, int k) 
	{
        k = k % nums.size(); // Handle cases where k is greater than the array size
        Collections.rotate(nums, k);
    }

	public RotateArray() 
	{

	
	}

	public static void main(String[] args) 
	{

		    
		        List<Integer> array = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		        int k = 2;

		        rotateArray(array, k);
		        System.out.println("Rotated Array: " + array);
	}

}
