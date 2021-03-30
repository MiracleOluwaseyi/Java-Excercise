package Practice;

public class TV {

    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TV(){
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel <= 150);
        channel = newChannel;
    }

    public void setVolume(int newVolume){
        if (on && newVolume >= 1 && newVolume <= 7);
        volume = newVolume;
    }

    public void channelUp(){
        if (on && channel < 150);
        channel++;
    }

    public void channelDown(){
        if (on && channel > 1);
        channel--;
    }

    public void volumeUp(){
        if (on && volume < 10);
        volume++;
    }

    public void volumeDown(){
        if (on && volume > 1);
        volume--;
    }

}
