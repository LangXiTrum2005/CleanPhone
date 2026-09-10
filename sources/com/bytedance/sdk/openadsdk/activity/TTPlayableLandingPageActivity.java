package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
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
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.gy;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.vu;
import com.bytedance.sdk.openadsdk.core.widget.to;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.fs;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.rq;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements koa.qdl, com.bytedance.sdk.openadsdk.core.exu.mml.ud, com.bytedance.sdk.openadsdk.core.lnr.mml {
    private static final com.bytedance.sdk.openadsdk.aaj.wd.qdl wc = new com.bytedance.sdk.openadsdk.aaj.wd.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
    };
    private hkc aaj;
    private fs ag;
    private com.bytedance.sdk.openadsdk.mml.mml.mzz ax;
    private Context bjy;
    private boolean bqt;
    private boolean cx;
    private hkc exc;
    private com.bytedance.sdk.openadsdk.core.mo.mml exu;
    private com.bytedance.sdk.openadsdk.aaj.jpc fco;
    private com.bytedance.sdk.openadsdk.core.mo.mml fs;
    private String jl;
    private to jtx;
    private int jyq;
    private String kdv;
    private boolean koa;
    private String ljh;
    private com.bytedance.sdk.component.tvp.mo mo;
    private ILoader mrf;
    private String oth;
    vu qdl;
    private com.bytedance.sdk.openadsdk.core.mo.mml rdp;
    TTAdDislikeToast ud;
    private ljh uw;
    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo vu;
    private com.bytedance.sdk.openadsdk.aaj.qdl.qdl yh;
    private String yt;
    private boolean wd = true;
    private boolean to = false;
    private boolean rq = true;
    final AtomicBoolean lnr = new AtomicBoolean(false);
    private final String bch = "embeded_ad";
    private final koa xmv = new koa(Looper.getMainLooper(), this);
    private final AtomicBoolean rc = new AtomicBoolean(false);
    private final AtomicInteger ekw = new AtomicInteger(0);
    private final AtomicInteger hkc = new AtomicInteger(0);
    private final AtomicInteger hzv = new AtomicInteger(0);
    private boolean gy = false;
    int mml = -1;
    protected com.bytedance.sdk.openadsdk.fs.mzz mzz = new com.bytedance.sdk.openadsdk.fs.mzz() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.fs.mzz
        public void qdl() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && com.bytedance.sdk.openadsdk.core.model.vu.exu(TTPlayableLandingPageActivity.this.uw) && com.bytedance.sdk.openadsdk.core.model.vu.rdp(TTPlayableLandingPageActivity.this.uw)) {
                TTPlayableLandingPageActivity.this.xmv.removeMessages(2);
                TTPlayableLandingPageActivity.this.xmv.sendMessage(TTPlayableLandingPageActivity.this.qdl(1, 0));
            }
        }
    };
    private int om = 1;

    private void aaj() {
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.lnr.qdl(this, this.uw, "embeded_ad", this.jyq) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl, com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
            public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, boolean z2) {
                ljh ljhVar = ((com.bytedance.sdk.openadsdk.core.lnr.ud) this).mo;
                if (ljhVar == null || ljhVar.car() != 1 || z2) {
                    super.qdl(view, f, f2, f3, f4, sparseArray, z2);
                    TTPlayableLandingPageActivity.this.jyq();
                    TTPlayableLandingPageActivity.this.bqt = true;
                    TTPlayableLandingPageActivity.this.koa = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.oth);
                    } catch (JSONException e2) {
                        aaj.qdl("TTPWPActivity", "onClick JSON ERROR", e2);
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(TTPlayableLandingPageActivity.this.uw, ((com.bytedance.sdk.openadsdk.core.lnr.ud) this).wd, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        qdlVar.qdl(this.vu);
        com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar2 = this.yh;
        if (qdlVar2 != null) {
            qdlVar2.qdl(qdlVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exc() {
        TTAdDislikeToast tTAdDislikeToast = this.ud;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void exu() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.ax;
        if (mzzVar != null) {
            mzzVar.jpc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyq() {
        com.bytedance.sdk.openadsdk.core.koa.qdl().ud(this.uw);
    }

    private void rdp() {
        TTAdDislikeToast tTAdDislikeToast = this.ud;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    private void to() {
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = this.fs;
        if (mmlVar != null) {
            mmlVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.ax != null) {
                        TTPlayableLandingPageActivity.this.ax.jpc();
                    }
                    TTPlayableLandingPageActivity.this.xmv.sendMessage(TTPlayableLandingPageActivity.this.qdl(4, 0));
                    TTPlayableLandingPageActivity.this.qdl("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = this.exu;
        if (mmlVar2 != null) {
            mmlVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.lnr();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar3 = this.rdp;
        if (mmlVar3 != null) {
            mmlVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.gy = !tTPlayableLandingPageActivity.gy;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity2.mo(tTPlayableLandingPageActivity2.gy);
                    if (TTPlayableLandingPageActivity.this.fco != null) {
                        TTPlayableLandingPageActivity.this.fco.qdl(TTPlayableLandingPageActivity.this.gy);
                    }
                }
            });
        }
    }

    private void tvp() {
        int i2 = yt.mml().xmv(String.valueOf(this.uw.fz())).yt;
        if (i2 >= 0) {
            this.xmv.sendEmptyMessageDelayed(1, ((long) i2) * 1000);
        } else {
            ax.qdl((View) this.fs, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void bjy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void car() {
        jyq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void fs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void gy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void hkc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public View jtx() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mml(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mrf() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        exu();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!rdp.mzz()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            yt.ud(this);
            mzz();
        } catch (Throwable unused) {
        }
        ud(bundle);
        ljh ljhVar = this.uw;
        if (ljhVar == null) {
            return;
        }
        this.cx = ljhVar.ip();
        int iBjy = com.bytedance.sdk.openadsdk.core.model.vu.bjy(this.uw);
        if (iBjy == 0) {
            setRequestedOrientation(14);
        } else if (iBjy == 1) {
            setRequestedOrientation(1);
        } else if (iBjy == 2) {
            setRequestedOrientation(0);
            this.om = 2;
        }
        this.bjy = this;
        try {
            setContentView(wd());
            to();
            jpc();
            aaj();
            this.yh.qdl(this);
            this.yh.qdl(false, (com.bytedance.sdk.openadsdk.fs.mo) null);
            tvp();
            com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(SystemClock.elapsedRealtime() - jElapsedRealtime, this.uw, "embeded_ad", this.mrf, this.kdv);
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.yh;
            if (qdlVar != null) {
                qdlVar.qdl();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.koa.qdl().lnr(this.uw);
        com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.yh;
        if (qdlVar != null) {
            qdlVar.mml();
        }
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.ax;
        if (mzzVar != null) {
            mzzVar.qdl(true);
            this.ax.fs();
        }
        this.xmv.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.kdv)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(this.hkc.get(), this.ekw.get(), this.uw);
        }
        com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(this.mrf);
        com.bytedance.sdk.component.tvp.mo moVar = this.mo;
        if (moVar != null) {
            gy.qdl(moVar.getWebView());
            this.mo.jtx();
        }
        this.mo = null;
        hkc hkcVar = this.exc;
        if (hkcVar != null) {
            hkcVar.fs();
        }
        hkc hkcVar2 = this.aaj;
        if (hkcVar2 != null) {
            hkcVar2.fs();
        }
        com.bytedance.sdk.openadsdk.aaj.jpc jpcVar = this.fco;
        if (jpcVar != null) {
            jpcVar.fco();
        }
        fs fsVar = this.ag;
        if (fsVar != null) {
            fsVar.mml(true);
        }
        vu vuVar = this.qdl;
        if (vuVar != null) {
            vuVar.ud();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        hkc hkcVar = this.exc;
        if (hkcVar != null) {
            hkcVar.qdl(false);
        }
        com.bytedance.sdk.openadsdk.aaj.jpc jpcVar = this.fco;
        if (jpcVar != null) {
            jpcVar.qdl(true);
            this.fco.lnr(false);
        }
        com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.yh;
        if (qdlVar != null) {
            qdlVar.lnr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        hkc hkcVar = this.exc;
        if (hkcVar != null) {
            hkcVar.rq();
            com.bytedance.sdk.component.tvp.mo moVar = this.mo;
            if (moVar != null) {
                this.exc.qdl(moVar.getVisibility() == 0);
            }
        }
        hkc hkcVar2 = this.aaj;
        if (hkcVar2 != null) {
            hkcVar2.rq();
        }
        com.bytedance.sdk.openadsdk.aaj.jpc jpcVar = this.fco;
        if (jpcVar != null) {
            jpcVar.lnr(true);
        }
        fs fsVar = this.ag;
        if (fsVar != null) {
            fsVar.wd();
        }
        if (DeviceUtils.wd() == 0) {
            this.gy = true;
        }
        mo(this.gy);
        com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.yh;
        if (qdlVar != null) {
            qdlVar.ud();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iQdl = this.uw != null ? com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(this.uw) : -1;
            this.mml = iQdl;
            bundle.putInt("meta_index", iQdl);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.mml >= 0) {
            com.bytedance.sdk.openadsdk.core.koa.qdl().lnr(this.mml);
            this.mml = -1;
        }
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.ax;
        if (mzzVar != null) {
            mzzVar.to();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.ax;
        if (mzzVar != null) {
            mzzVar.tvp();
        }
        fs fsVar = this.ag;
        if (fsVar != null) {
            fsVar.jpc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void rq() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void sy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public List<ljh> tid() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(int i2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void yt() {
    }

    private void jpc() {
        if (this.uw.ygv() == 4) {
            this.vu = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.bjy, "interaction");
        }
    }

    private View wd() {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(this);
        lnrVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.yh = new com.bytedance.sdk.openadsdk.aaj.qdl.qdl(this.bjy, this.uw, this.om, this.gy, lnrVar, true);
        int iUd = ax.ud(this, 5.0f);
        this.rdp = new com.bytedance.sdk.openadsdk.core.mo.mml(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ax.ud(this, 28.0f), ax.ud(this, 28.0f));
        layoutParams.rightMargin = ax.ud(this, 56.0f);
        layoutParams.topMargin = ax.ud(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.rdp.setLayoutParams(layoutParams);
        this.rdp.setPadding(iUd, iUd, iUd, iUd);
        this.rdp.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.qdl());
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = this.rdp;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        mmlVar.setScaleType(scaleType);
        this.rdp.setImageDrawable(rq.qdl(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(this);
        this.exu = mmlVar2;
        mmlVar2.setPadding(iUd, iUd, iUd, iUd);
        this.exu.setScaleType(scaleType);
        this.exu.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.qdl());
        this.exu.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(yt.qdl(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ax.ud(this, 28.0f), ax.ud(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = ax.ud(this, 16.0f);
        layoutParams2.topMargin = ax.ud(this, 20.0f);
        this.exu.setLayoutParams(layoutParams2);
        this.fs = new com.bytedance.sdk.openadsdk.core.mo.mml(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(ax.ud(this, 28.0f), ax.ud(this, 28.0f));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = ax.ud(this, 20.0f);
        layoutParams3.leftMargin = ax.ud(this, 16.0f);
        this.fs.setLayoutParams(layoutParams3);
        this.fs.setPadding(iUd, iUd, iUd, iUd);
        this.fs.setScaleType(ImageView.ScaleType.FIT_XY);
        this.fs.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.qdl());
        this.fs.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(this, "tt_white_lefterbackicon_titlebar"));
        this.fs.setVisibility(0);
        lnrVar.addView(this.rdp);
        lnrVar.addView(this.exu);
        lnrVar.addView(this.fs);
        return lnrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.mml
    public void mzz(boolean z2) {
        com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar;
        this.bqt = true;
        this.koa = z2;
        if (!z2) {
            try {
                Toast.makeText(this.bjy, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.koa || (moVar = this.vu) == null) {
            return;
        }
        moVar.lnr(this.uw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(boolean z2) {
    }

    public void lnr() {
        if (this.uw == null || isFinishing()) {
            return;
        }
        if (this.lnr.get()) {
            rdp();
            return;
        }
        if (this.qdl == null) {
            mml();
        }
        this.qdl.qdl(new vu.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.vu.qdl
            public void qdl() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.vu.qdl
            public void qdl(int i2, String str) {
                if (TTPlayableLandingPageActivity.this.lnr.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.lnr.set(true);
                TTPlayableLandingPageActivity.this.exc();
            }
        });
        vu vuVar = this.qdl;
        if (vuVar != null) {
            vuVar.qdl();
        }
    }

    public void mml() {
        TTPlayableLandingPageActivity tTPlayableLandingPageActivity;
        ljh ljhVar = this.uw;
        if (ljhVar != null) {
            tTPlayableLandingPageActivity = this;
            tTPlayableLandingPageActivity.qdl = new com.bytedance.sdk.openadsdk.lnr.lnr(tTPlayableLandingPageActivity, ljhVar.ir(), this.uw.fc(), "", this.uw);
        } else {
            tTPlayableLandingPageActivity = this;
        }
        if (tTPlayableLandingPageActivity.ud == null) {
            tTPlayableLandingPageActivity.ud = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(tTPlayableLandingPageActivity.ud);
        }
    }

    public void mo(boolean z2) {
        Drawable drawableQdl;
        try {
            this.gy = z2;
            if (z2) {
                drawableQdl = rq.qdl(this.bjy, "tt_mute_wrapper");
            } else {
                drawableQdl = rq.qdl(this.bjy, "tt_unmute_wrapper");
            }
            this.rdp.setImageDrawable(drawableQdl);
            com.bytedance.sdk.openadsdk.aaj.jpc jpcVar = this.fco;
            if (jpcVar != null) {
                jpcVar.qdl(z2);
            }
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.yh;
            if (qdlVar != null) {
                qdlVar.qdl(z2);
            }
        } catch (Exception e2) {
            aaj.lnr("TTPWPActivity", e2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean qdl() {
        return true;
    }

    private void ud(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                this.oth = intent.getStringExtra("url");
                this.jyq = intent.getIntExtra("source", -1);
                this.bqt = intent.getBooleanExtra("ad_pending_download", false);
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.uw = com.bytedance.sdk.openadsdk.core.ud.qdl(new JSONObject(stringExtra));
                    } catch (Exception e2) {
                        aaj.qdl("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e2);
                    }
                }
                this.yt = intent.getStringExtra("adid");
                this.jl = intent.getStringExtra("log_extra");
                this.kdv = intent.getStringExtra("gecko_id");
                this.ljh = intent.getStringExtra("web_title");
            } else {
                ljh ljhVarQdl = com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(com.bytedance.sdk.openadsdk.core.koa.qdl(intent));
                this.uw = ljhVarQdl;
                if (ljhVarQdl != null) {
                    this.oth = ljhVarQdl.tvp();
                    this.jyq = this.uw.rq();
                    this.bqt = this.uw.exu();
                    this.yt = this.uw.yre();
                    this.jl = this.uw.ir();
                    this.kdv = this.uw.xmr();
                    this.ljh = this.uw.gsv();
                }
            }
        }
        if (bundle != null) {
            try {
                ljh ljhVarQdl2 = com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(bundle.getInt("meta_index", -1));
                this.uw = ljhVarQdl2;
                if (ljhVarQdl2 != null) {
                    this.yt = ljhVarQdl2.yre();
                    this.jl = this.uw.ir();
                    this.kdv = this.uw.xmr();
                    this.ljh = this.uw.gsv();
                    this.oth = this.uw.tvp();
                    this.jyq = this.uw.rq();
                    this.bqt = this.uw.exu();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.uw == null) {
            finish();
            return;
        }
        try {
            this.gy = yt.mml().yt(this.uw.ji().getCodeId());
        } catch (Throwable th) {
            aaj.lnr("TTPWPActivity", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public boolean qdl(long j, boolean z2) {
        return false;
    }

    public void mzz() {
        ax.qdl((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i2) {
                if (i2 == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ax.qdl((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e2) {
                        aaj.lnr("TTPWPActivity", e2.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message qdl(int i2, int i3) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i2;
        if (i2 == 3) {
            messageObtain.arg2 = i3;
        }
        return messageObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), this.uw, "embeded_ad", str);
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            ax.qdl((View) this.fs, 0);
            return;
        }
        if (i2 != 2) {
            return;
        }
        to toVar = this.jtx;
        if (toVar == null || !toVar.mml()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i3 = message.arg2;
                if (i3 != 0) {
                    jSONObject.put("remove_loading_page_reason", i3);
                }
                jSONObject.put("playable_url", this.oth);
                to toVar2 = this.jtx;
                jSONObject.put("duration", toVar2 != null ? toVar2.getDisplayDuration() : 0L);
            } catch (JSONException e2) {
                aaj.qdl("TTPWPActivity", "handleMsg json error", e2);
            }
            com.bytedance.sdk.openadsdk.mml.lnr.ud(this.uw, "embeded_ad", "remove_loading_page", jSONObject);
            this.xmv.removeMessages(2);
            to toVar3 = this.jtx;
            if (toVar3 != null) {
                toVar3.lnr();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ud() {
        exu();
    }
}
