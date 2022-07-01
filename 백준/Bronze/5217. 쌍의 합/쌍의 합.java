import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> solveSumPairs(int target) {
    	
    	ArrayList<Integer> answer = new ArrayList<Integer>();
    	
    	/* ------------------- INSERT CODE HERE ---------------------*/

    	// answer.add(x);		// adds x to ArrayList<Integer> answer

    	for(int i=1 ; i<=target/2; i++){
            if(i != (target-i)) {
            	answer.add(i);
            	answer.add(target-i);
            }
        }

        /* -------------------- END OF INSERTION --------------------*/
    	
    	return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int n = 0; n < numCases; n++)
        {
            int target = sc.nextInt();
            
            ArrayList<Integer> answer = solveSumPairs(target);
            
            System.out.print("Pairs for "+target+": ");
            
            for (int i = 0; i<answer.size(); i+=2 ) {
            	if (i>0) 
            		System.out.print(", ");
            	System.out.print(answer.get(i) + " " + answer.get(i+1));
            }
            System.out.println();
        }
    }
}
