package com.yoadx.ad.lib.bean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AdCloudResponse implements Serializable {

    @SerializedName("default_ad_config")
    private AdGroupConfig defaultAdConfig;

    @SerializedName("special_ad_config_list")
    private List<SpecialAdConfig> specialAdConfigList;

    public static class SpecialAdConfig implements Serializable {

        @SerializedName("ad_config")
        private AdGroupConfig adConfig;

        @SerializedName("country")
        private List<String> country;

        public AdGroupConfig getAdConfig() {
            return this.adConfig;
        }

        public List<String> getCountry() {
            return this.country;
        }

        public void setAdConfig(AdGroupConfig adGroupConfig) {
            this.adConfig = adGroupConfig;
        }

        public void setCountry(List<String> list) {
            this.country = list;
        }
    }

    public AdGroupConfig getDefaultAdConfig() {
        return this.defaultAdConfig;
    }

    public List<SpecialAdConfig> getSpecialAdConfigList() {
        return this.specialAdConfigList;
    }

    public void setDefaultAdConfig(AdGroupConfig adGroupConfig) {
        this.defaultAdConfig = adGroupConfig;
    }

    public void setSpecialAdConfigList(List<SpecialAdConfig> list) {
        this.specialAdConfigList = list;
    }
}
