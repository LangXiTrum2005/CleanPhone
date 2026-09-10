package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r7 extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15003c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15004e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mediation f15005h;

    public r7(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        this.f15002b = auctionId;
        this.f15003c = impressionIds;
        this.d = str;
        this.f15004e = str2;
        this.f = str3;
        this.g = str4;
        this.f15005h = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_ERROR", ob.a(this.d, this.g));
        String str = this.f15004e;
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
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        return Intrinsics.a(this.f15002b, r7Var.f15002b) && Intrinsics.a(this.f15003c, r7Var.f15003c) && Intrinsics.a(this.d, r7Var.d) && Intrinsics.a(this.f15004e, r7Var.f15004e) && Intrinsics.a(this.f, r7Var.f) && Intrinsics.a(this.g, r7Var.g) && Intrinsics.a(this.f15005h, r7Var.f15005h);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f15005h;
    }

    public int hashCode() {
        int iC = androidx.media3.extractor.text.ttml.a.c(this.f15002b.hashCode() * 31, 31, this.f15003c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15004e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f15005h;
        return iHashCode4 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f15002b;
        List list = this.f15003c;
        String str2 = this.d;
        String str3 = this.f15004e;
        String str4 = this.f;
        String str5 = this.g;
        Mediation mediation = this.f15005h;
        StringBuilder sb = new StringBuilder("ExpirationEventPayload(auctionId=");
        sb.append(str);
        sb.append(", impressionIds=");
        sb.append(list);
        sb.append(", errorString=");
        androidx.media3.extractor.text.ttml.a.C(sb, str2, ", errorCode=", str3, ", errorConstant=");
        androidx.media3.extractor.text.ttml.a.C(sb, str4, ", errorCauseDescription=", str5, ", mediation=");
        sb.append(mediation);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ r7(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, mediation);
    }
}
