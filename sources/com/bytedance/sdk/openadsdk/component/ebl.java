package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.core.OY;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.CSn;
import com.bytedance.sdk.openadsdk.core.model.Sfi;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.core.tD;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ebl implements aH.Lxb {
    private boolean JVA;
    private final tD<com.bytedance.sdk.openadsdk.ZU.Lxb> LD;
    private final Context Lxb;
    private int OY;
    private PAGAppOpenAdLoadListener ebl;
    private AdSlot lc;
    private final lc lk;
    private final AtomicBoolean ZU = new AtomicBoolean(false);
    private int JXs = 0;
    private volatile int QAg = 0;
    private final CSn nBu = new CSn();

    public ebl(Context context) {
        if (context != null) {
            this.Lxb = context.getApplicationContext();
        } else {
            this.Lxb = kqm.Lxb();
        }
        this.LD = kqm.lk();
        this.lk = lc.Lxb(this.Lxb);
    }

    private void LD(@NonNull final AdSlot adSlot) {
        final CG cgLD = CG.LD();
        this.QAg = 1;
        Sfi sfi = new Sfi();
        sfi.nBu = this.nBu;
        sfi.ZU = 1;
        sfi.OY = 2;
        this.LD.Lxb(adSlot, sfi, 3, new tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.ebl.1
            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(int i, String str) {
                ebl.this.QAg = 3;
                ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(final com.bytedance.sdk.openadsdk.core.model.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld) {
                ebl.this.QAg = 2;
                if (lxb == null || lxb.ZU() == null || lxb.ZU().size() == 0) {
                    ebl.this.QAg = 3;
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(2, 100, EnumC4719u30.AD_SERVER_ERROR_VALUE, OY.Lxb(EnumC4719u30.AD_SERVER_ERROR_VALUE)));
                    ld.Lxb(-3);
                    com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld);
                    return;
                }
                final com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.ZU().get(0);
                long jIeN = tDVar.IeN();
                ebl.this.nBu.LD = jIeN;
                boolean zLc = com.bytedance.sdk.openadsdk.core.model.tD.lc(tDVar);
                if (tDVar.kVf()) {
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb));
                    return;
                }
                if (zLc) {
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb));
                    if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar)) {
                        ebl.this.Lxb(tDVar, adSlot, false, lxb);
                        return;
                    } else {
                        ebl.this.Lxb(tDVar, false, lxb);
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar)) {
                    int iSLN = kqm.ZU().sLN();
                    if (iSLN == 1 || iSLN == 3) {
                        ebl.this.nBu.LD = -1L;
                        ebl.this.nBu.Lxb(3);
                        ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb));
                        ebl.this.Lxb(tDVar, adSlot, false, lxb);
                        return;
                    }
                    ebl eblVar = ebl.this;
                    eblVar.Lxb(tDVar, adSlot, !eblVar.nBu.Lxb, lxb);
                } else {
                    if (kqm.ZU().JVA() == 1) {
                        ebl.this.nBu.LD = -1L;
                        ebl.this.nBu.Lxb(3);
                        ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb));
                        ebl.this.Lxb(tDVar, false, lxb);
                        return;
                    }
                    ebl eblVar2 = ebl.this;
                    eblVar2.Lxb(tDVar, !eblVar2.nBu.Lxb, lxb);
                }
                if (ebl.this.nBu.Lxb) {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb(tDVar, cgLD.ZU());
                    if (jIeN == 0) {
                        ebl.this.nBu.Lxb(2);
                        ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb));
                    } else {
                        STP.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ebl.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ebl.this.nBu.Lxb(2);
                                ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb));
                            }
                        }, jIeN);
                    }
                }
            }
        });
    }

    public static ebl Lxb(Context context) {
        return new ebl(context);
    }

    public void Lxb(@NonNull AdSlot adSlot, com.bytedance.sdk.openadsdk.common.lc lcVar, int i) {
        if (lcVar == null) {
            return;
        }
        if (i <= 0) {
            i = 3500;
        }
        this.lc = adSlot;
        this.nBu.Lxb = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (lcVar instanceof PAGAppOpenAdLoadListener) {
            this.ebl = (PAGAppOpenAdLoadListener) lcVar;
        }
        this.JXs = Lxb(this.lc);
        this.OY = i;
        this.nBu.Lxb(CG.LD());
        if (this.nBu.Lxb || VVE.TA().CSn(this.lc.getCodeId()) == 0) {
            LD(this.lc);
        }
        if (this.nBu.Lxb) {
            return;
        }
        new aH(STP.LD().getLooper(), this).sendEmptyMessageDelayed(1, i);
        Lxb();
    }

    private void Lxb() {
        hg.LD(new com.bytedance.sdk.component.OY.OY("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.ebl.2
            @Override // java.lang.Runnable
            public void run() {
                int iSLN;
                com.bytedance.sdk.openadsdk.core.model.tD tDVarJXs = ebl.this.lk.JXs(ebl.this.JXs);
                if (tDVarJXs == null) {
                    ebl.this.Lxb(false);
                    return;
                }
                if (tDVarJXs.hg() == null) {
                    tDVarJXs.Lxb(ebl.this.lc);
                }
                boolean zJXs = com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVarJXs);
                if (tDVarJXs.kVf()) {
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 101, tDVarJXs, (com.bytedance.sdk.openadsdk.core.model.Lxb) null));
                    return;
                }
                if (!zJXs && kqm.ZU().JVA() == 1) {
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 101, tDVarJXs, (com.bytedance.sdk.openadsdk.core.model.Lxb) null));
                    return;
                }
                if (zJXs && ((iSLN = kqm.ZU().sLN()) == 2 || iSLN == 3)) {
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 101, tDVarJXs, (com.bytedance.sdk.openadsdk.core.model.Lxb) null));
                    return;
                }
                if (!ebl.this.lk.LD(ebl.this.JXs) && !ebl.this.lk.ZU(ebl.this.JXs)) {
                    ebl.this.Lxb(true);
                    return;
                }
                if (VVE.TA().CSn(ebl.this.lc.getCodeId()) == 0) {
                    ebl.this.lk.ebl(ebl.this.JXs);
                }
                if (!zJXs) {
                    if (ebl.this.lk.LD(tDVarJXs)) {
                        ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 101, tDVarJXs, (com.bytedance.sdk.openadsdk.core.model.Lxb) null));
                        return;
                    } else {
                        ebl.this.Lxb(false);
                        com.bytedance.sdk.openadsdk.component.ZU.Lxb.LD(tDVarJXs);
                        return;
                    }
                }
                if (!TextUtils.isEmpty(ebl.this.lk.Lxb(tDVarJXs)) || Build.VERSION.SDK_INT < 23) {
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 101, tDVarJXs, (com.bytedance.sdk.openadsdk.core.model.Lxb) null));
                } else {
                    ebl.this.Lxb(false);
                    com.bytedance.sdk.openadsdk.component.ZU.Lxb.LD(tDVarJXs);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(boolean z) {
        if (z) {
            this.lk.ebl(this.JXs);
        }
        if (VVE.TA().CSn(this.lc.getCodeId()) == 1) {
            LD(this.lc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(@NonNull final com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        this.lk.Lxb(tDVar, adSlot, this.nBu, new lc.lk() { // from class: com.bytedance.sdk.openadsdk.component.ebl.3
            @Override // com.bytedance.sdk.openadsdk.component.lc.lk
            public void Lxb() {
                if (z) {
                    ebl.this.QAg = 4;
                    com.bytedance.sdk.openadsdk.component.JXs.LD ld = new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb);
                    ld.Lxb(true);
                    ebl.this.Lxb(ld);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.lc.lk
            public void Lxb(int i, String str) {
                if (z) {
                    ebl.this.QAg = 5;
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(2, 100, 10003, OY.Lxb(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(@NonNull final com.bytedance.sdk.openadsdk.core.model.tD tDVar, final boolean z, final com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        this.lk.Lxb(tDVar, this.nBu, new lc.LD() { // from class: com.bytedance.sdk.openadsdk.component.ebl.4
            @Override // com.bytedance.sdk.openadsdk.component.lc.LD
            public void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld) {
                if (z) {
                    ebl.this.QAg = 4;
                    com.bytedance.sdk.openadsdk.component.JXs.LD ld2 = new com.bytedance.sdk.openadsdk.component.JXs.LD(1, 100, tDVar, lxb);
                    ld2.Lxb(true);
                    ebl.this.Lxb(ld2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.lc.LD
            public void Lxb() {
                if (z) {
                    ebl.this.QAg = 5;
                    ebl.this.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(2, 100, 10003, OY.Lxb(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(com.bytedance.sdk.openadsdk.component.JXs.LD ld) {
        int iLk = ld.lk();
        int iZU = ld.ZU();
        if (this.ZU.get()) {
            if (iLk == 1 && iZU == 100 && ld.LD()) {
                lc.Lxb(kqm.Lxb()).Lxb(new com.bytedance.sdk.openadsdk.component.JXs.Lxb(this.JXs, ld.JXs(), ld.Lxb()));
                if (this.JVA) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(ld.JXs(), 1, this.nBu);
                return;
            }
            return;
        }
        if (iLk != 1) {
            if (iLk == 2 || iLk == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.ebl;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(ld.lc(), ld.ebl());
                }
                this.ZU.set(true);
                if (iLk == 3) {
                    com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(this.QAg, this.OY);
                    return;
                }
                return;
            }
            return;
        }
        if (this.ebl != null) {
            this.ebl.onAdLoaded(new ZU(this.Lxb, ld.JXs(), iZU == 101, this.lc));
        }
        this.ZU.set(true);
        if (iZU == 101) {
            com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(ld.JXs(), this.nBu.Lxb().ZU());
            return;
        }
        if (iZU == 100) {
            com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(ld.JXs(), 0, this.nBu);
            this.JVA = true;
            if (this.nBu.Lxb || com.bytedance.sdk.openadsdk.core.model.tD.lc(ld.JXs())) {
                return;
            }
            if (VVE.TA().CSn(this.lc.getCodeId()) == 0) {
                this.lk.Lxb(this.lc);
            } else {
                this.lk.Lxb(new com.bytedance.sdk.openadsdk.component.JXs.Lxb(this.JXs, ld.JXs(), ld.Lxb()));
            }
        }
    }

    public int Lxb(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        if (message.what != 1 || this.ZU.get()) {
            return;
        }
        Lxb(new com.bytedance.sdk.openadsdk.component.JXs.LD(3, 102, EnumC4719u30.AD_LOAD_TOO_FREQUENTLY_VALUE, OY.Lxb(EnumC4719u30.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
