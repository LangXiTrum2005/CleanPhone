package com.p004ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.p004ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private eh f25143a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f25145c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f25146e = "gh";
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {ch.f24528h, ch.f24529i, ch.g, "handleGetViewVisibility", ch.j};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yw f25144b = new yw();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25149c;
        final /* synthetic */ JSONObject d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f25147a = str;
            this.f25148b = str2;
            this.f25149c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!gh.this.b(this.f25147a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f25147a;
                    Log.e(gh.this.f25146e, str);
                    gh.this.a(this.f25148b, str);
                    return;
                }
                if (this.f25147a.equalsIgnoreCase("handleGetViewVisibility")) {
                    gh.this.e(this.f25149c);
                } else if (this.f25147a.equalsIgnoreCase(ch.j) || this.f25147a.equalsIgnoreCase(ch.f24529i)) {
                    gh.this.a(this.d.getString("params"), this.f25149c, this.f25148b);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f25147a;
                Log.e(gh.this.f25146e, str2);
                gh.this.a(this.f25148b, str2);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25152b;

        public b(String str, String str2) {
            this.f25151a = str;
            this.f25152b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                gh.this.f25145c.evaluateJavascript(this.f25151a, null);
            } catch (Throwable th) {
                q9.d().a(th);
                Log.e(gh.this.f25146e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f25152b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f25143a == null || this.f25144b == null) {
            return;
        }
        a(ch.f24524a, a());
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
        return str.equalsIgnoreCase(ch.k);
    }

    public String c() {
        return this.d;
    }

    public void e() {
        if (this.f25143a == null || this.f25144b == null) {
            return;
        }
        a(ch.f24525b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void g(String str) {
        this.d = str;
    }

    private String a(String str) {
        return String.format(ch.f24533u, str);
    }

    private void d(String str) {
        pg.f26494a.d(new b(android.support.v4.media.a.n("javascript:try{", str, "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}"), str));
    }

    public void b() {
        this.f25143a = null;
        this.f25144b = null;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (TextUtils.isEmpty(strOptString) || !h(strOptString)) {
                a(jSONObject.optString(ch.v, ch.f24526c), jSONObject);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
            Log.e(this.f25146e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.f25144b.a();
        jSONObjectA.put("adViewId", this.d);
        a(str, jSONObjectA);
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

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ch.s, this.f25144b.a());
            jSONObject.put(ch.f24532p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f25144b.a());
            return jSONObject2;
        } catch (Exception e2) {
            q9.d().a(e2);
            Log.e(this.f25146e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject2;
        }
    }

    public void a(WebView webView) {
        this.f25145c = webView;
    }

    public void a(eh ehVar) {
        this.f25143a = ehVar;
    }

    public void a(String str, int i2, boolean z2) {
        this.f25144b.a(str, i2, z2);
        if (i(str)) {
            d();
        }
    }

    public void a(String str, String str2) {
        eh ehVar = this.f25143a;
        if (ehVar != null) {
            ehVar.a(str, str2, this.d);
        }
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.f25145c == null) {
            String strC = android.support.v4.media.a.C("No external adUnit attached to ISNAdView while trying to send message: ", str);
            Log.e(this.f25146e, strC);
            this.f25143a.a(str3, strC, this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e2) {
            q9.d().a(e2);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    public void a(String str, JSONObject jSONObject) {
        eh ehVar = this.f25143a;
        if (ehVar != null) {
            ehVar.a(str, jSONObject);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f25143a == null) {
            th.a(hs.t, new oh().a(dc.y, "mDelegate is null").a());
        } else {
            pg.f26494a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }
}
