package com.bytedance.sdk.openadsdk.activity;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.bqt;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;

/* JADX INFO: loaded from: classes3.dex */
public class mo extends qdl {
    private boolean aaj;

    public mo(ud udVar, ljh ljhVar, int i2, int i3, boolean z2) {
        super(udVar, ljhVar, i2, i3, z2);
    }

    private boolean qdl(ljh ljhVar) {
        return ljhVar == null || ljhVar.nv() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean a_() {
        return false;
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
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void c_() {
        this.tvp.kdv.qdl(((qdl) this).ud);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public boolean d_() {
        return this.tvp.gt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void gy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl
    public FrameLayout jpc() {
        fs fsVar;
        to toVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        if (!this.mo.mo()) {
            com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = ((qdl) this).ud;
            if (udVar != null && (udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.jpc)) {
                return ((com.bytedance.sdk.openadsdk.component.reward.ud.jpc) udVar).vu();
            }
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
            if (qdlVar2 == null || (fsVar = qdlVar2.gy) == null) {
                return null;
            }
            return fsVar.mo();
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar2 = ((qdl) this).ud;
        if (udVar2 != null && (udVar2 instanceof com.bytedance.sdk.openadsdk.component.reward.ud.jpc) && (qdlVar = this.tvp) != null && !qdlVar.jjk) {
            return ((com.bytedance.sdk.openadsdk.component.reward.ud.jpc) udVar2).vu();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.tvp;
        if (qdlVar3 == null || (toVar = qdlVar3.bqt) == null) {
            return null;
        }
        return toVar.ud();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl, com.bytedance.sdk.openadsdk.activity.jpc
    public void mml() {
        super.mml();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null || !ud(qdlVar.ud) || qdl(this.tvp.ud)) {
            return;
        }
        if (this.aaj) {
            this.aaj = false;
            wak();
        } else if (this.tvp.hkc.bqt()) {
            wak();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mrf() {
        if (this.tvp.ud.nv() != 100.0f) {
            this.aaj = true;
        }
        super.mrf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.qdl
    public void mzz() {
        final View view = this.tvp.gy.to();
        if (view != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.mo.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (mo.this.tvp.hkc.aaj() && mo.this.tvp.to.get()) {
                        boolean zExu = mo.this.tvp.hzv.exu();
                        mo.this.tvp.hkc.mo(zExu);
                        mo.this.tvp.gy.mo(8);
                        mo.this.tvp.cx.sendEmptyMessageDelayed(600, 5000L);
                        if (!ljh.lnr(mo.this.tvp.ud)) {
                            return;
                        }
                        if (ljh.lnr(mo.this.tvp.ud) && zExu) {
                            return;
                        }
                    }
                    mo.this.tvp.hkc.jyq();
                    mo.this.tvp.hzv.rq();
                    mo.this.tvp.vu.mo();
                    mo.this.wak();
                }
            };
            view.setOnClickListener(onClickListener);
            view.setTag(view.getId(), onClickListener);
        }
        this.tvp.fco.qdl(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.mo.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void lnr(View view2) {
                View view3 = view;
                if (view3 != null) {
                    view3.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void mml(View view2) {
                mo moVar = mo.this;
                moVar.qdl(moVar.tvp);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                if (aaj.qdl(mo.this.tvp.ud) && !mo.this.tvp.jtx.get()) {
                    mo.this.wak();
                    return;
                }
                mo.this.tvp.bch.rc();
                bjy.qdl qdlVar = new bjy.qdl();
                qdlVar.ud(mo.this.tvp.bch.fs());
                qdlVar.mml(mo.this.tvp.bch.uw());
                qdlVar.lnr(mo.this.tvp.bch.jtx());
                qdlVar.lnr(3);
                qdlVar.mml(mo.this.tvp.bch.bch());
                qdlVar.qdl(mo.this.tvp.bch.ud());
                com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(mo.this.tvp.bch.jpc(), qdlVar, mo.this.tvp.bch.mzz());
                bqt.lnr(mo.this.tvp.mo);
                mo.this.tvp.bch.qdl("skip", false);
                mo.this.tvp.fco.mml(false);
                mo moVar = mo.this;
                if (moVar.tvp.lnr) {
                    moVar.qdl(true, 4);
                } else {
                    moVar.wak();
                }
                ljh ljhVar = mo.this.tvp.ud;
                if (ljhVar != null && ljhVar.zm() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = mo.this.tvp;
                    if (qdlVar2.bch != null && (mmlVarQdl = qdlVar2.ud.zm().qdl()) != null) {
                        mmlVarQdl.mo(mo.this.tvp.bch.fs());
                        mmlVarQdl.mzz(mo.this.tvp.bch.fs());
                    }
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(mo.this.tvp.ud, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view2) {
                mo.this.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2, String str) {
                mo.this.qdl(str);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.qdl
    public void ud() {
        if (ljh.mzz(this.tvp.ud)) {
            this.tvp.fco.qdl(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
            if (qdlVar.lnr) {
                this.tvp.fco.qdl(null, TTAdDislikeToast.getSkipText());
            } else {
                qdlVar.fco.qdl(null, "X");
            }
        }
        this.tvp.fco.mzz(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpc
    public void qdl(String str) {
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        qdlVar.gt = !qdlVar.gt;
        to toVar = qdlVar.bqt;
        if (toVar != null && toVar.qdl() != null) {
            this.tvp.bqt.qdl().setSoundMute(this.tvp.gt);
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = ((qdl) this).ud;
        if (udVar != null && udVar.mml() != null) {
            ((qdl) this).ud.mml().qdl(this.tvp.gt);
        }
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

    private boolean ud(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        return yt.mml().aaj(String.valueOf(this.tvp.mo));
    }
}
