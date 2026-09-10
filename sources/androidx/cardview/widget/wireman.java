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

/* JADX INFO: compiled from: RoundRectDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends Drawable {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f5629attabal;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public ColorStateList f5632cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final RectF f5633dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public ColorStateList f5634impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f5635marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public PorterDuffColorFilter f5637taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Rect f5638wireman;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f5630beachfront = false;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f5631competently = true;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public PorterDuff.Mode f5628apical = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Paint f5636saneness = new Paint(5);

    public wireman(ColorStateList colorStateList, float f) {
        this.f5629attabal = f;
        marial(colorStateList);
        this.f5633dern = new RectF();
        this.f5638wireman = new Rect();
    }

    public final PorterDuffColorFilter attabal(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void beachfront(ColorStateList colorStateList) {
        marial(colorStateList);
        invalidateSelf();
    }

    public void competently(float f, boolean z, boolean z2) {
        if (f == this.f5635marial && this.f5630beachfront == z && this.f5631competently == z2) {
            return;
        }
        this.f5635marial = f;
        this.f5630beachfront = z;
        this.f5631competently = z2;
        taiyuan(null);
        invalidateSelf();
    }

    public float dern() {
        return this.f5635marial;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f5636saneness;
        if (this.f5637taiyuan == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5637taiyuan);
            z = true;
        }
        RectF rectF = this.f5633dern;
        float f = this.f5629attabal;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f5638wireman, this.f5629attabal);
    }

    public void impromptu(float f) {
        if (f == this.f5629attabal) {
            return;
        }
        this.f5629attabal = f;
        taiyuan(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f5632cutely;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f5634impromptu;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    public final void marial(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5634impromptu = colorStateList;
        this.f5636saneness.setColor(colorStateList.getColorForState(getState(), this.f5634impromptu.getDefaultColor()));
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        taiyuan(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f5634impromptu;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f5636saneness.getColor();
        if (z) {
            this.f5636saneness.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f5632cutely;
        if (colorStateList2 == null || (mode = this.f5628apical) == null) {
            return z;
        }
        this.f5637taiyuan = attabal(colorStateList2, mode);
        return true;
    }

    public ColorStateList saneness() {
        return this.f5634impromptu;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5636saneness.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5636saneness.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5632cutely = colorStateList;
        this.f5637taiyuan = attabal(colorStateList, this.f5628apical);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5628apical = mode;
        this.f5637taiyuan = attabal(this.f5632cutely, mode);
        invalidateSelf();
    }

    public final void taiyuan(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f5633dern.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f5638wireman.set(rect);
        if (this.f5630beachfront) {
            this.f5638wireman.inset((int) Math.ceil(marial.attabal(this.f5635marial, this.f5629attabal, this.f5631competently)), (int) Math.ceil(marial.saneness(this.f5635marial, this.f5629attabal, this.f5631competently)));
            this.f5633dern.set(this.f5638wireman);
        }
    }

    public float wireman() {
        return this.f5629attabal;
    }
}
