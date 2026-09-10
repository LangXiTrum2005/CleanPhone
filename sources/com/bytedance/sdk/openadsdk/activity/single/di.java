package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.sf;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.zf;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ri {
    private boolean ac;

    public di(lr lrVar, wjv wjvVar, int i, int i2, boolean z) {
        super(lrVar, wjvVar, i, i2, z);
    }

    private boolean ri(wjv wjvVar) {
        return wjvVar == null || wjvVar.gz() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void a_() {
        lr lrVar = this.xha;
        if (lrVar != null && lrVar.ik()) {
            super.a_();
            return;
        }
        final View viewQt = this.jbs.dzy.qt();
        if (viewQt != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.di.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (di.this.jbs.ory.ac() && di.this.jbs.jbs.get()) {
                        boolean zAw = di.this.jbs.hcw.aw();
                        di.this.jbs.ory.di(zAw);
                        di.this.jbs.dzy.di(8);
                        di.this.jbs.jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.ik(di.this.jbs.lr)) {
                            return;
                        }
                        if (wjv.ik(di.this.jbs.lr) && zAw) {
                            return;
                        }
                    }
                    di.this.jbs.ory.ihz();
                    di.this.jbs.hcw.sf();
                    di.this.jbs.su.di();
                    di.this.feb();
                }
            };
            viewQt.setOnClickListener(onClickListener);
            viewQt.setTag(viewQt.getId(), onClickListener);
        }
        this.jbs.oh.ri(new com.bytedance.sdk.openadsdk.component.reward.top.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.di.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ik(View view) {
                View view2 = viewQt;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ka(View view) {
                di diVar = di.this;
                diVar.lr(diVar.jbs);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void lr(View view) {
                di.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view) {
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                if (ac.ri(di.this.jbs.lr) && !di.this.jbs.aw.get()) {
                    di.this.feb();
                    return;
                }
                di.this.jbs.ihz.oh();
                vr.ri riVar = new vr.ri();
                riVar.lr(di.this.jbs.ihz.aw());
                riVar.ka(di.this.jbs.ihz.su());
                riVar.ik(di.this.jbs.ihz.bu());
                riVar.ik(3);
                riVar.ka(di.this.jbs.ihz.fr());
                riVar.ri(di.this.jbs.ihz.lr());
                com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(di.this.jbs.ihz.mj(), riVar, di.this.jbs.ihz.fi());
                zf.ik(di.this.jbs.di);
                di.this.jbs.ihz.ri("skip", false);
                di.this.jbs.oh.ka(false);
                di diVar = di.this;
                if (diVar.jbs.ik) {
                    diVar.ri(true, 4);
                } else {
                    diVar.feb();
                }
                wjv wjvVar = di.this.jbs.lr;
                if (wjvVar != null && wjvVar.qc() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = di.this.jbs;
                    if (riVar2.ihz != null && (kaVarRi = riVar2.lr.qc().ri()) != null) {
                        kaVarRi.di(di.this.jbs.ihz.aw());
                        kaVarRi.fi(di.this.jbs.ihz.aw());
                    }
                }
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(di.this.jbs.lr, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view, String str) {
                di.this.ri(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean c_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public String d_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void e_() {
        this.jbs.zf.ri(((ri) this).lr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean f_() {
        return this.jbs.zyn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ri, com.bytedance.sdk.openadsdk.activity.single.mj
    public void ka() {
        super.ka();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null || !lr(riVar.lr) || ri(this.jbs.lr)) {
            return;
        }
        if (this.ac) {
            this.ac = false;
            feb();
        } else if (this.jbs.ory.su()) {
            feb();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.ri
    public void lr() {
        if (wjv.fi(this.jbs.lr)) {
            this.jbs.oh.ri(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
            if (riVar.ik) {
                this.jbs.oh.ri(null, TTAdDislikeToast.getSkipText());
            } else {
                riVar.oh.ri(null, "X");
            }
        }
        this.jbs.oh.fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void pv() {
        super.pv();
        this.fi = false;
        this.jbs.ay.lr(false);
        this.jbs.ihz.zyn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void xd() {
        if (this.jbs.lr.gz() != 100.0f) {
            this.ac = true;
        }
        super.xd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ri
    public FrameLayout xha() {
        sf sfVar;
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar;
        if (this.di.di()) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
            if (riVar == null || (jbsVar = riVar.ay) == null) {
                return null;
            }
            return jbsVar.lr();
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.jbs;
        if (riVar2 == null || (sfVar = riVar2.dzy) == null) {
            return null;
        }
        return sfVar.di();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(String str) {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        riVar.zyn = !riVar.zyn;
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = riVar.ay;
        if (jbsVar != null && jbsVar.ri() != null) {
            this.jbs.ay.ri().setSoundMute(this.jbs.zyn);
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.jbs;
        riVar2.ihz.ri(riVar2.zyn, str);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.jbs;
        riVar3.ory.fi(riVar3.zyn);
        wjv wjvVar = this.jbs.lr;
        if (wjvVar == null || (kaVarQc = wjvVar.qc()) == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = this.jbs;
        if (riVar4.zyn) {
            kaVarRi.mj(riVar4.ihz.aw());
        } else {
            kaVarRi.jbs(riVar4.ihz.aw());
        }
    }

    private boolean lr(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        return nr.ka().ac(String.valueOf(this.jbs.di));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void dzy() {
    }
}
