package com.example.demo;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class UserTest {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void jsonSetter() throws JsonProcessingException {
        String json = "{\"finishTime\":\"10:00\"}";
        User user = objectMapper.readerFor(User.class).readValue(json);

        assertThat(user.getCompletedTime()).isEqualTo("10:00");
    }

    @Test
    void jsonIgnore() throws JsonProcessingException {
        String json = "{\"ignore\":\"yes\",\"finishTime\":\"10:00\"}";
        User user = objectMapper.readerFor(User.class).readValue(json);
        String result = objectMapper.writeValueAsString(user);

        assertThat(result).doesNotContain("yes");
    }
}
