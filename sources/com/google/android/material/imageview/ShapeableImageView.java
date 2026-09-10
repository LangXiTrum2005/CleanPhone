package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    public final ShapeAppearancePathProvider e0;
    public final RectF f0;
    public final RectF g0;
    public final Paint h0;
    public final Paint i0;
    public final Path j0;
    public ColorStateList k0;
    public MaterialShapeDrawable l0;
    public ShapeAppearanceModel m0;
    public float n0;
    public final Path o0;
    public final int p0;
    public final int q0;
    public final int r0;
    public final int s0;
    public final int t0;
    public final int u0;
    public boolean v0;

    public class OutlineProvider extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f19304a = new Rect();

        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.m0 == null) {
                return;
            }
            if (shapeableImageView.l0 == null) {
                shapeableImageView.l0 = new MaterialShapeDrawable(shapeableImageView.m0);
            }
            RectF rectF = shapeableImageView.f0;
            Rect rect = this.f19304a;
            rectF.round(rect);
            shapeableImageView.l0.setBounds(rect);
            shapeableImageView.l0.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        super(MaterialThemeOverlay.a(context, null, 0, R.style.Widget_MaterialComponents_ShapeableImageView), null, 0);
        this.e0 = ShapeAppearancePathProvider.b();
        this.j0 = new Path();
        this.v0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.i0 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.o0 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, com.google.android.material.R.styleable.C, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.k0 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 9);
        this.n0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.p0 = dimensionPixelSize;
        this.q0 = dimensionPixelSize;
        this.r0 = dimensionPixelSize;
        this.s0 = dimensionPixelSize;
        this.p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.h0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.m0 = ShapeAppearanceModel.c(context2, null, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new OutlineProvider());
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i2, int i3) {
        RectF rectF = this.f0;
        rectF.set(getPaddingLeft(), getPaddingTop(), i2 - getPaddingRight(), i3 - getPaddingBottom());
        ShapeAppearanceModel shapeAppearanceModel = this.m0;
        Path path = this.j0;
        this.e0.a(shapeAppearanceModel, 1.0f, rectF, null, path);
        Path path2 = this.o0;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.g0;
        rectF2.set(0.0f, 0.0f, i2, i3);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.s0;
    }

    public final int getContentPaddingEnd() {
        int i2 = this.u0;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return c() ? this.p0 : this.r0;
    }

    public int getContentPaddingLeft() {
        int i2;
        int i3;
        if (this.t0 != Integer.MIN_VALUE || this.u0 != Integer.MIN_VALUE) {
            if (c() && (i3 = this.u0) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!c() && (i2 = this.t0) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.p0;
    }

    public int getContentPaddingRight() {
        int i2;
        int i3;
        if (this.t0 != Integer.MIN_VALUE || this.u0 != Integer.MIN_VALUE) {
            if (c() && (i3 = this.t0) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!c() && (i2 = this.u0) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.r0;
    }

    public final int getContentPaddingStart() {
        int i2 = this.t0;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return c() ? this.r0 : this.p0;
    }

    public int getContentPaddingTop() {
        return this.q0;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.m0;
    }

    public ColorStateList getStrokeColor() {
        return this.k0;
    }

    public float getStrokeWidth() {
        return this.n0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.o0, this.i0);
        if (this.k0 == null) {
            return;
        }
        Paint paint = this.h0;
        paint.setStrokeWidth(this.n0);
        int colorForState = this.k0.getColorForState(getDrawableState(), this.k0.getDefaultColor());
        if (this.n0 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.j0, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.v0 && isLayoutDirectionResolved()) {
            this.v0 = true;
            if (!isPaddingRelative() && this.t0 == Integer.MIN_VALUE && this.u0 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        d(i2, i3);
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(getContentPaddingLeft() + i2, getContentPaddingTop() + i3, getContentPaddingRight() + i4, getContentPaddingBottom() + i5);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(getContentPaddingStart() + i2, getContentPaddingTop() + i3, getContentPaddingEnd() + i4, getContentPaddingBottom() + i5);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.m0 = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.l0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i2) {
        setStrokeColor(ContextCompat.getColorStateList(getContext(), i2));
    }

    public void setStrokeWidth(float f) {
        if (this.n0 != f) {
            this.n0 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i2) {
        setStrokeWidth(getResources().getDimensionPixelSize(i2));
    }
}
