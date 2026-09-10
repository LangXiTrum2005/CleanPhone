package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class W8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27549c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27550d = "auctionId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27551e = "adUnit";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f27552f = "adFormat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f27553g = "mediationAdUnitName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f27554h = "mediationAdUnitId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f27555i = "country";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f27556j = "ab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f27557k = "segmentName";
    public static final String l = "placement";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f27558m = "adNetwork";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f27559n = "instanceName";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f27560o = "instanceId";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f27561p = "revenue";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f27562q = "precision";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f27563r = "encryptedCPM";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f27564s = "creativeId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlayAdInfo f27565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DecimalFormat f27566b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public W8(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f27565a = adInfo;
        this.f27566b = new DecimalFormat("#.#####");
    }

    public final String a() {
        return this.f27565a.getAb();
    }

    public final String b() {
        return this.f27565a.getAdFormat();
    }

    public final String c() {
        return this.f27565a.getAdNetwork();
    }

    public final JSONObject d() {
        return this.f27565a.impressionData$mediationsdk_release();
    }

    public final String e() {
        return this.f27565a.getAuctionId();
    }

    public final String f() {
        return this.f27565a.getCountry();
    }

    public final String g() {
        return this.f27565a.getCreativeId();
    }

    public final String h() {
        return this.f27565a.getEncryptedCPM();
    }

    public final String i() {
        return this.f27565a.getInstanceId();
    }

    public final String j() {
        return this.f27565a.getInstanceName();
    }

    public final String k() {
        return this.f27565a.getAdUnitId();
    }

    public final String l() {
        return this.f27565a.getAdUnitName();
    }

    public final String m() {
        return this.f27565a.getPlacementName();
    }

    public final String n() {
        return this.f27565a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.f27565a.getImpressionRevenue$mediationsdk_release();
    }

    public final String p() {
        return this.f27565a.getSegmentName();
    }

    public String toString() {
        String strE = e();
        String strL = l();
        String strK = k();
        String strB = b();
        String strF = f();
        String strA = a();
        String strP = p();
        String strM = m();
        String strC = c();
        String strJ = j();
        String strI = i();
        o();
        String str = this.f27566b.format(o());
        String strN = n();
        String strH = h();
        String strG = g();
        StringBuilder sbV = defpackage.e.v("auctionId: '", strE, "', mediationAdUnitName: '", strL, "', mediationAdUnitId: '");
        d5.u.r(sbV, strK, "', adFormat: '", strB, "', country: '");
        d5.u.r(sbV, strF, "', ab: '", strA, "', segmentName: '");
        d5.u.r(sbV, strP, "', placement: '", strM, "', adNetwork: '");
        d5.u.r(sbV, strC, "', instanceName: '", strJ, "', instanceId: '");
        d5.u.r(sbV, strI, "', revenue: ", str, ", precision: '");
        d5.u.r(sbV, strN, "', encryptedCPM: '", strH, "', creativeId: '");
        return defpackage.e.q(strG, "'", sbV);
    }
}
