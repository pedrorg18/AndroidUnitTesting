package com.pedroroig.example.androidunittesting.errorcodestest

import org.junit.Test

import org.junit.Assert.*

class ErrorCodesManagerKtTest {

    val errorCodes = listOf(
        "{\"returnCode\":104,\"returnMessage\":\"Provided number is unknown.\",\"lang\":\"en_US\",\"context\":{\"scope\":\"somescope\",\"id\":\"12345678\"}}",
        "{\"returnCode\":333,\"returnMessage\":\"HELLO\"}}",
        "{\"code\": \"SERVICE_UNAVAILABLE\",\"url\": \"https://someserver.com/12345678\",\"message\": \"Internal error\"}")

    val errorCodesV2 = listOf(
        "{\"returnCode\":104,\"returnMessage\":\"Provided number is unknown.\",\"lang\":\"en_US\",\"context\":{\"scope\":\"somescope\",\"id\":\"12345678\"}}",
        "{\"returnCode\":333,\"returnMessage\":\"HELLO\"}}",
        "{\"code\": \"SERVICE_UNAVAILABLE\",\"url\": \"https://someserver.com/12345678\",\"message\": \"Internal error\"}",
        "{    \"returnCode\": 400}")

    @Test
    fun parseErrorCodeFromRawErrorBody() {
        for ((index, value) in errorCodes.withIndex()) {
            when(index) {
                0 -> assertEquals(104, parseErrorCodeFromRawErrorBody(value))
                1 -> assertEquals(333, parseErrorCodeFromRawErrorBody(value))
                2 -> assertEquals(0, parseErrorCodeFromRawErrorBody(value))
            }
        }

    }

    @Test
    fun parseErrorCodeFromRawErrorBodyV2() {
        for ((index, value) in errorCodesV2.withIndex()) {
            when(index) {
                0 -> assertEquals(104, parseErrorCodeFromRawErrorBodyV2(value))
                1 -> assertEquals(333, parseErrorCodeFromRawErrorBodyV2(value))
                2 -> assertEquals(0, parseErrorCodeFromRawErrorBodyV2(value))
                3 -> assertEquals(400, parseErrorCodeFromRawErrorBodyV2(value))
            }
        }
    }
}