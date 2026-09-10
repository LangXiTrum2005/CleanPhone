package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.core.widget.qt;
import com.bytedance.sdk.openadsdk.ka.aw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.google.android.material.card.MaterialCardView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements igq.ri, com.bytedance.sdk.openadsdk.core.bgr.ka.lr, com.bytedance.sdk.openadsdk.core.ik.ka {
    private static final com.bytedance.sdk.openadsdk.uq.xha.ri kt = new com.bytedance.sdk.openadsdk.uq.xha.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.1
    };
    private dzy ac;
    private com.bytedance.sdk.openadsdk.core.di.ka aw;
    private com.bytedance.sdk.openadsdk.core.di.ka bgr;
    private String bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.di.ka f18066co;
    private com.bytedance.sdk.component.jbs.di di;
    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik dw;
    private wjv fr;
    private String hcw;
    private ILoader ig;
    private boolean igq;
    private int ihz;
    private aw jc;
    TTAdDislikeToast lr;
    private String nr;
    private com.bytedance.sdk.openadsdk.uq.mj pv;
    ory ri;
    private qt slm;
    private com.bytedance.sdk.openadsdk.ka.ka.fi srn;
    private dzy tan;
    private com.bytedance.sdk.openadsdk.uq.ri.ri tnn;
    private String uq;
    private Context vr;
    private String wjv;
    private boolean zf;
    private boolean zyn;
    private boolean xha = true;
    private boolean mj = false;
    private boolean sf = true;
    final AtomicBoolean ik = new AtomicBoolean(false);
    private final String ay = "embeded_ad";
    private final igq su = new igq(Looper.getMainLooper(), this);
    private final AtomicBoolean ory = new AtomicBoolean(false);
    private final AtomicInteger oh = new AtomicInteger(0);
    private final AtomicInteger xd = new AtomicInteger(0);
    private final AtomicInteger dzy = new AtomicInteger(0);
    private boolean qd = false;
    int ka = -1;
    protected com.bytedance.sdk.openadsdk.aw.fi fi = new com.bytedance.sdk.openadsdk.aw.fi() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.aw.fi
        public void ri() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && dw.aw(TTPlayableLandingPageActivity.this.fr) && dw.bgr(TTPlayableLandingPageActivity.this.fr)) {
                TTPlayableLandingPageActivity.this.su.removeMessages(2);
                TTPlayableLandingPageActivity.this.su.sendMessage(TTPlayableLandingPageActivity.this.ri(1, 0));
            }
        }
    };
    private int feb = 1;

    private void ac() {
        com.bytedance.sdk.openadsdk.core.ik.ri riVar = new com.bytedance.sdk.openadsdk.core.ik.ri(this, this.fr, "embeded_ad", this.ihz) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.ik.ri, com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
            public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, boolean z) {
                wjv wjvVar = ((com.bytedance.sdk.openadsdk.core.ik.lr) this).di;
                if (wjvVar == null || wjvVar.yjm() != 1 || z) {
                    super.ri(view, f, f2, f3, f4, sparseArray, z);
                    TTPlayableLandingPageActivity.this.ihz();
                    TTPlayableLandingPageActivity.this.igq = true;
                    TTPlayableLandingPageActivity.this.zf = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.uq);
                    } catch (JSONException e) {
                        ac.ri("TTPWPActivity", "onClick JSON ERROR", e);
                    }
                    com.bytedance.sdk.openadsdk.ka.ik.lr(TTPlayableLandingPageActivity.this.fr, ((com.bytedance.sdk.openadsdk.core.ik.lr) this).xha, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        riVar.ri(this.dw);
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar2 = this.tnn;
        if (riVar2 != null) {
            riVar2.ri(riVar);
        }
    }

    private void aw() {
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = this.f18066co;
        if (kaVar != null) {
            kaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.srn != null) {
                        TTPlayableLandingPageActivity.this.srn.xha();
                    }
                    TTPlayableLandingPageActivity.this.su.sendMessage(TTPlayableLandingPageActivity.this.ri(4, 0));
                    TTPlayableLandingPageActivity.this.ri("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = this.aw;
        if (kaVar2 != null) {
            kaVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.ik();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.di.ka kaVar3 = this.bgr;
        if (kaVar3 != null) {
            kaVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.qd = !tTPlayableLandingPageActivity.qd;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity2.di(tTPlayableLandingPageActivity2.qd);
                    if (TTPlayableLandingPageActivity.this.pv != null) {
                        TTPlayableLandingPageActivity.this.pv.ri(TTPlayableLandingPageActivity.this.qd);
                    }
                }
            });
        }
    }

    private void bgr() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.srn;
        if (fiVar != null) {
            fiVar.xha();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ihz() {
        com.bytedance.sdk.openadsdk.core.dw.ri().lr(this.fr);
    }

    private void jbs() {
        int i = nr.ka().su(String.valueOf(this.fr.ur())).bu;
        if (i >= 0) {
            this.su.sendEmptyMessageDelayed(1, ((long) i) * 1000);
        } else {
            qd.ri((View) this.f18066co, 0);
        }
    }

    private void nr() {
        TTAdDislikeToast tTAdDislikeToast = this.lr;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tan() {
        TTAdDislikeToast tTAdDislikeToast = this.lr;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void fi() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void gcp() {
        ihz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ka(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(int i) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        bgr();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!vr.fi()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            nr.lr(this);
            di();
        } catch (Throwable unused) {
        }
        lr(bundle);
        wjv wjvVar = this.fr;
        if (wjvVar == null) {
            return;
        }
        this.zyn = wjvVar.tp();
        int iVr = dw.vr(this.fr);
        if (iVr == 0) {
            setRequestedOrientation(14);
        } else if (iVr == 1) {
            setRequestedOrientation(1);
        } else if (iVr == 2) {
            setRequestedOrientation(0);
            this.feb = 2;
        }
        this.vr = this;
        try {
            setContentView(xha());
            aw();
            mj();
            ac();
            this.tnn.ri(this);
            this.tnn.ri(false, (com.bytedance.sdk.openadsdk.aw.di) null);
            jbs();
            com.bytedance.sdk.openadsdk.ka.ik.ri.ri(SystemClock.elapsedRealtime() - jElapsedRealtime, this.fr, "embeded_ad", this.ig, this.hcw);
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.tnn;
            if (riVar != null) {
                riVar.ri();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.dw.ri().ik(this.fr);
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.tnn;
        if (riVar != null) {
            riVar.ka();
        }
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.srn;
        if (fiVar != null) {
            fiVar.ri(true);
            this.srn.sf();
        }
        this.su.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.hcw)) {
            com.bytedance.sdk.openadsdk.ka.ik.ri.ri(this.xd.get(), this.oh.get(), this.fr);
        }
        com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.ig);
        com.bytedance.sdk.component.jbs.di diVar = this.di;
        if (diVar != null) {
            srn.ri(diVar.getWebView());
            this.di.slm();
        }
        this.di = null;
        dzy dzyVar = this.tan;
        if (dzyVar != null) {
            dzyVar.co();
        }
        dzy dzyVar2 = this.ac;
        if (dzyVar2 != null) {
            dzyVar2.co();
        }
        com.bytedance.sdk.openadsdk.uq.mj mjVar = this.pv;
        if (mjVar != null) {
            mjVar.pv();
        }
        aw awVar = this.jc;
        if (awVar != null) {
            awVar.ka(true);
        }
        ory oryVar = this.ri;
        if (oryVar != null) {
            oryVar.lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        dzy dzyVar = this.tan;
        if (dzyVar != null) {
            dzyVar.ri(false);
        }
        com.bytedance.sdk.openadsdk.uq.mj mjVar = this.pv;
        if (mjVar != null) {
            mjVar.ri(true);
            this.pv.ik(false);
        }
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.tnn;
        if (riVar != null) {
            riVar.ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        dzy dzyVar = this.tan;
        if (dzyVar != null) {
            dzyVar.sf();
            com.bytedance.sdk.component.jbs.di diVar = this.di;
            if (diVar != null) {
                this.tan.ri(diVar.getVisibility() == 0);
            }
        }
        dzy dzyVar2 = this.ac;
        if (dzyVar2 != null) {
            dzyVar2.sf();
        }
        com.bytedance.sdk.openadsdk.uq.mj mjVar = this.pv;
        if (mjVar != null) {
            mjVar.ik(true);
        }
        aw awVar = this.jc;
        if (awVar != null) {
            awVar.xha();
        }
        if (DeviceUtils.xha() == 0) {
            this.qd = true;
        }
        di(this.qd);
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.tnn;
        if (riVar != null) {
            riVar.lr();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iRi = this.fr != null ? com.bytedance.sdk.openadsdk.core.dw.ri().ri(this.fr) : -1;
            this.ka = iRi;
            bundle.putInt("meta_index", iRi);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.ka >= 0) {
            com.bytedance.sdk.openadsdk.core.dw.ri().ik(this.ka);
            this.ka = -1;
        }
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.srn;
        if (fiVar != null) {
            fiVar.jbs();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = this.srn;
        if (fiVar != null) {
            fiVar.mj();
        }
        aw awVar = this.jc;
        if (awVar != null) {
            awVar.mj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public List<wjv> rzk() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public View slm() {
        return null;
    }

    private void mj() {
        if (this.fr.adz() == 4) {
            this.dw = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.vr, "interaction");
        }
    }

    private View xha() {
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(this);
        ikVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.tnn = new com.bytedance.sdk.openadsdk.uq.ri.ri(this.vr, this.fr, this.feb, this.qd, ikVar, true);
        int iLr = qd.lr(this, 5.0f);
        this.bgr = new com.bytedance.sdk.openadsdk.core.di.ka(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qd.lr(this, 28.0f), qd.lr(this, 28.0f));
        layoutParams.rightMargin = qd.lr(this, 56.0f);
        layoutParams.topMargin = qd.lr(this, 20.0f);
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END;
        this.bgr.setLayoutParams(layoutParams);
        this.bgr.setPadding(iLr, iLr, iLr, iLr);
        this.bgr.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.ri());
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = this.bgr;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        kaVar.setScaleType(scaleType);
        this.bgr.setImageDrawable(sf.ri(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(this);
        this.aw = kaVar2;
        kaVar2.setPadding(iLr, iLr, iLr, iLr);
        this.aw.setScaleType(scaleType);
        this.aw.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.ri());
        this.aw.setImageResource(uq.ka(nr.ri(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(qd.lr(this, 28.0f), qd.lr(this, 28.0f));
        layoutParams2.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END;
        layoutParams2.rightMargin = qd.lr(this, 16.0f);
        layoutParams2.topMargin = qd.lr(this, 20.0f);
        this.aw.setLayoutParams(layoutParams2);
        this.f18066co = new com.bytedance.sdk.openadsdk.core.di.ka(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(qd.lr(this, 28.0f), qd.lr(this, 28.0f));
        layoutParams3.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        layoutParams3.topMargin = qd.lr(this, 20.0f);
        layoutParams3.leftMargin = qd.lr(this, 16.0f);
        this.f18066co.setLayoutParams(layoutParams3);
        this.f18066co.setPadding(iLr, iLr, iLr, iLr);
        this.f18066co.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f18066co.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.ri());
        this.f18066co.setImageDrawable(uq.ik(this, "tt_white_lefterbackicon_titlebar"));
        this.f18066co.setVisibility(0);
        ikVar.addView(this.bgr);
        ikVar.addView(this.aw);
        ikVar.addView(this.f18066co);
        return ikVar;
    }

    public void di(boolean z) {
        try {
            this.qd = z;
            this.bgr.setImageDrawable(z ? sf.ri(this.vr, "tt_mute_wrapper") : sf.ri(this.vr, "tt_unmute_wrapper"));
            com.bytedance.sdk.openadsdk.uq.mj mjVar = this.pv;
            if (mjVar != null) {
                mjVar.ri(z);
            }
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.tnn;
            if (riVar != null) {
                riVar.ri(z);
            }
        } catch (Exception e) {
            ac.ik("TTPWPActivity", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ka
    public void fi(boolean z) {
        com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar;
        this.igq = true;
        this.zf = z;
        if (!z) {
            try {
                Toast.makeText(this.vr, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.zf || (ikVar = this.dw) == null) {
            return;
        }
        ikVar.ri(this.fr);
    }

    public void ik() {
        if (this.fr == null || isFinishing()) {
            return;
        }
        if (this.ik.get()) {
            nr();
            return;
        }
        if (this.ri == null) {
            ka();
        }
        this.ri.ri(new ory.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.ory.ri
            public void ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ory.ri
            public void ri(int i, String str) {
                if (TTPlayableLandingPageActivity.this.ik.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.ik.set(true);
                TTPlayableLandingPageActivity.this.tan();
            }
        });
        ory oryVar = this.ri;
        if (oryVar != null) {
            oryVar.ri();
        }
    }

    public void ka() {
        wjv wjvVar = this.fr;
        if (wjvVar != null) {
            this.ri = new com.bytedance.sdk.openadsdk.ik.ik(this, wjvVar.yjg(), this.fr.ib(), this.fr);
        }
        if (this.lr == null) {
            this.lr = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.lr);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean ri() {
        return true;
    }

    private void lr(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            wjv wjvVarRi = com.bytedance.sdk.openadsdk.core.dw.ri().ri(com.bytedance.sdk.openadsdk.core.dw.ri(intent));
            this.fr = wjvVarRi;
            if (wjvVarRi != null) {
                this.uq = wjvVarRi.sf();
                this.ihz = this.fr.aw();
                this.igq = this.fr.vr();
                this.bu = this.fr.tn();
                this.nr = this.fr.yjg();
                this.hcw = this.fr.mvf();
                this.wjv = this.fr.xh();
            }
        }
        if (bundle != null) {
            try {
                wjv wjvVarRi2 = com.bytedance.sdk.openadsdk.core.dw.ri().ri(bundle.getInt("meta_index", -1));
                this.fr = wjvVarRi2;
                if (wjvVarRi2 != null) {
                    this.bu = wjvVarRi2.tn();
                    this.nr = this.fr.yjg();
                    this.hcw = this.fr.mvf();
                    this.wjv = this.fr.xh();
                    this.uq = this.fr.sf();
                    this.ihz = this.fr.aw();
                    this.igq = this.fr.vr();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.fr == null) {
            finish();
            return;
        }
        try {
            this.qd = nr.ka().bu(this.fr.eb().getCodeId());
        } catch (Throwable th) {
            ac.ik("TTPWPActivity", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public boolean ri(long j, boolean z) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message ri(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    public void di() {
        qd.ri((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                qd.ri((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        ac.ik("TTPWPActivity", e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(String str) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), this.fr, "embeded_ad", str);
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        int i = message.what;
        if (i == 1) {
            qd.ri((View) this.f18066co, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        qt qtVar = this.slm;
        if (qtVar == null || !qtVar.ka()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i2 = message.arg2;
                if (i2 != 0) {
                    jSONObject.put("remove_loading_page_reason", i2);
                }
                jSONObject.put("playable_url", this.uq);
                qt qtVar2 = this.slm;
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, qtVar2 != null ? qtVar2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                ac.ri("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.ka.ik.lr(this.fr, "embeded_ad", "remove_loading_page", jSONObject);
            this.su.removeMessages(2);
            qt qtVar3 = this.slm;
            if (qtVar3 != null) {
                qtVar3.ik();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void bu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void co() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void dzy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ory() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void qh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void qt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void sf() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void vr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void xd() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void zb() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void lr() {
        bgr();
    }
}
