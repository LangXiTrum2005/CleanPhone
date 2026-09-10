package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lr.bgr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.ay;
import com.bytedance.sdk.openadsdk.core.jbs.bu;
import com.bytedance.sdk.openadsdk.core.jbs.vr;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ac {
    public static float ri = 100.0f;
    private float di;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri fi;
    bu ik;
    public int ka;
    vr lr;
    private com.bytedance.sdk.openadsdk.uq.ri.ri xha;

    public ik(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, AdSlot adSlot, String str) {
        super(riVar.ig, riVar.lr, adSlot, str, riVar.zyn, !riVar.xe);
        this.ka = 1;
        this.di = -1.0f;
        this.fi = riVar;
        setVideoBusiness(riVar.qd);
    }

    private void aw() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.lr.ik() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ik.2
            @Override // com.bytedance.sdk.component.adexpress.lr.ik
            public boolean ri(ViewGroup viewGroup, int i) {
                try {
                    ((ac) viewGroup).ac();
                    ik.this.ik = new bu(viewGroup.getContext());
                    ik ikVar = ik.this;
                    ikVar.ik.ri(((ac) ikVar).f18122co, (ac) viewGroup, ik.this.fi.pv);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    private void ik(bgr bgrVar) {
        FrameLayout frameLayoutSlm;
        boolean z;
        try {
            if (!(bgrVar instanceof com.bytedance.sdk.openadsdk.core.co.di.lr) || (frameLayoutSlm = ((com.bytedance.sdk.openadsdk.core.co.di.lr) bgrVar).slm()) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.fi.ajz;
            boolean z2 = true;
            if (mjVar == null || mjVar.jc() == null) {
                z = false;
            } else {
                com.bytedance.sdk.openadsdk.activity.single.mj mjVarSf = this.fi.ajz.jc().sf();
                com.bytedance.sdk.openadsdk.activity.single.mj mjVar2 = this.fi.ajz;
                z = mjVarSf == mjVar2;
                if (!mjVar2.jc().wjv() && z) {
                    z2 = false;
                }
            }
            boolean z3 = z2;
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar = new com.bytedance.sdk.openadsdk.uq.ri.ri(this.jbs, this.f18122co, this.fi.bnj, z3, frameLayoutSlm);
            this.xha = riVar;
            riVar.ri(this.fi.qd);
            this.xha.ri(false, (com.bytedance.sdk.openadsdk.aw.di) null);
            this.xha.ri();
            com.bytedance.sdk.component.utils.ac.ri("TTAD.FRExpressView", "initPlayable success mute = " + this.fi.zyn + ",isCurrentScene->" + z + ",isMute = " + z3);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka(bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        double dFi = bgrVar.fi();
        double dDi = bgrVar.di();
        double dXha = bgrVar.xha();
        double dMj = bgrVar.mj();
        int iLr = qd.lr(this.jbs, (float) dFi);
        int iLr2 = qd.lr(this.jbs, (float) dDi);
        int iLr3 = qd.lr(this.jbs, (float) dXha);
        int iLr4 = qd.lr(this.jbs, (float) dMj);
        if ((dMj != 0.0d && dXha != 0.0d) || this.zf.ik() == 7 || this.zf.ik() == 10 || (this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ka)) {
            if ((this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) && (bgrVar instanceof com.bytedance.sdk.openadsdk.core.co.di.lr)) {
                FrameLayout frameLayoutVr = ((com.bytedance.sdk.openadsdk.core.co.di.lr) bgrVar).vr();
                if (frameLayoutVr != null) {
                    if (this.aw.getParent() != null) {
                        ((ViewGroup) this.aw.getParent()).removeView(this.aw);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutVr.addView(this.aw, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.aw.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iLr3, iLr4);
            }
            layoutParams2.width = iLr3;
            layoutParams2.height = iLr4;
            layoutParams2.topMargin = iLr2;
            layoutParams2.leftMargin = iLr;
            layoutParams2.setMarginStart(iLr);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.aw.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public void co() {
        try {
            com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.xha;
            if (riVar != null) {
                riVar.ka();
            }
        } catch (Throwable unused) {
        }
        if (!wjv() && (getExpressInteractionListener() instanceof PAGRewardFullExpressAdListenerProxy)) {
            ((PAGRewardFullExpressAdListenerProxy) getExpressInteractionListener()).triggerUnfinishedFail(this);
        }
        super.co();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void di() {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.di();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.model.ac acVar;
        sf sfVar = this.fi.dzy;
        if (sfVar != null && (acVar = sfVar.vr) != null && acVar.jbs()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.di = motionEvent.getY();
            } else if (action == 1) {
            }
            if (qd.ri(this.di, motionEvent.getY(), this.jbs)) {
                acVar.lr(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public int fi() {
        vr vrVar = this.lr;
        if (vrVar == null) {
            return 0;
        }
        int iFi = vrVar.fi();
        xha(iFi);
        return iFi;
    }

    public View getBackupContainerBackgroundView() {
        if (ihz()) {
            return this.ik.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return ihz() ? this.ik.getVideoContainer() : this.aw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public boolean jbs() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.fi.ajz;
        return mjVar == null || !mjVar.jc().su();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public boolean mj() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.fi.ajz;
        if (mjVar == null || !mjVar.jc().su()) {
            return true;
        }
        return this.fi.tnn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public void qt() {
        super.qt();
        if (this.xha != null) {
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.fi.ajz;
            if (mjVar != null && mjVar.jc() != null) {
                this.xha.ri(this.fi.ajz.jc().wjv());
            }
            this.xha.lr();
        }
    }

    public void setExpressVideoListenerProxy(vr vrVar) {
        this.lr = vrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setSoundMute(boolean z) {
        super.setSoundMute(z);
        com.bytedance.sdk.openadsdk.uq.ri.ri riVar = this.xha;
        if (riVar != null) {
            riVar.ri(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public void sf() {
        super.sf();
        if (this.xha != null) {
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.fi.ajz;
            if (mjVar != null && mjVar.jc() != null) {
                this.xha.ri(true);
            }
            this.xha.ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public void xha() {
        this.vr = true;
        this.aw = new FrameLayout(this.jbs);
        if (!com.bytedance.sdk.openadsdk.core.co.fi.ri(this.f18122co) && !com.bytedance.sdk.openadsdk.core.co.fi.lr(this.f18122co)) {
            addView(this.aw, new FrameLayout.LayoutParams(-1, -1));
        }
        super.xha();
        com.bytedance.sdk.component.jbs.di webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        aw();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.aw.xha() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ik.1
            @Override // com.bytedance.sdk.openadsdk.aw.xha
            public void ri(bgr bgrVar) {
                ik.this.ri(bgrVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public boolean lr(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.lr.ri(this.fi);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void lr() {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.component.adexpress.lr.vr
    public void ri(com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar, bgr bgrVar) {
        this.zf = kaVar;
        wjv wjvVar = this.f18122co;
        if (wjvVar != null && wjvVar.vgs()) {
            super.ri(kaVar, bgrVar);
            return;
        }
        if (kaVar instanceof ay) {
            ay ayVar = (ay) kaVar;
            if (ayVar.slm() != null) {
                ayVar.slm().ri((vr) this);
            }
        }
        if (bgrVar != null && bgrVar.lr()) {
            ri(bgrVar);
            this.ka = kaVar.ik();
            if ((this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) && dw.ik(this.f18122co)) {
                ik(bgrVar);
            }
            if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di) {
                this.fi.ihz.fi(true);
            }
        }
        super.ri(kaVar, bgrVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void lr(int i) {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.lr(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ik() {
        vr vrVar = this.lr;
        if (vrVar != null) {
            return vrVar.ik();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public com.bytedance.sdk.openadsdk.ay.lr.fi.ri ik(int i) {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri riVarIk = super.ik(i);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.fi;
        if (riVar.xe && (mjVar = riVar.ajz) != null) {
            riVarIk.lr = mjVar.sf;
        }
        return riVarIk;
    }

    public void ri(final bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ik.3
            @Override // java.lang.Runnable
            public void run() {
                ik.this.ka(bgrVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(String str, JSONObject jSONObject) {
        super.ri(str, jSONObject);
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.ri(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(boolean z, String str) {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.ri(z, str);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public boolean ri(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        vr vrVar = this.lr;
        if (vrVar != null) {
            return vrVar.ri(jSONObject);
        }
        return super.ri(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ka() {
        vr vrVar = this.lr;
        if (vrVar != null) {
            return vrVar.ka();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri() {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i) {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.ri(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i, bgr bgrVar) {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.ri(i, bgrVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.component.adexpress.lr.mj
    public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
        if (i != -1 && ikVar != null && i == 3) {
            di();
        } else {
            super.ri(view, i, ikVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i, String str) {
        vr vrVar = this.lr;
        if (vrVar != null) {
            vrVar.ri(i, str);
        }
    }

    public void ri(long j, long j2) {
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) {
            ((com.bytedance.sdk.openadsdk.core.co.di.ka) kaVar).ri(j, j2);
        }
    }
}
