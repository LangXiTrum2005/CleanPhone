package com.smartdigimkt.m;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.ne;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.n.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f36544e = 0;
    private static int f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36547c;
    private WindVaneWebView d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f36548a = new a();

        private b() {
        }
    }

    public static a a() {
        return b.f36548a;
    }

    private void b(Object obj, WindVaneWebView windVaneWebView) {
        a(obj, new JSONObject());
    }

    private a() {
        this.f36545a = "ShakeCacheManager";
    }

    public void a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.smartdigimkt.q0.b.O, this.f36547c);
            a(obj, jSONObject);
        } catch (JSONException e2) {
            a(obj, e2.getMessage(), new JSONObject());
        }
    }

    public void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2, int i2) {
        if ((!TextUtils.isEmpty(this.f36547c) && this.f36547c.equals(str)) || (TextUtils.isEmpty(this.f36547c) && TextUtils.isEmpty(str))) {
            this.f36547c = str2;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.f36546b = new JSONObject(str2).optString(ne.b1);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            this.d = windVaneWebView;
            b(obj, windVaneWebView);
            return;
        }
        a(obj, windVaneWebView, this.f36547c, "cache had changed");
    }

    public void a(Object obj, WindVaneWebView windVaneWebView, String str) {
        if (!TextUtils.isEmpty(this.f36547c) && this.f36547c.equals(str)) {
            this.f36547c = "";
            this.d = null;
            a(obj, windVaneWebView);
            a(obj, new JSONObject());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCache", this.f36547c);
            a(obj, "cache is exception", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2, String str3) {
        if (androidx.media3.extractor.text.ttml.a.n(str, str2, str3, "").equals(this.f36546b)) {
            a(obj, windVaneWebView);
        }
    }

    private void a(Object obj, WindVaneWebView windVaneWebView) {
        if (windVaneWebView != null) {
            h.a().a(obj, "releaseShake", "");
        }
    }

    private void a(Object obj, WebView webView, String str, String str2) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str);
                a(obj, str2, jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f36544e);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONObject2.put("data", jSONObject);
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(obj, e2.getMessage(), new JSONObject());
            e2.getMessage();
        }
    }

    public void a(Object obj, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject2.put("data", jSONObject);
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
