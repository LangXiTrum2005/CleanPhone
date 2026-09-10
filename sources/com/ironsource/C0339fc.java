package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.fc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0339fc extends AbstractC0649x0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f28669y = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0363h0 f28670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C0631w0 f28671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Qb f28672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f28673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f28674x;

    /* JADX INFO: renamed from: com.ironsource.fc$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C0339fc a(C0363h0 adProperties, Va va2) {
            List<C0679yc> listD;
            Ve veD;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            AbstractC0649x0.a aVar = AbstractC0649x0.f30976r;
            N3 n3C = (va2 == null || (veD = va2.d()) == null) ? null : veD.c();
            Qb qbE = n3C != null ? n3C.e() : null;
            if (qbE == null) {
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
            return new C0339fc(adProperties, new C0631w0(strF, arrayList, c0462maB), qbE);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339fc(C0363h0 adProperties, C0631w0 adUnitCommonData, Qb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / ((long) 1000)), configs.a(), configs.f(), -1, new O0(O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        this.f28670t = adProperties;
        this.f28671u = adUnitCommonData;
        this.f28672v = configs;
        this.f28673w = "NA";
        this.f28674x = Wa.f27572e;
    }

    public final Qb A() {
        return this.f28672v;
    }

    public final C0339fc a(C0363h0 adProperties, C0631w0 adUnitCommonData, Qb configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new C0339fc(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC0649x0
    public C0363h0 b() {
        return this.f28670t;
    }

    @Override // com.ironsource.AbstractC0649x0
    public String c() {
        return this.f28673w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0339fc)) {
            return false;
        }
        C0339fc c0339fc = (C0339fc) obj;
        return kotlin.jvm.internal.n.a(this.f28670t, c0339fc.f28670t) && kotlin.jvm.internal.n.a(this.f28671u, c0339fc.f28671u) && kotlin.jvm.internal.n.a(this.f28672v, c0339fc.f28672v);
    }

    public int hashCode() {
        return this.f28672v.hashCode() + ((this.f28671u.hashCode() + (this.f28670t.hashCode() * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC0649x0
    public String j() {
        return this.f28674x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f28670t + ", adUnitCommonData=" + this.f28671u + ", configs=" + this.f28672v + ")";
    }

    public final C0363h0 w() {
        return this.f28670t;
    }

    public final C0631w0 x() {
        return this.f28671u;
    }

    public final Qb y() {
        return this.f28672v;
    }

    public final C0631w0 z() {
        return this.f28671u;
    }

    public static /* synthetic */ C0339fc a(C0339fc c0339fc, C0363h0 c0363h0, C0631w0 c0631w0, Qb qb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0363h0 = c0339fc.f28670t;
        }
        if ((i10 & 2) != 0) {
            c0631w0 = c0339fc.f28671u;
        }
        if ((i10 & 4) != 0) {
            qb2 = c0339fc.f28672v;
        }
        return c0339fc.a(c0363h0, c0631w0, qb2);
    }

    @Override // com.ironsource.AbstractC0649x0
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.n.e(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
