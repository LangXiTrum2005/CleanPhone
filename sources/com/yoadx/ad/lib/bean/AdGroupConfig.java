package com.yoadx.ad.lib.bean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class AdGroupConfig implements Serializable {

    @SerializedName("admob_cache_available_time")
    private long mAdmobCacheAvailableTime = 3600000;

    @SerializedName("common_interstitial_ad_cloud")
    private ArrayList<AdUnitConfig> mCommonInterstitialAdCloud = null;

    @SerializedName("extra_interstitial_ad_cloud")
    private ArrayList<AdUnitConfig> mExtraInterstitialAdCloud = null;

    @SerializedName("common_reward_ad_cloud")
    private ArrayList<AdUnitConfig> mCommonRewardAdCloud = null;

    @SerializedName("extra_reward_ad_cloud")
    private ArrayList<AdUnitConfig> mExtraRewardAdCloud = null;

    @SerializedName("common_appopen_ad_cloud")
    private ArrayList<AdUnitConfig> mCommonAppOpenAdCloud = null;

    @SerializedName("extra_appopen_ad_cloud")
    private ArrayList<AdUnitConfig> mExtraAppOpenAdCloud = null;

    @SerializedName("common_native_ad_cloud")
    private ArrayList<AdUnitConfig> mCommonNativeAdCloud = null;

    @SerializedName("extra_native_ad_cloud")
    private ArrayList<AdUnitConfig> mExtraNativeAdCloud = null;

    @SerializedName("ad_max_cache_count")
    private int mAdMInterstitialMaxCacheCount = 2;

    @SerializedName("reward_max_cache_count")
    private int mVideoMaxCacheCount = 2;

    @SerializedName("ad_native_max_cache_count")
    private int mAdNativeMaxCacheCount = 2;

    @SerializedName("ad_appopen_max_cache_count")
    private int mAdAppOpenMaxCacheCount = 2;

    public int getAdAppOpenMaxCacheCount() {
        return this.mAdAppOpenMaxCacheCount;
    }

    public int getAdMInterstitialMaxCacheCount() {
        return this.mAdMInterstitialMaxCacheCount;
    }

    public int getAdNativeMaxCacheCount() {
        return this.mAdNativeMaxCacheCount;
    }

    public ArrayList<AdUnitConfig> getCommonAppOpenAdCloud() {
        return this.mCommonAppOpenAdCloud;
    }

    public ArrayList<AdUnitConfig> getCommonInterstitialAdCloud() {
        return this.mCommonInterstitialAdCloud;
    }

    public ArrayList<AdUnitConfig> getCommonNativeAdCloud() {
        return this.mCommonNativeAdCloud;
    }

    public ArrayList<AdUnitConfig> getCommonRewardAdCloud() {
        return this.mCommonRewardAdCloud;
    }

    public ArrayList<AdUnitConfig> getExtraAppOpenAdCloud() {
        return this.mExtraAppOpenAdCloud;
    }

    public ArrayList<AdUnitConfig> getExtraInterstitialAdCloud() {
        return this.mExtraInterstitialAdCloud;
    }

    public ArrayList<AdUnitConfig> getExtraNativeAdCloud() {
        return this.mExtraNativeAdCloud;
    }

    public ArrayList<AdUnitConfig> getExtraRewardAdCloud() {
        return this.mExtraRewardAdCloud;
    }

    public int getVideoMaxCacheCount() {
        return this.mVideoMaxCacheCount;
    }

    public void setAdAppOpenMaxCacheCount(int i) {
        this.mAdAppOpenMaxCacheCount = i;
    }

    public void setAdMInterstitialMaxCacheCount(int i) {
        this.mAdMInterstitialMaxCacheCount = i;
    }

    public void setAdNativeMaxCacheCount(int i) {
        this.mAdNativeMaxCacheCount = i;
    }

    public void setCommonAppOpenAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mCommonAppOpenAdCloud = arrayList;
    }

    public void setCommonInterstitialAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mCommonInterstitialAdCloud = arrayList;
    }

    public void setCommonNativeAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mCommonNativeAdCloud = arrayList;
    }

    public void setCommonRewardAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mCommonRewardAdCloud = arrayList;
    }

    public void setExtraAppOpenAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mExtraAppOpenAdCloud = arrayList;
    }

    public void setExtraInterstitialAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mExtraInterstitialAdCloud = arrayList;
    }

    public void setExtraNativeAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mExtraNativeAdCloud = arrayList;
    }

    public void setExtraRewardAdCloud(ArrayList<AdUnitConfig> arrayList) {
        this.mExtraRewardAdCloud = arrayList;
    }

    public void setVideoMaxCacheCount(int i) {
        this.mVideoMaxCacheCount = i;
    }
}
