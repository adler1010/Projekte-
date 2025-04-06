// ahmed abdelgadir, ahmed shaalan

public class Clock {
    private int h; 
    private int min; 

    public int getMin() {
        return min;
    }

    public int getH() {
        return h;
    }

    public Clock(int hours, int minutes) {
        setTime(hours, minutes);
    }

    public Clock(int minutes) {
        setTime(0, minutes);
    }

    public Clock(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        setTime(hours, minutes);
    }

    private void setTime(int hours, int minutes) {
        this.h = (hours + minutes / 60) % 24;
        this.min = minutes % 60;
    }

    public Clock add(int minutes) {
        return new Clock(this.h, this.min + minutes);
    }

    public Clock add(Clock c) {
        return new Clock(this.h + c.h, this.min + c.min);
    }

    public String toString() {
        return String.format("%02d:%02d", h, min);
    }

    
    public static void main(String[] args) {
        Clock clock1 = new Clock(10, 30);
        Clock clock2 = new Clock("15:45");
        Clock clock3 = new Clock(120);
        
        System.out.println("Clock 1: " + clock1);
        System.out.println("Clock 2: " + clock2);
        System.out.println("Clock 3: " + clock3);

        Clock addedClock1 = clock1.add(15);
        Clock addedClock2 = clock1.add(clock3);

        System.out.println("Clock 1 + 15 min: " + addedClock1);
        System.out.println("Clock 1 + Clock 3: " + addedClock2);
    }
}
