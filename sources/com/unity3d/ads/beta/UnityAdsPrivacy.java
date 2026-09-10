package com.unity3d.ads.beta;

import com.p004ironsource.d9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"set", "", d9.i.f24748b0, "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsent;", "value", "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsentValue;", "privacy", "Lcom/unity3d/ads/beta/UnityAdsPrivacyFlag;", "Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;", "setPrivacy", "flag", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsPrivacy {
    public static final void set(UnityAdsPrivacyConsent consent, UnityAdsPrivacyConsentValue value) {
        Intrinsics.f(consent, "consent");
        Intrinsics.f(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyConsentValue value) {
        Intrinsics.f(flag, "flag");
        Intrinsics.f(value, "value");
    }

    public static final void set(UnityAdsPrivacyFlag privacy, UnityAdsPrivacyValue value) {
        Intrinsics.f(privacy, "privacy");
        Intrinsics.f(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyValue consent) {
        Intrinsics.f(flag, "flag");
        Intrinsics.f(consent, "consent");
    }
}
