package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;

/* JADX INFO: loaded from: classes2.dex */
public class brP extends tD implements Ho0, Lo0 {
    private com.bytedance.sdk.openadsdk.Lxb.LD.lk CG;
    private IeN Ivz;
    boolean JXs;
    boolean LD;
    int Lxb;
    int ZU;
    int ebl;
    private long hg;
    boolean lc;
    boolean lk;
    private com.bytedance.sdk.openadsdk.multipro.LD.Lxb nE;
    private long xan;

    public brP(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot, String str) {
        super(context, tDVar, adSlot, str, false, true);
        this.Lxb = 1;
        this.LD = false;
        this.lk = true;
        this.JXs = true;
        this.lc = true;
        this.ebl = -1;
        ebl();
    }

    private void VVE() {
        try {
            this.nE = new com.bytedance.sdk.openadsdk.multipro.LD.Lxb();
            IeN ieN = new IeN(this.OY, this.JVA, this.QAg, this.CSn);
            this.Ivz = ieN;
            ieN.setShouldCheckNetChange(false);
            this.Ivz.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.NXR.LD.lc.LD() { // from class: com.bytedance.sdk.openadsdk.core.OY.brP.1
                @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc.LD
                public void Lxb(boolean z, long j, long j2, long j3, boolean z2) {
                    brP.this.nE.Lxb = z;
                    brP.this.nE.JXs = j;
                    brP.this.nE.lc = j2;
                    brP.this.nE.ebl = j3;
                    brP.this.nE.ZU = z2;
                }
            });
            this.Ivz.setVideoAdLoadListener(this);
            this.Ivz.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.QAg)) {
                this.Ivz.setIsAutoPlay(this.LD ? this.nBu.isAutoPlay() : this.lk);
            } else if ("open_ad".equals(this.QAg)) {
                this.Ivz.setIsAutoPlay(true);
            } else {
                this.Ivz.setIsAutoPlay(this.lk);
            }
            if ("open_ad".equals(this.QAg)) {
                this.Ivz.setIsQuiet(true);
            } else {
                boolean zLk = com.bytedance.sdk.openadsdk.core.kqm.ZU().lk(String.valueOf(this.ZU));
                this.HD = zLk;
                this.Ivz.setIsQuiet(zLk);
            }
            this.Ivz.ZU();
        } catch (Exception unused) {
            this.Ivz = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(@NonNull com.bytedance.sdk.component.adexpress.LD.STP stp) {
        int i;
        double dLc = stp.lc();
        double dEbl = stp.ebl();
        double dOY = stp.OY();
        double dQAg = stp.QAg();
        if ((dOY != 0.0d && dQAg != 0.0d) || (i = this.ebl) == 7 || i == 10) {
            int iLk = le.lk(this.OY, (float) dLc);
            int iLk2 = le.lk(this.OY, (float) dEbl);
            int iLk3 = le.lk(this.OY, (float) dOY);
            int iLk4 = le.lk(this.OY, (float) dQAg);
            float fMin = Math.min(Math.min(le.lk(this.OY, stp.sLN()), le.lk(this.OY, stp.NXR())), Math.min(le.lk(this.OY, stp.STP()), le.lk(this.OY, stp.IeN())));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.sLN.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(iLk3, iLk4);
            }
            layoutParams.width = iLk3;
            layoutParams.height = iLk4;
            layoutParams.topMargin = iLk2;
            layoutParams.leftMargin = iLk;
            layoutParams.setMarginStart(iLk);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            this.sLN.setLayoutParams(layoutParams);
            this.sLN.removeAllViews();
            if (this.Ivz != null) {
                int i2 = this.ebl;
                if ((i2 == 7 || i2 == 10) && (stp instanceof com.bytedance.sdk.openadsdk.core.JVA.ZU.LD)) {
                    FrameLayout frameLayoutVVE = ((com.bytedance.sdk.openadsdk.core.JVA.ZU.LD) stp).VVE();
                    if (frameLayoutVVE != null) {
                        frameLayoutVVE.removeAllViews();
                        frameLayoutVVE.addView(this.Ivz, new FrameLayout.LayoutParams(-1, -1));
                    }
                } else if (stp.Lxb() == null) {
                    this.sLN.addView(this.Ivz);
                } else if (this.lc) {
                    stp.Lxb().setTag(com.bytedance.sdk.component.adexpress.dynamic.Lxb.lc, 1);
                    ((FrameLayout) stp.Lxb()).removeAllViews();
                    ((FrameLayout) stp.Lxb()).addView(this.Ivz, new FrameLayout.LayoutParams(-1, -1));
                    this.lc = false;
                }
                le.LD(this.sLN, fMin);
                this.Ivz.Lxb(0L, true, false);
                ZU(this.ZU);
                if (!com.bytedance.sdk.component.utils.IeN.ZU(this.OY) && !this.lk && this.JXs) {
                    this.Ivz.JXs();
                }
                if (TextUtils.equals("embeded_ad", this.QAg)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    private void setShowAdInteractionView(boolean z) {
        IeN ieN = this.Ivz;
        if (ieN != null) {
            ieN.setShowAdInteractionView(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void JXs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void LD() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb() {
    }

    public void ZU(int i) {
        int iLD = com.bytedance.sdk.openadsdk.core.kqm.ZU().LD(i);
        if (3 == iLD) {
            this.LD = false;
            this.lk = false;
        } else if (4 == iLD) {
            this.LD = true;
        } else {
            int iLk = com.bytedance.sdk.component.utils.IeN.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            if (1 == iLD) {
                this.LD = false;
                this.lk = nJ.ZU(iLk);
            } else if (2 == iLD) {
                if (nJ.JXs(iLk) || nJ.ZU(iLk) || nJ.lc(iLk)) {
                    this.LD = false;
                    this.lk = true;
                }
            } else if (5 == iLD && (nJ.ZU(iLk) || nJ.lc(iLk))) {
                this.LD = false;
                this.lk = true;
            }
        }
        if (this.lk) {
            return;
        }
        this.Lxb = 3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void d_() {
        this.JXs = false;
        this.Lxb = 2;
        com.bytedance.sdk.openadsdk.Lxb.LD.lk lkVar = this.CG;
        if (lkVar != null) {
            lkVar.Lxb(null);
        }
    }

    public void ebl() {
        this.sLN = new FrameLayout(this.OY);
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
        int iTd = tDVar != null ? tDVar.Td() : 0;
        this.ZU = iTd;
        ZU(iTd);
        VVE();
        addView(this.sLN, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void g_() {
        this.JXs = false;
        this.NXR = true;
        this.Lxb = 3;
        com.bytedance.sdk.openadsdk.Lxb.LD.lk lkVar = this.CG;
        if (lkVar != null) {
            lkVar.LD(null);
        }
    }

    public IeN getExpressVideoView() {
        return this.Ivz;
    }

    public com.bytedance.sdk.openadsdk.Lxb.LD.lk getVideoAdListener() {
        return this.CG;
    }

    @Nullable
    public So0 getVideoController() {
        IeN ieN = this.Ivz;
        if (ieN != null) {
            return ieN.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.LD.Lxb getVideoModel() {
        return this.nE;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void h_() {
        this.JXs = false;
        this.NXR = false;
        this.Lxb = 2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void i_() {
        this.JXs = false;
        this.Lxb = 5;
        com.bytedance.sdk.component.adexpress.LD.LD ld = this.foI;
        if (ld != null && ld.LD() != null) {
            this.foI.LD().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.Lxb.LD.lk lkVar = this.CG;
        if (lkVar != null) {
            lkVar.lk(null);
        }
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu instanceof com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) {
            ((com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) zu).onvideoComplate();
        }
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.Lxb.LD.lk lkVar) {
        this.CG = lkVar;
    }

    private void LD(final com.bytedance.sdk.component.adexpress.LD.STP stp) {
        if (stp == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.brP.2
            @Override // java.lang.Runnable
            public void run() {
                brP.this.lk(stp);
            }
        });
    }

    private void LD(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.brP) - j);
        int i = this.brP;
        if (i < 0 || iAbs > 500 || i > j2 || iAbs >= 500 || this.DY.contains(this.tD)) {
            return;
        }
        if (this.brP > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.brP.3
                @Override // java.lang.Runnable
                public void run() {
                    brP.this.Ivz.setCanInterruptVideoPlay(true);
                    brP.this.Ivz.performClick();
                    brP brp = brP.this;
                    brp.LD(brp.brP, brp.tD);
                }
            }, iAbs);
        } else {
            this.Ivz.setCanInterruptVideoPlay(true);
            this.Ivz.performClick();
            LD(this.brP, this.tD);
        }
        this.DY.add(this.tD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.component.adexpress.LD.IeN
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu, com.bytedance.sdk.component.adexpress.LD.STP stp) {
        this.KPU = zu;
        this.ebl = zu.lk();
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu2 = this.KPU;
        if ((zu2 instanceof eK) && ((eK) zu2).VVE() != null) {
            ((eK) this.KPU).VVE().Lxb((STP) this);
        }
        if (stp != null && stp.lk()) {
            LD(stp);
        }
        super.Lxb(zu, stp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(boolean z) {
        IeN ieN = this.Ivz;
        if (ieN != null) {
            ieN.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(int i) {
        IeN ieN = this.Ivz;
        if (ieN == null) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i == 1) {
            ieN.Lxb(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            ieN.setCanInterruptVideoPlay(true);
            this.Ivz.performClick();
        } else if (i == 4) {
            ieN.getNativeVideoController().ZU();
        } else {
            if (i != 5) {
                return;
            }
            ieN.Lxb(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public int ZU() {
        IeN ieN;
        if (this.Lxb == 3 && (ieN = this.Ivz) != null) {
            ieN.ZU();
        }
        IeN ieN2 = this.Ivz;
        if (ieN2 == null || !ieN2.getNativeVideoController().VVE()) {
            return this.Lxb;
        }
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.component.adexpress.LD.OY
    public void Lxb(View view, int i, com.bytedance.sdk.component.adexpress.lk lkVar) {
        if (i == -1 || lkVar == null) {
            return;
        }
        if (i == 11) {
            try {
                IeN ieN = this.Ivz;
                if (ieN != null) {
                    ieN.setCanInterruptVideoPlay(true);
                    this.Ivz.performClick();
                    if (this.NXR) {
                        this.Ivz.findViewById(com.bytedance.sdk.openadsdk.utils.STP.nH).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.Lxb(view, i, lkVar);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void Lxb(long j, long j2) {
        this.JXs = false;
        int i = this.Lxb;
        if (i != 5 && i != 3 && j > this.xan) {
            this.Lxb = 2;
        }
        this.xan = j;
        this.hg = j2;
        com.bytedance.sdk.component.adexpress.LD.LD ld = this.foI;
        if (ld != null && ld.LD() != null) {
            this.foI.LD().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu instanceof com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) {
            ((com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) zu).setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        LD(j, j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0
    public void Lxb(int i, int i2) {
        this.xan = this.hg;
        this.Lxb = 4;
        com.bytedance.sdk.openadsdk.Lxb.LD.lk lkVar = this.CG;
        if (lkVar != null) {
            lkVar.Lxb(i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public void Lxb(int i, String str) {
        this.brP = i;
        this.tD = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.tD, com.bytedance.sdk.openadsdk.core.OY.STP
    public long lk() {
        return this.xan;
    }
}
