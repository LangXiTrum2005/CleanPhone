package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.n;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class InterstitialAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38469b;

    public InterstitialAdInfo(String instanceId, String adId) {
        n.f(instanceId, "instanceId");
        n.f(adId, "adId");
        this.f38468a = instanceId;
        this.f38469b = adId;
    }

    public final String getAdId() {
        return this.f38469b;
    }

    public final String getInstanceId() {
        return this.f38468a;
    }

    public String toString() {
        return d.h("[instanceId: '", this.f38468a, "', adId: '", this.f38469b, "']");
    }
}
