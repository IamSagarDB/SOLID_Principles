public class Main {
    public static void main(String[] args) {
       int A = 9;

        System.out.println(Math.log(A));
        System.out.println(Math.log(2) );
        int power = (int) (Math.log(A) / Math.log(2));
        System.out.println(power);
        int nearPower = (int) Math.pow(2, power);
        System.out.println(nearPower);
        // total people to be killed to get closest power of 2 get the chance to kill
        int killer = (2 * nearPower) + 1;
        System.out.println(killer);
    }
}

