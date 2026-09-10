package com.smartdigimkt.b6;

import android.webkit.WebView;
import com.smartdigimkt.w6.f;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f33964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    JSONObject f33965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HashMap<String, Boolean> f33966c = new HashMap<>(3);

    public c(f fVar) {
        JSONObject jSONObject;
        this.f33964a = fVar;
        if (fVar != null) {
            try {
                jSONObject = new JSONObject(fVar.m0());
            } catch (Throwable unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        this.f33965b = jSONObject;
    }

    public void a(WebView webView, String str) {
        JSONObject jSONObject = this.f33965b;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && str != null && str.contains(next) && this.f33966c.get(next) == null) {
                    this.f33966c.put(next, Boolean.TRUE);
                    webView.loadUrl(this.f33965b.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
