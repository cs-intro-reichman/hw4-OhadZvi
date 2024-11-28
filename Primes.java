public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int primeCounter = 0;
        boolean[] isNotPrime = new boolean[n + 1];
        int sqrt_n = (int) Math.ceil(Math.sqrt(n));
        for (int p = 2; p <= sqrt_n; p++) {
            for (int i = p * 2; i < isNotPrime.length; i += p) {
                isNotPrime[i] = true;
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < isNotPrime.length; i++){
            if (!isNotPrime[i]) {
                System.out.println(i);
                primeCounter++;
            }
        }
        int primePercentage = (int) ((n / primeCounter) * 100);
        System.out.println("There are " + primeCounter + " primes between 2 and " + n + "(" + primePercentage + "% are primes)");
    }
}