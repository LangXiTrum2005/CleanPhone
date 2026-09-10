package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bjy;
import com.bytedance.sdk.openadsdk.core.bqt;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.p004ironsource.d9;
import com.p004ironsource.sv;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements koa.qdl, com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl {
    private static com.bytedance.sdk.openadsdk.qdl.mml.ud to;
    private boolean aaj;
    private IListenerManager bch;
    private int bqt;
    private AdSlot ekw;
    private float exc;
    private bjy exu;
    private com.bytedance.sdk.openadsdk.component.mo.ud fs;
    private boolean hzv;
    private float jl;
    private int jyq;
    private com.bytedance.sdk.openadsdk.component.lnr kdv;
    private int koa;
    private ljh ljh;
    private String oth;
    private boolean rc;
    private TTAdDislikeToast rdp;
    private com.bytedance.sdk.openadsdk.qdl.mml.ud uw;
    private FrameLayout vu;
    private com.bytedance.sdk.openadsdk.mml.wd yt;
    protected final AtomicBoolean qdl = new AtomicBoolean(false);
    protected final koa ud = new koa(Looper.getMainLooper(), this);
    final AtomicBoolean lnr = new AtomicBoolean(false);
    final AtomicBoolean mml = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.jpc.qdl rq = new com.bytedance.sdk.openadsdk.component.jpc.qdl();
    protected boolean mzz = false;
    private final AtomicBoolean bjy = new AtomicBoolean(false);
    private mrf jtx = mrf.lnr();
    private final AtomicBoolean xmv = new AtomicBoolean(false);
    long mo = 0;
    private volatile boolean hkc = false;
    int wd = -1;
    private final com.bytedance.sdk.openadsdk.component.qdl fco = new com.bytedance.sdk.openadsdk.component.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.qdl
        public void lnr() {
            TTAppOpenAdActivity.this.jpc();
            TTAppOpenAdActivity.this.jtx.mzz();
            TTAppOpenAdActivity.this.aaj();
            if (TTAppOpenAdActivity.this.aaj) {
                TTAppOpenAdActivity.this.rdp();
            }
            if (TTAppOpenAdActivity.this.kdv.wd() == null || TTAppOpenAdActivity.this.kdv.wd().ud() == null) {
                return;
            }
            TTAppOpenAdActivity.this.kdv.wd().ud().qdl(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl
        public void mml() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl
        public void mzz() {
            TTAppOpenAdActivity.this.oth();
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
        public void qdl() {
            TTAppOpenAdActivity.this.uw();
            TTAppOpenAdActivity.this.ljh();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
        public void ud(long j, int i2) {
            com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVarWd;
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j);
            sb.append("], percent = [");
            sb.append(i2);
            sb.append(d9.i.f24752e);
            if (TTAppOpenAdActivity.this.kdv != null && (lnrVarWd = TTAppOpenAdActivity.this.kdv.wd()) != null) {
                TTAppOpenAdActivity.this.uw();
                lnrVarWd.qdl(true);
            }
            TTAppOpenAdActivity.this.ljh();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
        public void qdl(long j, long j2) {
            TTAppOpenAdActivity.this.rq.ud(j);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.mzz && tTAppOpenAdActivity.kdv != null && TTAppOpenAdActivity.this.kdv.wd() != null && TTAppOpenAdActivity.this.kdv.wd().mzz()) {
                TTAppOpenAdActivity.this.kdv.wd().jpc();
            }
            TTAppOpenAdActivity.this.bjy();
            if (TTAppOpenAdActivity.this.kdv instanceof com.bytedance.sdk.openadsdk.component.ud) {
                ((com.bytedance.sdk.openadsdk.component.ud) TTAppOpenAdActivity.this.kdv).qdl(j, j2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl, com.bytedance.sdk.openadsdk.component.mo.qdl
        public void ud(View view) {
            TTAppOpenAdActivity.this.lnr();
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl, com.bytedance.sdk.openadsdk.component.mo.qdl
        public void ud() {
            TTAppOpenAdActivity.this.hkc = true;
            if (com.bytedance.sdk.openadsdk.jyq.qdl.qdl("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.tvp();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl, com.bytedance.sdk.openadsdk.component.mo.qdl
        public void qdl(View view) {
            TTAppOpenAdActivity.this.bch();
        }

        @Override // com.bytedance.sdk.openadsdk.component.qdl, com.bytedance.sdk.openadsdk.component.mo.qdl
        public void qdl(int i2, boolean z2) {
            if (TTAppOpenAdActivity.this.kdv != null) {
                TTAppOpenAdActivity.this.kdv.qdl(i2, z2);
            }
        }
    };
    private final Runnable mrf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
            com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
            if (TTAppOpenAdActivity.this.bjy.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.ljh != null && (mmlVarZm = TTAppOpenAdActivity.this.ljh.zm()) != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                mmlVarQdl.qdl(0L);
            }
            TTAppOpenAdActivity.this.yt = new com.bytedance.sdk.openadsdk.mml.wd();
            TTAppOpenAdActivity.this.yt.qdl(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.jtx.mzz();
            if (TTAppOpenAdActivity.this.fs != null) {
                TTAppOpenAdActivity.this.fs.ud();
            }
            if (TTAppOpenAdActivity.this.kdv != null) {
                TTAppOpenAdActivity.this.kdv.mzz();
            }
            TTAppOpenAdActivity.this.jyq();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e2) {
                    Log.e("TTAppOpenAdActivity", "run: ", e2);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.bqt);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.aaj ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.tvp.jpc.lnr() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.rc || TTAppOpenAdActivity.this.ljh.vxm()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.exc());
                TTAppOpenAdActivity.this.qdl(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.ljh.xmv() ? 1 : 0);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(TTAppOpenAdActivity.this.ljh, "open_ad", jSONObject2, (JSONObject) null);
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.ljh, new com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(TTAppOpenAdActivity.this.exc()));
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(TTAppOpenAdActivity.this.ljh);
            TTAppOpenAdActivity.this.bjy.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ax.qdl((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i2) {
                if (i2 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ax.qdl((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e2) {
                        aaj.lnr("TTAppOpenAdActivity", e2.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        jl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yt.ud(getApplicationContext());
        boolean z2 = false;
        if (bundle != null) {
            z2 = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z2 = true;
        }
        this.hzv = z2;
        aaj.qdl("BVA", "onCreate: isEnableNewArch = " + this.hzv);
        if (!ud(bundle)) {
            finish();
            return;
        }
        if (!rdp.mzz()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.mml.lnr.ud(this.ljh, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.aaj = ljh.mzz(this.ljh);
        new StringBuilder("onCreate: isVideo is ").append(this.aaj);
        if (this.aaj) {
            this.rq.qdl((float) this.ljh.tdy().mo());
        } else {
            this.rq.qdl(yt.mml().ljh(String.valueOf(this.jyq)));
        }
        com.bytedance.sdk.openadsdk.component.mo.ud udVar = new com.bytedance.sdk.openadsdk.component.mo.ud(this.rq);
        this.fs = udVar;
        udVar.qdl(this.fco);
        to();
        FrameLayout frameLayout = new FrameLayout(this);
        this.vu = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.vu);
            this.vu.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                /* JADX WARN: Code duplicated, block: B:11:0x0026  */
                @Override // java.lang.Runnable
                public void run() {
                    boolean z3;
                    try {
                        int iRa = TTAppOpenAdActivity.this.ljh.ra();
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        if (tTAppOpenAdActivity.ljh == null || TTAppOpenAdActivity.this.ljh.dk() != 2) {
                            z3 = false;
                        } else {
                            z3 = true;
                            if (iRa == 1) {
                                z3 = false;
                            }
                        }
                        tTAppOpenAdActivity.rc = z3;
                        if (TTAppOpenAdActivity.this.rc) {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.kdv = new com.bytedance.sdk.openadsdk.component.ud(tTAppOpenAdActivity2, tTAppOpenAdActivity2.ljh, TTAppOpenAdActivity.this.vu, TTAppOpenAdActivity.this.fco, TTAppOpenAdActivity.this.koa, TTAppOpenAdActivity.this.aaj, TTAppOpenAdActivity.this.rq, TTAppOpenAdActivity.this.fs);
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity3.kdv = new com.bytedance.sdk.openadsdk.component.lnr(tTAppOpenAdActivity3, tTAppOpenAdActivity3.ljh, TTAppOpenAdActivity.this.vu, TTAppOpenAdActivity.this.fco, TTAppOpenAdActivity.this.koa, TTAppOpenAdActivity.this.aaj, TTAppOpenAdActivity.this.rq);
                            TTAppOpenAdActivity.this.kdv.qdl(TTAppOpenAdActivity.this.exc, TTAppOpenAdActivity.this.jl);
                        }
                        TTAppOpenAdActivity.this.kdv.qdl((ViewGroup) TTAppOpenAdActivity.this.vu);
                        TTAppOpenAdActivity.this.kdv.qdl();
                        TTAppOpenAdActivity.this.kdv.ud();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        aaj.lnr("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.bjy.lnr.ud();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.ljh != null) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoForceBreak", this.ljh);
        }
        this.ud.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.mo.ud udVar = this.fs;
        if (udVar != null) {
            udVar.mzz();
        }
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.ljh);
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud(this.ljh);
        if (this.aaj) {
            com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(this.ljh, this.rq.lnr(), this.rq.ud(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(this.ljh, -1L, this.rq.ud(), false);
        }
        if (this.jtx.mo() && this.bjy.get()) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(String.valueOf(this.jtx.mml()), this.ljh, "open_ad", this.yt);
            this.jtx = mrf.lnr();
        }
        com.bytedance.sdk.openadsdk.component.lnr lnrVar = this.kdv;
        if (lnrVar != null) {
            lnrVar.lnr();
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("recycleRes");
        }
        tvp();
        to = null;
        if (this.hzv && !TextUtils.isEmpty(this.tvp)) {
            com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(this.tvp, isFinishing(), isChangingConfigurations());
        }
        this.uw = null;
        bjy bjyVar = this.exu;
        if (bjyVar != null) {
            bjyVar.setCallback(null);
        }
        ljh ljhVar = this.ljh;
        if (ljhVar == null || ljh.wd(ljhVar) || this.ljh.ilu()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.mo.qdl(yt.qdl()).qdl(this.ekw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mzz = false;
        mzz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.lnr lnrVar;
        super.onResume();
        this.mzz = true;
        if (this.qdl.getAndSet(true)) {
            if (!this.xmv.get()) {
                mml();
                return;
            }
            ljh();
            if (this.aaj && (lnrVar = this.kdv) != null && lnrVar.wd() != null) {
                uw();
                this.kdv.wd().qdl(3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.wd = this.ljh != null ? com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(this.ljh) : -1;
            if (!TextUtils.isEmpty(this.tvp)) {
                bundle.putString("single_process_listener_key", this.tvp);
            }
            bundle.putBoolean("enable_new_arch", this.hzv);
            bundle.putInt("meta_index", this.wd);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.oth);
            bundle.putInt("ad_source", this.bqt);
            bundle.putLong("start_show_time", this.mo);
        } catch (Throwable th) {
            aaj.lnr("TTAppOpenAdActivity", th.getMessage());
        }
        if (!this.hzv) {
            to = this.uw;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.wd >= 0) {
            com.bytedance.sdk.openadsdk.core.koa.qdl().lnr(this.wd);
            this.wd = -1;
        }
        com.bytedance.sdk.openadsdk.utils.mml.qdl(this, this.ljh);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            if (!this.rc) {
                this.jtx.mzz();
            }
            ljh ljhVar = this.ljh;
            if (ljhVar != null && ljhVar.jwd() && !this.ljh.ljh()) {
                this.ljh.mo(true);
                ljh ljhVar2 = this.ljh;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar2, "open_ad", ljhVar2.fo());
            }
        } else if (this.bjy.get()) {
            if (this.jtx.mo()) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(String.valueOf(this.jtx.mml()), this.ljh, "open_ad", this.yt);
            }
            this.jtx = mrf.lnr();
        }
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.ljh, z2 ? 4 : 8);
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(this.ljh, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean qdl() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aaj() {
        if (this.bjy.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.mrf);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bch() {
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        com.bytedance.sdk.openadsdk.component.lnr lnrVar;
        bqt.lnr(this.jyq);
        ljh();
        if (this.aaj && (lnrVar = this.kdv) != null && lnrVar.wd() != null) {
            uw();
            this.kdv.wd().qdl(4);
        }
        com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(this.ljh, (int) this.rq.lnr(), this.fs.qdl(), this.rq.ud());
        ljh ljhVar = this.ljh;
        if (ljhVar != null && (mmlVarZm = ljhVar.zm()) != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
            com.bytedance.sdk.openadsdk.component.lnr lnrVar2 = this.kdv;
            long jExu = (lnrVar2 == null || lnrVar2.wd() == null) ? 0L : this.kdv.wd().exu();
            mmlVarQdl.mo(jExu);
            mmlVarQdl.mzz(jExu);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bjy() {
        if (!this.aaj || this.ljh.xmv()) {
            return;
        }
        this.ud.removeMessages(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int exc() {
        if (this.ljh.vxm()) {
            return 5;
        }
        if (this.rc) {
            return this.kdv.mml();
        }
        return -1;
    }

    private void exu() {
        if (this.exu == null) {
            bjy bjyVar = new bjy(this, this.ljh);
            this.exu = bjyVar;
            bjyVar.setDislikeSource("video_player");
            this.exu.setCallback(new bjy.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                public void qdl(View view) {
                    TTAppOpenAdActivity.this.lnr.set(true);
                    TTAppOpenAdActivity.this.mzz();
                    com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(TTAppOpenAdActivity.this.ljh, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                public void ud(View view) {
                    TTAppOpenAdActivity.this.lnr.set(false);
                    TTAppOpenAdActivity.this.mml();
                    com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(TTAppOpenAdActivity.this.ljh, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                public void qdl(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.mml.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.mml.set(true);
                    TTAppOpenAdActivity.this.yt();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.exu);
        if (this.rdp == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.rdp = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    private void fs() {
        if (this.koa != 2) {
            setRequestedOrientation(1);
        } else if (wd()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.koa == 2 || !ax.lnr((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    private void jl() {
        if (yt.mml().jyq(String.valueOf(this.jyq)) == 1) {
            if (this.rq.lnr() >= ((long) yt.mml().oth(String.valueOf(this.jyq))) * 1000) {
                bch();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpc() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        ljh ljhVar = this.ljh;
        int iOth = (ljhVar == null || ljhVar.ud() < 0) ? yt.mml().oth(String.valueOf(this.jyq)) : this.ljh.ud();
        this.fs.qdl(this.rq.ud());
        this.fs.ud(iOth);
    }

    private void jtx() {
        this.rdp.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyq() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mml.ud udVar = this.uw;
        if (udVar != null) {
            udVar.qdl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ljh() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mml.ud udVar = this.uw;
        if (udVar != null) {
            udVar.ud();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oth() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl(sv.f);
        } else {
            com.bytedance.sdk.openadsdk.qdl.mml.ud udVar = this.uw;
            if (udVar != null) {
                udVar.onAdClicked();
            }
        }
        if (rq.lnr().bch(String.valueOf(this.jyq))) {
            this.xmv.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rdp() {
        if (!this.aaj || this.ljh.xmv() || this.hkc) {
            return;
        }
        this.ud.sendEmptyMessageDelayed(100, 5000L);
    }

    private void rq() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.koa);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 != 26) {
            if (i2 == 27) {
                try {
                    fs();
                } catch (Throwable th) {
                    aaj.lnr("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                fs();
            }
        }
        Pair<Integer, Integer> pairRq = ax.rq(getApplicationContext());
        if (this.koa == 2) {
            iMin = Math.max(((Integer) pairRq.first).intValue(), ((Integer) pairRq.second).intValue());
            iMax = Math.min(((Integer) pairRq.first).intValue(), ((Integer) pairRq.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairRq.first).intValue(), ((Integer) pairRq.second).intValue());
            iMax = Math.max(((Integer) pairRq.first).intValue(), ((Integer) pairRq.second).intValue());
        }
        this.jl = iMax;
        this.exc = iMin;
        float fQdl = ax.qdl();
        if (ax.lnr((Activity) this)) {
            int i3 = this.koa;
            if (i3 == 1) {
                this.jl -= fQdl;
            } else if (i3 == 2) {
                this.exc -= fQdl;
            }
        }
        com.bytedance.sdk.openadsdk.component.lnr lnrVar = this.kdv;
        if (lnrVar != null) {
            lnrVar.qdl(this.exc, this.jl);
        }
    }

    private void to() {
        if (26 != Build.VERSION.SDK_INT) {
            this.koa = this.ljh.jb();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.koa = 1;
        } else {
            this.koa = 2;
        }
        rq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tvp() {
        aaj.qdl("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdTimeOver");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mml.ud udVar = this.uw;
        if (udVar != null) {
            udVar.lnr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uw() {
        ljh ljhVar;
        try {
            if (this.fs == null || (ljhVar = this.ljh) == null || ljhVar.eu() == null) {
                return;
            }
            int iUd = this.ljh.eu().ud();
            if (iUd == 1 || iUd == 2) {
                this.fs.qdl(iUd, this.ljh.eu().qdl(), false);
                com.bytedance.sdk.openadsdk.component.lnr lnrVar = this.kdv;
                if (lnrVar == null || lnrVar.wd() == null) {
                    return;
                }
                this.kdv.wd().ud().qdl(this.rq.qdl());
                this.kdv.wd().ud().qdl(1.0f);
            }
        } catch (Throwable th) {
            aaj.lnr("TTAppOpenAdActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yt() {
        this.rdp.show(TTAdDislikeToast.getDislikeSendTip());
    }

    public void lnr() {
        if (isFinishing()) {
            return;
        }
        if (this.mml.get()) {
            jtx();
            return;
        }
        if (this.exu == null) {
            try {
                exu();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        bjy bjyVar = this.exu;
        if (bjyVar != null) {
            bjyVar.qdl();
        }
    }

    public void mml() {
        if (this.lnr.get()) {
            return;
        }
        if (this.aaj) {
            com.bytedance.sdk.openadsdk.component.lnr lnrVar = this.kdv;
            if (lnrVar != null && lnrVar.wd() != null && this.kdv.wd().mo()) {
                this.kdv.wd().rq();
            }
            rdp();
        }
        com.bytedance.sdk.openadsdk.component.mo.ud udVar = this.fs;
        if (udVar != null) {
            udVar.lnr();
        }
    }

    public IListenerManager mo() {
        if (this.bch == null) {
            this.bch = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(7));
        }
        return this.bch;
    }

    public void mzz() {
        if (this.aaj) {
            com.bytedance.sdk.openadsdk.component.lnr lnrVar = this.kdv;
            if (lnrVar != null && lnrVar.wd() != null && this.kdv.wd().mzz()) {
                this.kdv.wd().jpc();
            }
            bjy();
        }
        com.bytedance.sdk.openadsdk.component.mo.ud udVar = this.fs;
        if (udVar != null) {
            udVar.mml();
        }
    }

    public boolean wd() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e2) {
            aaj.lnr("TTAppOpenAdActivity", e2.getMessage());
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ud() {
        jl();
    }

    private boolean ud(Bundle bundle) {
        String stringExtra;
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra2 != null) {
                    try {
                        this.ljh = com.bytedance.sdk.openadsdk.core.ud.qdl(new JSONObject(stringExtra2));
                    } catch (Exception e2) {
                        aaj.lnr("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e2);
                    }
                }
                this.oth = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.ljh = com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(com.bytedance.sdk.openadsdk.core.koa.qdl(getIntent()));
            if (this.hzv) {
                if (bundle != null) {
                    stringExtra = bundle.getString("single_process_listener_key");
                } else {
                    stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
                }
                this.tvp = stringExtra;
                this.uw = (com.bytedance.sdk.openadsdk.qdl.mml.ud) com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(this.tvp, com.bytedance.sdk.openadsdk.qdl.mml.ud.class);
            } else {
                this.uw = com.bytedance.sdk.openadsdk.core.koa.qdl().mml();
            }
            com.bytedance.sdk.openadsdk.core.koa.qdl().mzz();
        }
        qdl(getIntent());
        qdl(bundle);
        ljh ljhVar = this.ljh;
        if (ljhVar == null) {
            finish();
            return false;
        }
        this.ekw = ljhVar.ji();
        this.ljh.qdl(this.mo);
        this.jyq = this.ljh.fz();
        com.bytedance.sdk.openadsdk.utils.ud.qdl(this.ljh);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject qdl(JSONObject jSONObject) {
        if (exc() == 0) {
            return this.kdv.qdl(jSONObject);
        }
        return null;
    }

    private void qdl(final String str) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.mo().executeAppOpenAdCallback(TTAppOpenAdActivity.this.oth, str);
                } catch (Throwable th) {
                    aaj.lnr("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void qdl(Intent intent) {
        if (intent != null) {
            this.bqt = intent.getIntExtra("ad_source", 0);
            this.mo = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void qdl(Bundle bundle) {
        if (bundle != null) {
            if (!this.hzv && this.uw == null) {
                this.uw = to;
                to = null;
            }
            try {
                int i2 = bundle.getInt("meta_index", -1);
                this.oth = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.bqt = bundle.getInt("ad_source", 0);
                this.mo = bundle.getLong("start_show_time", 0L);
                this.ljh = com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(i2);
            } catch (Throwable th) {
                aaj.lnr("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        com.bytedance.sdk.openadsdk.component.lnr lnrVar;
        if (message.what == 100) {
            if (this.aaj && (lnrVar = this.kdv) != null && lnrVar.wd() != null) {
                uw();
                this.kdv.wd().qdl(1);
            }
            ljh ljhVar = this.ljh;
            if (ljhVar != null && (mmlVarZm = ljhVar.zm()) != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                mmlVarQdl.qdl(com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.GENERAL_LINEAR_AD_ERROR);
            }
            ljh();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl
    public void qdl(int i2) {
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            uw();
        }
    }
}
