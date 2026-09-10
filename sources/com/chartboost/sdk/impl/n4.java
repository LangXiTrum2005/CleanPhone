package com.chartboost.sdk.impl;

import com.applovin.shadow.okio.Segment;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f14526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f14527c;
    public final Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f14528e;
    public final Integer f;
    public final Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14530i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14531l;
    public final List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f14532n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f14533p;
    public final String q;
    public final List r;
    public final ji s;

    public n4(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List staticResources, List iFrameResources, List htmlResources, List trackingEvents, String str7, List companionClickTracking, ji jiVar) {
        Intrinsics.f(staticResources, "staticResources");
        Intrinsics.f(iFrameResources, "iFrameResources");
        Intrinsics.f(htmlResources, "htmlResources");
        Intrinsics.f(trackingEvents, "trackingEvents");
        Intrinsics.f(companionClickTracking, "companionClickTracking");
        this.f14525a = str;
        this.f14526b = num;
        this.f14527c = num2;
        this.d = num3;
        this.f14528e = num4;
        this.f = num5;
        this.g = num6;
        this.f14529h = str2;
        this.f14530i = str3;
        this.j = str4;
        this.k = str5;
        this.f14531l = str6;
        this.m = staticResources;
        this.f14532n = iFrameResources;
        this.o = htmlResources;
        this.f14533p = trackingEvents;
        this.q = str7;
        this.r = companionClickTracking;
        this.s = jiVar;
    }

    public final n4 a(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List staticResources, List iFrameResources, List htmlResources, List trackingEvents, String str7, List companionClickTracking, ji jiVar) {
        Intrinsics.f(staticResources, "staticResources");
        Intrinsics.f(iFrameResources, "iFrameResources");
        Intrinsics.f(htmlResources, "htmlResources");
        Intrinsics.f(trackingEvents, "trackingEvents");
        Intrinsics.f(companionClickTracking, "companionClickTracking");
        return new n4(str, num, num2, num3, num4, num5, num6, str2, str3, str4, str5, str6, staticResources, iFrameResources, htmlResources, trackingEvents, str7, companionClickTracking, jiVar);
    }

    public final String b() {
        return this.q;
    }

    public final List c() {
        return this.r;
    }

    public final Integer d() {
        return this.f14527c;
    }

    public final List e() {
        return this.o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return Intrinsics.a(this.f14525a, n4Var.f14525a) && Intrinsics.a(this.f14526b, n4Var.f14526b) && Intrinsics.a(this.f14527c, n4Var.f14527c) && Intrinsics.a(this.d, n4Var.d) && Intrinsics.a(this.f14528e, n4Var.f14528e) && Intrinsics.a(this.f, n4Var.f) && Intrinsics.a(this.g, n4Var.g) && Intrinsics.a(this.f14529h, n4Var.f14529h) && Intrinsics.a(this.f14530i, n4Var.f14530i) && Intrinsics.a(this.j, n4Var.j) && Intrinsics.a(this.k, n4Var.k) && Intrinsics.a(this.f14531l, n4Var.f14531l) && Intrinsics.a(this.m, n4Var.m) && Intrinsics.a(this.f14532n, n4Var.f14532n) && Intrinsics.a(this.o, n4Var.o) && Intrinsics.a(this.f14533p, n4Var.f14533p) && Intrinsics.a(this.q, n4Var.q) && Intrinsics.a(this.r, n4Var.r) && Intrinsics.a(this.s, n4Var.s);
    }

    public final List f() {
        return this.f14532n;
    }

    public final List g() {
        return this.m;
    }

    public final List h() {
        return this.f14533p;
    }

    public int hashCode() {
        String str = this.f14525a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f14526b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14527c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f14528e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.f14529h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14530i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14531l;
        int iC = androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c((iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.m), 31, this.f14532n), 31, this.o), 31, this.f14533p);
        String str7 = this.q;
        int iC2 = androidx.media3.extractor.text.ttml.a.c((iC + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.r);
        ji jiVar = this.s;
        return iC2 + (jiVar != null ? jiVar.hashCode() : 0);
    }

    public final Integer i() {
        return this.f14526b;
    }

    public String toString() {
        String str = this.f14525a;
        Integer num = this.f14526b;
        Integer num2 = this.f14527c;
        Integer num3 = this.d;
        Integer num4 = this.f14528e;
        Integer num5 = this.f;
        Integer num6 = this.g;
        String str2 = this.f14529h;
        String str3 = this.f14530i;
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.f14531l;
        List list = this.m;
        List list2 = this.f14532n;
        List list3 = this.o;
        List list4 = this.f14533p;
        String str7 = this.q;
        List list5 = this.r;
        ji jiVar = this.s;
        StringBuilder sb = new StringBuilder("CompanionAd(id=");
        sb.append(str);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", assetWidth=");
        sb.append(num3);
        sb.append(", assetHeight=");
        sb.append(num4);
        sb.append(", expandedWidth=");
        sb.append(num5);
        sb.append(", expandedHeight=");
        sb.append(num6);
        sb.append(", apiFramework=");
        sb.append(str2);
        sb.append(", adSlotID=");
        androidx.media3.extractor.text.ttml.a.C(sb, str3, ", pxratio=", str4, ", altText=");
        androidx.media3.extractor.text.ttml.a.C(sb, str5, ", adParameters=", str6, ", staticResources=");
        sb.append(list);
        sb.append(", iFrameResources=");
        sb.append(list2);
        sb.append(", htmlResources=");
        sb.append(list3);
        sb.append(", trackingEvents=");
        sb.append(list4);
        sb.append(", companionClickThrough=");
        sb.append(str7);
        sb.append(", companionClickTracking=");
        sb.append(list5);
        sb.append(", bestResource=");
        sb.append(jiVar);
        sb.append(")");
        return sb.toString();
    }

    public static /* synthetic */ n4 a(n4 n4Var, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, List list5, ji jiVar, int i2, Object obj) {
        ji jiVar2;
        List list6;
        String str8 = (i2 & 1) != 0 ? n4Var.f14525a : str;
        Integer num7 = (i2 & 2) != 0 ? n4Var.f14526b : num;
        Integer num8 = (i2 & 4) != 0 ? n4Var.f14527c : num2;
        Integer num9 = (i2 & 8) != 0 ? n4Var.d : num3;
        Integer num10 = (i2 & 16) != 0 ? n4Var.f14528e : num4;
        Integer num11 = (i2 & 32) != 0 ? n4Var.f : num5;
        Integer num12 = (i2 & 64) != 0 ? n4Var.g : num6;
        String str9 = (i2 & 128) != 0 ? n4Var.f14529h : str2;
        String str10 = (i2 & 256) != 0 ? n4Var.f14530i : str3;
        String str11 = (i2 & 512) != 0 ? n4Var.j : str4;
        String str12 = (i2 & 1024) != 0 ? n4Var.k : str5;
        String str13 = (i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? n4Var.f14531l : str6;
        List list7 = (i2 & 4096) != 0 ? n4Var.m : list;
        List list8 = (i2 & Segment.SIZE) != 0 ? n4Var.f14532n : list2;
        String str14 = str8;
        List list9 = (i2 & 16384) != 0 ? n4Var.o : list3;
        List list10 = (i2 & 32768) != 0 ? n4Var.f14533p : list4;
        String str15 = (i2 & 65536) != 0 ? n4Var.q : str7;
        List list11 = (i2 & 131072) != 0 ? n4Var.r : list5;
        if ((i2 & 262144) != 0) {
            list6 = list11;
            jiVar2 = n4Var.s;
        } else {
            jiVar2 = jiVar;
            list6 = list11;
        }
        return n4Var.a(str14, num7, num8, num9, num10, num11, num12, str9, str10, str11, str12, str13, list7, list8, list9, list10, str15, list6, jiVar2);
    }

    public final ji a() {
        return this.s;
    }

    public /* synthetic */ n4(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, List list5, ji jiVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : num4, (i2 & 32) != 0 ? null : num5, (i2 & 64) != 0 ? null : num6, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : str5, (i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : str6, list, list2, list3, list4, str7, (131072 & i2) != 0 ? EmptyList.X : list5, (i2 & 262144) != 0 ? null : jiVar);
    }
}
