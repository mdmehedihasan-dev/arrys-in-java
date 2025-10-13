// ক্লাসের নাম kadanes
public class kadanes {

    // kadaneSum নামের একটি static মেথড বানানো হয়েছে, যা একটি integer array ইনপুট নেয়
    // এবং সর্বোচ্চ subarray sum (maximum subarray sum) রিটার্ন করে
    public static int kadaneSum(int[] nums) { // <-- এখানে void এর জায়গায় int কারণ আমরা মান রিটার্ন করছি

        // প্রথম উপাদান দিয়েই শুরু করা হচ্ছে।
        // কারণ অ্যারেতে যদি সব সংখ্যা নেগেটিভ হয়, তাহলে 0 দিয়ে শুরু করলে ভুল ফল আসবে।
        int maxSum = nums[0];  // এখন পর্যন্ত পাওয়া সর্বোচ্চ subarray sum রাখবে
        int currSum = nums[0]; // বর্তমানে যেই subarray নিয়ে কাজ হচ্ছে তার যোগফল রাখবে

        // এখন অ্যারের দ্বিতীয় উপাদান (index 1) থেকে শুরু করে লুপ চালানো হচ্ছে
        for (int i = 1; i < nums.length; i++) {

            // প্রতিটি ধাপে যাচাই করা হচ্ছে:
            // ১) শুধু বর্তমান সংখ্যা nums[i] দিয়ে নতুন subarray শুরু করা ভালো হবে কিনা
            // ২) নাকি আগের subarray এর সাথে বর্তমান সংখ্যাটি যোগ করলে ভালো হয় (currSum + nums[i])
            // দুটি মানের মধ্যে যেটা বড়, সেটি currSum এ রাখা হচ্ছে।
            currSum = Math.max(nums[i], currSum + nums[i]);

            // এখন পর্যন্ত পাওয়া সর্বোচ্চ যোগফল (maxSum) আপডেট করা হচ্ছে।
            // যদি নতুন currSum আগের maxSum থেকে বড় হয়, তাহলে maxSum আপডেট হবে।
            maxSum = Math.max(maxSum, currSum);
        }

        // লুপ শেষ হলে maxSum এ থাকবে পুরো অ্যারের সর্বোচ্চ subarray sum।
        return maxSum; // তাই সেটি রিটার্ন করা হচ্ছে।
    }

    // main মেথড — প্রোগ্রাম এখান থেকেই শুরু হয়
    public static void main(String[] args) {

        // একটি integer অ্যারে তৈরি করা হচ্ছে, যেটিতে কিছু পজিটিভ এবং নেগেটিভ সংখ্যা আছে
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        // kadaneSum() মেথডকে কল করা হচ্ছে এবং রিটার্ন মান result এ সংরক্ষণ করা হচ্ছে
        int result = kadaneSum(nums); // result এর মান হবে সর্বোচ্চ subarray sum

        // ফলাফল প্রিন্ট করা হচ্ছে
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
