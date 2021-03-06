package vn.rta.moneyaswords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Genius Doan on 05/11/2017.
 */
public class NumberConverterTest {
    @Test
    public void englishInteger() {
        LongConverterManager converter = LongConverterManager.getConverterManager(BaseConverterManager.ENGLISH);
        String valueAsWords = converter.asWords(1234L);

        assertEquals("one thousand two hundred thirty-four", valueAsWords);
    }
}
