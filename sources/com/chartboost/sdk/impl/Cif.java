package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.if, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cif extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14188c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14189e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mediation f14191i;

    public Cif(String auctionId, List impressionIds, boolean z2, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        this.f14187b = auctionId;
        this.f14188c = impressionIds;
        this.d = z2;
        this.f14189e = str;
        this.f = str2;
        this.g = str3;
        this.f14190h = str4;
        this.f14191i = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_REWARD_SKIPPED", String.valueOf(this.d));
        Pair pair2 = new Pair("CB_ERROR", ob.a(this.f14189e, this.f14190h));
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
        if (!(obj instanceof Cif)) {
            return false;
        }
        Cif cif = (Cif) obj;
        return Intrinsics.a(this.f14187b, cif.f14187b) && Intrinsics.a(this.f14188c, cif.f14188c) && this.d == cif.d && Intrinsics.a(this.f14189e, cif.f14189e) && Intrinsics.a(this.f, cif.f) && Intrinsics.a(this.g, cif.g) && Intrinsics.a(this.f14190h, cif.f14190h) && Intrinsics.a(this.f14191i, cif.f14191i);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f14191i;
    }

    public int hashCode() {
        int iE = Z.e(this.d, androidx.media3.extractor.text.ttml.a.c(this.f14187b.hashCode() * 31, 31, this.f14188c), 31);
        String str = this.f14189e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14190h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f14191i;
        return iHashCode4 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f14187b;
        List list = this.f14188c;
        boolean z2 = this.d;
        String str2 = this.f14189e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.f14190h;
        Mediation mediation = this.f14191i;
        StringBuilder sb = new StringBuilder("RewardEventPayload(auctionId=");
        sb.append(str);
        sb.append(", impressionIds=");
        sb.append(list);
        sb.append(", rewardSkipped=");
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

    public /* synthetic */ Cif(String str, List list, boolean z2, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z2, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, mediation);
    }
}
