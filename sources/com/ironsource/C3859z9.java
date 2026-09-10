package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3859z9 extends AbstractC3816x0 {
    public static final a z = new a(null);
    private final C3538h0 t;
    private final boolean u;
    private final C3799w0 v;
    private final B9 w;
    private final String x;
    private final String y;

    /* JADX INFO: renamed from: com.ironsource.z9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3859z9 a(C3538h0 adProperties, Sa sa, boolean z) {
            List<C3760tc> listFormularize;
            Ie ieD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC3816x0.a aVar = AbstractC3816x0.r;
            N3 n3C = (sa == null || (ieD = sa.d()) == null) ? null : ieD.c();
            B9 b9D = n3C != null ? n3C.d() : null;
            if (b9D == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (sa == null || (listFormularize = sa.d(adProperties.e(), adProperties.c())) == null) {
                listFormularize = p002kotlin.collections.adultoid.formularize();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listFormularize, 10));
            Iterator<T> it = listFormularize.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3760tc) it.next()).f());
            }
            C3583ja c3583jaB = C3583ja.b();
            Intrinsics.checkNotNullExpressionValue(c3583jaB, "getInstance()");
            return new C3859z9(adProperties, z, new C3799w0(strF, arrayList, c3583jaB), b9D);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3859z9(C3538h0 adProperties, boolean z2, C3799w0 adUnitCommonData, B9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C3583ja c3583jaE = adUnitCommonData.e();
        C3733s2 c3733s2G = configs.g();
        Intrinsics.checkNotNullExpressionValue(c3733s2G, "configs.interstitialAuctionSettings");
        super(adProperties, z2, strF, listD, c3583jaE, c3733s2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new O0(O0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = Ta.c;
    }

    public final C3799w0 A() {
        return this.v;
    }

    public final B9 B() {
        return this.w;
    }

    public final C3859z9 a(C3538h0 adProperties, boolean z2, C3799w0 adUnitCommonData, B9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C3859z9(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3816x0
    public C3538h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC3816x0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3859z9)) {
            return false;
        }
        C3859z9 c3859z9 = (C3859z9) obj;
        return Intrinsics.wireman(this.t, c3859z9.t) && this.u == c3859z9.u && Intrinsics.wireman(this.v, c3859z9.v) && Intrinsics.wireman(this.w, c3859z9.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.v.hashCode()) * 31) + this.w.hashCode();
    }

    @Override // com.ironsource.AbstractC3816x0
    public String j() {
        return this.y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC3816x0
    public boolean u() {
        return this.u;
    }

    public final C3538h0 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C3799w0 y() {
        return this.v;
    }

    public final B9 z() {
        return this.w;
    }

    public static /* synthetic */ C3859z9 a(C3859z9 c3859z9, C3538h0 c3538h0, boolean z2, C3799w0 c3799w0, B9 b9, int i, Object obj) {
        if ((i & 1) != 0) {
            c3538h0 = c3859z9.t;
        }
        if ((i & 2) != 0) {
            z2 = c3859z9.u;
        }
        if ((i & 4) != 0) {
            c3799w0 = c3859z9.v;
        }
        if ((i & 8) != 0) {
            b9 = c3859z9.w;
        }
        return c3859z9.a(c3538h0, z2, c3799w0, b9);
    }

    @Override // com.ironsource.AbstractC3816x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
