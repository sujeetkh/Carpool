package in.iisc.csa.sujeet.carpool;

/**
 * Car Pool!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
        System.out.println( "Car pool started" );
    }
}
