package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
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
import com.bytedance.sdk.component.utils.zf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.aw;
import com.bytedance.sdk.openadsdk.common.bu;
import com.bytedance.sdk.openadsdk.common.co;
import com.bytedance.sdk.openadsdk.common.qt;
import com.bytedance.sdk.openadsdk.common.vr;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ac;
import com.bytedance.sdk.openadsdk.utils.bgr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.utils.tan;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {
    private wjv ac;
    private Button aw;
    private String ay;
    private com.bytedance.sdk.openadsdk.core.di.di bgr;
    private dzy bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private vr f18065co;
    private com.bytedance.sdk.component.jbs.di di;
    private int dw;
    private com.bytedance.sdk.openadsdk.common.fi dzy;
    private aw feb;
    private ILoader fr;
    private co hcw;
    private boolean ig;
    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ihz;
    TTAdDislikeToast ik;
    private ImageView jc;
    private ImageView kt;
    bu lr;
    private TextView mj;
    private int nr;
    private bgr oh;
    private com.bytedance.sdk.openadsdk.core.widget.ri.fi pv;
    com.bytedance.sdk.openadsdk.ka.aw ri;
    private Context sf;
    private String slm;
    private ImageView srn;
    private String tan;
    private String uq;
    private String vr;
    private com.bytedance.sdk.openadsdk.core.widget.ri.di.ri xd;
    private ImageView xha;
    private int zf;
    private boolean zyn;
    private final AtomicBoolean wjv = new AtomicBoolean(true);
    private final AtomicInteger su = new AtomicInteger(0);
    private final AtomicInteger igq = new AtomicInteger(0);
    private final AtomicInteger ory = new AtomicInteger(0);
    final AtomicBoolean ka = new AtomicBoolean(false);
    final AtomicBoolean fi = new AtomicBoolean(false);
    private boolean qd = false;
    private long tnn = 0;
    private String fe = "ダウンロード";

    public static class ik implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.common.fi> lr;
        private final WeakReference<com.bytedance.sdk.openadsdk.ka.aw> ri;

        public ik(com.bytedance.sdk.openadsdk.ka.aw awVar, com.bytedance.sdk.openadsdk.common.fi fiVar) {
            this.ri = new WeakReference<>(awVar);
            this.lr = new WeakReference<>(fiVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.ka.aw awVar = this.ri.get();
            if (awVar != null) {
                awVar.ri(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.fi fiVar = this.lr.get();
            if (fiVar == null) {
                return false;
            }
            fiVar.ri(motionEvent);
            return false;
        }
    }

    public static class lr implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.ka.aw> ri;

        public lr(com.bytedance.sdk.openadsdk.ka.aw awVar) {
            this.ri = new WeakReference<>(awVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            com.bytedance.sdk.openadsdk.ka.aw awVar = this.ri.get();
            if (awVar != null) {
                awVar.lr(i2);
            }
        }
    }

    public static class ri implements com.bytedance.sdk.openadsdk.ka.co {
        private final String ik;
        private final WeakReference<TTLandingPageActivity> ka;
        private final wjv lr;
        private final int ri;

        public ri(int i, wjv wjvVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.ri = i;
            this.lr = wjvVar;
            this.ik = str;
            this.ka = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.ka.co
        public void ri(int i) {
            TTLandingPageActivity tTLandingPageActivity = this.ka.get();
            if (tTLandingPageActivity != null) {
                com.bytedance.sdk.openadsdk.ka.ik.ri.ri(this.ri, tTLandingPageActivity.igq.get(), tTLandingPageActivity.ory.get(), tTLandingPageActivity.su.get() - tTLandingPageActivity.ory.get(), this.lr, this.ik, i);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        jbs();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        fi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.vr.fi()) {
            finish();
            return;
        }
        try {
            nr.lr(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        wjv wjvVarRi = dw.ri().ri(dw.ri(getIntent()));
        this.ac = wjvVarRi;
        if (wjvVarRi != null) {
            this.ig = wjvVarRi.bgr();
            this.ac.nd(0);
            if (com.bytedance.sdk.openadsdk.wjv.fi.ri("lp_cache_enable", false)) {
                ac.ri(this.ac);
            }
        }
        com.bytedance.sdk.openadsdk.bgr.lr.ri(this);
        this.uq = "";
        ri(4);
        wjv wjvVar = this.ac;
        if (wjvVar != null) {
            this.vr = wjvVar.tn();
            this.slm = this.ac.yjg();
            this.ay = this.ac.mvf();
            this.uq = this.ac.sf();
            this.nr = this.ac.aw();
            this.tan = this.ac.co();
        }
        try {
            setContentView(ri(this.uq));
            if (this.ac == null) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.wjv.fi.ri("lp_cache_enable", false)) {
                ka();
            }
            xha();
            if (!TextUtils.isEmpty(this.ay)) {
                this.fr = com.bytedance.sdk.openadsdk.xha.lr.ri().lr();
                int iRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.fr, this.ay);
                this.zf = iRi;
                this.dw = iRi > 0 ? 2 : 0;
            }
            this.sf = this;
            if (this.di != null) {
                com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(this).ri(false).lr(false).ri(this.di.getWebView());
            }
            if (this.zyn) {
                this.feb.ri(true);
            }
            com.bytedance.sdk.component.jbs.di diVar = this.di;
            if (diVar != null && diVar.getWebView() != null) {
                com.bytedance.sdk.openadsdk.ka.aw awVarLr = new com.bytedance.sdk.openadsdk.ka.aw(this.ac, this.di.getWebView(), new ri(this.zf, this.ac, "landingpage", this), this.dw).lr(true);
                this.ri = awVarLr;
                this.xd = awVarLr.ri;
                this.dzy = ig.ri(this.ac, this.di, this.sf, this.tan);
                this.ri.fi(this.qd);
                this.ac.tan(this.qd);
            }
            mj();
            com.bytedance.sdk.component.jbs.di diVar2 = this.di;
            if (diVar2 != null) {
                diVar2.setLandingPage(true);
                this.di.setTag("landingpage");
                this.di.setMaterialMeta(this.ac.nb());
            }
            com.bytedance.sdk.openadsdk.core.widget.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.widget.ri.fi(this.sf, this.bu, this.vr, this.dzy, this.ri, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.bgr != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.bgr.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.hcw != null) {
                        TTLandingPageActivity.this.hcw.lr();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.ay)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.su.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(TTLandingPageActivity.this.fr, TTLandingPageActivity.this.ay, str);
                        if (webResourceResponseModelRi != null && webResourceResponseModelRi.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.ory.incrementAndGet();
                            return webResourceResponseModelRi.getWebResourceResponse();
                        }
                        if (webResourceResponseModelRi != null && webResourceResponseModelRi.getMsg() == 2) {
                            TTLandingPageActivity.this.igq.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ac.ri("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.pv = fiVar;
            fiVar.ri(this.ac);
            this.pv.ri("landingpage");
            com.bytedance.sdk.component.jbs.di diVar3 = this.di;
            if (diVar3 != null) {
                diVar3.setWebViewClient(this.pv);
                com.bytedance.sdk.component.jbs.di diVar4 = this.di;
                if (diVar4 != null) {
                    diVar4.setUserAgentString(tan.ri(diVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.jbs.di diVar5 = this.di;
                if (diVar5 != null) {
                    diVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(this.ac, "landingpage", this.dw);
            if (this.di != null) {
                if (com.bytedance.sdk.openadsdk.wjv.fi.ri("lp_cache_enable", false) && this.qd) {
                    com.bytedance.sdk.openadsdk.ka.aw awVar = this.ri;
                    if (awVar != null) {
                        awVar.ik(this.uq);
                        this.ri.ka(this.uq);
                        this.ri.ri(this.uq, 0L);
                    }
                    co coVar = this.hcw;
                    if (coVar != null) {
                        coVar.lr();
                    }
                } else {
                    uq.ri(this.di, this.uq);
                }
                this.di.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(this.bu, this.ri, this.dzy) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.11
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                        if (TTLandingPageActivity.this.hcw != null) {
                            TTLandingPageActivity.this.hcw.ri(i);
                        }
                        if (TTLandingPageActivity.this.bgr != null && !TTLandingPageActivity.this.isFinishing()) {
                            if (i == 100 && TTLandingPageActivity.this.bgr.isShown()) {
                                TTLandingPageActivity.this.bgr.setVisibility(8);
                            } else {
                                TTLandingPageActivity.this.bgr.setProgress(i);
                            }
                        }
                        if (!TTLandingPageActivity.this.zyn || TTLandingPageActivity.this.feb == null) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - TTLandingPageActivity.this.tnn >= 200 || i == 100) {
                            TTLandingPageActivity.this.feb.ri(webView, TTLandingPageActivity.this.xd);
                            TTLandingPageActivity.this.tnn = jCurrentTimeMillis;
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.zyn) {
                            TTLandingPageActivity.this.feb.ri(str);
                            TTLandingPageActivity.this.feb.lr(webView.getUrl());
                        } else if (TTLandingPageActivity.this.mj != null) {
                            TextView textView = TTLandingPageActivity.this.mj;
                            if (TextUtils.isEmpty(str)) {
                                str = com.bytedance.sdk.component.utils.uq.ri(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }
                });
                if (this.di.getWebView() != null) {
                    this.di.getWebView().setOnScrollChangeListener(new lr(this.ri));
                    this.di.getWebView().setOnTouchListener(new ik(this.ri, this.dzy) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.12
                        private long fi;
                        private float ik;
                        private float ka;
                        private final int lr = nr.lr();
                        private float di = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        private float xha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

                        @Override // com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.ik, android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (!TTLandingPageActivity.this.zyn) {
                                return super.onTouch(view, motionEvent);
                            }
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    this.ik = motionEvent.getRawX();
                                    this.ka = motionEvent.getRawY();
                                    this.fi = System.currentTimeMillis();
                                } else if (actionMasked == 2) {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - this.ik) < this.lr) {
                                        Math.abs(rawY - this.ka);
                                    }
                                    this.di += Math.abs(motionEvent.getX() - this.ik);
                                    this.xha += Math.abs(motionEvent.getY() - this.ka);
                                    System.currentTimeMillis();
                                    if (rawY - this.ka > this.lr) {
                                        TTLandingPageActivity.this.feb.ri();
                                    }
                                    if (rawY - this.ka < (-this.lr)) {
                                        TTLandingPageActivity.this.feb.lr();
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                            return super.onTouch(view, motionEvent);
                        }
                    });
                }
                this.di.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.13
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        if (TTLandingPageActivity.this.ihz != null) {
                            TTLandingPageActivity.this.ihz.ri(TTLandingPageActivity.this.ac);
                        }
                    }
                });
            }
            fi();
            bgr bgrVarRi = com.bytedance.sdk.openadsdk.utils.jbs.ri(this, new com.bytedance.sdk.openadsdk.utils.jbs.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.14
                @Override // com.bytedance.sdk.openadsdk.utils.jbs.ri
                public View ri() {
                    return TTLandingPageActivity.this.xha;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.jbs.ri
                public void lr() {
                }
            });
            this.oh = bgrVarRi;
            bgrVarRi.ri(0L);
            com.bytedance.sdk.openadsdk.ka.ik.ri.ri(SystemClock.elapsedRealtime() - jElapsedRealtime, this.ac, "landingpage", this.fr, this.ay);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.jbs.di diVar;
        com.bytedance.sdk.component.jbs.di diVar2;
        super.onDestroy();
        if (com.bytedance.sdk.openadsdk.wjv.fi.ri("lp_cache_enable", false)) {
            wjv wjvVar = this.ac;
            if (wjvVar != null) {
                wjvVar.nd(0);
            }
            com.bytedance.sdk.openadsdk.ka.aw awVar = this.ri;
            if (awVar != null && (diVar2 = this.di) != null) {
                awVar.ri(diVar2);
            }
            if (this.di == null || TextUtils.isEmpty(this.uq)) {
                com.bytedance.sdk.component.jbs.di diVar3 = this.di;
                if (diVar3 != null) {
                    zf.ri(diVar3);
                }
            } else {
                Bundle bundle = new Bundle();
                if (this.di.getWebView() != null) {
                    this.di.getWebView().saveState(bundle);
                }
                ac.ri(System.identityHashCode(this.ac) + "_" + this.uq, this.di, bundle);
            }
            this.di = null;
        } else {
            com.bytedance.sdk.openadsdk.ka.aw awVar2 = this.ri;
            if (awVar2 != null && (diVar = this.di) != null) {
                awVar2.ri(diVar);
            }
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!com.bytedance.sdk.openadsdk.wjv.fi.ri("lp_cache_enable", false)) {
            com.bytedance.sdk.component.jbs.di diVar4 = this.di;
            if (diVar4 != null) {
                zf.ri(diVar4);
            }
            this.di = null;
        }
        dzy dzyVar = this.bu;
        if (dzyVar != null) {
            dzyVar.co();
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar3 = this.ri;
        if (awVar3 != null) {
            awVar3.ka(true);
        }
        if (!TextUtils.isEmpty(this.ay)) {
            com.bytedance.sdk.openadsdk.ka.ik.ri.ri(this.ory.get(), this.su.get(), this.ac);
        }
        com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.fr);
        bgr bgrVar = this.oh;
        if (bgrVar != null) {
            bgrVar.ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        bgr bgrVar = this.oh;
        if (bgrVar != null) {
            bgrVar.lr();
        }
        wjv wjvVar = this.ac;
        if (wjvVar != null) {
            wjvVar.xha(SystemClock.elapsedRealtime());
            this.ac.nd(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        wjv wjvVar = this.ac;
        if (wjvVar != null) {
            wjvVar.nd(1);
        }
        dzy dzyVar = this.bu;
        if (dzyVar != null) {
            dzyVar.sf();
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.ri;
        if (awVar != null) {
            awVar.xha();
        }
        bgr bgrVar = this.oh;
        if (bgrVar != null) {
            bgrVar.ri();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.ka.ri(this, this.ac);
        wjv wjvVar = this.ac;
        if (wjvVar != null) {
            wjvVar.nd(1);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        wjv wjvVar = this.ac;
        if (wjvVar != null) {
            wjvVar.nd(0);
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.ri;
        if (awVar != null) {
            awVar.mj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean ri() {
        return true;
    }

    private void aw() {
        TTAdDislikeToast tTAdDislikeToast = this.ik;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.ik) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void co() {
        try {
            if (this.lr == null) {
                bu buVar = new bu(this.sf, this.ac);
                this.lr = buVar;
                buVar.setDislikeSource("landing_page");
                this.lr.setCallback(new bu.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void lr(View view) {
                        TTLandingPageActivity.this.ka.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void ri(View view) {
                        TTLandingPageActivity.this.ka.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void ri(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.fi.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.fi.set(true);
                        TTLandingPageActivity.this.bgr();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.lr);
            if (this.ik == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.sf);
                this.ik = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private String di() {
        wjv wjvVar = this.ac;
        if (wjvVar != null && !TextUtils.isEmpty(wjvVar.skk())) {
            this.fe = this.ac.skk();
        }
        return this.fe;
    }

    private void fi() {
        wjv wjvVar = this.ac;
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        vr vrVar = this.f18065co;
        if (vrVar != null) {
            vrVar.setVisibility(0);
        }
        Button button = (Button) findViewById(slm.hws);
        this.aw = button;
        if (button != null) {
            lr(di());
            if (this.ihz == null) {
                this.ihz = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this, TextUtils.isEmpty(this.tan) ? ig.lr(this.nr) : this.tan);
            }
            com.bytedance.sdk.openadsdk.core.ik.ri riVar = new com.bytedance.sdk.openadsdk.core.ik.ri(this, this.ac, this.tan, this.nr);
            riVar.ri(false);
            this.aw.setOnClickListener(riVar);
            this.aw.setOnTouchListener(riVar);
            riVar.ik(true);
            riVar.ri(this.ihz);
        }
    }

    private void jbs() {
        if (qt() && !this.wjv.getAndSet(true)) {
            sf();
            ri(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    private void ka() {
        if (TextUtils.isEmpty(this.uq)) {
            return;
        }
        com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.15
            @Override // com.bytedance.sdk.openadsdk.nr.ka
            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                riVar.lr("lp_reuse");
                riVar.ka(TTLandingPageActivity.this.tan);
                riVar.ri(BuildConfig.VERSION_NAME);
                return riVar;
            }
        });
        if (!this.qd) {
            this.qd = false;
            com.bytedance.sdk.openadsdk.slm.ka.ri(false);
            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("lp_reuse");
                    riVar.ka(TTLandingPageActivity.this.tan);
                    riVar.ri(BuildConfig.VERSION_NAME);
                    return riVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.ka.aw awVar = this.ri;
            if (awVar != null) {
                awVar.fi(true);
                this.ac.tan(true);
            }
            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.16
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("lp_reuse");
                    riVar.ka(TTLandingPageActivity.this.tan);
                    riVar.ri(BuildConfig.VERSION_NAME);
                    return riVar;
                }
            });
            com.bytedance.sdk.openadsdk.slm.ka.ri(true);
        }
    }

    private void lr(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.aw) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.aw == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.aw.setText(str);
            }
        });
    }

    private void mj() {
        dzy dzyVar = new dzy(this);
        this.bu = dzyVar;
        dzyVar.lr(this.di).ik(this.vr).ka(this.slm).ri(this.ac).lr(this.nr).ri(this.ac.hd()).fi(this.ac.uo()).ri(this.di).lr("landingpage");
    }

    private boolean qt() {
        return !TextUtils.isEmpty(this.uq) && this.uq.contains("__luban_sdk");
    }

    private void sf() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.bu.ri("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void xha() {
        com.bytedance.sdk.component.jbs.di diVar = (com.bytedance.sdk.component.jbs.di) findViewById(slm.fe);
        this.di = diVar;
        ig.ri(this.ac, diVar);
        this.f18065co = (vr) findViewById(slm.gcp);
        vr vrVar = (vr) findViewById(slm.nd);
        co coVar = (co) findViewById(520093721);
        this.hcw = coVar;
        if (coVar != null) {
            coVar.ri(this.ac);
            this.hcw.ri();
        }
        if (vrVar != null) {
            vrVar.setVisibility(0);
        }
        if (this.zyn) {
            this.srn = (ImageView) findViewById(slm.ud);
        } else {
            this.srn = (ImageView) findViewById(520093720);
        }
        ImageView imageView = this.srn;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.di != null) {
                        if (TTLandingPageActivity.this.xd != null) {
                            TTLandingPageActivity.this.xd.ri();
                        }
                        if (!TTLandingPageActivity.this.di.jbs()) {
                            if (TTLandingPageActivity.this.zyn) {
                                return;
                            }
                            TTLandingPageActivity.this.finish();
                            return;
                        }
                        TTLandingPageActivity.this.di.qt();
                        if (TTLandingPageActivity.this.zyn) {
                            WebView webView = TTLandingPageActivity.this.di.getWebView();
                            if (TTLandingPageActivity.this.feb == null || webView == null) {
                                return;
                            }
                            TTLandingPageActivity.this.feb.ri(webView, TTLandingPageActivity.this.xd);
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(slm.hpn);
        this.jc = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.di == null || !TTLandingPageActivity.this.di.sf()) {
                        return;
                    }
                    TTLandingPageActivity.this.di.co();
                    if (TTLandingPageActivity.this.zyn) {
                        WebView webView = TTLandingPageActivity.this.di.getWebView();
                        if (TTLandingPageActivity.this.feb == null || webView == null) {
                            return;
                        }
                        TTLandingPageActivity.this.feb.ri(webView, TTLandingPageActivity.this.xd);
                    }
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.xha = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.mj = (TextView) findViewById(slm.nh);
        com.bytedance.sdk.openadsdk.core.di.di diVar2 = (com.bytedance.sdk.openadsdk.core.di.di) findViewById(slm.xe);
        this.bgr = diVar2;
        if (diVar2 != null) {
            diVar2.setVisibility(0);
        }
        this.kt = (ImageView) findViewById(520093740);
        if (this.zyn) {
            final com.bytedance.sdk.openadsdk.common.ac acVar = new com.bytedance.sdk.openadsdk.common.ac(this, false);
            ImageView imageView4 = this.kt;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        acVar.setOnMenuItemClickListener(new com.bytedance.sdk.openadsdk.common.ac.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7.1
                            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
                            public void ik() {
                                if (TTLandingPageActivity.this.di != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTLandingPageActivity.this.di.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.lr.ri(TTLandingPageActivity.this, intent, null);
                                    }
                                    acVar.ri();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
                            public void ka() {
                                TTLandingPageActivity.this.ik();
                                acVar.ri();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
                            public void lr() {
                                ClipboardManager clipboardManager;
                                if (TTLandingPageActivity.this.di != null) {
                                    String url = TTLandingPageActivity.this.di.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                acVar.ri();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.ac.ri
                            public void ri() {
                                com.bytedance.sdk.component.jbs.di diVar3 = TTLandingPageActivity.this.di;
                                if (diVar3 == null || diVar3.getUrl() == null) {
                                    return;
                                }
                                if (TTLandingPageActivity.this.bgr != null) {
                                    TTLandingPageActivity.this.bgr.setVisibility(0);
                                    TTLandingPageActivity.this.bgr.setProgress(0);
                                }
                                diVar3.xha();
                                String url = diVar3.getUrl();
                                if (url != null) {
                                    diVar3.a_(url);
                                }
                                acVar.ri();
                            }
                        });
                        acVar.ri(view);
                    }
                });
            }
        }
        View viewFindViewById = findViewById(slm.jxw);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.ik();
                }
            });
        }
    }

    public void ik() {
        if (isFinishing()) {
            return;
        }
        if (this.fi.get()) {
            aw();
            return;
        }
        if (this.lr == null) {
            co();
        }
        bu buVar = this.lr;
        if (buVar != null) {
            buVar.ri();
        }
    }

    private View ri(String str) {
        Bundle bundleRi;
        com.bytedance.sdk.component.jbs.di diVar;
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(this);
        if (Build.VERSION.SDK_INT >= 35) {
            ikVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(this);
        fiVar.setOrientation(1);
        ikVar.addView(fiVar, new FrameLayout.LayoutParams(-1, -1));
        boolean zOry = nr.ka().ory();
        this.zyn = zOry;
        wjv wjvVar = this.ac;
        if (wjvVar != null && zOry) {
            this.feb = new aw(this, wjvVar, this.tan, false);
        }
        View vrVar = new vr(this, new vr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.common.vr.ri
            public View ri(Context context) {
                return (TTLandingPageActivity.this.ac == null || !TTLandingPageActivity.this.zyn) ? new qt(context) : TTLandingPageActivity.this.feb.ka();
            }
        });
        vrVar.setId(slm.nd);
        fiVar.addView(vrVar, new LinearLayout.LayoutParams(-1, this.zyn ? -2 : qd.lr(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        fiVar.addView(ikVar2, layoutParams);
        if (!com.bytedance.sdk.openadsdk.wjv.fi.ri("lp_cache_enable", false) || TextUtils.isEmpty(str)) {
            bundleRi = null;
            diVar = null;
        } else {
            String str2 = System.identityHashCode(this.ac) + "_" + str;
            diVar = ac.ri(this, str2);
            bundleRi = ac.ri(str2);
        }
        if (diVar == null) {
            diVar = new com.bytedance.sdk.component.jbs.di(this, com.bytedance.sdk.component.jbs.di.ik.LANDING_PAGE);
        } else {
            if (bundleRi != null && diVar.getWebView() != null) {
                diVar.getWebView().restoreState(bundleRi);
            }
            this.qd = true;
        }
        diVar.setId(slm.fe);
        ikVar2.addView(diVar, new FrameLayout.LayoutParams(-1, -1));
        vr vrVar2 = new vr(this, new vr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.vr.ri
            public View ri(Context context) {
                return new com.bytedance.sdk.openadsdk.common.mj(context);
            }
        });
        vrVar2.setId(slm.gcp);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        ikVar2.addView(vrVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.di diVar2 = new com.bytedance.sdk.openadsdk.core.di.di(this, null, R.style.Widget.ProgressBar.Horizontal);
        diVar2.setId(slm.xe);
        diVar2.setProgress(1);
        diVar2.setVisibility(8);
        diVar2.setProgressDrawable(sf.ri(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, qd.lr(this, 3.0f));
        layoutParams3.gravity = 49;
        ikVar2.addView(diVar2, layoutParams3);
        co coVar = new co(this);
        coVar.setOnlyLoading(this.ig);
        coVar.setId(520093721);
        ikVar.addView(coVar, new FrameLayout.LayoutParams(-1, -1));
        return ikVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void lr() {
        jbs();
    }

    private void ri(final int i) {
        if (this.xha == null || !qt()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                qd.ri((View) TTLandingPageActivity.this.xha, i);
            }
        });
    }
}
