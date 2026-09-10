package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class re extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15047c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15048e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mediation f15049h;

    public re(String auctionId, String impressionId, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionId, "impressionId");
        this.f15046b = auctionId;
        this.f15047c = impressionId;
        this.d = str;
        this.f15048e = str2;
        this.f = str3;
        this.g = str4;
        this.f15049h = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_ERROR", ob.a(this.d, this.g));
        String str = this.f15048e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("CB_ERROR_CODE", str);
        String str2 = this.f;
        return MapsKt.m(MapsKt.j(pair, pair2, new Pair("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), ob.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return Intrinsics.a(this.f15046b, reVar.f15046b) && Intrinsics.a(this.f15047c, reVar.f15047c) && Intrinsics.a(this.d, reVar.d) && Intrinsics.a(this.f15048e, reVar.f15048e) && Intrinsics.a(this.f, reVar.f) && Intrinsics.a(this.g, reVar.g) && Intrinsics.a(this.f15049h, reVar.f15049h);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f15049h;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f15047c, this.f15046b.hashCode() * 31, 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15048e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f15049h;
        return iHashCode4 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f15046b;
        String str2 = this.f15047c;
        String str3 = this.d;
        String str4 = this.f15048e;
        String str5 = this.f;
        String str6 = this.g;
        Mediation mediation = this.f15049h;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("RenderEventPayload(auctionId=", str, ", impressionId=", str2, ", errorString=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", errorCode=", str4, ", errorConstant=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str5, ", errorCauseDescription=", str6, ", mediation=");
        sbQ.append(mediation);
        sbQ.append(")");
        return sbQ.toString();
    }
}
