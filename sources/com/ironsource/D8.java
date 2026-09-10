package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class D8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Drawable f25955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WebView f25956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f25957g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f25960a;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f25961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f25962b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f25963c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f25964d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final wj.h f25965e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final wj.h f25966f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final View f25967g;

            public a(String str, String str2, String str3, String str4, wj.h hVar, wj.h hVar2, View privacyIcon) {
                kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
                this.f25961a = str;
                this.f25962b = str2;
                this.f25963c = str3;
                this.f25964d = str4;
                this.f25965e = hVar;
                this.f25966f = hVar2;
                this.f25967g = privacyIcon;
            }

            public final String a() {
                return this.f25961a;
            }

            public final String b() {
                return this.f25962b;
            }

            public final String c() {
                return this.f25963c;
            }

            public final String d() {
                return this.f25964d;
            }

            public final wj.h e() {
                return this.f25965e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.n.a(this.f25961a, aVar.f25961a) && kotlin.jvm.internal.n.a(this.f25962b, aVar.f25962b) && kotlin.jvm.internal.n.a(this.f25963c, aVar.f25963c) && kotlin.jvm.internal.n.a(this.f25964d, aVar.f25964d) && kotlin.jvm.internal.n.a(this.f25965e, aVar.f25965e) && kotlin.jvm.internal.n.a(this.f25966f, aVar.f25966f) && kotlin.jvm.internal.n.a(this.f25967g, aVar.f25967g);
            }

            public final wj.h f() {
                return this.f25966f;
            }

            public final View g() {
                return this.f25967g;
            }

            public final D8 h() {
                Drawable drawable;
                String str = this.f25961a;
                String str2 = this.f25962b;
                String str3 = this.f25963c;
                String str4 = this.f25964d;
                wj.h hVar = this.f25965e;
                WebView webView = null;
                if (hVar != null) {
                    Object obj = hVar.f53286a;
                    if (obj instanceof wj.g) {
                        obj = null;
                    }
                    drawable = (Drawable) obj;
                } else {
                    drawable = null;
                }
                wj.h hVar2 = this.f25966f;
                if (hVar2 != null) {
                    Object obj2 = hVar2.f53286a;
                    webView = (WebView) (obj2 instanceof wj.g ? null : obj2);
                }
                return new D8(str, str2, str3, str4, drawable, webView, this.f25967g);
            }

            public int hashCode() {
                Object obj;
                Object obj2;
                String str = this.f25961a;
                int iHashCode = 0;
                int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25962b;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f25963c;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f25964d;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                wj.h hVar = this.f25965e;
                int iHashCode6 = (iHashCode5 + ((hVar == null || (obj = hVar.f53286a) == null) ? 0 : obj.hashCode())) * 31;
                wj.h hVar2 = this.f25966f;
                if (hVar2 != null && (obj2 = hVar2.f53286a) != null) {
                    iHashCode = obj2.hashCode();
                }
                return this.f25967g.hashCode() + ((iHashCode6 + iHashCode) * 31);
            }

            public final String i() {
                return this.f25962b;
            }

            public final String j() {
                return this.f25963c;
            }

            public final String k() {
                return this.f25964d;
            }

            public final wj.h l() {
                return this.f25965e;
            }

            public final wj.h m() {
                return this.f25966f;
            }

            public final View n() {
                return this.f25967g;
            }

            public final String o() {
                return this.f25961a;
            }

            public String toString() {
                String str = this.f25961a;
                String str2 = this.f25962b;
                String str3 = this.f25963c;
                String str4 = this.f25964d;
                wj.h hVar = this.f25965e;
                wj.h hVar2 = this.f25966f;
                View view = this.f25967g;
                StringBuilder sbV = defpackage.e.v("Data(title=", str, ", advertiser=", str2, ", body=");
                d5.u.r(sbV, str3, ", cta=", str4, ", icon=");
                sbV.append(hVar);
                sbV.append(", media=");
                sbV.append(hVar2);
                sbV.append(", privacyIcon=");
                sbV.append(view);
                sbV.append(")");
                return sbV.toString();
            }

            public final a a(String str, String str2, String str3, String str4, wj.h hVar, wj.h hVar2, View privacyIcon) {
                kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, hVar, hVar2, privacyIcon);
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, wj.h hVar, wj.h hVar2, View view, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f25961a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f25962b;
                }
                if ((i10 & 4) != 0) {
                    str3 = aVar.f25963c;
                }
                if ((i10 & 8) != 0) {
                    str4 = aVar.f25964d;
                }
                if ((i10 & 16) != 0) {
                    hVar = aVar.f25965e;
                }
                if ((i10 & 32) != 0) {
                    hVar2 = aVar.f25966f;
                }
                if ((i10 & 64) != 0) {
                    view = aVar.f25967g;
                }
                wj.h hVar3 = hVar2;
                View view2 = view;
                wj.h hVar4 = hVar;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, hVar4, hVar3, view2);
            }
        }

        public b(a data) {
            kotlin.jvm.internal.n.f(data, "data");
            this.f25960a = data;
        }

        public final a a() {
            return this.f25960a;
        }

        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (this.f25960a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.f25960a.i() != null) {
                a(jSONObject, X3.i.F0);
            }
            if (this.f25960a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.f25960a.k() != null) {
                a(jSONObject, X3.i.G0);
            }
            wj.h hVarL = this.f25960a.l();
            if (hVarL != null) {
                a(jSONObject, "icon", hVarL.f53286a);
            }
            wj.h hVarM = this.f25960a.m();
            if (hVarM != null) {
                a(jSONObject, X3.i.I0, hVarM.f53286a);
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", !(obj instanceof wj.g));
            Throwable thA = wj.h.a(obj);
            if (thA != null) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            jSONObject.put(str, jSONObject2);
        }
    }

    public D8(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
        this.f25951a = str;
        this.f25952b = str2;
        this.f25953c = str3;
        this.f25954d = str4;
        this.f25955e = drawable;
        this.f25956f = webView;
        this.f25957g = privacyIcon;
    }

    public final String a() {
        return this.f25951a;
    }

    public final String b() {
        return this.f25952b;
    }

    public final String c() {
        return this.f25953c;
    }

    public final String d() {
        return this.f25954d;
    }

    public final Drawable e() {
        return this.f25955e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d10 = (D8) obj;
        return kotlin.jvm.internal.n.a(this.f25951a, d10.f25951a) && kotlin.jvm.internal.n.a(this.f25952b, d10.f25952b) && kotlin.jvm.internal.n.a(this.f25953c, d10.f25953c) && kotlin.jvm.internal.n.a(this.f25954d, d10.f25954d) && kotlin.jvm.internal.n.a(this.f25955e, d10.f25955e) && kotlin.jvm.internal.n.a(this.f25956f, d10.f25956f) && kotlin.jvm.internal.n.a(this.f25957g, d10.f25957g);
    }

    public final WebView f() {
        return this.f25956f;
    }

    public final View g() {
        return this.f25957g;
    }

    public final String h() {
        return this.f25952b;
    }

    public int hashCode() {
        String str = this.f25951a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25952b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25953c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25954d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f25955e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f25956f;
        return this.f25957g.hashCode() + ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f25953c;
    }

    public final String j() {
        return this.f25954d;
    }

    public final Drawable k() {
        return this.f25955e;
    }

    public final WebView l() {
        return this.f25956f;
    }

    public final View m() {
        return this.f25957g;
    }

    public final String n() {
        return this.f25951a;
    }

    public String toString() {
        String str = this.f25951a;
        String str2 = this.f25952b;
        String str3 = this.f25953c;
        String str4 = this.f25954d;
        Drawable drawable = this.f25955e;
        WebView webView = this.f25956f;
        View view = this.f25957g;
        StringBuilder sbV = defpackage.e.v("ISNNativeAdData(title=", str, ", advertiser=", str2, ", body=");
        d5.u.r(sbV, str3, ", cta=", str4, ", icon=");
        sbV.append(drawable);
        sbV.append(", mediaView=");
        sbV.append(webView);
        sbV.append(", privacyIcon=");
        sbV.append(view);
        sbV.append(")");
        return sbV.toString();
    }

    public final D8 a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
        return new D8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ D8 a(D8 d10, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = d10.f25951a;
        }
        if ((i10 & 2) != 0) {
            str2 = d10.f25952b;
        }
        if ((i10 & 4) != 0) {
            str3 = d10.f25953c;
        }
        if ((i10 & 8) != 0) {
            str4 = d10.f25954d;
        }
        if ((i10 & 16) != 0) {
            drawable = d10.f25955e;
        }
        if ((i10 & 32) != 0) {
            webView = d10.f25956f;
        }
        if ((i10 & 64) != 0) {
            view = d10.f25957g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return d10.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U8 f25958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0292d1 f25959b;

        public a(U8 imageLoader, InterfaceC0292d1 adViewManagement) {
            kotlin.jvm.internal.n.f(imageLoader, "imageLoader");
            kotlin.jvm.internal.n.f(adViewManagement, "adViewManagement");
            this.f25958a = imageLoader;
            this.f25959b = adViewManagement;
        }

        private final wj.h b(String str) {
            if (str == null) {
                return null;
            }
            return new wj.h(this.f25958a.a(str));
        }

        public final b a(Context activityContext, JSONObject json) {
            kotlin.jvm.internal.n.f(activityContext, "activityContext");
            kotlin.jvm.internal.n.f(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("title");
            String strB = jSONObjectOptJSONObject != null ? E8.b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(X3.i.F0);
            String strB2 = jSONObjectOptJSONObject2 != null ? E8.b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
            String strB3 = jSONObjectOptJSONObject3 != null ? E8.b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(X3.i.G0);
            String strB4 = jSONObjectOptJSONObject4 != null ? E8.b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("icon");
            String strB5 = jSONObjectOptJSONObject5 != null ? E8.b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = json.optJSONObject(X3.i.I0);
            String strB6 = jSONObjectOptJSONObject6 != null ? E8.b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(X3.i.J0);
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), C0698zd.f31360a.a(activityContext, jSONObjectOptJSONObject7 != null ? E8.b(jSONObjectOptJSONObject7, "url") : null, this.f25958a)));
        }

        private final wj.h a(String str) {
            if (str == null) {
                return null;
            }
            H8 h8A = this.f25959b.a(str);
            WebView presentingView = h8A != null ? h8A.getPresentingView() : null;
            if (presentingView == null) {
                return new wj.h(t9.e.c(new Exception(defpackage.e.o("missing adview for id: '", str, "'"))));
            }
            return new wj.h(presentingView);
        }
    }
}
