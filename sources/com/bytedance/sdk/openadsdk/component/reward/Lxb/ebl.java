package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.os.Handler;
import android.os.Message;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends nBu implements Handler.Callback {
    int JXs;
    long LD;
    boolean Lxb;
    int ZU;
    boolean lc;
    int lk;
    private final Handler tD;

    public ebl(Lxb lxb) {
        super(lxb);
        this.tD = new Handler(this);
        this.Lxb = false;
        this.LD = 0L;
        this.lk = 0;
        this.ZU = 0;
        this.JXs = 0;
        this.lc = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sLN() {
        boolean z = (1.0f - (((float) this.lk) / ((float) this.ZU))) * 100.0f >= ((float) com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(String.valueOf(this.JVA.lc)).lc);
        int iLxb = com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(this.JVA.lc));
        if (iLxb == 0) {
            com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.kqm;
            boolean zLc = lxb != null ? lxb.lc() : false;
            if (this.STP) {
                zLc = true;
            }
            if (!z || !zLc) {
                return;
            }
        } else if (iLxb != 1 || !z) {
            return;
        }
        this.JVA.dR.Lxb(true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void JXs() {
        if (this.NXR) {
            super.JXs();
            if (eK.lk(this.JVA.LD)) {
                this.JVA.JJ.removeMessages(600);
            }
            this.tD.removeMessages(TypedValues.Custom.TYPE_INT);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public com.bytedance.sdk.openadsdk.sLN.JXs LD() {
        return new com.bytedance.sdk.openadsdk.sLN.JXs() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.ebl.1
            @Override // com.bytedance.sdk.openadsdk.sLN.JXs
            public void Lxb() {
                ebl.this.sLN();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void OY() {
        if (this.NXR) {
            this.tD.removeMessages(TypedValues.Custom.TYPE_INT);
            this.tD.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public boolean QAg() {
        return this.lc;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void ZU() {
        com.bytedance.sdk.openadsdk.core.widget.LD ld;
        if (this.NXR) {
            super.ZU();
            if (DeviceUtils.ebl() == 0) {
                this.JVA.Of = true;
            }
            Lxb lxb = this.JVA;
            if (lxb.Of) {
                lxb.nJ.LD(true);
                lk(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.LD.LD ld2 = this.JVA.bG;
            if ((ld2 == null || (ld = ld2.NXR) == null || !ld.isShowing()) && ebl() > 0) {
                Lxb(0L);
            }
        }
    }

    public int ebl() {
        return this.lk;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 900 && this.ebl && eK.lk(this.JVA.LD) && !this.brP.get()) {
            int i = message.arg1;
            if (i > 0) {
                this.JVA.nJ.ZU(true);
                int i2 = this.JXs - (this.ZU - i);
                if (i2 == i) {
                    this.JVA.nJ.Lxb(String.valueOf(i), null);
                } else if (i2 > 0) {
                    this.JVA.nJ.Lxb(String.valueOf(i), String.format(com.bytedance.sdk.component.utils.tD.Lxb(this.JVA.Pw.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(i2)));
                } else {
                    this.lc = true;
                    if (eK.nBu(this.JVA.LD)) {
                        this.JVA.nJ.lk();
                        this.JVA.nJ.JXs(true);
                    } else {
                        this.JVA.tD.set(true);
                        this.JVA.bG.IeN();
                    }
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = TypedValues.Custom.TYPE_INT;
                int i3 = i - 1;
                messageObtain.arg1 = i3;
                this.tD.sendMessageDelayed(messageObtain, 1000L);
                this.lk = i3;
            } else {
                this.lc = true;
                if (!eK.nBu(this.QAg) || (eK.eK(this.QAg) && this.kqm.JXs())) {
                    this.JVA.nJ.ZU(false);
                    this.JVA.tD.set(true);
                    this.JVA.bG.IeN();
                } else {
                    this.JVA.nJ.lk();
                    this.JVA.nJ.JXs(true);
                }
                com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.kqm;
                if (lxb == null || lxb.JXs()) {
                    this.STP = true;
                }
            }
            sLN();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void lc() {
        if (this.NXR && !this.IeN) {
            super.lc();
            this.tD.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void lk() {
        if (this.NXR) {
            this.ebl = true;
            this.kqm.Lxb();
            if (eK.nBu(this.QAg)) {
                this.JVA.hg.lc();
            }
            this.ZU = this.QAg.Rt();
            this.JXs = com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(this.JVA.lc), this.QAg.cR());
            this.LD = System.currentTimeMillis();
            Handler handler = this.tD;
            handler.sendMessage(handler.obtainMessage(TypedValues.Custom.TYPE_INT, this.ZU, 0));
            this.JVA.dR.JVA();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void LD(int i) {
        this.lk = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void Lxb() {
        if (this.NXR && !this.sLN) {
            super.Lxb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void Lxb(boolean z) {
        if (this.VVE != null) {
            try {
                com.bytedance.sdk.openadsdk.tD.Lxb.LD ldLxb = com.bytedance.sdk.openadsdk.tD.Lxb.ZU.Lxb().Lxb(this.QAg, this.VVE, LD());
                this.kqm = ldLxb;
                ldLxb.Lxb(this.JVA.dR);
            } catch (Throwable unused) {
                com.bytedance.sdk.component.utils.sLN.Lxb("RVIVPlayableNewManager", "PreRender injection exception");
            }
            if (this.kqm == null) {
                super.Lxb(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.nBu
    public void Lxb(long j) {
        if (this.NXR && this.ebl) {
            Message messageObtain = Message.obtain();
            messageObtain.what = TypedValues.Custom.TYPE_INT;
            messageObtain.arg1 = ebl();
            this.tD.sendMessageDelayed(messageObtain, j);
        }
    }
}
