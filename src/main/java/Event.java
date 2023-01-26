public class Event extends Task {
    protected String from;
    protected String to;

    Event (String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toSaveFormat() {
        return "E||" + super.toSaveFormat() + "||" + this.from + "||" + this.to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + this.from + ", to: " + this.to + ")";
    }
}
