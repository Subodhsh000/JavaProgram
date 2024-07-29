class PatternEg{

    static void printNumber(int n){
        int i,j;
        // outer loop - rows
        // for( i=1;i<=n;i++)  - 1 to n increasing format
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printNumber(5);
    }
}