package com.bytedance.adsdk.ud.mo;

import android.view.Choreographer;
import com.bytedance.adsdk.ud.wd;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends qdl implements Choreographer.FrameCallback {
    private wd to;
    private float ud = 1.0f;
    private boolean lnr = false;
    private long mml = 0;
    private float mzz = 0.0f;
    private float mo = 0.0f;
    private int wd = 0;
    private float jpc = -2.1474836E9f;
    private float tvp = 2.1474836E9f;
    protected boolean qdl = false;
    private boolean rq = false;

    private boolean aaj() {
        return to() < 0.0f;
    }

    private float exc() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / wdVar.fs()) / Math.abs(this.ud);
    }

    private void jyq() {
        if (this.to == null) {
            return;
        }
        float f = this.mo;
        if (f < this.jpc || f > this.tvp) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.jpc), Float.valueOf(this.tvp), Float.valueOf(this.mo)));
        }
    }

    public float bjy() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        float f = this.jpc;
        return f == -2.1474836E9f ? wdVar.mo() : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        ud();
        jl();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        yt();
        if (this.to == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.ud.mzz.qdl("LottieValueAnimator#doFrame");
        long j2 = this.mml;
        float fExc = (j2 != 0 ? j - j2 : 0L) / exc();
        float f = this.mzz;
        if (aaj()) {
            fExc = -fExc;
        }
        float f2 = f + fExc;
        boolean zLnr = mzz.lnr(f2, bjy(), jtx());
        float f3 = this.mzz;
        float fUd = mzz.ud(f2, bjy(), jtx());
        this.mzz = fUd;
        if (this.rq) {
            fUd = (float) Math.floor(fUd);
        }
        this.mo = fUd;
        this.mml = j;
        if (!this.rq || this.mzz != f3) {
            lnr();
        }
        if (!zLnr) {
            if (getRepeatCount() == -1 || this.wd < getRepeatCount()) {
                qdl();
                this.wd++;
                if (getRepeatMode() == 2) {
                    this.lnr = !this.lnr;
                    tvp();
                } else {
                    float fJtx = aaj() ? jtx() : bjy();
                    this.mzz = fJtx;
                    this.mo = fJtx;
                }
                this.mml = j;
            } else {
                float fBjy = this.ud < 0.0f ? bjy() : jtx();
                this.mzz = fBjy;
                this.mo = fBjy;
                jl();
                ud(aaj());
            }
        }
        jyq();
        com.bytedance.adsdk.ud.mzz.ud("LottieValueAnimator#doFrame");
    }

    public void exu() {
        jl();
        mml();
    }

    public void fs() {
        jl();
        ud(aaj());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fBjy;
        float fJtx;
        float fBjy2;
        if (this.to == null) {
            return 0.0f;
        }
        if (aaj()) {
            fBjy = jtx() - this.mo;
            fJtx = jtx();
            fBjy2 = bjy();
        } else {
            fBjy = this.mo - bjy();
            fJtx = jtx();
            fBjy2 = bjy();
        }
        return fBjy / (fJtx - fBjy2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(mo());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0L;
        }
        return (long) wdVar.mzz();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.qdl;
    }

    public void jl() {
        mml(true);
    }

    public void jpc() {
        this.to = null;
        this.jpc = -2.1474836E9f;
        this.tvp = 2.1474836E9f;
    }

    public float jtx() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        float f = this.tvp;
        return f == 2.1474836E9f ? wdVar.wd() : f;
    }

    public void lnr(boolean z2) {
        this.rq = z2;
    }

    public void mml(boolean z2) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z2) {
            this.qdl = false;
        }
    }

    public float mo() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        return (this.mo - wdVar.mo()) / (this.to.wd() - this.to.mo());
    }

    public void qdl(wd wdVar) {
        boolean z2 = this.to == null;
        this.to = wdVar;
        if (z2) {
            qdl(Math.max(this.jpc, wdVar.mo()), Math.min(this.tvp, wdVar.wd()));
        } else {
            qdl((int) wdVar.mo(), (int) wdVar.wd());
        }
        float f = this.mo;
        this.mo = 0.0f;
        this.mzz = 0.0f;
        qdl((int) f);
        lnr();
    }

    public void rdp() {
        this.qdl = true;
        yt();
        this.mml = 0L;
        if (aaj() && wd() == bjy()) {
            qdl(jtx());
        } else if (!aaj() && wd() == jtx()) {
            qdl(bjy());
        }
        mzz();
    }

    public void rq() {
        this.qdl = true;
        qdl(aaj());
        qdl((int) (aaj() ? jtx() : bjy()));
        this.mml = 0L;
        this.wd = 0;
        yt();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.lnr) {
            return;
        }
        this.lnr = false;
        tvp();
    }

    public float to() {
        return this.ud;
    }

    public void tvp() {
        lnr(-to());
    }

    public void ud(float f) {
        qdl(this.jpc, f);
    }

    public float wd() {
        return this.mo;
    }

    public void yt() {
        if (isRunning()) {
            mml(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void lnr(float f) {
        this.ud = f;
    }

    @Override // com.bytedance.adsdk.ud.mo.qdl
    public void ud() {
        super.ud();
        ud(aaj());
    }

    public void qdl(float f) {
        if (this.mzz == f) {
            return;
        }
        float fUd = mzz.ud(f, bjy(), jtx());
        this.mzz = fUd;
        if (this.rq) {
            fUd = (float) Math.floor(fUd);
        }
        this.mo = fUd;
        this.mml = 0L;
        lnr();
    }

    public void qdl(int i2) {
        qdl(i2, (int) this.tvp);
    }

    public void qdl(float f, float f2) {
        if (f <= f2) {
            wd wdVar = this.to;
            float fMo = wdVar == null ? -3.4028235E38f : wdVar.mo();
            wd wdVar2 = this.to;
            float fWd = wdVar2 == null ? Float.MAX_VALUE : wdVar2.wd();
            float fUd = mzz.ud(f, fMo, fWd);
            float fUd2 = mzz.ud(f2, fMo, fWd);
            if (fUd == this.jpc && fUd2 == this.tvp) {
                return;
            }
            this.jpc = fUd;
            this.tvp = fUd2;
            qdl((int) mzz.ud(this.mo, fUd, fUd2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
    }
}
