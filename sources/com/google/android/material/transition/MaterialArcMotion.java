package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.transition.PathMotion;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialArcMotion extends PathMotion {
    @Override // androidx.transition.PathMotion
    public final Path a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF pointF = f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
        path.quadTo(pointF.x, pointF.y, f3, f4);
        return path;
    }
}
