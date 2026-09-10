package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.vi;
import java.net.URI;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ConsentActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f40640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40642c;

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f40640a;
        if (webView == null) {
            this.f40642c = true;
            super.onBackPressed();
            return;
        }
        String url = webView.getUrl();
        String str = this.f40641b;
        if (str != null && url != null && url.contains(str)) {
            this.f40640a.loadUrl("javascript:startappBackPressed();");
        } else if (this.f40640a.canGoBack()) {
            this.f40640a.goBack();
        } else {
            this.f40642c = true;
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setFitsSystemWindows(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        String dataString = getIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            try {
                URI uri = new URI(dataString);
                this.f40641b = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                WebView webViewC = ((tk) com.startapp.sdk.components.a.a(this).f40735b.a()).c();
                this.f40640a = webViewC;
                webViewC.setWebViewClient(new a(this));
                this.f40640a.getSettings().setJavaScriptEnabled(true);
                this.f40640a.setHorizontalScrollBarEnabled(false);
                this.f40640a.setVerticalScrollBarEnabled(false);
                this.f40640a.getSettings().setTextZoom(100);
                this.f40640a.loadUrl(dataString);
                this.f40640a.setBackgroundColor(0);
                this.f40640a.setLayerType(1, null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                relativeLayout.addView(this.f40640a, layoutParams2);
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        setContentView(relativeLayout, layoutParams);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        ConsentConfig consentConfigR = MetaData.E().r();
        if (!this.f40642c && consentConfigR != null && consentConfigR.k()) {
            WeakHashMap weakHashMap = vi.f41589a;
            if (((g6) com.startapp.sdk.components.a.a(this).t.a()).b() && vi.c(this)) {
                g9 g9Var = new g9(h9.d);
                g9Var.d = "ConsentActivityHasBeenCovered";
                g9Var.a();
                finish();
                try {
                    startActivity(getIntent());
                } catch (Throwable th) {
                    g9.a(th);
                }
            }
        }
        h6 h6Var = (h6) com.startapp.sdk.components.a.a(this).j.a();
        h6Var.f41036e = false;
        if (h6.a(4)) {
            g9 g9Var2 = new g9(h9.d);
            g9Var2.d = "CNS.closed";
            g9Var2.f41002e = String.valueOf(System.currentTimeMillis());
            g9Var2.a();
        }
        Intent intent = h6Var.d;
        if (intent != null) {
            try {
                h6Var.f41033a.startActivity(intent);
            } catch (Throwable th2) {
                if (h6.a(8)) {
                    g9.a(th2);
                }
            }
        }
    }
}
