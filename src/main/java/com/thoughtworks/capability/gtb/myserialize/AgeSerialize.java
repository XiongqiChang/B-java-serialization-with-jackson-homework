package com.thoughtworks.capability.gtb.myserialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @Author: xqc
 * @Date: 2020/10/20 - 10 - 20 - 12:31
 * @Description: com.thoughtworks.capability.gtb.myserialize
 * @version: 1.0
 */

public class AgeSerialize extends JsonSerializer<Integer> {

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(0);
    }
}
