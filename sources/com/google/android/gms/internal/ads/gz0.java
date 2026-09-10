package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 extends dz0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f15004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f15005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f15006g;

    public gz0(String str, Map map) {
        super(str);
        this.f15005f = null;
        this.f15006g = map;
    }

    @Override // com.google.android.gms.internal.ads.dz0
    public final void a() {
        WebView webView = new WebView(az0.f12552b.f12553a);
        this.f15004e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f15004e.getSettings().setAllowContentAccess(false);
        this.f15004e.getSettings().setAllowFileAccess(false);
        this.f15004e.setWebViewClient(new fz0(this, 0));
        this.f13771b = new oz0(this.f15004e);
        s6.x(this.f15004e, null);
        Map map = this.f15006g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f15005f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.dz0
    public final void b() {
        super.b();
        new Handler().postDelayed(new ry0(this), Math.max(4000 - (this.f15005f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f15005f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f15004e = null;
    }

    @Override // com.google.android.gms.internal.ads.dz0
    public final void d(ky0 ky0Var, a8 a8Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) a8Var.f11928d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(ky0Var, a8Var, jSONObject);
    }
}
