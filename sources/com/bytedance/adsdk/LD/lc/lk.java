package com.bytedance.adsdk.LD.lc;

import android.view.Choreographer;
import com.bytedance.adsdk.LD.ebl;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: loaded from: classes.dex */
public class lk extends Lxb implements Choreographer.FrameCallback {
    private ebl nBu;
    private float LD = 1.0f;
    private boolean lk = false;
    private long ZU = 0;
    private float JXs = 0.0f;
    private float lc = 0.0f;
    private int ebl = 0;
    private float OY = -2.1474836E9f;
    private float QAg = 2.1474836E9f;
    protected boolean Lxb = false;
    private boolean JVA = false;

    private boolean DY() {
        return nBu() < 0.0f;
    }

    private void Sfi() {
        if (this.nBu == null) {
            return;
        }
        float f = this.lc;
        if (f < this.OY || f > this.QAg) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.OY), Float.valueOf(this.QAg), Float.valueOf(this.lc)));
        }
    }

    private float tD() {
        ebl eblVar = this.nBu;
        if (eblVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / eblVar.sLN()) / Math.abs(this.LD);
    }

    public float IeN() {
        ebl eblVar = this.nBu;
        if (eblVar == null) {
            return 0.0f;
        }
        float f = this.OY;
        return f == -2.1474836E9f ? eblVar.lc() : f;
    }

    @MainThread
    public void JVA() {
        this.Lxb = true;
        Lxb(DY());
        Lxb((int) (DY() ? VVE() : IeN()));
        this.ZU = 0L;
        this.ebl = 0;
        kqm();
    }

    public void LD(float f) {
        Lxb(this.OY, f);
    }

    public void Lxb(ebl eblVar) {
        boolean z = this.nBu == null;
        this.nBu = eblVar;
        if (z) {
            Lxb(Math.max(this.OY, eblVar.lc()), Math.min(this.QAg, eblVar.ebl()));
        } else {
            Lxb((int) eblVar.lc(), (int) eblVar.ebl());
        }
        float f = this.lc;
        this.lc = 0.0f;
        this.JXs = 0.0f;
        Lxb((int) f);
        lk();
    }

    @MainThread
    public void NXR() {
        brP();
        ZU();
    }

    public void OY() {
        this.nBu = null;
        this.OY = -2.1474836E9f;
        this.QAg = 2.1474836E9f;
    }

    public void QAg() {
        lk(-nBu());
    }

    @MainThread
    public void STP() {
        this.Lxb = true;
        kqm();
        this.ZU = 0L;
        if (DY() && ebl() == IeN()) {
            Lxb(VVE());
        } else if (!DY() && ebl() == VVE()) {
            Lxb(IeN());
        }
        JXs();
    }

    public float VVE() {
        ebl eblVar = this.nBu;
        if (eblVar == null) {
            return 0.0f;
        }
        float f = this.QAg;
        return f == 2.1474836E9f ? eblVar.ebl() : f;
    }

    @MainThread
    public void ZU(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.Lxb = false;
        }
    }

    @MainThread
    public void brP() {
        ZU(true);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        LD();
        brP();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        kqm();
        if (this.nBu == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.LD.JXs.Lxb("LottieValueAnimator#doFrame");
        long j2 = this.ZU;
        float fTD = (j2 != 0 ? j - j2 : 0L) / tD();
        float f = this.JXs;
        if (DY()) {
            fTD = -fTD;
        }
        float f2 = f + fTD;
        boolean z = !JXs.lk(f2, IeN(), VVE());
        float f3 = this.JXs;
        float fLD = JXs.LD(f2, IeN(), VVE());
        this.JXs = fLD;
        if (this.JVA) {
            fLD = (float) Math.floor(fLD);
        }
        this.lc = fLD;
        this.ZU = j;
        if (!this.JVA || this.JXs != f3) {
            lk();
        }
        if (z) {
            if (getRepeatCount() == -1 || this.ebl < getRepeatCount()) {
                Lxb();
                this.ebl++;
                if (getRepeatMode() == 2) {
                    this.lk = !this.lk;
                    QAg();
                } else {
                    float fVVE = DY() ? VVE() : IeN();
                    this.JXs = fVVE;
                    this.lc = fVVE;
                }
                this.ZU = j;
            } else {
                float fIeN = this.LD < 0.0f ? IeN() : VVE();
                this.JXs = fIeN;
                this.lc = fIeN;
                brP();
                LD(DY());
            }
        }
        Sfi();
        com.bytedance.adsdk.LD.JXs.LD("LottieValueAnimator#doFrame");
    }

    public float ebl() {
        return this.lc;
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getAnimatedFraction() {
        float fIeN;
        float fVVE;
        float fIeN2;
        if (this.nBu == null) {
            return 0.0f;
        }
        if (DY()) {
            fIeN = VVE() - this.lc;
            fVVE = VVE();
            fIeN2 = IeN();
        } else {
            fIeN = this.lc - IeN();
            fVVE = VVE();
            fIeN2 = IeN();
        }
        return fIeN / (fVVE - fIeN2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(lc());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        ebl eblVar = this.nBu;
        if (eblVar == null) {
            return 0L;
        }
        return (long) eblVar.JXs();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.Lxb;
    }

    public void kqm() {
        if (isRunning()) {
            ZU(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float lc() {
        ebl eblVar = this.nBu;
        if (eblVar == null) {
            return 0.0f;
        }
        return (this.lc - eblVar.lc()) / (this.nBu.ebl() - this.nBu.lc());
    }

    public void lk(boolean z) {
        this.JVA = z;
    }

    public float nBu() {
        return this.LD;
    }

    @MainThread
    public void sLN() {
        brP();
        LD(DY());
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.lk) {
            return;
        }
        this.lk = false;
        QAg();
    }

    @Override // com.bytedance.adsdk.LD.lc.Lxb
    public void LD() {
        super.LD();
        LD(DY());
    }

    public void lk(float f) {
        this.LD = f;
    }

    public void Lxb(float f) {
        if (this.JXs == f) {
            return;
        }
        float fLD = JXs.LD(f, IeN(), VVE());
        this.JXs = fLD;
        if (this.JVA) {
            fLD = (float) Math.floor(fLD);
        }
        this.lc = fLD;
        this.ZU = 0L;
        lk();
    }

    public void Lxb(int i) {
        Lxb(i, (int) this.QAg);
    }

    public void Lxb(float f, float f2) {
        if (f <= f2) {
            ebl eblVar = this.nBu;
            float fLc = eblVar == null ? -3.4028235E38f : eblVar.lc();
            ebl eblVar2 = this.nBu;
            float fEbl = eblVar2 == null ? Float.MAX_VALUE : eblVar2.ebl();
            float fLD = JXs.LD(f, fLc, fEbl);
            float fLD2 = JXs.LD(f2, fLc, fEbl);
            if (fLD == this.OY && fLD2 == this.QAg) {
                return;
            }
            this.OY = fLD;
            this.QAg = fLD2;
            Lxb((int) JXs.LD(this.lc, fLD, fLD2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
    }
}
