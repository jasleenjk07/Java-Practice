public class NumberPattern {
    public static void main(String[] args){
        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= 6 - i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int number = 1;
        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(number);
        //         number++;
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= i; j++){
        //         int sum = i + j;
        //         if(sum % 2 == 0){
        //             System.out.print("1");
        //         } else {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i<= 5; i++){
        //     for(int j = 1; j <= 5 - i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int k = 1; k <= i; k++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }

            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }

            for(int k = 2; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
