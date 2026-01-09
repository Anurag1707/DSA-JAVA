 class nqueen {
    static int N=4;
    static void draw(){
        char arr[] [] =new char[N][N];
       for (int i = 0; i < N; i++) {
        for(int j=0;j<N;j++){
            arr[i][j]='.';
        }
           
       }
       solve(arr,0);
        

    }
    static void solve(char arr[][],int row){
        if(N==row){
             print(arr);
            return;
        }
        for(int col=0;col<N;col++){
            if(isSafe(arr,row,col)){
                arr[row][col]='Q';
                solve(arr,row+1);
                arr[row][col]='.';
            }
        }

      

    }
    static boolean  isSafe(char arr[][],int row ,int col){
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<N;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }

        return true;

    }

    static void print(char arr[][]){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args){
        draw();

    }
    
}

// class nqueen {

//     static int N = 4;

//     static void draw() {
//         char[][] arr = new char[N][N];

//         // board initialize
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 arr[i][j] = '.';
//             }
//         }

//         solve(arr, 0);
//     }

//     static void solve(char[][] arr, int row) {

//         // base case → solution found
//         if (row == N) {
//              print(arr);
//             return;
//         }

//         for (int col = 0; col < N; col++) {
//             if (isSafe(arr, row, col)) {
//                 arr[row][col] = 'Q';
//                 solve(arr, row + 1);
//                 arr[row][col] = '.'; // backtrack
//             }
//         }
//     }

//     static boolean isSafe(char[][] arr, int row, int col) {

//         // same column check
//         for (int i = 0; i < row; i++) {
//             if (arr[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         // left diagonal
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (arr[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         // right diagonal
//         for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
//             if (arr[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     static void print(char[][] arr) {
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         draw();
//     }
// }
