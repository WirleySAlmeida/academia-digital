package me.dio.academiadigital.infra.jackson.deser;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import me.dio.academiadigital.infra.utils.JavaTimeUtils;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {
    public static final long serialVersionUID = -4589164298310392227L;

    public LocalDateDeserializer() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser parser, DeserializationContext context) throws IOException, JacksonException {
        return LocalDate.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
    }
}
