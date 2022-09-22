public class IsPrime {
    public static void main(String[] args) {
        int number = 43;
        boolean flag = false;
        // It's checking condition
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                flag=true;
                break;
            }
        }
        if(!flag) {
            System.out.println(number + " is prime ");
        }
        else
        {
            System.out.println(number+" is not prime");
        }
    }
}
