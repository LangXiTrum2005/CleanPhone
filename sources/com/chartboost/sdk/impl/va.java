package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class va extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15403c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15404e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f15405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15406i;
    public final Mediation j;

    public va(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Long l2, String str5, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        this.f15402b = auctionId;
        this.f15403c = impressionIds;
        this.d = str;
        this.f15404e = str2;
        this.f = str3;
        this.g = str4;
        this.f15405h = l2;
        this.f15406i = str5;
        this.j = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        String string;
        Pair pair = new Pair("CB_ERROR", ob.a(this.d, this.g));
        String str = this.f15404e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("CB_ERROR_CODE", str);
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair3 = new Pair("CB_ERROR_CONSTANT", str2);
        Long l2 = this.f15405h;
        if (l2 == null || (string = l2.toString()) == null) {
            string = "";
        }
        Pair pair4 = new Pair("CB_LATENCY", string);
        String str3 = this.f15406i;
        return MapsKt.m(MapsKt.j(pair, pair2, pair3, pair4, new Pair("CB_BASE64_ADM", str3 != null ? str3 : "")), ob.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        return Intrinsics.a(this.f15402b, vaVar.f15402b) && Intrinsics.a(this.f15403c, vaVar.f15403c) && Intrinsics.a(this.d, vaVar.d) && Intrinsics.a(this.f15404e, vaVar.f15404e) && Intrinsics.a(this.f, vaVar.f) && Intrinsics.a(this.g, vaVar.g) && Intrinsics.a(this.f15405h, vaVar.f15405h) && Intrinsics.a(this.f15406i, vaVar.f15406i) && Intrinsics.a(this.j, vaVar.j);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.j;
    }

    public int hashCode() {
        int iC = androidx.media3.extractor.text.ttml.a.c(this.f15402b.hashCode() * 31, 31, this.f15403c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15404e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f15405h;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.f15406i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Mediation mediation = this.j;
        return iHashCode6 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f15402b;
        List list = this.f15403c;
        String str2 = this.d;
        String str3 = this.f15404e;
        String str4 = this.f;
        String str5 = this.g;
        Long l2 = this.f15405h;
        String str6 = this.f15406i;
        Mediation mediation = this.j;
        StringBuilder sb = new StringBuilder("LoadEventPayload(auctionId=");
        sb.append(str);
        sb.append(", impressionIds=");
        sb.append(list);
        sb.append(", errorString=");
        androidx.media3.extractor.text.ttml.a.C(sb, str2, ", errorCode=", str3, ", errorConstant=");
        androidx.media3.extractor.text.ttml.a.C(sb, str4, ", errorCauseDescription=", str5, ", duration=");
        sb.append(l2);
        sb.append(", adm=");
        sb.append(str6);
        sb.append(", mediation=");
        sb.append(mediation);
        sb.append(")");
        return sb.toString();
    }
}
