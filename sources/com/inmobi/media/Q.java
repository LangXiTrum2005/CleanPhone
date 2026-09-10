package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.WatermarkData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23089c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23090e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC2925a0 f23092i;
    public final String j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f23093l;
    public final WatermarkData m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdQualityControl f23094n;
    public final byte o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f23095p;
    public final String q;
    public final boolean r;
    public final String s;
    public final C3053hc t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC3333z5 f23096u;
    public final long v;

    public Q(String str, boolean z2, long j, boolean z3, String str2, String str3, String str4, String str5, InterfaceC2925a0 interfaceC2925a0, String str6, Map map, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b2, Set set, String str7, boolean z4, String landingScheme, C3053hc c3053hc, InterfaceC3333z5 interfaceC3333z5, long j2) {
        Intrinsics.f(landingScheme, "landingScheme");
        this.f23087a = str;
        this.f23088b = z2;
        this.f23089c = j;
        this.d = z3;
        this.f23090e = str2;
        this.f = str3;
        this.g = str4;
        this.f23091h = str5;
        this.f23092i = interfaceC2925a0;
        this.j = str6;
        this.k = map;
        this.f23093l = bool;
        this.m = watermarkData;
        this.f23094n = adQualityControl;
        this.o = b2;
        this.f23095p = set;
        this.q = str7;
        this.r = z4;
        this.s = landingScheme;
        this.t = c3053hc;
        this.f23096u = interfaceC3333z5;
        this.v = j2;
    }

    public static Q a(Q q, C3053hc c3053hc, int i2) {
        String str = q.f23087a;
        boolean z2 = q.f23088b;
        long j = q.f23089c;
        boolean z3 = q.d;
        String str2 = q.f23090e;
        String str3 = q.f;
        String str4 = q.g;
        String str5 = q.f23091h;
        String str6 = q.j;
        Map map = q.k;
        Boolean bool = q.f23093l;
        WatermarkData watermarkData = (i2 & 4096) != 0 ? q.m : null;
        AdQualityControl adQualityControl = q.f23094n;
        byte b2 = q.o;
        Set set = q.f23095p;
        String str7 = q.q;
        boolean z4 = q.r;
        String landingScheme = q.s;
        C3053hc c3053hc2 = (i2 & 524288) != 0 ? q.t : c3053hc;
        InterfaceC3333z5 interfaceC3333z5 = q.f23096u;
        long j2 = q.v;
        Intrinsics.f(landingScheme, "landingScheme");
        return new Q(str, z2, j, z3, str2, str3, str4, str5, null, str6, map, bool, watermarkData, adQualityControl, b2, set, str7, z4, landingScheme, c3053hc2, interfaceC3333z5, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q = (Q) obj;
        return Intrinsics.a(this.f23087a, q.f23087a) && this.f23088b == q.f23088b && this.f23089c == q.f23089c && this.d == q.d && Intrinsics.a(this.f23090e, q.f23090e) && Intrinsics.a(this.f, q.f) && Intrinsics.a(this.g, q.g) && Intrinsics.a(this.f23091h, q.f23091h) && Intrinsics.a(this.f23092i, q.f23092i) && Intrinsics.a(this.j, q.j) && Intrinsics.a(this.k, q.k) && Intrinsics.a(this.f23093l, q.f23093l) && Intrinsics.a(this.m, q.m) && Intrinsics.a(this.f23094n, q.f23094n) && this.o == q.o && Intrinsics.a(this.f23095p, q.f23095p) && Intrinsics.a(this.q, q.q) && this.r == q.r && Intrinsics.a(this.s, q.s) && Intrinsics.a(this.t, q.t) && Intrinsics.a(this.f23096u, q.f23096u) && this.v == q.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final int hashCode() {
        String str = this.f23087a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z2 = this.f23088b;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iB = androidx.media3.extractor.text.ttml.a.b((iHashCode + r3) * 31, 31, this.f23089c);
        boolean z3 = this.d;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int i2 = (iB + r4) * 31;
        String str2 = this.f23090e;
        int iHashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23091h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InterfaceC2925a0 interfaceC2925a0 = this.f23092i;
        int iHashCode6 = (iHashCode5 + (interfaceC2925a0 == null ? 0 : interfaceC2925a0.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map map = this.k;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.f23093l;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        WatermarkData watermarkData = this.m;
        int iHashCode10 = (iHashCode9 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.f23094n;
        int iHashCode11 = (Byte.hashCode(this.o) + ((iHashCode10 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31;
        Set set = this.f23095p;
        int iHashCode12 = (iHashCode11 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.q;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z4 = this.r;
        int iB2 = androidx.datastore.preferences.protobuf.a.b(this.s, (iHashCode13 + (z4 ? 1 : z4)) * 31, 31);
        C3053hc c3053hc = this.t;
        int iHashCode14 = (iB2 + (c3053hc == null ? 0 : c3053hc.hashCode())) * 31;
        InterfaceC3333z5 interfaceC3333z5 = this.f23096u;
        return Long.hashCode(this.v) + ((iHashCode14 + (interfaceC3333z5 != null ? interfaceC3333z5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdMetaData(adType=");
        sb.append(this.f23087a);
        sb.append(", isImmersiveMode=");
        sb.append(this.f23088b);
        sb.append(", placementId=");
        sb.append(this.f23089c);
        sb.append(", allowAutoRedirection=");
        sb.append(this.d);
        sb.append(", creativeId=");
        sb.append(this.f23090e);
        sb.append(", creativeType=");
        sb.append(this.f);
        sb.append(", markupTypeAdUnit=");
        sb.append(this.g);
        sb.append(", adSize=");
        sb.append(this.f23091h);
        sb.append(", adPodHandler=");
        sb.append(this.f23092i);
        sb.append(", contentURL=");
        sb.append(this.j);
        sb.append(", telemetryManagerMap=");
        sb.append(this.k);
        sb.append(", isHardwareAccelerationDisabled=");
        sb.append(this.f23093l);
        sb.append(", watermarkData=");
        sb.append(this.m);
        sb.append(", adQualityControl=");
        sb.append(this.f23094n);
        sb.append(", placementType=");
        sb.append((int) this.o);
        sb.append(", viewabilityTrackers=");
        sb.append(this.f23095p);
        sb.append(", impressionId=");
        sb.append(this.q);
        sb.append(", isInAppBrowser=");
        sb.append(this.r);
        sb.append(", landingScheme=");
        sb.append(this.s);
        sb.append(", renderViewMetaData=");
        sb.append(this.t);
        sb.append(", logger=");
        sb.append(this.f23096u);
        sb.append(", viewTouchTimestamp=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.v, ')');
    }

    public /* synthetic */ Q(String str, boolean z2, long j, boolean z3, String str2, String str3, String str4, String str5, S0 s0, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b2, Set set, String str7, String str8, C3053hc c3053hc, InterfaceC3333z5 interfaceC3333z5, int i2) {
        this(str, z2, j, z3, str2, (i2 & 32) != 0 ? null : str3, str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : s0, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : linkedHashMap, bool, (i2 & 4096) != 0 ? null : watermarkData, adQualityControl, b2, set, str7, false, (262144 & i2) != 0 ? "DEFAULT" : str8, (i2 & 524288) != 0 ? null : c3053hc, interfaceC3333z5, -1L);
    }
}
