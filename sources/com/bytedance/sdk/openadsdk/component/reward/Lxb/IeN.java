package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.utils.le;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class IeN {
    private final Lxb LD;
    final com.bytedance.sdk.openadsdk.core.model.tD Lxb;
    private com.bytedance.adsdk.ugeno.LD.lk NXR;
    private volatile long OY;
    private String QAg;
    private com.bytedance.adsdk.ugeno.LD.lk STP;
    private volatile long ebl;
    private boolean kqm;
    private volatile long lc;
    private FrameLayout lk;
    private final AtomicBoolean ZU = new AtomicBoolean(false);
    private final AtomicBoolean JXs = new AtomicBoolean(false);
    private final AtomicBoolean nBu = new AtomicBoolean(false);
    private long JVA = 0;
    private long sLN = 0;
    private String IeN = null;
    private boolean VVE = false;

    public IeN(Lxb lxb) {
        this.LD = lxb;
        this.Lxb = lxb.LD;
        this.QAg = lxb.JXs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void STP() {
        com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxbNrJ;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb;
        if (tDVar == null || (lxbNrJ = tDVar.nrJ()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.JVA.lk.LD ld = new com.bytedance.sdk.openadsdk.core.JVA.lk.LD(this.LD.Pw, this.Lxb, lxbNrJ, this.QAg, new com.bytedance.sdk.openadsdk.core.JVA.JXs.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.IeN.3
            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
            public void LD(String str) {
                IeN ieN = IeN.this;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ieN.Lxb, true, ieN.QAg, "success", SystemClock.elapsedRealtime() - IeN.this.sLN, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.LD
            public void Lxb() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
            public void Lxb(String str) {
                IeN.this.sLN = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
            public void Lxb(int i, String str, String str2) {
                IeN.this.JXs.set(false);
                IeN ieN = IeN.this;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ieN.Lxb, true, ieN.QAg, "fail", SystemClock.elapsedRealtime() - IeN.this.sLN, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.LD
            public void Lxb(int i, String str) {
                IeN.this.JXs.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.LD
            public void Lxb(com.bytedance.adsdk.ugeno.LD.lk<View> lkVar) {
                IeN.this.STP = lkVar;
                IeN.this.JXs.set(true);
            }
        });
        ld.Lxb(new com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.IeN.4
            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb
            public void LD() {
                IeN.this.VVE = true;
                IeN.this.LD.BcA.nBu().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb
            public String Lxb() {
                return "overlay";
            }
        });
        ld.Lxb();
        ld.Lxb(this.LD.BcA.nBu());
    }

    public void JVA() {
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(SystemClock.elapsedRealtime() - this.OY, this.Lxb, this.QAg);
    }

    public boolean NXR() {
        return this.JXs.get();
    }

    public void nBu() {
        com.bytedance.sdk.openadsdk.ZU.lk.lk(this.Lxb, this.QAg);
    }

    public boolean sLN() {
        return this.ZU.get();
    }

    public void JXs() {
        this.lc = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.Lxb, this.QAg);
    }

    public void OY() {
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.STP;
        if (lkVar != null) {
            this.lk.addView(lkVar.QAg(), new FrameLayout.LayoutParams(this.STP.hg(), this.STP.CG()));
        }
    }

    public void QAg() {
        if (this.OY <= 0 || this.ebl <= 0 || this.nBu.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.ebl - this.OY, this.Lxb, this.QAg, this.IeN);
    }

    public boolean ZU() {
        return this.VVE;
    }

    public void ebl() {
        nBu();
        QAg();
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.NXR;
        if (lkVar != null) {
            this.lk.addView(lkVar.QAg(), new FrameLayout.LayoutParams(this.NXR.hg(), this.NXR.CG()));
        }
    }

    public void lc() {
        this.OY = SystemClock.elapsedRealtime();
    }

    public void lk() {
        com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxbYw;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb;
        if (tDVar == null || (lxbYw = tDVar.Yw()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.JVA.lk.LD ld = new com.bytedance.sdk.openadsdk.core.JVA.lk.LD(this.LD.Pw, this.Lxb, lxbYw, this.QAg, new com.bytedance.sdk.openadsdk.core.JVA.JXs.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.IeN.1
            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
            public void LD(String str) {
                IeN.this.IeN = str;
                IeN ieN = IeN.this;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ieN.Lxb, false, ieN.QAg, "success", SystemClock.elapsedRealtime() - IeN.this.JVA, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
            public void Lxb(String str) {
                IeN.this.JVA = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.lk
            public void Lxb(int i, String str, String str2) {
                IeN.this.IeN = str2;
                IeN.this.ZU.set(false);
                IeN ieN = IeN.this;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ieN.Lxb, false, ieN.QAg, "fail", SystemClock.elapsedRealtime() - IeN.this.JVA, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.LD
            public void Lxb() {
                IeN.this.JXs();
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.LD
            public void Lxb(int i, String str) {
                IeN.this.ZU.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IeN ieN = IeN.this;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ieN.Lxb, ieN.QAg, jElapsedRealtime - IeN.this.lc, i, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.LD
            public void Lxb(com.bytedance.adsdk.ugeno.LD.lk<View> lkVar) {
                IeN.this.NXR = lkVar;
                IeN.this.ZU.set(true);
                IeN.this.ebl = SystemClock.elapsedRealtime();
                if (IeN.this.LD.hg.id()) {
                    View viewNBu = IeN.this.LD.BcA.nBu();
                    if (viewNBu instanceof com.bytedance.sdk.openadsdk.core.JXs.ZU) {
                        ((com.bytedance.sdk.openadsdk.core.JXs.ZU) viewNBu).setImageResource(com.bytedance.sdk.component.utils.tD.ZU(IeN.this.LD.NDz, "tt_skip_btn"));
                    }
                }
                IeN.this.STP();
                IeN.this.QAg();
                IeN ieN = IeN.this;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ieN.Lxb, ieN.QAg, IeN.this.ebl - IeN.this.lc);
            }
        });
        if (this.Lxb.nrJ() != null) {
            ld.Lxb(new com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.IeN.2
                @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb
                public void LD() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb
                public String Lxb() {
                    return "normal";
                }
            });
        }
        ld.Lxb();
        ld.Lxb(this.LD.BcA.nBu());
    }

    public void LD() {
        this.lk = (FrameLayout) this.LD.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.IeN);
    }

    public void Lxb() {
        if (this.kqm) {
            return;
        }
        this.kqm = true;
        LD();
    }

    public void Lxb(int i) {
        le.Lxb((View) this.lk, i);
    }
}
