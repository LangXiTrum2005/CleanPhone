package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.component.utils.vu;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.yt;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.bytedance.sdk.openadsdk.utils.rq;
import java.net.URLEncoder;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private com.bytedance.sdk.component.tvp.mo lnr;
    private String qdl = null;
    private yt ud;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strMml;
        String str;
        String str2;
        ljh ljhVar;
        String stringExtra;
        com.bytedance.sdk.component.tvp.mo moVar;
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.yt.ud(getApplicationContext());
        if (!rdp.mzz()) {
            finish();
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            stringExtra = getIntent().getStringExtra("_extra_meta");
            String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
            String stringExtra3 = getIntent().getStringExtra("_privacy_url");
            strMml = getIntent().getStringExtra("_privacy_title");
            str = stringExtra3;
            str2 = stringExtra2;
            ljhVar = null;
        } else {
            ljh ljhVarQdl = koa.qdl().qdl(koa.qdl(getIntent()));
            if (ljhVarQdl == null) {
                finish();
                return;
            }
            String strBch = ljhVarQdl.bch();
            String strLnr = ljhVarQdl.rjh().lnr();
            strMml = ljhVarQdl.rjh().mml();
            str = strLnr;
            str2 = strBch;
            ljhVar = ljhVarQdl;
            stringExtra = null;
        }
        if (TextUtils.isEmpty(str)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(this);
        if (Build.VERSION.SDK_INT >= 35) {
            mzzVar.setFitsSystemWindows(true);
        }
        mzzVar.setBackgroundColor(-1);
        mzzVar.setId(520093726);
        mzzVar.setOrientation(1);
        mzzVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(mzzVar);
            int iUd = ax.ud(this, 5.0f);
            int iUd2 = ax.ud(this, 8.0f);
            int iUd3 = ax.ud(this, 10.0f);
            int iUd4 = ax.ud(this, 12.0f);
            int iUd5 = ax.ud(this, 14.0f);
            int iUd6 = ax.ud(this, 20.0f);
            int iUd7 = ax.ud(this, 24.0f);
            int iUd8 = ax.ud(this, 40.0f);
            int iUd9 = ax.ud(this, 44.0f);
            String str3 = str2;
            int iUd10 = ax.ud(this, 191.0f);
            String str4 = str;
            com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(this);
            final String str5 = stringExtra;
            wdVar.setGravity(15);
            final ljh ljhVar2 = ljhVar;
            wdVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iUd9));
            com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(this);
            mmlVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iUd8, iUd9);
            layoutParams.setMarginStart(iUd2);
            mmlVar.setLayoutParams(layoutParams);
            mmlVar.setClickable(true);
            mmlVar.setFocusable(true);
            mmlVar.setPadding(iUd5, iUd4, iUd5, iUd4);
            mmlVar.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(this);
            String str6 = strMml;
            mmlVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iUd8, iUd9);
            layoutParams2.addRule(17, 520093720);
            mmlVar2.setLayoutParams(layoutParams2);
            mmlVar2.setClickable(true);
            mmlVar2.setFocusable(true);
            mmlVar2.setPadding(iUd4, iUd5, iUd4, iUd5);
            mmlVar2.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(this);
            jpcVar.setId(jtx.rzg);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iUd10, iUd7);
            layoutParams3.setMarginStart(iUd);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            jpcVar.setLayoutParams(layoutParams3);
            jpcVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            jpcVar.setGravity(17);
            jpcVar.setSingleLine(true);
            jpcVar.setTextColor(Color.parseColor("#222222"));
            jpcVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.mo.mml mmlVar3 = new com.bytedance.sdk.openadsdk.core.mo.mml(this);
            mmlVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iUd8, iUd9);
            layoutParams4.addRule(16, 520093742);
            mmlVar3.setLayoutParams(layoutParams4);
            mmlVar3.setPadding(iUd3, iUd4, iUd3, iUd4);
            mmlVar3.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.mo.mml mmlVar4 = new com.bytedance.sdk.openadsdk.core.mo.mml(this);
            mmlVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iUd8, iUd9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iUd2);
            mmlVar4.setLayoutParams(layoutParams5);
            mmlVar4.setPadding(iUd4, iUd6, iUd4, iUd6);
            mmlVar4.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.mo.mo moVar2 = new com.bytedance.sdk.openadsdk.core.mo.mo(this, null, R.style.Widget.ProgressBar.Horizontal);
            moVar2.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, ax.ud(this, 2.0f));
            layoutParams6.addRule(12);
            moVar2.setLayoutParams(layoutParams6);
            moVar2.setProgress(1);
            moVar2.setProgressDrawable(rq.qdl(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, ax.ud(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            wdVar.addView(mmlVar);
            wdVar.addView(mmlVar2);
            wdVar.addView(jpcVar);
            wdVar.addView(mmlVar3);
            wdVar.addView(mmlVar4);
            wdVar.addView(moVar2);
            wdVar.addView(view);
            mzzVar.addView(wdVar);
            try {
                com.bytedance.sdk.component.tvp.mo moVar3 = new com.bytedance.sdk.component.tvp.mo(this, com.bytedance.sdk.component.tvp.mo.lnr.PRIVACY);
                this.lnr = moVar3;
                moVar3.setBackgroundColor(-1);
                mzzVar.addView(this.lnr, new ViewGroup.LayoutParams(-1, -1));
                mmlVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.lnr.tvp()) {
                            TTWebsiteActivity.this.lnr.to();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                mmlVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                mmlVar2.setVisibility(4);
                mmlVar2.setClickable(false);
                if (!TextUtils.isEmpty(str6)) {
                    jpcVar.setText(str6);
                }
                mmlVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.lnr.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.ud.qdl(TTWebsiteActivity.this, intent, null);
                    }
                });
                mmlVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.ud == null) {
                            TTWebsiteActivity.this.ud = new yt(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.ud.qdl(str5, ljhVar2);
                            TTWebsiteActivity.this.ud.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.ud.show();
                    }
                });
                this.qdl = str4;
                if (!TextUtils.isEmpty(str3)) {
                    String strEncode = URLEncoder.encode(str3);
                    if (this.qdl.contains("?")) {
                        this.qdl = a.s(new StringBuilder(), this.qdl, "&gdid_encrypted=", strEncode);
                    } else {
                        this.qdl = a.s(new StringBuilder(), this.qdl, "?gdid_encrypted=", strEncode);
                    }
                }
                if (this.qdl == null || (moVar = this.lnr) == null) {
                    finish();
                    return;
                }
                WebView webView = moVar.getWebView();
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
                try {
                    this.lnr.qdl(this.qdl, androidx.media3.extractor.text.ttml.a.s("Referer", TTAdConstant.REQUEST_HEAD_REFERER));
                } catch (Throwable unused2) {
                    this.lnr.a_(this.qdl);
                }
                this.lnr.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView2, int i2) {
                        super.onProgressChanged(webView2, i2);
                        if (moVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i2 != 100) {
                            moVar2.setVisibility(0);
                            moVar2.setProgress(i2);
                            return;
                        }
                        moVar2.setVisibility(8);
                        if (webView2.canGoBack()) {
                            mmlVar2.setVisibility(0);
                            mmlVar2.setClickable(true);
                        } else {
                            mmlVar2.setVisibility(4);
                            mmlVar2.setClickable(false);
                        }
                    }
                });
                this.lnr.setWebViewClient(new com.bytedance.sdk.component.tvp.mo.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str7) {
                        super.onPageFinished(webView2, str7);
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
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str7) {
                        try {
                            Uri uri = Uri.parse(str7);
                            if (!jl.qdl(str7)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.ud.qdl(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView2, str7);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i2, String str7, String str8) {
                        super.onReceivedError(webView2, i2, str7, str8);
                    }
                });
                com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.ud(this.lnr.getWebView());
            } catch (Exception e2) {
                aaj.qdl("TTAD.TTWebsiteActivity", "onCreate: ", e2);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.tvp.mo moVar = this.lnr;
        if (moVar != null) {
            vu.qdl(moVar);
        }
        super.onDestroy();
    }

    public static void qdl(Context context, ljh ljhVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, str, "open_policy");
        if (TextUtils.isEmpty(ljhVar.rjh().lnr())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            intent.putExtra("_extra_meta", ljhVar.ujt().toString());
            intent.putExtra("_extra_glo_d", ljhVar.bch());
            intent.putExtra("_privacy_url", ljhVar.rjh().lnr());
            intent.putExtra("_privacy_title", ljhVar.rjh().mml());
        } else {
            intent.putExtra("meta_index", koa.qdl().qdl(ljhVar));
        }
        com.bytedance.sdk.component.utils.ud.qdl(context, intent, null);
    }
}
