package com.example.android.thatcountry.Models;

import com.google.gson.annotations.SerializedName;

public class Translations {

    @SerializedName("de") private String de;
    @SerializedName("es") private String es;
    @SerializedName("fr") private String fr;
    @SerializedName("ja") private String ja;
    @SerializedName("it") private String it;

    public Translations(String de, String es, String fr, String ja, String it) {
        this.de = de;
        this.es = es;
        this.fr = fr;
        this.ja = ja;
        this.it = it;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

}
