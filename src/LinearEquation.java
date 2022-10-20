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
        double numerator = x2 - x1;
        double denominator = y2 - y1;
        double yInt = yIntercept();
        String slope;
        String yIntOperation;
        if (denominator < 0) {
            denominator = (int) Math.abs(denominator);
            numerator = numerator * (-1);
            slope = numerator + "/" + denominator;
        }
        if ((((numerator % denominator) == 0) || ((int) (numerator / denominator)) == 1)) {
            numerator = (int) (numerator / denominator);
            slope = "" + numerator;
        }
        if (yInt < 0) {
            yIntOperation = "-";
        } else if (yInt > 0) {
            yIntOperation = "+";
        } else {
            yIntOperation = "";
            String zeroInt = "";
        }
        return "";
        }
        public String coordinateForX ( double xValue){
            double yCoor = (slope()*xValue) + yIntercept();
            return "(" + xValue + ", " + yCoor + ")";
        }


        public String lineInfo () {
            return "";
        }

}