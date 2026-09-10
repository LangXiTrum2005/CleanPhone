package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f9023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f9024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f9025e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z10, boolean z11, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f9021a = z10;
        this.f9022b = z11;
        this.f9023c = consentFlowUserGeography;
        this.f9024d = uri;
        this.f9025e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f9023c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    @Nullable
    public Uri getPrivacyPolicyUri() {
        return this.f9024d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    @Nullable
    public Uri getTermsOfServiceUri() {
        return this.f9025e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f9021a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        p.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f9023c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z10) {
        p.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z10);
        this.f9021a = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        p.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f9024d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z10) {
        p.g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z10);
        this.f9022b = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        p.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f9025e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.f9022b;
    }

    @NonNull
    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f9021a + ", privacyPolicyUri=" + this.f9024d + ", termsOfServiceUri=" + this.f9025e + '}';
    }
}
