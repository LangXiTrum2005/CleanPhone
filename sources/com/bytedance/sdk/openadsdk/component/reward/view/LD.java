package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.OY.STP;
import com.bytedance.sdk.openadsdk.core.OY.VVE;
import com.bytedance.sdk.openadsdk.core.OY.eK;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.core.model.DY;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends tD {
    public static float Lxb = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb JXs;
    STP LD;
    public int ZU;
    private float lc;
    VVE lk;

    public LD(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb, AdSlot adSlot, String str) {
        super(lxb.Pw, lxb.LD, adSlot, str, lxb.Of, !lxb.nTb);
        this.ZU = 1;
        this.lc = -1.0f;
        this.JXs = lxb;
    }

    private void ebl() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.LD.lk() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.LD.1
            @Override // com.bytedance.sdk.component.adexpress.LD.lk
            public boolean Lxb(ViewGroup viewGroup, int i) {
                try {
                    ((tD) viewGroup).sLN();
                    LD.this.lk = new VVE(viewGroup.getContext());
                    LD ld = LD.this;
                    ld.lk.Lxb(((tD) ld).JVA, (tD) viewGroup, LD.this.JXs.rW);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(com.bytedance.sdk.component.adexpress.LD.STP stp) {
        if (stp == null) {
            return;
        }
        double dLc = stp.lc();
        double dEbl = stp.ebl();
        double dOY = stp.OY();
        double dQAg = stp.QAg();
        int iLk = le.lk(this.OY, (float) dLc);
        int iLk2 = le.lk(this.OY, (float) dEbl);
        int iLk3 = le.lk(this.OY, (float) dOY);
        int iLk4 = le.lk(this.OY, (float) dQAg);
        if ((dQAg != 0.0d && dOY != 0.0d) || this.KPU.lk() == 7 || this.KPU.lk() == 10) {
            if ((this.KPU.lk() == 7 || this.KPU.lk() == 10) && (stp instanceof com.bytedance.sdk.openadsdk.core.JVA.ZU.LD)) {
                FrameLayout frameLayoutVVE = ((com.bytedance.sdk.openadsdk.core.JVA.ZU.LD) stp).VVE();
                if (frameLayoutVVE != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutVVE.addView(this.sLN, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.sLN.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iLk3, iLk4);
            }
            layoutParams2.width = iLk3;
            layoutParams2.height = iLk4;
            layoutParams2.topMargin = iLk2;
            layoutParams2.leftMargin = iLk;
            layoutParams2.setMarginStart(iLk);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.sLN.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void JXs() {
        STP stp = this.LD;
        if (stp != null) {
            stp.JXs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public int ZU() {
        STP stp = this.LD;
        if (stp != null) {
            return stp.ZU();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kqm kqmVar;
        nBu nbu = this.JXs.BcA;
        if (nbu != null && (kqmVar = nbu.IeN) != null && kqmVar.QAg()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.lc = motionEvent.getY();
            } else if (action == 1) {
            }
            if (le.Lxb(this.lc, motionEvent.getY(), this.OY)) {
                kqmVar.Lxb(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getBackupContainerBackgroundView() {
        if (NXR()) {
            return this.lk.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return NXR() ? this.lk.getVideoContainer() : this.sLN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public void lc() {
        this.STP = true;
        this.sLN = new FrameLayout(this.OY);
        if (!com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.JVA) && !com.bytedance.sdk.openadsdk.core.JVA.lk.LD(this.JVA)) {
            addView(this.sLN, new FrameLayout.LayoutParams(-1, -1));
        }
        super.lc();
        com.bytedance.sdk.component.QAg.ZU webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        ebl();
    }

    public void setExpressVideoListenerProxy(STP stp) {
        this.LD = stp;
    }

    public void LD(final com.bytedance.sdk.component.adexpress.LD.STP stp) {
        if (stp == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.LD.2
            @Override // java.lang.Runnable
            public void run() {
                LD.this.lk(stp);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void LD() {
        STP stp = this.LD;
        if (stp != null) {
            stp.LD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.component.adexpress.LD.IeN
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu, com.bytedance.sdk.component.adexpress.LD.STP stp) {
        this.KPU = zu;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
        if (tDVar != null && tDVar.JP()) {
            super.Lxb(zu, stp);
            return;
        }
        if (zu instanceof eK) {
            eK eKVar = (eK) zu;
            if (eKVar.VVE() != null) {
                eKVar.VVE().Lxb((STP) this);
            }
        }
        if (stp != null && stp.lk()) {
            LD(stp);
            this.ZU = zu.lk();
        }
        super.Lxb(zu, stp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void LD(int i) {
        STP stp = this.LD;
        if (stp != null) {
            stp.LD(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public boolean Lxb(com.bytedance.sdk.component.adexpress.LD.STP stp) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
        if ((tDVar instanceof DY) && ((DY) tDVar).JW() && stp.lk() && stp.LD() == 1) {
            return false;
        }
        return super.Lxb(stp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(String str, JSONObject jSONObject) {
        super.Lxb(str, jSONObject);
        STP stp = this.LD;
        if (stp != null) {
            stp.Lxb(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(boolean z) {
        STP stp = this.LD;
        if (stp != null) {
            stp.Lxb(z);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb() {
        STP stp = this.LD;
        if (stp != null) {
            stp.Lxb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(int i) {
        STP stp = this.LD;
        if (stp != null) {
            stp.Lxb(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(int i, com.bytedance.sdk.component.adexpress.LD.STP stp) {
        STP stp2 = this.LD;
        if (stp2 != null) {
            stp2.Lxb(i, stp);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public long lk() {
        STP stp = this.LD;
        if (stp != null) {
            return stp.lk();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.component.adexpress.LD.OY
    public void Lxb(View view, int i, com.bytedance.sdk.component.adexpress.lk lkVar) {
        if (i != -1 && lkVar != null && i == 3) {
            JXs();
        } else {
            super.Lxb(view, i, lkVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD
    public com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb lk(int i) {
        com.bytedance.sdk.openadsdk.activity.lc lcVar;
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb lxbLk = super.lk(i);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.JXs;
        if (lxb.nTb && (lcVar = lxb.FGm) != null) {
            lxbLk.LD = lcVar.QAg;
        }
        return lxbLk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(int i, String str) {
        STP stp = this.LD;
        if (stp != null) {
            stp.Lxb(i, str);
        }
    }
}
