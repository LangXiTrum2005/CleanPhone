package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bu;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.jbs.co;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.core.zf;
import com.bytedance.sdk.openadsdk.utils.pv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.X3;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements igq.ri, com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri {
    private static com.bytedance.sdk.openadsdk.ri.ka.lr sf;
    private float ac;
    private com.bytedance.sdk.openadsdk.component.di.lr aw;
    private com.bytedance.sdk.openadsdk.ri.ka.lr ay;
    private bu bgr;
    private boolean dw;
    private boolean dzy;
    private AdSlot hcw;
    private int igq;
    private boolean ihz;
    protected boolean mj;
    private com.bytedance.sdk.openadsdk.ka.xha nr;
    private com.bytedance.sdk.openadsdk.component.ik ory;
    private int su;
    private float tan;
    private int uq;
    private TTAdDislikeToast vr;
    private wjv wjv;
    private long xd;
    private FrameLayout zf;
    protected final AtomicBoolean ri = new AtomicBoolean(false);
    protected final igq lr = new igq(Looper.getMainLooper(), this);
    final AtomicBoolean ik = new AtomicBoolean(false);
    final AtomicBoolean ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.mj.ri f18062co = new com.bytedance.sdk.openadsdk.component.mj.ri();
    protected boolean fi = false;
    private final AtomicBoolean slm = new AtomicBoolean(false);
    private pv bu = pv.ik();
    private final AtomicBoolean fr = new AtomicBoolean(false);
    long di = 0;
    private volatile boolean oh = false;
    int xha = -1;
    private final com.bytedance.sdk.openadsdk.component.ri pv = new com.bytedance.sdk.openadsdk.component.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.ri
        public void fi() {
            TTAppOpenAdActivity.this.uq();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri
        public void ik() {
            TTAppOpenAdActivity.this.xha();
            TTAppOpenAdActivity.this.bu.fi();
            TTAppOpenAdActivity.this.tan();
            if (TTAppOpenAdActivity.this.ihz) {
                TTAppOpenAdActivity.this.aw();
            }
            if (TTAppOpenAdActivity.this.ory.xha() == null || TTAppOpenAdActivity.this.ory.xha().lr() == null) {
                return;
            }
            TTAppOpenAdActivity.this.ory.xha().lr().ri(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri
        public void ka() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri, euthanasia.attabal.wireman
        public void lr(long j, int i) {
            com.bytedance.sdk.openadsdk.component.mj.ik ikVarXha;
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j);
            sb.append("], percent = [");
            sb.append(i);
            sb.append(X3.j.e);
            if (TTAppOpenAdActivity.this.ory != null && (ikVarXha = TTAppOpenAdActivity.this.ory.xha()) != null) {
                TTAppOpenAdActivity.this.fr();
                ikVarXha.ri(true);
            }
            TTAppOpenAdActivity.this.wjv();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri, euthanasia.attabal.wireman
        public void ri() {
            TTAppOpenAdActivity.this.fr();
            TTAppOpenAdActivity.this.wjv();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri, euthanasia.attabal.wireman
        public void ri(long j, long j2) {
            TTAppOpenAdActivity.this.f18062co.ik(j);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.fi && tTAppOpenAdActivity.ory != null && TTAppOpenAdActivity.this.ory.xha() != null && TTAppOpenAdActivity.this.ory.xha().fi()) {
                TTAppOpenAdActivity.this.ory.xha().mj();
            }
            TTAppOpenAdActivity.this.bgr();
            if (TTAppOpenAdActivity.this.ory instanceof com.bytedance.sdk.openadsdk.component.lr) {
                ((com.bytedance.sdk.openadsdk.component.lr) TTAppOpenAdActivity.this.ory).ri(j, j2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri, com.bytedance.sdk.openadsdk.component.di.ri
        public void lr(View view) {
            TTAppOpenAdActivity.this.ik();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri, com.bytedance.sdk.openadsdk.component.di.ri
        public void lr() {
            TTAppOpenAdActivity.this.oh = true;
            if (com.bytedance.sdk.openadsdk.wjv.fi.ri("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.mj();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri, com.bytedance.sdk.openadsdk.component.di.ri
        public void ri(View view) {
            TTAppOpenAdActivity.this.ay();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ri, com.bytedance.sdk.openadsdk.component.di.ri
        public void ri(int i, boolean z) {
            if (TTAppOpenAdActivity.this.ory != null) {
                TTAppOpenAdActivity.this.ory.ri(i, z);
            }
        }
    };
    private final Runnable ig = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
            com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
            if (TTAppOpenAdActivity.this.slm.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.wjv != null && (kaVarQc = TTAppOpenAdActivity.this.wjv.qc()) != null && (kaVarRi = kaVarQc.ri()) != null) {
                kaVarRi.ri(0L);
            }
            TTAppOpenAdActivity.this.nr = new com.bytedance.sdk.openadsdk.ka.xha();
            TTAppOpenAdActivity.this.nr.ri(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.bu.fi();
            if (TTAppOpenAdActivity.this.aw != null) {
                TTAppOpenAdActivity.this.aw.lr();
            }
            if (TTAppOpenAdActivity.this.ory != null) {
                TTAppOpenAdActivity.this.ory.fi();
            }
            TTAppOpenAdActivity.this.ihz();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException unused) {
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.su);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.ihz ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.jbs.mj.ik() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.dw || TTAppOpenAdActivity.this.wjv.zyu()) {
                if (TTAppOpenAdActivity.this.ac() || com.bytedance.sdk.openadsdk.component.xha.ri.sf()) {
                    jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.nr());
                } else {
                    jSONObject2.put("dynamic_show_type", 1);
                }
                TTAppOpenAdActivity.this.ri(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.wjv.ory() ? 1 : 0);
            JSONObject jSONObject3 = new JSONObject();
            if (TTAppOpenAdActivity.this.su == 1) {
                jSONObject3.putOpt("cache_duration", Long.valueOf(System.currentTimeMillis() - TTAppOpenAdActivity.this.xd));
            }
            if (TTAppOpenAdActivity.this.wjv != null) {
                int iQt = TTAppOpenAdActivity.this.wjv.qt();
                jSONObject3.putOpt("start_type", Integer.valueOf(iQt == 1 ? 1 : 2));
                jSONObject3.putOpt("load_index", Integer.valueOf(iQt));
            }
            jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.xha.ri.ka()));
            jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.xha.ri.lr()));
            com.bytedance.sdk.openadsdk.ka.ik.ri(TTAppOpenAdActivity.this.wjv, "open_ad", jSONObject2, jSONObject3);
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.wjv, new com.bytedance.sdk.openadsdk.ay.lr.fi.ri(TTAppOpenAdActivity.this.nr()));
            com.bytedance.sdk.openadsdk.ay.ri.ik.ri(TTAppOpenAdActivity.this.wjv);
            TTAppOpenAdActivity.this.slm.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qd.ri((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                qd.ri((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        ac.ik("TTAppOpenAdActivity", e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        bu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        wjv wjvVar;
        super.onCreate(bundle);
        nr.lr(getApplicationContext());
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z = true;
        }
        this.dzy = z;
        ac.ri("BVA", "onCreate: isEnableNewArch = " + this.dzy);
        if (!lr(bundle)) {
            finish();
            return;
        }
        if (!vr.fi()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.ka.ik.lr(this.wjv, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.ihz = wjv.fi(this.wjv);
        new StringBuilder("onCreate: isVideo is ").append(this.ihz);
        if (!this.ihz || (wjvVar = this.wjv) == null) {
            this.f18062co.ri(nr.ka().wjv(String.valueOf(this.uq)));
        } else {
            this.f18062co.ri((float) wjvVar.eu().beachfront());
        }
        com.bytedance.sdk.openadsdk.component.di.lr lrVar = new com.bytedance.sdk.openadsdk.component.di.lr(this.f18062co);
        this.aw = lrVar;
        lrVar.ri(this.pv);
        jbs();
        FrameLayout frameLayout = new FrameLayout(this);
        this.zf = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.zf);
            this.zf.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (TTAppOpenAdActivity.this.wjv == null) {
                            TTAppOpenAdActivity.this.finish();
                            return;
                        }
                        int iHpn = TTAppOpenAdActivity.this.wjv.hpn();
                        boolean z2 = false;
                        if (com.bytedance.sdk.openadsdk.component.xha.ri.sf()) {
                            TTAppOpenAdActivity.this.dw = iHpn != 1;
                            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity.ory = new com.bytedance.sdk.openadsdk.component.lr(tTAppOpenAdActivity, tTAppOpenAdActivity.wjv, TTAppOpenAdActivity.this.zf, TTAppOpenAdActivity.this.pv, TTAppOpenAdActivity.this.igq, TTAppOpenAdActivity.this.ihz, TTAppOpenAdActivity.this.f18062co, TTAppOpenAdActivity.this.aw);
                            if (!TTAppOpenAdActivity.this.dw || !TTAppOpenAdActivity.this.ac()) {
                                TTAppOpenAdActivity.this.wjv.nr(1);
                                TTAppOpenAdActivity.this.wjv.tan(1);
                            }
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            if (tTAppOpenAdActivity2.wjv.ajz() == 2 && iHpn != 1) {
                                z2 = true;
                            }
                            tTAppOpenAdActivity2.dw = z2;
                            if (TTAppOpenAdActivity.this.dw && TTAppOpenAdActivity.this.ac()) {
                                TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity3.ory = new com.bytedance.sdk.openadsdk.component.lr(tTAppOpenAdActivity3, tTAppOpenAdActivity3.wjv, TTAppOpenAdActivity.this.zf, TTAppOpenAdActivity.this.pv, TTAppOpenAdActivity.this.igq, TTAppOpenAdActivity.this.ihz, TTAppOpenAdActivity.this.f18062co, TTAppOpenAdActivity.this.aw);
                            } else {
                                TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity4.ory = new com.bytedance.sdk.openadsdk.component.ik(tTAppOpenAdActivity4, tTAppOpenAdActivity4.wjv, TTAppOpenAdActivity.this.zf, TTAppOpenAdActivity.this.pv, TTAppOpenAdActivity.this.igq, TTAppOpenAdActivity.this.ihz, TTAppOpenAdActivity.this.f18062co);
                                TTAppOpenAdActivity.this.ory.ri(TTAppOpenAdActivity.this.ac, TTAppOpenAdActivity.this.tan);
                            }
                        }
                        TTAppOpenAdActivity.this.ory.ri((ViewGroup) TTAppOpenAdActivity.this.zf);
                        TTAppOpenAdActivity.this.ory.ri();
                        TTAppOpenAdActivity.this.ory.lr();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        ac.ik("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.mj = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.3
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
            com.bytedance.sdk.openadsdk.slm.ka.lr();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        AdSlot adSlot;
        super.onDestroy();
        if (this.wjv != null) {
            com.bytedance.sdk.openadsdk.di.lr.ri().ri("videoForceBreak", this.wjv);
        }
        this.lr.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.di.lr lrVar = this.aw;
        if (lrVar != null) {
            lrVar.fi();
        }
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.wjv);
        com.bytedance.sdk.openadsdk.ay.ri.ik.lr(this.wjv);
        if (this.ihz) {
            com.bytedance.sdk.openadsdk.component.ka.ri.ri(this.wjv, this.f18062co.ka(), this.f18062co.lr(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.ka.ri.ri(this.wjv, -1L, this.f18062co.lr(), false);
        }
        if (this.bu.di() && this.slm.get()) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(String.valueOf(this.bu.ka()), this.wjv, "open_ad", this.nr);
            this.bu = pv.ik();
        }
        com.bytedance.sdk.openadsdk.component.ik ikVar = this.ory;
        if (ikVar != null) {
            ikVar.ik();
        }
        mj();
        sf = null;
        if (this.dzy && !TextUtils.isEmpty(this.qt)) {
            dw.ri().ri(this.qt, isFinishing(), isChangingConfigurations());
        }
        this.ay = null;
        bu buVar = this.bgr;
        if (buVar != null) {
            buVar.setCallback(null);
        }
        wjv wjvVar = this.wjv;
        if (wjvVar == null || wjv.di(wjvVar) || this.wjv.bl() || (adSlot = this.hcw) == null) {
            return;
        }
        adSlot.setCacheScene(1);
        com.bytedance.sdk.openadsdk.component.di.ri(nr.ri()).ri(this.hcw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.fi = false;
        fi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.ik ikVar;
        super.onResume();
        this.fi = true;
        if (this.ri.getAndSet(true)) {
            if (!this.fr.get()) {
                ka();
                return;
            }
            wjv();
            if (this.ihz && (ikVar = this.ory) != null && ikVar.xha() != null) {
                fr();
                this.ory.xha().ri(3);
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
            this.xha = this.wjv != null ? dw.ri().ri(this.wjv) : -1;
            if (!TextUtils.isEmpty(this.qt)) {
                bundle.putString("single_process_listener_key", this.qt);
            }
            bundle.putBoolean("enable_new_arch", this.dzy);
            bundle.putInt("meta_index", this.xha);
            bundle.putInt("ad_source", this.su);
            bundle.putLong("start_show_time", this.di);
            bundle.putLong("cache_time", this.xd);
        } catch (Throwable th) {
            ac.ik("TTAppOpenAdActivity", th.getMessage());
        }
        if (!this.dzy) {
            sf = this.ay;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.xha >= 0) {
            dw.ri().ik(this.xha);
            this.xha = -1;
        }
        com.bytedance.sdk.openadsdk.utils.ka.ri(this, this.wjv);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.dw) {
                this.bu.fi();
            }
            wjv wjvVar = this.wjv;
            if (wjvVar != null && wjvVar.nhl() && !this.wjv.igq()) {
                this.wjv.xha(true);
                wjv wjvVar2 = this.wjv;
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar2, "open_ad", wjvVar2.wzv());
            }
        } else if (this.slm.get()) {
            if (this.bu.di()) {
                com.bytedance.sdk.openadsdk.ka.ik.ri(String.valueOf(this.bu.ka()), this.wjv, "open_ad", this.nr);
            }
            this.bu = pv.ik();
        }
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.wjv, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.ay.ri.ik.ri(this.wjv, z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean ri() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ac() {
        if (!this.wjv.oh()) {
            return false;
        }
        int iHpn = this.wjv.hpn();
        return ((iHpn == 0 || iHpn == 9) && (com.bytedance.sdk.component.adexpress.ri.lr.ik.ri(co.ik(), "3.1.78") || com.bytedance.sdk.component.adexpress.ri.lr.ik.ri(co.ka(), "3.1.78"))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        if (!this.ihz || this.wjv.ory() || this.oh) {
            return;
        }
        this.lr.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ay() {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        com.bytedance.sdk.openadsdk.component.ik ikVar;
        zf.ik(this.uq);
        wjv();
        if (this.ihz && (ikVar = this.ory) != null && ikVar.xha() != null) {
            fr();
            this.ory.xha().ri(4);
        }
        com.bytedance.sdk.openadsdk.component.ka.ri.ri(this.wjv, (int) this.f18062co.ik(), this.aw.ri(), this.f18062co.lr());
        wjv wjvVar = this.wjv;
        if (wjvVar != null && (kaVarQc = wjvVar.qc()) != null && (kaVarRi = kaVarQc.ri()) != null) {
            com.bytedance.sdk.openadsdk.component.ik ikVar2 = this.ory;
            long jAw = (ikVar2 == null || ikVar2.xha() == null) ? 0L : this.ory.xha().aw();
            kaVarRi.di(jAw);
            kaVarRi.fi(jAw);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        if (!this.ihz || this.wjv.ory()) {
            return;
        }
        this.lr.removeMessages(100);
    }

    private void bu() {
        if (nr.ka().ihz(String.valueOf(this.uq)) == 1) {
            if (this.f18062co.ik() >= ((long) nr.ka().uq(String.valueOf(this.uq))) * 1000) {
                ay();
            }
        }
    }

    private void co() {
        if (this.bgr == null) {
            bu buVar = new bu(this, this.wjv);
            this.bgr = buVar;
            buVar.setDislikeSource("video_player");
            this.bgr.setCallback(new bu.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                public void lr(View view) {
                    TTAppOpenAdActivity.this.ik.set(false);
                    TTAppOpenAdActivity.this.ka();
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(TTAppOpenAdActivity.this.wjv, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                public void ri(View view) {
                    TTAppOpenAdActivity.this.ik.set(true);
                    TTAppOpenAdActivity.this.fi();
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(TTAppOpenAdActivity.this.wjv, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                public void ri(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.ka.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.ka.set(true);
                    TTAppOpenAdActivity.this.slm();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.bgr);
        if (this.vr == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.vr = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fr() {
        wjv wjvVar;
        try {
            if (this.aw == null || (wjvVar = this.wjv) == null || wjvVar.cmy() == null) {
                return;
            }
            int iLr = this.wjv.cmy().lr();
            if (iLr == 1 || iLr == 2) {
                this.aw.ri(iLr, this.wjv.cmy().ri(), false);
                com.bytedance.sdk.openadsdk.component.ik ikVar = this.ory;
                if (ikVar == null || ikVar.xha() == null) {
                    return;
                }
                this.ory.xha().lr().ri(this.f18062co.ri());
                this.ory.xha().lr().ri(1.0f);
            }
        } catch (Throwable th) {
            ac.ik("TTAppOpenAdActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ihz() {
        com.bytedance.sdk.openadsdk.ri.ka.lr lrVar = this.ay;
        if (lrVar != null) {
            lrVar.ri();
        }
    }

    private void jbs() {
        if (26 != Build.VERSION.SDK_INT) {
            this.igq = this.wjv.bbu();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.igq = 1;
        } else {
            this.igq = 2;
        }
        qt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mj() {
        ac.ri("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.ri.ka.lr lrVar = this.ay;
        if (lrVar != null) {
            lrVar.ik();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int nr() {
        if (this.wjv.zyu()) {
            return 5;
        }
        if (this.dw) {
            return this.ory.ka();
        }
        return -1;
    }

    private void qt() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.igq);
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            if (i == 27) {
                try {
                    sf();
                } catch (Throwable th) {
                    ac.ik("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                sf();
            }
        }
        Pair<Integer, Integer> pairSf = qd.sf(getApplicationContext());
        if (this.igq == 2) {
            iMin = Math.max(((Integer) pairSf.first).intValue(), ((Integer) pairSf.second).intValue());
            iMax = Math.min(((Integer) pairSf.first).intValue(), ((Integer) pairSf.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairSf.first).intValue(), ((Integer) pairSf.second).intValue());
            iMax = Math.max(((Integer) pairSf.first).intValue(), ((Integer) pairSf.second).intValue());
        }
        this.tan = iMax;
        this.ac = iMin;
        float fRi = qd.ri();
        if (qd.ik((Activity) this)) {
            int i2 = this.igq;
            if (i2 == 1) {
                this.tan -= fRi;
            } else if (i2 == 2) {
                this.ac -= fRi;
            }
        }
        com.bytedance.sdk.openadsdk.component.ik ikVar = this.ory;
        if (ikVar != null) {
            ikVar.ri(this.ac, this.tan);
        }
    }

    private void sf() {
        if (this.igq != 2) {
            setRequestedOrientation(1);
        } else if (di()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.igq == 2 || !qd.ik((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slm() {
        this.vr.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tan() {
        if (this.slm.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.ig);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq() {
        com.bytedance.sdk.openadsdk.component.mj.ik ikVarXha;
        com.bytedance.sdk.openadsdk.ri.ka.lr lrVar = this.ay;
        if (lrVar != null) {
            lrVar.onAdClicked();
        }
        if (sf.lr().ay(String.valueOf(this.uq))) {
            this.fr.set(true);
        }
        com.bytedance.sdk.openadsdk.component.ik ikVar = this.ory;
        if (ikVar == null || (ikVarXha = ikVar.xha()) == null) {
            return;
        }
        ikVarXha.slm();
    }

    private void vr() {
        this.vr.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wjv() {
        com.bytedance.sdk.openadsdk.ri.ka.lr lrVar = this.ay;
        if (lrVar != null) {
            lrVar.lr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xha() {
        wjv wjvVar = this.wjv;
        int iUq = (wjvVar == null || wjvVar.lr() < 0) ? nr.ka().uq(String.valueOf(this.uq)) : this.wjv.lr();
        this.aw.ri(this.f18062co.lr());
        this.aw.lr(iUq);
    }

    public boolean di() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e) {
            ac.ik("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    public void fi() {
        if (this.ihz) {
            com.bytedance.sdk.openadsdk.component.ik ikVar = this.ory;
            if (ikVar != null && ikVar.xha() != null && this.ory.xha().fi()) {
                this.ory.xha().mj();
            }
            bgr();
        }
        com.bytedance.sdk.openadsdk.component.di.lr lrVar = this.aw;
        if (lrVar != null) {
            lrVar.ka();
        }
    }

    public void ik() {
        if (isFinishing()) {
            return;
        }
        if (this.ka.get()) {
            vr();
            return;
        }
        if (this.bgr == null) {
            try {
                co();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        bu buVar = this.bgr;
        if (buVar != null) {
            buVar.ri();
        }
    }

    public void ka() {
        if (this.ik.get()) {
            return;
        }
        if (this.ihz) {
            com.bytedance.sdk.openadsdk.component.ik ikVar = this.ory;
            if (ikVar != null && ikVar.xha() != null && this.ory.xha().di()) {
                this.ory.xha().sf();
            }
            aw();
        }
        com.bytedance.sdk.openadsdk.component.di.lr lrVar = this.aw;
        if (lrVar != null) {
            lrVar.ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void lr() {
        bu();
    }

    private boolean lr(Bundle bundle) {
        String stringExtra;
        this.wjv = dw.ri().ri(dw.ri(getIntent()));
        if (this.dzy) {
            if (bundle != null) {
                stringExtra = bundle.getString("single_process_listener_key");
            } else {
                stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            }
            this.qt = stringExtra;
            this.ay = (com.bytedance.sdk.openadsdk.ri.ka.lr) dw.ri().ri(this.qt, com.bytedance.sdk.openadsdk.ri.ka.lr.class);
        } else {
            this.ay = dw.ri().ka();
        }
        dw.ri().fi();
        ri(getIntent());
        ri(bundle);
        wjv wjvVar = this.wjv;
        if (wjvVar == null) {
            finish();
            return false;
        }
        this.hcw = wjvVar.eb();
        this.wjv.ri(this.di);
        this.uq = this.wjv.ur();
        com.bytedance.sdk.openadsdk.utils.lr.ri(this.wjv);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ri(JSONObject jSONObject) {
        if (nr() == 0) {
            return this.ory.ri(jSONObject);
        }
        return null;
    }

    public void ri(Intent intent) {
        if (intent != null) {
            this.su = intent.getIntExtra("ad_source", 0);
            this.xd = intent.getLongExtra("cache_time", 0L);
            this.di = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void ri(Bundle bundle) {
        if (bundle != null) {
            if (!this.dzy && this.ay == null) {
                this.ay = sf;
                sf = null;
            }
            try {
                int i = bundle.getInt("meta_index", -1);
                this.su = bundle.getInt("ad_source", 0);
                this.di = bundle.getLong("start_show_time", 0L);
                this.xd = bundle.getLong("cache_time", 0L);
                this.wjv = dw.ri().ri(i);
            } catch (Throwable th) {
                ac.ik("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        com.bytedance.sdk.openadsdk.component.ik ikVar;
        if (message.what == 100) {
            if (this.ihz && (ikVar = this.ory) != null && ikVar.xha() != null) {
                fr();
                this.ory.xha().ri(1);
            }
            wjv wjvVar = this.wjv;
            if (wjvVar != null && (kaVarQc = wjvVar.qc()) != null && (kaVarRi = kaVarQc.ri()) != null) {
                kaVarRi.ri(com.bytedance.sdk.openadsdk.core.aw.ri.ri.GENERAL_LINEAR_AD_ERROR);
            }
            wjv();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri
    public void ri(int i) {
        if (i == 2 || i == 3 || i == 4) {
            fr();
        }
    }
}
