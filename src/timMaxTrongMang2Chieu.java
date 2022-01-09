import java.util.Arrays;
import java.util.Scanner;

public class timMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j;
        System.out.println("nhap so hang cua ma tran: ");
        i= input.nextInt();
        System.out.println("nhap so cot cua ma tran: ");
        j=input.nextInt();

        int maTran[][]=new int [i][j];
        System.out.println("Nhap phan tu cho ma tran");
        for (int k=0;k<i;k++ ) {
            for(int l=0; l<j; l++) {
                System.out.println( "maTran["+k+"]["+l+ "] =");
                maTran[k][l]=input.nextInt();
            }
        }
   int max = maTran[0][0];
        for (int p=0;p<i; p++ ){
            for (int o =0; o<j; o++){
                if (max<maTran[p][o]){
                    max=maTran[p][o];
                }
            }
        }
        System.out.println("phan tu lon nhat trong ma tran la: "+ max);
    }
}
