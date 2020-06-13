import java.util.ArrayList;
import java.util.List;

class Angle {
    int degrees;
    int minutes;
    int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Angle> angleList) {
        List<Integer> result = new ArrayList<>();       //A

        for (int i = 0; i < angleList.size(); i++) {        //B
            int deg = angleList.get(i).getDegrees();        //C
            int min = angleList.get(i).getMinutes();        //C
            int sec = angleList.get(i).getSeconds();        //C
            if (deg >= 0 && deg < 360) {                    //D
                if (min < 0 || min > 59)                    //E
                    throw new RuntimeException("The minutes of the angle are not valid!");  //F
                else {                                      //G
                    if (sec < 0 || sec > 59)                //H
                        throw new RuntimeException("The seconds of the angle are not valid"); //I
                    else                                    //J
                        result.add(deg * 3600 + min * 60 + sec);        //K
                }
            } else if (deg == 360) {                        //L
                if (min == 0 && sec == 0)                   //M
                    result.add(deg * 3600 + min * 60 + sec);  //N
                else                                            //O
                    throw new RuntimeException("The angle is greater then the maximum");  //P
            } else {                                        //Q
                throw new RuntimeException("The angle is smaller or greater then the minimum");  //R
            }
        }
        return result;   //S

    }
}

