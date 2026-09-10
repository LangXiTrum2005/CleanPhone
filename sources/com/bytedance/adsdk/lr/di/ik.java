package com.bytedance.adsdk.lr.di;

import android.view.Choreographer;
import com.bytedance.adsdk.lr.xha;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ri implements Choreographer.FrameCallback {
    private xha qt;
    private float lr = 1.0f;
    private boolean ik = false;
    private long ka = 0;
    private float fi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float di = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private int xha = 0;
    private float mj = -2.1474836E9f;
    private float jbs = 2.1474836E9f;
    protected boolean ri = false;
    private boolean sf = false;

    private boolean ac() {
        return qt() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void ihz() {
        if (this.qt == null) {
            return;
        }
        float f = this.di;
        if (f < this.mj || f > this.jbs) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.mj), Float.valueOf(this.jbs), Float.valueOf(this.di)));
        }
    }

    private float tan() {
        xha xhaVar = this.qt;
        if (xhaVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / xhaVar.co()) / Math.abs(this.lr);
    }

    public void aw() {
        nr();
        ka();
    }

    public void bgr() {
        this.ri = true;
        bu();
        this.ka = 0L;
        if (ac() && xha() == vr()) {
            ri(slm());
        } else if (!ac() && xha() == slm()) {
            ri(vr());
        }
        fi();
    }

    public void bu() {
        if (isRunning()) {
            ka(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        lr();
        nr();
    }

    public void co() {
        nr();
        lr(ac());
    }

    public float di() {
        xha xhaVar = this.qt;
        return xhaVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.di - xhaVar.di()) / (this.qt.xha() - this.qt.di());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        bu();
        if (this.qt == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.lr.fi.ri("LottieValueAnimator#doFrame");
        long j2 = this.ka;
        float fTan = (j2 != 0 ? j - j2 : 0L) / tan();
        float f = this.fi;
        if (ac()) {
            fTan = -fTan;
        }
        float f2 = f + fTan;
        boolean zIk = fi.ik(f2, vr(), slm());
        float f3 = this.fi;
        float fLr = fi.lr(f2, vr(), slm());
        this.fi = fLr;
        if (this.sf) {
            fLr = (float) Math.floor(fLr);
        }
        this.di = fLr;
        this.ka = j;
        if (!this.sf || this.fi != f3) {
            ik();
        }
        if (!zIk) {
            if (getRepeatCount() == -1 || this.xha < getRepeatCount()) {
                ri();
                this.xha++;
                if (getRepeatMode() == 2) {
                    this.ik = !this.ik;
                    jbs();
                } else {
                    float fSlm = ac() ? slm() : vr();
                    this.fi = fSlm;
                    this.di = fSlm;
                }
                this.ka = j;
            } else {
                float fVr = this.lr < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? vr() : slm();
                this.fi = fVr;
                this.di = fVr;
                nr();
                lr(ac());
            }
        }
        ihz();
        com.bytedance.adsdk.lr.fi.lr("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fVr;
        float fSlm;
        float fVr2;
        if (this.qt == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (ac()) {
            fVr = slm() - this.di;
            fSlm = slm();
            fVr2 = vr();
        } else {
            fVr = this.di - vr();
            fSlm = slm();
            fVr2 = vr();
        }
        return fVr / (fSlm - fVr2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(di());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        xha xhaVar = this.qt;
        if (xhaVar == null) {
            return 0L;
        }
        return (long) xhaVar.fi();
    }

    public void ik(boolean z) {
        this.sf = z;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.ri;
    }

    public void jbs() {
        ik(-qt());
    }

    public void ka(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.ri = false;
        }
    }

    public void lr(float f) {
        ri(this.mj, f);
    }

    public void mj() {
        this.qt = null;
        this.mj = -2.1474836E9f;
        this.jbs = 2.1474836E9f;
    }

    public void nr() {
        ka(true);
    }

    public float qt() {
        return this.lr;
    }

    public void ri(xha xhaVar) {
        boolean z = this.qt == null;
        this.qt = xhaVar;
        if (z) {
            ri(Math.max(this.mj, xhaVar.di()), Math.min(this.jbs, xhaVar.xha()));
        } else {
            ri((int) xhaVar.di(), (int) xhaVar.xha());
        }
        float f = this.di;
        this.di = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ri((int) f);
        ik();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.ik) {
            return;
        }
        this.ik = false;
        jbs();
    }

    public void sf() {
        this.ri = true;
        ri(ac());
        ri((int) (ac() ? slm() : vr()));
        this.ka = 0L;
        this.xha = 0;
        bu();
    }

    public float slm() {
        xha xhaVar = this.qt;
        if (xhaVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.jbs;
        return f == 2.1474836E9f ? xhaVar.xha() : f;
    }

    public float vr() {
        xha xhaVar = this.qt;
        if (xhaVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.mj;
        return f == -2.1474836E9f ? xhaVar.di() : f;
    }

    public float xha() {
        return this.di;
    }

    public void ik(float f) {
        this.lr = f;
    }

    @Override // com.bytedance.adsdk.lr.di.ri
    public void lr() {
        super.lr();
        lr(ac());
    }

    public void ri(float f) {
        if (this.fi == f) {
            return;
        }
        float fLr = fi.lr(f, vr(), slm());
        this.fi = fLr;
        if (this.sf) {
            fLr = (float) Math.floor(fLr);
        }
        this.di = fLr;
        this.ka = 0L;
        ik();
    }

    public void ri(int i) {
        ri(i, (int) this.jbs);
    }

    public void ri(float f, float f2) {
        if (f <= f2) {
            xha xhaVar = this.qt;
            float fDi = xhaVar == null ? -3.4028235E38f : xhaVar.di();
            xha xhaVar2 = this.qt;
            float fXha = xhaVar2 == null ? Float.MAX_VALUE : xhaVar2.xha();
            float fLr = fi.lr(f, fDi, fXha);
            float fLr2 = fi.lr(f2, fDi, fXha);
            if (fLr == this.mj && fLr2 == this.jbs) {
                return;
            }
            this.mj = fLr;
            this.jbs = fLr2;
            ri((int) fi.lr(this.di, fLr, fLr2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }
}
