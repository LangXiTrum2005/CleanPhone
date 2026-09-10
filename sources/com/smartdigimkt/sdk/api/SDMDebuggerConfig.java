package com.smartdigimkt.sdk.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class SDMDebuggerConfig {
    private int mBannerType;
    private String mDeviceId;
    private int mInterstitialType;
    private int mNativeType;
    private int mNetworkFirmId;
    private int mRewardVideoType;
    private int mSplashType;

    public static class Builder {
        private int mBannerType;
        private String mDeviceId;
        private int mInterstitialType;
        private int mNativeType;
        private int mNetworkFirmId;
        private int mRewardVideoType;
        private int mSplashType;

        private Builder() {
        }

        private void fillDefaultType(int i2) {
            if (i2 != 66) {
                return;
            }
            this.mInterstitialType = 1;
        }

        public SDMDebuggerConfig build() {
            SDMDebuggerConfig sDMDebuggerConfig = new SDMDebuggerConfig();
            sDMDebuggerConfig.mDeviceId = this.mDeviceId;
            sDMDebuggerConfig.mNetworkFirmId = this.mNetworkFirmId;
            sDMDebuggerConfig.mNativeType = this.mNativeType;
            sDMDebuggerConfig.mBannerType = this.mBannerType;
            sDMDebuggerConfig.mSplashType = this.mSplashType;
            sDMDebuggerConfig.mInterstitialType = this.mInterstitialType;
            sDMDebuggerConfig.mRewardVideoType = this.mRewardVideoType;
            return sDMDebuggerConfig;
        }

        public Builder setBannerType(int i2) {
            this.mBannerType = i2;
            return this;
        }

        public Builder setInterstitial(int i2) {
            this.mInterstitialType = i2;
            return this;
        }

        public Builder setNativeType(int i2) {
            this.mNativeType = i2;
            return this;
        }

        public Builder setNetworkFirmId(int i2) {
            this.mNetworkFirmId = i2;
            fillDefaultType(i2);
            return this;
        }

        public Builder setRewardVideoType(int i2) {
            this.mRewardVideoType = i2;
            return this;
        }

        public Builder setSplashType(int i2) {
            this.mSplashType = i2;
            return this;
        }

        public Builder(String str) {
            this.mDeviceId = str;
            this.mNetworkFirmId = 66;
            fillDefaultType(66);
        }
    }

    public void fillRequestParam(JSONObject jSONObject) {
        try {
            jSONObject.put("is_test", 1);
            jSONObject.put("test_nw_firm", this.mNetworkFirmId);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("0", this.mNativeType);
            jSONObject2.put("2", this.mBannerType);
            jSONObject2.put("1", this.mRewardVideoType);
            jSONObject2.put("3", this.mInterstitialType);
            jSONObject2.put("4", this.mSplashType);
            if (jSONObject2.length() > 0) {
                jSONObject.put("test_format_sub", jSONObject2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public int getBannerType() {
        return this.mBannerType;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public int getInterstitialType() {
        return this.mInterstitialType;
    }

    public int getNativeType() {
        return this.mNativeType;
    }

    public int getNetworkFirmId() {
        return this.mNetworkFirmId;
    }

    public int getRewardVideoType() {
        return this.mRewardVideoType;
    }

    public int getSplashType() {
        return this.mSplashType;
    }

    private SDMDebuggerConfig() {
    }
}
