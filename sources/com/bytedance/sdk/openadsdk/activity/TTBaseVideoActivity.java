package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.component.reward.exu;
import com.bytedance.sdk.openadsdk.component.reward.qdl.bjy;
import com.bytedance.sdk.openadsdk.component.reward.qdl.rq;
import com.bytedance.sdk.openadsdk.component.reward.view.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.rc;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.mrf;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.bqt;
import com.bytedance.sdk.openadsdk.utils.kdv;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements koa.qdl, com.bytedance.sdk.openadsdk.core.exu.mml.ud {
    private final AtomicBoolean aaj;
    private final AtomicBoolean bjy;
    private int exc;
    protected boolean exu;
    protected boolean fs;
    private final rq.ud jl;
    private boolean jtx;
    protected com.bytedance.sdk.openadsdk.component.reward.ud.ud lnr;
    final koa mml;
    int mo;
    protected IListenerManager mzz;
    public final String qdl;
    protected boolean rdp;
    int rq;
    protected kdv to;
    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl ud;
    boolean wd;
    private int yt;

    public static class qdl implements Runnable {
        boolean qdl;
        AdSlot ud;

        public qdl(boolean z2, AdSlot adSlot) {
            this.qdl = z2;
            this.ud = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.qdl) {
                exu.qdl(yt.qdl()).qdl(this.ud);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.mzz.qdl(yt.qdl()).qdl(this.ud);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.qdl = aaj() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.bjy = new AtomicBoolean(false);
        this.mml = new koa(Looper.getMainLooper(), this);
        this.jtx = false;
        this.yt = 0;
        this.rq = 1;
        this.jl = new rq.ud();
        this.fs = false;
        this.exc = -1;
        this.aaj = new AtomicBoolean(false);
    }

    private boolean kdv() {
        if (this.ud.to.get() && this.ud.wd) {
            return false;
        }
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.ud.to.get();
        }
        return true;
    }

    private void rc() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar;
        if (this.ud == null || (udVar = this.lnr) == null) {
            super.onBackPressed();
        } else {
            udVar.oth();
        }
    }

    private void vu() {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        this.lnr.xmv();
        this.mo = (int) this.ud.bch.fco();
        exc();
        wd();
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.ud.ud.zm();
        if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.qdl(0L);
    }

    public abstract boolean aaj();

    public void bch() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void bjy() {
        this.ud.bch.mrf();
    }

    public void bqt() {
        if (!this.ud.ud.yh()) {
            if (!ljh.mzz(this.ud.ud)) {
                this.ud.bch.qdl("skip", true);
            }
            finish();
        } else if (!this.ud.ud.mo()) {
            this.ud.fco.lnr();
        } else if (this.ud.bqt.rq() == 1) {
            this.ud.fco.lnr();
        }
    }

    public abstract void exc();

    public void exu() {
        Message message = new Message();
        message.what = 400;
        if (aaj()) {
            ud(10000);
        }
        this.mml.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.ud == null) {
            return;
        }
        if (bqt.mzz()) {
            ax.ud((Activity) this);
        }
        if (!vu.mzz(this.ud.ud) || this.ud.xmv.mml(com.bytedance.sdk.openadsdk.component.reward.qdl.jpc.ud)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void fs() {
        mzz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void hkc() {
        this.fs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
    }

    public abstract void jpc();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public View jtx() {
        return this.ud.bch.gy();
    }

    public abstract boolean jyq();

    public Map<String, Object> koa() {
        return null;
    }

    public void ljh() {
        ljh ljhVar;
        rc rcVarEu;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || (ljhVar = qdlVar.ud) == null || (rcVarEu = ljhVar.eu()) == null) {
            return;
        }
        if (rcVarEu.ud() == 1 || rcVarEu.ud() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
            kdv kdvVar = new kdv(qdlVar2, qdlVar2.ud);
            this.to = kdvVar;
            bjy bjyVar = this.ud.bch;
            if (bjyVar != null) {
                bjyVar.qdl(kdvVar);
            }
        }
    }

    public void lnr() {
        setContentView(this.ud.ax);
        this.ud.ax.qdl(this.lnr);
        this.lnr.qdl(this, this.mml);
        this.lnr.rq();
    }

    public abstract void mml();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mml(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mo() {
    }

    public void mzz() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.exu();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null) {
            return;
        }
        qdlVar.koa.qdl();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        rc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z2;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        super.onCreate(bundle);
        if (bundle != null) {
            z2 = bundle.getBoolean("enable_new_arch", false);
        } else {
            z2 = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.exu = z2;
        aaj.qdl("BVA", "onCreate enableIvRvNewArch->" + this.exu + ",activity ->");
        yt.ud(getApplicationContext());
        if (!rdp.mzz()) {
            finish();
            return;
        }
        ljh ljhVarQdl = com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(getIntent(), bundle, this);
        if (ljhVarQdl == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ud.qdl(ljhVarQdl);
        this.rdp = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("adapt_decor_size", 0) == 1;
        aaj.qdl("BVA", "activity onCreate isAdaptDecorSize =" + this.rdp);
        ljhVarQdl.fco(String.valueOf(hashCode()));
        this.rq = ljhVarQdl.jb();
        qdl(ljhVarQdl, bundle);
        if (bundle != null) {
            if (ljhVarQdl.hkc()) {
                this.aaj.set(true);
            }
            if (ljhVarQdl.gy() && (qdlVar = this.ud) != null) {
                qdlVar.exu.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
            if (qdlVar2 != null) {
                qdlVar2.vu.wd();
            }
        }
        try {
            lnr();
            vu();
        } catch (Throwable th) {
            aaj.qdl("TTAD.BVA", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.bjy.lnr.ud();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        aaj.qdl("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || this.lnr == null) {
            return;
        }
        if (qdlVar.dk > 0 && qdlVar.exu.get()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.ud.dk);
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(strValueOf, qdlVar2.ud, this.qdl, qdlVar2.bch.mzz());
            this.ud.dk = 0L;
        }
        this.ud.kdv.ud();
        this.mml.removeCallbacksAndMessages(null);
        this.lnr.jyq();
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.ud.ud);
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud(this.ud.ud);
        AdSlot adSlotJi = this.ud.ud.ji();
        if (!this.ud.bch.kdv() && adSlotJi != null && TextUtils.isEmpty(adSlotJi.getBidAdm()) && !this.ud.ud.ilu()) {
            rdp.ud().post(new qdl(aaj(), adSlotJi));
        }
        com.bytedance.sdk.openadsdk.utils.bjy.qdl();
        kdv kdvVar = this.to;
        if (kdvVar != null) {
            kdvVar.mzz();
            this.to = null;
        }
        this.jl.qdl(this);
        mrf.qdl().qdl(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        aaj.qdl("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.exc();
    }

    @Override // android.app.Activity
    public void onRestart() {
        ljh ljhVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || (ljhVar = qdlVar.ud) == null) {
            return;
        }
        if (this.jpc && !ljhVar.nln() && !TextUtils.isEmpty(ljh.qdl(this, ljhVar))) {
            finish();
        }
        if (ljhVar.nln()) {
            ljhVar.fs(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar;
        super.onResume();
        aaj.qdl("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.ud == null || (udVar = this.lnr) == null) {
            return;
        }
        udVar.yt();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        qdlVar.irn = true;
        this.jl.qdl(this, qdlVar.zlt, qdlVar.taz, this.rdp);
        if (kdv()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
            qdlVar2.fco.qdl(qdlVar2.ud.tvf());
        }
        this.ud.gy.bjy();
        this.ud.hkc.yt();
        this.ud.xmv.mzz();
        if (this.lnr.ud()) {
            this.ud.bch.qdl(this.lnr);
            this.ud.bch.qdl(false, this, this.yt != 0);
        }
        this.yt++;
        tvp();
        to toVar = this.ud.bqt;
        if (toVar != null) {
            toVar.wd();
        }
        this.ud.koa.qdl(this.mml);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (qdlVar.exu.get()) {
            this.ud.ud.wd(true);
        }
        if (this.aaj.get()) {
            this.ud.ud.ekw();
        }
        if (!TextUtils.isEmpty(this.tvp)) {
            bundle.putString("single_process_listener_key", this.tvp);
        }
        bundle.putBoolean("enable_new_arch", this.exu);
        ljh ljhVar = this.ud.ud;
        int iQdl = ljhVar != null ? com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(ljhVar) : -1;
        this.exc = iQdl;
        com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(this.ud, bundle, iQdl);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        aaj.qdl("BVA", "onStart mMetaIndex =" + this.exc + " this =" + this);
        if (this.exc >= 0) {
            com.bytedance.sdk.openadsdk.core.koa.qdl().lnr(this.exc);
            this.exc = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null) {
            return;
        }
        qdlVar.hkc.xmv();
        com.bytedance.sdk.openadsdk.utils.mml.qdl(this, this.ud.ud);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        aaj.qdl("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.aaj();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.to toVar;
        super.onWindowFocusChanged(z2);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || (toVar = qdlVar.vu) == null) {
            return;
        }
        toVar.ud(z2);
        this.ud.vu.lnr(z2);
    }

    public boolean oth() {
        return false;
    }

    public abstract void qdl(long j, long j2);

    public void qdl(Intent intent) {
    }

    public void rdp() {
        this.mml.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final void rq() {
        if (this.aaj.compareAndSet(false, true)) {
            aaj.qdl("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            jpc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void sy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public List<ljh> tid() {
        return this.ud.ud.gxp();
    }

    public void to() {
    }

    public void tvp() {
        if (oth() && !this.jtx) {
            this.jtx = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = tTBaseVideoActivity.ud;
                    qdlVar.rc.qdl(qdlVar.koa.qdl(tTBaseVideoActivity.rq));
                    TTBaseVideoActivity.this.to();
                }
            });
        }
    }

    public void ud(boolean z2, boolean z3) {
    }

    public void uw() {
    }

    public void wd() {
        if (vu.lnr(this.ud.ud)) {
            qdl(false, com.bytedance.sdk.openadsdk.mml.ud.C0149ud.lnr);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar != null) {
            udVar.qdl(this.ud.gy.mo());
            this.lnr.uw();
        }
    }

    public abstract FrameLayout xmv();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void yt() {
        if (!this.ud.rdp.getAndSet(true) || vu.lnr(this.ud.ud)) {
            this.ud.vu.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ud() {
        rc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean qdl() {
        return true;
    }

    private void qdl(ljh ljhVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.component.reward.qdl.qdl(this, this.mml, ljhVar, this, 0, this.rdp);
        this.ud = qdlVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(qdlVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            qdl(intent);
            ljhVar.qdl(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.ud.mlb) {
            mml();
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVarQdl = com.bytedance.sdk.openadsdk.component.reward.ud.mo.qdl(this.ud);
        this.lnr = udVarQdl;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
        qdlVar2.en = udVarQdl;
        com.bytedance.sdk.openadsdk.utils.bjy.qdl(qdlVar2);
        Objects.toString(this.lnr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
        if (!this.exu || com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            return;
        }
        if (bundle != null) {
            this.tvp = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.tvp = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.tvp = "";
        }
    }

    public void qdl(boolean z2, int i2) {
        qdl(z2, false, i2);
    }

    public void qdl(boolean z2, boolean z3, int i2) {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.qdl(z2, z3, false, i2);
    }

    public void qdl(boolean z2, boolean z3) {
        if (!this.exu || TextUtils.isEmpty(this.tvp)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(this.tvp, z2, z3);
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.qdl(message);
    }

    public IListenerManager qdl(int i2) {
        if (this.mzz == null) {
            this.mzz = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(i2));
        }
        return this.mzz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public boolean qdl(long j, boolean z2) {
        fs fsVar;
        com.bytedance.sdk.openadsdk.core.model.aaj aajVar;
        if (this.ud == null) {
            return false;
        }
        this.bjy.set(false);
        com.bytedance.sdk.openadsdk.mml.wd wdVarMzz = this.ud.mzz();
        FrameLayout frameLayoutXmv = xmv();
        if (frameLayoutXmv == null) {
            return false;
        }
        this.ud.bch.qdl(frameLayoutXmv, wdVarMzz);
        Map<String, Object> mapKoa = koa();
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar = new com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl(long j2, int i2) {
                com.bytedance.sdk.openadsdk.utils.rdp rdpVar;
                com.bytedance.sdk.openadsdk.utils.rdp rdpVar2;
                aaj.qdl("TTAD.BVA", "onComplete() called with: totalPlayTime = [" + j2 + "], percent = [" + i2 + "], mVideoHasCompleted=" + TTBaseVideoActivity.this.bjy.get());
                if (TTBaseVideoActivity.this.bjy.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.bjy.set(true);
                TTBaseVideoActivity.this.mml.removeMessages(300);
                TTBaseVideoActivity.this.rdp();
                TTBaseVideoActivity.this.bch();
                TTBaseVideoActivity.this.ud.bch.qdl(j2, j2);
                boolean zOth = TTBaseVideoActivity.this.oth();
                if (zOth) {
                    TTBaseVideoActivity.this.ud.bqt.ud(true);
                } else {
                    TTBaseVideoActivity.this.ud.exc.set(true);
                }
                TTBaseVideoActivity.this.uw();
                if (TTBaseVideoActivity.this.ud.ud.taz() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTBaseVideoActivity.this.ud;
                    if (qdlVar2.lnr) {
                        qdlVar2.uw.lnr().lnr(TTBaseVideoActivity.this.ud.ud);
                        com.bytedance.sdk.openadsdk.utils.bjy.ud();
                    }
                }
                if (!zOth && TTBaseVideoActivity.this.ud.ud.hrh()) {
                    TTBaseVideoActivity.this.ud.ud.om(1);
                    TTBaseVideoActivity.this.ud.gy.yt();
                }
                if (TTBaseVideoActivity.this.ud.ud.taz() == 21 && !TTBaseVideoActivity.this.ud.ud.bjy()) {
                    TTBaseVideoActivity.this.ud.ud.mml(true);
                    TTBaseVideoActivity.this.ud.gy.yt();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.fs && tTBaseVideoActivity.ud.bqt.fs()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.oth()) {
                    if (com.bytedance.sdk.openadsdk.core.model.aaj.mml(TTBaseVideoActivity.this.ud.ud) || com.bytedance.sdk.openadsdk.core.model.aaj.ud(TTBaseVideoActivity.this.ud.ud) || com.bytedance.sdk.openadsdk.core.model.aaj.wd(TTBaseVideoActivity.this.ud.ud)) {
                        TTBaseVideoActivity.this.qdl(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.aaj.ud(TTBaseVideoActivity.this.ud.ud) || (rdpVar2 = TTBaseVideoActivity.this.ud.kab) == null) {
                            return;
                        }
                        rdpVar2.qdl(0L);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.aaj.qdl(TTBaseVideoActivity.this.ud.ud) && !TTBaseVideoActivity.this.ud.jtx.get()) {
                        TTBaseVideoActivity.this.ud.qdl(true);
                        TTBaseVideoActivity.this.ud.fco.mzz(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = tTBaseVideoActivity2.ud;
                if (!qdlVar3.lnr) {
                    tTBaseVideoActivity2.bqt();
                    return;
                }
                if (qdlVar3.ud.yh()) {
                    if (!zOth) {
                        TTBaseVideoActivity.this.ud.fco.lnr();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.ud.bqt.rq() == 1) {
                            TTBaseVideoActivity.this.ud.fco.lnr();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.qdl(false, 5);
                if (!zOth && com.bytedance.sdk.openadsdk.core.model.aaj.ud(TTBaseVideoActivity.this.ud.ud) && (rdpVar = TTBaseVideoActivity.this.ud.kab) != null) {
                    rdpVar.qdl(0L);
                }
                if (ljh.mzz(TTBaseVideoActivity.this.ud.ud)) {
                    return;
                }
                TTBaseVideoActivity.this.ud.bch.qdl("skip", true);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void ud(long j2, int i2) {
                com.bytedance.sdk.openadsdk.core.model.aaj aajVar2;
                TTBaseVideoActivity.this.mml.removeMessages(300);
                fs fsVar2 = TTBaseVideoActivity.this.ud.gy;
                if (fsVar2 != null && (aajVar2 = fsVar2.bjy) != null) {
                    aajVar2.to();
                }
                if (TTBaseVideoActivity.this.ud.bch.mo()) {
                    TTBaseVideoActivity.this.exu();
                    return;
                }
                TTBaseVideoActivity.this.ud.bch.exc();
                TTBaseVideoActivity.this.bch();
                if (TTBaseVideoActivity.this.ud.ud.mo()) {
                    TTBaseVideoActivity.this.ud.bqt.qdl(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity.ud.lnr) {
                    tTBaseVideoActivity.finish();
                    return;
                }
                tTBaseVideoActivity.qdl(false, true, 3);
                bjy bjyVar = TTBaseVideoActivity.this.ud.bch;
                bjyVar.qdl(1 ^ (bjyVar.hzv() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl() {
                TTBaseVideoActivity.this.mml.removeMessages(300);
                TTBaseVideoActivity.this.rdp();
                TTBaseVideoActivity.this.bch();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.ud.lnr) {
                    tTBaseVideoActivity.qdl(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                bjy bjyVar = TTBaseVideoActivity.this.ud.bch;
                bjyVar.qdl(!bjyVar.hzv() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.ud.bch.hzv() ? 1 : 0));
                TTBaseVideoActivity.this.ud.bch.exc();
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTBaseVideoActivity.this.ud;
                if (!qdlVar2.irn && qdlVar2.bch.mo()) {
                    TTBaseVideoActivity.this.ud.bch.jyq();
                }
                if (TTBaseVideoActivity.this.ud.to.get()) {
                    return;
                }
                TTBaseVideoActivity.this.mml.removeMessages(300);
                if (j2 != TTBaseVideoActivity.this.ud.bch.exu()) {
                    TTBaseVideoActivity.this.rdp();
                }
                if (!TTBaseVideoActivity.this.oth() || TTBaseVideoActivity.this.ud.bch.mo()) {
                    TTBaseVideoActivity.this.ud.bch.qdl(j2, j3);
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTBaseVideoActivity.mo = (int) (tTBaseVideoActivity.ud.bch.fco() - j4);
                    int i2 = (int) j4;
                    if ((TTBaseVideoActivity.this.ud.aaj.get() || TTBaseVideoActivity.this.ud.rq.get()) && TTBaseVideoActivity.this.ud.bch.mo()) {
                        TTBaseVideoActivity.this.ud.bch.jyq();
                    }
                    if (TTBaseVideoActivity.this.aaj()) {
                        TTBaseVideoActivity.this.ud.gy.mzz(i2);
                    }
                    if (TTBaseVideoActivity.this.jyq()) {
                        if (TTBaseVideoActivity.this.ud.bch.mml()) {
                            kdv kdvVar = TTBaseVideoActivity.this.to;
                            if (kdvVar != null) {
                                kdvVar.qdl(j2);
                                return;
                            }
                            return;
                        }
                        kdv kdvVar2 = TTBaseVideoActivity.this.to;
                        if (kdvVar2 == null || !kdvVar2.qdl()) {
                            TTBaseVideoActivity.this.qdl(j2, j3);
                            return;
                        }
                        return;
                    }
                    TTBaseVideoActivity.this.qdl(j2, j3);
                }
            }
        };
        this.ud.bch.qdl(qdlVar);
        if (!this.ud.ud.mo() && (fsVar = this.ud.gy) != null && (aajVar = fsVar.bjy) != null) {
            aajVar.qdl(qdlVar);
        }
        boolean zQdl = this.ud.bch.qdl(j, z2, mapKoa, this.lnr);
        ud(zQdl, z2);
        return zQdl;
    }
}
