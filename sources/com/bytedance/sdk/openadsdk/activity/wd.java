package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.bqt;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends qdl {
    private static String aaj;
    private static String bch;
    private static String jyq;
    private static String ljh;
    private static String oth;
    private int uw;

    public wd(ud udVar, ljh ljhVar, int i2, int i3, boolean z2) {
        super(udVar, ljhVar, i2, i3, z2);
        this.uw = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x008a  */
    public void dk() {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        this.tvp.bch.rc();
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(this.tvp.bch.fs());
        qdlVar.mml(this.tvp.bch.uw());
        qdlVar.lnr(this.tvp.bch.jtx());
        qdlVar.lnr(3);
        qdlVar.mml(this.tvp.bch.bch());
        qdlVar.qdl(this.tvp.bch.ud());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.tvp.bch.jpc(), qdlVar, this.tvp.bch.mzz());
        bqt.lnr(this.tvp.mo);
        this.tvp.bch.qdl("skip", false);
        if (this.tvp.lnr) {
            qdl(true, 4);
            if (aaj.qdl(this.tvp.ud) && !this.tvp.jtx.get()) {
                wak();
            }
        } else {
            wak();
        }
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.tvp.ud.zm();
        if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
            long jFs = this.tvp.bch.fs();
            mmlVarQdl.mo(jFs);
            mmlVarQdl.mzz(jFs);
        }
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.tvp.ud, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean a_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void ax() {
        super.ax();
        this.mzz = false;
        this.tvp.bqt.ud(false);
        this.tvp.bch.wc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public String b_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void c_() {
        this.tvp.kdv.qdl(((qdl) this).ud);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean d_() {
        return this.tvp.gt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
        xi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl
    public FrameLayout jpc() {
        fs fsVar;
        to toVar;
        if (this.mo.mo()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
            if (qdlVar == null || (toVar = qdlVar.bqt) == null) {
                return null;
            }
            return toVar.ud();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
        if (qdlVar2 == null || (fsVar = qdlVar2.gy) == null) {
            return null;
        }
        return fsVar.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl
    public void mzz() {
        final View view = this.tvp.gy.to();
        if (view != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.wd.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (wd.this.tvp.hkc.aaj() && wd.this.tvp.to.get()) {
                        boolean zExu = wd.this.tvp.hzv.exu();
                        wd.this.tvp.hkc.mo(zExu);
                        wd.this.tvp.gy.mo(8);
                        wd.this.tvp.cx.sendEmptyMessageDelayed(600, 5000L);
                        if (!ljh.lnr(wd.this.tvp.ud)) {
                            return;
                        }
                        if (ljh.lnr(wd.this.tvp.ud) && zExu) {
                            return;
                        }
                    }
                    wd.this.tvp.hkc.jyq();
                    wd.this.tvp.hzv.rq();
                    wd.this.tvp.vu.mo();
                    if (vu.mml(wd.this.tvp.ud)) {
                        wd.this.qdl(true, true, (Runnable) null);
                    } else {
                        wd.this.wak();
                    }
                }
            };
            view.setOnClickListener(onClickListener);
            view.setTag(view.getId(), onClickListener);
        }
        this.tvp.fco.qdl(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.wd.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void lnr(View view2) {
                View view3 = view;
                if (view3 != null) {
                    view3.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void mml(View view2) {
                wd wdVar = wd.this;
                wdVar.qdl(wdVar.tvp);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2) {
                wd wdVar = wd.this;
                wdVar.qdl(vu.lnr(wdVar.tvp.ud), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view2) {
                wd.this.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2, String str) {
                wd.this.qdl(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl
    public void ud() {
        this.tvp.fco.qdl(null, TTAdDislikeToast.getSkipText());
        this.tvp.fco.mzz(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(int i2) {
        if (i2 == 10000) {
            xi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl, com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(Activity activity, ud.mzz mzzVar) {
        ud udVar;
        super.qdl(activity, mzzVar);
        if (com.bytedance.sdk.component.utils.ud.qdl(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.bjy = intent.getStringExtra("media_extra");
        this.rdp = intent.getStringExtra("user_id");
        try {
            if (ljh == null) {
                ljh = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_reward_msg");
                aaj = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_msgPlayable");
                oth = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_negtiveBtnBtnText");
                bch = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_postiveBtnText");
                jyq = com.bytedance.sdk.component.utils.ljh.qdl(this.tvp.om, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.RewardAdScene", th.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null || (udVar = this.wd) == null) {
            return;
        }
        qdlVar.gg = udVar.qdl;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(String str) {
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = ((qdl) this).ud;
        if (udVar != null && udVar.mml() != null) {
            ((qdl) this).ud.mml().qdl(this.tvp.gt);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        qdlVar.gt = !qdlVar.gt;
        to toVar = qdlVar.bqt;
        if (toVar != null && toVar.qdl() != null) {
            this.tvp.bqt.qdl().setSoundMute(this.tvp.gt);
        }
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.tvp.gt);
        sb.append(" mLastVolume=");
        sb.append(this.tvp.ekw.qdl());
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
        qdlVar2.bch.qdl(qdlVar2.gt, str);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.tvp;
        qdlVar3.hkc.mzz(qdlVar3.gt);
        ljh ljhVar = this.tvp.ud;
        if (ljhVar == null || (mmlVarZm = ljhVar.zm()) == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.tvp;
        if (qdlVar4.gt) {
            mmlVarQdl.jpc(qdlVar4.bch.fs());
        } else {
            mmlVarQdl.tvp(qdlVar4.bch.fs());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(final boolean z2, boolean z3, final Runnable runnable) {
        if (!z3 && this.wd.rq().getBoolean("user_has_give_up_reward", false) && runnable != null) {
            return false;
        }
        if (!yt.mml().jpc(String.valueOf(this.tvp.mo))) {
            if (runnable == null) {
                if (z2) {
                    wak();
                    return false;
                }
                dk();
            }
            return false;
        }
        if (this.wd.rq().getBoolean("reward_verify", false)) {
            if (runnable == null) {
                if (z2) {
                    wak();
                    return false;
                }
                dk();
            }
            return false;
        }
        this.tvp.aaj.set(true);
        this.tvp.bch.jyq();
        if (z2) {
            this.tvp.xmv.mo();
        }
        final com.bytedance.sdk.openadsdk.core.widget.ud udVar = new com.bytedance.sdk.openadsdk.core.widget.ud(yh());
        ((qdl) this).ud.exu = udVar;
        if (z2) {
            udVar.qdl(aaj).ud(jyq).lnr(oth);
        } else {
            udVar.qdl(ljh).ud(bch).lnr(oth);
        }
        ((qdl) this).ud.exu.qdl(new com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud() { // from class: com.bytedance.sdk.openadsdk.activity.wd.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud
            public void qdl() {
                wd.this.tvp.bch.aaj();
                if (z2) {
                    wd.this.tvp.xmv.qdl(1000);
                }
                udVar.dismiss();
                wd.this.tvp.aaj.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0139ud
            public void ud() {
                udVar.dismiss();
                wd.this.wd.rq().putBoolean("user_has_give_up_reward", true);
                wd.this.tvp.aaj.set(false);
                wd.this.tvp.xmv.ud(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z2) {
                    wd.this.dk();
                } else {
                    wd.this.tvp.vu.mo();
                    wd.this.wak();
                }
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.tvp.lq != null && this.wd.ljh() == null && qdl(vu.lnr(this.tvp.ud), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.wd.4
            @Override // java.lang.Runnable
            public void run() {
                wd.super.qdl(str, jSONObject);
            }
        })) {
            return;
        }
        super.qdl(str, jSONObject);
    }
}
