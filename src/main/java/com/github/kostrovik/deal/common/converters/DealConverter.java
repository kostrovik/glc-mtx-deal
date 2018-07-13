package com.github.kostrovik.deal.common.converters;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.github.kostrovik.deal.common.models.deal.Deal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    12/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class DealConverter {
    private static Logger logger = LogManager.getLogger(DealConverter.class);
    private JsonFactory jsonFactory;
    private String json;

    public DealConverter(String json) {
        this.jsonFactory = new JsonFactory();
        this.json = json;
    }

    public Deal buildDeal() {
        Map<String, Object> dealProperties = new HashMap<>();

        try (JsonParser jsonParser = jsonFactory.createParser(json)) {
            JsonToken jsonToken = jsonParser.nextToken();

            String cachedFieldName = null;

            while (jsonParser.hasCurrentToken()) {
                if (jsonToken == JsonToken.FIELD_NAME) {
                    cachedFieldName = jsonParser.getCurrentName();
                }

                if (jsonToken == JsonToken.VALUE_STRING && cachedFieldName != null) {
                    dealProperties.put(cachedFieldName, jsonParser.getText());
                }

                if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                    dealProperties.put(cachedFieldName, jsonParser.getValueAsInt());
                }
                if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                    dealProperties.put(cachedFieldName, jsonParser.getBigIntegerValue());
                }
                if (jsonToken == JsonToken.VALUE_FALSE || jsonToken == JsonToken.VALUE_TRUE) {
                    dealProperties.put(cachedFieldName, jsonParser.getValueAsBoolean());
                }

                jsonToken = jsonParser.nextToken();
            }
        } catch (IOException e) {
            logger.error("Ошибка конвертации json в Deal", e);
        }

        return new Deal((Integer) dealProperties.get("number"));
    }
}
