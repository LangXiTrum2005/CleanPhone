package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import b0.b;
import com.google.android.gms.internal.ads.a30;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import pj.g;
import q7.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f43411e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebView f43414c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f43412a = new c(this, 14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f43413b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IntentFilter f43415d = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f43414c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map2 = new HashMap();
            for (String str : bundleExtra.keySet()) {
                map2.put(str, bundleExtra.getString(str));
            }
            map = map2;
        }
        this.f43414c.loadUrl(stringExtra, map);
        this.f43414c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f43414c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f43414c.setWebViewClient(this.f43413b);
        this.f43414c.getSettings().setSupportMultipleWindows(true);
        this.f43414c.setWebChromeClient(new a30(this));
        b.h(this, this.f43412a, this.f43415d, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f43412a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f43414c.canGoBack()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f43414c.goBack();
        return true;
    }
}
