package Array;

public class comparearraywithoutinbuildfunction {
    public static void main(String[] args) {
        String[] a = {"chandra", "kumar", "anbu"};
        String[] b = {"chandra", "kumar", "anbu"};

        if (comparearrayeaquals(a, b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays not are equal");
        }
    }

    public static boolean comparearrayeaquals(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }

            }
            return true;

        }
    }
}


