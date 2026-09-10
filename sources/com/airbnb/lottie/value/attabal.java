package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.impromptu;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: Keyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal<T> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f16244apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public PointF f16245arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f16246attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Interpolator f16247beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float f16248competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f16249cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public T f16250dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f16251formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f16252impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public Float f16253impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public PointF f16254kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Interpolator f16255marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final T f16256saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f16257taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f16258triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Interpolator f16259wireman;

    public attabal(impromptu impromptuVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f16257taiyuan = -3987645.8f;
        this.f16249cutely = -3987645.8f;
        this.f16244apical = 784923401;
        this.f16251formularize = 784923401;
        this.f16252impassible = Float.MIN_VALUE;
        this.f16258triweekly = Float.MIN_VALUE;
        this.f16254kowloon = null;
        this.f16245arytenoidectomy = null;
        this.f16246attabal = impromptuVar;
        this.f16256saneness = t;
        this.f16250dern = t2;
        this.f16259wireman = interpolator;
        this.f16255marial = null;
        this.f16247beachfront = null;
        this.f16248competently = f;
        this.f16253impromptu = f2;
    }

    public boolean attabal(float f) {
        return f >= beachfront() && f < dern();
    }

    public float beachfront() {
        impromptu impromptuVar = this.f16246attabal;
        if (impromptuVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.f16252impassible == Float.MIN_VALUE) {
            this.f16252impassible = (this.f16248competently - impromptuVar.arytenoidectomy()) / this.f16246attabal.marial();
        }
        return this.f16252impassible;
    }

    public float competently() {
        if (this.f16257taiyuan == -3987645.8f) {
            this.f16257taiyuan = ((Float) this.f16256saneness).floatValue();
        }
        return this.f16257taiyuan;
    }

    public float dern() {
        if (this.f16246attabal == null) {
            return 1.0f;
        }
        if (this.f16258triweekly == Float.MIN_VALUE) {
            if (this.f16253impromptu == null) {
                this.f16258triweekly = 1.0f;
            } else {
                float fBeachfront = beachfront();
                this.f16258triweekly = (float) (((double) fBeachfront) + (((double) (this.f16253impromptu.floatValue() - this.f16248competently)) / ((double) this.f16246attabal.marial())));
            }
        }
        return this.f16258triweekly;
    }

    public int impromptu() {
        if (this.f16244apical == 784923401) {
            this.f16244apical = ((Integer) this.f16256saneness).intValue();
        }
        return this.f16244apical;
    }

    public int marial() {
        if (this.f16251formularize == 784923401) {
            this.f16251formularize = ((Integer) this.f16250dern).intValue();
        }
        return this.f16251formularize;
    }

    public attabal<T> saneness(T t, T t2) {
        return new attabal<>(t, t2);
    }

    public boolean taiyuan() {
        return this.f16259wireman == null && this.f16255marial == null && this.f16247beachfront == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f16256saneness + ", endValue=" + this.f16250dern + ", startFrame=" + this.f16248competently + ", endFrame=" + this.f16253impromptu + ", interpolator=" + this.f16259wireman + '}';
    }

    public float wireman() {
        if (this.f16249cutely == -3987645.8f) {
            this.f16249cutely = ((Float) this.f16250dern).floatValue();
        }
        return this.f16249cutely;
    }

    public attabal(impromptu impromptuVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f16257taiyuan = -3987645.8f;
        this.f16249cutely = -3987645.8f;
        this.f16244apical = 784923401;
        this.f16251formularize = 784923401;
        this.f16252impassible = Float.MIN_VALUE;
        this.f16258triweekly = Float.MIN_VALUE;
        this.f16254kowloon = null;
        this.f16245arytenoidectomy = null;
        this.f16246attabal = impromptuVar;
        this.f16256saneness = t;
        this.f16250dern = t2;
        this.f16259wireman = null;
        this.f16255marial = interpolator;
        this.f16247beachfront = interpolator2;
        this.f16248competently = f;
        this.f16253impromptu = f2;
    }

    public attabal(impromptu impromptuVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f16257taiyuan = -3987645.8f;
        this.f16249cutely = -3987645.8f;
        this.f16244apical = 784923401;
        this.f16251formularize = 784923401;
        this.f16252impassible = Float.MIN_VALUE;
        this.f16258triweekly = Float.MIN_VALUE;
        this.f16254kowloon = null;
        this.f16245arytenoidectomy = null;
        this.f16246attabal = impromptuVar;
        this.f16256saneness = t;
        this.f16250dern = t2;
        this.f16259wireman = interpolator;
        this.f16255marial = interpolator2;
        this.f16247beachfront = interpolator3;
        this.f16248competently = f;
        this.f16253impromptu = f2;
    }

    public attabal(T t) {
        this.f16257taiyuan = -3987645.8f;
        this.f16249cutely = -3987645.8f;
        this.f16244apical = 784923401;
        this.f16251formularize = 784923401;
        this.f16252impassible = Float.MIN_VALUE;
        this.f16258triweekly = Float.MIN_VALUE;
        this.f16254kowloon = null;
        this.f16245arytenoidectomy = null;
        this.f16246attabal = null;
        this.f16256saneness = t;
        this.f16250dern = t;
        this.f16259wireman = null;
        this.f16255marial = null;
        this.f16247beachfront = null;
        this.f16248competently = Float.MIN_VALUE;
        this.f16253impromptu = Float.valueOf(Float.MAX_VALUE);
    }

    public attabal(T t, T t2) {
        this.f16257taiyuan = -3987645.8f;
        this.f16249cutely = -3987645.8f;
        this.f16244apical = 784923401;
        this.f16251formularize = 784923401;
        this.f16252impassible = Float.MIN_VALUE;
        this.f16258triweekly = Float.MIN_VALUE;
        this.f16254kowloon = null;
        this.f16245arytenoidectomy = null;
        this.f16246attabal = null;
        this.f16256saneness = t;
        this.f16250dern = t2;
        this.f16259wireman = null;
        this.f16255marial = null;
        this.f16247beachfront = null;
        this.f16248competently = Float.MIN_VALUE;
        this.f16253impromptu = Float.valueOf(Float.MAX_VALUE);
    }
}
