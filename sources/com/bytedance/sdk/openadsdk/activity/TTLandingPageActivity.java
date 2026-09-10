package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.vu;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bjy;
import com.bytedance.sdk.openadsdk.common.fs;
import com.bytedance.sdk.openadsdk.common.rdp;
import com.bytedance.sdk.openadsdk.common.to;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.rq;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.exc;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.bytedance.sdk.openadsdk.utils.jyq;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {
    private ljh aaj;
    private String bch;
    private String bjy;
    private boolean ekw;
    private String exc;
    private Button exu;
    private com.bytedance.sdk.openadsdk.common.mml fco;
    private rdp fs;
    private boolean gy;
    private com.bytedance.sdk.openadsdk.utils.rdp hkc;
    private com.bytedance.sdk.openadsdk.core.widget.qdl.mo.qdl hzv;
    private int jl;
    private String jtx;
    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo jyq;
    private fs kdv;
    private int koa;
    TTAdDislikeToast lnr;
    private com.bytedance.sdk.component.tvp.mo mo;
    private com.bytedance.sdk.openadsdk.core.widget.qdl.mzz mrf;
    private String oth;
    com.bytedance.sdk.openadsdk.mml.fs qdl;
    private com.bytedance.sdk.openadsdk.core.mo.mo rdp;
    private Context rq;
    private TextView to;
    bjy ud;
    private ILoader uw;
    private int vu;
    private ImageView wd;
    private hkc yt;
    private final AtomicBoolean ljh = new AtomicBoolean(true);
    private final AtomicInteger xmv = new AtomicInteger(0);
    private final AtomicInteger bqt = new AtomicInteger(0);
    private final AtomicInteger rc = new AtomicInteger(0);
    final AtomicBoolean mml = new AtomicBoolean(false);
    final AtomicBoolean mzz = new AtomicBoolean(false);
    private String ax = "ダウンロード";

    public static class lnr implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.mml.fs> qdl;
        private final WeakReference<com.bytedance.sdk.openadsdk.common.mml> ud;

        public lnr(com.bytedance.sdk.openadsdk.mml.fs fsVar, com.bytedance.sdk.openadsdk.common.mml mmlVar) {
            this.qdl = new WeakReference<>(fsVar);
            this.ud = new WeakReference<>(mmlVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.mml.fs fsVar = this.qdl.get();
            if (fsVar != null) {
                fsVar.qdl(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.mml mmlVar = this.ud.get();
            if (mmlVar == null) {
                return false;
            }
            mmlVar.qdl(motionEvent);
            return false;
        }
    }

    public static class qdl implements rq {
        private final String lnr;
        private final WeakReference<TTLandingPageActivity> mml;
        private final int qdl;
        private final ljh ud;

        public qdl(int i2, ljh ljhVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.qdl = i2;
            this.ud = ljhVar;
            this.lnr = str;
            this.mml = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.mml.rq
        public void qdl(int i2) {
            TTLandingPageActivity tTLandingPageActivity = this.mml.get();
            if (tTLandingPageActivity != null) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(this.qdl, tTLandingPageActivity.bqt.get(), tTLandingPageActivity.rc.get(), tTLandingPageActivity.xmv.get() - tTLandingPageActivity.rc.get(), this.ud, this.lnr, i2);
            }
        }
    }

    public static class ud implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.mml.fs> qdl;

        public ud(com.bytedance.sdk.openadsdk.mml.fs fsVar) {
            this.qdl = new WeakReference<>(fsVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            com.bytedance.sdk.openadsdk.mml.fs fsVar = this.qdl.get();
            if (fsVar != null) {
                fsVar.ud(i3);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        tvp();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        mzz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        qdl(3);
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.rdp.mzz()) {
            finish();
            return;
        }
        try {
            yt.ud(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            this.gy = intent.getBooleanExtra("only_loading", false);
        } else {
            ljh ljhVarQdl = koa.qdl().qdl(koa.qdl(intent));
            this.aaj = ljhVarQdl;
            if (ljhVarQdl != null) {
                this.gy = ljhVarQdl.fs();
            }
        }
        try {
            setContentView(mml());
            this.oth = "";
            ud(4);
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.aaj = com.bytedance.sdk.openadsdk.core.ud.qdl(new JSONObject(stringExtra));
                    } catch (Exception e2) {
                        aaj.qdl("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e2);
                    }
                }
                this.oth = intent.getStringExtra("url");
                this.exc = intent.getStringExtra("event_tag");
                this.jl = intent.getIntExtra("source", -1);
                this.bjy = intent.getStringExtra("adid");
                this.jtx = intent.getStringExtra("log_extra");
                this.bch = intent.getStringExtra("gecko_id");
            } else {
                ljh ljhVar = this.aaj;
                if (ljhVar != null) {
                    this.bjy = ljhVar.yre();
                    this.jtx = this.aaj.ir();
                    this.bch = this.aaj.xmr();
                    this.oth = this.aaj.tvp();
                    this.jl = this.aaj.rq();
                    this.exc = this.aaj.to();
                }
            }
            if (this.aaj == null) {
                finish();
                return;
            }
            wd();
            if (!TextUtils.isEmpty(this.bch)) {
                this.uw = com.bytedance.sdk.openadsdk.wd.ud.qdl().ud();
                int iQdl = com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(this.uw, this.bch);
                this.koa = iQdl;
                this.vu = iQdl > 0 ? 2 : 0;
            }
            this.rq = this;
            if (this.mo != null) {
                com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(this).qdl(false).ud(false).qdl(this.mo.getWebView());
            }
            com.bytedance.sdk.component.tvp.mo moVar = this.mo;
            if (moVar != null && moVar.getWebView() != null) {
                com.bytedance.sdk.openadsdk.mml.fs fsVarUd = new com.bytedance.sdk.openadsdk.mml.fs(this.aaj, this.mo.getWebView(), new qdl(this.koa, this.aaj, "landingpage", this), this.vu).ud(true);
                this.qdl = fsVarUd;
                this.hzv = fsVarUd.qdl;
                this.fco = gy.qdl(this.aaj, this.mo, this.rq, this.exc);
            }
            jpc();
            com.bytedance.sdk.component.tvp.mo moVar2 = this.mo;
            if (moVar2 != null) {
                moVar2.setLandingPage(true);
                this.mo.setTag("landingpage");
                this.mo.setMaterialMeta(this.aaj.il());
            }
            com.bytedance.sdk.openadsdk.core.widget.qdl.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.widget.qdl.mzz(this.rq, this.yt, this.bjy, this.fco, this.qdl, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.rdp != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.rdp.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.kdv != null) {
                        TTLandingPageActivity.this.kdv.ud();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.bch)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.xmv.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelQdl = com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(TTLandingPageActivity.this.uw, TTLandingPageActivity.this.bch, str);
                        if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.rc.incrementAndGet();
                            return webResourceResponseModelQdl.getWebResourceResponse();
                        }
                        if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getMsg() == 2) {
                            TTLandingPageActivity.this.bqt.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        aaj.qdl("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.mrf = mzzVar;
            mzzVar.qdl(this.aaj);
            this.mrf.qdl("landingpage");
            com.bytedance.sdk.component.tvp.mo moVar3 = this.mo;
            if (moVar3 != null) {
                moVar3.setWebViewClient(this.mrf);
                com.bytedance.sdk.component.tvp.mo moVar4 = this.mo;
                if (moVar4 != null) {
                    moVar4.setUserAgentString(exc.qdl(moVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.tvp.mo moVar5 = this.mo;
                if (moVar5 != null) {
                    moVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.aaj, "landingpage", this.vu);
            com.bytedance.sdk.component.tvp.mo moVar6 = this.mo;
            if (moVar6 != null) {
                jyq.qdl(moVar6, this.oth);
                this.mo.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.qdl.mml(this.yt, this.qdl, this.fco) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mml, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        if (TTLandingPageActivity.this.kdv != null) {
                            TTLandingPageActivity.this.kdv.qdl(i2);
                        }
                        if (TTLandingPageActivity.this.rdp == null || TTLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        if (i2 == 100 && TTLandingPageActivity.this.rdp.isShown()) {
                            TTLandingPageActivity.this.rdp.setVisibility(8);
                        } else {
                            TTLandingPageActivity.this.rdp.setProgress(i2);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.to != null) {
                            TextView textView = TTLandingPageActivity.this.to;
                            if (TextUtils.isEmpty(str)) {
                                str = com.bytedance.sdk.component.utils.ljh.qdl(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }
                });
                if (this.mo.getWebView() != null) {
                    this.mo.getWebView().setOnScrollChangeListener(new ud(this.qdl));
                    this.mo.getWebView().setOnTouchListener(new lnr(this.qdl, this.fco));
                }
                this.mo.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        if (TTLandingPageActivity.this.jyq != null) {
                            TTLandingPageActivity.this.jyq.lnr(TTLandingPageActivity.this.aaj);
                        }
                    }
                });
            }
            mzz();
            com.bytedance.sdk.openadsdk.utils.rdp rdpVarQdl = com.bytedance.sdk.openadsdk.utils.tvp.qdl(this, new com.bytedance.sdk.openadsdk.utils.tvp.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // com.bytedance.sdk.openadsdk.utils.tvp.qdl
                public View qdl() {
                    return TTLandingPageActivity.this.wd;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.tvp.qdl
                public void ud() {
                }
            });
            this.hkc = rdpVarQdl;
            rdpVarQdl.qdl(0L);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(SystemClock.elapsedRealtime() - jElapsedRealtime, this.aaj, "landingpage", this.uw, this.bch);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.tvp.mo moVar;
        super.onDestroy();
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.qdl;
        if (fsVar != null && (moVar = this.mo) != null) {
            fsVar.qdl(moVar);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.tvp.mo moVar2 = this.mo;
        if (moVar2 != null) {
            vu.qdl(moVar2);
        }
        this.mo = null;
        hkc hkcVar = this.yt;
        if (hkcVar != null) {
            hkcVar.fs();
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar2 = this.qdl;
        if (fsVar2 != null) {
            fsVar2.mml(true);
        }
        if (!TextUtils.isEmpty(this.bch)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(this.rc.get(), this.xmv.get(), this.aaj);
        }
        com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(this.uw);
        com.bytedance.sdk.openadsdk.utils.rdp rdpVar = this.hkc;
        if (rdpVar != null) {
            rdpVar.lnr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.utils.rdp rdpVar = this.hkc;
        if (rdpVar != null) {
            rdpVar.ud();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        hkc hkcVar = this.yt;
        if (hkcVar != null) {
            hkcVar.rq();
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.wd();
        }
        if (!this.ekw) {
            this.ekw = true;
            qdl(4);
        }
        com.bytedance.sdk.openadsdk.utils.rdp rdpVar = this.hkc;
        if (rdpVar != null) {
            rdpVar.qdl();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.mml.qdl(this, this.aaj);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.jpc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean qdl() {
        return true;
    }

    private void exu() {
        TTAdDislikeToast tTAdDislikeToast = this.lnr;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private void fs() {
        try {
            if (this.ud == null) {
                bjy bjyVar = new bjy(this.rq, this.aaj);
                this.ud = bjyVar;
                bjyVar.setDislikeSource("landing_page");
                this.ud.setCallback(new bjy.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void qdl(View view) {
                        TTLandingPageActivity.this.mml.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void ud(View view) {
                        TTLandingPageActivity.this.mml.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void qdl(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.mzz.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.mzz.set(true);
                        TTLandingPageActivity.this.rdp();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.ud);
            if (this.lnr == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.rq);
                this.lnr = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void jpc() {
        hkc hkcVar = new hkc(this);
        this.yt = hkcVar;
        hkcVar.ud(this.mo).lnr(this.bjy).mml(this.jtx).qdl(this.aaj).ud(this.jl).qdl(this.aaj.jle()).mzz(this.aaj.htl()).qdl(this.mo).ud("landingpage");
    }

    private View mml() {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(this);
        if (Build.VERSION.SDK_INT >= 35) {
            lnrVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(this);
        mzzVar.setOrientation(1);
        lnrVar.addView(mzzVar, new FrameLayout.LayoutParams(-1, -1));
        View rdpVar = new rdp(this, new rdp.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.common.rdp.qdl
            public View qdl(Context context) {
                return new to(context);
            }
        });
        rdpVar.setId(jtx.sy);
        mzzVar.addView(rdpVar, new LinearLayout.LayoutParams(-1, ax.ud(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        mzzVar.addView(lnrVar2, layoutParams);
        com.bytedance.sdk.component.tvp.mo moVar = new com.bytedance.sdk.component.tvp.mo(this, com.bytedance.sdk.component.tvp.mo.lnr.LANDING_PAGE);
        moVar.setId(jtx.cx);
        lnrVar2.addView(moVar, new FrameLayout.LayoutParams(-1, -1));
        rdp rdpVar2 = new rdp(this, new rdp.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.common.rdp.qdl
            public View qdl(Context context) {
                return new com.bytedance.sdk.openadsdk.common.wd(context);
            }
        });
        rdpVar2.setId(jtx.taz);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        lnrVar2.addView(rdpVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mo moVar2 = new com.bytedance.sdk.openadsdk.core.mo.mo(this, null, R.style.Widget.ProgressBar.Horizontal);
        moVar2.setId(jtx.lte);
        moVar2.setProgress(1);
        moVar2.setVisibility(8);
        moVar2.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, ax.ud(this, 3.0f));
        layoutParams3.gravity = 49;
        lnrVar2.addView(moVar2, layoutParams3);
        fs fsVar = new fs(this);
        fsVar.setOnlyLoading(this.gy);
        fsVar.setId(520093721);
        lnrVar.addView(fsVar, new FrameLayout.LayoutParams(-1, -1));
        return lnrVar;
    }

    private String mo() {
        ljh ljhVar = this.aaj;
        if (ljhVar != null && !TextUtils.isEmpty(ljhVar.uvi())) {
            this.ax = this.aaj.uvi();
        }
        return this.ax;
    }

    private void mzz() {
        ljh ljhVar = this.aaj;
        if (ljhVar == null || ljhVar.ygv() != 4) {
            return;
        }
        rdp rdpVar = this.fs;
        if (rdpVar != null) {
            rdpVar.setVisibility(0);
        }
        Button button = (Button) findViewById(jtx.lq);
        this.exu = button;
        if (button != null) {
            qdl(mo());
            if (this.jyq == null) {
                this.jyq = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this, TextUtils.isEmpty(this.exc) ? gy.ud(this.jl) : this.exc);
            }
            com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.lnr.qdl(this, this.aaj, this.exc, this.jl);
            qdlVar.qdl(false);
            this.exu.setOnClickListener(qdlVar);
            this.exu.setOnTouchListener(qdlVar);
            qdlVar.lnr(true);
            qdlVar.qdl(this.jyq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rdp() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.lnr) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void rq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.yt.qdl("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean to() {
        return !TextUtils.isEmpty(this.oth) && this.oth.contains("__luban_sdk");
    }

    private void tvp() {
        if (to() && !this.ljh.getAndSet(true)) {
            rq();
            ud(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                aaj.lnr("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    private void wd() {
        com.bytedance.sdk.component.tvp.mo moVar = (com.bytedance.sdk.component.tvp.mo) findViewById(jtx.cx);
        this.mo = moVar;
        gy.qdl(this.aaj, moVar);
        this.fs = (rdp) findViewById(jtx.taz);
        rdp rdpVar = (rdp) findViewById(jtx.sy);
        fs fsVar = (fs) findViewById(520093721);
        this.kdv = fsVar;
        if (fsVar != null) {
            fsVar.qdl(this.aaj);
            this.kdv.qdl();
        }
        if (rdpVar != null) {
            rdpVar.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.mo != null) {
                        if (TTLandingPageActivity.this.hzv != null) {
                            TTLandingPageActivity.this.hzv.qdl();
                        }
                        if (TTLandingPageActivity.this.mo.tvp()) {
                            TTLandingPageActivity.this.mo.to();
                        } else if (TTLandingPageActivity.this.to()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(520093716);
        this.wd = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.to = (TextView) findViewById(jtx.rzg);
        com.bytedance.sdk.openadsdk.core.mo.mo moVar2 = (com.bytedance.sdk.openadsdk.core.mo.mo) findViewById(jtx.lte);
        this.rdp = moVar2;
        if (moVar2 != null) {
            moVar2.setVisibility(0);
        }
        View viewFindViewById = findViewById(jtx.gg);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.lnr();
                }
            });
        }
    }

    public void lnr() {
        if (isFinishing()) {
            return;
        }
        if (this.mzz.get()) {
            exu();
            return;
        }
        if (this.ud == null) {
            fs();
        }
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ud() {
        tvp();
    }

    private void qdl(int i2) {
        int i3;
        if (i2 == 1 || (i3 = Build.VERSION.SDK_INT) == 26) {
            return;
        }
        if (i3 == 27) {
            try {
                setRequestedOrientation(i2);
            } catch (Throwable unused) {
            }
        } else {
            setRequestedOrientation(i2);
        }
    }

    private void ud(final int i2) {
        if (this.wd == null || !to()) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                ax.qdl((View) TTLandingPageActivity.this.wd, i2);
            }
        });
    }

    private void qdl(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.exu) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.exu == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.exu.setText(str);
            }
        });
    }
}
