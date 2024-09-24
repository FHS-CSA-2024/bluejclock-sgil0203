package src.main.java;


public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change
    private NumberDisplay hours; 
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display1;
    
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay1();
    }
    
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }
    
    public void timeTick1(){
        seconds.Increment();
        
        if(seconds.getValue() == 0){
            minutes.Increment(); 
        }
        
        if(minutes.getValue() == 0) {
            hours.Increment();
        }
        
        updateDisplay1(); 
    }
    
    
    public void setTime(int hour, int minute, int second){
        minutes.setValue(minute); 
        hours.setValue(hour); 
        seconds.setValue(second); 
        updateDisplay1(); 
    }
    
     public String getTime1(){
        return display1; 
    }
    
    public void updateDisplay1(){ 
        String output = ""; 
        output = hours.getDisplayValue();
        output = output + ":"; 
        output = output + minutes.getDisplayValue();
        output = output + ":";
        output = output + seconds.getDisplayValue();
        display1 = output;
}
}

