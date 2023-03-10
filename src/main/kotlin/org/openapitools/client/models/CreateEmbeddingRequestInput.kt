/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * Input text to get embeddings for, encoded as a string or array of tokens. To get embeddings for multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed 8192 tokens in length. 
 *
 */


data class CreateEmbeddingRequestInput (private val value: Any) {
    init {
        require(value is String || value is Array<*>) {
            "value must be initialized with a String or an Array of Strings"
        }
    }

    fun getValue(): Any {
        return value
    }
}