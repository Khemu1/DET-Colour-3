package DET;

public class AlphaChannelColor extends Color {
    private int alpha;

    public AlphaChannelColor(int red, int green, int blue, int alpha) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setAlpha(alpha);
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    // the Requested Method
    public void dissolve() {
        setRed(getRed() + 1);
        setGreen(getGreen() + 1);
        setBlue(getBlue() + 1);
        setAlpha(getAlpha() + 1);
    }
}
