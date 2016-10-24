package com.example.android.thatcountry.Models;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Country implements Serializable {

    @SerializedName("name") private String name;
    @SerializedName("topLevelDomain") private List<String> topLevelDomain;
    @SerializedName("alpha2Code") private String alpha2Code;
    @SerializedName("alpha3Code") private String alpha3Code;
    @SerializedName("callingCodes") private List<String> callingCodes;
    @SerializedName("capital") private String capital;
    @SerializedName("altSpelling") private List<String> altSpelling;
    @SerializedName("relevance") private String relevance;
    @SerializedName("region") private String region;
    @SerializedName("subregion") private String subregion;
    @SerializedName("translation") private Translations translations;
    @SerializedName("population") private int population;
    @SerializedName("latlng") private List<Float> latlng;
    @SerializedName("demonym") private String demonym;
    @SerializedName("area") private float area;
    @SerializedName("gini") private float gini;
    @SerializedName("timezones") private List<String> timezones;
    @SerializedName("borders") private List<String> borders;
    @SerializedName("nativeName") private String nativeName;
    @SerializedName("numericCode") private String numericCode;
    @SerializedName("currencies") private List<String> currencies;
    @SerializedName("languages") private List<String> languages;

    public Country(String name, List<String> topLevelDomain, String alpha3Code, String alpha2Code,
                   List<String> callingCodes, String capital, List<String> altSpelling,
                   String relevance, String region, String subregion, Translations translations,
                   int population, List<Float> latlng, String demonym, float area, float gini,
                   List<String> timezones, List<String> borders, String nativeName,
                   String numericCode, List<String> currencies, List<String> languages) {
        this.name = name;
        this.topLevelDomain = topLevelDomain;
        this.alpha3Code = alpha3Code;
        this.alpha2Code = alpha2Code;
        this.callingCodes = callingCodes;
        this.capital = capital;
        this.altSpelling = altSpelling;
        this.relevance = relevance;
        this.region = region;
        this.subregion = subregion;
        this.translations = translations;
        this.population = population;
        this.latlng = latlng;
        this.demonym = demonym;
        this.area = area;
        this.gini = gini;
        this.timezones = timezones;
        this.borders = borders;
        this.nativeName = nativeName;
        this.numericCode = numericCode;
        this.currencies = currencies;
        this.languages = languages;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getAltSpelling() {
        return altSpelling;
    }

    public void setAltSpelling(List<String> altSpelling) {
        this.altSpelling = altSpelling;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Float> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Float> latlng) {
        this.latlng = latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getGini() {
        return gini;
    }

    public void setGini(float gini) {
        this.gini = gini;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

}
