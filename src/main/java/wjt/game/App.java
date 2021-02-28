package wjt.game;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String s = Joiner.on("-").join(Lists.newArrayList(1, 2, 3, 4, 5));
        System.out.println("s="+s);
    }
}
