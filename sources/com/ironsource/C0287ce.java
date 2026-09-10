package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ce, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0287ce extends AbstractC0649x0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f28376z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0363h0 f28377t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f28378u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C0631w0 f28379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C0323ee f28380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f28381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f28382y;

    /* JADX INFO: renamed from: com.ironsource.ce$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C0287ce a(C0363h0 adProperties, Va va2, boolean z10) {
            List<C0679yc> listD;
            Ve veD;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            AbstractC0649x0.a aVar = AbstractC0649x0.f30976r;
            N3 n3C = (va2 == null || (veD = va2.d()) == null) ? null : veD.c();
            C0323ee c0323eeF = n3C != null ? n3C.f() : null;
            if (c0323eeF == null) {
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
            return new C0287ce(adProperties, z10, new C0631w0(strF, arrayList, c0462maB), c0323eeF);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0287ce(C0363h0 adProperties, boolean z10, C0631w0 adUnitCommonData, C0323ee configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C0462ma c0462maE = adUnitCommonData.e();
        C0561s2 c0561s2K = configs.k();
        kotlin.jvm.internal.n.e(c0561s2K, "configs.rewardedVideoAuctionSettings");
        super(adProperties, z10, strF, listD, c0462maE, c0561s2K, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new O0(O0.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        this.f28377t = adProperties;
        this.f28378u = z10;
        this.f28379v = adUnitCommonData;
        this.f28380w = configs;
        this.f28381x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f28382y = Wa.f27569b;
    }

    public final C0631w0 A() {
        return this.f28379v;
    }

    public final C0323ee B() {
        return this.f28380w;
    }

    public final C0287ce a(C0363h0 adProperties, boolean z10, C0631w0 adUnitCommonData, C0323ee configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new C0287ce(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC0649x0
    public C0363h0 b() {
        return this.f28377t;
    }

    @Override // com.ironsource.AbstractC0649x0
    public String c() {
        return this.f28381x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0287ce)) {
            return false;
        }
        C0287ce c0287ce = (C0287ce) obj;
        return kotlin.jvm.internal.n.a(this.f28377t, c0287ce.f28377t) && this.f28378u == c0287ce.f28378u && kotlin.jvm.internal.n.a(this.f28379v, c0287ce.f28379v) && kotlin.jvm.internal.n.a(this.f28380w, c0287ce.f28380w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f28377t.hashCode() * 31;
        boolean z10 = this.f28378u;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return this.f28380w.hashCode() + ((this.f28379v.hashCode() + ((iHashCode + r2) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC0649x0
    public String j() {
        return this.f28382y;
    }

    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f28377t + ", isPublisherLoad=" + this.f28378u + ", adUnitCommonData=" + this.f28379v + ", configs=" + this.f28380w + ")";
    }

    @Override // com.ironsource.AbstractC0649x0
    public boolean u() {
        return this.f28378u;
    }

    public final C0363h0 w() {
        return this.f28377t;
    }

    public final boolean x() {
        return this.f28378u;
    }

    public final C0631w0 y() {
        return this.f28379v;
    }

    public final C0323ee z() {
        return this.f28380w;
    }

    public static /* synthetic */ C0287ce a(C0287ce c0287ce, C0363h0 c0363h0, boolean z10, C0631w0 c0631w0, C0323ee c0323ee, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0363h0 = c0287ce.f28377t;
        }
        if ((i10 & 2) != 0) {
            z10 = c0287ce.f28378u;
        }
        if ((i10 & 4) != 0) {
            c0631w0 = c0287ce.f28379v;
        }
        if ((i10 & 8) != 0) {
            c0323ee = c0287ce.f28380w;
        }
        return c0287ce.a(c0363h0, z10, c0631w0, c0323ee);
    }

    @Override // com.ironsource.AbstractC0649x0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        kotlin.jvm.internal.n.e(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
