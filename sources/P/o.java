package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47747a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l7.z f47750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l7.z f47751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l7.z f47752f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47749c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f47748b = t.a();

    public o(View view) {
        this.f47747a = view;
    }

    public final void a() {
        View view = this.f47747a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f47750d != null) {
                if (this.f47752f == null) {
                    this.f47752f = new l7.z();
                }
                l7.z zVar = this.f47752f;
                zVar.f45238c = null;
                zVar.f45237b = false;
                zVar.f45239d = null;
                zVar.f45236a = false;
                WeakHashMap weakHashMap = m0.s0.f45746a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    zVar.f45237b = true;
                    zVar.f45238c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    zVar.f45236a = true;
                    zVar.f45239d = backgroundTintMode;
                }
                if (zVar.f45237b || zVar.f45236a) {
                    t.d(background, zVar, view.getDrawableState());
                    return;
                }
            }
            l7.z zVar2 = this.f47751e;
            if (zVar2 != null) {
                t.d(background, zVar2, view.getDrawableState());
                return;
            }
            l7.z zVar3 = this.f47750d;
            if (zVar3 != null) {
                t.d(background, zVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        l7.z zVar = this.f47751e;
        if (zVar != null) {
            return (ColorStateList) zVar.f45238c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        l7.z zVar = this.f47751e;
        if (zVar != null) {
            return (PorterDuff.Mode) zVar.f45239d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListF;
        View view = this.f47747a;
        Context context = view.getContext();
        int[] iArr = j.a.f43541z;
        g9.k kVarZ = g9.k.z(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        View view2 = this.f47747a;
        Context context2 = view2.getContext();
        TypedArray typedArray2 = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        m0.p0.b(view2, context2, iArr, attributeSet, typedArray2, i10, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f47749c = typedArray.getResourceId(0, -1);
                t tVar = this.f47748b;
                Context context3 = view.getContext();
                int i11 = this.f47749c;
                synchronized (tVar) {
                    colorStateListF = tVar.f47813a.f(context3, i11);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(kVarZ.q(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(h1.c(typedArray.getInt(2, -1), null));
            }
            kVarZ.B();
        } catch (Throwable th2) {
            kVarZ.B();
            throw th2;
        }
    }

    public final void e() {
        this.f47749c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateListF;
        this.f47749c = i10;
        t tVar = this.f47748b;
        if (tVar != null) {
            Context context = this.f47747a.getContext();
            synchronized (tVar) {
                colorStateListF = tVar.f47813a.f(context, i10);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f47750d == null) {
                this.f47750d = new l7.z();
            }
            l7.z zVar = this.f47750d;
            zVar.f45238c = colorStateList;
            zVar.f45237b = true;
        } else {
            this.f47750d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f47751e == null) {
            this.f47751e = new l7.z();
        }
        l7.z zVar = this.f47751e;
        zVar.f45238c = colorStateList;
        zVar.f45237b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f47751e == null) {
            this.f47751e = new l7.z();
        }
        l7.z zVar = this.f47751e;
        zVar.f45239d = mode;
        zVar.f45236a = true;
        a();
    }
}
