package com.bytedance.adsdk.ud.wd;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.ud.wd;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class qdl<T> {
    private float bjy;
    private int exu;
    private float fs;
    public PointF jpc;
    private float jtx;
    public final Interpolator lnr;
    public final Interpolator mml;
    public final float mo;
    public final Interpolator mzz;
    public final T qdl;
    private int rdp;
    private float rq;
    private final wd to;
    public PointF tvp;
    public T ud;
    public Float wd;

    public qdl(wd wdVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = wdVar;
        this.qdl = t;
        this.ud = t2;
        this.lnr = interpolator;
        this.mml = null;
        this.mzz = null;
        this.mo = f;
        this.wd = f2;
    }

    public int jpc() {
        if (this.exu == 784923401) {
            this.exu = ((Integer) this.qdl).intValue();
        }
        return this.exu;
    }

    public float lnr() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        if (this.bjy == Float.MIN_VALUE) {
            this.bjy = (this.mo - wdVar.mo()) / this.to.yt();
        }
        return this.bjy;
    }

    public float mml() {
        if (this.to == null) {
            return 1.0f;
        }
        if (this.jtx == Float.MIN_VALUE) {
            if (this.wd == null) {
                this.jtx = 1.0f;
            } else {
                this.jtx = ((this.wd.floatValue() - this.mo) / this.to.yt()) + lnr();
            }
        }
        return this.jtx;
    }

    public float mo() {
        if (this.rq == -3987645.8f) {
            this.rq = ((Float) this.qdl).floatValue();
        }
        return this.rq;
    }

    public boolean mzz() {
        return this.lnr == null && this.mml == null && this.mzz == null;
    }

    public qdl<T> qdl(T t, T t2) {
        return new qdl<>(t, t2);
    }

    public String toString() {
        return "Keyframe{startValue=" + this.qdl + ", endValue=" + this.ud + ", startFrame=" + this.mo + ", endFrame=" + this.wd + ", interpolator=" + this.lnr + AbstractJsonLexerKt.END_OBJ;
    }

    public int tvp() {
        if (this.rdp == 784923401) {
            this.rdp = ((Integer) this.ud).intValue();
        }
        return this.rdp;
    }

    public float wd() {
        if (this.fs == -3987645.8f) {
            this.fs = ((Float) this.ud).floatValue();
        }
        return this.fs;
    }

    public boolean qdl(float f) {
        return f >= lnr() && f < mml();
    }

    public qdl(wd wdVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = wdVar;
        this.qdl = t;
        this.ud = t2;
        this.lnr = null;
        this.mml = interpolator;
        this.mzz = interpolator2;
        this.mo = f;
        this.wd = f2;
    }

    public qdl(wd wdVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = wdVar;
        this.qdl = t;
        this.ud = t2;
        this.lnr = interpolator;
        this.mml = interpolator2;
        this.mzz = interpolator3;
        this.mo = f;
        this.wd = f2;
    }

    public qdl(T t) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = null;
        this.qdl = t;
        this.ud = t;
        this.lnr = null;
        this.mml = null;
        this.mzz = null;
        this.mo = Float.MIN_VALUE;
        this.wd = Float.valueOf(Float.MAX_VALUE);
    }

    private qdl(T t, T t2) {
        this.rq = -3987645.8f;
        this.fs = -3987645.8f;
        this.exu = 784923401;
        this.rdp = 784923401;
        this.bjy = Float.MIN_VALUE;
        this.jtx = Float.MIN_VALUE;
        this.jpc = null;
        this.tvp = null;
        this.to = null;
        this.qdl = t;
        this.ud = t2;
        this.lnr = null;
        this.mml = null;
        this.mzz = null;
        this.mo = Float.MIN_VALUE;
        this.wd = Float.valueOf(Float.MAX_VALUE);
    }
}
