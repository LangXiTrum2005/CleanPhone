package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3694pd {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Boolean f;
    private final JSONObject g;
    private final a h;

    /* JADX INFO: renamed from: com.ironsource.pd$a */
    public static final class a {
        private final JSONObject a;
        private final JSONObject b;
        private final JSONObject c;
        private final JSONObject d;

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final JSONObject a() {
            return this.a;
        }

        public final JSONObject b() {
            return this.b;
        }

        public final JSONObject c() {
            return this.c;
        }

        public final JSONObject d() {
            return this.d;
        }

        public final JSONObject e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.wireman(this.a, aVar.a) && Intrinsics.wireman(this.b, aVar.b) && Intrinsics.wireman(this.c, aVar.c) && Intrinsics.wireman(this.d, aVar.d);
        }

        public final JSONObject f() {
            return this.b;
        }

        public final JSONObject g() {
            return this.d;
        }

        public final JSONObject h() {
            return this.a;
        }

        public int hashCode() {
            JSONObject jSONObject = this.a;
            int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            JSONObject jSONObject2 = this.b;
            int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            JSONObject jSONObject3 = this.c;
            int iHashCode3 = (iHashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
            JSONObject jSONObject4 = this.d;
            return iHashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            this.a = jSONObject;
            this.b = jSONObject2;
            this.c = jSONObject3;
            this.d = jSONObject4;
        }

        public final a a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            return new a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public static /* synthetic */ a a(a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = aVar.a;
            }
            if ((i & 2) != 0) {
                jSONObject2 = aVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject3 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject4 = aVar.d;
            }
            return aVar.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public /* synthetic */ a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
        }
    }

    public C3694pd() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3694pd)) {
            return false;
        }
        C3694pd c3694pd = (C3694pd) obj;
        return Intrinsics.wireman(this.a, c3694pd.a) && Intrinsics.wireman(this.b, c3694pd.b) && Intrinsics.wireman(this.c, c3694pd.c) && Intrinsics.wireman(this.d, c3694pd.d) && Intrinsics.wireman(this.e, c3694pd.e) && Intrinsics.wireman(this.f, c3694pd.f) && Intrinsics.wireman(this.g, c3694pd.g) && Intrinsics.wireman(this.h, c3694pd.h);
    }

    public final Boolean f() {
        return this.f;
    }

    public final JSONObject g() {
        return this.g;
    }

    public final a h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.g;
        int iHashCode7 = (iHashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        a aVar = this.h;
        return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final a i() {
        return this.h;
    }

    public final String j() {
        return this.a;
    }

    public final JSONObject k() {
        return this.g;
    }

    public final Boolean l() {
        return this.f;
    }

    public final String m() {
        return this.d;
    }

    public final String n() {
        return this.c;
    }

    public final String o() {
        return this.b;
    }

    public final String p() {
        return this.e;
    }

    public String toString() {
        return "ProviderConfig2(adSourceName=" + this.a + ", providerNetworkKey=" + this.b + ", providerLoadName=" + this.c + ", providerDefaultInstance=" + this.d + ", spId=" + this.e + ", mpis=" + this.f + ", application=" + this.g + ", adFormats=" + this.h + ")";
    }

    public C3694pd(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = jSONObject;
        this.h = aVar;
    }

    public final C3694pd a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        return new C3694pd(str, str2, str3, str4, str5, bool, jSONObject, aVar);
    }

    public static /* synthetic */ C3694pd a(C3694pd c3694pd, String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3694pd.a;
        }
        if ((i & 2) != 0) {
            str2 = c3694pd.b;
        }
        if ((i & 4) != 0) {
            str3 = c3694pd.c;
        }
        if ((i & 8) != 0) {
            str4 = c3694pd.d;
        }
        if ((i & 16) != 0) {
            str5 = c3694pd.e;
        }
        if ((i & 32) != 0) {
            bool = c3694pd.f;
        }
        if ((i & 64) != 0) {
            jSONObject = c3694pd.g;
        }
        if ((i & 128) != 0) {
            aVar = c3694pd.h;
        }
        JSONObject jSONObject2 = jSONObject;
        a aVar2 = aVar;
        String str6 = str5;
        Boolean bool2 = bool;
        return c3694pd.a(str, str2, str3, str4, str6, bool2, jSONObject2, aVar2);
    }

    public /* synthetic */ C3694pd(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : jSONObject, (i & 128) != 0 ? null : aVar);
    }
}
