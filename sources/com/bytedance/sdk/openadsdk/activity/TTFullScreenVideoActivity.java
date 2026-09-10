package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.bqt;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.utils.fco;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.qdl.lnr.ud jtx;
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud bjy;
    private boolean yt;

    private void rc() {
        if (com.bytedance.sdk.openadsdk.jyq.qdl.jpc() && isChangingConfigurations()) {
            aaj.qdl("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.wd) {
            return;
        }
        this.wd = true;
        aaj.qdl("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.bjy;
        if (udVar != null) {
            udVar.ud();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vu() {
        aaj.qdl("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.bjy;
        if (udVar != null) {
            udVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean aaj() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void car() {
        vu();
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TTFullScreenVideoActivity.this.ud.hkc.aaj() && TTFullScreenVideoActivity.this.ud.to.get()) {
                        boolean zExu = TTFullScreenVideoActivity.this.ud.hzv.exu();
                        TTFullScreenVideoActivity.this.ud.hkc.mo(zExu);
                        TTFullScreenVideoActivity.this.ud.gy.mo(8);
                        View view3 = view;
                        if (view3 instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                            ((com.bytedance.sdk.openadsdk.core.mo.mml) view3).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(TTFullScreenVideoActivity.this.ud.om, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.ud.cx.sendEmptyMessageDelayed(600, 5000L);
                        if (!ljh.lnr(TTFullScreenVideoActivity.this.ud.ud)) {
                            return;
                        }
                        if (ljh.lnr(TTFullScreenVideoActivity.this.ud.ud) && zExu) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.ud.hkc.jyq();
                    TTFullScreenVideoActivity.this.ud.hzv.rq();
                    TTFullScreenVideoActivity.this.ud.vu.mo();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            view.setOnClickListener(onClickListener);
            view.setTag(view.getId(), onClickListener);
        }
        this.ud.fco.qdl(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
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
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl2;
                if (vu.mo(TTFullScreenVideoActivity.this.ud.ud) || (vu.mzz(TTFullScreenVideoActivity.this.ud.ud) && TTFullScreenVideoActivity.this.ud.xmv.mml(com.bytedance.sdk.openadsdk.component.reward.qdl.jpc.ud))) {
                    if (vu.jpc(TTFullScreenVideoActivity.this.ud.ud)) {
                        TTFullScreenVideoActivity.this.ud.xmv.tvp();
                        return;
                    }
                    View view3 = view;
                    if (view3 != null) {
                        view3.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.aaj.qdl(TTFullScreenVideoActivity.this.ud.ud) && !TTFullScreenVideoActivity.this.ud.jtx.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                bjy.qdl qdlVar = new bjy.qdl();
                qdlVar.ud(TTFullScreenVideoActivity.this.ud.bch.fs());
                qdlVar.mml(TTFullScreenVideoActivity.this.ud.bch.uw());
                qdlVar.lnr(TTFullScreenVideoActivity.this.ud.bch.jtx());
                qdlVar.lnr(3);
                qdlVar.mml(TTFullScreenVideoActivity.this.ud.bch.bch());
                qdlVar.qdl(TTFullScreenVideoActivity.this.ud.bch.ud());
                com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(TTFullScreenVideoActivity.this.ud.bch.jpc(), qdlVar, TTFullScreenVideoActivity.this.ud.bch.mzz());
                bqt.lnr(TTFullScreenVideoActivity.this.ud.mo);
                TTFullScreenVideoActivity.this.ud.bch.qdl("skip", false);
                TTFullScreenVideoActivity.this.ud.fco.mml(false);
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTFullScreenVideoActivity.this.ud;
                if (!qdlVar2.lnr || (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(qdlVar2.ud) && (mmlVarQdl2 = TTFullScreenVideoActivity.this.ud.bqt.qdl()) != null && mmlVarQdl2.mml == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.qdl(true, 4);
                }
                ljh ljhVar = TTFullScreenVideoActivity.this.ud.ud;
                if (ljhVar != null && (mmlVarZm = ljhVar.zm()) != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    mmlVarQdl.mo(TTFullScreenVideoActivity.this.ud.bch.fs());
                    mmlVarQdl.mzz(TTFullScreenVideoActivity.this.ud.bch.fs());
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(TTFullScreenVideoActivity.this.ud.ud, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view2) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.ud.kdv.qdl(tTFullScreenVideoActivity.lnr);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2, String str) {
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = tTFullScreenVideoActivity.ud;
                qdlVar.gt = !qdlVar.gt;
                com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = tTFullScreenVideoActivity.lnr;
                if (udVar != null && udVar.mml() != null) {
                    TTFullScreenVideoActivity.this.lnr.mml().qdl(TTFullScreenVideoActivity.this.ud.gt);
                }
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTFullScreenVideoActivity.this.ud;
                qdlVar2.bch.qdl(qdlVar2.gt, str);
                if (!vu.jtx(TTFullScreenVideoActivity.this.ud.ud) || TTFullScreenVideoActivity.this.ud.to.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = TTFullScreenVideoActivity.this.ud;
                    qdlVar3.hkc.mzz(qdlVar3.gt);
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = TTFullScreenVideoActivity.this.ud;
                    qdlVar4.xmv.ud(qdlVar4.gt);
                    ljh ljhVar = TTFullScreenVideoActivity.this.ud.ud;
                    if (ljhVar == null || (mmlVarZm = ljhVar.zm()) == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar5 = TTFullScreenVideoActivity.this.ud;
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
        jtx = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.ud != null) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoForceBreak", this.ud.ud);
        }
        try {
            rc();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void gy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpc() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.bjy;
            if (udVar != null) {
                udVar.qdl();
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

    public void lnr(int i2) {
        int iWs = this.ud.ud.ws();
        if (!yt.mml().mo(String.valueOf(this.ud.mo)) || (!ljh.mzz(this.ud.ud) && !this.ud.lnr)) {
            if (i2 >= iWs) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
                if (!qdlVar.mlb) {
                    qdlVar.qdl(true);
                }
                mml();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
        if (!qdlVar2.mlb) {
            qdlVar2.qdl(true);
        }
        if (i2 > iWs) {
            mml();
        } else {
            mml(iWs - i2);
            this.ud.fco.mzz(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void mml() {
        if (ljh.mzz(this.ud.ud)) {
            this.ud.fco.qdl(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
            if (qdlVar.lnr) {
                this.ud.fco.qdl(null, TTAdDislikeToast.getSkipText());
            } else {
                qdlVar.fco.qdl(null, "X");
            }
        }
        this.ud.fco.mzz(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mrf() {
        if (this.ud.ud.nv() != 100.0f) {
            this.yt = true;
        }
        vu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || ljh.mzz(qdlVar.ud)) {
            return;
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = this.ud.ud.tdy();
        if (udVarTdy == null) {
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar = new com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud();
            udVar.qdl(10.0d);
            this.ud.ud.qdl(udVar);
        } else if (udVarTdy.mo() <= 0.0d) {
            udVarTdy.qdl(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rc();
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("recycleRes");
        }
        qdl(isFinishing(), isChangingConfigurations());
        this.bjy = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.exu) {
            jtx = this.bjy;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar == null || !ud(qdlVar.ud) || qdl(this.ud.ud)) {
            return;
        }
        if (this.yt) {
            this.yt = false;
            finish();
        } else if (this.ud.hkc.bqt()) {
            finish();
        }
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
        mmlVarQdl.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
            public void qdl() {
                TTFullScreenVideoActivity.this.vu();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(int i2) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        return (udVar == null || !(udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.jpc)) ? this.ud.gy.mo() : ((com.bytedance.sdk.openadsdk.component.reward.ud.jpc) udVar).vu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(boolean z2) {
    }

    private void qdl(final String str) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.qdl(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.ud.wak, str);
                } catch (Throwable th) {
                    aaj.lnr("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    private boolean ud(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        return yt.mml().aaj(String.valueOf(this.ud.mo));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qdl(Intent intent) {
        super.qdl(intent);
        this.ud.lte = intent.getBooleanExtra("is_verity_playable", false);
    }

    private void mml(int i2) {
        this.ud.fco.qdl(null, String.format(com.bytedance.sdk.component.utils.ljh.qdl(yt.qdl(), "tt_skip_ad_time_text"), Integer.valueOf(i2)));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
        if (this.exu) {
            super.qdl(bundle);
            this.bjy = (com.bytedance.sdk.openadsdk.qdl.lnr.ud) koa.qdl().qdl(this.tvp, com.bytedance.sdk.openadsdk.qdl.lnr.ud.class);
            return;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            this.bjy = koa.qdl().lnr();
        }
        if (this.bjy != null || bundle == null) {
            return;
        }
        this.bjy = jtx;
        jtx = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qdl(long j, long j2) {
        lnr((int) (j / 1000));
        int i2 = this.mo;
        if (i2 >= 0) {
            this.ud.fco.qdl(String.valueOf(i2), null);
        }
    }

    private boolean qdl(ljh ljhVar) {
        return ljhVar == null || ljhVar.nv() == 100.0f;
    }
}
