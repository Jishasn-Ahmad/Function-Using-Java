public class PS9 {
    static int gcd(int a, int b)
    {
        int result = Math.min(a,b);
        while(result>0){
            if(a%result==0 && b%result ==0){
               break;
            }
            result--;           
        }
        return result;
    }
    public static void main(String[] args) {
        int a=98, b=56;
        System.out.println("GCD of"+ a +" and"+ b+"is"+gcd(a,b));
    }
}
