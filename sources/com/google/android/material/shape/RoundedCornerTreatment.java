package com.google.android.material.shape;

/* JADX INFO: loaded from: classes4.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    @Override // com.google.android.material.shape.CornerTreatment
    public final void a(ShapePath shapePath, float f, float f2) {
        shapePath.e(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        shapePath.getClass();
        ShapePath.PathArcOperation pathArcOperation = new ShapePath.PathArcOperation(0.0f, 0.0f, f3, f3);
        pathArcOperation.f = 180.0f;
        pathArcOperation.g = 90.0f;
        shapePath.g.add(pathArcOperation);
        ShapePath.ArcShadowOperation arcShadowOperation = new ShapePath.ArcShadowOperation(pathArcOperation);
        float f4 = 180.0f + 90.0f;
        boolean z2 = 90.0f < 0.0f;
        float f5 = z2 ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f6 = z2 ? (180.0f + f4) % 360.0f : f4;
        shapePath.a(f5);
        shapePath.f19457h.add(arcShadowOperation);
        shapePath.f19456e = f6;
        double d = f4;
        shapePath.f19455c = (((f3 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
        shapePath.d = (((f3 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
    }
}
