package com.charging.screenshow.battery.animations.themes.activity;

import A.ViewOnClickListenerC0885d;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActPrivacyBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import es.dmoral.toasty.Toasty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/PrivacyAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrivacyAct extends BaseAct {
    public static final /* synthetic */ int j0 = 0;
    public ActPrivacyBinding h0;
    public String i0 = "";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/PrivacyAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        ActPrivacyBinding actPrivacyBinding = this.h0;
        if (actPrivacyBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actPrivacyBinding.f13140b.setOnClickListener(new ViewOnClickListenerC0885d(this, 18));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra != null) {
            this.i0 = stringExtra;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_privacy, (ViewGroup) null, false);
        int i2 = R.id.immersionBarView;
        View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
        if (viewA != null) {
            i2 = R.id.ivBack;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
            if (imageView != null) {
                i2 = R.id.lay_title_toolbar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.lay_title_toolbar, viewInflate);
                if (relativeLayout != null) {
                    i2 = R.id.tvTitle;
                    TextView textView = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                    if (textView != null) {
                        i2 = R.id.webView;
                        WebView webView = (WebView) ViewBindings.a(R.id.webView, viewInflate);
                        if (webView != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.h0 = new ActPrivacyBinding(linearLayout, viewA, imageView, relativeLayout, textView, webView);
                            Intrinsics.e(linearLayout, "getRoot(...)");
                            return linearLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActPrivacyBinding actPrivacyBinding = this.h0;
        if (actPrivacyBinding != null) {
            return actPrivacyBinding.f13139a;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        if (TextUtils.equals(this.i0, "https://sites.google.com/view/zhikenet-privacy/")) {
            ActPrivacyBinding actPrivacyBinding = this.h0;
            if (actPrivacyBinding == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actPrivacyBinding.d.setText(IntExt.c(R.string.privacy_policy));
        }
        ActPrivacyBinding actPrivacyBinding2 = this.h0;
        if (actPrivacyBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        WebSettings settings = actPrivacyBinding2.f13142e.getSettings();
        Intrinsics.e(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        ActPrivacyBinding actPrivacyBinding3 = this.h0;
        if (actPrivacyBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actPrivacyBinding3.f13142e.setWebViewClient(new WebViewClient() { // from class: com.charging.screenshow.battery.animations.themes.activity.PrivacyAct$initViews$1
            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView view, int i2, String description, String failingUrl) {
                Intrinsics.f(view, "view");
                Intrinsics.f(description, "description");
                Intrinsics.f(failingUrl, "failingUrl");
                Toasty.b(this.f13037a, description).show();
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView view, String url) {
                Intrinsics.f(view, "view");
                Intrinsics.f(url, "url");
                if (StringsKt.M(url, "http:", false) || StringsKt.M(url, "https:", false)) {
                    return false;
                }
                this.f13037a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                return true;
            }
        });
        ActPrivacyBinding actPrivacyBinding4 = this.h0;
        if (actPrivacyBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actPrivacyBinding4.f13142e.loadUrl(this.i0);
        ActPrivacyBinding actPrivacyBinding5 = this.h0;
        if (actPrivacyBinding5 != null) {
            actPrivacyBinding5.f13140b.setVisibility(0);
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (j()) {
            q(new y(this, 0));
        } else {
            finish();
        }
    }
}
