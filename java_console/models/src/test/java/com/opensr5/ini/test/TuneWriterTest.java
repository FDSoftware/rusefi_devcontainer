package com.opensr5.ini.test;

import com.opensr5.ConfigurationImage;
import com.opensr5.ini.field.IniField;
import com.opensr5.ini.field.ScalarIniField;
import com.rusefi.config.FieldType;
import com.rusefi.config.generated.Fields;
import com.rusefi.tune.xml.Constant;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuneWriterTest {
    @Test
    public void testFloatRounding() {
        ConfigurationImage image = new ConfigurationImage(Fields.TOTAL_CONFIG_SIZE);
        IniField floatField = new ScalarIniField("test", 0, "test", FieldType.FLOAT, 1, "2");
        double value = 0.9;
        floatField.setValue(image, new Constant("x", "y", Double.toString(value), "2"));

        assertEquals("0.89999998", floatField.getValue(image));
    }
}
