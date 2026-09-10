package ads_mobile_sdk;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p4 {
    public final w02 a;
    public final WebView b;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final String e = null;
    public final String f;
    public final String g;
    public final q4 h;

    public p4(w02 w02Var, WebView webView, String str, String str2, q4 q4Var) {
        this.a = w02Var;
        this.b = webView;
        this.h = q4Var;
        this.g = str;
        this.f = str2;
    }

    public static p4 a(w02 w02Var, WebView webView, String str, String str2) {
        if (w02Var == null) {
            throw new IllegalArgumentException("Partner is null");
        }
        if (webView == null) {
            throw new IllegalArgumentException("WebView is null");
        }
        if (str2 == null || str2.length() <= 256) {
            return new p4(w02Var, webView, str, str2, q4.b);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public static p4 b(w02 w02Var, WebView webView, String str, String str2) {
        if (w02Var == null) {
            throw new IllegalArgumentException("Partner is null");
        }
        if (webView == null) {
            throw new IllegalArgumentException("WebView is null");
        }
        if (str2 == null || str2.length() <= 256) {
            return new p4(w02Var, webView, str, str2, q4.c);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public final String c() {
        return this.e;
    }

    public final WebView d() {
        return this.b;
    }

    public final q4 a() {
        return this.h;
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.d);
    }
}
