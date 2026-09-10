package com.applovin.impl.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f9315b;

    public SdkConfigurationImpl(l lVar) {
        this.f9314a = lVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f9314a.p0().getExtraParameters().get("consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f9314a.a(z4.f10105a7);
        }
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentDialogState.APPLIES;
        }
        return "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography() {
        String str = (String) this.f9314a.a(z4.f10105a7);
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        return "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.f9314a.a(z4.f10113b7);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    @Nullable
    public List<String> getEnabledAmazonAdUnitIds() {
        return this.f9315b;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.f9314a.u0().c();
    }

    public void setEnabledAmazonAdUnitIds(@Nullable List<String> list) {
        this.f9315b = list;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + '}';
    }
}
