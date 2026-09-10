package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* JADX INFO: renamed from: com.applovin.impl.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0945k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f11003a;

    public C0945k0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f11003a = consentFlowUserGeography;
    }

    public boolean a(Object obj) {
        return obj instanceof C0945k0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0945k0)) {
            return false;
        }
        C0945k0 c0945k0 = (C0945k0) obj;
        if (!c0945k0.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyA = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyA2 = c0945k0.a();
        return consentFlowUserGeographyA != null ? consentFlowUserGeographyA.equals(consentFlowUserGeographyA2) : consentFlowUserGeographyA2 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyA = a();
        return (consentFlowUserGeographyA == null ? 43 : consentFlowUserGeographyA.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.f11003a;
    }
}
