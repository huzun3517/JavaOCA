public class P30S8 {
    public static void main(String[] args) {

		int n[][] = { { 1, 3 }, { 2, 4 } };
		for (int i = n.length - 1; i >= 0; i--) {
			for (int y : n[i]) {
				System.out.print(y);
			}
		}
		//2413



        // baska kaynak icin deneme

//        int n[][] = { { 1, 3 }, { 2, 4 } };
//        for (int i = n.length - 1; i >= 0; i--) {
//            for (int j = n[i].length - 1; j >=0 ; j--) {
//                System.out.println(n[i][j]);
//            }
//        }

//	     n[1][1] = 4  n[1][0] = 2  n[0][1] = 3   n[0][0] = 1
		//4231

    }
}
