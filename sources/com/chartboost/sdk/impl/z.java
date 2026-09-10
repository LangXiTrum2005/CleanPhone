package com.chartboost.sdk.impl;

import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f15666A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f15667B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15670c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ea f15671e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f15673i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15674l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15675n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f15676p;
    public String q;
    public p1 r;
    public final Map s;
    public final cf t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f15677u;
    public final Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f15678w;
    public final String x;
    public final kb y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c4 f15679z;

    public z(String name, String adId, String baseUrl, String impressionId, ea infoIcon, String cgn, String creative, String mediaType, Map assets, String videoUrl, String videoFilename, String link, String deepLink, String to, int i2, String rewardCurrency, String template, p1 body, Map parameters, cf renderingEngine, List scripts, Map events, String adm, String templateParams, kb mtype, c4 clkp, String decodedAdm) {
        Intrinsics.f(name, "name");
        Intrinsics.f(adId, "adId");
        Intrinsics.f(baseUrl, "baseUrl");
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(infoIcon, "infoIcon");
        Intrinsics.f(cgn, "cgn");
        Intrinsics.f(creative, "creative");
        Intrinsics.f(mediaType, "mediaType");
        Intrinsics.f(assets, "assets");
        Intrinsics.f(videoUrl, "videoUrl");
        Intrinsics.f(videoFilename, "videoFilename");
        Intrinsics.f(link, "link");
        Intrinsics.f(deepLink, "deepLink");
        Intrinsics.f(to, "to");
        Intrinsics.f(rewardCurrency, "rewardCurrency");
        Intrinsics.f(template, "template");
        Intrinsics.f(body, "body");
        Intrinsics.f(parameters, "parameters");
        Intrinsics.f(renderingEngine, "renderingEngine");
        Intrinsics.f(scripts, "scripts");
        Intrinsics.f(events, "events");
        Intrinsics.f(adm, "adm");
        Intrinsics.f(templateParams, "templateParams");
        Intrinsics.f(mtype, "mtype");
        Intrinsics.f(clkp, "clkp");
        Intrinsics.f(decodedAdm, "decodedAdm");
        this.f15668a = name;
        this.f15669b = adId;
        this.f15670c = baseUrl;
        this.d = impressionId;
        this.f15671e = infoIcon;
        this.f = cgn;
        this.g = creative;
        this.f15672h = mediaType;
        this.f15673i = assets;
        this.j = videoUrl;
        this.k = videoFilename;
        this.f15674l = link;
        this.m = deepLink;
        this.f15675n = to;
        this.o = i2;
        this.f15676p = rewardCurrency;
        this.q = template;
        this.r = body;
        this.s = parameters;
        this.t = renderingEngine;
        this.f15677u = scripts;
        this.v = events;
        this.f15678w = adm;
        this.x = templateParams;
        this.y = mtype;
        this.f15679z = clkp;
        this.f15666A = decodedAdm;
        this.f15667B = videoUrl.length() > 0 && this.k.length() > 0;
    }

    public final String A() {
        return this.f15675n;
    }

    public final String B() {
        return this.k;
    }

    public final String C() {
        return this.j;
    }

    public final boolean D() {
        return this.f15667B;
    }

    public final Map E() {
        Map map = this.s;
        Map map2 = this.f15673i;
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            p1 p1Var = (p1) entry.getValue();
            arrayList.add(new Pair(str, android.support.v4.media.a.D(p1Var.f14797a, "/", p1Var.f14798b)));
        }
        return MapsKt.n(map, arrayList);
    }

    public final String a() {
        return this.f15669b;
    }

    public final String b() {
        if (this.f15666A.length() == 0) {
            return "";
        }
        return StringsKt.l(this.f15666A, "<VAST ", true) ? "Wrapper" : "Inline";
    }

    public final String c() {
        return this.f15678w;
    }

    public final Map d() {
        return this.f15673i;
    }

    public final String e() {
        return this.f15670c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.a(this.f15668a, zVar.f15668a) && Intrinsics.a(this.f15669b, zVar.f15669b) && Intrinsics.a(this.f15670c, zVar.f15670c) && Intrinsics.a(this.d, zVar.d) && Intrinsics.a(this.f15671e, zVar.f15671e) && Intrinsics.a(this.f, zVar.f) && Intrinsics.a(this.g, zVar.g) && Intrinsics.a(this.f15672h, zVar.f15672h) && Intrinsics.a(this.f15673i, zVar.f15673i) && Intrinsics.a(this.j, zVar.j) && Intrinsics.a(this.k, zVar.k) && Intrinsics.a(this.f15674l, zVar.f15674l) && Intrinsics.a(this.m, zVar.m) && Intrinsics.a(this.f15675n, zVar.f15675n) && this.o == zVar.o && Intrinsics.a(this.f15676p, zVar.f15676p) && Intrinsics.a(this.q, zVar.q) && Intrinsics.a(this.r, zVar.r) && Intrinsics.a(this.s, zVar.s) && this.t == zVar.t && Intrinsics.a(this.f15677u, zVar.f15677u) && Intrinsics.a(this.v, zVar.v) && Intrinsics.a(this.f15678w, zVar.f15678w) && Intrinsics.a(this.x, zVar.x) && this.y == zVar.y && this.f15679z == zVar.f15679z && Intrinsics.a(this.f15666A, zVar.f15666A);
    }

    public final p1 f() {
        return this.r;
    }

    public final String g() {
        return this.f;
    }

    public final c4 h() {
        return this.f15679z;
    }

    public int hashCode() {
        return this.f15666A.hashCode() + ((this.f15679z.hashCode() + ((this.y.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.x, androidx.datastore.preferences.protobuf.a.b(this.f15678w, (this.v.hashCode() + androidx.media3.extractor.text.ttml.a.c((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.q, androidx.datastore.preferences.protobuf.a.b(this.f15676p, androidx.media3.extractor.text.ttml.a.a(this.o, androidx.datastore.preferences.protobuf.a.b(this.f15675n, androidx.datastore.preferences.protobuf.a.b(this.m, androidx.datastore.preferences.protobuf.a.b(this.f15674l, androidx.datastore.preferences.protobuf.a.b(this.k, androidx.datastore.preferences.protobuf.a.b(this.j, (this.f15673i.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f15672h, androidx.datastore.preferences.protobuf.a.b(this.g, androidx.datastore.preferences.protobuf.a.b(this.f, (this.f15671e.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.d, androidx.datastore.preferences.protobuf.a.b(this.f15670c, androidx.datastore.preferences.protobuf.a.b(this.f15669b, this.f15668a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31, 31, this.f15677u)) * 31, 31), 31)) * 31)) * 31);
    }

    public final String i() {
        return this.g;
    }

    public final String j() {
        return this.f15666A;
    }

    public final String k() {
        return this.m;
    }

    public final Map l() {
        return this.v;
    }

    public final String m() {
        return this.d;
    }

    public final ea n() {
        return this.f15671e;
    }

    public final String o() {
        return this.f15674l;
    }

    public final String p() {
        return this.f15672h;
    }

    public final kb q() {
        return this.y;
    }

    public final String r() {
        return this.f15668a;
    }

    public final Map s() {
        return this.s;
    }

    public final String t() {
        JSONObject jSONObjectA = s2.a(new s2.a[0]);
        for (Map.Entry entry : E().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.c(jSONObjectA);
            t2.a(jSONObjectA, str, str2);
        }
        String string = jSONObjectA.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public String toString() {
        String str = this.f15668a;
        String str2 = this.f15669b;
        String str3 = this.f15670c;
        String str4 = this.d;
        ea eaVar = this.f15671e;
        String str5 = this.f;
        String str6 = this.g;
        String str7 = this.f15672h;
        Map map = this.f15673i;
        String str8 = this.j;
        String str9 = this.k;
        String str10 = this.f15674l;
        String str11 = this.m;
        String str12 = this.f15675n;
        int i2 = this.o;
        String str13 = this.f15676p;
        String str14 = this.q;
        p1 p1Var = this.r;
        Map map2 = this.s;
        cf cfVar = this.t;
        List list = this.f15677u;
        Map map3 = this.v;
        String str15 = this.f15678w;
        String str16 = this.x;
        kb kbVar = this.y;
        c4 c4Var = this.f15679z;
        String str17 = this.f15666A;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("AdUnit(name=", str, ", adId=", str2, ", baseUrl=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", impressionId=", str4, ", infoIcon=");
        sbQ.append(eaVar);
        sbQ.append(", cgn=");
        sbQ.append(str5);
        sbQ.append(", creative=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str6, ", mediaType=", str7, ", assets=");
        sbQ.append(map);
        sbQ.append(", videoUrl=");
        sbQ.append(str8);
        sbQ.append(", videoFilename=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str9, ", link=", str10, ", deepLink=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str11, ", to=", str12, ", rewardAmount=");
        sbQ.append(i2);
        sbQ.append(", rewardCurrency=");
        sbQ.append(str13);
        sbQ.append(", template=");
        sbQ.append(str14);
        sbQ.append(", body=");
        sbQ.append(p1Var);
        sbQ.append(", parameters=");
        sbQ.append(map2);
        sbQ.append(", renderingEngine=");
        sbQ.append(cfVar);
        sbQ.append(", scripts=");
        sbQ.append(list);
        sbQ.append(", events=");
        sbQ.append(map3);
        sbQ.append(", adm=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str15, ", templateParams=", str16, ", mtype=");
        sbQ.append(kbVar);
        sbQ.append(", clkp=");
        sbQ.append(c4Var);
        sbQ.append(", decodedAdm=");
        return android.support.v4.media.a.r(sbQ, str17, ")");
    }

    public final cf u() {
        return this.t;
    }

    public final int v() {
        return this.o;
    }

    public final String w() {
        return this.f15676p;
    }

    public final List x() {
        return this.f15677u;
    }

    public final String y() {
        return this.q;
    }

    public final String z() {
        return this.x;
    }

    public /* synthetic */ z(String str, String str2, String str3, String str4, ea eaVar, String str5, String str6, String str7, Map map, String str8, String str9, String str10, String str11, String str12, int i2, String str13, String str14, p1 p1Var, Map map2, cf cfVar, List list, Map map3, String str15, String str16, kb kbVar, c4 c4Var, String str17, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "https://live.chartboost.com" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? new ea(null, null, null, null, null, null, 63, null) : eaVar, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? new HashMap() : map, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? "" : str9, (i3 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? "" : str10, (i3 & 4096) != 0 ? "" : str11, (i3 & Segment.SIZE) != 0 ? "" : str12, (i3 & 16384) != 0 ? 0 : i2, (i3 & 32768) != 0 ? "" : str13, (i3 & 65536) != 0 ? "" : str14, (i3 & 131072) != 0 ? new p1("", "", "") : p1Var, (i3 & 262144) != 0 ? new HashMap() : map2, (i3 & 524288) != 0 ? cf.UNKNOWN : cfVar, (i3 & 1048576) != 0 ? EmptyList.X : list, (i3 & 2097152) != 0 ? new HashMap() : map3, (i3 & 4194304) != 0 ? "" : str15, (i3 & 8388608) != 0 ? "" : str16, (i3 & 16777216) != 0 ? kb.UNKNOWN : kbVar, (i3 & 33554432) != 0 ? c4.CLICK_PREFERENCE_EMBEDDED : c4Var, (i3 & 67108864) != 0 ? "" : str17);
    }
}
