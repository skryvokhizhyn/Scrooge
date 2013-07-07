package com.summersoft.scrooge.test;

import android.test.AndroidTestCase;
import com.summersoft.scrooge.PaymentParameters;
import com.summersoft.scrooge.SmsParserUkrSib;

public class SmsParserTest extends AndroidTestCase {

    public void testEmpty() {
        SmsParserUkrSib parser = new SmsParserUkrSib();

        PaymentParameters pp = parser.parse(/*""*/);

        assertEquals(pp, new PaymentParameters());
    }
}
