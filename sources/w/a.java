package w;

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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f52722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f52723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f52724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f52725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f52726e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f52729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f52730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f52731j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52727f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52728g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f52732k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f10) {
        this.f52722a = f10;
        Paint paint = new Paint(5);
        this.f52723b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f52729h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f52729h.getDefaultColor()));
        this.f52724c = new RectF();
        this.f52725d = new Rect();
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
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        RectF rectF = this.f52724c;
        rectF.set(f10, f11, f12, f13);
        Rect rect2 = this.f52725d;
        rect2.set(rect);
        if (this.f52727f) {
            rect2.inset((int) Math.ceil(b.a(this.f52726e, this.f52722a, this.f52728g)), (int) Math.ceil(b.b(this.f52726e, this.f52722a, this.f52728g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f52730i;
        Paint paint = this.f52723b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f52730i);
            z10 = true;
        }
        RectF rectF = this.f52724c;
        float f10 = this.f52722a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f52725d, this.f52722a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f52731j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f52729h;
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
        ColorStateList colorStateList = this.f52729h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f52723b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f52731j;
        if (colorStateList2 == null || (mode = this.f52732k) == null) {
            return z10;
        }
        this.f52730i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f52723b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f52723b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f52731j = colorStateList;
        this.f52730i = a(colorStateList, this.f52732k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f52732k = mode;
        this.f52730i = a(this.f52731j, mode);
        invalidateSelf();
    }
}
