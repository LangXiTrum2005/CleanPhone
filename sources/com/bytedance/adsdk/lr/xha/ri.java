package com.bytedance.adsdk.lr.xha;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.lr.xha;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri<T> {
    private int aw;
    private int bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private float f18006co;
    public final float di;
    public final Interpolator fi;
    public final Interpolator ik;
    public PointF jbs;
    public final Interpolator ka;
    public T lr;
    public PointF mj;
    private final xha qt;
    public final T ri;
    private float sf;
    private float slm;
    private float vr;
    public Float xha;

    public ri(xha xhaVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.sf = -3987645.8f;
        this.f18006co = -3987645.8f;
        this.aw = 784923401;
        this.bgr = 784923401;
        this.vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.mj = null;
        this.jbs = null;
        this.qt = xhaVar;
        this.ri = t;
        this.lr = t2;
        this.ik = interpolator;
        this.ka = null;
        this.fi = null;
        this.di = f;
        this.xha = f2;
    }

    public float di() {
        if (this.sf == -3987645.8f) {
            this.sf = ((Float) this.ri).floatValue();
        }
        return this.sf;
    }

    public boolean fi() {
        return this.ik == null && this.ka == null && this.fi == null;
    }

    public float ik() {
        xha xhaVar = this.qt;
        if (xhaVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.vr == Float.MIN_VALUE) {
            this.vr = (this.di - xhaVar.di()) / this.qt.bu();
        }
        return this.vr;
    }

    public int jbs() {
        if (this.bgr == 784923401) {
            this.bgr = ((Integer) this.lr).intValue();
        }
        return this.bgr;
    }

    public float ka() {
        if (this.qt == null) {
            return 1.0f;
        }
        if (this.slm == Float.MIN_VALUE) {
            if (this.xha == null) {
                this.slm = 1.0f;
            } else {
                this.slm = ik() + ((this.xha.floatValue() - this.di) / this.qt.bu());
            }
        }
        return this.slm;
    }

    public int mj() {
        if (this.aw == 784923401) {
            this.aw = ((Integer) this.ri).intValue();
        }
        return this.aw;
    }

    public ri<T> ri(T t, T t2) {
        return new ri<>(t, t2);
    }

    public String toString() {
        return "Keyframe{startValue=" + this.ri + ", endValue=" + this.lr + ", startFrame=" + this.di + ", endFrame=" + this.xha + ", interpolator=" + this.ik + '}';
    }

    public float xha() {
        if (this.f18006co == -3987645.8f) {
            this.f18006co = ((Float) this.lr).floatValue();
        }
        return this.f18006co;
    }

    public boolean ri(float f) {
        return f >= ik() && f < ka();
    }

    public ri(xha xhaVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.sf = -3987645.8f;
        this.f18006co = -3987645.8f;
        this.aw = 784923401;
        this.bgr = 784923401;
        this.vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.mj = null;
        this.jbs = null;
        this.qt = xhaVar;
        this.ri = t;
        this.lr = t2;
        this.ik = null;
        this.ka = interpolator;
        this.fi = interpolator2;
        this.di = f;
        this.xha = f2;
    }

    public ri(xha xhaVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.sf = -3987645.8f;
        this.f18006co = -3987645.8f;
        this.aw = 784923401;
        this.bgr = 784923401;
        this.vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.mj = null;
        this.jbs = null;
        this.qt = xhaVar;
        this.ri = t;
        this.lr = t2;
        this.ik = interpolator;
        this.ka = interpolator2;
        this.fi = interpolator3;
        this.di = f;
        this.xha = f2;
    }

    public ri(T t) {
        this.sf = -3987645.8f;
        this.f18006co = -3987645.8f;
        this.aw = 784923401;
        this.bgr = 784923401;
        this.vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.mj = null;
        this.jbs = null;
        this.qt = null;
        this.ri = t;
        this.lr = t;
        this.ik = null;
        this.ka = null;
        this.fi = null;
        this.di = Float.MIN_VALUE;
        this.xha = Float.valueOf(Float.MAX_VALUE);
    }

    private ri(T t, T t2) {
        this.sf = -3987645.8f;
        this.f18006co = -3987645.8f;
        this.aw = 784923401;
        this.bgr = 784923401;
        this.vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.mj = null;
        this.jbs = null;
        this.qt = null;
        this.ri = t;
        this.lr = t2;
        this.ik = null;
        this.ka = null;
        this.fi = null;
        this.di = Float.MIN_VALUE;
        this.xha = Float.valueOf(Float.MAX_VALUE);
    }
}
