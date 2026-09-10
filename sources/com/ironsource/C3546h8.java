package com.ironsource;

import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3546h8 {
    private InterfaceC3510f8 a;
    private WebView c;
    private String d;
    private String e = C3546h8.class.getSimpleName();
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {C3474d8.h, C3474d8.i, C3474d8.g, "handleGetViewVisibility", C3474d8.j};
    private C3643mg b = new C3643mg();

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ JSONObject d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C3546h8.this.b(this.a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.a;
                    String unused = C3546h8.this.e;
                    C3546h8.this.a(this.b, str);
                    return;
                }
                if (this.a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C3546h8.this.e(this.c);
                    return;
                }
                if (!this.a.equalsIgnoreCase(C3474d8.j) && !this.a.equalsIgnoreCase(C3474d8.i)) {
                    return;
                }
                C3546h8.this.a(this.d.getString("params"), this.c, this.b);
            } catch (Exception e) {
                C3631m4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.a;
                String unused2 = C3546h8.this.e;
                C3546h8.this.a(this.b, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$b */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3546h8.this.c.evaluateJavascript(this.a, null);
            } catch (Throwable th) {
                C3631m4.d().a(th);
                String unused = C3546h8.this.e;
            }
        }
    }

    private void d() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C3474d8.a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C3474d8.k);
    }

    public void a(WebView webView) {
        this.c = webView;
    }

    public void b() {
        this.a = null;
        this.b = null;
    }

    public String c() {
        return this.d;
    }

    public void e() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C3474d8.b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void g(String str) {
        this.d = str;
    }

    public void a(InterfaceC3510f8 interfaceC3510f8) {
        this.a = interfaceC3510f8;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (TextUtils.isEmpty(strOptString) || !h(strOptString)) {
                a(jSONObject.optString(C3474d8.v, C3474d8.c), jSONObject);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC3510f8 interfaceC3510f8 = this.a;
        if (interfaceC3510f8 != null) {
            interfaceC3510f8.a(str, jSONObject);
        }
    }

    private void d(String str) {
        P7.a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.b.a();
        jSONObjectA.put("adViewId", this.d);
        a(str, jSONObjectA);
    }

    public void a(String str, String str2) {
        InterfaceC3510f8 interfaceC3510f8 = this.a;
        if (interfaceC3510f8 != null) {
            interfaceC3510f8.a(str, str2, this.d);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.a == null) {
            C3773u8.a(Ud.t, new C3689p8().a(A5.y, "mDelegate is null").a());
        } else {
            P7.a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3474d8.s, this.b.a());
            jSONObject.put(C3474d8.p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.c == null) {
            this.a.a(str3, "No external adUnit attached to ISNAdView while trying to send message: " + str, this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            C3631m4.d().a(e);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    private String a(String str) {
        return String.format(C3474d8.u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
            return jSONObject2;
        } catch (Exception e) {
            C3631m4.d().a(e);
            Objects.toString(jSONObject);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject2;
        }
    }
}
