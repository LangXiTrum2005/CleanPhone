package com.scwang.smart.refresh.header.material;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.scwang.smart.refresh.header.MaterialHeader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialProgressDrawable extends Drawable implements Animatable {
    public static final LinearInterpolator k0 = new LinearInterpolator();
    public static final FastOutSlowInInterpolator l0 = new FastOutSlowInInterpolator();
    public static final int[] m0 = {-16777216};
    public final Ring X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f33512Y;
    public final MaterialHeader Z;
    public final Animation e0;
    public float f0;
    public final float g0;
    public final float h0;
    public boolean i0;
    public boolean j0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    public class Ring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f33515a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f33516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f33517c;
        public float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f33518e;
        public float f;
        public float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f33519h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f33520i;
        public int j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f33521l;
        public float m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f33522n;
        public Path o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f33523p;
        public double q;
        public int r;
        public int s;
        public int t;

        public Ring() {
            Paint paint = new Paint();
            this.f33516b = paint;
            Paint paint2 = new Paint();
            this.f33517c = paint2;
            this.d = 0.0f;
            this.f33518e = 0.0f;
            this.f = 0.0f;
            this.g = 5.0f;
            this.f33519h = 2.5f;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }
    }

    public MaterialProgressDrawable(MaterialHeader materialHeader) {
        new ArrayList();
        final Ring ring = new Ring();
        this.X = ring;
        this.Z = materialHeader;
        b(m0);
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = 40 * f;
        this.g0 = f2;
        this.h0 = f2;
        ring.j = 0;
        ring.t = ring.f33520i[0];
        float f3 = 2.5f * f;
        ring.f33516b.setStrokeWidth(f3);
        ring.g = f3;
        ring.q = 8.75f * f;
        ring.r = (int) (10.0f * f);
        ring.s = (int) (5.0f * f);
        float fMin = Math.min((int) this.g0, (int) this.h0);
        double d = ring.q;
        ring.f33519h = (d <= 0.0d || fMin < 0.0f) ? (float) Math.ceil(ring.g / 2.0f) : (float) (((double) (fMin / 2.0f)) - d);
        invalidateSelf();
        Animation animation = new Animation() { // from class: com.scwang.smart.refresh.header.material.MaterialProgressDrawable.1
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f4, Transformation transformation) {
                MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
                boolean z2 = materialProgressDrawable.i0;
                Ring ring2 = ring;
                if (z2) {
                    MaterialProgressDrawable.f(f4, ring2);
                    float fFloor = (float) (Math.floor(ring2.m / 0.8f) + 1.0d);
                    float radians = (float) Math.toRadians(((double) ring2.g) / (ring2.q * 6.283185307179586d));
                    float f5 = ring2.k;
                    float f6 = ring2.f33521l;
                    materialProgressDrawable.d((((f6 - radians) - f5) * f4) + f5, f6);
                    float f7 = ring2.m;
                    materialProgressDrawable.c(((fFloor - f7) * f4) + f7);
                    return;
                }
                float radians2 = (float) Math.toRadians(((double) ring2.g) / (ring2.q * 6.283185307179586d));
                float f8 = ring2.f33521l;
                float f9 = ring2.k;
                float f10 = ring2.m;
                MaterialProgressDrawable.f(f4, ring2);
                if (f4 <= 0.5f) {
                    ring2.d = (MaterialProgressDrawable.l0.getInterpolation(f4 / 0.5f) * (0.8f - radians2)) + f9;
                }
                if (f4 > 0.5f) {
                    ring2.f33518e = (MaterialProgressDrawable.l0.getInterpolation((f4 - 0.5f) / 0.5f) * (0.8f - radians2)) + f8;
                }
                materialProgressDrawable.c((0.25f * f4) + f10);
                materialProgressDrawable.f33512Y = ((materialProgressDrawable.f0 / 5.0f) * 1080.0f) + (f4 * 216.0f);
                materialProgressDrawable.invalidateSelf();
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(k0);
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.scwang.smart.refresh.header.material.MaterialProgressDrawable.2
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation2) {
                Ring ring2 = ring;
                ring2.k = ring2.d;
                float f4 = ring2.f33518e;
                ring2.f33521l = f4;
                ring2.m = ring2.f;
                int i2 = ring2.j + 1;
                int[] iArr = ring2.f33520i;
                int length = i2 % iArr.length;
                ring2.j = length;
                ring2.t = iArr[length];
                ring2.d = f4;
                MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
                if (!materialProgressDrawable.i0) {
                    materialProgressDrawable.f0 = (materialProgressDrawable.f0 + 1.0f) % 5.0f;
                    return;
                }
                materialProgressDrawable.i0 = false;
                animation2.setDuration(1332L);
                materialProgressDrawable.e(false);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation2) {
                MaterialProgressDrawable.this.f0 = 0.0f;
            }
        });
        this.e0 = animation;
    }

    public static void f(float f, Ring ring) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = ring.f33520i;
            int i2 = ring.j;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            ring.t = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
        }
    }

    public final void a(float f) {
        Ring ring = this.X;
        if (ring.f33523p != f) {
            ring.f33523p = f;
            invalidateSelf();
        }
    }

    public final void b(int... iArr) {
        Ring ring = this.X;
        ring.f33520i = iArr;
        ring.j = 0;
        ring.t = iArr[0];
    }

    public final void c(float f) {
        this.X.f = f;
        invalidateSelf();
    }

    public final void d(float f, float f2) {
        Ring ring = this.X;
        ring.d = f;
        ring.f33518e = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        Canvas canvas2;
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.rotate(this.f33512Y, bounds.exactCenterX(), bounds.exactCenterY());
        Ring ring = this.X;
        RectF rectF = ring.f33515a;
        rectF.set(bounds);
        float f2 = ring.f33519h;
        rectF.inset(f2, f2);
        float f3 = ring.d;
        float f4 = ring.f;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((ring.f33518e + f4) * 360.0f) - f5;
        if (f6 != 0.0f) {
            Paint paint = ring.f33516b;
            paint.setColor(ring.t);
            f = f5;
            canvas2 = canvas;
            canvas2.drawArc(rectF, f, f6, false, paint);
        } else {
            f = f5;
            canvas2 = canvas;
        }
        if (ring.f33522n) {
            Path path = ring.o;
            if (path == null) {
                Path path2 = new Path();
                ring.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float f7 = (((int) ring.f33519h) / 2) * ring.f33523p;
            float fCos = (float) ((Math.cos(0.0d) * ring.q) + ((double) bounds.exactCenterX()));
            float fSin = (float) ((Math.sin(0.0d) * ring.q) + ((double) bounds.exactCenterY()));
            ring.o.moveTo(0.0f, 0.0f);
            ring.o.lineTo(ring.r * ring.f33523p, 0.0f);
            Path path3 = ring.o;
            float f8 = ring.r;
            float f9 = ring.f33523p;
            path3.lineTo((f8 * f9) / 2.0f, ring.s * f9);
            ring.o.offset(fCos - f7, fSin);
            ring.o.close();
            Paint paint2 = ring.f33517c;
            paint2.setColor(ring.t);
            canvas2.rotate((f + f6) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas2.drawPath(ring.o, paint2);
        }
        canvas2.restoreToCount(iSave);
    }

    public final void e(boolean z2) {
        Ring ring = this.X;
        if (ring.f33522n != z2) {
            ring.f33522n = z2;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.h0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.g0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.j0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.X.f33516b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.j0) {
            return;
        }
        this.e0.reset();
        Ring ring = this.X;
        float f = ring.d;
        ring.k = f;
        float f2 = ring.f33518e;
        ring.f33521l = f2;
        ring.m = ring.f;
        MaterialHeader materialHeader = this.Z;
        if (f2 != f) {
            this.i0 = true;
            this.e0.setDuration(666L);
            materialHeader.startAnimation(this.e0);
        } else {
            ring.j = 0;
            ring.t = ring.f33520i[0];
            ring.k = 0.0f;
            ring.f33521l = 0.0f;
            ring.m = 0.0f;
            ring.d = 0.0f;
            ring.f33518e = 0.0f;
            ring.f = 0.0f;
            this.e0.setDuration(1332L);
            materialHeader.startAnimation(this.e0);
        }
        this.j0 = true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.j0) {
            this.Z.clearAnimation();
            Ring ring = this.X;
            ring.j = 0;
            ring.t = ring.f33520i[0];
            ring.k = 0.0f;
            ring.f33521l = 0.0f;
            ring.m = 0.0f;
            ring.d = 0.0f;
            ring.f33518e = 0.0f;
            ring.f = 0.0f;
            e(false);
            this.f33512Y = 0.0f;
            invalidateSelf();
            this.j0 = false;
        }
    }
}
