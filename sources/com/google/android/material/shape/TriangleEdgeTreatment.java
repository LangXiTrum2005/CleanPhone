package com.google.android.material.shape;

/* JADX INFO: loaded from: classes4.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    @Override // com.google.android.material.shape.EdgeTreatment
    public final void c(float f, float f2, float f3, ShapePath shapePath) {
        float f4 = 0.0f * f3;
        shapePath.d(f2 - f4, f2, (-0.0f) * f3);
        shapePath.d(f2 + f4, f, 0.0f);
    }
}
