package net.sourceforge.zmanim;

import net.sourceforge.zmanim.hebrewcalendar.JewishCalendar;
import net.sourceforge.zmanim.util.GeoLocation;
import org.testng.annotations.Test;

import java.util.TimeZone;

/**
 * Created with IntelliJ IDEA.
 * User: jottinge
 * Date: 12/6/12
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ZmanimTest {
    @Test
    public void testConversion() {
        JewishCalendar jc=new JewishCalendar();
        System.out.println(jc);
    }
}
