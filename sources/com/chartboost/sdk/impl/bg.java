package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bg extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13529c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13530e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mediation f13532i;

    public bg(String auctionId, List impressionIds, boolean z2, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        this.f13528b = auctionId;
        this.f13529c = impressionIds;
        this.d = z2;
        this.f13530e = str;
        this.f = str2;
        this.g = str3;
        this.f13531h = str4;
        this.f13532i = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_USER_INITIATED", String.valueOf(this.d));
        Pair pair2 = new Pair("CB_ERROR", ob.a(this.f13530e, this.f13531h));
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
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return Intrinsics.a(this.f13528b, bgVar.f13528b) && Intrinsics.a(this.f13529c, bgVar.f13529c) && this.d == bgVar.d && Intrinsics.a(this.f13530e, bgVar.f13530e) && Intrinsics.a(this.f, bgVar.f) && Intrinsics.a(this.g, bgVar.g) && Intrinsics.a(this.f13531h, bgVar.f13531h) && Intrinsics.a(this.f13532i, bgVar.f13532i);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f13532i;
    }

    public int hashCode() {
        int iE = Z.e(this.d, androidx.media3.extractor.text.ttml.a.c(this.f13528b.hashCode() * 31, 31, this.f13529c), 31);
        String str = this.f13530e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13531h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f13532i;
        return iHashCode4 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f13528b;
        List list = this.f13529c;
        boolean z2 = this.d;
        String str2 = this.f13530e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.f13531h;
        Mediation mediation = this.f13532i;
        StringBuilder sb = new StringBuilder("SkipEventPayload(auctionId=");
        sb.append(str);
        sb.append(", impressionIds=");
        sb.append(list);
        sb.append(", userInitiatedSkip=");
        sb.append(z2);
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

    public /* synthetic */ bg(String str, List list, boolean z2, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z2, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, mediation);
    }
}
