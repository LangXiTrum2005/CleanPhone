package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.n;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class BannerAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38437b;

    public BannerAdInfo(String instanceId, String adId) {
        n.f(instanceId, "instanceId");
        n.f(adId, "adId");
        this.f38436a = instanceId;
        this.f38437b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerAdInfo.f38436a;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerAdInfo.f38437b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f38436a;
    }

    public final String component2() {
        return this.f38437b;
    }

    public final BannerAdInfo copy(String instanceId, String adId) {
        n.f(instanceId, "instanceId");
        n.f(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return n.a(this.f38436a, bannerAdInfo.f38436a) && n.a(this.f38437b, bannerAdInfo.f38437b);
    }

    public final String getAdId() {
        return this.f38437b;
    }

    public final String getInstanceId() {
        return this.f38436a;
    }

    public int hashCode() {
        return this.f38437b.hashCode() + (this.f38436a.hashCode() * 31);
    }

    public String toString() {
        return d.h("[instanceId: '", this.f38436a, "', adId: '", this.f38437b, "']");
    }
}
