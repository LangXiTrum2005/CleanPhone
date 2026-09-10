package com.p004ironsource;

import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.IronSource;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b0\u00101J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\n\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\n\u0010\u001aR\"\u0010!\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\n\u0010 R\"\u0010'\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\n\u0010&R\u0011\u0010(\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R\u0011\u0010*\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010-\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010,R\u0011\u0010/\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/ironsource/n0;", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "", "hashCode", "", "toString", "Lcom/ironsource/zj;", "a", d9.h.p0, "Lcom/ironsource/zj;", "d", "()Lcom/ironsource/zj;", "Lcom/ironsource/qg;", "b", "Lcom/ironsource/qg;", "e", "()Lcom/ironsource/qg;", "(Lcom/ironsource/qg;)V", "adProvider", "c", "Ljava/lang/String;", h.f36614b, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "advertiserBundleId", "Lcom/ironsource/l1;", "Lcom/ironsource/l1;", f.j, "()Lcom/ironsource/l1;", "(Lcom/ironsource/l1;)V", "adStatus", "", "D", "j", "()D", "(D)V", "lastStatusUpdateTimeStamp", com.ironsource.sdk.controller.f.b.AD_ID, g.f40227p, "adUnitId", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", i.f37957c, "instanceId", "<init>", "(Lcom/ironsource/zj;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class C3373n0 {
    public static final String g = "0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f26211h = "0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f26212i = "0";
    public static final String j = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zj adInstance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private qg adProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String advertiserBundleId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private l1 adStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double lastStatusUpdateTimeStamp;

    public C3373n0(zj adInstance) {
        Intrinsics.f(adInstance, "adInstance");
        this.adInstance = adInstance;
        this.adProvider = qg.UnknownProvider;
        this.advertiserBundleId = "0";
        this.adStatus = l1.LOAD_REQUEST;
        this.lastStatusUpdateTimeStamp = Z.f() / 1000.0d;
    }

    public static /* synthetic */ C3373n0 a(C3373n0 c3373n0, zj zjVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            zjVar = c3373n0.adInstance;
        }
        return c3373n0.a(zjVar);
    }

    public final IronSource.AD_UNIT b() {
        if (this.adInstance.i()) {
            return IronSource.AD_UNIT.BANNER;
        }
        return this.adInstance.n() ? IronSource.AD_UNIT.REWARDED_VIDEO : IronSource.AD_UNIT.INTERSTITIAL;
    }

    public final String c() {
        String strE = this.adInstance.e();
        Intrinsics.e(strE, "adInstance.id");
        return strE;
    }

    public final zj d() {
        return this.adInstance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final qg getAdProvider() {
        return this.adProvider;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3373n0)) {
            return false;
        }
        C3373n0 c3373n0 = (C3373n0) other;
        return Intrinsics.a(c(), c3373n0.c()) && Intrinsics.a(g(), c3373n0.g()) && b() == c3373n0.b() && Intrinsics.a(i(), c3373n0.i()) && this.adProvider == c3373n0.adProvider && Intrinsics.a(this.advertiserBundleId, c3373n0.advertiserBundleId) && this.adStatus == c3373n0.adStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l1 getAdStatus() {
        return this.adStatus;
    }

    public final String g() {
        String strC = this.adInstance.c();
        return strC == null ? "0" : strC;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getAdvertiserBundleId() {
        return this.advertiserBundleId;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.adProvider, this.advertiserBundleId, this.adStatus, Double.valueOf(this.lastStatusUpdateTimeStamp));
    }

    public final String i() {
        String strG = this.adInstance.g();
        Intrinsics.e(strG, "adInstance.name");
        return strG;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getLastStatusUpdateTimeStamp() {
        return this.lastStatusUpdateTimeStamp;
    }

    public String toString() {
        String string = new JSONObject().put(com.ironsource.sdk.controller.f.b.AD_ID, c()).put("advertiserBundleId", this.advertiserBundleId).put("adProvider", this.adProvider.ordinal()).put("adStatus", this.adStatus.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.lastStatusUpdateTimeStamp).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        Intrinsics.e(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    public final C3373n0 a(zj adInstance) {
        Intrinsics.f(adInstance, "adInstance");
        return new C3373n0(adInstance);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final zj getAdInstance() {
        return this.adInstance;
    }

    public final void a(double d) {
        this.lastStatusUpdateTimeStamp = d;
    }

    public final void a(l1 l1Var) {
        Intrinsics.f(l1Var, "<set-?>");
        this.adStatus = l1Var;
    }

    public final void a(qg qgVar) {
        Intrinsics.f(qgVar, "<set-?>");
        this.adProvider = qgVar;
    }

    public final void a(String str) {
        Intrinsics.f(str, "<set-?>");
        this.advertiserBundleId = str;
    }
}
