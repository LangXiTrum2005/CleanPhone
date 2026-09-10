package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RelativeCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19426a;

    public RelativeCornerSize(float f) {
        this.f19426a = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f19426a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.f19426a == ((RelativeCornerSize) obj).f19426a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19426a)});
    }
}
