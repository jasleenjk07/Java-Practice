public class pattern {
    public static void main(String[] args){
        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= 5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= 5; j++){
        //         if(i == 1 || j == 1 || i == 4 || j == 5){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= 5 - i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= 4 - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //upper half
        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }

        //     for(int k = 1; k <= 2*(4-i); k++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //lower half
        // for(int i = 4; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }

        //     for(int k = 1; k <= 2*(4-i); k++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= 5 - i; j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int k = 1; k <= 5; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //upper half
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4 - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= 4 - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
