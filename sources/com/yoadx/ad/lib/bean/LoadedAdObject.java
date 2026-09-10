package com.yoadx.ad.lib.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LoadedAdObject<T> implements Comparable<LoadedAdObject<T>>, Serializable {
    private String mAdCacheId;
    private String mAdUnitID;
    private String mAdUnitName;
    private String mLoadScenes;
    private T mLoadedAdObject;
    private int mWeight;
    private long mAdLoadedTime = System.currentTimeMillis();
    private long mAdShowTime = 0;
    private long mAdCloseTime = 0;
    private long mAdClickTime = 0;
    private String mShowScenes = "";

    public LoadedAdObject(T t, String str, String str2, int i, String str3, String str4) {
        this.mLoadedAdObject = null;
        this.mLoadedAdObject = t;
        this.mAdUnitID = str;
        this.mAdUnitName = str2;
        this.mWeight = i;
        this.mAdCacheId = str3;
        this.mLoadScenes = str4;
    }

    public boolean adAvailable() {
        return this.mLoadedAdObject != null;
    }

    public String getAdCacheId() {
        return this.mAdCacheId;
    }

    public int getAdCacheTimeInSec() {
        if (this.mAdLoadedTime <= 0) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.mAdLoadedTime;
        if (jCurrentTimeMillis <= 0) {
            return -1;
        }
        return (int) (jCurrentTimeMillis / 1000);
    }

    public long getAdClickTime() {
        return this.mAdClickTime;
    }

    public long getAdCloseTime() {
        return this.mAdCloseTime;
    }

    public long getAdLoadedTime() {
        return this.mAdLoadedTime;
    }

    public long getAdShowTime() {
        return this.mAdShowTime;
    }

    public String getAdUnitID() {
        return this.mAdUnitID;
    }

    public String getAdUnitName() {
        return this.mAdUnitName;
    }

    public String getLoadScenes() {
        return this.mLoadScenes;
    }

    public T getLoadedAdObject() {
        return this.mLoadedAdObject;
    }

    public String getShowScenes() {
        return this.mShowScenes;
    }

    public int getWeight() {
        return this.mWeight;
    }

    public void setAdCacheId(String str) {
        this.mAdCacheId = str;
    }

    public void setAdClickTime(long j) {
        this.mAdClickTime = j;
    }

    public void setAdCloseTime(long j) {
        this.mAdCloseTime = j;
    }

    public void setAdLoadedTime(long j) {
        this.mAdLoadedTime = j;
    }

    public void setAdShowTime(long j) {
        this.mAdShowTime = j;
    }

    public void setAdUnitID(String str) {
        this.mAdUnitID = str;
    }

    public void setAdUnitName(String str) {
        this.mAdUnitName = str;
    }

    public void setLoadScenes(String str) {
        this.mLoadScenes = str;
    }

    public void setLoadedAdObject(T t) {
        this.mLoadedAdObject = t;
    }

    public void setShowScenes(String str) {
        this.mShowScenes = str;
    }

    public void setWeight(int i) {
        this.mWeight = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(LoadedAdObject<T> loadedAdObject) {
        return getWeight() - loadedAdObject.getWeight();
    }
}
