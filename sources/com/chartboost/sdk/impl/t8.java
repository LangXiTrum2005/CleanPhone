package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f15187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f15188c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15189e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15191i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f15192l;
    public final List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f15193n;
    public final v8 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f15194p;

    public t8(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List staticResources, List iFrameResources, List htmlResources, v8 v8Var, List iconViewTracking) {
        Intrinsics.f(staticResources, "staticResources");
        Intrinsics.f(iFrameResources, "iFrameResources");
        Intrinsics.f(htmlResources, "htmlResources");
        Intrinsics.f(iconViewTracking, "iconViewTracking");
        this.f15186a = str;
        this.f15187b = num;
        this.f15188c = num2;
        this.d = str2;
        this.f15189e = str3;
        this.f = str4;
        this.g = str5;
        this.f15190h = str6;
        this.f15191i = str7;
        this.j = str8;
        this.k = str9;
        this.f15192l = staticResources;
        this.m = iFrameResources;
        this.f15193n = htmlResources;
        this.o = v8Var;
        this.f15194p = iconViewTracking;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return Intrinsics.a(this.f15186a, t8Var.f15186a) && Intrinsics.a(this.f15187b, t8Var.f15187b) && Intrinsics.a(this.f15188c, t8Var.f15188c) && Intrinsics.a(this.d, t8Var.d) && Intrinsics.a(this.f15189e, t8Var.f15189e) && Intrinsics.a(this.f, t8Var.f) && Intrinsics.a(this.g, t8Var.g) && Intrinsics.a(this.f15190h, t8Var.f15190h) && Intrinsics.a(this.f15191i, t8Var.f15191i) && Intrinsics.a(this.j, t8Var.j) && Intrinsics.a(this.k, t8Var.k) && Intrinsics.a(this.f15192l, t8Var.f15192l) && Intrinsics.a(this.m, t8Var.m) && Intrinsics.a(this.f15193n, t8Var.f15193n) && Intrinsics.a(this.o, t8Var.o) && Intrinsics.a(this.f15194p, t8Var.f15194p);
    }

    public int hashCode() {
        String str = this.f15186a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f15187b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15188c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15189e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f15190h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f15191i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        int iC = androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c((iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.f15192l), 31, this.m), 31, this.f15193n);
        v8 v8Var = this.o;
        return this.f15194p.hashCode() + ((iC + (v8Var != null ? v8Var.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.f15186a;
        Integer num = this.f15187b;
        Integer num2 = this.f15188c;
        String str2 = this.d;
        String str3 = this.f15189e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.f15190h;
        String str7 = this.f15191i;
        String str8 = this.j;
        String str9 = this.k;
        List list = this.f15192l;
        List list2 = this.m;
        List list3 = this.f15193n;
        v8 v8Var = this.o;
        List list4 = this.f15194p;
        StringBuilder sb = new StringBuilder("Icon(program=");
        sb.append(str);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", xPosition=");
        sb.append(str2);
        sb.append(", yPosition=");
        androidx.media3.extractor.text.ttml.a.C(sb, str3, ", duration=", str4, ", offset=");
        androidx.media3.extractor.text.ttml.a.C(sb, str5, ", apiFramework=", str6, ", pxratio=");
        androidx.media3.extractor.text.ttml.a.C(sb, str7, ", altText=", str8, ", hoverText=");
        sb.append(str9);
        sb.append(", staticResources=");
        sb.append(list);
        sb.append(", iFrameResources=");
        sb.append(list2);
        sb.append(", htmlResources=");
        sb.append(list3);
        sb.append(", iconClicks=");
        sb.append(v8Var);
        sb.append(", iconViewTracking=");
        sb.append(list4);
        sb.append(")");
        return sb.toString();
    }
}
