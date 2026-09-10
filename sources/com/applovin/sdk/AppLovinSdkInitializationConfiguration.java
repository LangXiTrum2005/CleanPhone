package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppLovinSdkInitializationConfiguration {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface Builder {
        AppLovinSdkInitializationConfiguration build();

        List<String> getAdUnitIds();

        @Nullable
        String getMediationProvider();

        @Nullable
        String getPluginVersion();

        String getSdkKey();

        @Nullable
        MaxSegmentCollection getSegmentCollection();

        List<String> getTestDeviceAdvertisingIds();

        boolean isExceptionHandlerEnabled();

        Builder setAdUnitIds(List<String> list);

        Builder setExceptionHandlerEnabled(boolean z10);

        Builder setMediationProvider(@Nullable String str);

        Builder setPluginVersion(@Nullable String str);

        Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection);

        Builder setTestDeviceAdvertisingIds(List<String> list);
    }

    public static Builder builder(String str) {
        return builder(str, "");
    }

    public abstract List<String> getAdUnitIds();

    @Nullable
    public abstract String getAxonEventKey();

    @Nullable
    public abstract String getMediationProvider();

    @Nullable
    public abstract String getPluginVersion();

    @Nullable
    public abstract String getSdkKey();

    @Nullable
    public abstract MaxSegmentCollection getSegmentCollection();

    public abstract List<String> getTestDeviceAdvertisingIds();

    public abstract boolean isExceptionHandlerEnabled();

    public static Builder builder(String str, String str2) {
        return new AppLovinSdkInitializationConfigurationImpl.BuilderImpl(str, str2);
    }

    @Deprecated
    public static Builder builder(String str, Context context) {
        return builder(str, "");
    }
}
