package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0497o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f29923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f29924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f29925h;

    /* JADX INFO: renamed from: com.ironsource.o9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f29926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f29927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JSONObject f29928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f29929d;

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final JSONObject a() {
            return this.f29926a;
        }

        public final JSONObject b() {
            return this.f29927b;
        }

        public final JSONObject c() {
            return this.f29928c;
        }

        public final JSONObject d() {
            return this.f29929d;
        }

        public final JSONObject e() {
            return this.f29928c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.n.a(this.f29926a, aVar.f29926a) && kotlin.jvm.internal.n.a(this.f29927b, aVar.f29927b) && kotlin.jvm.internal.n.a(this.f29928c, aVar.f29928c) && kotlin.jvm.internal.n.a(this.f29929d, aVar.f29929d);
        }

        public final JSONObject f() {
            return this.f29927b;
        }

        public final JSONObject g() {
            return this.f29929d;
        }

        public final JSONObject h() {
            return this.f29926a;
        }

        public int hashCode() {
            JSONObject jSONObject = this.f29926a;
            int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            JSONObject jSONObject2 = this.f29927b;
            int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            JSONObject jSONObject3 = this.f29928c;
            int iHashCode3 = (iHashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
            JSONObject jSONObject4 = this.f29929d;
            return iHashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.f29926a + ", interstitial=" + this.f29927b + ", banner=" + this.f29928c + ", nativeAd=" + this.f29929d + ")";
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            this.f29926a = jSONObject;
            this.f29927b = jSONObject2;
            this.f29928c = jSONObject3;
            this.f29929d = jSONObject4;
        }

        public final a a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            return new a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public static /* synthetic */ a a(a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = aVar.f29926a;
            }
            if ((i10 & 2) != 0) {
                jSONObject2 = aVar.f29927b;
            }
            if ((i10 & 4) != 0) {
                jSONObject3 = aVar.f29928c;
            }
            if ((i10 & 8) != 0) {
                jSONObject4 = aVar.f29929d;
            }
            return aVar.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public /* synthetic */ a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, kotlin.jvm.internal.g gVar) {
            this((i10 & 1) != 0 ? null : jSONObject, (i10 & 2) != 0 ? null : jSONObject2, (i10 & 4) != 0 ? null : jSONObject3, (i10 & 8) != 0 ? null : jSONObject4);
        }
    }

    public C0497o9() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final String a() {
        return this.f29918a;
    }

    public final String b() {
        return this.f29919b;
    }

    public final String c() {
        return this.f29920c;
    }

    public final String d() {
        return this.f29921d;
    }

    public final String e() {
        return this.f29922e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0497o9)) {
            return false;
        }
        C0497o9 c0497o9 = (C0497o9) obj;
        return kotlin.jvm.internal.n.a(this.f29918a, c0497o9.f29918a) && kotlin.jvm.internal.n.a(this.f29919b, c0497o9.f29919b) && kotlin.jvm.internal.n.a(this.f29920c, c0497o9.f29920c) && kotlin.jvm.internal.n.a(this.f29921d, c0497o9.f29921d) && kotlin.jvm.internal.n.a(this.f29922e, c0497o9.f29922e) && kotlin.jvm.internal.n.a(this.f29923f, c0497o9.f29923f) && kotlin.jvm.internal.n.a(this.f29924g, c0497o9.f29924g) && kotlin.jvm.internal.n.a(this.f29925h, c0497o9.f29925h);
    }

    public final Boolean f() {
        return this.f29923f;
    }

    public final JSONObject g() {
        return this.f29924g;
    }

    public final a h() {
        return this.f29925h;
    }

    public int hashCode() {
        String str = this.f29918a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f29919b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29920c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f29921d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f29922e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f29923f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.f29924g;
        int iHashCode7 = (iHashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        a aVar = this.f29925h;
        return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final a i() {
        return this.f29925h;
    }

    public final String j() {
        return this.f29918a;
    }

    public final JSONObject k() {
        return this.f29924g;
    }

    public final Boolean l() {
        return this.f29923f;
    }

    public final String m() {
        return this.f29921d;
    }

    public final String n() {
        return this.f29920c;
    }

    public final String o() {
        return this.f29919b;
    }

    public final String p() {
        return this.f29922e;
    }

    public String toString() {
        String str = this.f29918a;
        String str2 = this.f29919b;
        String str3 = this.f29920c;
        String str4 = this.f29921d;
        String str5 = this.f29922e;
        Boolean bool = this.f29923f;
        JSONObject jSONObject = this.f29924g;
        a aVar = this.f29925h;
        StringBuilder sbV = defpackage.e.v("InstanceProviderSettings2(adSourceName=", str, ", providerNetworkKey=", str2, ", providerLoadName=");
        d5.u.r(sbV, str3, ", providerDefaultInstance=", str4, ", spId=");
        sbV.append(str5);
        sbV.append(", mpis=");
        sbV.append(bool);
        sbV.append(", application=");
        sbV.append(jSONObject);
        sbV.append(", adFormats=");
        sbV.append(aVar);
        sbV.append(")");
        return sbV.toString();
    }

    public C0497o9(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        this.f29918a = str;
        this.f29919b = str2;
        this.f29920c = str3;
        this.f29921d = str4;
        this.f29922e = str5;
        this.f29923f = bool;
        this.f29924g = jSONObject;
        this.f29925h = aVar;
    }

    public final C0497o9 a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        return new C0497o9(str, str2, str3, str4, str5, bool, jSONObject, aVar);
    }

    public static /* synthetic */ C0497o9 a(C0497o9 c0497o9, String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0497o9.f29918a;
        }
        if ((i10 & 2) != 0) {
            str2 = c0497o9.f29919b;
        }
        if ((i10 & 4) != 0) {
            str3 = c0497o9.f29920c;
        }
        if ((i10 & 8) != 0) {
            str4 = c0497o9.f29921d;
        }
        if ((i10 & 16) != 0) {
            str5 = c0497o9.f29922e;
        }
        if ((i10 & 32) != 0) {
            bool = c0497o9.f29923f;
        }
        if ((i10 & 64) != 0) {
            jSONObject = c0497o9.f29924g;
        }
        if ((i10 & 128) != 0) {
            aVar = c0497o9.f29925h;
        }
        JSONObject jSONObject2 = jSONObject;
        a aVar2 = aVar;
        String str6 = str5;
        Boolean bool2 = bool;
        return c0497o9.a(str, str2, str3, str4, str6, bool2, jSONObject2, aVar2);
    }

    public /* synthetic */ C0497o9(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : jSONObject, (i10 & 128) != 0 ? null : aVar);
    }
}
