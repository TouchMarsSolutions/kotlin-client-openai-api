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
 * 
 *
 * @param id 
 * @param `object` 
 * @param created 
 * @param ownedBy 
 */


data class Model (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "object")
    val `object`: kotlin.String,

    @Json(name = "created")
    val created: kotlin.Int,

    @Json(name = "owned_by")
    val ownedBy: kotlin.String

)

