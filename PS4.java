public class PS4 {
    //write a function that takes in the radius as input & returns the circumference of a circle

    static double circumference(double r){
        double PI = 3.1415;
        double cir = 2*PI*r;
        return cir;
    }
    public static void main(String[] args) {
        double r =5;
        double result = Math.round(circumference(r)*1000)/1000.0;
        System.out.println("Circumference ="+ result);
    
    }
}
