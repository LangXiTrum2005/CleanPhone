package ads_mobile_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import saneness.lerp;

/* JADX INFO: loaded from: classes.dex */
public final class uk1 extends t4 {
    public WebView e;
    public Long f;
    public final Map g;
    public final String h;

    public uk1(String str, String str2, Map map) {
        super(str);
        this.f = null;
        this.g = map;
        this.h = str2;
    }

    @Override // ads_mobile_sdk.t4
    public final void a(r4 r4Var, p4 p4Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(p4Var.d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        a(r4Var, p4Var, jSONObject);
    }

    @Override // ads_mobile_sdk.t4
    public final void b() {
        this.b.clear();
        new Handler().postDelayed(new tk1(this), Math.max(4000 - (this.f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.e = null;
    }

    @Override // ads_mobile_sdk.t4
    public final void c() {
        WebView webView = new WebView(i21.b.a);
        this.e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.e.getSettings().setAllowContentAccess(false);
        this.e.getSettings().setAllowFileAccess(false);
        this.e.setWebViewClient(new sk1(this));
        this.b = new lerp(this.e);
        rv1.a(this.e, this.h);
        Iterator it = this.g.keySet().iterator();
        if (!it.hasNext()) {
            this.f = Long.valueOf(System.nanoTime());
        } else {
            this.g.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
    }
}
