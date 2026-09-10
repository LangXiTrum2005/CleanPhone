package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3288v1 extends Animation {
    public final float b;
    public final float c;
    public Camera e;
    public final float a = 90.0f;
    public final boolean d = true;

    public C3288v1(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation t) {
        Intrinsics.checkNotNullParameter(t, "t");
        float f2 = ((this.a - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = this.b;
        float f4 = this.c;
        Camera camera = this.e;
        Matrix matrix = t.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.d) {
                camera.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                camera.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - f) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            camera.rotateY(f2);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f3, -f4);
        matrix.postTranslate(f3, f4);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.e = new Camera();
    }
}
