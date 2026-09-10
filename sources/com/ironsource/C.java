package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0649x0 f25756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkSettings f25757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0472n2 f25758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0310e1 f25759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0526q2 f25760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f25762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final J f25763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IronSource.a f25764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final JSONObject f25765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f25766k;
    private final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f25767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C0526q2 f25768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f25769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f25770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f25771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AdData f25772r;

    public C(AbstractC0649x0 adUnitData, NetworkSettings providerSettings, C0472n2 auctionData, C0310e1 adapterConfig, C0526q2 auctionResponseItem, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(auctionResponseItem, "auctionResponseItem");
        this.f25756a = adUnitData;
        this.f25757b = providerSettings;
        this.f25758c = auctionData;
        this.f25759d = adapterConfig;
        this.f25760e = auctionResponseItem;
        this.f25761f = i10;
        this.f25762g = z10;
        this.f25763h = new J(C0541r0.a.DidntAttemptToLoad);
        IronSource.a aVarA = adUnitData.b().a();
        this.f25764i = aVarA;
        this.f25765j = auctionData.h();
        this.f25766k = auctionData.g();
        this.l = auctionData.i();
        this.f25767m = auctionData.f();
        this.f25768n = auctionData.j();
        String strF = adapterConfig.f();
        kotlin.jvm.internal.n.e(strF, "adapterConfig.providerName");
        this.f25769o = strF;
        this.f25770p = String.format("%s %s", Arrays.copyOf(new Object[]{strF, Integer.valueOf(hashCode())}, 2));
        this.f25771q = adapterConfig.d();
        String strK = this.f25760e.k();
        Map<String, Object> mapA = C0391ia.a(this.f25760e.a());
        kotlin.jvm.internal.n.e(mapA, "jsonObjectToMap(auctionResponseItem.adData)");
        mapA.put("adUnit", aVarA);
        HashMap map = new HashMap();
        Map<String, Object> mapA2 = C0391ia.a(adapterConfig.c());
        kotlin.jvm.internal.n.e(mapA2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapA2);
        mapA.put("userId", adUnitData.r());
        mapA.put("adUnitId", adUnitData.b().c());
        mapA.put("isMultipleAdUnits", Boolean.TRUE);
        this.f25772r = new AdData(strK, map, mapA);
    }

    public final AbstractC0649x0 a() {
        return this.f25756a;
    }

    public final NetworkSettings b() {
        return this.f25757b;
    }

    public final C0472n2 c() {
        return this.f25758c;
    }

    public final C0310e1 d() {
        return this.f25759d;
    }

    public final C0526q2 e() {
        return this.f25760e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c4 = (C) obj;
        return kotlin.jvm.internal.n.a(this.f25756a, c4.f25756a) && kotlin.jvm.internal.n.a(this.f25757b, c4.f25757b) && kotlin.jvm.internal.n.a(this.f25758c, c4.f25758c) && kotlin.jvm.internal.n.a(this.f25759d, c4.f25759d) && kotlin.jvm.internal.n.a(this.f25760e, c4.f25760e) && this.f25761f == c4.f25761f && this.f25762g == c4.f25762g;
    }

    public final int f() {
        return this.f25761f;
    }

    public final boolean g() {
        return this.f25762g;
    }

    public final AdData h() {
        return this.f25772r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iF = wi.d.f(this.f25761f, (this.f25760e.hashCode() + ((this.f25759d.hashCode() + ((this.f25758c.hashCode() + ((this.f25757b.hashCode() + (this.f25756a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
        boolean z10 = this.f25762g;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return iF + r3;
    }

    public final IronSource.a i() {
        return this.f25764i;
    }

    public final AbstractC0649x0 j() {
        return this.f25756a;
    }

    public final C0310e1 k() {
        return this.f25759d;
    }

    public final C0472n2 l() {
        return this.f25758c;
    }

    public final String m() {
        return this.f25767m;
    }

    public final String n() {
        return this.f25766k;
    }

    public final C0526q2 o() {
        return this.f25760e;
    }

    public final int p() {
        return this.l;
    }

    public final C0526q2 q() {
        return this.f25768n;
    }

    public final JSONObject r() {
        return this.f25765j;
    }

    public final String s() {
        return this.f25769o;
    }

    public final int t() {
        return this.f25771q;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f25756a + ", providerSettings=" + this.f25757b + ", auctionData=" + this.f25758c + ", adapterConfig=" + this.f25759d + ", auctionResponseItem=" + this.f25760e + ", sessionDepth=" + this.f25761f + ", isPreloaded=" + this.f25762g + ")";
    }

    public final J u() {
        return this.f25763h;
    }

    public final NetworkSettings v() {
        return this.f25757b;
    }

    public final int w() {
        return this.f25761f;
    }

    public final String x() {
        return this.f25770p;
    }

    public final boolean y() {
        return this.f25762g;
    }

    public final C a(AbstractC0649x0 adUnitData, NetworkSettings providerSettings, C0472n2 auctionData, C0310e1 adapterConfig, C0526q2 auctionResponseItem, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(auctionResponseItem, "auctionResponseItem");
        return new C(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i10, z10);
    }

    public static /* synthetic */ C a(C c4, AbstractC0649x0 abstractC0649x0, NetworkSettings networkSettings, C0472n2 c0472n2, C0310e1 c0310e1, C0526q2 c0526q2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC0649x0 = c4.f25756a;
        }
        if ((i11 & 2) != 0) {
            networkSettings = c4.f25757b;
        }
        if ((i11 & 4) != 0) {
            c0472n2 = c4.f25758c;
        }
        if ((i11 & 8) != 0) {
            c0310e1 = c4.f25759d;
        }
        if ((i11 & 16) != 0) {
            c0526q2 = c4.f25760e;
        }
        if ((i11 & 32) != 0) {
            i10 = c4.f25761f;
        }
        if ((i11 & 64) != 0) {
            z10 = c4.f25762g;
        }
        int i12 = i10;
        boolean z11 = z10;
        C0526q2 c0526q3 = c0526q2;
        C0472n2 c0472n3 = c0472n2;
        return c4.a(abstractC0649x0, networkSettings, c0472n3, c0310e1, c0526q3, i12, z11);
    }

    public final void a(C0526q2 c0526q2) {
        kotlin.jvm.internal.n.f(c0526q2, "<set-?>");
        this.f25760e = c0526q2;
    }

    public final void a(C0541r0.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        this.f25763h.b(performance);
    }

    public /* synthetic */ C(AbstractC0649x0 abstractC0649x0, NetworkSettings networkSettings, C0472n2 c0472n2, C0310e1 c0310e1, C0526q2 c0526q2, int i10, boolean z10, int i11, kotlin.jvm.internal.g gVar) {
        this(abstractC0649x0, networkSettings, c0472n2, c0310e1, c0526q2, i10, (i11 & 64) != 0 ? false : z10);
    }
}
