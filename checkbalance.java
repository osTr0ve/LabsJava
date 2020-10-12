 public class checkbalance
  {
		public static void main(String[] args){
			int[]d={2,2,2,344,5,7,8,9,4,};
			System.out.println("Результат = "+checkBalance(d));

				}
    private static boolean checkBalance(int[] arrParam) {
        int left_part, right_part;

        for (int i = 0; i < arrParam.length + 1; i++) {
            left_part = 0;
            right_part = 0;

            for (int j = 0; j < i; j++) {
                left_part+= arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                right_part += arrParam[j];
            }

            if (left_part==right_part) return true;
        }
        return false;
    }
 }