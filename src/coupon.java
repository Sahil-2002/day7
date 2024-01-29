import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class coupon {


        public static void main(String[] args) {
            int[] couponNumbers = {1, 2, 3, 4, 5}; // Example distinct coupon numbers
            System.out.println("Total random numbers needed: " + generateDistinctCoupons(couponNumbers));
        }

        public static int generateDistinctCoupons(int[] couponNumbers) {
            Set<Integer> generatedCoupons = new HashSet<>();
            Random random = new Random();
            int count = 0;

            while (generatedCoupons.size() < couponNumbers.length) {
                int randomCoupon = getRandomCoupon(couponNumbers, random);
                if (!generatedCoupons.contains(randomCoupon)) {
                    generatedCoupons.add(randomCoupon);
                }
                count++;
            }

            return count;
        }

        public static int getRandomCoupon(int[] couponNumbers, Random random) {
            int index = random.nextInt(couponNumbers.length);
            return couponNumbers[index];
        }
    }


