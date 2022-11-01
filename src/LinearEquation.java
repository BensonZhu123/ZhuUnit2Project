public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.y2 = y2;
        this.x2 = x2;
    }
    public double distance(){
        return roundedToHundredth(Math.pow((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)),0.5));
    }

    public double roundedToHundredth(double toRound){
        double round = Math.round(toRound*100);
        return round/100;
    }
    public double yIntercept(){
        return roundedToHundredth(y1-(slope()*x1));
    }

    public double slope(){
        double slope = ((double)y2-y1)/(x2-x1);
        return roundedToHundredth(slope);
    }

    public String equation() {
        String numerator;
        String denominator;
        double numInt = yIntercept();
        int num = y2 - y1;
        int den = x2 - x1;
        String yInt;
        if (Math.abs(num) == Math.abs(den)){
            num = num / (Math.abs(num));
            den = den / (Math.abs(den));
        }
        if (numInt == 0){
            yInt = "";
        }
        else if (numInt < 0){
            yInt = " - " + Math.abs(yIntercept());
        }
        else{
            yInt = " + " + Math.abs(yIntercept());
        }
        if(den < 0) {
            num *= -1;
            den = Math.abs(den);
        }
        if (den == 0 || den == 1){
            denominator = "";
        }

        else {
            denominator = "/" + den;
        }

        if (num == 0){
            numerator = "";
            denominator = "";
        }
        else if ((num == -1)&&(den == 0) || (den == 1)){
            numerator = "-";
        }
        else if ((num == 1)&&((den == 0))){
            numerator = "";
        }
        else{
            numerator = "" + num;
        }
        if (Math.abs(num) == 1 && Math.abs(den) == 1){
            numerator = "";
            denominator = "";
        }
        if (y1 == y2){
            return "y = " +yIntercept();
        }
        else {
            return "y = " + numerator + denominator + "x" + yInt;
        }
    }
        public String coordinateForX ( double xValue){
            double yCoor = (slope()*xValue) + yIntercept();
            return "(" + xValue + ", " + yCoor + ")";
        }


        public String lineInfo () {
            if (x1 == x2){

                return "These points are on a vertical line: x = " + x1;

            }
            else {
                String line1 = "The two points are: (" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ")";
                String line2 = "The equation of the line between these two points is: " + equation();
                String line3 = "The slope of this line is: " + slope();
                String line4 = "The y-intercept of the line is: " + yIntercept();
                String line5 = "The distance between the two points is: " + distance();
                return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5;
            }
        }

}