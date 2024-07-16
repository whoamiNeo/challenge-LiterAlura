package com.challenge.literalura.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConversion implements iDataConversion {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    //esta funcion convierte un string en un objeto de la clase que se le pase
    public <T> T convertData(String data, Class<T> classType) {
        try {
            return objectMapper.readValue(data, classType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
