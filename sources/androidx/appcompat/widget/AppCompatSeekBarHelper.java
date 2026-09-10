package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    public final AppCompatSeekBar d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f3572e;
    public ColorStateList f;
    public PorterDuff.Mode g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3574i;

    public AppCompatSeekBarHelper(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f = null;
        this.g = null;
        this.f3573h = false;
        this.f3574i = false;
        this.d = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public final void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, R.attr.seekBarStyle);
        AppCompatSeekBar appCompatSeekBar = this.d;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = androidx.appcompat.R.styleable.g;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, R.attr.seekBarStyle);
        ViewCompat.y(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, tintTypedArrayE.f3646b, R.attr.seekBarStyle);
        Drawable drawableC = tintTypedArrayE.c(0);
        if (drawableC != null) {
            appCompatSeekBar.setThumb(drawableC);
        }
        Drawable drawableB = tintTypedArrayE.b(1);
        Drawable drawable = this.f3572e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3572e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(appCompatSeekBar);
            DrawableCompat.h(drawableB, appCompatSeekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(appCompatSeekBar.getDrawableState());
            }
            c();
        }
        appCompatSeekBar.invalidate();
        TypedArray typedArray = tintTypedArrayE.f3646b;
        if (typedArray.hasValue(3)) {
            this.g = DrawableUtils.c(typedArray.getInt(3, -1), this.g);
            this.f3574i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = tintTypedArrayE.a(2);
            this.f3573h = true;
        }
        tintTypedArrayE.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.f3572e;
        if (drawable != null) {
            if (this.f3573h || this.f3574i) {
                Drawable drawableMutate = drawable.mutate();
                this.f3572e = drawableMutate;
                if (this.f3573h) {
                    DrawableCompat.j(drawableMutate, this.f);
                }
                if (this.f3574i) {
                    DrawableCompat.k(this.f3572e, this.g);
                }
                if (this.f3572e.isStateful()) {
                    this.f3572e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f3572e != null) {
            AppCompatSeekBar appCompatSeekBar = this.d;
            int max = appCompatSeekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3572e.getIntrinsicWidth();
                int intrinsicHeight = this.f3572e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3572e.setBounds(-i2, -i3, i2, i3);
                float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f3572e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
