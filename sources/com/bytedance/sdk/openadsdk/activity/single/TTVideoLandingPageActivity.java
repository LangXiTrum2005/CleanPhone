package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.vr;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.ka.aw;
import com.bytedance.sdk.openadsdk.ka.co;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.utils.tan;
import com.bytedance.sdk.openadsdk.utils.uq;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.sf.ka {
    protected com.bytedance.sdk.openadsdk.core.widget.ri ay;
    protected com.bytedance.sdk.openadsdk.core.bgr.lr.di bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected FrameLayout f18067co;
    protected String di;
    protected com.bytedance.sdk.openadsdk.ihz.ri.ri.ik dw;
    protected String feb;
    protected Context fi;
    protected TextView fr;
    protected String hcw;
    protected int ig;
    protected vr igq;
    protected ImageView ik;
    protected TextView ka;
    protected ImageView lr;
    protected dzy mj;
    protected com.bytedance.sdk.openadsdk.tan.ik.ri qd;
    protected com.bytedance.sdk.component.jbs.di ri;
    private int rzk;
    protected int sf;
    protected wjv slm;
    protected aw srn;
    protected TextView su;
    private ILoader ta;
    protected RelativeLayout uq;
    protected long vr;
    protected TextView wjv;
    protected String xha;
    private int xm;
    protected Button zf;
    protected com.bytedance.sdk.openadsdk.core.widget.ri.di.ri zyn;
    protected int aw = -1;
    protected int bu = 0;
    protected int nr = 0;
    protected int tan = 0;
    protected int ac = 0;
    protected String ihz = "ダウンロード";
    protected boolean ory = false;
    protected boolean oh = false;
    protected boolean xd = true;
    protected boolean dzy = false;
    protected String pv = null;
    protected AtomicBoolean jc = new AtomicBoolean(true);
    protected JSONArray kt = null;
    private final AtomicInteger bnj = new AtomicInteger(0);
    private final AtomicInteger siy = new AtomicInteger(0);
    private final AtomicInteger whw = new AtomicInteger(0);
    int tnn = -1;
    protected com.bytedance.sdk.openadsdk.core.ik.ri fe = null;
    private final euthanasia.attabal.dern qh = new euthanasia.attabal.dern() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.11
        @Override // euthanasia.attabal.dern
        public void ri(boolean z) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.ory = z;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z) {
                qd.ri((View) TTVideoLandingPageActivity.this.ri, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f18067co.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.tan;
                marginLayoutParams.height = tTVideoLandingPageActivity2.ac;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.nr;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.bu;
                tTVideoLandingPageActivity2.f18067co.setLayoutParams(marginLayoutParams);
                return;
            }
            qd.ri((View) TTVideoLandingPageActivity.this.ri, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f18067co.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.nr = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.bu = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.tan = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.ac = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.f18067co.setLayoutParams(marginLayoutParams2);
        }
    };
    private final su.ri gcp = new su.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.su.ri
        public void ri(Context context, Intent intent, boolean z, final int i) {
            com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    ri(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ri(int i) {
            com.bytedance.sdk.component.jbs.di diVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.ig == 0 && i != 0 && (diVar = tTVideoLandingPageActivity.ri) != null && (str = tTVideoLandingPageActivity.pv) != null) {
                diVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar2 = TTVideoLandingPageActivity.this.bgr;
            if (diVar2 != null && diVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.oh && tTVideoLandingPageActivity2.ig != i) {
                    tTVideoLandingPageActivity2.bgr.getNativeVideoController().ik(i);
                }
            }
            TTVideoLandingPageActivity.this.ig = i;
        }
    };

    public static class ri extends AsyncTask<Void, Void, Drawable> {
        private final WeakReference<euthanasia.saneness> lr;
        private final Bitmap ri;

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapRi = com.bytedance.sdk.component.adexpress.ka.ri.ri(nr.ri(), this.ri, 25);
                if (bitmapRi == null) {
                    return null;
                }
                return new BitmapDrawable(nr.ri().getResources(), bitmapRi);
            } catch (Throwable th) {
                ac.ik("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        private ri(Bitmap bitmap, euthanasia.saneness sanenessVar) {
            this.ri = bitmap;
            this.lr = new WeakReference<>(sanenessVar);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<euthanasia.saneness> weakReference;
            if (drawable == null || (weakReference = this.lr) == null || weakReference.get() == null) {
                return;
            }
            this.lr.get().ri(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ac() {
        return !TextUtils.isEmpty(this.pv) && this.pv.contains("__luban_sdk");
    }

    private void bgr() {
        wjv wjvVar = this.slm;
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        this.igq.setVisibility(0);
        Button button = (Button) findViewById(slm.hws);
        this.zf = button;
        if (button != null) {
            ri(ka());
            this.zf.setOnClickListener(this.fe);
            this.zf.setOnTouchListener(this.fe);
        }
    }

    private void bu() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar == null || diVar.getNativeVideoController() == null || tan()) {
            return;
        }
        this.bgr.bgr();
    }

    private void ihz() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.mj.ri("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void nr() {
        if (this.bgr == null || tan()) {
            return;
        }
        this.bgr.bgr();
    }

    private void slm() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar;
        if (this.ory && (diVar = this.bgr) != null && diVar.getNativeVideoController() != null) {
            this.bgr.getNativeVideoController().fi(null, null);
            this.ory = false;
        } else if (!ac() || this.jc.getAndSet(true)) {
            super.onBackPressed();
        } else {
            ihz();
            ri(0);
        }
    }

    private boolean tan() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar == null || diVar.getNativeVideoController() == null) {
            return true;
        }
        return this.bgr.getNativeVideoController().aw();
    }

    private void vr() {
        dzy dzyVar = new dzy(this);
        this.mj = dzyVar;
        dzyVar.lr(this.ri).ik(this.di).ka(this.xha).lr(this.sf).ri(this.slm).ri(this.slm.hd()).ri(this.ri).lr("landingpage_split_screen").fi(this.slm.uo());
    }

    public void aw() {
        try {
            su.ri(this.gcp);
        } catch (Exception unused) {
        }
    }

    public void co() {
        su.ri(this.gcp, this.fi);
    }

    public abstract View ik();

    public int jbs() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar == null || diVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.bgr.getNativeVideoController().qt();
    }

    public long mj() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar == null || diVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.bgr.getNativeVideoController().jbs();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        slm();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bgr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strXh;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.vr.fi()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            nr.lr(this);
        } catch (Throwable unused2) {
        }
        this.ig = com.bytedance.sdk.component.utils.nr.ik(getApplicationContext());
        try {
            setContentView(ik());
            this.fi = this;
            Intent intent = getIntent();
            this.dzy = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.vr = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            wjv wjvVarRi = dw.ri().ri(dw.ri(intent));
            this.slm = wjvVarRi;
            if (wjvVarRi != null) {
                this.aw = wjvVarRi.vz();
                this.di = this.slm.tn();
                this.xha = this.slm.yjg();
                strXh = this.slm.xh();
                this.feb = this.slm.mvf();
                this.pv = this.slm.sf();
                this.sf = this.slm.aw();
                this.hcw = this.slm.co();
            } else {
                strXh = null;
            }
            String strRi = strXh;
            if (this.slm == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.feb)) {
                this.ta = com.bytedance.sdk.openadsdk.xha.lr.ri().lr();
                int iRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.ta, this.feb);
                this.xm = iRi;
                this.rzk = iRi > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.qd = com.bytedance.sdk.openadsdk.tan.ik.ri.ri(new JSONObject(stringExtra));
                } catch (Exception unused3) {
                }
                com.bytedance.sdk.openadsdk.tan.ik.ri riVar = this.qd;
                if (riVar != null) {
                    this.vr = riVar.xha;
                }
            }
            if (bundle != null) {
                this.slm = dw.ri().ri(bundle.getInt("meta_index", -1));
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.vr = j;
                }
            }
            fi();
            sf();
            vr();
            ri(4);
            if (this.ri != null) {
                com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(this.fi).ri(true).lr(false).ri(this.ri.getWebView());
                aw awVarLr = new aw(this.slm, this.ri.getWebView(), new co() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.ka.co
                    public void ri(int i) {
                        com.bytedance.sdk.openadsdk.ka.ik.ri.ri(TTVideoLandingPageActivity.this.xm, TTVideoLandingPageActivity.this.whw.get(), TTVideoLandingPageActivity.this.siy.get(), TTVideoLandingPageActivity.this.bnj.get() - TTVideoLandingPageActivity.this.siy.get(), TTVideoLandingPageActivity.this.slm, "landingpage_split_screen", i);
                    }
                }, this.rzk).lr(true);
                this.srn = awVarLr;
                this.zyn = awVarLr.ri;
                awVarLr.ri("landingpage_split_screen");
            }
            com.bytedance.sdk.component.jbs.di diVar = this.ri;
            if (diVar != null) {
                diVar.setLandingPage(true);
                this.ri.setTag("landingpage_split_screen");
                this.ri.setMaterialMeta(this.slm.nb());
                this.ri.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.ri.fi(this.fi, this.mj, this.di, this.srn, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.feb)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.bnj.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(TTVideoLandingPageActivity.this.ta, TTVideoLandingPageActivity.this.feb, str);
                            if (webResourceResponseModelRi != null && webResourceResponseModelRi.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.siy.incrementAndGet();
                                return webResourceResponseModelRi.getWebResourceResponse();
                            }
                            if (webResourceResponseModelRi != null && webResourceResponseModelRi.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.whw.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            ac.ri("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.jbs.di diVar2 = this.ri;
                diVar2.setUserAgentString(tan.ri(diVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.jbs.di diVar3 = this.ri;
            if (diVar3 != null) {
                diVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(this.slm, "landingpage_split_screen", this.rzk);
            uq.ri(this.ri, this.pv);
            this.ri.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(this.mj, this.srn) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.ri.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar = tTVideoLandingPageActivity.dw;
                    if (ikVar != null) {
                        ikVar.ri(tTVideoLandingPageActivity.slm);
                    }
                }
            });
            TextView textView = this.ka;
            if (textView != null) {
                if (TextUtils.isEmpty(strRi)) {
                    strRi = com.bytedance.sdk.component.utils.uq.ri(this, "tt_web_title_default");
                }
                textView.setText(strRi);
            }
            co();
            di();
            bgr();
            com.bytedance.sdk.openadsdk.ka.ik.ri.ri(SystemClock.elapsedRealtime() - jElapsedRealtime, this.slm, "landingpage_split_screen", this.ta, this.feb);
        } catch (Throwable unused4) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        aw();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.slm.bgr(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.jbs.di diVar = this.ri;
        if (diVar != null) {
            srn.ri(diVar.getWebView());
        }
        this.ri = null;
        dzy dzyVar = this.mj;
        if (dzyVar != null) {
            dzyVar.co();
        }
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar2 = this.bgr;
        if (diVar2 != null && diVar2.getNativeVideoController() != null) {
            this.bgr.getNativeVideoController().fi();
        }
        this.bgr = null;
        this.slm = null;
        aw awVar = this.srn;
        if (awVar != null) {
            awVar.ka(true);
        }
        if (!TextUtils.isEmpty(this.feb)) {
            com.bytedance.sdk.openadsdk.ka.ik.ri.ri(this.siy.get(), this.bnj.get(), this.slm);
        }
        com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.ta);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        nr();
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar == null || diVar.getNativeVideoController() == null) {
            return;
        }
        ri(this.bgr.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.xd) {
            bu();
        }
        this.xd = false;
        dzy dzyVar = this.mj;
        if (dzyVar != null) {
            dzyVar.sf();
        }
        aw awVar = this.srn;
        if (awVar != null) {
            awVar.xha();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iRi = this.slm != null ? dw.ri().ri(this.slm) : -1;
        this.tnn = iRi;
        bundle.putInt("meta_index", iRi);
        bundle.putLong("video_play_position", this.vr);
        bundle.putBoolean("is_complete", this.oh);
        long jDi = this.vr;
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar != null && diVar.getNativeVideoController() != null) {
            jDi = this.bgr.getNativeVideoController().di();
        }
        bundle.putLong("video_play_position", jDi);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.tnn >= 0) {
            dw.ri().ik(this.tnn);
            this.tnn = -1;
        }
        com.bytedance.sdk.openadsdk.utils.ka.ri(this, this.slm);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        aw awVar = this.srn;
        if (awVar != null) {
            awVar.mj();
        }
    }

    public void qt() {
        String strTpb;
        wjv wjvVar = this.slm;
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        qd.ri((View) this.uq, 0);
        if (!TextUtils.isEmpty(this.slm.xh())) {
            strTpb = this.slm.xh();
        } else if (TextUtils.isEmpty(this.slm.tq())) {
            strTpb = !TextUtils.isEmpty(this.slm.tpb()) ? this.slm.tpb() : "";
        } else {
            strTpb = this.slm.tq();
        }
        if (this.slm.fb() != null && this.slm.fb().ri() != null) {
            qd.ri((View) this.ay, 0);
            qd.ri((View) this.wjv, 4);
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.slm.fb(), this.ay, this.slm);
        } else if (!TextUtils.isEmpty(strTpb)) {
            qd.ri((View) this.ay, 4);
            qd.ri((View) this.wjv, 0);
            this.wjv.setText(strTpb.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.slm.skk())) {
            this.su.setText(this.slm.skk());
        }
        if (!TextUtils.isEmpty(strTpb)) {
            this.fr.setText(strTpb);
        }
        qd.ri((View) this.fr, 0);
        qd.ri((View) this.su, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean ri() {
        return true;
    }

    public void sf() {
        if (this.slm == null) {
            return;
        }
        this.dw = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this, this.hcw);
        com.bytedance.sdk.openadsdk.core.ik.ri riVar = new com.bytedance.sdk.openadsdk.core.ik.ri(this, this.slm, this.hcw, this.sf);
        this.fe = riVar;
        riVar.ri(false);
        this.fe.ik(true);
        this.su.setOnClickListener(this.fe);
        this.su.setOnTouchListener(this.fe);
        this.fe.ri(this.dw);
    }

    public abstract boolean xha();

    public void di() {
        if (xha()) {
            try {
                com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = new com.bytedance.sdk.openadsdk.core.bgr.lr.di(this.fi, this.slm, true, null);
                this.bgr = diVar;
                if (diVar.getNativeVideoController() != null) {
                    this.bgr.getNativeVideoController().ri(false);
                }
                if (this.oh) {
                    this.f18067co.setVisibility(0);
                    this.f18067co.removeAllViews();
                    this.f18067co.addView(this.bgr);
                    this.bgr.lr(true);
                } else {
                    if (!this.dzy) {
                        this.vr = 0L;
                    }
                    if (this.qd != null && this.bgr.getNativeVideoController() != null) {
                        this.bgr.getNativeVideoController().ik(this.qd.xha);
                        this.bgr.getNativeVideoController().ka(this.qd.fi);
                        this.bgr.ri(nr.ka().ik(String.valueOf(this.slm.ur())), "landingPageInit");
                    }
                    if (this.bgr.ri(this.vr, this.xd, this.oh)) {
                        this.f18067co.setVisibility(0);
                        this.f18067co.removeAllViews();
                        this.f18067co.addView(this.bgr);
                    }
                    if (this.bgr.getNativeVideoController() != null) {
                        this.bgr.getNativeVideoController().ri(false);
                        this.bgr.getNativeVideoController().ri(this.qh);
                    }
                }
                String strRi = this.slm.rbz().get(0).ri();
                com.bytedance.sdk.openadsdk.qt.ka.ri().ri(strRi).ri(this.slm.rbz().get(0).lr()).lr(this.slm.rbz().get(0).ik()).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri())).ik(2).ri(new com.bytedance.sdk.openadsdk.qt.lr(this.slm, strRi, new com.bytedance.sdk.component.fi.slm() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(sf sfVar) {
                        try {
                            Object objLr = sfVar.lr();
                            if (objLr instanceof Bitmap) {
                                new ri((Bitmap) objLr, TTVideoLandingPageActivity.this.bgr.getNativeVideoController().co()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.bgr.findViewById(520093726).setOnTouchListener(null);
                this.bgr.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e) {
                ac.ik("TTVideoLandingPage", e.getMessage());
                if (this.bgr == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.ig == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.uq.ri(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void fi() {
        this.igq = (vr) findViewById(slm.gcp);
        this.ri = (com.bytedance.sdk.component.jbs.di) findViewById(slm.fe);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.lr = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObjectRi;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.ri != null) {
                        com.bytedance.sdk.openadsdk.core.widget.ri.di.ri riVar = tTVideoLandingPageActivity.zyn;
                        if (riVar != null) {
                            riVar.ri();
                        }
                        if (TTVideoLandingPageActivity.this.ri.jbs()) {
                            TTVideoLandingPageActivity.this.ri.qt();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.ac()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = TTVideoLandingPageActivity.this.bgr;
                        if (diVar == null || diVar.getNativeVideoController() == null) {
                            jSONObjectRi = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectRi = ig.ri(tTVideoLandingPageActivity2.slm, tTVideoLandingPageActivity2.bgr.getNativeVideoController().xha(), TTVideoLandingPageActivity.this.bgr.getNativeVideoController().sf());
                        }
                        JSONObject jSONObject = jSONObjectRi;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.ka.ik.ri(tTVideoLandingPageActivity3.slm, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.mj(), TTVideoLandingPageActivity.this.jbs(), jSONObject, (com.bytedance.sdk.openadsdk.ka.xha) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar != null) {
            diVar.setIsAutoPlay(this.dzy);
        }
        ImageView imageView2 = (ImageView) findViewById(slm.srn);
        this.ik = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObjectRi;
                    com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar2 = TTVideoLandingPageActivity.this.bgr;
                    if (diVar2 != null) {
                        if (diVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectRi = ig.ri(tTVideoLandingPageActivity.slm, tTVideoLandingPageActivity.bgr.getNativeVideoController().xha(), TTVideoLandingPageActivity.this.bgr.getNativeVideoController().sf());
                        } else {
                            jSONObjectRi = null;
                        }
                        JSONObject jSONObject = jSONObjectRi;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.ka.ik.ri(tTVideoLandingPageActivity2.slm, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.mj(), TTVideoLandingPageActivity.this.jbs(), jSONObject, (com.bytedance.sdk.openadsdk.ka.xha) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.ka = (TextView) findViewById(slm.nh);
        this.f18067co = (FrameLayout) findViewById(slm.qd);
        this.uq = (RelativeLayout) findViewById(slm.jc);
        this.wjv = (TextView) findViewById(slm.feb);
        this.fr = (TextView) findViewById(slm.zyn);
        this.su = (TextView) findViewById(slm.tnn);
        this.ay = (com.bytedance.sdk.openadsdk.core.widget.ri) findViewById(slm.kt);
        qt();
    }

    public String ka() {
        wjv wjvVar = this.slm;
        if (wjvVar != null && !TextUtils.isEmpty(wjvVar.skk())) {
            this.ihz = this.slm.skk();
        }
        return this.ihz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void lr() {
        slm();
    }

    private void ri(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.zf) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.zf == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.zf.setText(str);
            }
        });
    }

    private void ri(euthanasia.attabal attabalVar) {
        this.oh = this.oh || attabalVar.aw();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.oh));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(attabalVar.di()));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(attabalVar.jbs() + attabalVar.xha()));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_duration", Long.valueOf(attabalVar.jbs()));
    }

    private void ri(final int i) {
        if (this.ik == null || !ac()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                qd.ri((View) TTVideoLandingPageActivity.this.ik, i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.sf.ka
    public void ri(boolean z, JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.kt = jSONArray;
    }
}
