import java.util.Scanner;

public class _1295_ {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();
    int [] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
    } System.out.println(findNumber(arr));
  }
  public static int findNumber( int[] arr) {
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
        int soLuongChuSo = tinhSoCHuSo(arr[i]);
        if ( soLuongChuSo % 2 == 0) {
            cnt++;
        }
    }  return cnt;
  }
  private static int tinhSoCHuSo(int n) {
    int cnt = 0;
    while (n != 0) {
        n = n / 10;
        cnt++;
    }
    return cnt;
}

}