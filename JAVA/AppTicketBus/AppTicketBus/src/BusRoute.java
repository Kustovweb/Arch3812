import java.util.ArrayList;
import java.util.List;

public class BusRoute {
    private int id;
    private String remark;
    private int capacity;
    private List<BusStop> bustStop;
    private BusRoute(int id, String remark, int capacity, List bustStop) {
        this.id = id;
        this.remark = remark;
        this.capacity = capacity;
        this.bustStop = new ArrayList<BusStop>();
        this.bustStop.add(new BusStop(new Person().getId(), new Person().getFirstName()));
    }


    

    
}
