package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class M2 extends AbstractC0649x0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f26533z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final J2 f26534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f26535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C0631w0 f26536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final U2 f26537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f26538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f26539y;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M2 a(J2 adProperties, Va va2, boolean z10) {
            List<C0679yc> listD;
            Ve veD;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            AbstractC0649x0.a aVar = AbstractC0649x0.f30976r;
            N3 n3C = (va2 == null || (veD = va2.d()) == null) ? null : veD.c();
            U2 u2C = n3C != null ? n3C.c() : null;
            if (u2C == null) {
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
            return new M2(adProperties, z10, new C0631w0(strF, arrayList, c0462maB), u2C);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M2(J2 adProperties, boolean z10, C0631w0 adUnitCommonData, U2 configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C0462ma c0462maE = adUnitCommonData.e();
        C0561s2 c0561s2D = configs.d();
        kotlin.jvm.internal.n.e(c0561s2D, "configs.bannerAuctionSettings");
        super(adProperties, z10, strF, listD, c0462maE, c0561s2D, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, new O0(O0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * ((long) configs.h())), configs.e(), configs.l(), configs.n(), configs.m(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        this.f26534t = adProperties;
        this.f26535u = z10;
        this.f26536v = adUnitCommonData;
        this.f26537w = configs;
        this.f26538x = "BN";
        this.f26539y = Wa.f27571d;
    }

    @Override // com.ironsource.AbstractC0649x0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public J2 b() {
        return this.f26534t;
    }

    public final C0631w0 B() {
        return this.f26536v;
    }

    public final U2 C() {
        return this.f26537w;
    }

    public final M2 a(J2 adProperties, boolean z10, C0631w0 adUnitCommonData, U2 configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new M2(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC0649x0
    public String c() {
        return this.f26538x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m7 = (M2) obj;
        return kotlin.jvm.internal.n.a(this.f26534t, m7.f26534t) && this.f26535u == m7.f26535u && kotlin.jvm.internal.n.a(this.f26536v, m7.f26536v) && kotlin.jvm.internal.n.a(this.f26537w, m7.f26537w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f26534t.hashCode() * 31;
        boolean z10 = this.f26535u;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return this.f26537w.hashCode() + ((this.f26536v.hashCode() + ((iHashCode + r2) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC0649x0
    public String j() {
        return this.f26539y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f26534t + ", isPublisherLoad=" + this.f26535u + ", adUnitCommonData=" + this.f26536v + ", configs=" + this.f26537w + ")";
    }

    @Override // com.ironsource.AbstractC0649x0
    public boolean u() {
        return this.f26535u;
    }

    public final J2 w() {
        return this.f26534t;
    }

    public final boolean x() {
        return this.f26535u;
    }

    public final C0631w0 y() {
        return this.f26536v;
    }

    public final U2 z() {
        return this.f26537w;
    }

    public static /* synthetic */ M2 a(M2 m7, J2 j10, boolean z10, C0631w0 c0631w0, U2 u6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = m7.f26534t;
        }
        if ((i10 & 2) != 0) {
            z10 = m7.f26535u;
        }
        if ((i10 & 4) != 0) {
            c0631w0 = m7.f26536v;
        }
        if ((i10 & 8) != 0) {
            u6 = m7.f26537w;
        }
        return m7.a(j10, z10, c0631w0, u6);
    }

    @Override // com.ironsource.AbstractC0649x0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        kotlin.jvm.internal.n.e(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC0649x0
    public AdData a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), new C0452m0().b(b().i())));
        kotlin.jvm.internal.n.e(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
