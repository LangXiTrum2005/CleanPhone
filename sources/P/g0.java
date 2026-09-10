package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f47648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f47649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f47650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f47651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47653j;

    public g0(f0 f0Var) {
        super(f0Var);
        this.f47650g = null;
        this.f47651h = null;
        this.f47652i = false;
        this.f47653j = false;
        this.f47648e = f0Var;
    }

    @Override // p.b0
    public final void e(AttributeSet attributeSet, int i10) {
        super.e(attributeSet, R.attr.seekBarStyle);
        f0 f0Var = this.f47648e;
        Context context = f0Var.getContext();
        int[] iArr = j.a.f43523g;
        g9.k kVarZ = g9.k.z(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        Context context2 = f0Var.getContext();
        TypedArray typedArray2 = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        m0.p0.b(f0Var, context2, iArr, attributeSet, typedArray2, R.attr.seekBarStyle, 0);
        Drawable drawableT = kVarZ.t(0);
        if (drawableT != null) {
            f0Var.setThumb(drawableT);
        }
        Drawable drawableS = kVarZ.s(1);
        Drawable drawable = this.f47649f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f47649f = drawableS;
        if (drawableS != null) {
            drawableS.setCallback(f0Var);
            drawableS.setLayoutDirection(f0Var.getLayoutDirection());
            if (drawableS.isStateful()) {
                drawableS.setState(f0Var.getDrawableState());
            }
            i();
        }
        f0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f47651h = h1.c(typedArray.getInt(3, -1), this.f47651h);
            this.f47653j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f47650g = kVarZ.q(2);
            this.f47652i = true;
        }
        kVarZ.B();
        i();
    }

    public final void i() {
        Drawable drawable = this.f47649f;
        if (drawable != null) {
            if (this.f47652i || this.f47653j) {
                Drawable drawableMutate = drawable.mutate();
                this.f47649f = drawableMutate;
                if (this.f47652i) {
                    drawableMutate.setTintList(this.f47650g);
                }
                if (this.f47653j) {
                    this.f47649f.setTintMode(this.f47651h);
                }
                if (this.f47649f.isStateful()) {
                    this.f47649f.setState(this.f47648e.getDrawableState());
                }
            }
        }
    }

    public final void j(Canvas canvas) {
        if (this.f47649f != null) {
            f0 f0Var = this.f47648e;
            int max = f0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f47649f.getIntrinsicWidth();
                int intrinsicHeight = this.f47649f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f47649f.setBounds(-i10, -i11, i10, i11);
                float width = ((f0Var.getWidth() - f0Var.getPaddingLeft()) - f0Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(f0Var.getPaddingLeft(), f0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f47649f.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
