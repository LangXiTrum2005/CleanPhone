package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14323c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14324e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mediation f14325h;

    public k4(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        this.f14322b = auctionId;
        this.f14323c = impressionIds;
        this.d = str;
        this.f14324e = str2;
        this.f = str3;
        this.g = str4;
        this.f14325h = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_ERROR", ob.a(this.d, this.g));
        String str = this.f14324e;
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
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return Intrinsics.a(this.f14322b, k4Var.f14322b) && Intrinsics.a(this.f14323c, k4Var.f14323c) && Intrinsics.a(this.d, k4Var.d) && Intrinsics.a(this.f14324e, k4Var.f14324e) && Intrinsics.a(this.f, k4Var.f) && Intrinsics.a(this.g, k4Var.g) && Intrinsics.a(this.f14325h, k4Var.f14325h);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f14325h;
    }

    public int hashCode() {
        int iC = androidx.media3.extractor.text.ttml.a.c(this.f14322b.hashCode() * 31, 31, this.f14323c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14324e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f14325h;
        return iHashCode4 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f14322b;
        List list = this.f14323c;
        String str2 = this.d;
        String str3 = this.f14324e;
        String str4 = this.f;
        String str5 = this.g;
        Mediation mediation = this.f14325h;
        StringBuilder sb = new StringBuilder("CloseEventPayload(auctionId=");
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

    public /* synthetic */ k4(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, mediation);
    }
}
