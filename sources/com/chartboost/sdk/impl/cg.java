package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cg extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13608c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13609e;
    public final String f;
    public final Mediation g;

    public cg(String str, String str2, String str3, String str4, String str5, Mediation mediation) {
        this.f13607b = str;
        this.f13608c = str2;
        this.d = str3;
        this.f13609e = str4;
        this.f = str5;
        this.g = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_ERROR", ob.a(this.f13608c, this.f));
        String str = this.d;
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("CB_ERROR_CODE", str);
        String str2 = this.f13609e;
        return MapsKt.m(MapsKt.j(pair, pair2, new Pair("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), ob.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return Intrinsics.a(this.f13607b, cgVar.f13607b) && Intrinsics.a(this.f13608c, cgVar.f13608c) && Intrinsics.a(this.d, cgVar.d) && Intrinsics.a(this.f13609e, cgVar.f13609e) && Intrinsics.a(this.f, cgVar.f) && Intrinsics.a(this.g, cgVar.g);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.g;
    }

    public int hashCode() {
        String str = this.f13607b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13608c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13609e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Mediation mediation = this.g;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f13607b;
        String str2 = this.f13608c;
        String str3 = this.d;
        String str4 = this.f13609e;
        String str5 = this.f;
        Mediation mediation = this.g;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("StartEventPayload(auctionId=", str, ", errorString=", str2, ", errorCode=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", errorConstant=", str4, ", errorCauseDescription=");
        sbQ.append(str5);
        sbQ.append(", mediation=");
        sbQ.append(mediation);
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ cg(String str, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, mediation);
    }
}
