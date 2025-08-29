package LeetCode;

public class RichestCustomerWealth_1672q {
    static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] account : accounts) {
            int count = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                count += account[j];
            }
            max = Math.max(count, max);
        }
        return max;
    }

    public static void main(String[] args) {
//        int[][] accounts={{1,2,3},{3,2,1}};
//        int[][] accounts={{1,5},{7,3},{3,5}};
        int[][] accounts={{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth(accounts));
    }
}
