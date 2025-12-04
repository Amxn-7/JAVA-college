package Class18;

import java.util.HashMap;

/* 
Q1. K Challenges For Last Occurrence
Abhishek is playing an online game, in which he has to solve a series of challenges to win it. The game is as follows: Given a list of N integers sorted in
descending order, and a series of K challenges. In each challenge, one integer X will be flashed on the screen, and the player needs to find the last occurrence
of X in the given list. Finally, he has to sum up the result of all the K challenges, and enter the answer in the game's console. If the player's answer matches the
expected output, then he wins the game.
Abhishek needs your help to win this game, He wants you to write an algorithm that finds the last occurrence of K given integers in a sorted list, and then add
those to get the final answer.
Note: If a number X is not found in the list, then consider its last occurrence as -1.
Example:
N = 7, arr[N] = {6, 5, 5, 5, 4, 2, 2}
K = 3, challenges[K] = {5, 2, 6}
The last occurrence of 5, 2 and 6 is at index 3, 6, 0 respectively. Therefore, the final answer is 3 + 6 + 0 = 9
*/

public class ChallengeOne {
    public static int result(int[] arr,int[] challenges){
        int sum=0;
        for(int i=0;i<challenges.length;i++){
            sum+=lastOcc(arr,challenges[i]);
        }
        return sum;
    }

    public static int lastOcc(int[] arr,int target){
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i]==target) {
                return i;
            }
       }
        return -1;
    }
    //using hashmap
    public static int result2(int[] arr,int[] challenges){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], i);
        }
        int sum = 0;
        for(int num : challenges){
            sum+=map.getOrDefault(num, -1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {7 ,6, 5, 3, 3, 2, 1};
        int[] challenges = {9, 3, 2, -3};
        System.out.println("O(n^2) : "+result(arr, challenges));
        System.out.println("Using HashMap O(n): "+result2(arr, challenges));
    }
}