package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.bgr;
import com.bytedance.sdk.openadsdk.component.reward.bu;
import com.bytedance.sdk.openadsdk.component.reward.ri.sf;
import com.bytedance.sdk.openadsdk.component.reward.ri.vr;
import com.bytedance.sdk.openadsdk.component.reward.slm;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.ory;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ka.qt;
import com.bytedance.sdk.openadsdk.utils.hcw;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.gms.ads.AdSize;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements igq.ri, com.bytedance.sdk.openadsdk.core.bgr.ka.lr {
    private int ac;
    protected boolean aw;
    protected long bgr;
    private boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected boolean f18063co;
    boolean di;
    int fi;
    protected com.bytedance.sdk.openadsdk.component.reward.lr.lr ik;
    final igq ka;
    com.bytedance.sdk.openadsdk.component.reward.ri.ri lr;
    int mj;
    private int nr;
    public final String ri;
    protected boolean sf;
    private final AtomicBoolean slm;
    private final sf.lr tan;
    protected boolean vr;
    protected hcw xha;

    public static class ri implements Runnable {
        AdSlot lr;
        boolean ri;

        public ri(boolean z, AdSlot adSlot) {
            this.ri = z;
            this.lr = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ri) {
                if (com.bytedance.sdk.openadsdk.utils.lr.lr()) {
                    bu.ri(nr.ri()).ri(this.lr);
                    return;
                } else {
                    slm.ri(nr.ri()).ri(this.lr);
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.lr.lr()) {
                com.bytedance.sdk.openadsdk.component.reward.xha.ri(nr.ri()).ri(this.lr);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.di.ri(nr.ri()).ri(this.lr);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.ri = ay() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.slm = new AtomicBoolean(false);
        this.ka = new igq(Looper.getMainLooper(), this);
        this.bu = false;
        this.nr = 0;
        this.mj = 1;
        this.tan = new sf.lr();
        this.sf = false;
        this.ac = -1;
    }

    private void ig() {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        this.ik.fr();
        this.fi = (int) this.lr.ihz.qd();
        if (this.vr) {
            com.bytedance.sdk.openadsdk.common.ri.lr(new bgr.ri(this.lr, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new com.bytedance.sdk.openadsdk.common.ri.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.ri.lr
                public void ri(boolean z, int i) {
                    TTBaseVideoActivity.this.ri(z, i);
                }

                @Override // com.bytedance.sdk.openadsdk.common.ri.lr
                public void ri() {
                    TTBaseVideoActivity.this.finish();
                }
            }).ri(mj()).ri(jbs()).ri());
        } else {
            wjv();
        }
        bgr();
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.lr.lr.qc();
        if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        kaVarRi.ri(0L);
    }

    private void qd() {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar;
        if (this.lr == null || (lrVar = this.ik) == null) {
            super.onBackPressed();
        } else {
            lrVar.ihz();
        }
    }

    private boolean srn() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.lr.jbs.get();
        }
        return true;
    }

    public abstract void aw();

    public abstract boolean ay();

    public void bgr() {
        if (dw.ik(this.lr.lr)) {
            ri(false, com.bytedance.sdk.openadsdk.ka.lr.C0265lr.ik);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik;
        if (lrVar != null) {
            lrVar.ri(this.lr.dzy.di());
            this.ik.ay();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void co() {
        sf();
    }

    public abstract void di();

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.lr == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.igq.fi()) {
            qd.lr((Activity) this);
        }
        if (!dw.fi(this.lr.lr) || this.lr.wjv.ka(com.bytedance.sdk.openadsdk.component.reward.ri.mj.lr)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    public abstract boolean fr();

    public abstract FrameLayout hcw();

    public void igq() {
        wjv wjvVar;
        ory oryVarCmy;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (wjvVar = riVar.lr) == null || (oryVarCmy = wjvVar.cmy()) == null) {
            return;
        }
        if (oryVarCmy.lr() == 1 || oryVarCmy.lr() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
            hcw hcwVar = new hcw(riVar2, riVar2.lr);
            this.xha = hcwVar;
            vr vrVar = this.lr.ihz;
            if (vrVar != null) {
                vrVar.ri(hcwVar);
            }
        }
    }

    public void ihz() {
        Message message = new Message();
        message.what = 400;
        if (ay()) {
            lr(10000);
        }
        this.ka.sendMessageDelayed(message, 2000L);
    }

    public void ik() {
        setContentView(this.lr.pv);
        this.lr.pv.ri(this.ik);
        this.ik.ri(this, this.ka);
        this.ik.qt();
    }

    public abstract com.bytedance.sdk.openadsdk.common.slm jbs();

    public abstract void ka();

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ka(boolean z) {
    }

    public void lr(boolean z, boolean z2) {
    }

    public boolean mj() {
        return !ay();
    }

    public abstract void nr();

    public void oh() {
        if (!this.lr.lr.siy()) {
            if (!wjv.fi(this.lr.lr)) {
                this.lr.ihz.ri("skip", true);
            }
            finish();
        } else if (!this.lr.lr.di()) {
            this.lr.oh.ik();
        } else if (this.lr.ay.sf() == 1) {
            this.lr.oh.ik();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null) {
            return;
        }
        riVar.fr.ri();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        qd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else {
            z = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.f18063co = z;
        this.bgr = SystemClock.elapsedRealtime();
        nr.lr(getApplicationContext());
        if (!com.bytedance.sdk.openadsdk.core.vr.fi()) {
            finish();
            return;
        }
        wjv wjvVarRi = com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(getIntent(), bundle, this);
        if (wjvVarRi == null) {
            finish();
            return;
        }
        this.vr = com.bytedance.sdk.openadsdk.wjv.fi.qt();
        com.bytedance.sdk.openadsdk.utils.lr.ri(wjvVarRi);
        this.aw = com.bytedance.sdk.openadsdk.wjv.fi.ri("adapt_decor_size", 0) == 1;
        wjvVarRi.ig(String.valueOf(hashCode()));
        this.mj = wjvVarRi.bbu();
        ri(wjvVarRi, bundle);
        if (bundle != null) {
            qt.ri(wjvVarRi, "activity_recreate", wjvVarRi.fi(), "activity_recreate", null);
        }
        try {
            ik();
            ig();
        } catch (Throwable th) {
            ac.ri("TTAD.BVA", "onCreate: ", th);
            qt.ri(wjvVarRi, "show_ad_fail", this.ri, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        wjv wjvVar;
        super.onDestroy();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || this.ik == null) {
            return;
        }
        if (riVar.gcp > 0 && (wjvVar = riVar.lr) != null && wjvVar.feb()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.lr.gcp);
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
            com.bytedance.sdk.openadsdk.ka.ik.ri(strValueOf, riVar2.lr, this.ri, riVar2.ihz.fi());
            this.lr.gcp = 0L;
        }
        this.lr.zf.lr();
        this.ka.removeCallbacksAndMessages(null);
        this.ik.ac();
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.lr.lr);
        com.bytedance.sdk.openadsdk.ay.ri.ik.lr(this.lr.lr);
        AdSlot adSlotEb = this.lr.lr.eb();
        if (!this.lr.ihz.xd() && adSlotEb != null && TextUtils.isEmpty(adSlotEb.getBidAdm()) && !this.lr.lr.bl()) {
            com.bytedance.sdk.openadsdk.core.vr.lr().post(new ri(ay(), adSlotEb));
        }
        com.bytedance.sdk.openadsdk.utils.vr.ri();
        hcw hcwVar = this.xha;
        if (hcwVar != null) {
            hcwVar.fi();
            this.xha = null;
        }
        this.tan.ri(this);
        com.bytedance.sdk.openadsdk.core.qd.ri().ri(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik;
        if (lrVar == null) {
            return;
        }
        lrVar.nr();
    }

    @Override // android.app.Activity
    public void onRestart() {
        wjv wjvVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (wjvVar = riVar.lr) == null) {
            return;
        }
        if (this.jbs && !wjvVar.ojh() && !TextUtils.isEmpty(wjv.ri(this, wjvVar))) {
            finish();
        }
        if (wjvVar.ojh()) {
            wjvVar.vr(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar;
        super.onResume();
        toString();
        if (this.lr == null || (lrVar = this.ik) == null) {
            return;
        }
        lrVar.vr();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        riVar.tnn = true;
        this.tan.ri(this, riVar.bnj, riVar.siy, this.aw);
        if (srn()) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
            riVar2.oh.ri(riVar2.lr.nlk());
        }
        this.lr.dzy.vr();
        this.lr.ory.bu();
        this.lr.wjv.fi();
        if (this.ik.lr()) {
            this.lr.ihz.ri(this.ik);
            this.lr.ihz.ri(false, this, this.nr != 0);
        }
        this.nr++;
        tan();
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.lr.ay;
        if (jbsVar != null) {
            jbsVar.xha();
        }
        this.lr.fr.ri(this.ka);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.lr == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.qt)) {
            bundle.putString("single_process_listener_key", this.qt);
        }
        bundle.putBoolean("enable_new_arch", this.f18063co);
        wjv wjvVar = this.lr.lr;
        int iRi = wjvVar != null ? com.bytedance.sdk.openadsdk.core.dw.ri().ri(wjvVar) : -1;
        this.ac = iRi;
        com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(this.lr, bundle, iRi);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        toString();
        if (this.ac >= 0) {
            com.bytedance.sdk.openadsdk.core.dw.ri().ik(this.ac);
            this.ac = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null) {
            return;
        }
        riVar.ory.fr();
        com.bytedance.sdk.openadsdk.utils.ka.ri(this, this.lr.lr);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik;
        if (lrVar == null) {
            return;
        }
        lrVar.tan();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.ri.qt qtVar;
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (qtVar = riVar.su) == null) {
            return;
        }
        qtVar.lr(z);
        this.lr.su.ik(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ory() {
        this.sf = true;
    }

    public Map<String, Object> pv() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public final void qt() {
        wjv wjvVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar == null || (wjvVar = riVar.lr) == null || wjvVar.srn()) {
            return;
        }
        toString();
        this.lr.lr.mj(true);
        nr();
    }

    public abstract void ri(long j, long j2);

    public void ri(Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public List<wjv> rzk() {
        return this.lr.lr.lsq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void sf() {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik;
        if (lrVar == null) {
            return;
        }
        lrVar.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public View slm() {
        return this.lr.ihz.jc();
    }

    public boolean su() {
        return false;
    }

    public void tan() {
        if (su() && !this.bu) {
            this.bu = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = tTBaseVideoActivity.lr;
                    riVar.igq.ri(riVar.fr.ri(tTBaseVideoActivity.mj));
                    TTBaseVideoActivity.this.ac();
                }
            });
        }
    }

    public void uq() {
        this.ka.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void vr() {
        this.lr.ihz.srn();
    }

    public abstract void wjv();

    public void xha() {
        if (com.bytedance.sdk.openadsdk.wjv.fi.mj() && isChangingConfigurations()) {
            ac.ri("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.di) {
            ac.ri("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.di = true;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        wjv wjvVar = riVar != null ? riVar.lr : null;
        if (wjvVar != null && !wjvVar.feb()) {
            long jJbs = wjvVar.jbs();
            if (jJbs > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jJbs;
                if (jElapsedRealtime > 0) {
                    wjvVar.lr(jElapsedRealtime);
                }
            }
            this.lr.ri(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1003);
            this.lr.su.ri();
        }
        di();
        ka();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void zb() {
        this.lr.su.ri();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void lr() {
        qd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean ri() {
        return true;
    }

    private void ri(wjv wjvVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = new com.bytedance.sdk.openadsdk.component.reward.ri.ri(this, this.ka, wjvVar, this, 0, this.aw);
        this.lr = riVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(riVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            ri(intent);
            wjvVar.ri(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.lr.qh) {
            aw();
        }
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVarRi = com.bytedance.sdk.openadsdk.component.reward.lr.di.ri(this.lr);
        this.ik = lrVarRi;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
        riVar2.nd = lrVarRi;
        com.bytedance.sdk.openadsdk.utils.vr.ri(riVar2);
        Objects.toString(this.ik);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(Bundle bundle) {
        if (this.f18063co) {
            if (bundle != null) {
                this.qt = bundle.getString("single_process_listener_key");
            } else if (getIntent() != null) {
                this.qt = getIntent().getStringExtra("single_process_listener_key");
            } else {
                this.qt = "";
            }
        }
    }

    public void ac() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void bu() {
    }

    public void dw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void fi() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void qh() {
    }

    public void zf() {
    }

    public void ri(boolean z, int i) {
        ri(z, false, i);
    }

    public void ri(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik;
        if (lrVar == null) {
            return;
        }
        lrVar.ri(z, z2, false, i);
    }

    public void ri(boolean z, boolean z2) {
        if (!this.f18063co || TextUtils.isEmpty(this.qt)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.dw.ri().ri(this.qt, z, z2);
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar = this.ik;
        if (lrVar == null) {
            return;
        }
        lrVar.ri(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public boolean ri(long j, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar;
        com.bytedance.sdk.openadsdk.core.model.ac acVar;
        if (this.lr == null) {
            return false;
        }
        this.slm.set(false);
        com.bytedance.sdk.openadsdk.ka.xha xhaVarMj = this.lr.mj();
        FrameLayout frameLayoutHcw = hcw();
        if (frameLayoutHcw == null) {
            return false;
        }
        this.lr.ihz.ri(frameLayoutHcw, xhaVarMj);
        Map<String, Object> mapPv = pv();
        euthanasia.attabal.wireman wiremanVar = new euthanasia.attabal.wireman() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.4
            @Override // euthanasia.attabal.wireman
            public void lr(long j2, int i) {
                com.bytedance.sdk.openadsdk.core.model.ac acVar2;
                TTBaseVideoActivity.this.lr.ihz.sf();
                com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar2 = TTBaseVideoActivity.this.lr.dzy;
                if (sfVar2 != null && (acVar2 = sfVar2.vr) != null) {
                    acVar2.qt();
                }
                if (TTBaseVideoActivity.this.lr.ihz.di()) {
                    TTBaseVideoActivity.this.ihz();
                    return;
                }
                TTBaseVideoActivity.this.lr.ihz.ac();
                TTBaseVideoActivity.this.zf();
                if (TTBaseVideoActivity.this.lr.lr.di()) {
                    TTBaseVideoActivity.this.lr.ay.ri(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity.lr.ik) {
                    tTBaseVideoActivity.finish();
                    return;
                }
                tTBaseVideoActivity.ri(false, true, 3);
                vr vrVar = TTBaseVideoActivity.this.lr.ihz;
                vrVar.ri(1 ^ (vrVar.ig() ? 1 : 0), 2);
            }

            @Override // euthanasia.attabal.wireman
            public void ri(long j2, int i) {
                com.bytedance.sdk.openadsdk.utils.bgr bgrVar;
                com.bytedance.sdk.openadsdk.utils.bgr bgrVar2;
                TTBaseVideoActivity.this.slm.get();
                if (TTBaseVideoActivity.this.slm.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.slm.set(true);
                TTBaseVideoActivity.this.uq();
                TTBaseVideoActivity.this.zf();
                TTBaseVideoActivity.this.lr.ihz.ri(j2, j2);
                if (TTBaseVideoActivity.this.su()) {
                    TTBaseVideoActivity.this.lr.ay.lr(true);
                } else {
                    TTBaseVideoActivity.this.lr.slm.set(true);
                }
                TTBaseVideoActivity.this.dw();
                if (TTBaseVideoActivity.this.lr.lr.nd() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = TTBaseVideoActivity.this.lr;
                    if (riVar.ik) {
                        riVar.uq.ik().ri(TTBaseVideoActivity.this.lr.lr);
                        com.bytedance.sdk.openadsdk.utils.vr.lr();
                    }
                }
                if (!TTBaseVideoActivity.this.su() && TTBaseVideoActivity.this.lr.lr.ovz()) {
                    TTBaseVideoActivity.this.lr.lr.ta(1);
                    TTBaseVideoActivity.this.lr.dzy.bu();
                }
                if (TTBaseVideoActivity.this.lr.lr.nd() == 21 && !TTBaseVideoActivity.this.lr.lr.tan()) {
                    TTBaseVideoActivity.this.lr.lr.fi(true);
                    TTBaseVideoActivity.this.lr.dzy.bu();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.sf && tTBaseVideoActivity.lr.ay.co()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.su()) {
                    if (com.bytedance.sdk.openadsdk.core.model.ac.ka(TTBaseVideoActivity.this.lr.lr) || com.bytedance.sdk.openadsdk.core.model.ac.lr(TTBaseVideoActivity.this.lr.lr) || com.bytedance.sdk.openadsdk.core.model.ac.xha(TTBaseVideoActivity.this.lr.lr)) {
                        TTBaseVideoActivity.this.ri(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.ac.lr(TTBaseVideoActivity.this.lr.lr) || (bgrVar2 = TTBaseVideoActivity.this.lr.aac) == null) {
                            return;
                        }
                        bgrVar2.ri(0L);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.ac.ri(TTBaseVideoActivity.this.lr.lr) && !TTBaseVideoActivity.this.lr.aw.get()) {
                        TTBaseVideoActivity.this.lr.ri(true);
                        TTBaseVideoActivity.this.lr.oh.fi(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = tTBaseVideoActivity2.lr;
                if (!riVar2.ik) {
                    tTBaseVideoActivity2.oh();
                    return;
                }
                if (riVar2.lr.siy()) {
                    if (!TTBaseVideoActivity.this.su()) {
                        TTBaseVideoActivity.this.lr.oh.ik();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.lr.ay.sf() == 1) {
                            TTBaseVideoActivity.this.lr.oh.ik();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.ri(false, 5);
                if (!TTBaseVideoActivity.this.su() && com.bytedance.sdk.openadsdk.core.model.ac.lr(TTBaseVideoActivity.this.lr.lr) && (bgrVar = TTBaseVideoActivity.this.lr.aac) != null) {
                    bgrVar.ri(0L);
                }
                if (wjv.fi(TTBaseVideoActivity.this.lr.lr)) {
                    return;
                }
                TTBaseVideoActivity.this.lr.ihz.ri("skip", true);
            }

            @Override // euthanasia.attabal.wireman
            public void ri() {
                TTBaseVideoActivity.this.lr.ihz.sf();
                TTBaseVideoActivity.this.uq();
                TTBaseVideoActivity.this.zf();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.lr.ik) {
                    tTBaseVideoActivity.ri(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                vr vrVar = TTBaseVideoActivity.this.lr.ihz;
                vrVar.ri(!vrVar.ig() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.lr.ihz.ig() ? 1 : 0));
                TTBaseVideoActivity.this.lr.ihz.ac();
            }

            @Override // euthanasia.attabal.wireman
            public void ri(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = TTBaseVideoActivity.this.lr;
                if (!riVar.tnn && riVar.ihz.di()) {
                    TTBaseVideoActivity.this.lr.ihz.uq();
                }
                if (TTBaseVideoActivity.this.lr.jbs.get()) {
                    return;
                }
                if (j2 != TTBaseVideoActivity.this.lr.ihz.bgr()) {
                    TTBaseVideoActivity.this.uq();
                }
                if (TTBaseVideoActivity.this.su() && !TTBaseVideoActivity.this.lr.ihz.di()) {
                    TTBaseVideoActivity.this.ka.removeMessages(AdSize.MEDIUM_RECTANGLE_WIDTH);
                    return;
                }
                TTBaseVideoActivity.this.lr.ihz.ri(j2, j3);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                long j4 = j2 / 1000;
                tTBaseVideoActivity.fi = (int) (tTBaseVideoActivity.lr.ihz.qd() - j4);
                int i = (int) j4;
                if ((TTBaseVideoActivity.this.lr.bu.get() || TTBaseVideoActivity.this.lr.qt.get()) && TTBaseVideoActivity.this.lr.ihz.di()) {
                    TTBaseVideoActivity.this.lr.ihz.uq();
                }
                if (TTBaseVideoActivity.this.ay()) {
                    TTBaseVideoActivity.this.lr.dzy.fi(i);
                }
                if (TTBaseVideoActivity.this.fr()) {
                    if (TTBaseVideoActivity.this.lr.ihz.ka()) {
                        hcw hcwVar = TTBaseVideoActivity.this.xha;
                        if (hcwVar != null) {
                            hcwVar.ri(j2);
                            return;
                        }
                        return;
                    }
                    hcw hcwVar2 = TTBaseVideoActivity.this.xha;
                    if (hcwVar2 == null || !hcwVar2.ri()) {
                        TTBaseVideoActivity.this.ri(j2, j3);
                        return;
                    }
                    return;
                }
                TTBaseVideoActivity.this.ri(j2, j3);
            }
        };
        this.lr.ihz.ri(wiremanVar);
        if (!this.lr.lr.di() && (sfVar = this.lr.dzy) != null && (acVar = sfVar.vr) != null) {
            acVar.ri(wiremanVar);
        }
        boolean zRi = this.lr.ihz.ri(j, z, mapPv, this.ik);
        lr(zRi, z);
        return zRi;
    }
}
