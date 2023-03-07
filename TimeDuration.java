public class TimeDuration {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeDuration(int intHours, int intMinutes, int intSeconds){
        hours=intHours;
        minutes=intMinutes;
        seconds=intSeconds;
    }

public String toString(){
    String result="";
    if(hours<1){
        result+="00:";
    }else if (hours<10){
            result+="0"+hours+":";
        }else{
        result+=hours+":";
        }
        if(minutes<1){
            result+="00:";
        }else if(minutes<10){
            result+="0"+minutes+":";
        }else{
        result+=minutes+":";
        }
        if(seconds<1){
            result+="00";
        }else if(seconds<10){
            result+="0"+seconds;
        }
        else{
        result+=seconds;
        }
        return result;
}
public static TimeDuration parseFromString(String s){
    int sec=0;
    int min=0;
    int hour=0;
int sEndindex = s.indexOf("s");
int sStartindex = s.indexOf(",")+1;
while(numInString(s.substring(sStartindex, sStartindex+1))==false){
    sStartindex++;
}
if(sEndindex!=-1){
    while(numInString(s.substring(sEndindex, sEndindex+1))==false){
        sEndindex--;
    }
}
sec=Integer.parseInt(s.substring(sStartindex, sEndindex+1));

    return new TimeDuration(hour, min, sec);
}

private static boolean numInString(String s){
    if (s.equals("0") || 
    s.equals("1") || 
    s.equals("2") || 
    s.equals("3") ||
    s.equals("4") ||
    s.equals("5") ||
    s.equals("6") ||
    s.equals("7") ||
    s.equals("8") ||
    s.equals("9")) {
        return true;
    } else {
        return false;
    }
}
    public static void main(String[] args) {
        //TimeDuration time = new TimeDuration(7,2,4);
        //System.out.println(time.toString());
    String input="5 s";
    TimeDuration time2=parseFromString(input);
    System.out.println(time2.toString());
    }
}
