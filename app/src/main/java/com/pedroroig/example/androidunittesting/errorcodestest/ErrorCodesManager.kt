package com.pedroroig.example.androidunittesting.errorcodestest


/**
 * Parses server json error body to obtain the error code. The format looks like this:
 * {"returnCode":104, ....
 * If parsing does not succeed, return 0 to show generic error
 */
fun parseErrorCodeFromRawErrorBody(errorBody: String): Int {
    return try {
        val withoutPrefix = errorBody.removePrefix("{returnCode:")
        withoutPrefix.substring(0, withoutPrefix.indexOf(',')).toInt()
    } catch (e: Exception) {
        0
    }
}

/**
 * Parses server json error body to obtain the error code. The format can look like this:
 * {"returnCode":104, "returnMessage":"Your number....
 * or:
 * {    "returnCode":400}
 * If parsing does not succeed, return 0 to show generic error
 */
fun parseErrorCodeFromRawErrorBodyV2(errorBody: String): Int {
    return try {
        val withoutPrefix = errorBody
            // remove all whitespaces
            .replace("\\s".toRegex(), "")
            // Remove prefix
            .removePrefix("{returnCode:")
        if(withoutPrefix.contains("returnMessage"))
            withoutPrefix.substring(0, withoutPrefix.indexOf(',')).toInt()
        else
            withoutPrefix.substring(0, withoutPrefix.indexOf('}')).toInt()
    } catch (e: Exception) {
        0
    }

}