package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.slm;
import com.bytedance.sdk.openadsdk.component.reward.view.sf;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.zf;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ri {
    private static String ac;
    private static String ay;
    private static String ihz;
    private static String uq;
    private static String wjv;
    private int fr;

    public xha(lr lrVar, wjv wjvVar, int i, int i2, boolean z) {
        super(lrVar, wjvVar, i, i2, z);
        this.fr = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x008a  */
    public void aac() {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        this.jbs.ihz.oh();
        vr.ri riVar = new vr.ri();
        riVar.lr(this.jbs.ihz.aw());
        riVar.ka(this.jbs.ihz.su());
        riVar.ik(this.jbs.ihz.bu());
        riVar.ik(3);
        riVar.ka(this.jbs.ihz.fr());
        riVar.ri(this.jbs.ihz.lr());
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.jbs.ihz.mj(), riVar, this.jbs.ihz.fi());
        zf.ik(this.jbs.di);
        this.jbs.ihz.ri("skip", false);
        if (this.jbs.ik) {
            ri(true, 4);
            if (ac.ri(this.jbs.lr) && !this.jbs.aw.get()) {
                feb();
            }
        } else {
            feb();
        }
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.jbs.lr.qc();
        if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
            long jAw = this.jbs.ihz.aw();
            kaVarRi.di(jAw);
            kaVarRi.fi(jAw);
        }
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.jbs.lr, 5);
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (xha.this.jbs.ory.ac() && xha.this.jbs.jbs.get()) {
                        boolean zAw = xha.this.jbs.hcw.aw();
                        xha.this.jbs.ory.di(zAw);
                        xha.this.jbs.dzy.di(8);
                        xha.this.jbs.jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.ik(xha.this.jbs.lr)) {
                            return;
                        }
                        if (wjv.ik(xha.this.jbs.lr) && zAw) {
                            return;
                        }
                    }
                    xha.this.jbs.ory.ihz();
                    xha.this.jbs.hcw.sf();
                    xha.this.jbs.su.di();
                    if (dw.ka(xha.this.jbs.lr)) {
                        xha.this.ri(true, true, (Runnable) null);
                    } else {
                        xha.this.feb();
                    }
                }
            };
            viewQt.setOnClickListener(onClickListener);
            viewQt.setTag(viewQt.getId(), onClickListener);
        }
        this.jbs.oh.ri(new com.bytedance.sdk.openadsdk.component.reward.top.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ik(View view) {
                View view2 = viewQt;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ka(View view) {
                xha xhaVar = xha.this;
                xhaVar.lr(xhaVar.jbs);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void lr(View view) {
                xha.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view) {
                xha xhaVar = xha.this;
                xhaVar.ri(dw.ik(xhaVar.jbs.lr), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view, String str) {
                xha.this.ri(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ri, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void bu() {
        bnj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public String d_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void e_() {
        this.jbs.zf.ri(((ri) this).lr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public boolean f_() {
        return this.jbs.zyn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void pv() {
        super.pv();
        this.fi = false;
        this.jbs.ay.lr(false);
        this.jbs.ihz.zyn();
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.ri
    public void lr() {
        this.jbs.oh.ri(null, TTAdDislikeToast.getSkipText());
        this.jbs.oh.fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.mj, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void lr(int i) {
        if (i == 10000) {
            bnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ri, com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(Activity activity, lr.fi fiVar) {
        lr lrVar;
        super.ri(activity, fiVar);
        if (com.bytedance.sdk.component.utils.lr.ri(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.vr = intent.getStringExtra("media_extra");
        this.bgr = intent.getStringExtra("user_id");
        try {
            if (wjv == null) {
                wjv = uq.ri(this.jbs.srn, "tt_reward_msg");
                ac = uq.ri(this.jbs.srn, "tt_msgPlayable");
                uq = uq.ri(this.jbs.srn, "tt_negtiveBtnBtnText");
                ay = uq.ri(this.jbs.srn, "tt_postiveBtnText");
                ihz = uq.ri(this.jbs.srn, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.RewardAdScene", th.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.jbs;
        if (riVar == null || (lrVar = this.xha) == null) {
            return;
        }
        riVar.zk = lrVar.ri;
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
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.jbs.zyn);
        sb.append(" mLastVolume=");
        sb.append(this.jbs.dw.ri());
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(final boolean z, boolean z2, final Runnable runnable) {
        if (!z2 && this.xha.aw() && runnable != null) {
            return false;
        }
        if (!nr.ka().mj(String.valueOf(this.jbs.di))) {
            if (runnable == null) {
                if (z) {
                    feb();
                    return false;
                }
                aac();
            }
            return false;
        }
        if (this.xha.bu()) {
            if (runnable == null) {
                if (z) {
                    feb();
                    return false;
                }
                aac();
            }
            return false;
        }
        this.jbs.bu.set(true);
        this.jbs.ihz.uq();
        if (z) {
            this.jbs.wjv.di();
        }
        final com.bytedance.sdk.openadsdk.core.widget.lr lrVar = new com.bytedance.sdk.openadsdk.core.widget.lr(kt());
        ((ri) this).lr.f18093co = lrVar;
        if (z) {
            lrVar.ri(ac).lr(ihz).ik(uq);
        } else {
            lrVar.ri(wjv).lr(ay).ik(uq);
        }
        ((ri) this).lr.f18093co.ri(new com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr
            public void lr() {
                lrVar.dismiss();
                xha.this.xha.lr(true);
                xha.this.jbs.bu.set(false);
                xha.this.jbs.wjv.lr(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z) {
                    xha.this.aac();
                } else {
                    xha.this.jbs.su.di();
                    xha.this.feb();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.lr.InterfaceC0262lr
            public void ri() {
                xha.this.jbs.ihz.ihz();
                if (z) {
                    xha.this.jbs.wjv.ri(1000);
                }
                lrVar.dismiss();
                xha.this.jbs.bu.set(false);
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ri, com.bytedance.sdk.openadsdk.core.bgr.ka.lr
    public void ri(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.jbs.ajz != null && this.xha.fr() == null) {
            lr lrVar = this.xha;
            if (lrVar != null && lrVar.ik()) {
                slm slmVar = this.tan;
                if (slmVar != null && slmVar.ri(dw.ik(this.jbs.lr), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.4
                    @Override // java.lang.Runnable
                    public void run() {
                        xha.super.ri(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (ri(dw.ik(this.jbs.lr), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.5
                @Override // java.lang.Runnable
                public void run() {
                    xha.super.ri(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.ri(str, jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.mj
    public void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        if (riVar.ik) {
            ri(true, 4);
            if (ac.ri(riVar.lr) && !riVar.aw.get()) {
                feb();
            }
        } else {
            feb();
        }
        com.bytedance.sdk.openadsdk.common.ri.lr(riVar);
    }
}
