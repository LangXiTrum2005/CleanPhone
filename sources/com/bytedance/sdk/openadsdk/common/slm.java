package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.model.dw;

/* JADX INFO: loaded from: classes2.dex */
public abstract class slm {
    protected String di;
    protected String fi;
    protected String ik;
    protected String ka;
    protected String lr;
    protected final com.bytedance.sdk.openadsdk.component.reward.ri.ri xha;

    public slm(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.xha = riVar;
        fi();
    }

    private boolean di() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.xha;
        return !riVar.xe && riVar.jbs.get();
    }

    private void fi() {
        if (this.lr != null) {
            return;
        }
        try {
            this.lr = uq.ri(this.xha.srn, "tt_reward_msg");
            this.ik = uq.ri(this.xha.srn, "tt_msgPlayable");
            this.di = uq.ri(this.xha.srn, "tt_negtiveBtnBtnText");
            this.ka = uq.ri(this.xha.srn, "tt_postiveBtnText");
            this.fi = uq.ri(this.xha.srn, "tt_postiveBtnTextPlayable");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("RewardTipDialogHelper", "init res text failed：" + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(boolean z) {
        this.xha.ihz.ihz();
        if (z) {
            this.xha.wjv.ri(1000);
        }
        this.xha.bu.set(false);
    }

    private boolean jbs() {
        return !this.xha.lr.zyn() && dw.mj(this.xha.lr) && this.xha.ory.mj().getVisibility() == 0;
    }

    private boolean lr(boolean z, boolean z2, Runnable runnable) {
        if ((z || !di() || !mj()) && runnable == null) {
            if (z2) {
                ik();
                return true;
            }
            ka();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mj() {
        if (!dw.mj(this.xha.lr)) {
            return false;
        }
        this.xha.wjv.jbs();
        return true;
    }

    private boolean xha() {
        return com.bytedance.sdk.openadsdk.core.nr.ka().mj(String.valueOf(this.xha.di));
    }

    public abstract void ik();

    public void ka() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.xha;
        if (riVar == null) {
            com.bytedance.sdk.component.utils.ac.ik("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
        if (mjVar == null || !(mjVar instanceof com.bytedance.sdk.openadsdk.activity.single.fi)) {
            riVar.ihz.oh();
            ri.ri(this.xha);
            ri(this.xha);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.single.fi) mjVar).mj()) {
                return;
            }
            ik();
        }
    }

    public abstract boolean lr();

    public abstract void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar);

    public abstract void ri(boolean z);

    public abstract boolean ri();

    public final boolean ri(boolean z, boolean z2, Runnable runnable) {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.xha;
        if (riVar.ajz instanceof com.bytedance.sdk.openadsdk.activity.single.fi) {
            if (!riVar.ka || lr() || (this.xha.ajz.jc() != null && this.xha.ajz.jc().bu())) {
                return false;
            }
            if (!z2 && ri()) {
                return false;
            }
            if (!xha()) {
                if (!z2) {
                    return false;
                }
                if (runnable == null && z) {
                    ik();
                    return true;
                }
            }
        } else {
            if (ri(z2, runnable)) {
                return false;
            }
            if (!xha()) {
                return lr(z2, z, runnable);
            }
            if (lr()) {
                lr(z, runnable);
                return false;
            }
            if (jbs()) {
                this.xha.wjv.jbs();
                return false;
            }
        }
        ik(z, runnable);
        return true;
    }

    private void ik(final boolean z, final Runnable runnable) {
        lr(z);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.xha;
        if (riVar != null && !riVar.ig.isFinishing() && !this.xha.ig.isDestroyed()) {
            final com.bytedance.sdk.openadsdk.core.widget.lr lrVar = new com.bytedance.sdk.openadsdk.core.widget.lr(this.xha.ig);
            com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar2 = this.xha.nd;
            if (lrVar2 == null) {
                com.bytedance.sdk.component.utils.ac.ik("RewardTipDialogHelper", "adContext or  adType == null");
                return;
            }
            lrVar2.f18093co = lrVar;
            if (z) {
                lrVar.ri(this.ik).lr(this.fi).ik(this.di);
            } else {
                lrVar.ri(this.lr).lr(this.ka).ik(this.di);
            }
            lrVar.ri(new com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr() { // from class: com.bytedance.sdk.openadsdk.common.slm.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr
                public void lr() {
                    lrVar.dismiss();
                    slm.this.ri(true);
                    slm.this.xha.bu.set(false);
                    slm.this.xha.wjv.lr(Integer.MAX_VALUE);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    if (!z) {
                        slm.this.ka();
                        return;
                    }
                    slm slmVar = slm.this;
                    if (slmVar.xha.xe || !slmVar.mj()) {
                        slm.this.xha.su.di();
                        slm.this.ik();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr
                public void ri() {
                    slm.this.ik(z);
                    lrVar.dismiss();
                }
            }).show();
            return;
        }
        com.bytedance.sdk.component.utils.ac.ik("RewardTipDialogHelper", "adContext or activity is null");
    }

    private void lr(boolean z, Runnable runnable) {
        if (!(di() && mj()) && runnable == null) {
            if (z) {
                ik();
            } else {
                ka();
            }
        }
    }

    private void lr(boolean z) {
        this.xha.ihz.uq();
        if (z) {
            this.xha.wjv.di();
        }
        this.xha.bu.set(true);
    }

    private boolean ri(boolean z, Runnable runnable) {
        if (z || !ri()) {
            return false;
        }
        if (!this.xha.xe) {
            if (di()) {
                return mj();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        ka();
        return true;
    }
}
