package com.basic.lib.basic.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Dimension;
import androidx.appcompat.widget.AppCompatImageView;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TW;

/* JADX INFO: loaded from: classes.dex */
public class RadiusImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f210a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Path f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC2995aW.q(context, f.X);
    }

    public final void a() {
        this.f.reset();
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            width = height;
        }
        int i = width / 2;
        int i2 = this.f210a;
        if (i2 <= 0) {
            i2 = this.e;
        }
        if (i <= i2) {
            i2 = i;
        }
        int i3 = this.b;
        if (i3 <= 0) {
            i3 = this.e;
        }
        if (i <= i3) {
            i3 = i;
        }
        int i4 = this.d;
        if (i4 <= 0) {
            i4 = this.e;
        }
        if (i <= i4) {
            i4 = i;
        }
        int i5 = this.c;
        if (i5 <= 0) {
            i5 = this.e;
        }
        if (i > i5) {
            i = i5;
        }
        float f = i2;
        this.f.moveTo(0.0f, f);
        float f2 = f * 2.0f;
        this.f.arcTo(new RectF(0.0f, 0.0f, f2, f2), -180.0f, 90.0f);
        float f3 = i3 * 2.0f;
        this.f.arcTo(new RectF(getWidth() - f3, 0.0f, getWidth(), f3), -90.0f, 90.0f);
        float f4 = i4 * 2.0f;
        this.f.arcTo(new RectF(getWidth() - f4, getHeight() - f4, getWidth(), getHeight()), 0.0f, 90.0f);
        float f5 = i * 2.0f;
        this.f.arcTo(new RectF(0.0f, getHeight() - f5, f5, getHeight()), 90.0f, 90.0f);
        this.f.close();
    }

    public final Path getClipPath() {
        return this.f;
    }

    public final int getRadius() {
        return this.e;
    }

    public final int getRadiusLB() {
        return this.c;
    }

    public final int getRadiusLT() {
        return this.f210a;
    }

    public final int getRadiusRB() {
        return this.d;
    }

    public final int getRadiusRT() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
        if (this.e <= 0 && this.f210a <= 0 && this.b <= 0 && this.d <= 0 && this.c <= 0) {
            super.onDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipPath(this.f);
            super.onDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            width = height;
        }
        int i5 = width / 2;
        int i6 = this.g;
        if (i6 == -1) {
            i6 = i5;
        }
        setRadius(i6);
        int i7 = this.h;
        if (i7 == -1) {
            i7 = i5;
        }
        setRadiusLT(i7);
        int i8 = this.i;
        if (i8 == -1) {
            i8 = i5;
        }
        setRadiusRT(i8);
        int i9 = this.k;
        if (i9 == -1) {
            i9 = i5;
        }
        setRadiusRB(i9);
        int i10 = this.j;
        if (i10 != -1) {
            i5 = i10;
        }
        setRadiusLB(i5);
        a();
    }

    public final void setClipPath(Path path) {
        AbstractC2995aW.q(path, "<set-?>");
        this.f = path;
    }

    public final void setRadius(@Dimension int i) {
        this.e = i;
        this.g = i;
        a();
        postInvalidate();
    }

    public final void setRadiusLB(@Dimension int i) {
        this.c = i;
        this.j = i;
        a();
        postInvalidate();
    }

    public final void setRadiusLT(@Dimension int i) {
        this.f210a = i;
        this.h = i;
        a();
        postInvalidate();
    }

    public final void setRadiusRB(@Dimension int i) {
        this.d = i;
        this.k = i;
        a();
        postInvalidate();
    }

    public final void setRadiusRT(@Dimension int i) {
        this.b = i;
        this.i = i;
        a();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2995aW.q(context, f.X);
        this.f = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TW.f3774a, 0, 0);
        this.g = typedArrayObtainStyledAttributes.getLayoutDimension(0, 0);
        this.h = typedArrayObtainStyledAttributes.getLayoutDimension(2, 0);
        this.i = typedArrayObtainStyledAttributes.getLayoutDimension(4, 0);
        this.j = typedArrayObtainStyledAttributes.getLayoutDimension(1, 0);
        this.k = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
