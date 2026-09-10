package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxSegmentCollection f9293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f9294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f9295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9296h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MaxSegmentCollection f9301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f9302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f9303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f9304h;

        public BuilderImpl(String str, @Nullable String str2) {
            List list = Collections.EMPTY_LIST;
            this.f9302f = list;
            this.f9303g = list;
            this.f9304h = true;
            this.f9297a = str;
            this.f9298b = str2;
            p.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f9303g;
        }

        @Nullable
        public String getAxonEventKey() {
            return this.f9298b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getMediationProvider() {
            return this.f9299c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getPluginVersion() {
            return this.f9300d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f9297a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public MaxSegmentCollection getSegmentCollection() {
            return this.f9301e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f9302f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f9304h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            p.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        p.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f9303g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            p.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f9304h = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(@Nullable String str) {
            p.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f9299c = str;
                return this;
            }
            p.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(@Nullable String str) {
            p.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f9300d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f9297a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            p.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.f9301e = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            p.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || str.length() != 36) {
                    p.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f9302f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f9297a + ", axonEventKey=" + this.f9298b + ", mediationProvider=" + this.f9299c + ", pluginVersion=" + this.f9300d + ", testDeviceAdvertisingIdentifiers=" + this.f9302f + ", adUnitIdentifiers=" + this.f9303g + ", isExceptionHandlerEnabled=" + this.f9304h + ", segmentCollection=" + this.f9301e + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f9295g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getAxonEventKey() {
        return this.f9290b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getMediationProvider() {
        return this.f9291c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getPluginVersion() {
        return this.f9292d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getSdkKey() {
        return this.f9289a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public MaxSegmentCollection getSegmentCollection() {
        return this.f9293e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f9294f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f9296h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f9289a + ", axonEventKey=" + this.f9290b + ", mediationProvider=" + this.f9291c + ", pluginVersion=" + this.f9292d + ", testDeviceAdvertisingIds=" + this.f9294f + ", adUnitIdentifiers=" + this.f9295g + ", isExceptionHandlerEnabled=" + this.f9296h + ", segmentCollection=" + this.f9293e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f9289a = builderImpl.f9297a;
        this.f9290b = builderImpl.f9298b;
        this.f9291c = builderImpl.f9299c;
        this.f9292d = builderImpl.f9300d;
        this.f9293e = builderImpl.f9301e;
        this.f9294f = builderImpl.f9302f;
        this.f9295g = builderImpl.f9303g;
        this.f9296h = builderImpl.f9304h;
    }
}
