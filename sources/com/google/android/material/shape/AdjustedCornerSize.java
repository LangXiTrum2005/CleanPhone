package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class AdjustedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CornerSize f19412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19413b;

    public AdjustedCornerSize(float f, CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f19412a;
            f += ((AdjustedCornerSize) cornerSize).f19413b;
        }
        this.f19412a = cornerSize;
        this.f19413b = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f19412a.a(rectF) + this.f19413b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        return this.f19412a.equals(adjustedCornerSize.f19412a) && this.f19413b == adjustedCornerSize.f19413b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19412a, Float.valueOf(this.f19413b)});
    }
}
