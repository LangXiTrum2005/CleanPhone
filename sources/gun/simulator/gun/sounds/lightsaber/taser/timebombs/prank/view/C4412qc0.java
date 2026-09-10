package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4412qc0 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4890a;
    public ColorFilter b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public PorterDuffColorFilter e;
    public C3939l9 f;
    public Drawable g;
    public int h;

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        this.g.setAlpha(this.f4890a);
        ColorFilter colorFilter = this.b;
        if (colorFilter == null) {
            colorFilter = this.e;
        }
        if (colorFilter != null) {
            this.g.setColorFilter(colorFilter);
        }
        int intrinsicHeight = this.g.getIntrinsicHeight();
        float f = iHeight / intrinsicHeight;
        canvas.scale(f, f);
        float f2 = iWidth / f;
        int i = this.h;
        if (i < 0) {
            int intrinsicWidth = this.g.getIntrinsicWidth();
            int i2 = 0;
            while (i2 < f2) {
                int i3 = i2 + intrinsicWidth;
                this.g.setBounds(i2, 0, i3, intrinsicHeight);
                this.g.draw(canvas);
                i2 = i3;
            }
        } else {
            float f3 = f2 / i;
            for (int i4 = 0; i4 < this.h; i4++) {
                float f4 = (i4 + 0.5f) * f3;
                float intrinsicWidth2 = this.g.getIntrinsicWidth() / 2.0f;
                this.g.setBounds(Math.round(f4 - intrinsicWidth2), 0, Math.round(f4 + intrinsicWidth2), intrinsicHeight);
                this.g.draw(canvas);
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean isStateful() {
        ColorStateList colorStateList = this.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setAlpha(int i) {
        if (this.f4890a != i) {
            this.f4890a = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b = colorFilter;
        invalidateSelf();
    }

    public final void e(int i) {
        this.h = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setTintList(ColorStateList colorStateList) {
        this.c = colorStateList;
        if (i()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4890a;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setTintMode(PorterDuff.Mode mode) {
        this.d = mode;
        if (i()) {
            invalidateSelf();
        }
    }

    public final boolean i() {
        ColorStateList colorStateList = this.c;
        boolean z = true;
        if (colorStateList == null || this.d == null) {
            z = this.e != null;
            this.e = null;
        } else {
            this.e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.d);
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.g = this.g.mutate();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return i();
    }
}
