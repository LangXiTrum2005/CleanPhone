package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13841c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13842e;
    public final String f;
    public final List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13843h;

    public ek(String str, String str2, List impressions, List creatives, List extensions, String vastAdTagURI, List adVerifications, List viewableImpressions) {
        Intrinsics.f(impressions, "impressions");
        Intrinsics.f(creatives, "creatives");
        Intrinsics.f(extensions, "extensions");
        Intrinsics.f(vastAdTagURI, "vastAdTagURI");
        Intrinsics.f(adVerifications, "adVerifications");
        Intrinsics.f(viewableImpressions, "viewableImpressions");
        this.f13839a = str;
        this.f13840b = str2;
        this.f13841c = impressions;
        this.d = creatives;
        this.f13842e = extensions;
        this.f = vastAdTagURI;
        this.g = adVerifications;
        this.f13843h = viewableImpressions;
    }

    public final List a() {
        return this.g;
    }

    public final List b() {
        return this.d;
    }

    public final String c() {
        return this.f13840b;
    }

    public final List d() {
        return this.f13842e;
    }

    public final List e() {
        return this.f13841c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj;
        return Intrinsics.a(this.f13839a, ekVar.f13839a) && Intrinsics.a(this.f13840b, ekVar.f13840b) && Intrinsics.a(this.f13841c, ekVar.f13841c) && Intrinsics.a(this.d, ekVar.d) && Intrinsics.a(this.f13842e, ekVar.f13842e) && Intrinsics.a(this.f, ekVar.f) && Intrinsics.a(this.g, ekVar.g) && Intrinsics.a(this.f13843h, ekVar.f13843h);
    }

    public final String f() {
        return this.f;
    }

    public final List g() {
        return this.f13843h;
    }

    public int hashCode() {
        String str = this.f13839a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13840b;
        return this.f13843h.hashCode() + androidx.media3.extractor.text.ttml.a.c(androidx.datastore.preferences.protobuf.a.b(this.f, androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f13841c), 31, this.d), 31, this.f13842e), 31), 31, this.g);
    }

    public String toString() {
        String str = this.f13839a;
        String str2 = this.f13840b;
        List list = this.f13841c;
        List list2 = this.d;
        List list3 = this.f13842e;
        String str3 = this.f;
        List list4 = this.g;
        List list5 = this.f13843h;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("Wrapper(adSystem=", str, ", error=", str2, ", impressions=");
        sbQ.append(list);
        sbQ.append(", creatives=");
        sbQ.append(list2);
        sbQ.append(", extensions=");
        sbQ.append(list3);
        sbQ.append(", vastAdTagURI=");
        sbQ.append(str3);
        sbQ.append(", adVerifications=");
        sbQ.append(list4);
        sbQ.append(", viewableImpressions=");
        sbQ.append(list5);
        sbQ.append(")");
        return sbQ.toString();
    }
}
