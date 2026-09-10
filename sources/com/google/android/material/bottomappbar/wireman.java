package com.google.android.material.bottomappbar;

import chinny.competently;
import chinny.monoploid;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: BottomAppBarTopEdgeTreatment.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman extends competently implements Cloneable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f19699arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f19700graveside = -1.0f;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f19701kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f19702molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float f19703monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f19704polloi;

    public wireman(float f, float f2, float f3) {
        this.f19699arytenoidectomy = f;
        this.f19701kowloon = f2;
        apical(f3);
        this.f19702molybdenite = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void apical(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f19704polloi = f;
    }

    public float beachfront() {
        return this.f19699arytenoidectomy;
    }

    public float competently() {
        return this.f19701kowloon;
    }

    @Override // chinny.competently
    public void dern(float f, float f2, float f3, monoploid monoploidVar) {
        float f4;
        float f5;
        float f6 = this.f19703monoploid;
        if (f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            monoploidVar.impassible(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        float f7 = ((this.f19699arytenoidectomy * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f19701kowloon;
        float f9 = f2 + this.f19702molybdenite;
        float f10 = (this.f19704polloi * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            monoploidVar.impassible(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        float f11 = this.f19700graveside;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - fSqrt;
        float f16 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        monoploidVar.impassible(f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f18 = f15 - f8;
        float f19 = f15 + f8;
        float f20 = f8 * 2.0f;
        monoploidVar.attabal(f18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f19, f20, 270.0f, degrees);
        if (z) {
            monoploidVar.attabal(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f21 = this.f19699arytenoidectomy;
            float f22 = f12 * 2.0f;
            float f23 = f21 + f22;
            float f24 = f9 - f7;
            monoploidVar.attabal(f24, -(f12 + f21), f23 + f24, f21 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f9 + f7;
            float f26 = this.f19699arytenoidectomy;
            monoploidVar.impassible(f25 - ((f26 / 2.0f) + f12), f26 + f12);
            float f27 = this.f19699arytenoidectomy;
            monoploidVar.attabal(f25 - (f22 + f27), -(f12 + f27), f25, f27 + f12, 90.0f, f17 - 90.0f);
        }
        monoploidVar.attabal(f16 - f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f16 + f8, f20, 270.0f - degrees, degrees);
        monoploidVar.impassible(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void formularize(float f) {
        this.f19700graveside = f;
    }

    public void impassible(float f) {
        this.f19699arytenoidectomy = f;
    }

    public float impromptu() {
        return this.f19703monoploid;
    }

    public void kowloon(float f) {
        this.f19703monoploid = f;
    }

    public float marial() {
        return this.f19700graveside;
    }

    public void monoploid(float f) {
        this.f19702molybdenite = f;
    }

    public float taiyuan() {
        return this.f19702molybdenite;
    }

    public void triweekly(float f) {
        this.f19701kowloon = f;
    }

    public float wireman() {
        return this.f19704polloi;
    }
}
