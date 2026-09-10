package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Z0 extends Animation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23392c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Camera f23393e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23390a = 90.0f;
    public final boolean d = true;

    public Z0(float f, float f2) {
        this.f23391b = f;
        this.f23392c = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation t) {
        Intrinsics.f(t, "t");
        float fA = android.support.v4.media.a.a(this.f23390a, 0.0f, f, 0.0f);
        float f2 = this.f23391b;
        float f3 = this.f23392c;
        Camera camera = this.f23393e;
        Matrix matrix = t.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.d) {
                camera.translate(0.0f, 0.0f, f * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f) * 0.0f);
            }
            camera.rotateY(fA);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f2, -f3);
        matrix.postTranslate(f2, f3);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i2, int i3, int i4, int i5) {
        super.initialize(i2, i3, i4, i5);
        this.f23393e = new Camera();
    }
}
