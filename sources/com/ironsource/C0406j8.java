package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0406j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0371h8 f28974a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f28976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28978e = "j8";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f28979f = {"handleGetViewVisibility"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f28980g = {C0335f8.f28650h, C0335f8.f28651i, C0335f8.f28649g, "handleGetViewVisibility", C0335f8.f28652j};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Fg f28975b = new Fg();

    /* JADX INFO: renamed from: com.ironsource.j8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f28984d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f28981a = str;
            this.f28982b = str2;
            this.f28983c = str3;
            this.f28984d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C0406j8.this.b(this.f28981a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f28981a;
                    Log.e(C0406j8.this.f28978e, str);
                    C0406j8.this.a(this.f28982b, str);
                    return;
                }
                if (this.f28981a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C0406j8.this.e(this.f28983c);
                    return;
                }
                if (!this.f28981a.equalsIgnoreCase(C0335f8.f28652j) && !this.f28981a.equalsIgnoreCase(C0335f8.f28651i)) {
                    return;
                }
                C0406j8.this.a(this.f28984d.getString("params"), this.f28983c, this.f28982b);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f28981a;
                Log.e(C0406j8.this.f28978e, str2);
                C0406j8.this.a(this.f28982b, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28987b;

        public b(String str, String str2) {
            this.f28986a = str;
            this.f28987b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0406j8.this.f28976c.evaluateJavascript(this.f28986a, null);
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                Log.e(C0406j8.this.f28978e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f28987b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f28974a == null || this.f28975b == null) {
            return;
        }
        a(C0335f8.f28643a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f28979f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C0335f8.f28653k);
    }

    public void e() {
        if (this.f28974a == null || this.f28975b == null) {
            return;
        }
        a(C0335f8.f28644b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f28977d);
            a(str, jSONObject);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void g(String str) {
        this.f28977d = str;
    }

    public void a(WebView webView) {
        this.f28976c = webView;
    }

    public void b() {
        this.f28974a = null;
        this.f28975b = null;
    }

    public String c() {
        return this.f28977d;
    }

    public void a(InterfaceC0371h8 interfaceC0371h8) {
        this.f28974a = interfaceC0371h8;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (!TextUtils.isEmpty(strOptString) && h(strOptString)) {
                if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                    a(jSONObject, (String) null, (String) null);
                    return;
                }
                return;
            }
            a(jSONObject.optString(C0335f8.f28663v, C0335f8.f28645c), jSONObject);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            Log.e(this.f28978e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.f28980g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d(String str) {
        R7.f27125a.d(new b(defpackage.e.o("javascript:try{", str, "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}"), str));
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC0371h8 interfaceC0371h8 = this.f28974a;
        if (interfaceC0371h8 != null) {
            interfaceC0371h8.a(str, jSONObject);
        }
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.f28975b.a();
        jSONObjectA.put("adViewId", this.f28977d);
        a(str, jSONObjectA);
    }

    public void a(String str, String str2) {
        InterfaceC0371h8 interfaceC0371h8 = this.f28974a;
        if (interfaceC0371h8 != null) {
            interfaceC0371h8.a(str, str2, this.f28977d);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f28974a == null) {
            C0639w8.a(C0377he.f28820t, new C0549r8().a(B5.f25711y, "mDelegate is null").a());
        } else {
            R7.f27125a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(String str, int i10, boolean z10) {
        this.f28975b.a(str, i10, z10);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0335f8.f28660s, this.f28975b.a());
            jSONObject.put(C0335f8.f28657p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.f28976c == null) {
            String strN = defpackage.e.n("No external adUnit attached to ISNAdView while trying to send message: ", str);
            Log.e(this.f28978e, strN);
            this.f28974a.a(str3, strN, this.f28977d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f28977d);
        a(str2, jSONObject);
    }

    private String a(String str) {
        return String.format(C0335f8.f28662u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f28975b.a());
            return jSONObject2;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            Log.e(this.f28978e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject2;
        }
    }
}
