import java.util.HashMap;
import java.util.Map;

public class CarPark {

    static Integer ticketNo = 5000;
    static Map<Integer, String> carPark = new HashMap<>(10);

    public static void main(String[] args) {
        CarPark cp = new CarPark();
        if(args.length == 0) {
            System.out.println("Please enter command string");
        } else {
            for(String arg : args) {
                switch(arg.charAt(0)) {
                    case 'p': cp.park(arg.substring(1));
                    break;
                    case 'u': cp.unpark(Integer.parseInt(arg.substring(1)));
                    break;
                    case 'c': cp.compact();
                }
            }            
        }
    }

    public void park(String regNo) {
        carPark.put(ticketNo, regNo);
        ticketNo++;
    }

    public void unpark(int ticket) {
        carPark.remove(ticket);
    }

    public void compact() {
        for (String car : carPark.values()) {
            System.out.print(car + ",");            
        }
        int i = 0;
        while(i < (10 - carPark.size())) {
            System.out.print(",");
            i++;
        }
    }
}