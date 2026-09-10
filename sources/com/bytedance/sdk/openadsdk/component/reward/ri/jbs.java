package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.igq;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.nr;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    protected boolean aw;
    protected boolean bgr;
    protected FrameLayout bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected final ri f18095co;
    private boolean ik;
    protected final Activity jbs;
    private com.bytedance.sdk.openadsdk.activity.single.ka.di lr;
    protected volatile boolean mj;
    protected com.bytedance.sdk.openadsdk.uq.ri.ri nr;
    protected final wjv qt;
    private nr ri;
    protected final String sf;
    protected boolean slm;
    protected AtomicBoolean tan = new AtomicBoolean(false);
    protected boolean vr;

    public jbs(ri riVar) {
        this.f18095co = riVar;
        this.jbs = riVar.ig;
        this.sf = riVar.fi;
        wjv wjvVar = riVar.lr;
        this.qt = wjvVar;
        this.bgr = dw.fi(wjvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bu() {
        com.bytedance.sdk.openadsdk.activity.single.lr lrVarJc;
        ri riVar = this.f18095co;
        if (riVar.xe) {
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
            if (mjVar == null || (lrVarJc = mjVar.jc()) == null) {
                return;
            }
            lrVarJc.ri(2);
            return;
        }
        if (this instanceof xha) {
            jbs();
        } else {
            com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = this.lr;
            if (diVar != null) {
                diVar.lr();
            }
        }
        this.ik = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka(boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.lr lrVarJc;
        ri riVar = this.f18095co;
        if (!riVar.xe) {
            if (this instanceof xha) {
                ri(0L);
            } else {
                com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = this.lr;
                if (diVar != null) {
                    diVar.ik();
                }
            }
            this.ik = false;
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
        if (mjVar == null || (lrVarJc = mjVar.jc()) == null) {
            return;
        }
        if (z) {
            lrVarJc.ory();
        }
        lrVarJc.ri(1);
    }

    private void nr() {
        int iPsd = this.qt.psd();
        if (iPsd == -1) {
            if (dw.xha(this.qt)) {
                com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.nr;
                if (riVar == null || !riVar.fi()) {
                    this.f18095co.nd.uq();
                    return;
                } else {
                    this.f18095co.slm.set(true);
                    this.f18095co.nd.aw();
                }
            } else {
                this.f18095co.slm.set(true);
                this.f18095co.nd.aw();
            }
        } else {
            if (iPsd < 0) {
                return;
            }
            this.f18095co.oh.ka(false);
            if (dw.xha(this.qt)) {
                com.bytedance.sdk.openadsdk.uq.ri.ri riVar2 = this.nr;
                if (riVar2 == null || !riVar2.fi()) {
                    com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = new com.bytedance.sdk.openadsdk.activity.single.ka.di(iPsd) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.5
                        @Override // com.bytedance.sdk.openadsdk.activity.single.ka.di
                        public void ri() {
                            jbs.this.f18095co.jc.sendEmptyMessage(1);
                        }
                    };
                    this.lr = diVar;
                    diVar.fi();
                    return;
                } else {
                    com.bytedance.sdk.openadsdk.activity.single.ka.di diVar2 = new com.bytedance.sdk.openadsdk.activity.single.ka.di(iPsd) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.4
                        @Override // com.bytedance.sdk.openadsdk.activity.single.ka.di
                        public void ri() {
                            jbs.this.f18095co.jc.sendEmptyMessage(600);
                        }
                    };
                    this.lr = diVar2;
                    diVar2.fi();
                }
            } else {
                com.bytedance.sdk.openadsdk.activity.single.ka.di diVar3 = new com.bytedance.sdk.openadsdk.activity.single.ka.di(iPsd) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.6
                    @Override // com.bytedance.sdk.openadsdk.activity.single.ka.di
                    public void ri() {
                        jbs.this.f18095co.jc.sendEmptyMessage(600);
                    }
                };
                this.lr = diVar3;
                diVar3.fi();
            }
        }
        ri riVar3 = this.f18095co;
        if (riVar3.aac == null || !riVar3.xha()) {
            return;
        }
        this.f18095co.aac.ri(iPsd);
    }

    private void slm() {
        if (this.f18095co.lr.tl()) {
            nr nrVar = new nr(this.f18095co, new nr.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
                public void di() {
                    jbs.this.ka(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
                public void fi() {
                    jbs.this.bu();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
                public void ik() {
                    com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
                    com.bytedance.sdk.openadsdk.activity.single.lr lrVarJc;
                    dzy dzyVarXha = jbs.this.nr.xha();
                    if (dzyVarXha != null) {
                        dzyVarXha.ri("popupDidShow", (JSONObject) null);
                    }
                    ri riVar = jbs.this.f18095co;
                    if (!riVar.xe || (mjVar = riVar.ajz) == null || (lrVarJc = mjVar.jc()) == null) {
                        return;
                    }
                    lrVarJc.hcw();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
                public int ka() {
                    jbs jbsVar = jbs.this;
                    return jbsVar.f18095co.xe ? jbsVar.co() : jbsVar.mj();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
                public void lr() {
                    dzy dzyVarXha = jbs.this.nr.xha();
                    if (dzyVarXha != null) {
                        dzyVarXha.ri("popupDidDismiss", (JSONObject) null);
                    }
                    jbs.this.ka(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.nr.ri
                public void ri() {
                    jbs.this.f18095co.qd.ri("skipToNextAd", (JSONObject) null);
                }
            });
            this.ri = nrVar;
            nrVar.ri(this.f18095co.pv);
            dzy dzyVarXha = this.nr.xha();
            if (dzyVarXha != null) {
                dzyVarXha.ri(new igq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.2
                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    public void m_() {
                        if (jbs.this.ri != null) {
                            jbs.this.ri.ri(jbs.this.f18095co.ig);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    public void n_() {
                        if (jbs.this.ri != null) {
                            jbs.this.ri.n_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    public int o_() {
                        jbs jbsVar = jbs.this;
                        return jbsVar.f18095co.xe ? jbsVar.co() : jbsVar.mj();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    public void p_() {
                        jbs.this.bu();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    public void q_() {
                        jbs.this.ka(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    public void r_() {
                    }
                });
            }
        }
    }

    public boolean aw() {
        return this.mj;
    }

    public void bgr() {
        if (!this.tan.compareAndSet(false, true)) {
            this.f18095co.ory.xha();
            return;
        }
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.nr;
        if (riVar != null) {
            riVar.ri(true);
        }
        this.f18095co.ory.xha(true);
        ri riVar2 = this.f18095co;
        riVar2.xd.ri(true, riVar2.nd);
        if (this.f18095co.xd.fi()) {
            ri riVar3 = this.f18095co;
            riVar3.aac.ri(riVar3.xha);
            return;
        }
        ri riVar4 = this.f18095co;
        riVar4.ory.ri(riVar4.zyn, true);
        this.f18095co.ory.ik(true);
        this.f18095co.ory.lr(true);
        this.f18095co.jc.removeMessages(600);
    }

    public int co() {
        com.bytedance.sdk.openadsdk.activity.single.lr lrVarJc;
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.f18095co.ajz;
        if (mjVar == null || (lrVarJc = mjVar.jc()) == null) {
            return 0;
        }
        return lrVarJc.oh();
    }

    public void di() {
        if (this.bgr && !this.slm) {
            this.slm = true;
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.nr;
            if (riVar != null) {
                riVar.ka();
            }
            FrameLayout frameLayout = this.bu;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            nr nrVar = this.ri;
            if (nrVar != null) {
                nrVar.mj();
                this.ri = null;
            }
            com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = this.lr;
            if (diVar != null) {
                diVar.ka();
                this.lr = null;
            }
        }
    }

    public void fi() {
        if (!this.bgr || this.tan.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.nr;
        if (riVar != null) {
            riVar.ik();
        }
        com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = this.lr;
        if (diVar != null) {
            diVar.lr();
        }
    }

    public void ik() {
        if (this.bgr) {
            this.mj = true;
            ik(this.f18095co.zyn);
            this.nr.ri();
            nr();
            if (dw.mj(this.qt)) {
                this.f18095co.ory.di();
            }
        }
    }

    public void jbs() {
        com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = this.lr;
        if (diVar != null) {
            diVar.lr();
        }
    }

    public int mj() {
        com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = this.lr;
        if (diVar != null) {
            return (int) (diVar.di() / 1000);
        }
        return 0;
    }

    public boolean qt() {
        return false;
    }

    public void ri(int i) {
    }

    public boolean sf() {
        return !this.ik;
    }

    public boolean vr() {
        nr nrVar = this.ri;
        if (nrVar != null) {
            return nrVar.jbs();
        }
        return false;
    }

    public int xha() {
        return 0;
    }

    public void lr(boolean z) {
        if (this.bgr) {
            ri riVar = this.f18095co;
            if (riVar.kt) {
                this.bu = (FrameLayout) riVar.pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.cgm);
                ri(z);
                slm();
            }
        }
    }

    public void ri() {
        if (this.bgr && !this.aw) {
            this.aw = true;
        }
    }

    public com.bytedance.sdk.openadsdk.aw.di lr() {
        return new com.bytedance.sdk.openadsdk.aw.di() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.3
            @Override // com.bytedance.sdk.openadsdk.aw.di
            public void ri() {
                jbs.this.f18095co.qd.lr(false);
            }
        };
    }

    public void ri(boolean z) {
        FrameLayout frameLayout = this.bu;
        if (frameLayout != null) {
            ri riVar = this.f18095co;
            Context context = riVar.srn;
            wjv wjvVar = this.qt;
            int i = riVar.bnj;
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar2 = new com.bytedance.sdk.openadsdk.uq.ri.ri(context, wjvVar, i, z, frameLayout, false, mjVar != null ? mjVar.srn() : 0);
            this.nr = riVar2;
            riVar2.ri(this.f18095co.qd);
            this.nr.ri(true, lr());
        }
    }

    public void ik(boolean z) {
        if (this.bgr && this.nr != null && this.mj) {
            this.nr.ri(z);
        }
    }

    public void ka() {
        if (!this.bgr || this.tan.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.nr;
        if (riVar != null) {
            riVar.lr();
        }
        if (this.lr == null || !sf()) {
            return;
        }
        this.lr.ik();
    }

    public void ri(long j) {
        com.bytedance.sdk.openadsdk.activity.single.ka.di diVar = this.lr;
        if (diVar != null) {
            diVar.ik();
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.fi fiVar) {
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar;
        if (this.bgr && (riVar = this.nr) != null) {
            riVar.ri(fiVar);
        }
    }
}
