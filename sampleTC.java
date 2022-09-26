package java;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class sampleTC {
    @Test(priority = 2)
    public void College()
    {
        System.out.println("Beautiful memories");
    }
    @Test(priority = 1)
    public void School()
    {
        System.out.println("Life time memories");
        if(true){
        throw new SkipException("");
    }}

}
