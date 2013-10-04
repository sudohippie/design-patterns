package me.sudohippie.designpattern.behavioral.memento;

/**
 * Weather service system has method to return the current system status.
 *
 * The system is set to fail after every N number of requests to {@code getSystemStatus}.
 * When it does fail, its status changes to {@code NOT_RUNNING} from {@code RUNNING}.
 *
 * The only way to restore the systems status to RUNNING is through a memento which captures
 * the system stage at a given moment.
 *
 * Raghav Sidhanti
 * 10/4/13
 */
public class WeatherService {

    private int currentCount = 0;
    private String status = RUNNING;

    public static final int MAX = 4;

    public static final String RUNNING = "RUNNING";
    public static final String NOT_RUNNING = "NOT RUNNING";

    public String getSystemStatus(){
        // increment request counter for every request
        currentCount ++;
        // if request counter has exceeded n, set status to "Not Running"
        if(currentCount > MAX) status = NOT_RUNNING;
        // return status;
        return status;
    }

    public Memento saveAndReturnMemento(){
        return new MementoImpl(status, currentCount);
    }

    public void loadFromMemento(Memento memento){
        this.status = memento.getStatus();
        this.currentCount = memento.getCountState();
    }

    private class MementoImpl implements Memento {

        private String status;
        private int countState;

        private MementoImpl(String status, int countState) {
            this.status = status;
            this.countState = countState;
        }

        @Override
        public String getStatus() {
            return this.status;
        }

        @Override
        public int getCountState() {
            return this.countState;
        }
    }
}
