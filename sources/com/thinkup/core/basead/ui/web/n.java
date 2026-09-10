package com.thinkup.core.basead.ui.web;

import android.webkit.WebView;
import com.thinkup.core.common.on.ooo;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    JSONObject m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    HashMap<String, Boolean> f41809n = new HashMap<>(3);
    ooo o;

    public n(ooo oooVar) {
        JSONObject jSONObject;
        this.o = oooVar;
        if (oooVar != null) {
            try {
                jSONObject = new JSONObject(oooVar.m00());
            } catch (Throwable unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        this.m = jSONObject;
    }

    public final void o(WebView webView, String str) {
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && str != null && str.contains(next) && this.f41809n.get(next) == null) {
                    this.f41809n.put(next, Boolean.TRUE);
                    webView.loadUrl(this.m.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
