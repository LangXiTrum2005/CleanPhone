package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9 extends AbstractC0649x0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f25859z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0363h0 f25860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f25861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C0631w0 f25862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final E9 f25863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f25864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f25865y;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C9 a(C0363h0 adProperties, Va va2, boolean z10) {
            List<C0679yc> listD;
            Ve veD;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            AbstractC0649x0.a aVar = AbstractC0649x0.f30976r;
            N3 n3C = (va2 == null || (veD = va2.d()) == null) ? null : veD.c();
            E9 e9D = n3C != null ? n3C.d() : null;
            if (e9D == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (va2 == null || (listD = va2.d(adProperties.e(), adProperties.c())) == null) {
                listD = xj.v.f53866a;
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(xj.p.W(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0679yc) it.next()).f());
            }
            C0462ma c0462maB = C0462ma.b();
            kotlin.jvm.internal.n.e(c0462maB, "getInstance()");
            return new C9(adProperties, z10, new C0631w0(strF, arrayList, c0462maB), e9D);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9(C0363h0 adProperties, boolean z10, C0631w0 adUnitCommonData, E9 configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C0462ma c0462maE = adUnitCommonData.e();
        C0561s2 c0561s2G = configs.g();
        kotlin.jvm.internal.n.e(c0561s2G, "configs.interstitialAuctionSettings");
        super(adProperties, z10, strF, listD, c0462maE, c0561s2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new O0(O0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        this.f25860t = adProperties;
        this.f25861u = z10;
        this.f25862v = adUnitCommonData;
        this.f25863w = configs;
        this.f25864x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f25865y = Wa.f27570c;
    }

    public final C0631w0 A() {
        return this.f25862v;
    }

    public final E9 B() {
        return this.f25863w;
    }

    public final C9 a(C0363h0 adProperties, boolean z10, C0631w0 adUnitCommonData, E9 configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new C9(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC0649x0
    public C0363h0 b() {
        return this.f25860t;
    }

    @Override // com.ironsource.AbstractC0649x0
    public String c() {
        return this.f25864x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9)) {
            return false;
        }
        C9 c10 = (C9) obj;
        return kotlin.jvm.internal.n.a(this.f25860t, c10.f25860t) && this.f25861u == c10.f25861u && kotlin.jvm.internal.n.a(this.f25862v, c10.f25862v) && kotlin.jvm.internal.n.a(this.f25863w, c10.f25863w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f25860t.hashCode() * 31;
        boolean z10 = this.f25861u;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return this.f25863w.hashCode() + ((this.f25862v.hashCode() + ((iHashCode + r2) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC0649x0
    public String j() {
        return this.f25865y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f25860t + ", isPublisherLoad=" + this.f25861u + ", adUnitCommonData=" + this.f25862v + ", configs=" + this.f25863w + ")";
    }

    @Override // com.ironsource.AbstractC0649x0
    public boolean u() {
        return this.f25861u;
    }

    public final C0363h0 w() {
        return this.f25860t;
    }

    public final boolean x() {
        return this.f25861u;
    }

    public final C0631w0 y() {
        return this.f25862v;
    }

    public final E9 z() {
        return this.f25863w;
    }

    public static /* synthetic */ C9 a(C9 c10, C0363h0 c0363h0, boolean z10, C0631w0 c0631w0, E9 e10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0363h0 = c10.f25860t;
        }
        if ((i10 & 2) != 0) {
            z10 = c10.f25861u;
        }
        if ((i10 & 4) != 0) {
            c0631w0 = c10.f25862v;
        }
        if ((i10 & 8) != 0) {
            e10 = c10.f25863w;
        }
        return c10.a(c0363h0, z10, c0631w0, e10);
    }

    @Override // com.ironsource.AbstractC0649x0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        kotlin.jvm.internal.n.e(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
