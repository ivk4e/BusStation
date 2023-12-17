package App;

public class TicketExtended {
    private int ticketId;
    private int accountId;
    private int courseId;
    private String cityFrom;
    private String cityTo;
    private String date;
    private String hour;
    
    public TicketExtended(int ticketId, String cityFrom, String cityTo, String date, String hour) {
        this.ticketId = ticketId;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.date = date;
        this.hour = hour;
    }
    
    public int getTicketId() {
        return this.ticketId;
    }
    
    public Object[] toArray() {
        return new Object[] {cityFrom, cityTo, date, hour};
    }
}
