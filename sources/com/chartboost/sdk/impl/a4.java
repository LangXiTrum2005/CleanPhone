package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a4 extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13398c;
    public final i4 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13399e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mediation f13401i;

    public a4(String auctionId, List impressionIds, i4 clickType, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        Intrinsics.f(clickType, "clickType");
        this.f13397b = auctionId;
        this.f13398c = impressionIds;
        this.d = clickType;
        this.f13399e = str;
        this.f = str2;
        this.g = str3;
        this.f13400h = str4;
        this.f13401i = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_CLICK_TYPE", this.d.b());
        Pair pair2 = new Pair("CB_ERROR", ob.a(this.f13399e, this.f13400h));
        String str = this.f;
        if (str == null) {
            str = "";
        }
        Pair pair3 = new Pair("CB_ERROR_CODE", str);
        String str2 = this.g;
        return MapsKt.m(MapsKt.j(pair, pair2, pair3, new Pair("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), ob.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return Intrinsics.a(this.f13397b, a4Var.f13397b) && Intrinsics.a(this.f13398c, a4Var.f13398c) && this.d == a4Var.d && Intrinsics.a(this.f13399e, a4Var.f13399e) && Intrinsics.a(this.f, a4Var.f) && Intrinsics.a(this.g, a4Var.g) && Intrinsics.a(this.f13400h, a4Var.f13400h) && Intrinsics.a(this.f13401i, a4Var.f13401i);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f13401i;
    }

    public int hashCode() {
        int iHashCode = (this.d.hashCode() + androidx.media3.extractor.text.ttml.a.c(this.f13397b.hashCode() * 31, 31, this.f13398c)) * 31;
        String str = this.f13399e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13400h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f13401i;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f13397b;
        List list = this.f13398c;
        i4 i4Var = this.d;
        String str2 = this.f13399e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.f13400h;
        Mediation mediation = this.f13401i;
        StringBuilder sb = new StringBuilder("ClickEventPayload(auctionId=");
        sb.append(str);
        sb.append(", impressionIds=");
        sb.append(list);
        sb.append(", clickType=");
        sb.append(i4Var);
        sb.append(", errorString=");
        sb.append(str2);
        sb.append(", errorCode=");
        androidx.media3.extractor.text.ttml.a.C(sb, str3, ", errorConstant=", str4, ", errorCauseDescription=");
        sb.append(str5);
        sb.append(", mediation=");
        sb.append(mediation);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ a4(String str, List list, i4 i4Var, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i4Var, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, mediation);
    }
}
