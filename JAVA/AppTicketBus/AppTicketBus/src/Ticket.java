import java.math.BigDecimal;
import java.sql.Date;

public class Ticket {
    private BigDecimal price;
    private Date date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;
    public Ticket(BigDecimal price, Date date, int startZone, int finishZone, int place, int roadNumber) {
        this.price = price;
        this.date = date;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.place = place;
        this.roadNumber = roadNumber;
    }

    
}
