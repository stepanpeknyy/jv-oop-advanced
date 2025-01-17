package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
