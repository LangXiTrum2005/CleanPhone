package com.bytedance.adsdk.LD.ebl;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.LD.ebl;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: loaded from: classes.dex */
public class Lxb<T> {
    private float IeN;
    private float JVA;
    public final Interpolator JXs;
    public T LD;
    public final T Lxb;
    private int NXR;
    public PointF OY;
    public PointF QAg;
    private int STP;
    private float VVE;
    public final Interpolator ZU;
    public Float ebl;
    public final float lc;
    public final Interpolator lk;
    private final ebl nBu;
    private float sLN;

    public Lxb(ebl eblVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.JVA = -3987645.8f;
        this.sLN = -3987645.8f;
        this.NXR = 784923401;
        this.STP = 784923401;
        this.IeN = Float.MIN_VALUE;
        this.VVE = Float.MIN_VALUE;
        this.OY = null;
        this.QAg = null;
        this.nBu = eblVar;
        this.Lxb = t;
        this.LD = t2;
        this.lk = interpolator;
        this.ZU = null;
        this.JXs = null;
        this.lc = f;
        this.ebl = f2;
    }

    public boolean JXs() {
        return this.lk == null && this.ZU == null && this.JXs == null;
    }

    public Lxb<T> Lxb(T t, T t2) {
        return new Lxb<>(t, t2);
    }

    public int OY() {
        if (this.NXR == 784923401) {
            this.NXR = ((Integer) this.Lxb).intValue();
        }
        return this.NXR;
    }

    public int QAg() {
        if (this.STP == 784923401) {
            this.STP = ((Integer) this.LD).intValue();
        }
        return this.STP;
    }

    public float ZU() {
        if (this.nBu == null) {
            return 1.0f;
        }
        if (this.VVE == Float.MIN_VALUE) {
            if (this.ebl == null) {
                this.VVE = 1.0f;
            } else {
                this.VVE = ((this.ebl.floatValue() - this.lc) / this.nBu.kqm()) + lk();
            }
        }
        return this.VVE;
    }

    public float ebl() {
        if (this.sLN == -3987645.8f) {
            this.sLN = ((Float) this.LD).floatValue();
        }
        return this.sLN;
    }

    public float lc() {
        if (this.JVA == -3987645.8f) {
            this.JVA = ((Float) this.Lxb).floatValue();
        }
        return this.JVA;
    }

    public float lk() {
        ebl eblVar = this.nBu;
        if (eblVar == null) {
            return 0.0f;
        }
        if (this.IeN == Float.MIN_VALUE) {
            this.IeN = (this.lc - eblVar.lc()) / this.nBu.kqm();
        }
        return this.IeN;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.Lxb + ", endValue=" + this.LD + ", startFrame=" + this.lc + ", endFrame=" + this.ebl + ", interpolator=" + this.lk + '}';
    }

    public boolean Lxb(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        return f >= lk() && f < ZU();
    }

    public Lxb(ebl eblVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.JVA = -3987645.8f;
        this.sLN = -3987645.8f;
        this.NXR = 784923401;
        this.STP = 784923401;
        this.IeN = Float.MIN_VALUE;
        this.VVE = Float.MIN_VALUE;
        this.OY = null;
        this.QAg = null;
        this.nBu = eblVar;
        this.Lxb = t;
        this.LD = t2;
        this.lk = null;
        this.ZU = interpolator;
        this.JXs = interpolator2;
        this.lc = f;
        this.ebl = f2;
    }

    public Lxb(ebl eblVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.JVA = -3987645.8f;
        this.sLN = -3987645.8f;
        this.NXR = 784923401;
        this.STP = 784923401;
        this.IeN = Float.MIN_VALUE;
        this.VVE = Float.MIN_VALUE;
        this.OY = null;
        this.QAg = null;
        this.nBu = eblVar;
        this.Lxb = t;
        this.LD = t2;
        this.lk = interpolator;
        this.ZU = interpolator2;
        this.JXs = interpolator3;
        this.lc = f;
        this.ebl = f2;
    }

    public Lxb(T t) {
        this.JVA = -3987645.8f;
        this.sLN = -3987645.8f;
        this.NXR = 784923401;
        this.STP = 784923401;
        this.IeN = Float.MIN_VALUE;
        this.VVE = Float.MIN_VALUE;
        this.OY = null;
        this.QAg = null;
        this.nBu = null;
        this.Lxb = t;
        this.LD = t;
        this.lk = null;
        this.ZU = null;
        this.JXs = null;
        this.lc = Float.MIN_VALUE;
        this.ebl = Float.valueOf(Float.MAX_VALUE);
    }

    private Lxb(T t, T t2) {
        this.JVA = -3987645.8f;
        this.sLN = -3987645.8f;
        this.NXR = 784923401;
        this.STP = 784923401;
        this.IeN = Float.MIN_VALUE;
        this.VVE = Float.MIN_VALUE;
        this.OY = null;
        this.QAg = null;
        this.nBu = null;
        this.Lxb = t;
        this.LD = t2;
        this.lk = null;
        this.ZU = null;
        this.JXs = null;
        this.lc = Float.MIN_VALUE;
        this.ebl = Float.valueOf(Float.MAX_VALUE);
    }
}
