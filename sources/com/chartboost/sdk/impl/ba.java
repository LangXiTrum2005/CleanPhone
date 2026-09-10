package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13511c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13512e;
    public final List f;
    public final List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13514i;

    public ba(String str, String str2, String str3, String str4, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.f(impressions, "impressions");
        Intrinsics.f(creatives, "creatives");
        Intrinsics.f(extensions, "extensions");
        Intrinsics.f(adVerifications, "adVerifications");
        Intrinsics.f(viewableImpressions, "viewableImpressions");
        this.f13509a = str;
        this.f13510b = str2;
        this.f13511c = str3;
        this.d = str4;
        this.f13512e = impressions;
        this.f = creatives;
        this.g = extensions;
        this.f13513h = adVerifications;
        this.f13514i = viewableImpressions;
    }

    public final ba a(String str, String str2, String str3, String str4, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.f(impressions, "impressions");
        Intrinsics.f(creatives, "creatives");
        Intrinsics.f(extensions, "extensions");
        Intrinsics.f(adVerifications, "adVerifications");
        Intrinsics.f(viewableImpressions, "viewableImpressions");
        return new ba(str, str2, str3, str4, impressions, creatives, extensions, adVerifications, viewableImpressions);
    }

    public final List b() {
        return this.f;
    }

    public final List c() {
        return this.g;
    }

    public final List d() {
        return this.f13512e;
    }

    public final List e() {
        return this.f13514i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return Intrinsics.a(this.f13509a, baVar.f13509a) && Intrinsics.a(this.f13510b, baVar.f13510b) && Intrinsics.a(this.f13511c, baVar.f13511c) && Intrinsics.a(this.d, baVar.d) && Intrinsics.a(this.f13512e, baVar.f13512e) && Intrinsics.a(this.f, baVar.f) && Intrinsics.a(this.g, baVar.g) && Intrinsics.a(this.f13513h, baVar.f13513h) && Intrinsics.a(this.f13514i, baVar.f13514i);
    }

    public int hashCode() {
        String str = this.f13509a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13510b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13511c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.f13514i.hashCode() + androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f13512e), 31, this.f), 31, this.g), 31, this.f13513h);
    }

    public String toString() {
        String str = this.f13509a;
        String str2 = this.f13510b;
        String str3 = this.f13511c;
        String str4 = this.d;
        List list = this.f13512e;
        List list2 = this.f;
        List list3 = this.g;
        List list4 = this.f13513h;
        List list5 = this.f13514i;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("InLine(adSystem=", str, ", adTitle=", str2, ", description=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", error=", str4, ", impressions=");
        sbQ.append(list);
        sbQ.append(", creatives=");
        sbQ.append(list2);
        sbQ.append(", extensions=");
        sbQ.append(list3);
        sbQ.append(", adVerifications=");
        sbQ.append(list4);
        sbQ.append(", viewableImpressions=");
        sbQ.append(list5);
        sbQ.append(")");
        return sbQ.toString();
    }

    public static /* synthetic */ ba a(ba baVar, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = baVar.f13509a;
        }
        if ((i2 & 2) != 0) {
            str2 = baVar.f13510b;
        }
        if ((i2 & 4) != 0) {
            str3 = baVar.f13511c;
        }
        if ((i2 & 8) != 0) {
            str4 = baVar.d;
        }
        if ((i2 & 16) != 0) {
            list = baVar.f13512e;
        }
        if ((i2 & 32) != 0) {
            list2 = baVar.f;
        }
        if ((i2 & 64) != 0) {
            list3 = baVar.g;
        }
        if ((i2 & 128) != 0) {
            list4 = baVar.f13513h;
        }
        if ((i2 & 256) != 0) {
            list5 = baVar.f13514i;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list2;
        List list9 = list3;
        List list10 = list;
        String str5 = str3;
        return baVar.a(str, str2, str5, str4, list10, list8, list9, list6, list7);
    }

    public final List a() {
        return this.f13513h;
    }
}
