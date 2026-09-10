package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.component.utils.zf;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.aw;
import com.bytedance.sdk.openadsdk.common.tan;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private ILoader aw;
    private float bgr;
    private ImageView bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18068co;
    private HashMap<String, String> di;
    private tan ik;
    private com.bytedance.sdk.component.jbs.di ka;
    private String mj;
    public aw ri;
    private int sf;
    private ImageView slm;
    private ImageView vr;
    private com.bytedance.sdk.openadsdk.core.widget.ri.di.ri xha;
    private String lr = null;
    private boolean fi = false;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nr.lr(getApplicationContext());
        if (!vr.fi()) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.bgr.lr.ri(this);
        wjv wjvVarRi = dw.ri().ri(dw.ri(getIntent()));
        if (wjvVarRi == null) {
            finish();
            return;
        }
        String strZf = wjvVarRi.zf();
        String strIk = wjvVarRi.ckl().ik();
        String strKa = wjvVarRi.ckl().ka();
        if (TextUtils.isEmpty(strIk)) {
            finish();
            return;
        }
        boolean zOry = nr.ka().ory();
        this.fi = zOry;
        if (zOry) {
            lr(wjvVarRi, strZf, strIk, strKa);
        } else {
            ri(wjvVarRi, strZf, strIk, strKa);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.jbs.di diVar = this.ka;
        if (diVar != null) {
            zf.ri(diVar);
        }
        super.onDestroy();
    }

    private void lr(final wjv wjvVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.jbs.di diVar;
        if (wjvVar != null) {
            this.mj = wjvVar.mvf();
        }
        if (!TextUtils.isEmpty(this.mj)) {
            this.aw = com.bytedance.sdk.openadsdk.xha.lr.ri().lr();
            int iRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.aw, this.mj);
            this.sf = iRi;
            this.f18068co = iRi > 0 ? 2 : 0;
        }
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(this);
        if (Build.VERSION.SDK_INT >= 35) {
            fiVar.setFitsSystemWindows(true);
        }
        fiVar.setBackgroundColor(-1);
        fiVar.setId(520093726);
        fiVar.setOrientation(1);
        fiVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(fiVar);
            aw awVar = new aw(this, wjvVar, "tag", true);
            this.ri = awVar;
            View viewKa = awVar.ka();
            this.ri.ri();
            viewKa.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewKa.setVisibility(0);
            fiVar.addView(viewKa);
            final TextView textView = (TextView) viewKa.findViewById(slm.ri);
            viewKa.findViewById(slm.lr);
            final com.bytedance.sdk.openadsdk.core.di.di diVar2 = (com.bytedance.sdk.openadsdk.core.di.di) findViewById(520093743);
            if (diVar2 != null) {
                diVar2.setProgress(0);
                diVar2.setMax(100);
            }
            ImageView imageView = (ImageView) findViewById(slm.ud);
            this.vr = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TTWebsiteActivity.this.ka != null) {
                            if (TTWebsiteActivity.this.xha != null) {
                                TTWebsiteActivity.this.xha.ri();
                            }
                            if (TTWebsiteActivity.this.ka.jbs()) {
                                TTWebsiteActivity.this.ka.qt();
                            } else {
                                TTWebsiteActivity.this.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(slm.hpn);
            this.slm = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.competently
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f18069kowloon.ri(view);
                    }
                });
            }
            ImageView imageView3 = (ImageView) viewKa.findViewById(520093740);
            this.bu = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.impromptu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f18071kowloon.ri(diVar2, wjvVar, view);
                    }
                });
            }
            try {
                com.bytedance.sdk.component.jbs.di diVarIk = this.ri.ik();
                this.ka = diVarIk;
                WebView webView = diVarIk.getWebView();
                if (webView != null) {
                    this.xha = new com.bytedance.sdk.openadsdk.core.widget.ri.di(webView, wjvVar, this, false).ik();
                }
                this.ri.ri(true);
                if (this.ka.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.ka.getParent()).removeView(this.ka);
                }
                fiVar.addView(this.ka, new ViewGroup.LayoutParams(-1, -1));
                this.lr = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.lr.contains("?")) {
                        this.lr += "&gdid_encrypted=" + strEncode;
                    } else {
                        this.lr += "?gdid_encrypted=" + strEncode;
                    }
                }
                if (this.lr == null || (diVar = this.ka) == null) {
                    finish();
                    return;
                }
                WebView webView2 = diVar.getWebView();
                if (webView2 != null) {
                    WebSettings settings = webView2.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                HashMap<String, String> map = new HashMap<>();
                map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                this.di = map;
                try {
                    this.ka.ri(this.lr, map);
                } catch (Throwable unused2) {
                    this.ka.a_(this.lr);
                }
                this.ka.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.11
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView3, int i) {
                        super.onProgressChanged(webView3, i);
                        if (diVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i == 100) {
                            diVar2.setVisibility(8);
                            webView3.canGoBack();
                        } else {
                            diVar2.setVisibility(0);
                            diVar2.setProgress(i);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView3, String str4) {
                        TextView textView2;
                        if (TextUtils.isEmpty(str4) || (textView2 = textView) == null) {
                            return;
                        }
                        textView2.setText(str4);
                        TTWebsiteActivity.this.ri.lr(webView3.getUrl());
                    }
                });
                this.ka.setWebViewClient(new com.bytedance.sdk.component.jbs.di.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.2
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView3, String str4) {
                        TTWebsiteActivity tTWebsiteActivity;
                        aw awVar2;
                        super.onPageFinished(webView3, str4);
                        if (!TTWebsiteActivity.this.fi || (awVar2 = (tTWebsiteActivity = TTWebsiteActivity.this).ri) == null) {
                            return;
                        }
                        awVar2.ri(webView3, tTWebsiteActivity.xha);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView3, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView3, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView3, String str4) {
                        try {
                            Uri uri = Uri.parse(str4);
                            if (!com.bytedance.sdk.component.utils.nr.ri(str4)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.lr.ri(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView3, str4);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, int i, String str4, String str5) {
                        super.onReceivedError(webView3, i, str4, str5);
                    }
                });
                if (this.ka != null && webView2 != null) {
                    webView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.3
                        private final int lr = nr.lr();

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    TTWebsiteActivity.this.bgr = motionEvent.getRawY();
                                    return false;
                                }
                                if (actionMasked != 2) {
                                    return false;
                                }
                                float rawY = motionEvent.getRawY();
                                if (!TTWebsiteActivity.this.fi) {
                                    return false;
                                }
                                if (rawY - TTWebsiteActivity.this.bgr > this.lr) {
                                    TTWebsiteActivity.this.ri.ri();
                                }
                                if (rawY - TTWebsiteActivity.this.bgr >= (-this.lr)) {
                                    return false;
                                }
                                TTWebsiteActivity.this.ri.lr();
                                return false;
                            } catch (Throwable unused3) {
                                return false;
                            }
                        }
                    });
                }
                com.bytedance.sdk.openadsdk.core.widget.ri.ik.lr(webView2);
            } catch (Exception e) {
                ac.ri("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    public static void ri(Context context, wjv wjvVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, str, "open_policy");
        if (TextUtils.isEmpty(wjvVar.ckl().ik())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        intent.putExtra("meta_index", dw.ri().ri(wjvVar));
        com.bytedance.sdk.component.utils.lr.ri(context, intent, null);
    }

    private void ri(final wjv wjvVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.jbs.di diVar;
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(this);
        if (Build.VERSION.SDK_INT >= 35) {
            fiVar.setFitsSystemWindows(true);
        }
        fiVar.setBackgroundColor(-1);
        fiVar.setId(520093726);
        fiVar.setOrientation(1);
        fiVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(fiVar);
            int iLr = qd.lr(this, 5.0f);
            int iLr2 = qd.lr(this, 8.0f);
            int iLr3 = qd.lr(this, 10.0f);
            int iLr4 = qd.lr(this, 12.0f);
            int iLr5 = qd.lr(this, 14.0f);
            int iLr6 = qd.lr(this, 20.0f);
            int iLr7 = qd.lr(this, 24.0f);
            int iLr8 = qd.lr(this, 40.0f);
            int iLr9 = qd.lr(this, 44.0f);
            int iLr10 = qd.lr(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(this);
            xhaVar.setGravity(15);
            xhaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iLr9));
            com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(this);
            kaVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLr8, iLr9);
            layoutParams.setMarginStart(iLr2);
            kaVar.setLayoutParams(layoutParams);
            kaVar.setClickable(true);
            kaVar.setFocusable(true);
            kaVar.setPadding(iLr5, iLr4, iLr5, iLr4);
            kaVar.setImageDrawable(uq.ik(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(this);
            kaVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLr8, iLr9);
            layoutParams2.addRule(17, 520093720);
            kaVar2.setLayoutParams(layoutParams2);
            kaVar2.setClickable(true);
            kaVar2.setFocusable(true);
            kaVar2.setPadding(iLr4, iLr5, iLr4, iLr5);
            kaVar2.setImageDrawable(uq.ik(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(this);
            mjVar.setId(slm.nh);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLr10, iLr7);
            layoutParams3.setMarginStart(iLr);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            mjVar.setLayoutParams(layoutParams3);
            mjVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            mjVar.setGravity(17);
            mjVar.setSingleLine(true);
            mjVar.setTextColor(Color.parseColor("#222222"));
            mjVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.di.ka kaVar3 = new com.bytedance.sdk.openadsdk.core.di.ka(this);
            kaVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iLr8, iLr9);
            layoutParams4.addRule(16, 520093742);
            kaVar3.setLayoutParams(layoutParams4);
            kaVar3.setPadding(iLr3, iLr4, iLr3, iLr4);
            kaVar3.setImageDrawable(uq.ik(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.di.ka kaVar4 = new com.bytedance.sdk.openadsdk.core.di.ka(this);
            kaVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iLr8, iLr9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iLr2);
            kaVar4.setLayoutParams(layoutParams5);
            kaVar4.setPadding(iLr4, iLr6, iLr4, iLr6);
            kaVar4.setImageDrawable(uq.ik(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.di.di diVar2 = new com.bytedance.sdk.openadsdk.core.di.di(this, null, R.style.Widget.ProgressBar.Horizontal);
            diVar2.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, qd.lr(this, 2.0f));
            layoutParams6.addRule(12);
            diVar2.setLayoutParams(layoutParams6);
            diVar2.setProgress(1);
            diVar2.setProgressDrawable(sf.ri(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, qd.lr(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            xhaVar.addView(kaVar);
            xhaVar.addView(kaVar2);
            xhaVar.addView(mjVar);
            xhaVar.addView(kaVar3);
            xhaVar.addView(kaVar4);
            xhaVar.addView(diVar2);
            xhaVar.addView(view);
            fiVar.addView(xhaVar);
            try {
                com.bytedance.sdk.component.jbs.di diVar3 = new com.bytedance.sdk.component.jbs.di(this, com.bytedance.sdk.component.jbs.di.ik.PRIVACY);
                this.ka = diVar3;
                diVar3.setBackgroundColor(-1);
                fiVar.addView(this.ka, new ViewGroup.LayoutParams(-1, -1));
                kaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.ka.jbs()) {
                            TTWebsiteActivity.this.ka.qt();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                kaVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                kaVar2.setVisibility(4);
                kaVar2.setClickable(false);
                if (!TextUtils.isEmpty(str3)) {
                    mjVar.setText(str3);
                }
                kaVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.ka.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.lr.ri(TTWebsiteActivity.this, intent, null);
                    }
                });
                kaVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.ik == null) {
                            TTWebsiteActivity.this.ik = new tan(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.ik.ri(wjvVar);
                            TTWebsiteActivity.this.ik.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.ik.show();
                    }
                });
                this.lr = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.lr.contains("?")) {
                        this.lr += "&gdid_encrypted=" + strEncode;
                    } else {
                        this.lr += "?gdid_encrypted=" + strEncode;
                    }
                }
                if (this.lr != null && (diVar = this.ka) != null) {
                    WebView webView = diVar.getWebView();
                    if (webView != null) {
                        WebSettings settings = webView.getSettings();
                        settings.setMixedContentMode(0);
                        try {
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(true);
                            settings.setSavePassword(false);
                            settings.setAllowFileAccess(false);
                        } catch (Throwable unused) {
                        }
                    }
                    HashMap map = new HashMap();
                    map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                    try {
                        this.ka.ri(this.lr, map);
                    } catch (Throwable unused2) {
                        this.ka.a_(this.lr);
                    }
                    this.ka.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.7
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i) {
                            super.onProgressChanged(webView2, i);
                            if (diVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i != 100) {
                                diVar2.setVisibility(0);
                                diVar2.setProgress(i);
                                return;
                            }
                            diVar2.setVisibility(8);
                            if (webView2.canGoBack()) {
                                kaVar2.setVisibility(0);
                                kaVar2.setClickable(true);
                            } else {
                                kaVar2.setVisibility(4);
                                kaVar2.setClickable(false);
                            }
                        }
                    });
                    this.ka.setWebViewClient(new com.bytedance.sdk.component.jbs.di.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.8
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str4) {
                            super.onPageFinished(webView2, str4);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            webResourceError.getErrorCode();
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            Objects.toString(webResourceResponse);
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, String str4) {
                            try {
                                Uri uri = Uri.parse(str4);
                                if (!com.bytedance.sdk.component.utils.nr.ri(str4)) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(uri);
                                        intent.addFlags(268435456);
                                        com.bytedance.sdk.component.utils.lr.ri(TTWebsiteActivity.this, intent, null);
                                        return true;
                                    } catch (Throwable unused3) {
                                        return true;
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            return super.shouldOverrideUrlLoading(webView2, str4);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i, String str4, String str5) {
                            super.onReceivedError(webView2, i, str4, str5);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.ri.ik.lr(this.ka.getWebView());
                    return;
                }
                finish();
            } catch (Exception e) {
                ac.ri("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ri(View view) {
        com.bytedance.sdk.component.jbs.di diVar = this.ka;
        if (diVar == null || !diVar.sf()) {
            return;
        }
        this.ka.co();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ri(final com.bytedance.sdk.openadsdk.core.di.di diVar, final wjv wjvVar, View view) {
        final com.bytedance.sdk.openadsdk.common.ac acVar = new com.bytedance.sdk.openadsdk.common.ac(this, true);
        acVar.setOnMenuItemClickListener(new com.bytedance.sdk.openadsdk.common.ac.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.10
            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void ik() {
                if (TTWebsiteActivity.this.ka != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = TTWebsiteActivity.this.ka.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.lr.ri(TTWebsiteActivity.this, intent, null);
                    }
                    acVar.ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void ka() {
                if (TTWebsiteActivity.this.ik == null) {
                    TTWebsiteActivity.this.ik = new tan(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.ik.ri(wjvVar);
                    TTWebsiteActivity.this.ik.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.ik.show();
                acVar.ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void lr() {
                ClipboardManager clipboardManager;
                if (TTWebsiteActivity.this.ka != null) {
                    String url = TTWebsiteActivity.this.ka.getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity.this.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                acVar.ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
            public void ri() {
                com.bytedance.sdk.component.jbs.di diVar2 = TTWebsiteActivity.this.ka;
                if (diVar2 == null || diVar2.getUrl() == null || TTWebsiteActivity.this.di == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.di.di diVar3 = diVar;
                if (diVar3 != null) {
                    diVar3.setVisibility(0);
                    diVar.setProgress(0);
                }
                diVar2.xha();
                String url = diVar2.getUrl();
                if (url != null) {
                    diVar2.a_(url);
                }
                acVar.ri();
            }
        });
        acVar.ri(view);
    }
}
