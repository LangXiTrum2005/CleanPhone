package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.rq;
import com.bytedance.sdk.openadsdk.core.bqt;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.inmobi.commons.core.configs.CrashConfig;
import com.smartdigimkt.b0.a;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String aaj;
    private static String exc;
    private static String jl;
    private static String jyq;
    private static String oth;
    private static com.bytedance.sdk.openadsdk.qdl.mzz.qdl uw;
    private String bch;
    protected int bjy;
    protected int jtx;
    private boolean koa;
    private String ljh;
    protected com.bytedance.sdk.openadsdk.qdl.mzz.qdl yt;
    private final AtomicBoolean xmv = new AtomicBoolean(false);
    private int bqt = -1;

    private JSONObject ekw() {
        JSONObject jSONObject = new JSONObject();
        int iXmv = (int) this.ud.bch.xmv();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.ud.ud.mlb());
            jSONObject.put("reward_amount", this.ud.ud.lte());
            jSONObject.put("network", jl.lnr(getApplicationContext()));
            jSONObject.put(a.s1, BuildConfig.VERSION_NAME);
            int iJle = this.ud.ud.jle();
            String strMml = "unKnow";
            if (iJle == 2) {
                strMml = gy.ud();
            } else if (iJle == 1) {
                strMml = gy.mml();
            }
            jSONObject.put("user_agent", strMml);
            JSONObject jSONObjectUzn = this.ud.ud.uzn();
            jSONObjectUzn.put("gaid", com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            jSONObject.put("extra", jSONObjectUzn);
            jSONObject.put("media_extra", this.ljh);
            jSONObject.put("video_duration", this.ud.ud.tdy().mo());
            jSONObject.put("play_start_ts", this.bjy);
            jSONObject.put("play_end_ts", this.jtx);
            jSONObject.put("duration", iXmv);
            jSONObject.put("user_id", this.bch);
            jSONObject.put("trans_id", uw.qdl().replace(TokenBuilder.TOKEN_DELIMITER, ""));
            return jSONObject;
        } catch (Throwable th) {
            aaj.qdl("TTAD.RVA", "", th);
            return null;
        }
    }

    private void hzv() {
        rq rqVar;
        if (com.bytedance.sdk.openadsdk.jyq.qdl.jpc() && isChangingConfigurations()) {
            aaj.qdl("BVA", "reward callback close is invoke by config change.");
            return;
        }
        if (this.wd) {
            aaj.qdl("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.wd = true;
        aaj.qdl("BVA", "invoke callback onAdClose, ");
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar != null && (rqVar = qdlVar.gg) != null) {
            rqVar.mml();
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar2 = this.yt;
        if (qdlVar2 != null) {
            qdlVar2.ud();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kdv() {
        aaj.qdl("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.yt;
        if (qdlVar != null) {
            qdlVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
    public void rc() {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl2;
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(this.ud.bch.fs());
        qdlVar.mml(this.ud.bch.uw());
        qdlVar.lnr(this.ud.bch.jtx());
        qdlVar.lnr(3);
        qdlVar.mml(this.ud.bch.bch());
        qdlVar.qdl(this.ud.bch.ud());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.ud.bch.jpc(), qdlVar, this.ud.bch.mzz());
        bqt.lnr(this.ud.mo);
        this.ud.bch.qdl("skip", false);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
        if (qdlVar2.lnr) {
            if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(qdlVar2.ud) && (mmlVarQdl2 = this.ud.bqt.qdl()) != null && mmlVarQdl2.mml == 0) {
                finish();
            } else {
                qdl(true, 4);
            }
            if (com.bytedance.sdk.openadsdk.core.model.aaj.qdl(this.ud.ud) && !this.ud.jtx.get()) {
                finish();
            }
        } else {
            finish();
        }
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.ud.ud.zm();
        if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
            long jFs = this.ud.bch.fs();
            mmlVarQdl.mo(jFs);
            mmlVarQdl.mzz(jFs);
        }
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.ud.ud, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean aaj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void bch() {
        vu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void car() {
        kdv();
        this.ud.ud.cor();
        this.ud.ud.lnr(true);
        if (ljh.mzz(this.ud.ud)) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
            ljh ljhVar = qdlVar.ud;
            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, qdlVar.mzz, ljhVar.wb());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void exc() {
        final View view = this.ud.gy.to();
        if (view != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TTRewardVideoActivity.this.ud.hkc.aaj() && TTRewardVideoActivity.this.ud.to.get()) {
                        boolean zExu = TTRewardVideoActivity.this.ud.hzv.exu();
                        TTRewardVideoActivity.this.ud.hkc.mo(zExu);
                        TTRewardVideoActivity.this.ud.gy.mo(8);
                        View view3 = view;
                        if (view3 instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                            ((com.bytedance.sdk.openadsdk.core.mo.mml) view3).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(TTRewardVideoActivity.this.ud.om, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.ud.cx.sendEmptyMessageDelayed(600, 5000L);
                        if (!ljh.lnr(TTRewardVideoActivity.this.ud.ud)) {
                            return;
                        }
                        if (ljh.lnr(TTRewardVideoActivity.this.ud.ud) && zExu) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.ud.hkc.jyq();
                    TTRewardVideoActivity.this.ud.hzv.rq();
                    TTRewardVideoActivity.this.ud.vu.mo();
                    if (vu.mml(TTRewardVideoActivity.this.ud.ud)) {
                        TTRewardVideoActivity.this.lnr(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            view.setOnClickListener(onClickListener);
            view.setTag(view.getId(), onClickListener);
        }
        this.ud.fco.qdl(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void lnr(View view2) {
                View view3 = view;
                if (view3 != null) {
                    view3.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void mml(View view2) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.lnr(vu.lnr(tTRewardVideoActivity.ud.ud), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view2) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.ud.kdv.qdl(tTRewardVideoActivity.lnr);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2, String str) {
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = TTRewardVideoActivity.this.lnr;
                if (udVar != null && udVar.mml() != null) {
                    TTRewardVideoActivity.this.lnr.mml().qdl(TTRewardVideoActivity.this.ud.gt);
                }
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = TTRewardVideoActivity.this.ud;
                qdlVar.gt = !qdlVar.gt;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(TTRewardVideoActivity.this.ud.gt);
                sb.append(" mLastVolume=");
                sb.append(TTRewardVideoActivity.this.ud.ekw.qdl());
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTRewardVideoActivity.this.ud;
                qdlVar2.bch.qdl(qdlVar2.gt, str);
                if (!vu.jtx(TTRewardVideoActivity.this.ud.ud) || TTRewardVideoActivity.this.ud.to.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = TTRewardVideoActivity.this.ud;
                    qdlVar3.hkc.mzz(qdlVar3.gt);
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = TTRewardVideoActivity.this.ud;
                    qdlVar4.xmv.ud(qdlVar4.gt);
                    ljh ljhVar = TTRewardVideoActivity.this.ud.ud;
                    if (ljhVar == null || (mmlVarZm = ljhVar.zm()) == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar5 = TTRewardVideoActivity.this.ud;
                    if (qdlVar5.gt) {
                        mmlVarQdl.jpc(qdlVar5.bch.fs());
                    } else {
                        mmlVarQdl.tvp(qdlVar5.bch.fs());
                    }
                }
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.exu) {
            return;
        }
        uw = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.ud != null) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoForceBreak", this.ud.ud);
        }
        hzv();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void gy() {
        lnr(2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
        vu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpc() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.yt;
            if (qdlVar != null) {
                qdlVar.qdl();
            }
        }
        if (oth()) {
            this.ud.bqt.exu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean jyq() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mrf() {
        kdv();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        ljh ljhVar;
        super.onCreate(bundle);
        try {
            if (jl == null) {
                jl = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_reward_msg");
                exc = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_msgPlayable");
                aaj = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_negtiveBtnBtnText");
                jyq = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_postiveBtnText");
                oth = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            aaj.lnr("TTAD.RVA", th.getMessage());
        }
        if (bundle == null || (qdlVar = this.ud) == null || (ljhVar = qdlVar.ud) == null || !ljhVar.fco()) {
            return;
        }
        this.xmv.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hzv();
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("recycleRes");
        }
        qdl(isFinishing(), isChangingConfigurations());
        this.yt = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        rq rqVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || (rqVar = qdlVar.gg) == null) {
            return;
        }
        rqVar.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        rq rqVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || (rqVar = qdlVar.gg) == null) {
            return;
        }
        rqVar.ud();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.exu) {
            uw = this.yt;
        }
        if (this.xmv.get() && (qdlVar = this.ud) != null) {
            qdlVar.ud.hzv();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void to() {
        com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl;
        super.to();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || (mmlVarQdl = qdlVar.bqt.qdl()) == null) {
            return;
        }
        mmlVarQdl.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
            public void qdl() {
                TTRewardVideoActivity.this.kdv();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void uw() {
        this.jtx = (int) (System.currentTimeMillis() / 1000);
    }

    public void vu() {
        lnr(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        return this.ud.gy.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void lnr() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        super.lnr();
        if (this.xmv.get() || (qdlVar = this.ud) == null) {
            return;
        }
        qdlVar.gg = new rq(new rq.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.rq.qdl
            public void qdl() {
                if (TTRewardVideoActivity.this.xmv.get() || TTRewardVideoActivity.this.koa) {
                    return;
                }
                TTRewardVideoActivity.this.lnr(1);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void mml() {
        this.ud.fco.qdl(null, TTAdDislikeToast.getSkipText());
        this.ud.fco.mzz(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ud(boolean z2, boolean z3) {
        this.bjy = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(int i2) {
        if (i2 == 10000) {
            vu();
        }
    }

    public void ud(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        if (this.bqt == -1) {
            this.bqt = Math.min(100, this.ud.ud.ijp());
        }
        if (((j / 1000.0f) / j2) * 100.0f >= this.bqt) {
            vu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(final boolean z2, boolean z3) {
        if (!z3 && this.koa && this.ud.to.get() && vu.jpc(this.ud.ud)) {
            this.ud.xmv.tvp();
            return;
        }
        if (!yt.mml().jpc(String.valueOf(this.ud.mo))) {
            if (!z3 && this.ud.to.get() && vu.jpc(this.ud.ud)) {
                this.ud.xmv.tvp();
                return;
            } else if (z2) {
                finish();
                return;
            } else {
                rc();
                return;
            }
        }
        if (this.xmv.get()) {
            if (this.ud.to.get() && vu.jpc(this.ud.ud)) {
                this.ud.xmv.tvp();
                return;
            } else if (z2) {
                finish();
                return;
            } else {
                rc();
                return;
            }
        }
        if (vu.jpc(this.ud.ud) && this.ud.hkc.jpc().getVisibility() == 0) {
            this.ud.xmv.tvp();
            return;
        }
        this.ud.aaj.set(true);
        this.ud.bch.jyq();
        if (z2) {
            this.ud.xmv.mo();
        }
        final com.bytedance.sdk.openadsdk.core.widget.ud udVar = new com.bytedance.sdk.openadsdk.core.widget.ud(this);
        this.lnr.exu = udVar;
        if (z2) {
            udVar.qdl(exc).ud(oth).lnr(aaj);
        } else {
            udVar.qdl(jl).ud(jyq).lnr(aaj);
        }
        this.lnr.exu.qdl(new com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud
            public void qdl() {
                TTRewardVideoActivity.this.ud.bch.aaj();
                if (z2) {
                    TTRewardVideoActivity.this.ud.xmv.qdl(1000);
                }
                udVar.dismiss();
                TTRewardVideoActivity.this.ud.aaj.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud
            public void ud() {
                udVar.dismiss();
                TTRewardVideoActivity.this.koa = true;
                TTRewardVideoActivity.this.ud.aaj.set(false);
                TTRewardVideoActivity.this.ud.xmv.ud(Integer.MAX_VALUE);
                if (!z2 || !vu.mo(TTRewardVideoActivity.this.ud.ud)) {
                    TTRewardVideoActivity.this.rc();
                } else if (vu.jpc(TTRewardVideoActivity.this.ud.ud)) {
                    TTRewardVideoActivity.this.ud.xmv.tvp();
                } else {
                    TTRewardVideoActivity.this.ud.vu.mo();
                    TTRewardVideoActivity.this.finish();
                }
            }
        }).show();
    }

    public void qdl(String str) {
        qdl(str, false, 0, "", 0, "");
    }

    private void qdl(final String str, final boolean z2, final int i2, final String str2, final int i3, final String str3) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.qdl(0).executeRewardVideoCallback(TTRewardVideoActivity.this.ud.wak, str, z2, i2, str2, i3, str3);
                } catch (Throwable th) {
                    aaj.lnr("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
        if (this.exu) {
            super.qdl(bundle);
            this.yt = (com.bytedance.sdk.openadsdk.qdl.mzz.qdl) koa.qdl().qdl(this.tvp, com.bytedance.sdk.openadsdk.qdl.mzz.qdl.class);
        } else {
            if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                this.yt = koa.qdl().ud();
            }
            if (this.yt == null && bundle != null) {
                this.yt = uw;
                uw = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.tvp + ",mRewardAdInteractionListener = " + this.yt + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(boolean z2) {
        if (z2) {
            vu();
            return;
        }
        if ((1.0d - (((double) this.mo) / this.ud.bch.fco())) * 100.0d >= yt.mml().xmv(String.valueOf(this.ud.mo)).mo) {
            vu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qdl(Intent intent) {
        super.qdl(intent);
        this.ljh = intent.getStringExtra("media_extra");
        this.bch = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qdl(long j, long j2) {
        int i2 = (int) (j / 1000);
        int iQg = this.ud.ud.qg();
        boolean z2 = iQg >= 0;
        lnr(j, j2);
        if (this.mo > 0) {
            this.ud.fco.mml(true);
            if (z2 && i2 >= iQg) {
                this.ud.qdl(true);
                this.ud.fco.qdl(String.valueOf(this.mo), TTAdDislikeToast.getSkipText());
                this.ud.fco.mzz(true);
                return;
            }
            this.ud.fco.qdl(String.valueOf(this.mo), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final boolean z2, final int i2, final String str, final int i3, final String str2, final int i4) {
        aaj.qdl("BVA", "invoke callback onRewardVerify: " + z2 + ", " + i2 + ", " + str + ", " + i3 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onRewardVerify", z2, i2, str, i3, str2);
            rq.qdl(this.ud.ud, z2, i4);
        } else {
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = TTRewardVideoActivity.this.yt;
                    if (qdlVar != null) {
                        qdlVar.qdl(z2, i2, str, i3, str2);
                        rq.qdl(TTRewardVideoActivity.this.ud.ud, z2, i4);
                    }
                }
            });
        }
    }

    public void lnr(final int i2) {
        if (this.xmv.get() || this.koa) {
            return;
        }
        this.xmv.set(true);
        rq rqVar = this.ud.gg;
        if (rqVar != null) {
            rqVar.lnr();
        }
        if (yt.mml().jtx(String.valueOf(this.ud.mo))) {
            qdl(true, this.ud.ud.lte(), this.ud.ud.mlb(), 0, "", i2);
        } else {
            yt.lnr().qdl(ekw(), new oth.ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.oth.ud
                public void qdl(int i3, String str) {
                    TTRewardVideoActivity.this.qdl(false, 0, "", i3, str, i2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.oth.ud
                public void qdl(com.bytedance.sdk.openadsdk.core.ljh.ud udVar) {
                    boolean z2 = udVar.ud;
                    TTRewardVideoActivity.this.qdl(udVar.ud, udVar.lnr.qdl(), udVar.lnr.ud(), 0, "", i2);
                }
            });
        }
    }

    public void lnr(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        boolean z2 = false;
        if (qdlVar != null) {
            if (qdlVar.ud.ijp() >= 0 && this.ud.ud.up() >= 0) {
                z2 = true;
            }
            if (z2) {
                j2 = this.ud.ud.up();
            }
        }
        long j3 = (((long) this.ud.xi) * 1000) + j;
        if (z2) {
            ud(j3, j2);
            return;
        }
        if (this.bqt == -1) {
            this.bqt = yt.mml().xmv(String.valueOf(this.ud.mo)).mo;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL && j3 >= 27000) {
            vu();
        } else if ((j3 * 100) / j2 >= this.bqt) {
            vu();
        }
    }
}
