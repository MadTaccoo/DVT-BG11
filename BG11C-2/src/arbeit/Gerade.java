package arbeit;

/**
 * Created by gian on 6/23/16.
 */
public class Gerade {
    private Punkt p1;
    private String bezeichnung;
    private String steigung;

    public Gerade(String bezeichnung, String steigung, Punkt p1) {
        this.bezeichnung = bezeichnung;
        this.steigung = steigung;
        this.p1 = p1;
    }

    public Gerade(String bezeichnung, Punkt p1, Punkt p2) {
        this.bezeichnung = bezeichnung;
        this.steigung = Double.toString((p2.getY() - p1.getY())/(p1.getY() - p1.getX()));
        this.p1 = p1;
    }

    public String getSteigung() { return steigung; }

    public Punkt getPunkt() { return p1; }

    public String getYAchsenabschnitt() {
        double m = toDouble(steigung);
        return Double.toString(p1.getY() - m * p1.getX());
    }

    public String getY(double x) {
        if(steigung == "unendlich") {
            return steigung;
        }

        double m = toDouble(steigung);
        double b = toDouble(getYAchsenabschnitt());

        return Double.toString(m * x + b);
    }

    public String getGeradengleichung() { return String.format("%s(%f|%f)", bezeichnung, p1.getX(), p1.getY()); }

    public String getNullstelle(Punkt nullstelle) {
        double m = toDouble(steigung);
        double b = toDouble(getYAchsenabschnitt());

        if(m == 0.0) {
            return "keine Nullstelle";
        } else {
            double x = -b / m;
            double y = toDouble(getY(x));

            nullstelle.setX(x);
            nullstelle.setY(y);

            return "Nullstelle";
        }
    }

    public boolean isParallel(Gerade a) { steigung.equals(a.getSteigung()); }

    public boolean isOrthogonal(Gerade a) {
        return toDouble(steigung) * toDouble(a.getSteigung()) == -1.0;
    }

    private static double toDouble(String s) {
        return Double.parseDouble(s.replace(',', '.'));
    }
}
