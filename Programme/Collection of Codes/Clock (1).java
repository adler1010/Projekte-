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

    public Clock(int h, int min) {
        setClock(h, min);
    }

    public Clock(int min) {
        setClock(0, min);
    }

    public Clock(String time) {
        String[] parts = time.split(":");
        if (parts.length == 2) {
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            setClock(hours, minutes);
        } else {
            setClock(0, 0); 
        }
    }

    private void normalize() {
        if (min >= 60) {
            h += min / 60;
            min %= 60;
        }
        if (h >= 24) {
            h %= 24;
        }
    }

    public Clock add(int min) {
        Clock newClock = new Clock(this.h, this.min);
        newClock.min += min;
        newClock.normalize();
        return newClock;
    }

    public Clock add(Clock c) {
        Clock newClock = new Clock(this.h, this.min);
        newClock.h += c.h;
        newClock.min += c.min;
        newClock.normalize();
        return newClock;
    }

    public String toString() {
        String hourString = (h < 10) ? "0" + h : String.valueOf(h);
        String minString = (min < 10) ? "0" + min : String.valueOf(min);
        return hourString + ":" + minString;
    }

    private void setClock(int h, int min) {
        this.h = h;
        this.min = min;
        normalize();
    }

    public static void main(String[] args) {

        Clock clock1 = new Clock(8, 45);
        Clock clock2 = new Clock(14, 30);
        Clock clock3 = new Clock("17:15");

        System.out.println("Uhrzeit 1: " + clock1);
        System.out.println("Uhrzeit 2: " + clock2);
        System.out.println("Uhrzeit 3: " + clock3);

        Clock sum1 = clock1.add(90);
        Clock sum2 = clock2.add(clock3);

        System.out.println("Summe 1: " + sum1);
        System.out.println("Summe 2: " + sum2);
    }
}
