package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    public static final Paint y0;
    public MaterialShapeDrawableState X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ShapePath.ShadowCompatOperation[] f19415Y;
    public final ShapePath.ShadowCompatOperation[] Z;
    public final BitSet e0;
    public boolean f0;
    public final Matrix g0;
    public final Path h0;
    public final Path i0;
    public final RectF j0;
    public final RectF k0;
    public final Region l0;
    public final Region m0;
    public ShapeAppearanceModel n0;
    public final Paint o0;
    public final Paint p0;
    public final ShadowRenderer q0;
    public final ShapeAppearancePathProvider.PathListener r0;
    public final ShapeAppearancePathProvider s0;
    public PorterDuffColorFilter t0;
    public PorterDuffColorFilter u0;
    public int v0;
    public final RectF w0;
    public boolean x0;

    /* JADX INFO: renamed from: com.google.android.material.shape.MaterialShapeDrawable$1, reason: invalid class name */
    class AnonymousClass1 implements ShapeAppearancePathProvider.PathListener {
        public AnonymousClass1() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    static {
        Paint paint = new Paint(1);
        y0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        this.s0.a(materialShapeDrawableState.f19417a, materialShapeDrawableState.f19422i, rectF, this.r0, path);
        if (this.X.f19421h != 1.0f) {
            Matrix matrix = this.g0;
            matrix.reset();
            float f = this.X.f19421h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w0, true);
    }

    public final int c(int i2) {
        int i3;
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        float f = materialShapeDrawableState.m + 0.0f + materialShapeDrawableState.f19423l;
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawableState.f19418b;
        if (elevationOverlayProvider == null || !elevationOverlayProvider.f19278a || ColorUtils.e(i2, 255) != elevationOverlayProvider.d) {
            return i2;
        }
        float f2 = elevationOverlayProvider.f19281e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i2);
        int iE = MaterialColors.e(fMin, ColorUtils.e(i2, 255), elevationOverlayProvider.f19279b);
        if (fMin > 0.0f && (i3 = elevationOverlayProvider.f19280c) != 0) {
            iE = ColorUtils.c(ColorUtils.e(i3, ElevationOverlayProvider.f), iE);
        }
        return ColorUtils.e(iE, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.e0.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.X.f19425p;
        Path path = this.h0;
        ShadowRenderer shadowRenderer = this.q0;
        if (i2 != 0) {
            canvas.drawPath(path, shadowRenderer.f19406a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            ShapePath.ShadowCompatOperation shadowCompatOperation = this.f19415Y[i3];
            int i4 = this.X.o;
            Matrix matrix = ShapePath.ShadowCompatOperation.f19471b;
            shadowCompatOperation.a(matrix, shadowRenderer, i4, canvas);
            this.Z[i3].a(matrix, shadowRenderer, this.X.o, canvas);
        }
        if (this.x0) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.X.f19425p));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.X.f19425p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, y0);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        Paint paint = this.o0;
        paint.setColorFilter(this.t0);
        int alpha = paint.getAlpha();
        int i2 = this.X.k;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.p0;
        paint2.setColorFilter(this.u0);
        paint2.setStrokeWidth(this.X.j);
        int alpha2 = paint2.getAlpha();
        int i3 = this.X.k;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f0;
        Path path = this.h0;
        if (z2) {
            final float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            ShapeAppearanceModel shapeAppearanceModelG = this.X.f19417a.g(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.shape.MaterialShapeDrawable.2
                @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
                public final CornerSize b(CornerSize cornerSize) {
                    return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(f, cornerSize);
                }
            });
            this.n0 = shapeAppearanceModelG;
            float f2 = this.X.f19422i;
            RectF rectF = this.k0;
            rectF.set(g());
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.s0.a(shapeAppearanceModelG, f2, rectF, null, this.i0);
            b(g(), path);
            this.f0 = false;
        }
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        int i4 = materialShapeDrawableState.f19424n;
        if (i4 != 1 && materialShapeDrawableState.o > 0) {
            if (i4 != 2) {
                int i5 = Build.VERSION.SDK_INT;
                if (!materialShapeDrawableState.f19417a.e(g()) && !path.isConvex() && i5 < 29) {
                    canvas.save();
                    double d = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.X.f19425p)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.X.f19425p)));
                    if (!this.x0) {
                        RectF rectF2 = this.w0;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.X.o * 2) + ((int) rectF2.width()) + iWidth, (this.X.o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f3 = (getBounds().left - this.X.o) - iWidth;
                        float f4 = (getBounds().top - this.X.o) - iHeight;
                        canvas2.translate(-f3, -f4);
                        d(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        d(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * ((double) this.X.f19425p)), (int) (Math.cos(Math.toRadians(d2)) * ((double) this.X.f19425p)));
                if (!this.x0) {
                    RectF rectF3 = this.w0;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                d(canvas);
                canvas.restore();
            }
        }
        MaterialShapeDrawableState materialShapeDrawableState2 = this.X;
        Paint.Style style = materialShapeDrawableState2.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, materialShapeDrawableState2.f19417a, g());
        }
        if (i()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (!shapeAppearanceModel.e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = shapeAppearanceModel.f.a(rectF) * this.X.f19422i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.p0;
        Path path = this.i0;
        ShapeAppearanceModel shapeAppearanceModel = this.n0;
        RectF rectF = this.k0;
        rectF.set(g());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, shapeAppearanceModel, rectF);
    }

    public final RectF g() {
        RectF rectF = this.j0;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.X.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        if (materialShapeDrawableState.f19424n == 2) {
            return;
        }
        if (materialShapeDrawableState.f19417a.e(g())) {
            outline.setRoundRect(getBounds(), h() * this.X.f19422i);
        } else {
            RectF rectFG = g();
            Path path = this.h0;
            b(rectFG, path);
            DrawableUtils.e(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.X.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.Shapeable
    public final ShapeAppearanceModel getShapeAppearanceModel() {
        return this.X.f19417a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.l0;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.h0;
        b(rectFG, path);
        Region region2 = this.m0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.X.f19417a.f19430e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.X.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p0.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f0 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.X.f19420e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.X.getClass();
        ColorStateList colorStateList2 = this.X.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.X.f19419c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(Context context) {
        this.X.f19418b = new ElevationOverlayProvider(context);
        r();
    }

    public final void k(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        if (materialShapeDrawableState.m != f) {
            materialShapeDrawableState.m = f;
            r();
        }
    }

    public final void l(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        if (materialShapeDrawableState.f19419c != colorStateList) {
            materialShapeDrawableState.f19419c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        if (materialShapeDrawableState.f19422i != f) {
            materialShapeDrawableState.f19422i = f;
            this.f0 = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.X = new MaterialShapeDrawableState(this.X);
        return this;
    }

    public final void n(int i2) {
        this.q0.c(i2);
        this.X.getClass();
        super.invalidateSelf();
    }

    public final void o() {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        if (materialShapeDrawableState.f19424n != 2) {
            materialShapeDrawableState.f19424n = 2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f0 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        boolean z2 = p(iArr) || q();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final boolean p(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.X.f19419c == null || color2 == (colorForState2 = this.X.f19419c.getColorForState(iArr, (color2 = (paint2 = this.o0).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.X.d == null || color == (colorForState = this.X.d.getColorForState(iArr, (color = (paint = this.p0).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean q() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u0;
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        ColorStateList colorStateList = materialShapeDrawableState.f19420e;
        PorterDuff.Mode mode = materialShapeDrawableState.f;
        Paint paint = this.o0;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iC = c(color);
            this.v0 = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.v0 = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.t0 = porterDuffColorFilter;
        this.X.getClass();
        this.u0 = null;
        this.X.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.t0) && Objects.equals(porterDuffColorFilter3, this.u0)) ? false : true;
    }

    public final void r() {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        float f = materialShapeDrawableState.m + 0.0f;
        materialShapeDrawableState.o = (int) Math.ceil(0.75f * f);
        this.X.f19425p = (int) Math.ceil(f * 0.25f);
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        if (materialShapeDrawableState.k != i2) {
            materialShapeDrawableState.k = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.X.getClass();
        super.invalidateSelf();
    }

    @Override // com.google.android.material.shape.Shapeable
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.X.f19417a = shapeAppearanceModel;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.X.f19420e = colorStateList;
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.X;
        if (materialShapeDrawableState.f != mode) {
            materialShapeDrawableState.f = mode;
            q();
            super.invalidateSelf();
        }
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(ShapeAppearanceModel.c(context, attributeSet, i2, i3).a());
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel));
    }

    public MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f19415Y = new ShapePath.ShadowCompatOperation[4];
        this.Z = new ShapePath.ShadowCompatOperation[4];
        this.e0 = new BitSet(8);
        this.g0 = new Matrix();
        this.h0 = new Path();
        this.i0 = new Path();
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.l0 = new Region();
        this.m0 = new Region();
        Paint paint = new Paint(1);
        this.o0 = paint;
        Paint paint2 = new Paint(1);
        this.p0 = paint2;
        this.q0 = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.Lazy.f19448a;
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.s0 = shapeAppearancePathProvider;
        this.w0 = new RectF();
        this.x0 = true;
        this.X = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        q();
        p(getState());
        this.r0 = new AnonymousClass1();
    }

    public static class MaterialShapeDrawableState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ShapeAppearanceModel f19417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ElevationOverlayProvider f19418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f19419c;
        public ColorStateList d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f19420e;
        public PorterDuff.Mode f;
        public Rect g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f19421h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f19422i;
        public float j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f19423l;
        public float m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19424n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19425p;
        public final Paint.Style q;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel) {
            this.f19419c = null;
            this.d = null;
            this.f19420e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.f19421h = 1.0f;
            this.f19422i = 1.0f;
            this.k = 255;
            this.f19423l = 0.0f;
            this.m = 0.0f;
            this.f19424n = 0;
            this.o = 0;
            this.f19425p = 0;
            this.q = Paint.Style.FILL_AND_STROKE;
            this.f19417a = shapeAppearanceModel;
            this.f19418b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f0 = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(MaterialShapeDrawableState materialShapeDrawableState) {
            this.f19419c = null;
            this.d = null;
            this.f19420e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.f19421h = 1.0f;
            this.f19422i = 1.0f;
            this.k = 255;
            this.f19423l = 0.0f;
            this.m = 0.0f;
            this.f19424n = 0;
            this.o = 0;
            this.f19425p = 0;
            this.q = Paint.Style.FILL_AND_STROKE;
            this.f19417a = materialShapeDrawableState.f19417a;
            this.f19418b = materialShapeDrawableState.f19418b;
            this.j = materialShapeDrawableState.j;
            this.f19419c = materialShapeDrawableState.f19419c;
            this.d = materialShapeDrawableState.d;
            this.f = materialShapeDrawableState.f;
            this.f19420e = materialShapeDrawableState.f19420e;
            this.k = materialShapeDrawableState.k;
            this.f19421h = materialShapeDrawableState.f19421h;
            this.f19425p = materialShapeDrawableState.f19425p;
            this.f19424n = materialShapeDrawableState.f19424n;
            this.f19422i = materialShapeDrawableState.f19422i;
            this.f19423l = materialShapeDrawableState.f19423l;
            this.m = materialShapeDrawableState.m;
            this.o = materialShapeDrawableState.o;
            this.q = materialShapeDrawableState.q;
            if (materialShapeDrawableState.g != null) {
                this.g = new Rect(materialShapeDrawableState.g);
            }
        }
    }
}
