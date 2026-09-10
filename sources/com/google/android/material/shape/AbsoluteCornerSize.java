package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19411a;

    public AbsoluteCornerSize(float f) {
        this.f19411a = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return this.f19411a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.f19411a == ((AbsoluteCornerSize) obj).f19411a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19411a)});
    }
}
