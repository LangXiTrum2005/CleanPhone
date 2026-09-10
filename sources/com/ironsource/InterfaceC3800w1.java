package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3800w1 {
    public static final b a = b.a;

    /* JADX INFO: renamed from: com.ironsource.w1$a */
    public interface a extends InterfaceC3800w1 {

        /* JADX INFO: renamed from: com.ironsource.w1$a$a, reason: collision with other inner class name */
        public static final class C0416a implements a {
            private final String b;
            private final String c;
            private final C3653n8.e d;
            private final String e;
            private final String f;
            private final C0417a g;
            private final int h;
            private final int i;

            /* JADX INFO: renamed from: com.ironsource.w1$a$a$a, reason: collision with other inner class name */
            public static final class C0417a {
                private final int a;
                private final int b;

                public C0417a(int i, int i2) {
                    this.a = i;
                    this.b = i2;
                }

                public final int a() {
                    return this.a;
                }

                public final int b() {
                    return this.b;
                }

                public final int c() {
                    return this.a;
                }

                public final int d() {
                    return this.b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0417a)) {
                        return false;
                    }
                    C0417a c0417a = (C0417a) obj;
                    return this.a == c0417a.a && this.b == c0417a.b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
                }

                public String toString() {
                    return "Coordinates(x=" + this.a + ", y=" + this.b + ")";
                }

                public final C0417a a(int i, int i2) {
                    return new C0417a(i, i2);
                }

                public static /* synthetic */ C0417a a(C0417a c0417a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c0417a.a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c0417a.b;
                    }
                    return c0417a.a(i, i2);
                }
            }

            public C0416a(String successCallback, String failCallback, C3653n8.e productType, String demandSourceName, String url, C0417a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
                this.g = coordinates;
                this.h = i;
                this.i = i2;
            }

            public final C0416a a(String successCallback, String failCallback, C3653n8.e productType, String demandSourceName, String url, C0417a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C0416a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC3800w1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC3800w1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC3800w1
            public C3653n8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC3800w1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0416a)) {
                    return false;
                }
                C0416a c0416a = (C0416a) obj;
                return Intrinsics.wireman(this.b, c0416a.b) && Intrinsics.wireman(this.c, c0416a.c) && this.d == c0416a.d && Intrinsics.wireman(this.e, c0416a.e) && Intrinsics.wireman(this.f, c0416a.f) && Intrinsics.wireman(this.g, c0416a.g) && this.h == c0416a.h && this.i == c0416a.i;
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C3653n8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + Integer.hashCode(this.i);
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public final C0417a k() {
                return this.g;
            }

            public final int l() {
                return this.h;
            }

            public final int m() {
                return this.i;
            }

            public final int n() {
                return this.h;
            }

            public final C0417a o() {
                return this.g;
            }

            public final int p() {
                return this.i;
            }

            public String toString() {
                return "Click(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ", coordinates=" + this.g + ", action=" + this.h + ", metaState=" + this.i + ")";
            }

            public static /* synthetic */ C0416a a(C0416a c0416a, String str, String str2, C3653n8.e eVar, String str3, String str4, C0417a c0417a, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = c0416a.b;
                }
                if ((i3 & 2) != 0) {
                    str2 = c0416a.c;
                }
                if ((i3 & 4) != 0) {
                    eVar = c0416a.d;
                }
                if ((i3 & 8) != 0) {
                    str3 = c0416a.e;
                }
                if ((i3 & 16) != 0) {
                    str4 = c0416a.f;
                }
                if ((i3 & 32) != 0) {
                    c0417a = c0416a.g;
                }
                if ((i3 & 64) != 0) {
                    i = c0416a.h;
                }
                if ((i3 & 128) != 0) {
                    i2 = c0416a.i;
                }
                int i4 = i;
                int i5 = i2;
                String str5 = str4;
                C0417a c0417a2 = c0417a;
                return c0416a.a(str, str2, eVar, str3, str5, c0417a2, i4, i5);
            }

            @Override // com.ironsource.InterfaceC3800w1
            public String a() {
                return this.b;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.w1$a$b */
        public static final class b implements a {
            private final String b;
            private final String c;
            private final C3653n8.e d;
            private final String e;
            private final String f;

            public b(String successCallback, String failCallback, C3653n8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
            }

            public final b a(String successCallback, String failCallback, C3653n8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC3800w1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC3800w1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC3800w1
            public C3653n8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC3800w1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.wireman(this.b, bVar.b) && Intrinsics.wireman(this.c, bVar.c) && this.d == bVar.d && Intrinsics.wireman(this.e, bVar.e) && Intrinsics.wireman(this.f, bVar.f);
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C3653n8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public String toString() {
                return "Impression(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ")";
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C3653n8.e eVar, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.c;
                }
                if ((i & 4) != 0) {
                    eVar = bVar.d;
                }
                if ((i & 8) != 0) {
                    str3 = bVar.e;
                }
                if ((i & 16) != 0) {
                    str4 = bVar.f;
                }
                String str5 = str4;
                C3653n8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC3800w1
            public String a() {
                return this.b;
            }
        }

        String b();
    }

    static InterfaceC3800w1 a(String str) {
        return a.a(str);
    }

    String a();

    String c();

    C3653n8.e d();

    String e();

    /* JADX INFO: renamed from: com.ironsource.w1$b */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        public final InterfaceC3800w1 a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (Intrinsics.wireman(strOptString, Y3.c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + strOptString);
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(X3.g.e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(X3.i.m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C3653n8.e eVarValueOf = C3653n8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (Intrinsics.wireman(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(Y3.f);
                int i = jSONObject3.getInt(Y3.g);
                int i2 = jSONObject3.getInt(Y3.h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(Y3.j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.C0416a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C0416a.C0417a(i, i2), iOptInt, iOptInt2);
            }
            if (Intrinsics.wireman(strOptString, "impression")) {
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
