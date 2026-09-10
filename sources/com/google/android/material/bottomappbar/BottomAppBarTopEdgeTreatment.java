package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes4.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    public float X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f19125Y;
    public float Z;
    public float e0;

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void c(float f, float f2, float f3, ShapePath shapePath) {
        shapePath.c(f, 0.0f);
    }
}
