package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f13598c;
    public final Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f13599e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13601i;

    public ce(Integer num, List list, Integer num2, Integer num3, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        this.f13596a = num;
        this.f13597b = list;
        this.f13598c = num2;
        this.d = num3;
        this.f13599e = jSONObject;
        this.f = str;
        this.g = str2;
        this.f13600h = str3;
        this.f13601i = str4;
    }

    public final String a() {
        return this.f13601i;
    }

    public final String b() {
        return this.f13600h;
    }

    public final Integer c() {
        return this.f13596a;
    }

    public final Integer d() {
        return this.d;
    }

    public final Integer e() {
        return this.f13598c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        return Intrinsics.a(this.f13596a, ceVar.f13596a) && Intrinsics.a(this.f13597b, ceVar.f13597b) && Intrinsics.a(this.f13598c, ceVar.f13598c) && Intrinsics.a(this.d, ceVar.d) && Intrinsics.a(this.f13599e, ceVar.f13599e) && Intrinsics.a(this.f, ceVar.f) && Intrinsics.a(this.g, ceVar.g) && Intrinsics.a(this.f13600h, ceVar.f13600h) && Intrinsics.a(this.f13601i, ceVar.f13601i);
    }

    public final String f() {
        return this.f;
    }

    public final JSONObject g() {
        return this.f13599e;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.f13596a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f13597b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f13598c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        JSONObject jSONObject = this.f13599e;
        int iHashCode5 = (iHashCode4 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13600h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13601i;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final List i() {
        return this.f13597b;
    }

    public String toString() {
        Integer num = this.f13596a;
        List list = this.f13597b;
        Integer num2 = this.f13598c;
        Integer num3 = this.d;
        JSONObject jSONObject = this.f13599e;
        String str = this.f;
        String str2 = this.g;
        String str3 = this.f13600h;
        String str4 = this.f13601i;
        StringBuilder sb = new StringBuilder("PrivacyBodyFields(openRtbConsent=");
        sb.append(num);
        sb.append(", whitelistedPrivacyStandardsList=");
        sb.append(list);
        sb.append(", openRtbGdpr=");
        sb.append(num2);
        sb.append(", openRtbCoppa=");
        sb.append(num3);
        sb.append(", privacyListAsJson=");
        sb.append(jSONObject);
        sb.append(", piDataUseConsent=");
        sb.append(str);
        sb.append(", tcfString=");
        androidx.media3.extractor.text.ttml.a.C(sb, str2, ", gppString=", str3, ", gppSid=");
        return android.support.v4.media.a.r(sb, str4, ")");
    }
}
