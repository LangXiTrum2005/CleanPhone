package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class fb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f40965c;
    public final Context f;
    public final TrackingParams g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40963a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40964b = true;
    public oa d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pa f40966e = null;

    public fb(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f40965c = runnable;
        this.f = context;
        this.g = trackingParams;
    }

    @JavascriptInterface
    public void closeAd() {
        if (this.f40963a) {
            return;
        }
        this.f40963a = true;
        this.f40965c.run();
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        pa paVar = this.f40966e;
        if (paVar != null) {
            paVar.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (!this.f40964b) {
            h0.b(this.f, str);
        } else {
            WeakHashMap weakHashMap = vi.f41589a;
            h0.a(this.f, str);
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            h0.a(this.f, str, this.g);
        }
        Intent intentB = vi.b(this.f, str2);
        if (intentB != null && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    intentB.putExtra(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (intentB != null) {
            try {
                this.f.startActivity(intentB);
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        oa oaVar = this.d;
        if (oaVar != null) {
            oaVar.f41307a.i();
            oaVar.f41307a.b();
        }
    }
}
