package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
class AppCompatBackgroundHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3542a;
    public TintInfo d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TintInfo f3545e;
    public TintInfo f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3544c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatDrawableManager f3543b = AppCompatDrawableManager.a();

    public AppCompatBackgroundHelper(View view) {
        this.f3542a = view;
    }

    public final void a() {
        View view = this.f3542a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new TintInfo();
                }
                TintInfo tintInfo = this.f;
                tintInfo.f3642a = null;
                tintInfo.d = false;
                tintInfo.f3643b = null;
                tintInfo.f3644c = false;
                ColorStateList colorStateListI = ViewCompat.i(view);
                if (colorStateListI != null) {
                    tintInfo.d = true;
                    tintInfo.f3642a = colorStateListI;
                }
                PorterDuff.Mode modeJ = ViewCompat.j(view);
                if (modeJ != null) {
                    tintInfo.f3644c = true;
                    tintInfo.f3643b = modeJ;
                }
                if (tintInfo.d || tintInfo.f3644c) {
                    AppCompatDrawableManager.e(background, tintInfo, view.getDrawableState());
                    return;
                }
            }
            TintInfo tintInfo2 = this.f3545e;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.e(background, tintInfo2, view.getDrawableState());
                return;
            }
            TintInfo tintInfo3 = this.d;
            if (tintInfo3 != null) {
                AppCompatDrawableManager.e(background, tintInfo3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        TintInfo tintInfo = this.f3545e;
        if (tintInfo != null) {
            return tintInfo.f3642a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        TintInfo tintInfo = this.f3545e;
        if (tintInfo != null) {
            return tintInfo.f3643b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListG;
        View view = this.f3542a;
        Context context = view.getContext();
        int[] iArr = R.styleable.f3275A;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i2);
        TypedArray typedArray = tintTypedArrayE.f3646b;
        View view2 = this.f3542a;
        ViewCompat.y(view2, view2.getContext(), iArr, attributeSet, tintTypedArrayE.f3646b, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f3544c = typedArray.getResourceId(0, -1);
                AppCompatDrawableManager appCompatDrawableManager = this.f3543b;
                Context context2 = view.getContext();
                int i3 = this.f3544c;
                synchronized (appCompatDrawableManager) {
                    colorStateListG = appCompatDrawableManager.f3556a.g(context2, i3);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                ViewCompat.C(view, tintTypedArrayE.a(1));
            }
            if (typedArray.hasValue(2)) {
                ViewCompat.D(view, DrawableUtils.c(typedArray.getInt(2, -1), null));
            }
            tintTypedArrayE.f();
        } catch (Throwable th) {
            tintTypedArrayE.f();
            throw th;
        }
    }

    public final void e() {
        this.f3544c = -1;
        g(null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateListG;
        this.f3544c = i2;
        AppCompatDrawableManager appCompatDrawableManager = this.f3543b;
        if (appCompatDrawableManager != null) {
            Context context = this.f3542a.getContext();
            synchronized (appCompatDrawableManager) {
                colorStateListG = appCompatDrawableManager.f3556a.g(context, i2);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new TintInfo();
            }
            TintInfo tintInfo = this.d;
            tintInfo.f3642a = colorStateList;
            tintInfo.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3545e == null) {
            this.f3545e = new TintInfo();
        }
        TintInfo tintInfo = this.f3545e;
        tintInfo.f3642a = colorStateList;
        tintInfo.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3545e == null) {
            this.f3545e = new TintInfo();
        }
        TintInfo tintInfo = this.f3545e;
        tintInfo.f3643b = mode;
        tintInfo.f3644c = true;
        a();
    }
}
