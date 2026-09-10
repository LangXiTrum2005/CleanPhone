package com.thinkup.core.activity.component;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class PrivacyPolicyView extends RelativeLayout implements View.OnClickListener {
    private static String nm = "PrivacyPolicyView";
    LinearLayout m;
    View m0;
    boolean mm;
    boolean mn;
    TextView mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    LoadingView f41797n;
    String n0;
    o no;
    ViewGroup o;
    TextView o0;
    WebView om;
    CheckBox on;
    FrameLayout oo;

    /* JADX INFO: renamed from: com.thinkup.core.activity.component.PrivacyPolicyView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                if (privacyPolicyView.om == null || privacyPolicyView.mn) {
                    return;
                }
                privacyPolicyView.mm = true;
                Log.d(PrivacyPolicyView.nm, "reload.......");
                PrivacyPolicyView privacyPolicyView2 = PrivacyPolicyView.this;
                privacyPolicyView2.loadPolicyUrl(privacyPolicyView2.n0);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.activity.component.PrivacyPolicyView$2, reason: invalid class name */
    public class AnonymousClass2 extends WebViewClient {
        public AnonymousClass2() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            try {
                Log.d(PrivacyPolicyView.nm, "onPageFinished:" + str + "   mIsWebViewloadSuccess:" + PrivacyPolicyView.this.mm);
                if (PrivacyPolicyView.this.n0.equals(str)) {
                    PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                    if (privacyPolicyView.mm) {
                        privacyPolicyView.m.setVisibility(4);
                        PrivacyPolicyView.this.o.setVisibility(0);
                        PrivacyPolicyView.this.m.setVisibility(8);
                        PrivacyPolicyView.this.f41797n.clearAnimation();
                        o oVar = PrivacyPolicyView.this.no;
                        if (oVar != null) {
                            oVar.onPageLoadSuccess();
                        }
                    } else {
                        privacyPolicyView.m.setVisibility(0);
                        PrivacyPolicyView.this.f41797n.clearAnimation();
                        PrivacyPolicyView.this.o0.setVisibility(0);
                        PrivacyPolicyView.this.o.setVisibility(8);
                        o oVar2 = PrivacyPolicyView.this.no;
                        if (oVar2 != null) {
                            oVar2.onPageLoadFail();
                        }
                    }
                    PrivacyPolicyView.this.mn = false;
                    super.onPageFinished(webView, str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.d(PrivacyPolicyView.nm, "onPageStarted:".concat(String.valueOf(str)));
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            PrivacyPolicyView.this.mm = false;
            Log.d(PrivacyPolicyView.nm, "onPageFinished:" + webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d(PrivacyPolicyView.nm, "shouldOverrideUrlLoading:".concat(String.valueOf(str)));
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            PrivacyPolicyView.o(PrivacyPolicyView.this.getContext(), str);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.activity.component.PrivacyPolicyView$3, reason: invalid class name */
    public class AnonymousClass3 extends WebChromeClient {
        public AnonymousClass3() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("error")) {
                PrivacyPolicyView.this.mm = false;
            }
            super.onReceivedTitle(webView, str);
        }
    }

    public interface o {
        void onLevelSelect(int i2);

        void onPageLoadFail();

        void onPageLoadSuccess();
    }

    public PrivacyPolicyView(Context context) {
        super(context);
        this.mm = true;
        this.mn = false;
        LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "privace_policy_layout", "layout"), this);
        this.o = (ViewGroup) findViewById(o00.o(getContext(), "policy_content_view", "id"));
        this.m = (LinearLayout) findViewById(o00.o(getContext(), "policy_loading_view", "id"));
        this.f41797n = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(o00.o(getContext(), 30.0f), o00.o(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f41797n.setLayoutParams(layoutParams);
        this.o0 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = o00.o(getContext(), 5.0f);
        this.o0.setLayoutParams(layoutParams2);
        this.o0.setText("Page failed to load, please try again later.");
        this.o0.setTextColor(-8947849);
        this.o0.setTextSize(1, 12.0f);
        this.m.addView(this.f41797n);
        this.m.addView(this.o0);
        this.m.setOnClickListener(new AnonymousClass1());
        this.oo = (FrameLayout) findViewById(o00.o(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.om = webView;
        nn.o(webView);
        this.oo.addView(this.om, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.om.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.om.setWebViewClient(new AnonymousClass2());
        this.om.setWebChromeClient(new AnonymousClass3());
        this.on = (CheckBox) findViewById(o00.o(getContext(), "policy_check_box", "id"));
        this.m0 = findViewById(o00.o(getContext(), "policy_agree_view", "id"));
        this.mo = (TextView) findViewById(o00.o(getContext(), "policy_reject_view", "id"));
        this.m0.setOnClickListener(this);
        this.mo.setOnClickListener(this);
        int iO = o00.o(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(iO);
        this.m0.setBackgroundDrawable(gradientDrawable);
        this.mo.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void m() {
        LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "privace_policy_layout", "layout"), this);
        this.o = (ViewGroup) findViewById(o00.o(getContext(), "policy_content_view", "id"));
        this.m = (LinearLayout) findViewById(o00.o(getContext(), "policy_loading_view", "id"));
        this.f41797n = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(o00.o(getContext(), 30.0f), o00.o(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f41797n.setLayoutParams(layoutParams);
        this.o0 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = o00.o(getContext(), 5.0f);
        this.o0.setLayoutParams(layoutParams2);
        this.o0.setText("Page failed to load, please try again later.");
        this.o0.setTextColor(-8947849);
        this.o0.setTextSize(1, 12.0f);
        this.m.addView(this.f41797n);
        this.m.addView(this.o0);
        this.m.setOnClickListener(new AnonymousClass1());
        this.oo = (FrameLayout) findViewById(o00.o(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.om = webView;
        nn.o(webView);
        this.oo.addView(this.om, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.om.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.om.setWebViewClient(new AnonymousClass2());
        this.om.setWebChromeClient(new AnonymousClass3());
        this.on = (CheckBox) findViewById(o00.o(getContext(), "policy_check_box", "id"));
        this.m0 = findViewById(o00.o(getContext(), "policy_agree_view", "id"));
        this.mo = (TextView) findViewById(o00.o(getContext(), "policy_reject_view", "id"));
        this.m0.setOnClickListener(this);
        this.mo.setOnClickListener(this);
        int iO = o00.o(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(iO);
        this.m0.setBackgroundDrawable(gradientDrawable);
        this.mo.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void n() {
        WebSettings settings = this.om.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.om.setWebViewClient(new AnonymousClass2());
        this.om.setWebChromeClient(new AnonymousClass3());
    }

    public void destory() {
        try {
            removeAllViews();
            ViewGroup viewGroup = this.o;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            FrameLayout frameLayout = this.oo;
            if (frameLayout != null) {
                frameLayout.removeView(this.om);
                this.om.removeAllViews();
            }
            WebView webView = this.om;
            if (webView != null) {
                webView.clearHistory();
                this.om.clearCache(true);
                this.om.destroy();
                this.om = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void loadPolicyUrl(String str) {
        if (this.mn) {
            return;
        }
        this.n0 = str;
        if (!o00.o(getContext())) {
            this.mm = false;
            this.m.setVisibility(0);
            this.f41797n.clearAnimation();
            this.o0.setVisibility(0);
            this.o.setVisibility(8);
            o oVar = this.no;
            if (oVar != null) {
                oVar.onPageLoadFail();
                return;
            }
            return;
        }
        this.mm = true;
        this.m.setVisibility(0);
        this.f41797n.clearAnimation();
        this.f41797n.startAnimation();
        this.o0.setVisibility(8);
        this.mn = true;
        if (this.n0.equals(this.om.getUrl())) {
            this.om.reload();
        } else {
            this.om.loadUrl(this.n0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.m0) {
            TUSDK.setGDPRUploadDataLevel(getContext(), 0);
            view.setTag(0);
            o oVar = this.no;
            if (oVar != null) {
                oVar.onLevelSelect(0);
                return;
            }
            return;
        }
        if (view == this.mo) {
            TUSDK.setGDPRUploadDataLevel(getContext(), 1);
            view.setTag(1);
            o oVar2 = this.no;
            if (oVar2 != null) {
                oVar2.onLevelSelect(1);
            }
        }
    }

    public void setResultCallbackListener(o oVar) {
        this.no = oVar;
    }

    public static /* synthetic */ void o(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void m(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
