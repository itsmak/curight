package com.innovellent.curight.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SUNIL on 12/8/2017.
 */

public class WHR_LIST {

        private int whrid;

        private String whr;

    public String getGraphflag() {
        return graphflag;
    }

    public void setGraphflag(String graphflag) {
        this.graphflag = graphflag;
    }

    private String graphflag;

        private String waistcircumference;

        private String hipcircumference;

        private String whrFlag;


   /* public WHR_LIST(int whrid, String whr, String waistcircumference, String hipcircumference, String whrFlag) {
        this.whrid = whrid;
        this.whr = whr;
        this.waistcircumference = waistcircumference;
        this.hipcircumference = hipcircumference;
        this.whrFlag = whrFlag;
    }*/

    public int getWhrid() {
        return whrid;
    }

    public void setWhrid(int whrid) {
        this.whrid = whrid;
    }

    public String getWhr() {
        return whr;
    }

    public void setWhr(String whr) {
        this.whr = whr;
    }

    public String getWaistcircumference() {
        return waistcircumference;
    }

    public void setWaistcircumference(String waistcircumference) {
        this.waistcircumference = waistcircumference;
    }

    public String getHipcircumference() {
        return hipcircumference;
    }

    public void setHipcircumference(String hipcircumference) {
        this.hipcircumference = hipcircumference;
    }

    public String getWhrFlag() {
        return whrFlag;
    }

    public void setWhrFlag(String whrFlag) {
        this.whrFlag = whrFlag;
    }






}
