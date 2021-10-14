package leetcode;

public class Leetcode_q2 {
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        // time complexity O(n)
        // space O(n)
        int w1 = -1, w2 = -1, min_dis = wordsDict.length;
        for(int i = 0; i < wordsDict.length; i++){
            // .equals() check if have same value  == check if have same address
            if (wordsDict[i].equals(word1)){
                w1 = i;
            }
            if (wordsDict[i].equals(word2)){
                w2 = i;
            }
            if (w1 != -1 && w2 != -1){
                min_dis = Math.min(min_dis, Math.abs(w1 - w2));
            }
        }
        return min_dis;
    }

    public static void main(String[] args) {
        String[] test1 = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(test1,"coding","practice"));
        System.out.println("--------------------");
        String[] test2 = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(test2, "makes","coding"));
    }
}
