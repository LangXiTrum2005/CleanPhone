package ads_mobile_sdk;

import android.os.Bundle;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.licking;
import saneness.moveable;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static final List A0 = adultoid.kowloon("com.google.ads.mediation.customevent.CustomEventAdapter", "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    public final JsonObject A;
    public final JsonObject B;
    public final List C;
    public final boolean D;
    public final String E;
    public final d1 F;
    public final List G;
    public final wx0 H;
    public final String I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final List P;
    public final List Q;
    public final ay1 R;
    public final String S;
    public final List T;
    public final long U;
    public final List V;
    public final String W;
    public final JsonObject X;
    public final List Y;
    public final boolean Z;
    public final String a;
    public final boolean a0;
    public final List b;
    public final long b0;
    public final JsonObject c;
    public final String c0;
    public final String d;
    public final List d0;
    public final List e;
    public final String e0;
    public final String f;
    public final String f0;
    public final List g;
    public final List g0;
    public final String h;
    public final List h0;
    public final String i;
    public final scarbroite.attabal i0;
    public final String j;
    public final JsonObject j0;
    public final String k;
    public final String k0;
    public final q6 l;
    public final ck2 l0;
    public final k7 m;
    public final boolean m0;
    public final String n;
    public final g1 n0;
    public final boolean o;
    public final boolean o0;
    public final boolean p;
    public final boolean p0;
    public final Bundle q;
    public final String q0;
    public final String r;
    public final rt1 r0;
    public final boolean s;
    public final m22 s0;
    public final List t;
    public final ns1 t0;
    public final boolean u;
    public final double u0;
    public final List v;
    public final z52 v0;
    public final int w;
    public final boolean w0;
    public final String x;
    public final boolean x0;
    public final List y;
    public final long y0;
    public final String z;
    public final JsonObject z0;

    public h1(String activeViewJSON, ArrayList adapterClasses, JsonObject adapterData, String adapterResponseInfoKey, ArrayList adLoadUrls, String adNetworkClassName, ArrayList adSizes, String adSourceName, String adSourceId, String adSourceInstanceName, String adSourceInstanceId, q6 adType, k7 k7Var, String allocationId, boolean z, boolean z2, Bundle analyticsEventNameToParametersMap, String bidResponse, boolean z3, ArrayList cacheHitUrls, boolean z4, ArrayList clickUrls, int i, String str, ArrayList containerSizes, String debugDialog, JsonObject debugSignals, JsonObject extras, ArrayList fillUrls, boolean z5, String id, d1 impressionType, ArrayList impressionUrls, wx0 wx0Var, String integerRequestId, int i2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, ArrayList manualTrackingUrls, ArrayList noFillUrls, ay1 omidSettings, String str2, ArrayList presentationUrls, long j, ArrayList presentationErrorUrls, String qData, JsonObject recursiveRequestParameters, ArrayList renderers, boolean z11, boolean z12, long j2, String responseId, ArrayList rewardGrantedUrls, String rewardTransactionId, String rewardValidFromTimestamp, ArrayList rewardVideoCompleteUrls, ArrayList rewardVideoStartUrls, zg2 zg2Var, JsonObject rtbNativeRequiredAssets, String ruleLineExternalId, ck2 safeBrowsingConfig, boolean z13, g1 showableImpressionType, boolean z14, boolean z15, String watermark, rt1 rt1Var, m22 m22Var, ns1 ns1Var, double d, z52 preloadSortType, boolean z16, boolean z17, long j3, JsonObject responseInfoExtrasOverride) {
        Intrinsics.checkNotNullParameter(activeViewJSON, "activeViewJSON");
        Intrinsics.checkNotNullParameter(adapterClasses, "adapterClasses");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        Intrinsics.checkNotNullParameter(adapterResponseInfoKey, "adapterResponseInfoKey");
        Intrinsics.checkNotNullParameter(adLoadUrls, "adLoadUrls");
        Intrinsics.checkNotNullParameter(adNetworkClassName, "adNetworkClassName");
        Intrinsics.checkNotNullParameter(adSizes, "adSizes");
        Intrinsics.checkNotNullParameter(adSourceName, "adSourceName");
        Intrinsics.checkNotNullParameter(adSourceId, "adSourceId");
        Intrinsics.checkNotNullParameter(adSourceInstanceName, "adSourceInstanceName");
        Intrinsics.checkNotNullParameter(adSourceInstanceId, "adSourceInstanceId");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(allocationId, "allocationId");
        Intrinsics.checkNotNullParameter(analyticsEventNameToParametersMap, "analyticsEventNameToParametersMap");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(cacheHitUrls, "cacheHitUrls");
        Intrinsics.checkNotNullParameter(clickUrls, "clickUrls");
        Intrinsics.checkNotNullParameter(containerSizes, "containerSizes");
        Intrinsics.checkNotNullParameter(debugDialog, "debugDialog");
        Intrinsics.checkNotNullParameter(debugSignals, "debugSignals");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(fillUrls, "fillUrls");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        Intrinsics.checkNotNullParameter(impressionUrls, "impressionUrls");
        Intrinsics.checkNotNullParameter(integerRequestId, "integerRequestId");
        Intrinsics.checkNotNullParameter(manualTrackingUrls, "manualTrackingUrls");
        Intrinsics.checkNotNullParameter(noFillUrls, "noFillUrls");
        Intrinsics.checkNotNullParameter(omidSettings, "omidSettings");
        Intrinsics.checkNotNullParameter(presentationUrls, "presentationUrls");
        Intrinsics.checkNotNullParameter(presentationErrorUrls, "presentationErrorUrls");
        Intrinsics.checkNotNullParameter(qData, "qData");
        Intrinsics.checkNotNullParameter(recursiveRequestParameters, "recursiveRequestParameters");
        Intrinsics.checkNotNullParameter(renderers, "renderers");
        Intrinsics.checkNotNullParameter(responseId, "responseId");
        Intrinsics.checkNotNullParameter(rewardGrantedUrls, "rewardGrantedUrls");
        Intrinsics.checkNotNullParameter(rewardTransactionId, "rewardTransactionId");
        Intrinsics.checkNotNullParameter(rewardValidFromTimestamp, "rewardValidFromTimestamp");
        Intrinsics.checkNotNullParameter(rewardVideoCompleteUrls, "rewardVideoCompleteUrls");
        Intrinsics.checkNotNullParameter(rewardVideoStartUrls, "rewardVideoStartUrls");
        Intrinsics.checkNotNullParameter(rtbNativeRequiredAssets, "rtbNativeRequiredAssets");
        Intrinsics.checkNotNullParameter(ruleLineExternalId, "ruleLineExternalId");
        Intrinsics.checkNotNullParameter(safeBrowsingConfig, "safeBrowsingConfig");
        Intrinsics.checkNotNullParameter(showableImpressionType, "showableImpressionType");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(preloadSortType, "preloadSortType");
        Intrinsics.checkNotNullParameter(responseInfoExtrasOverride, "responseInfoExtrasOverride");
        this.a = activeViewJSON;
        this.b = adapterClasses;
        this.c = adapterData;
        this.d = adapterResponseInfoKey;
        this.e = adLoadUrls;
        this.f = adNetworkClassName;
        this.g = adSizes;
        this.h = adSourceName;
        this.i = adSourceId;
        this.j = adSourceInstanceName;
        this.k = adSourceInstanceId;
        this.l = adType;
        this.m = k7Var;
        this.n = allocationId;
        this.o = z;
        this.p = z2;
        this.q = analyticsEventNameToParametersMap;
        this.r = bidResponse;
        this.s = z3;
        this.t = cacheHitUrls;
        this.u = z4;
        this.v = clickUrls;
        this.w = i;
        this.x = str;
        this.y = containerSizes;
        this.z = debugDialog;
        this.A = debugSignals;
        this.B = extras;
        this.C = fillUrls;
        this.D = z5;
        this.E = id;
        this.F = impressionType;
        this.G = impressionUrls;
        this.H = wx0Var;
        this.I = integerRequestId;
        this.J = i2;
        this.K = z6;
        this.L = z7;
        this.M = z8;
        this.N = z9;
        this.O = z10;
        this.P = manualTrackingUrls;
        this.Q = noFillUrls;
        this.R = omidSettings;
        this.S = str2;
        this.T = presentationUrls;
        this.U = j;
        this.V = presentationErrorUrls;
        this.W = qData;
        this.X = recursiveRequestParameters;
        this.Y = renderers;
        this.Z = z11;
        this.a0 = z12;
        this.b0 = j2;
        this.c0 = responseId;
        this.d0 = rewardGrantedUrls;
        this.e0 = rewardTransactionId;
        this.f0 = rewardValidFromTimestamp;
        this.g0 = rewardVideoCompleteUrls;
        this.h0 = rewardVideoStartUrls;
        this.i0 = zg2Var;
        this.j0 = rtbNativeRequiredAssets;
        this.k0 = ruleLineExternalId;
        this.l0 = safeBrowsingConfig;
        this.m0 = z13;
        this.n0 = showableImpressionType;
        this.o0 = z14;
        this.p0 = z15;
        this.q0 = watermark;
        this.r0 = rt1Var;
        this.s0 = m22Var;
        this.t0 = ns1Var;
        this.u0 = d;
        this.v0 = preloadSortType;
        this.w0 = z16;
        this.x0 = z17;
        this.y0 = j3;
        this.z0 = responseInfoExtrasOverride;
    }

    public final long a() {
        return this.b0;
    }

    public final boolean b() {
        return this.r0 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.wireman(this.a, h1Var.a) && Intrinsics.wireman(this.b, h1Var.b) && Intrinsics.wireman(this.c, h1Var.c) && Intrinsics.wireman(this.d, h1Var.d) && Intrinsics.wireman(this.e, h1Var.e) && Intrinsics.wireman(this.f, h1Var.f) && Intrinsics.wireman(this.g, h1Var.g) && Intrinsics.wireman(this.h, h1Var.h) && Intrinsics.wireman(this.i, h1Var.i) && Intrinsics.wireman(this.j, h1Var.j) && Intrinsics.wireman(this.k, h1Var.k) && this.l == h1Var.l && Intrinsics.wireman(this.m, h1Var.m) && Intrinsics.wireman(this.n, h1Var.n) && this.o == h1Var.o && this.p == h1Var.p && Intrinsics.wireman(this.q, h1Var.q) && Intrinsics.wireman(this.r, h1Var.r) && this.s == h1Var.s && Intrinsics.wireman(this.t, h1Var.t) && this.u == h1Var.u && Intrinsics.wireman(this.v, h1Var.v) && this.w == h1Var.w && Intrinsics.wireman(this.x, h1Var.x) && Intrinsics.wireman(this.y, h1Var.y) && Intrinsics.wireman(this.z, h1Var.z) && Intrinsics.wireman(this.A, h1Var.A) && Intrinsics.wireman(this.B, h1Var.B) && Intrinsics.wireman(this.C, h1Var.C) && this.D == h1Var.D && Intrinsics.wireman(this.E, h1Var.E) && this.F == h1Var.F && Intrinsics.wireman(this.G, h1Var.G) && Intrinsics.wireman(this.H, h1Var.H) && Intrinsics.wireman(this.I, h1Var.I) && this.J == h1Var.J && this.K == h1Var.K && this.L == h1Var.L && this.M == h1Var.M && this.N == h1Var.N && this.O == h1Var.O && Intrinsics.wireman(this.P, h1Var.P) && Intrinsics.wireman(this.Q, h1Var.Q) && Intrinsics.wireman(this.R, h1Var.R) && Intrinsics.wireman(this.S, h1Var.S) && Intrinsics.wireman(this.T, h1Var.T) && p002kotlin.time.saneness.kowloon(this.U, h1Var.U) && Intrinsics.wireman(this.V, h1Var.V) && Intrinsics.wireman(this.W, h1Var.W) && Intrinsics.wireman(this.X, h1Var.X) && Intrinsics.wireman(this.Y, h1Var.Y) && this.Z == h1Var.Z && this.a0 == h1Var.a0 && p002kotlin.time.saneness.kowloon(this.b0, h1Var.b0) && Intrinsics.wireman(this.c0, h1Var.c0) && Intrinsics.wireman(this.d0, h1Var.d0) && Intrinsics.wireman(this.e0, h1Var.e0) && Intrinsics.wireman(this.f0, h1Var.f0) && Intrinsics.wireman(this.g0, h1Var.g0) && Intrinsics.wireman(this.h0, h1Var.h0) && Intrinsics.wireman(this.i0, h1Var.i0) && Intrinsics.wireman(this.j0, h1Var.j0) && Intrinsics.wireman(this.k0, h1Var.k0) && Intrinsics.wireman(this.l0, h1Var.l0) && this.m0 == h1Var.m0 && this.n0 == h1Var.n0 && this.o0 == h1Var.o0 && this.p0 == h1Var.p0 && Intrinsics.wireman(this.q0, h1Var.q0) && Intrinsics.wireman(this.r0, h1Var.r0) && Intrinsics.wireman(this.s0, h1Var.s0) && Intrinsics.wireman(this.t0, h1Var.t0) && Double.compare(this.u0, h1Var.u0) == 0 && this.v0 == h1Var.v0 && this.w0 == h1Var.w0 && this.x0 == h1Var.x0 && p002kotlin.time.saneness.kowloon(this.y0, h1Var.y0) && Intrinsics.wireman(this.z0, h1Var.z0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v109, types: [int] */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v55, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57, types: [int] */
    /* JADX WARN: Type inference failed for: r0v71, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87, types: [int] */
    /* JADX WARN: Type inference failed for: r0v92, types: [int] */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    /* JADX WARN: Type inference failed for: r2v104, types: [int] */
    /* JADX WARN: Type inference failed for: r2v107, types: [int] */
    /* JADX WARN: Type inference failed for: r2v109, types: [int] */
    /* JADX WARN: Type inference failed for: r2v123, types: [int] */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v133 */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r2v136 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v139 */
    /* JADX WARN: Type inference failed for: r2v140 */
    /* JADX WARN: Type inference failed for: r2v141 */
    /* JADX WARN: Type inference failed for: r2v142 */
    /* JADX WARN: Type inference failed for: r2v144 */
    /* JADX WARN: Type inference failed for: r2v146 */
    /* JADX WARN: Type inference failed for: r2v147 */
    /* JADX WARN: Type inference failed for: r2v148 */
    /* JADX WARN: Type inference failed for: r2v149 */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v151 */
    /* JADX WARN: Type inference failed for: r2v152 */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARN: Type inference failed for: r2v154 */
    /* JADX WARN: Type inference failed for: r2v155 */
    /* JADX WARN: Type inference failed for: r2v156 */
    /* JADX WARN: Type inference failed for: r2v157 */
    /* JADX WARN: Type inference failed for: r2v158 */
    /* JADX WARN: Type inference failed for: r2v159 */
    /* JADX WARN: Type inference failed for: r2v160 */
    /* JADX WARN: Type inference failed for: r2v161 */
    /* JADX WARN: Type inference failed for: r2v162 */
    /* JADX WARN: Type inference failed for: r2v163 */
    /* JADX WARN: Type inference failed for: r2v164 */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v56, types: [int] */
    /* JADX WARN: Type inference failed for: r2v58, types: [int] */
    /* JADX WARN: Type inference failed for: r2v60, types: [int] */
    /* JADX WARN: Type inference failed for: r2v62, types: [int] */
    /* JADX WARN: Type inference failed for: r2v64, types: [int] */
    /* JADX WARN: Type inference failed for: r2v82, types: [int] */
    /* JADX WARN: Type inference failed for: r2v84, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final int hashCode() {
        int iHashCode = (this.l.hashCode() + licking.attabal(this.k, licking.attabal(this.j, licking.attabal(this.i, licking.attabal(this.h, moveable.attabal(this.g, licking.attabal(this.f, moveable.attabal(this.e, licking.attabal(this.d, (this.c.hashCode() + moveable.attabal(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31;
        k7 k7Var = this.m;
        int iAttabal = licking.attabal(this.n, (iHashCode + (k7Var == null ? 0 : k7Var.hashCode())) * 31, 31);
        boolean z = this.o;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iAttabal + r2) * 31;
        boolean z2 = this.p;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iAttabal2 = licking.attabal(this.r, (this.q.hashCode() + ((i + r3) * 31)) * 31, 31);
        boolean z3 = this.s;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int iAttabal3 = moveable.attabal(this.t, (iAttabal2 + r4) * 31, 31);
        boolean z4 = this.u;
        ?? r5 = z4;
        if (z4) {
            r5 = 1;
        }
        int iAttabal4 = bonny.attabal(this.w, moveable.attabal(this.v, (iAttabal3 + r5) * 31, 31), 31);
        String str = this.x;
        int iAttabal5 = moveable.attabal(this.C, (this.B.hashCode() + ((this.A.hashCode() + licking.attabal(this.z, moveable.attabal(this.y, (iAttabal4 + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31)) * 31, 31);
        boolean z5 = this.D;
        ?? r6 = z5;
        if (z5) {
            r6 = 1;
        }
        int iAttabal6 = moveable.attabal(this.G, (this.F.hashCode() + licking.attabal(this.E, (iAttabal5 + r6) * 31, 31)) * 31, 31);
        wx0 wx0Var = this.H;
        int iAttabal7 = bonny.attabal(this.J, licking.attabal(this.I, (iAttabal6 + (wx0Var == null ? 0 : wx0Var.hashCode())) * 31, 31), 31);
        boolean z6 = this.K;
        ?? r7 = z6;
        if (z6) {
            r7 = 1;
        }
        int i2 = (iAttabal7 + r7) * 31;
        boolean z7 = this.L;
        ?? r8 = z7;
        if (z7) {
            r8 = 1;
        }
        int i3 = (i2 + r8) * 31;
        boolean z8 = this.M;
        ?? r9 = z8;
        if (z8) {
            r9 = 1;
        }
        int i4 = (i3 + r9) * 31;
        boolean z9 = this.N;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i5 = (i4 + r10) * 31;
        boolean z10 = this.O;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iHashCode2 = (this.R.hashCode() + moveable.attabal(this.Q, moveable.attabal(this.P, (i5 + r11) * 31, 31), 31)) * 31;
        String str2 = this.S;
        int iAttabal8 = moveable.attabal(this.Y, (this.X.hashCode() + licking.attabal(this.W, moveable.attabal(this.V, (p002kotlin.time.saneness.trm(this.U) + moveable.attabal(this.T, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31, 31), 31)) * 31, 31);
        boolean z11 = this.Z;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i6 = (iAttabal8 + r12) * 31;
        boolean z12 = this.a0;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int iAttabal9 = moveable.attabal(this.h0, moveable.attabal(this.g0, licking.attabal(this.f0, licking.attabal(this.e0, moveable.attabal(this.d0, licking.attabal(this.c0, (p002kotlin.time.saneness.trm(this.b0) + ((i6 + r13) * 31)) * 31, 31), 31), 31), 31), 31), 31);
        scarbroite.attabal attabalVar = this.i0;
        int iHashCode3 = (this.l0.hashCode() + licking.attabal(this.k0, (this.j0.hashCode() + ((iAttabal9 + (attabalVar == null ? 0 : attabalVar.hashCode())) * 31)) * 31, 31)) * 31;
        boolean z13 = this.m0;
        ?? r0 = z13;
        if (z13) {
            r0 = 1;
        }
        int iHashCode4 = (this.n0.hashCode() + ((iHashCode3 + r0) * 31)) * 31;
        boolean z14 = this.o0;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i7 = (iHashCode4 + r14) * 31;
        boolean z15 = this.p0;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int iAttabal10 = licking.attabal(this.q0, (i7 + r15) * 31, 31);
        rt1 rt1Var = this.r0;
        int iHashCode5 = (iAttabal10 + (rt1Var == null ? 0 : rt1Var.hashCode())) * 31;
        m22 m22Var = this.s0;
        int iHashCode6 = (iHashCode5 + (m22Var == null ? 0 : m22Var.hashCode())) * 31;
        ns1 ns1Var = this.t0;
        int iHashCode7 = (this.v0.hashCode() + ((Double.hashCode(this.u0) + ((iHashCode6 + (ns1Var != null ? ns1Var.a.hashCode() : 0)) * 31)) * 31)) * 31;
        boolean z16 = this.w0;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i8 = (iHashCode7 + r16) * 31;
        boolean z17 = this.x0;
        return this.z0.hashCode() + ((p002kotlin.time.saneness.trm(this.y0) + ((i8 + (z17 ? 1 : z17)) * 31)) * 31);
    }

    public final String toString() {
        return "AdConfiguration(activeViewJSON=" + this.a + ", adapterClasses=" + this.b + ", adapterData=" + this.c + ", adapterResponseInfoKey=" + this.d + ", adLoadUrls=" + this.e + ", adNetworkClassName=" + this.f + ", adSizes=" + this.g + ", adSourceName=" + this.h + ", adSourceId=" + this.i + ", adSourceInstanceName=" + this.j + ", adSourceInstanceId=" + this.k + ", adType=" + this.l + ", adValueParcel=" + this.m + ", allocationId=" + this.n + ", allowPubOwnedAdView=" + this.o + ", allowPubRenderedAttribution=" + this.p + ", analyticsEventNameToParametersMap=" + this.q + ", bidResponse=" + this.r + ", bufferClickUrlAsReadyToPing=" + this.s + ", cacheHitUrls=" + this.t + ", checkNativeRequiredAssetViewability=" + this.u + ", clickUrls=" + this.v + ", configIndex=" + this.w + ", contentUrl=" + this.x + ", containerSizes=" + this.y + ", debugDialog=" + this.z + ", debugSignals=" + this.A + ", extras=" + this.B + ", fillUrls=" + this.C + ", forceSoftwareRenderingAdWebview=" + this.D + ", id=" + this.E + ", impressionType=" + this.F + ", impressionUrls=" + this.G + ", inlineAd=" + this.H + ", integerRequestId=" + this.I + ", interstitialOrientation=" + this.J + ", isClosableAreaDisabled=" + this.K + ", isCollapsible=" + this.L + ", isCustomCloseBlocked=" + this.M + ", isOmidEnabled=" + this.N + ", isScrollAware=" + this.O + ", manualTrackingUrls=" + this.P + ", noFillUrls=" + this.Q + ", omidSettings=" + this.R + ", parallelExclusionKey=" + this.S + ", presentationUrls=" + this.T + ", presentationErrorTimeout=" + p002kotlin.time.saneness.starveling(this.U) + ", presentationErrorUrls=" + this.V + ", qData=" + this.W + ", recursiveRequestParameters=" + this.X + ", renderers=" + this.Y + ", renderSerially=" + this.Z + ", renderTestAdLabel=" + this.a0 + ", renderTimeout=" + p002kotlin.time.saneness.starveling(this.b0) + ", responseId=" + this.c0 + ", rewardGrantedUrls=" + this.d0 + ", rewardTransactionId=" + this.e0 + ", rewardValidFromTimestamp=" + this.f0 + ", rewardVideoCompleteUrls=" + this.g0 + ", rewardVideoStartUrls=" + this.h0 + ", rewardItem=" + this.i0 + ", rtbNativeRequiredAssets=" + this.j0 + ", ruleLineExternalId=" + this.k0 + ", safeBrowsingConfig=" + this.l0 + ", scionLoggingEnabled=" + this.m0 + ", showableImpressionType=" + this.n0 + ", testModeEnabled=" + this.o0 + ", useThirdPartyContainerHeight=" + this.p0 + ", watermark=" + this.q0 + ", offlineAdConfig=" + this.r0 + ", playPrewarmOptions=" + this.s0 + ", networkPingConfig=" + this.t0 + ", preloadSortValue=" + this.u0 + ", preloadSortType=" + this.v0 + ", isMultiAd=" + this.w0 + ", shouldFetchAdValueFromImpression=" + this.x0 + ", postClickLifecycleMonitoringDuration=" + p002kotlin.time.saneness.starveling(this.y0) + ", responseInfoExtrasOverride=" + this.z0 + ")";
    }

    public /* synthetic */ h1(String str, ArrayList arrayList, JsonObject jsonObject, String str2, ArrayList arrayList2, String str3, ArrayList arrayList3, String str4, String str5, String str6, String str7, q6 q6Var, k7 k7Var, String str8, boolean z, boolean z2, Bundle bundle, String str9, boolean z3, ArrayList arrayList4, boolean z4, ArrayList arrayList5, int i, String str10, ArrayList arrayList6, String str11, JsonObject jsonObject2, JsonObject jsonObject3, ArrayList arrayList7, boolean z5, String str12, d1 d1Var, ArrayList arrayList8, wx0 wx0Var, String str13, int i2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, ArrayList arrayList9, ArrayList arrayList10, ay1 ay1Var, String str14, ArrayList arrayList11, long j, ArrayList arrayList12, String str15, JsonObject jsonObject4, ArrayList arrayList13, boolean z11, boolean z12, long j2, String str16, ArrayList arrayList14, String str17, String str18, ArrayList arrayList15, ArrayList arrayList16, zg2 zg2Var, JsonObject jsonObject5, String str19, ck2 ck2Var, boolean z13, g1 g1Var, boolean z14, boolean z15, String str20, rt1 rt1Var, m22 m22Var, ns1 ns1Var, double d, z52 z52Var, boolean z16, boolean z17, long j3, JsonObject jsonObject6, int i3) {
        this(str, arrayList, jsonObject, str2, arrayList2, str3, arrayList3, str4, str5, str6, str7, q6Var, k7Var, str8, z, z2, bundle, str9, z3, arrayList4, z4, arrayList5, i, str10, arrayList6, str11, jsonObject2, jsonObject3, arrayList7, z5, str12, d1Var, arrayList8, wx0Var, str13, i2, z6, z7, z8, z9, z10, arrayList9, arrayList10, ay1Var, str14, arrayList11, j, arrayList12, str15, jsonObject4, arrayList13, z11, z12, j2, str16, arrayList14, str17, str18, arrayList15, arrayList16, zg2Var, jsonObject5, str19, ck2Var, z13, g1Var, z14, z15, str20, rt1Var, m22Var, ns1Var, d, z52Var, z16, z17, j3, jsonObject6);
    }
}
