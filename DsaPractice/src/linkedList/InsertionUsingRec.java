package linkedList;

import java.util.ArrayList;

public class InsertionUsingRec {
	    public static int findWinner(int n, int k) {
	        // Initialize the list with friends numbered from 1 to n
	        ArrayList<Integer> friends = new ArrayList<>();
	        for (int i = 1; i <= n; i++) {
	            friends.add(i);
	        }

	        int index = 0; // Starting index

	        // Iterate until only one friend remains
	        while (friends.size() > 1) {
	            // Calculate the index of the friend to remove
	            index = (index + k - 1) % friends.size();
	            friends.remove(index); // Remove the friend who loses
	        }

	        // The last remaining friend is the winner
	        return friends.get(0);
	    }

	    public static void main(String[] args) {
	        int n = 6; // Number of friends
	        int k = 5; // Count every k-th friend
	        System.out.println("The winner is: " + findWinner(n, k)); // Output: 3
	    }
	}

