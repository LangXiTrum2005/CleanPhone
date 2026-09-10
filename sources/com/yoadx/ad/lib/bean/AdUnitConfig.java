package com.yoadx.ad.lib.bean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AdUnitConfig implements Serializable, Comparable<AdUnitConfig> {

    @SerializedName("unit")
    private String mAdUnitID = "";

    @SerializedName("name")
    private String mAdUnitName = "";

    @SerializedName("weight")
    private int mWeight = 0;

    @SerializedName("loadDelaySec")
    private int mLoadDelaySec = 0;

    @SerializedName("maxColdNoFillSec")
    private int mMaxColdNoFillSec = 0;

    @SerializedName("minColdNoFillSec")
    private int mMinColdNoFillSec = 0;

    @SerializedName("showDelayMin")
    private double mShowDelayMinute = 0.0d;

    @SerializedName("preloadCount")
    private int mPreloadCount = 1;
    private long adLastReqTime = 0;
    private AdState adLastReqState = AdState.IDLE;
    private long mColdNoFillTime = 0;
    private long noFillTime = 0;

    public AdState getAdLastReqState() {
        return this.adLastReqState;
    }

    public long getAdLastReqTime() {
        return this.adLastReqTime;
    }

    public String getAdUnitID() {
        return this.mAdUnitID;
    }

    public String getAdUnitName() {
        return this.mAdUnitName;
    }

    public long getColdNoFillTime() {
        return this.mColdNoFillTime;
    }

    public int getLoadDelaySec() {
        return this.mLoadDelaySec;
    }

    public int getMaxColdNoFillSec() {
        return this.mMaxColdNoFillSec;
    }

    public int getMinColdNoFillSec() {
        return this.mMinColdNoFillSec;
    }

    public long getNoFillTime() {
        return this.noFillTime;
    }

    public int getPreloadCount() {
        return this.mPreloadCount;
    }

    public double getShowDelayMinute() {
        return this.mShowDelayMinute;
    }

    public int getWeight() {
        return this.mWeight;
    }

    public void setAdLastReqState(AdState adState) {
        this.adLastReqState = adState;
    }

    public void setAdLastReqTime(long j) {
        this.adLastReqTime = j;
    }

    public void setAdUnitID(String str) {
        this.mAdUnitID = str;
    }

    public void setAdUnitName(String str) {
        this.mAdUnitName = str;
    }

    public void setColdNoFillTime(long j) {
        this.mColdNoFillTime = Math.max((((long) this.mMinColdNoFillSec) * 1000) / 2, Math.min(j, ((long) this.mMaxColdNoFillSec) * 1000));
    }

    public void setLoadDelaySec(int i) {
        this.mLoadDelaySec = i;
    }

    public void setMaxColdNoFillSec(int i) {
        this.mMaxColdNoFillSec = i;
    }

    public void setMinColdNoFillSec(int i) {
        this.mMinColdNoFillSec = i;
    }

    public void setNoFillTime(long j) {
        this.noFillTime = j;
    }

    public void setPreloadCount(int i) {
        this.mPreloadCount = i;
    }

    public void setShowDelayMinute(double d) {
        this.mShowDelayMinute = d;
    }

    public void setWeight(int i) {
        this.mWeight = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(AdUnitConfig adUnitConfig) {
        return getWeight() - adUnitConfig.getWeight();
    }
}
