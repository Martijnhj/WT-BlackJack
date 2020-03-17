package WT;


import java.util.Timer;
import java.util.TimerTask;

import java.util.Scanner;

public class TestingTimer
{
    private String str = "";

    TimerTask task = new TimerTask()
    {
        public void run()
        {
            if( str.equals("") )
            {
                System.out.println( "you input nothing. you pass..." );
                System.exit( 0 );
            }
        }
    };

    public void getInput() throws Exception
    {
        Timer timer = new Timer();
        timer.schedule( task, 10*1000 );

        System.out.println( "Input a string within 10 seconds: " );
        Scanner in = new Scanner(System.in );
        str = in.nextLine();

        timer.cancel();
        System.out.println( "you have entered: "+ str );
    }

    public static void main( String[] args )
    {
        try
        {
            (new TestingTimer()).getInput();
        }
        catch( Exception e )
        {
            System.out.println( e );
        }
        System.out.println( "main exit..." );


        //use timer task -> threads, runnable etc
        //     //ocp.reference.carpago.nl -> java threads
        //    //workingtalent
        //    //workingtalentrocks2020
        //Probeer te begrijpen hoe source code van timer task werkt!!!!!!!!!!!!!!!!

    }

}
