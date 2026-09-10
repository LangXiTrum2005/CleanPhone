package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Y0 extends Animation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23356c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Camera f23357e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23354a = 90.0f;
    public final boolean d = true;

    public Y0(float f, float f2) {
        this.f23355b = f;
        this.f23356c = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation t) {
        Intrinsics.f(t, "t");
        float fA = android.support.v4.media.a.a(this.f23354a, 0.0f, f, 0.0f);
        float f2 = this.f23355b;
        float f3 = this.f23356c;
        Camera camera = this.f23357e;
        Matrix matrix = t.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.d) {
                camera.translate(0.0f, 0.0f, f * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f) * 0.0f);
            }
            camera.rotateX(fA);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f2, -f3);
        matrix.postTranslate(f2, f3);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i2, int i3, int i4, int i5) {
        super.initialize(i2, i3, i4, i5);
        this.f23357e = new Camera();
    }
}
