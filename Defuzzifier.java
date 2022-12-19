import java.util.ArrayList;

public class Defuzzifier {
    /**
     * Function that returns crisp value using weighted-average method.
     *
     * @param out The output variable.
     * @param memValues The membership values.
     * @return Crisp Value (Z*).
     */
    double getPrediction(Variable out, ArrayList<Double> memValues){
        ArrayList<FuzzySet> fuzzySets = out.getFuzzySets();

        double up = 0; // Numerator.

        // Calculating centroid values.
        for(int i = 0; i < fuzzySets.size(); i++){
            FuzzySet fs = fuzzySets.get(i);
            ArrayList<Pair<Integer, Integer>> points = fs.getPoints();
            double centroid = 0;
            for (Pair<Integer, Integer> point : points) centroid += point.first;
            centroid /= points.size();
            up += centroid * memValues.get(i);
        }

        double down = 0; // Denominator.
        for (Double memValue : memValues) down += memValue;

        return up / down;
    }

}
