class ArrayOperations {


    public static int[][][] createCube() {
        int[][][] cube = new int[3][3][3];
        for (int i = 0; i < cube.length; i++) {
            int element = 0;
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = element;
                    element++;
                }
            }
        }



//        int[][][] cube = new int[3][3][3];
//        int i = 0;
//        int j = 0;
//        int k = 0;
////        int count = 0;
////        for (i = 0; i < 3; i++) {
////            count = 0;
////            for (j = 0; j < 3; j++) {
////                for (k = 0; k < 3; k++) {
////                    arr[i][j][k] = count;
////                    count++;
////                    System.out.print(arr[i][j][k] + " ");
////                }
////                count =0;
////               System.out.print(" ");
////            }
////           System.out.println();
////        }
//
//
//        for (  i = 0;i<3;i++){
//            for( j =0;j<3;j++){
//                for( k=0;k<3;k++){
//                    if(i==0) {
//                        cube[i][j][k] = k;
//                    }
//                    else if(i==1){
//                        cube[i][j][k] = k+3;
//
//                    }
//                    else if(i==2){
//                        cube[i][j][k] = k+6;
//
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.print(dim3x3[i][j][k]);
//                }
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }
//
////        return arr;
//
        return cube;
//        return dim3x3;

    }
}
