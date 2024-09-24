package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time --done
        //      * Constructor w/ time given & read time ---done
        //      * Set time ---done
        //      * Read time --done
        //      * Tick time --done
        //  * Tick test for 03:32 to 03:33 --done
        //  * Tick test for 03:09 to 03:10 --done
        //  * Tick test for 01:59 to 02:00 --done
        //  * Tick test for 09:59 to 10:00 --done
        //  * Tick test for 23:59 to 00:00 --done
        ClockDisplay test1 = new ClockDisplay(); 
        String test1Output = test1.getTime(); 
        System.out.println("Empty Con. Test - " + test1Output); 
        
        ClockDisplay test2 = new ClockDisplay(3, 45); 
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Output);
        test2.timeTick(); 
        System.out.println("2 Arg. Con. Test After Tick - " + test2.getTime());
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32); 
        System.out.println("Tick Test 1 PreTick - " + tickTest1.getTime()); 
        tickTest1.timeTick(); 
        System.out.println("Tick Test 1 PostTick - " + tickTest1.getTime()); 
        
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        System.out.println("Tick Test 2 PreTick - " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("Tick Test 2 PostTick - " + tickTest2.getTime());
        
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        System.out.println("Tick Test 3 PreTick - " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("Tick Test 3 PostTick - " + tickTest3.getTime());
        
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        System.out.println("Tick Test 4 PreTick - " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("Tick Test 4 PostTick - " + tickTest4.getTime());
        
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        System.out.println("Tick Test 5 PreTick - " + tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("Tick Test 5 PostTick - " + tickTest5.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time --done
        //      * Constructor w/ time given & read time --done
        //      * Set time --done
        //      * Read time --done
        //      * Tick time --done
        //  * Tick test for 03:32:59 to 03:33:00 --done
        //  * Tick test for 01:00:59 to 01:01:00 --done
        //  * Tick test for 01:59:59 to 02:00:00 --done
        //  * Tick test for 23:59:59 to 00:00:00 --done
        ClockDisplaySeconds test_1 = new ClockDisplaySeconds(); 
        String test_1Output = test_1.getTime1(); 
        System.out.println("Empty Con. Test - " + test_1Output); 
        
        ClockDisplaySeconds test_2 = new ClockDisplaySeconds(3, 45, 45); 
        String test_2Output = test_2.getTime1();
        System.out.println("3 Arg. Con. Test - " + test_2Output);
        test_2.timeTick1(); 
        System.out.println("3 Arg. Con. Test After Tick - " + test_2.getTime1());
        
        ClockDisplaySeconds test_3 = new ClockDisplaySeconds(3, 32, 59); 
        String test_3Output = test_3.getTime1();
        System.out.println("Tick Test 1 PreTick - " + test_3Output);
        test_3.timeTick1(); 
        System.out.println("Tick Test 1 PostTick - "  + test_3.getTime1());
        
        ClockDisplaySeconds test_4 = new ClockDisplaySeconds(1, 0, 59); 
        String test_4Output = test_4.getTime1();
        System.out.println("Tick Test 2 PreTick - " + test_4Output);
        test_4.timeTick1(); 
        System.out.println("Tick Test 2 PostTick - "  + test_4.getTime1());
        
        ClockDisplaySeconds test_5 = new ClockDisplaySeconds(1, 59, 59); 
        String test_5Output = test_5.getTime1();
        System.out.println("Tick Test 3 PreTick - " + test_5Output);
        test_5.timeTick1(); 
        System.out.println("Tick Test 3 PostTick - "  + test_5.getTime1());
        
        ClockDisplaySeconds test_6 = new ClockDisplaySeconds(23, 59, 59); 
        String test_6Output = test_6.getTime1();
        System.out.println("Tick Test 4 PreTick - " + test_6Output);
        test_6.timeTick1(); 
        System.out.println("Tick Test 4 PostTick - "  + test_6.getTime1());
        
/**
 * Output:
Empty Con. Test - 00:00
2 Arg. Con. Test - 03:45
2 Arg. Con. Test After Tick - 03:46
Tick Test 1 PreTick - 03:32
Tick Test 1 PostTick - 03:33
Tick Test 2 PreTick - 03:09
Tick Test 2 PostTick - 03:10
Tick Test 3 PreTick - 01:59
Tick Test 3 PostTick - 02:00
Tick Test 4 PreTick - 09:59
Tick Test 4 PostTick - 10:00
Tick Test 5 PreTick - 23:59
Tick Test 5 PostTick - 00:00
Empty Con. Test - 00:00:00
3 Arg. Con. Test - 03:45:45
3 Arg. Con. Test After Tick - 03:45:46
Tick Test 1 PreTick - 03:32:59
Tick Test 1 PostTick - 03:33:00
Tick Test 2 PreTick - 01:00:59
Tick Test 2 PostTick - 01:01:00
Tick Test 3 PreTick - 01:59:59
Tick Test 3 PostTick - 02:00:00
Tick Test 4 PreTick - 23:59:59
Tick Test 4 PostTick - 00:00:00
*/
        
    }
}
