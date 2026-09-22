package bikeModern;
public class Bike implements BikeParts {

    private String handleBars;
    private String frame;
    private String tyres;
    private String seatType;
    private int NumGears;

    public Bike() {
        this(
                "flat",
                "standard",
                "regular",
                "standard",
                7
        );
    }

    public Bike(
            String handleBars,
            String frame,
            String tyres,
            String seatType,
            int numGears
    ) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        this.NumGears = numGears;
    }

    @Override
    public String getMake() {
        return MAKE;
    }

    @Override
    public void printDescription() {

        System.out.println(
                "\n" + getMake() + "\n"
                        + "This bike has "
                        + this.handleBars
                        + " handlebars on a "
                        + this.frame
                        + " frame with "
                        + this.NumGears
                        + " gears."
                        + "\nIt has a "
                        + this.seatType
                        + " seat with "
                        + this.tyres
                        + " tyres."
        );
    }
}