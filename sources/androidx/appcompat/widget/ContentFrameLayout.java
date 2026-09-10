package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.v;
import m0.w0;
import o.m;
import p.d1;
import p.e1;
import p.f;
import p.j;
import p.x2;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f3934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f3935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f3936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f3937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f3938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f3939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f3940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f3941h;

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3940g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3938e == null) {
            this.f3938e = new TypedValue();
        }
        return this.f3938e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3939f == null) {
            this.f3939f = new TypedValue();
        }
        return this.f3939f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3936c == null) {
            this.f3936c = new TypedValue();
        }
        return this.f3936c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3937d == null) {
            this.f3937d = new TypedValue();
        }
        return this.f3937d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3934a == null) {
            this.f3934a = new TypedValue();
        }
        return this.f3934a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3935b == null) {
            this.f3935b = new TypedValue();
        }
        return this.f3935b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d1 d1Var = this.f3941h;
        if (d1Var != null) {
            d1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        d1 d1Var = this.f3941h;
        if (d1Var != null) {
            v vVar = (v) ((i) d1Var).f50111a;
            e1 e1Var = vVar.f44178r;
            if (e1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) e1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((x2) actionBarOverlayLayout.f3898e).f47854a.f3970a;
                if (actionMenuView != null && (jVar = actionMenuView.f3923t) != null) {
                    jVar.j();
                    f fVar = jVar.f47688t;
                    if (fVar != null && fVar.b()) {
                        fVar.f47029i.dismiss();
                    }
                }
            }
            if (vVar.f44183w != null) {
                vVar.l.getDecorView().removeCallbacks(vVar.f44184x);
                if (vVar.f44183w.isShowing()) {
                    try {
                        vVar.f44183w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f44183w = null;
            }
            w0 w0Var = vVar.f44185y;
            if (w0Var != null) {
                w0Var.b();
            }
            m mVar = vVar.y(0).f44154h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f3940g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f3937d : this.f3936c;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                iMakeMeasureSpec = i10;
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        iMakeMeasureSpec = i10;
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    iMakeMeasureSpec = i10;
                    z10 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i11;
        } else {
            TypedValue typedValue2 = z12 ? this.f3938e : this.f3939f;
            if (typedValue2 == null || (i14 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i11;
            } else {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i11;
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i11;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f3935b : this.f3934a;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        i13 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    i13 -= rect.left + rect.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(d1 d1Var) {
        this.f3941h = d1Var;
    }
}
