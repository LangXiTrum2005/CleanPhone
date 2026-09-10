package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import com.google.android.material.progressindicator.saneness;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: DrawingDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cutely<S extends com.google.android.material.progressindicator.saneness> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public S f20658attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Path f20659dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Matrix f20660marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Path f20661saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final PathMeasure f20662wireman;

    /* JADX INFO: compiled from: DrawingDelegate.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public float f20663attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public float f20664beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public float f20665competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f20666dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f20667impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f20668marial = 1.0f;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f20669saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f20670wireman;
    }

    public cutely(S s) {
        Path path = new Path();
        this.f20661saneness = path;
        this.f20659dern = new Path();
        this.f20662wireman = new PathMeasure(path, false);
        this.f20658attabal = s;
        this.f20660marial = new Matrix();
    }

    public abstract void attabal(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract int beachfront();

    public abstract void competently();

    public abstract void dern(Canvas canvas, Paint paint, attabal attabalVar, int i);

    public void impromptu(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.f20658attabal.impromptu();
        attabal(canvas, rect, f, z, z2);
    }

    public abstract int marial();

    public abstract void saneness(Canvas canvas, Paint paint, int i, int i2);

    public float taiyuan(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void wireman(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    /* JADX INFO: compiled from: DrawingDelegate.java */
    public class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public float[] f20671attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Matrix f20672dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float[] f20673saneness;

        public saneness() {
            this.f20671attabal = new float[2];
            this.f20673saneness = new float[]{1.0f, 0.0f};
            this.f20672dern = new Matrix();
        }

        public void attabal(float f) {
            float[] fArr = this.f20673saneness;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.f20671attabal;
            double d = f;
            double d2 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d2) * d));
            float[] fArr3 = this.f20671attabal;
            fArr3[1] = (float) (((double) fArr3[1]) + (d * Math.sin(d2)));
        }

        public void beachfront(float f, float f2) {
            float[] fArr = this.f20671attabal;
            fArr[0] = fArr[0] + f;
            fArr[1] = fArr[1] + f2;
        }

        public void dern() {
            Arrays.fill(this.f20671attabal, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f20673saneness, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f20673saneness[0] = 1.0f;
            this.f20672dern.reset();
        }

        public void marial(float f, float f2) {
            float[] fArr = this.f20671attabal;
            fArr[0] = fArr[0] * f;
            fArr[1] = fArr[1] * f2;
            float[] fArr2 = this.f20673saneness;
            fArr2[0] = fArr2[0] * f;
            fArr2[1] = fArr2[1] * f2;
        }

        public void saneness(float f) {
            float[] fArr = this.f20673saneness;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            float[] fArr2 = this.f20671attabal;
            double d = f;
            double d2 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d2) * d));
            float[] fArr3 = this.f20671attabal;
            fArr3[1] = (float) (((double) fArr3[1]) + (d * Math.sin(d2)));
        }

        public void wireman(float f) {
            this.f20672dern.reset();
            this.f20672dern.setRotate(f);
            this.f20672dern.mapPoints(this.f20671attabal);
            this.f20672dern.mapPoints(this.f20673saneness);
        }

        public saneness(cutely cutelyVar, cutely<S>.saneness sanenessVar) {
            this(sanenessVar.f20671attabal, sanenessVar.f20673saneness);
        }

        public saneness(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.f20671attabal = fArr3;
            this.f20673saneness = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.f20673saneness, 0, 2);
            this.f20672dern = new Matrix();
        }
    }
}
