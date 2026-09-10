package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f25733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f25734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f25735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f25736d;

    public Bd() {
        this(null, null, null, null, 15, null);
    }

    public final JSONObject a() {
        return this.f25733a;
    }

    public final JSONObject b() {
        return this.f25734b;
    }

    public final JSONObject c() {
        return this.f25735c;
    }

    public final JSONObject d() {
        return this.f25736d;
    }

    public final JSONObject e() {
        return this.f25735c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bd)) {
            return false;
        }
        Bd bd2 = (Bd) obj;
        return kotlin.jvm.internal.n.a(this.f25733a, bd2.f25733a) && kotlin.jvm.internal.n.a(this.f25734b, bd2.f25734b) && kotlin.jvm.internal.n.a(this.f25735c, bd2.f25735c) && kotlin.jvm.internal.n.a(this.f25736d, bd2.f25736d);
    }

    public final JSONObject f() {
        return this.f25734b;
    }

    public final JSONObject g() {
        return this.f25736d;
    }

    public final JSONObject h() {
        return this.f25733a;
    }

    public int hashCode() {
        JSONObject jSONObject = this.f25733a;
        int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        JSONObject jSONObject2 = this.f25734b;
        int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.f25735c;
        int iHashCode3 = (iHashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        JSONObject jSONObject4 = this.f25736d;
        return iHashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderConfig2(rewarded=" + this.f25733a + ", interstitial=" + this.f25734b + ", banner=" + this.f25735c + ", nativeAd=" + this.f25736d + ")";
    }

    public Bd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f25733a = jSONObject;
        this.f25734b = jSONObject2;
        this.f25735c = jSONObject3;
        this.f25736d = jSONObject4;
    }

    public final Bd a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        return new Bd(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public static /* synthetic */ Bd a(Bd bd2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = bd2.f25733a;
        }
        if ((i10 & 2) != 0) {
            jSONObject2 = bd2.f25734b;
        }
        if ((i10 & 4) != 0) {
            jSONObject3 = bd2.f25735c;
        }
        if ((i10 & 8) != 0) {
            jSONObject4 = bd2.f25736d;
        }
        return bd2.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public /* synthetic */ Bd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : jSONObject, (i10 & 2) != 0 ? null : jSONObject2, (i10 & 4) != 0 ? null : jSONObject3, (i10 & 8) != 0 ? null : jSONObject4);
    }
}
