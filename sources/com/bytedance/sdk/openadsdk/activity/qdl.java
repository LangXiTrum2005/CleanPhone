package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.bjy;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qdl extends jpc implements koa.qdl, com.bytedance.sdk.openadsdk.component.reward.qdl.mzz.qdl {
    private int aaj;
    private boolean bch;
    private boolean bqt;
    private Bundle jyq;
    private CountDownTimer koa;
    private boolean ljh;
    protected int lnr;
    protected boolean mml;
    protected boolean mzz;
    private int oth;
    protected final koa qdl;
    protected com.bytedance.sdk.openadsdk.component.reward.ud.ud ud;
    private long uw;
    private boolean vu;
    private long xmv;

    public qdl(ud udVar, ljh ljhVar, int i2, int i3, boolean z2) {
        super(udVar, ljhVar, i2, i3, z2);
        this.qdl = new koa(Looper.getMainLooper(), this);
        this.aaj = 1;
        this.oth = 0;
        this.ljh = false;
        this.mml = false;
        dk();
    }

    private void dk() {
        this.bqt = vu.lnr(this.mo) && this.mo.qur();
        aaj.qdl("TTAD.AdScene", "current scene is isOnlyPlayable -> " + this.bqt);
        if (this.bqt) {
            this.xmv = ((long) this.mo.icv()) * 1000;
        }
    }

    private boolean en() {
        if (this.tvp.to.get() && this.tvp.wd) {
            return false;
        }
        if (this.mo.mo()) {
            return this.tvp.to.get();
        }
        return true;
    }

    private void ijp() {
        this.tvp.ax.qdl(this.ud);
        this.ud.qdl(this, this.qdl);
        this.ud.rq();
    }

    private void kab() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar;
        if (this.mo.mo() || (udVar = this.ud) == null) {
            return;
        }
        udVar.qdl(this.tvp.gy.mo());
        this.ud.uw();
    }

    private void nz() {
        if (this.mo.mo() && !this.ljh) {
            this.ljh = true;
            qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.qdl.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] fArrQdl;
                    if (qdl.this.wd.bch()) {
                        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = qdl.this.tvp;
                        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = qdl.this.tvp;
                        fArrQdl = new float[]{ax.lnr(qdlVar.ag, qdlVar.ax.getWidth()), ax.lnr(qdlVar2.ag, qdlVar2.ax.getHeight())};
                    } else {
                        qdl qdlVar3 = qdl.this;
                        fArrQdl = qdlVar3.tvp.koa.qdl(qdlVar3.aaj);
                    }
                    if (!qdl.this.tvp.rc.qdl()) {
                        qdl.this.tvp.rc.qdl(fArrQdl);
                    } else {
                        qdl qdlVar4 = qdl.this;
                        qdlVar4.tvp.rc.qdl(qdlVar4.mo);
                    }
                }
            });
        }
    }

    private void zy() {
        this.ud.xmv();
        this.lnr = (int) this.tvp.bch.fco();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar.ra) {
            qdl(qdlVar.vu.mzz());
            qdl(this.tvp.vu.mml());
        }
        mzz();
        kab();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void aaj() {
        super.aaj();
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.ud;
        if (udVar == null) {
            return;
        }
        udVar.ud(this.exc);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public String bch() {
        return this.tvp.wak;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final void bjy() {
        this.tvp.bch.mrf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean bqt() {
        return this.tvp.bqt.tvp();
    }

    public void ekw() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar != null && qdlVar.bch.tvp()) {
            this.tvp.bch.aaj();
        }
    }

    public final void exc() {
        this.qdl.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final void exu() {
        super.exu();
        if (this.tvp == null || com.bytedance.sdk.component.utils.ud.qdl(yh())) {
            return;
        }
        this.tvp.hkc.xmv();
        com.bytedance.sdk.openadsdk.utils.mml.qdl(yh(), this.tvp.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean fco() {
        return this.tvp.bqt.to() && !bqt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void fs() {
        ud udVar = this.wd;
        if (udVar == null) {
            return;
        }
        udVar.ud(this, qdl(10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void hkc() {
        this.mml = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean hzv() {
        return this.mo.ra() == 10 && !bqt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
    }

    public abstract FrameLayout jpc();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final View jtx() {
        return this.tvp.bch.gy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void jyq() {
        super.jyq();
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.ud;
        if (udVar != null) {
            udVar.oth();
        }
    }

    public void kdv() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null) {
            return;
        }
        qdlVar.bch.bjy();
    }

    public void koa() {
        this.tvp.vu.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean ljh() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        return qdlVar != null && qdlVar.bch.kdv();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void lnr() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar;
        super.lnr();
        if (this.tvp == null || (udVar = this.ud) == null) {
            return;
        }
        udVar.yt();
        this.tvp.irn = true;
        if (en()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
            qdlVar.fco.qdl(qdlVar.ud.tvf());
        }
        this.tvp.gy.bjy();
        this.tvp.hkc.yt();
        this.tvp.xmv.mzz();
        if (this.ud.ud()) {
            this.tvp.bch.qdl(this.ud);
            if (this.tvp.bch.cx()) {
                qdl(this.tvp.bch.rdp(), true);
            } else if (this.tvp.bch.wd() && this.wd.bch()) {
                ax();
            } else {
                this.tvp.bch.qdl(false, this, this.oth != 0);
            }
        }
        this.oth++;
        nz();
        to toVar = this.tvp.bqt;
        if (toVar != null) {
            toVar.wd();
        }
        this.tvp.koa.qdl(this.qdl);
        if (this.wd.bch()) {
            this.tvp.bqt.qdl(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.bqt) {
            long j = this.uw;
            if (j != 0 && jCurrentTimeMillis - j > this.xmv) {
                aaj.qdl("TTAD.AdScene", "onResume: Exceed playable_duration_time, switch to next ad");
                cx().qdl(this, qdl(8));
                return;
            }
            if (j != 0) {
                this.xmv -= jCurrentTimeMillis - j;
            }
            aaj.qdl("TTAD.AdScene", "onResume: The playable display time has not yet arrived, continue the countdown -> remainingTime = " + this.xmv);
            qdl(this.xmv);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void mml() {
        super.mml();
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.ud;
        if (udVar == null) {
            return;
        }
        udVar.aaj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mo() {
        aaj.qdl("TTAD.AdScene", "onPlayableLoadingDismiss()---" + this.to);
        ud udVar = this.wd;
        if (udVar != null) {
            udVar.qdl(this);
        }
    }

    public abstract void mzz();

    public void oth() {
        if (this.bch) {
            aaj.qdl("TTAD.AdScene", "tryPreloadNextAdVideo: Already tried preloading the video");
        } else {
            this.bch = true;
            zlt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void rc() {
        com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl;
        super.rc();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null || (mmlVarQdl = qdlVar.bqt.qdl()) == null || !mmlVarQdl.ljh()) {
            return;
        }
        koa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void rdp() {
        super.rdp();
        if (this.bqt) {
            this.uw = System.currentTimeMillis();
            aaj.qdl("TTAD.AdScene", "onPause: remainingTime = " + this.xmv);
            CountDownTimer countDownTimer = this.koa;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.ud;
        if (udVar == null) {
            return;
        }
        udVar.exc();
        to toVar = this.tvp.bqt;
        if (toVar != null) {
            toVar.jpc();
        }
        if (this.wd.bch()) {
            this.tvp.bqt.qdl(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void rq() {
        super.rq();
        if (this.mo.mo()) {
            this.tvp.bqt.exu();
        }
    }

    public com.bytedance.sdk.openadsdk.mml.wd to() {
        to toVar;
        if (!this.mo.mo()) {
            com.bytedance.sdk.openadsdk.mml.wd wdVar = new com.bytedance.sdk.openadsdk.mml.wd();
            wdVar.qdl(System.currentTimeMillis(), 1.0f);
            return wdVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar != null && (toVar = qdlVar.bqt) != null && toVar.qdl() != null) {
            return this.tvp.bqt.qdl().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.mml.wd wdVar2 = new com.bytedance.sdk.openadsdk.mml.wd();
        wdVar2.qdl(System.currentTimeMillis(), 1.0f);
        return wdVar2;
    }

    public Map<String, Object> tvp() {
        ljh ljhVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar != null && qdlVar.bqt != null && (ljhVar = this.mo) != null && ljhVar.dk() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.tvp.bqt.rq()));
            JSONObject jSONObjectQdl = this.tvp.bqt.qdl((JSONObject) null);
            if (jSONObjectQdl != null) {
                Iterator<String> itKeys = jSONObjectQdl.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectQdl.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public abstract void ud();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(boolean z2) {
    }

    public void uw() {
        this.wd.qdl(this, qdl(com.bytedance.sdk.openadsdk.mml.ud.C0149ud.ud));
    }

    public void vu() {
        nz();
    }

    public final void wd() {
        Message message = new Message();
        message.what = 400;
        if (this.mo.mq()) {
            ud(10000);
        }
        this.qdl.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public com.bytedance.sdk.openadsdk.component.reward.qdl.qdl xmv() {
        return this.tvp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final void yt() {
        if (!this.tvp.rdp.getAndSet(true) || vu.lnr(this.tvp.ud)) {
            this.tvp.vu.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final void qdl(Activity activity, Bundle bundle) {
        this.jyq = bundle;
        super.qdl(activity, bundle);
        qdl(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mml(boolean z2) {
        ud udVar = this.wd;
        if (udVar != null) {
            udVar.qdl(this, z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public final com.bytedance.sdk.openadsdk.component.reward.view.tvp qdl() {
        return this.tvp.ax;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(Activity activity, ud.mzz mzzVar) {
        try {
            this.aaj = this.mo.jb();
            qdl(activity, this.mo, this.jyq);
            if (this.tvp.ra && this.mo.qur()) {
                this.tvp.gt = mzzVar.mml;
            }
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
            if (qdlVar.ra && this.to > 0) {
                qdlVar.gt = mzzVar.mml;
            }
            ijp();
            zy();
            if (com.bytedance.sdk.openadsdk.core.model.aaj.mzz(this.mo)) {
                lte();
            }
        } catch (Throwable th) {
            aaj.qdl("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.bjy.lnr.ud();
            wak();
        }
    }

    private void qdl(Activity activity, ljh ljhVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.component.reward.qdl.qdl(activity, this.qdl, ljhVar, this, 1, this.wd.ud(), this.tvp);
        this.tvp = qdlVar;
        qdlVar.ra = this.wd.mzz();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
        qdlVar2.qk = this.exu;
        qdlVar2.blf = qdlVar2.ra && com.bytedance.sdk.openadsdk.core.model.aaj.mzz(ljhVar);
        this.tvp.tqd = this.wd.lnr();
        this.tvp.fzn = this.wd.oth();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.tvp;
        qdlVar3.lq = this;
        qdlVar3.ekw = this.wd.aaj();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(this.tvp, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(intent, this.tvp);
            ljhVar.qdl(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.tvp.mlb) {
            ud();
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVarQdl = com.bytedance.sdk.openadsdk.component.reward.ud.mo.qdl(this.tvp);
        this.ud = udVarQdl;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.tvp;
        qdlVar4.en = udVarQdl;
        qdlVar4.mrf.qdl(this);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar5 = this.tvp;
        if (qdlVar5.ra) {
            qdlVar5.bch.qdl(new com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl() { // from class: com.bytedance.sdk.openadsdk.activity.qdl.1
                @Override // com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl
                public void qdl(int i2) {
                    qdl qdlVar6 = qdl.this;
                    ud udVar = qdlVar6.wd;
                    if (udVar == null) {
                        return;
                    }
                    udVar.ud(qdlVar6, i2);
                }
            });
            if (!this.wd.bch()) {
                this.wd.oth().setShowSound(ljh.mzz(ljhVar));
            }
        }
        bjy.qdl(this.tvp);
        Objects.toString(this.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void lnr(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.to toVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null || (toVar = qdlVar.vu) == null) {
            return;
        }
        toVar.ud(z2);
        this.tvp.vu.lnr(z2);
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.lnr.ud udVar) {
        if (udVar != null) {
            HashMap map = new HashMap();
            try {
                int i2 = this.rq + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i2);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            udVar.qdl(map);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(Activity activity) {
        super.qdl(activity);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null) {
            return;
        }
        qdlVar.koa.qdl();
    }

    private void qdl(long j) {
        this.koa = new CountDownTimer(j, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.qdl.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                aaj.qdl("TTAD.AdScene", "onFinish: remainingTime = " + qdl.this.xmv);
                ud udVarCx = qdl.this.cx();
                qdl qdlVar = qdl.this;
                udVarCx.qdl(qdlVar, qdlVar.qdl(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                qdl.this.xmv = j2;
                aaj.qdl("TTAD.AdScene", "onTick: remainingTime = " + qdl.this.xmv);
            }
        }.start();
    }

    public final void qdl(boolean z2, int i2) {
        qdl(z2, false, i2);
    }

    public final void qdl(boolean z2, boolean z3, int i2) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        qdlVar.mrf.qdl(z2, z3, false, qdlVar.en, i2);
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.ud;
        if (udVar == null) {
            return;
        }
        udVar.qdl(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(boolean z2) {
        aaj.qdl("TTAD.AdScene", "onPlayableHappenInteraction()---" + this.to + " isHappenInteraction:" + z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(String str, JSONObject jSONObject) {
        ud udVar;
        if (str == null || !"skipToNextAd".equals(str) || (udVar = this.wd) == null) {
            return;
        }
        udVar.ud(this, qdl(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public boolean qdl(long j, boolean z2) {
        com.bytedance.sdk.openadsdk.core.model.aaj aajVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null) {
            return false;
        }
        qdlVar.bqt.ud(false);
        this.mzz = false;
        com.bytedance.sdk.openadsdk.mml.wd wdVar = to();
        if (jpc() == null) {
            return false;
        }
        this.tvp.bch.qdl(jpc(), wdVar);
        Map<String, Object> mapTvp = this.mo.mo() ? tvp() : null;
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar2 = new com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.qdl.4
            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl(long j2, int i2) {
                aaj.qdl("TTAD.AdScene", "onComplete() called with: totalPlayTime = [" + j2 + "], percent = [" + i2 + "], mVideoHasCompleted=" + qdl.this.mzz);
                qdl qdlVar3 = qdl.this;
                if (qdlVar3.mzz) {
                    return;
                }
                qdlVar3.mzz = true;
                boolean zMo = qdlVar3.mo.mo();
                qdl.this.qdl.removeMessages(300);
                qdl.this.exc();
                qdl.this.tvp.bch.qdl(j2, j2);
                if (zMo) {
                    qdl.this.tvp.bqt.ud(true);
                } else {
                    qdl.this.tvp.exc.set(true);
                }
                if (qdl.this.tvp.ud.taz() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = qdl.this.tvp;
                    if (qdlVar4.lnr) {
                        qdlVar4.uw.lnr().lnr(qdl.this.tvp.ud);
                        bjy.ud();
                    }
                }
                if (!zMo && qdl.this.tvp.ud.hrh()) {
                    qdl.this.tvp.ud.om(1);
                    qdl.this.tvp.gy.yt();
                }
                if (qdl.this.tvp.ud.taz() == 21 && !qdl.this.tvp.ud.bjy()) {
                    qdl.this.tvp.ud.mml(true);
                    qdl.this.tvp.gy.yt();
                }
                ud.mzz mzzVarQdl = qdl.this.qdl(5);
                mzzVarQdl.mzz = true;
                qdl qdlVar5 = qdl.this;
                qdlVar5.wd.qdl(qdlVar5, mzzVarQdl);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void ud(long j2, int i2) {
                aaj.qdl("TTAD.AdScene", "onError() called with: totalPlayTime = [" + j2 + "], percent = [" + i2 + d9.i.f24752e);
                qdl.this.qdl.removeMessages(300);
                com.bytedance.sdk.openadsdk.core.model.aaj aajVar2 = qdl.this.tvp.gy.bjy;
                if (aajVar2 != null) {
                    aajVar2.to();
                }
                if (qdl.this.tvp.bch.mo()) {
                    qdl.this.wd();
                    return;
                }
                qdl.this.tvp.bch.exc();
                if (qdl.this.mo.mo()) {
                    qdl.this.tvp.bqt.qdl(true);
                }
                qdl qdlVar3 = qdl.this;
                qdlVar3.wd.qdl(qdlVar3, qdlVar3.qdl(3));
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl() {
                aaj.qdl("TTAD.AdScene", "onTimeOut() called with: ");
                qdl.this.qdl.removeMessages(300);
                qdl.this.exc();
                qdl qdlVar3 = qdl.this;
                qdlVar3.wd.qdl(qdlVar3, qdlVar3.qdl(6));
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl(long j2, long j3) {
                to toVar;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = qdl.this.tvp;
                if (!qdlVar3.irn && qdlVar3.bch.mo()) {
                    qdl.this.tvp.bch.ud(true);
                }
                if (qdl.this.tvp.to.get()) {
                    return;
                }
                qdl.this.qdl.removeMessages(300);
                if (j2 != qdl.this.tvp.bch.exu()) {
                    qdl.this.exc();
                }
                if (qdl.this.tvp.bch.mo()) {
                    qdl.this.tvp.bch.qdl(j2, j3);
                    int i2 = (int) (j2 / 1000);
                    if ((qdl.this.tvp.aaj.get() || qdl.this.tvp.rq.get()) && qdl.this.tvp.bch.mo()) {
                        qdl.this.tvp.bch.jyq();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = qdl.this.tvp;
                    if (qdlVar4.mml) {
                        qdlVar4.gy.mzz(i2);
                    }
                    if (qdl.this.mo.mo() && (toVar = qdl.this.tvp.bqt) != null && toVar.qdl() != null) {
                        qdl.this.tvp.bqt.qdl().setTime(String.valueOf(qdl.this.lnr), i2, 0, false);
                        qdl.this.tvp.bqt.qdl().qdl(j2, j3);
                    }
                    qdl.this.qdl((j2 * 1.0f) / j3);
                    qdl.this.tvp.qdl(true);
                }
            }
        };
        this.tvp.bch.qdl(qdlVar2);
        if (!this.mo.mo() && (aajVar = this.tvp.gy.bjy) != null) {
            aajVar.qdl(qdlVar2);
        }
        return this.tvp.bch.qdl(j, z2, mapTvp, this.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.mzz.qdl
    public void qdl(boolean z2, boolean z3, boolean z4, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar, int i2) {
        qdl(z2, z3, z4, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(jpc jpcVar, jpc jpcVar2, ud.mzz mzzVar) {
        super.qdl(jpcVar, jpcVar2, mzzVar);
        if (jpcVar == this && (jpcVar2 instanceof mzz)) {
            int i2 = mzzVar.ud;
            if (i2 == 3) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.bjy bjyVar = this.tvp.bch;
                bjyVar.qdl(!bjyVar.hzv() ? 1 : 0, 2);
            } else if (i2 == 6) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.bjy bjyVar2 = this.tvp.bch;
                bjyVar2.qdl(!bjyVar2.hzv() ? 1 : 0, !this.tvp.bch.hzv() ? 1 : 0);
            } else if (i2 == 5 && !ljh.mzz(this.tvp.ud) && mzzVar.mzz) {
                this.tvp.bch.qdl("skip", true);
            }
            this.tvp.fco.qdl(false);
            this.tvp.fco.mml(false);
        }
    }

    public void qdl(float f) {
        ud udVar = this.wd;
        if (udVar == null) {
            return;
        }
        udVar.qdl(f);
        if (this.bch || this.mo.taz() == 43 || f < this.mo.ag() / 100.0f) {
            return;
        }
        jpc jpcVarLjh = this.wd.ljh();
        if (jpcVarLjh instanceof qdl) {
            ((qdl) jpcVarLjh).oth();
        }
    }

    public ud.mzz qdl(int i2) {
        ud.mzz mzzVar = new ud.mzz(i2, this.tvp);
        mzzVar.mml = this.tvp.gt;
        return mzzVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(Map<String, Object> map, float f, float f2) {
        super.qdl(map, f, f2);
        this.wd.qdl(map, this, f, f2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(ljh ljhVar, int i2, int i3) {
        super.qdl(ljhVar, i2, i3);
        dk();
        this.ljh = false;
        this.vu = true;
    }
}
