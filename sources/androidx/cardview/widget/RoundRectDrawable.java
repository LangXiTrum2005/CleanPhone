package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class RoundRectDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f3727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f3728c;
    public final Rect d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3729e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f3730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f3731i;
    public ColorStateList j;
    public boolean f = false;
    public boolean g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public RoundRectDrawable(ColorStateList colorStateList, float f) {
        this.f3726a = f;
        Paint paint = new Paint(5);
        this.f3727b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f3730h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f3730h.getDefaultColor()));
        this.f3728c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f3728c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f) {
            rect2.inset((int) Math.ceil(RoundRectDrawableWithShadow.a(this.f3729e, this.f3726a, this.g)), (int) Math.ceil(RoundRectDrawableWithShadow.b(this.f3729e, this.f3726a, this.g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f3727b;
        if (this.f3731i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f3731i);
            z2 = true;
        }
        RectF rectF = this.f3728c;
        float f = this.f3726a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f3726a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f3730h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3730h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f3727b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z2;
        }
        this.f3731i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f3727b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3727b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f3731i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f3731i = a(this.j, mode);
        invalidateSelf();
    }
}
