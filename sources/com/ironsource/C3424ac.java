package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3424ac extends AbstractC3816x0 {
    public static final a y = new a(null);
    private final C3538h0 t;
    private final C3799w0 u;
    private final Lb v;
    private final String w;
    private final String x;

    /* JADX INFO: renamed from: com.ironsource.ac$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3424ac a(C3538h0 adProperties, Sa sa) {
            List<C3760tc> listFormularize;
            Ie ieD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC3816x0.a aVar = AbstractC3816x0.r;
            N3 n3C = (sa == null || (ieD = sa.d()) == null) ? null : ieD.c();
            Lb lbE = n3C != null ? n3C.e() : null;
            if (lbE == null) {
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
            return new C3424ac(adProperties, new C3799w0(strF, arrayList, c3583jaB), lbE);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3424ac(C3538h0 adProperties, C3799w0 adUnitCommonData, Lb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / ((long) 1000)), configs.a(), configs.f(), -1, new O0(O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.t = adProperties;
        this.u = adUnitCommonData;
        this.v = configs;
        this.w = "NA";
        this.x = Ta.e;
    }

    public final Lb A() {
        return this.v;
    }

    public final C3424ac a(C3538h0 adProperties, C3799w0 adUnitCommonData, Lb configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C3424ac(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3816x0
    public C3538h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC3816x0
    public String c() {
        return this.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3424ac)) {
            return false;
        }
        C3424ac c3424ac = (C3424ac) obj;
        return Intrinsics.wireman(this.t, c3424ac.t) && Intrinsics.wireman(this.u, c3424ac.u) && Intrinsics.wireman(this.v, c3424ac.v);
    }

    public int hashCode() {
        return (((this.t.hashCode() * 31) + this.u.hashCode()) * 31) + this.v.hashCode();
    }

    @Override // com.ironsource.AbstractC3816x0
    public String j() {
        return this.x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    public final C3538h0 w() {
        return this.t;
    }

    public final C3799w0 x() {
        return this.u;
    }

    public final Lb y() {
        return this.v;
    }

    public final C3799w0 z() {
        return this.u;
    }

    public static /* synthetic */ C3424ac a(C3424ac c3424ac, C3538h0 c3538h0, C3799w0 c3799w0, Lb lb, int i, Object obj) {
        if ((i & 1) != 0) {
            c3538h0 = c3424ac.t;
        }
        if ((i & 2) != 0) {
            c3799w0 = c3424ac.u;
        }
        if ((i & 4) != 0) {
            lb = c3424ac.v;
        }
        return c3424ac.a(c3538h0, c3799w0, lb);
    }

    @Override // com.ironsource.AbstractC3816x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
