import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter width of Matrix[width][width]:");
        int width=scanner.nextInt();
        int[][] matrix=new int[width][width];
        int sum=0;
        for (int i=0;i<width;i++){
            for (int j=0;j<width;j++){
                System.out.println("Enter Element "+i+"-"+j+":");
                matrix[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<width;i++){
            System.out.println();
            for (int j=0;j<width;j++){
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println();
        for (int i=0;i<width;i++){
            for (int j=0;j<width;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
