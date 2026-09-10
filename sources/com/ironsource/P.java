package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Date;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f26798f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f26799g = "0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f26800h = "0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f26801i = "0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f26802j = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K9 f26803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private S7 f26804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0488o0 f26806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f26807e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public P(K9 adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        this.f26803a = adInstance;
        this.f26804b = S7.UnknownProvider;
        this.f26805c = "0";
        this.f26806d = EnumC0488o0.LOAD_REQUEST;
        this.f26807e = new Date().getTime() / 1000.0d;
    }

    public final K9 a() {
        return this.f26803a;
    }

    public final IronSource.a b() {
        if (this.f26803a.i()) {
            return IronSource.a.BANNER;
        }
        return this.f26803a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    public final String c() {
        String strE = this.f26803a.e();
        kotlin.jvm.internal.n.e(strE, "adInstance.id");
        return strE;
    }

    public final K9 d() {
        return this.f26803a;
    }

    public final S7 e() {
        return this.f26804b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return kotlin.jvm.internal.n.a(c(), p10.c()) && kotlin.jvm.internal.n.a(g(), p10.g()) && b() == p10.b() && kotlin.jvm.internal.n.a(i(), p10.i()) && this.f26804b == p10.f26804b && kotlin.jvm.internal.n.a(this.f26805c, p10.f26805c) && this.f26806d == p10.f26806d;
    }

    public final EnumC0488o0 f() {
        return this.f26806d;
    }

    public final String g() {
        String strC = this.f26803a.c();
        return strC == null ? "0" : strC;
    }

    public final String h() {
        return this.f26805c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f26804b, this.f26805c, this.f26806d, Double.valueOf(this.f26807e));
    }

    public final String i() {
        String strG = this.f26803a.g();
        kotlin.jvm.internal.n.e(strG, "adInstance.name");
        return strG;
    }

    public final double j() {
        return this.f26807e;
    }

    public String toString() {
        String string = new JSONObject().put(com.ironsource.sdk.controller.f.b.f30388c, c()).put("advertiserBundleId", this.f26805c).put("adProvider", this.f26804b.ordinal()).put("adStatus", this.f26806d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f26807e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        kotlin.jvm.internal.n.e(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    public final P a(K9 adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        return new P(adInstance);
    }

    public static /* synthetic */ P a(P p10, K9 k10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k10 = p10.f26803a;
        }
        return p10.a(k10);
    }

    public final void a(S7 s10) {
        kotlin.jvm.internal.n.f(s10, "<set-?>");
        this.f26804b = s10;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f26805c = str;
    }

    public final void a(EnumC0488o0 enumC0488o0) {
        kotlin.jvm.internal.n.f(enumC0488o0, "<set-?>");
        this.f26806d = enumC0488o0;
    }

    public final void a(double d10) {
        this.f26807e = d10;
    }
}
