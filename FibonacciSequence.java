
     class FibonacciSequence
    {
        public static void main(String[] args)
        {
            Fibonacci(10000000);

        }

        static void Fibonacci(long max)
        {
			long total = 0;
            long i = 0;
            long j = 1;
            long evenValuesTotal = 0;

            while (i <= max)
            {
               System.out.print(i + " ");
                long sum = i + j;
                i = j;
                j = sum; //0 1 1 2 3 5
            }
        }
    }

