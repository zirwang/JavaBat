//Ruby Wang
public class JavaBatIndividual {
	public String[] fizzBuzz(int start, int end) {
		  String[] answer = new String[end-start];
		  for (int i = 0; i < end-start; i++){
		    if((start+i) % 5 == 0 && (start+i) % 3 == 0){
		      answer[i] = "FizzBuzz";
		    }
		    else if ((start+i) % 3 == 0){
		      answer[i] = "Fizz";
		    }
		    else if((start+i) % 5 == 0){
		      answer[i] = "Buzz";
		    }
		    else{
		      answer[i] = Integer.toString(start+i);
		    }
		  }
		  return answer;
		}
	/*
	* fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]	["1", "2", "Fizz", "4", "Buzz"]	OK	
	fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]	["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]	OK	
	fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]	["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]	OK	
	fizzBuzz(1, 16) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]	["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]	OK	
	fizzBuzz(1, 4) → ["1", "2", "Fizz"]	["1", "2", "Fizz"]	OK	
	fizzBuzz(1, 2) → ["1"]	["1"]	OK	
	fizzBuzz(50, 56) → ["Buzz", "Fizz", "52", "53", "Fizz", "Buzz"]	["Buzz", "Fizz", "52", "53", "Fizz", "Buzz"]	OK	
	fizzBuzz(15, 17) → ["FizzBuzz", "16"]	["FizzBuzz", "16"]	OK	
	fizzBuzz(30, 36) → ["FizzBuzz", "31", "32", "Fizz", "34", "Buzz"]	["FizzBuzz", "31", "32", "Fizz", "34", "Buzz"]	OK	
	fizzBuzz(1000, 1006) → ["Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"]	["Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"]	OK	
	fizzBuzz(99, 102) → ["Fizz", "Buzz", "101"]	["Fizz", "Buzz", "101"]	OK	
	fizzBuzz(14, 20) → ["14", "FizzBuzz", "16", "17", "Fizz", "19"]	["14", "FizzBuzz", "16", "17", "Fizz", "19"]	OK	
	other tests
	OK
	*/
	public boolean endOther(String a, String b) {
		  String longer = "";
		  String shorter = "";
		  if(a.length() > b.length()) {
		    longer = a.toLowerCase();
		    shorter = b.toLowerCase();
		  }
		  else{
		    longer = b.toLowerCase();
		    shorter = a.toLowerCase();
		  }
		  String str = longer.substring(longer.length()-shorter.length(), longer.length());
		  if(str.equals(shorter)){
		    return true;
		  }
		  return false;
		}
	/*
	 * endOther("Hiabc", "abc") → true	true	OK	
	endOther("AbC", "HiaBc") → true	true	OK	
	endOther("abc", "abXabc") → true	true	OK	
	endOther("Hiabc", "abcd") → false	false	OK	
	endOther("Hiabc", "bc") → true	true	OK	
	endOther("Hiabcx", "bc") → false	false	OK	
	endOther("abc", "abc") → true	true	OK	
	endOther("xyz", "12xyz") → true	true	OK	
	endOther("yz", "12xz") → false	false	OK	
	endOther("Z", "12xz") → true	true	OK	
	endOther("12", "12") → true	true	OK	
	endOther("abcXYZ", "abcDEF") → false	false	OK	
	endOther("ab", "ab12") → false	false	OK	
	endOther("ab", "12ab") → true	true	OK	
	other tests
	OK
	 */
	public boolean canBalance(int[] nums) {
		  for(int i = 0; i < nums.length; i++){
		    int sumLeft = 0;
		    int sumRight =0;
		    for (int j = i; j < nums.length; j++){
		      sumRight += nums[j];
		    }
		    for (int k = 0; k < i; k++){
		      sumLeft += nums[k];
		    }
		    if(sumLeft == sumRight){
		      return true;
		    }
		  }
		  return false;
		}
	/*
	 *canBalance([1, 1, 1, 2, 1]) → true	true	OK	
	canBalance([2, 1, 1, 2, 1]) → false	false	OK	
	canBalance([10, 10]) → true	true	OK	
	canBalance([10, 0, 1, -1, 10]) → true	true	OK	
	canBalance([1, 1, 1, 1, 4]) → true	true	OK	
	canBalance([2, 1, 1, 1, 4]) → false	false	OK	
	canBalance([2, 3, 4, 1, 2]) → false	false	OK	
	canBalance([1, 2, 3, 1, 0, 2, 3]) → true	true	OK	
	canBalance([1, 2, 3, 1, 0, 1, 3]) → false	false	OK	
	canBalance([1]) → false	false	OK	
	canBalance([1, 1, 1, 2, 1]) → true	true	OK	
	other tests
	OK
	 */
	public int scoresSpecial(int[] a, int[] b) {
		  int sum = largestNum(a) + largestNum(b);
		  return sum;
		}
		public int largestNum(int[] nums){
		  int max = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] > max && nums[i] % 10 == 0){
		      max = nums[i];
		    }
		  }
		  return max;
		}
	/*scoresSpecial([12, 10, 4], [2, 20, 30]) → 40	40	OK	
	scoresSpecial([20, 10, 4], [2, 20, 10]) → 40	40	OK	
	scoresSpecial([12, 11, 4], [2, 20, 31]) → 20	20	OK	
	scoresSpecial([1, 20, 2, 50], [3, 4, 5]) → 50	50	OK	
	scoresSpecial([3, 4, 5], [1, 50, 2, 20]) → 50	50	OK	
	scoresSpecial([10, 4, 20, 30], [20]) → 50	50	OK	
	scoresSpecial([10, 4, 20, 30], [20]) → 50	50	OK	
	scoresSpecial([10, 4, 20, 30], [3, 20, 99]) → 50	50	OK	
	scoresSpecial([10, 4, 20, 30], [30, 20, 99]) → 60	60	OK	
	scoresSpecial([], [2]) → 0	0	OK	
	scoresSpecial([], [20]) → 20	20	OK	
	scoresSpecial([14, 10, 4], [4, 20, 30]) → 40	40	OK	
	other tests
	OK
	*/
}


