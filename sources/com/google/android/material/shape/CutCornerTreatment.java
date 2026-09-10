package com.google.android.material.shape;

/* JADX INFO: loaded from: classes4.dex */
public class CutCornerTreatment extends CornerTreatment {
    @Override // com.google.android.material.shape.CornerTreatment
    public final void a(ShapePath shapePath, float f, float f2) {
        shapePath.e(0.0f, f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        shapePath.c((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(0.0f)) * d * d2));
    }
}
