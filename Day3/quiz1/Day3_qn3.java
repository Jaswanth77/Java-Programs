public class Day3_qn3 {

    static class PalPrime
    {
        public static boolean isPrime(int n)
        {
            if(n<=1)
            {
                return false;
            }
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i == 0)
                {
                    return false;
                }
            }
            return true;
        }

        public static boolean isPalindrome(int n)
        {
            int reverse = 0;
            int a = n;
            while(a>0)
            {
                reverse = reverse*10+(a%10);
                a = a/10;
            }
            if(n == reverse)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        PalPrime(int n,String message)
        {
            if(isPrime(n) & isPalindrome(n))
            {
                message = "palprime";
            }
            else if (isPrime(n) & !isPalindrome(n))
            {
                message = "prime";

            }
            else if (!isPrime(n) & isPalindrome(n))
            {
                message = "palindrome";
            }
            else
            {
                message = "not prime and palindrome";
            }
            System.out.println(n+" is "+message);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,34543,565,727,10099};
        int a = arr.length;
        PalPrime[] obj = new PalPrime[a];
        for(int i=0;i<a;i++)
        {
            obj[i] = new PalPrime(arr[i],"");
        }
    }
}
