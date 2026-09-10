package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0632w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30880a = b.f30896a;

    /* JADX INFO: renamed from: com.ironsource.w1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a extends InterfaceC0632w1 {

        /* JADX INFO: renamed from: com.ironsource.w1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0090a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f30881b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f30882c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final C0514p8.e f30883d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f30884e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final String f30885f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final C0091a f30886g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f30887h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final int f30888i;

            /* JADX INFO: renamed from: com.ironsource.w1$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class C0091a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f30889a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f30890b;

                public C0091a(int i10, int i11) {
                    this.f30889a = i10;
                    this.f30890b = i11;
                }

                public final int a() {
                    return this.f30889a;
                }

                public final int b() {
                    return this.f30890b;
                }

                public final int c() {
                    return this.f30889a;
                }

                public final int d() {
                    return this.f30890b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0091a)) {
                        return false;
                    }
                    C0091a c0091a = (C0091a) obj;
                    return this.f30889a == c0091a.f30889a && this.f30890b == c0091a.f30890b;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f30890b) + (Integer.hashCode(this.f30889a) * 31);
                }

                public String toString() {
                    return l1.d.f("Coordinates(x=", this.f30889a, ", y=", this.f30890b, ")");
                }

                public final C0091a a(int i10, int i11) {
                    return new C0091a(i10, i11);
                }

                public static /* synthetic */ C0091a a(C0091a c0091a, int i10, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i10 = c0091a.f30889a;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = c0091a.f30890b;
                    }
                    return c0091a.a(i10, i11);
                }
            }

            public C0090a(String successCallback, String failCallback, C0514p8.e productType, String demandSourceName, String url, C0091a coordinates, int i10, int i11) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                kotlin.jvm.internal.n.f(coordinates, "coordinates");
                this.f30881b = successCallback;
                this.f30882c = failCallback;
                this.f30883d = productType;
                this.f30884e = demandSourceName;
                this.f30885f = url;
                this.f30886g = coordinates;
                this.f30887h = i10;
                this.f30888i = i11;
            }

            public final C0090a a(String successCallback, String failCallback, C0514p8.e productType, String demandSourceName, String url, C0091a coordinates, int i10, int i11) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                kotlin.jvm.internal.n.f(coordinates, "coordinates");
                return new C0090a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i10, i11);
            }

            @Override // com.ironsource.InterfaceC0632w1.a
            public String b() {
                return this.f30885f;
            }

            @Override // com.ironsource.InterfaceC0632w1
            public String c() {
                return this.f30882c;
            }

            @Override // com.ironsource.InterfaceC0632w1
            public C0514p8.e d() {
                return this.f30883d;
            }

            @Override // com.ironsource.InterfaceC0632w1
            public String e() {
                return this.f30884e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0090a)) {
                    return false;
                }
                C0090a c0090a = (C0090a) obj;
                return kotlin.jvm.internal.n.a(this.f30881b, c0090a.f30881b) && kotlin.jvm.internal.n.a(this.f30882c, c0090a.f30882c) && this.f30883d == c0090a.f30883d && kotlin.jvm.internal.n.a(this.f30884e, c0090a.f30884e) && kotlin.jvm.internal.n.a(this.f30885f, c0090a.f30885f) && kotlin.jvm.internal.n.a(this.f30886g, c0090a.f30886g) && this.f30887h == c0090a.f30887h && this.f30888i == c0090a.f30888i;
            }

            public final String f() {
                return this.f30881b;
            }

            public final String g() {
                return this.f30882c;
            }

            public final C0514p8.e h() {
                return this.f30883d;
            }

            public int hashCode() {
                return Integer.hashCode(this.f30888i) + wi.d.f(this.f30887h, (this.f30886g.hashCode() + d5.u.e(d5.u.e((this.f30883d.hashCode() + d5.u.e(this.f30881b.hashCode() * 31, 31, this.f30882c)) * 31, 31, this.f30884e), 31, this.f30885f)) * 31, 31);
            }

            public final String i() {
                return this.f30884e;
            }

            public final String j() {
                return this.f30885f;
            }

            public final C0091a k() {
                return this.f30886g;
            }

            public final int l() {
                return this.f30887h;
            }

            public final int m() {
                return this.f30888i;
            }

            public final int n() {
                return this.f30887h;
            }

            public final C0091a o() {
                return this.f30886g;
            }

            public final int p() {
                return this.f30888i;
            }

            public String toString() {
                String str = this.f30881b;
                String str2 = this.f30882c;
                C0514p8.e eVar = this.f30883d;
                String str3 = this.f30884e;
                String str4 = this.f30885f;
                C0091a c0091a = this.f30886g;
                int i10 = this.f30887h;
                int i11 = this.f30888i;
                StringBuilder sbV = defpackage.e.v("Click(successCallback=", str, ", failCallback=", str2, ", productType=");
                sbV.append(eVar);
                sbV.append(", demandSourceName=");
                sbV.append(str3);
                sbV.append(", url=");
                sbV.append(str4);
                sbV.append(", coordinates=");
                sbV.append(c0091a);
                sbV.append(", action=");
                sbV.append(i10);
                sbV.append(", metaState=");
                sbV.append(i11);
                sbV.append(")");
                return sbV.toString();
            }

            public static /* synthetic */ C0090a a(C0090a c0090a, String str, String str2, C0514p8.e eVar, String str3, String str4, C0091a c0091a, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = c0090a.f30881b;
                }
                if ((i12 & 2) != 0) {
                    str2 = c0090a.f30882c;
                }
                if ((i12 & 4) != 0) {
                    eVar = c0090a.f30883d;
                }
                if ((i12 & 8) != 0) {
                    str3 = c0090a.f30884e;
                }
                if ((i12 & 16) != 0) {
                    str4 = c0090a.f30885f;
                }
                if ((i12 & 32) != 0) {
                    c0091a = c0090a.f30886g;
                }
                if ((i12 & 64) != 0) {
                    i10 = c0090a.f30887h;
                }
                if ((i12 & 128) != 0) {
                    i11 = c0090a.f30888i;
                }
                int i13 = i10;
                int i14 = i11;
                String str5 = str4;
                C0091a c0091a2 = c0091a;
                return c0090a.a(str, str2, eVar, str3, str5, c0091a2, i13, i14);
            }

            @Override // com.ironsource.InterfaceC0632w1
            public String a() {
                return this.f30881b;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.w1$a$b */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f30891b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f30892c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final C0514p8.e f30893d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f30894e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final String f30895f;

            public b(String successCallback, String failCallback, C0514p8.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                this.f30891b = successCallback;
                this.f30892c = failCallback;
                this.f30893d = productType;
                this.f30894e = demandSourceName;
                this.f30895f = url;
            }

            public final b a(String successCallback, String failCallback, C0514p8.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC0632w1.a
            public String b() {
                return this.f30895f;
            }

            @Override // com.ironsource.InterfaceC0632w1
            public String c() {
                return this.f30892c;
            }

            @Override // com.ironsource.InterfaceC0632w1
            public C0514p8.e d() {
                return this.f30893d;
            }

            @Override // com.ironsource.InterfaceC0632w1
            public String e() {
                return this.f30894e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.n.a(this.f30891b, bVar.f30891b) && kotlin.jvm.internal.n.a(this.f30892c, bVar.f30892c) && this.f30893d == bVar.f30893d && kotlin.jvm.internal.n.a(this.f30894e, bVar.f30894e) && kotlin.jvm.internal.n.a(this.f30895f, bVar.f30895f);
            }

            public final String f() {
                return this.f30891b;
            }

            public final String g() {
                return this.f30892c;
            }

            public final C0514p8.e h() {
                return this.f30893d;
            }

            public int hashCode() {
                return this.f30895f.hashCode() + d5.u.e((this.f30893d.hashCode() + d5.u.e(this.f30891b.hashCode() * 31, 31, this.f30892c)) * 31, 31, this.f30894e);
            }

            public final String i() {
                return this.f30894e;
            }

            public final String j() {
                return this.f30895f;
            }

            public String toString() {
                String str = this.f30891b;
                String str2 = this.f30892c;
                C0514p8.e eVar = this.f30893d;
                String str3 = this.f30894e;
                String str4 = this.f30895f;
                StringBuilder sbV = defpackage.e.v("Impression(successCallback=", str, ", failCallback=", str2, ", productType=");
                sbV.append(eVar);
                sbV.append(", demandSourceName=");
                sbV.append(str3);
                sbV.append(", url=");
                return defpackage.e.q(str4, ")", sbV);
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C0514p8.e eVar, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f30891b;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f30892c;
                }
                if ((i10 & 4) != 0) {
                    eVar = bVar.f30893d;
                }
                if ((i10 & 8) != 0) {
                    str3 = bVar.f30894e;
                }
                if ((i10 & 16) != 0) {
                    str4 = bVar.f30895f;
                }
                String str5 = str4;
                C0514p8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC0632w1
            public String a() {
                return this.f30891b;
            }
        }

        String b();
    }

    static InterfaceC0632w1 a(String str) {
        return f30880a.a(str);
    }

    String a();

    String c();

    C0514p8.e d();

    String e();

    /* JADX INFO: renamed from: com.ironsource.w1$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f30896a = new b();

        private b() {
        }

        public final InterfaceC0632w1 a(String jsonString) {
            kotlin.jvm.internal.n.f(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (kotlin.jvm.internal.n.a(strOptString, Y3.f27960c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException(defpackage.e.n("unsupported message type: ", strOptString));
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(X3.g.f27749e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(X3.i.f27802m);
            kotlin.jvm.internal.n.e(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C0514p8.e eVarValueOf = C0514p8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (kotlin.jvm.internal.n.a(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(Y3.f27963f);
                int i10 = jSONObject3.getInt(Y3.f27964g);
                int i11 = jSONObject3.getInt(Y3.f27965h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(Y3.f27967j, 0);
                kotlin.jvm.internal.n.e(successCallback, "successCallback");
                kotlin.jvm.internal.n.e(failCallback, "failCallback");
                kotlin.jvm.internal.n.e(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.e(url, "url");
                return new a.C0090a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C0090a.C0091a(i10, i11), iOptInt, iOptInt2);
            }
            if (kotlin.jvm.internal.n.a(strOptString, "impression")) {
                kotlin.jvm.internal.n.e(successCallback, "successCallback");
                kotlin.jvm.internal.n.e(failCallback, "failCallback");
                kotlin.jvm.internal.n.e(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.e(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException(defpackage.e.n("JSON does not contain valid type: ", jSONObject2.optString("type")));
        }
    }
}
