Codeshare is upgrading over the coming days! Plan accordingly for critical sessions.
Codeshare logo

    Sign UpLog In

1

import java.util.Scanner;

2

public class MatrixAddition {

3

  public static void main(String[] args) {

4

        Scanner s = new Scanner(System.in);

5

​

6

        System.out.print("Enter number of rows in Matrix A: ");

7

        int p = s.nextInt();

8

​

9

        System.out.print("Enter number of columns in Matrix A: ");

10

        int q = s.nextInt();

11

​

12

        System.out.print("Enter number of rows in Matrix B: ");

13

        int m = s.nextInt();

14

​

15

        System.out.print("Enter number of columns in Matrix B: ");

16

        int n = s.nextInt();

17

​

18

        if (p==m && q==n) {

19

            int a[][] = new int[p][q];

20

            int b[][] = new int[m][n];

21

            int sum[][] = new int[p][q];

22

​

23

            System.out.println("Enter elements of Matrix A:");

24

            for (int i=0;i<p;i++) {

25

                for (int j=0;j<q;j++) {

26

                    a[i][j] = s.nextInt();

27

                }

28

            }

29

​

30

            System.out.println("Enter elements of Matrix B:");

31

            for (int i=0;i<m;i++) {

32

                for (int j=0;j<n;j++) {

33

                    b[i][j] = s.nextInt();

34

                }

35

            }

36

​

37

            for (int i=0; i<p;i++) {

38

                for (int j=0;j<q;j++) {

39

                    sum[i][j] = a[i][j] + b[i][j];

40

                }

41

            }

42

​

43

            System.out.println("Sum Matrix:");

44

            for (int i=0;i<p;i++) {

45

                for (int j=0;j<q;j++) {

46

                    System.out.print(sum[i][j] + " ");

47

                }

48

                System.out.println();

49

            }

50

​

51

        } else {

52

            System.out.println("Matrix addition not possible.");

53

        }


