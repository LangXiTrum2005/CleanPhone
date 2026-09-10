package com.unity3d.ads.beta;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/beta/UnityAdsPrivacyFlag;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "USER_OVER_AGE_LIMIT", "NON_BEHAVIORAL", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum UnityAdsPrivacyFlag {
    USER_OVER_AGE_LIMIT(0),
    NON_BEHAVIORAL(1);

    private final int value;

    UnityAdsPrivacyFlag(int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }
}
