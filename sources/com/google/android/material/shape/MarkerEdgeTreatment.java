package com.google.android.material.shape;

/* JADX INFO: loaded from: classes4.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    @Override // com.google.android.material.shape.EdgeTreatment
    public final void c(float f, float f2, float f3, ShapePath shapePath) {
        double d = 0.0f;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.e(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        shapePath.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        shapePath.c(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
