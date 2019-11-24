package com.example.mvvmlivavdataretrofit.modelresponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.example.mvvmlivavdataretrofit.modelresponse.SerieseListResponse.Links
import com.example.mvvmlivavdataretrofit.modelresponse.SerieseListResponse.Country




public class SerieseListResponse {
    @SerializedName("id")
    @Expose
    private var id: Int? = null
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("country")
    @Expose
    private var country: Country? = null
    @SerializedName("birthday")
    @Expose
    private var birthday: String? = null
    @SerializedName("deathday")
    @Expose
    private var deathday: Any? = null
    @SerializedName("gender")
    @Expose
    private var gender: String? = null
    @SerializedName("image")
    @Expose
    private var image: Image? = null
    @SerializedName("_links")
    @Expose
    private var links: Links? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getCountry(): Country? {
        return country
    }

    fun setCountry(country: Country) {
        this.country = country
    }

    fun getBirthday(): String? {
        return birthday
    }

    fun setBirthday(birthday: String) {
        this.birthday = birthday
    }

    fun getDeathday(): Any? {
        return deathday
    }

    fun setDeathday(deathday: Any) {
        this.deathday = deathday
    }

    fun getGender(): String? {
        return gender
    }

    fun setGender(gender: String) {
        this.gender = gender
    }

    fun getImage(): Image? {
        return image
    }

    fun setImage(image: Image) {
        this.image = image
    }

    fun getLinks(): Links? {
        return links
    }

    fun setLinks(links: Links) {
        this.links = links
    }


    inner class Image {

        @SerializedName("medium")
        @Expose
        var medium: String? = null
        @SerializedName("original")
        @Expose
        var original: String? = null

    }

    inner class Links {

        @SerializedName("self")
        @Expose
        var self: Self? = null

    }

    inner class Self {

        @SerializedName("href")
        @Expose
        var href: String? = null

    }

    inner class Network {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("country")
        @Expose
        var country: Country? = null

    }
    inner class Country {

        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("code")
        @Expose
        var code: String? = null
        @SerializedName("timezone")
        @Expose
        var timezone: String? = null

    }
}