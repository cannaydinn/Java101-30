public class AsalSayilar{
    public static void main(String[] args) {
        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        
        System.out.print("1 - 100 arasındaki asal sayılar: ");
        for(int number = 2;number<=100;number++){
            boolean isPrime = true;
            for(int i = 2; i<=Math.sqrt(number); i++){
                if(number % i ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(number+ " ");
            }
        }
    }
}