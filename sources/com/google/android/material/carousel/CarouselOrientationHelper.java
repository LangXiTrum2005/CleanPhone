package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
abstract class CarouselOrientationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19183a;

    public CarouselOrientationHelper(int i2) {
        this.f19183a = i2;
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract float b(RecyclerView.LayoutParams layoutParams);

    public abstract RectF c(float f, float f2, float f3, float f4);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract void j(int i2, int i3, View view);

    public abstract void k(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void l(View view, Rect rect, float f, float f2);
}
