package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xf extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15551c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15552e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mediation f15553h;

    public xf(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        this.f15550b = auctionId;
        this.f15551c = impressionIds;
        this.d = str;
        this.f15552e = str2;
        this.f = str3;
        this.g = str4;
        this.f15553h = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_ERROR", ob.a(this.d, this.f));
        String str = this.f15552e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("CB_ERROR_CODE", str);
        String str2 = this.g;
        return MapsKt.m(MapsKt.j(pair, pair2, new Pair("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), ob.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        return Intrinsics.a(this.f15550b, xfVar.f15550b) && Intrinsics.a(this.f15551c, xfVar.f15551c) && Intrinsics.a(this.d, xfVar.d) && Intrinsics.a(this.f15552e, xfVar.f15552e) && Intrinsics.a(this.f, xfVar.f) && Intrinsics.a(this.g, xfVar.g) && Intrinsics.a(this.f15553h, xfVar.f15553h);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f15553h;
    }

    public int hashCode() {
        int iC = androidx.media3.extractor.text.ttml.a.c(this.f15550b.hashCode() * 31, 31, this.f15551c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15552e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f15553h;
        return iHashCode4 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f15550b;
        List list = this.f15551c;
        String str2 = this.d;
        String str3 = this.f15552e;
        String str4 = this.f;
        String str5 = this.g;
        Mediation mediation = this.f15553h;
        StringBuilder sb = new StringBuilder("ShowEventPayload(auctionId=");
        sb.append(str);
        sb.append(", impressionIds=");
        sb.append(list);
        sb.append(", errorString=");
        androidx.media3.extractor.text.ttml.a.C(sb, str2, ", errorCode=", str3, ", errorCauseDescription=");
        androidx.media3.extractor.text.ttml.a.C(sb, str4, ", errorConstant=", str5, ", mediation=");
        sb.append(mediation);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ xf(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, mediation);
    }
}
