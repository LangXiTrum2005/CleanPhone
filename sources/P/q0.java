package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f47764i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f47765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f47767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f47768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f47770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f47772h;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public q0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.storage.androidcleaner.R.attr.spinnerStyle);
        this.f47772h = new Rect();
        n2.a(getContext(), this);
        int[] iArr = j.a.f43536u;
        g9.k kVarZ = g9.k.z(context, attributeSet, iArr, com.storage.androidcleaner.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        this.f47765a = new o(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f47766b = new n.c(context, resourceId);
        } else {
            this.f47766b = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f47764i, com.storage.androidcleaner.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    typedArray2 = typedArrayObtainStyledAttributes;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i10 != 0) {
                    j0 j0Var = new j0(this);
                    this.f47770f = j0Var;
                    j0Var.f47694c = typedArray.getString(2);
                } else if (i10 == 1) {
                    n0 n0Var = new n0(this, this.f47766b, attributeSet);
                    g9.k kVarZ2 = g9.k.z(this.f47766b, attributeSet, iArr, com.storage.androidcleaner.R.attr.spinnerStyle);
                    this.f47771g = ((TypedArray) kVarZ2.f41771c).getLayoutDimension(3, -2);
                    n0Var.m(kVarZ2.s(1));
                    n0Var.f47728z = typedArray.getString(2);
                    kVarZ2.B();
                    this.f47770f = n0Var;
                    this.f47767c = new h0(this, this, n0Var);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.storage.androidcleaner.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                kVarZ.B();
                this.f47769e = true;
                spinnerAdapter = this.f47768d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f47768d = null;
                }
                this.f47765a.d(attributeSet, com.storage.androidcleaner.R.attr.spinnerStyle);
            }
        } catch (Exception e11) {
            e = e11;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0) {
            j0 j0Var2 = new j0(this);
            this.f47770f = j0Var2;
            j0Var2.f47694c = typedArray.getString(2);
        } else if (i10 == 1) {
            n0 n0Var2 = new n0(this, this.f47766b, attributeSet);
            g9.k kVarZ3 = g9.k.z(this.f47766b, attributeSet, iArr, com.storage.androidcleaner.R.attr.spinnerStyle);
            this.f47771g = ((TypedArray) kVarZ3.f41771c).getLayoutDimension(3, -2);
            n0Var2.m(kVarZ3.s(1));
            n0Var2.f47728z = typedArray.getString(2);
            kVarZ3.B();
            this.f47770f = n0Var2;
            this.f47767c = new h0(this, this, n0Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.storage.androidcleaner.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        kVarZ.B();
        this.f47769e = true;
        spinnerAdapter = this.f47768d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f47768d = null;
        }
        this.f47765a.d(attributeSet, com.storage.androidcleaner.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f47772h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f47765a;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        p0 p0Var = this.f47770f;
        return p0Var != null ? p0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        p0 p0Var = this.f47770f;
        return p0Var != null ? p0Var.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f47770f != null ? this.f47771g : super.getDropDownWidth();
    }

    public final p0 getInternalPopup() {
        return this.f47770f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        p0 p0Var = this.f47770f;
        return p0Var != null ? p0Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f47766b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        p0 p0Var = this.f47770f;
        return p0Var != null ? p0Var.d() : super.getPrompt();
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f47765a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f47765a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0 p0Var = this.f47770f;
        if (p0Var == null || !p0Var.a()) {
            return;
        }
        p0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f47770f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.getSuperState());
        if (!o0Var.f47753a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new o.d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        o0 o0Var = new o0(super.onSaveInstanceState());
        p0 p0Var = this.f47770f;
        o0Var.f47753a = p0Var != null && p0Var.a();
        return o0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f47767c;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        p0 p0Var = this.f47770f;
        if (p0Var == null) {
            return super.performClick();
        }
        if (p0Var.a()) {
            return true;
        }
        p0Var.i(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f47765a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        o oVar = this.f47765a;
        if (oVar != null) {
            oVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        p0 p0Var = this.f47770f;
        if (p0Var == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            p0Var.h(i10);
            p0Var.c(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        p0 p0Var = this.f47770f;
        if (p0Var != null) {
            p0Var.g(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f47770f != null) {
            this.f47771g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p0 p0Var = this.f47770f;
        if (p0Var != null) {
            p0Var.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(com.google.android.gms.internal.auth.o.i(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        p0 p0Var = this.f47770f;
        if (p0Var != null) {
            p0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f47765a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f47765a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f47769e) {
            this.f47768d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p0 p0Var = this.f47770f;
        if (p0Var != null) {
            Context context = this.f47766b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            k0 k0Var = new k0();
            k0Var.f47708a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                k0Var.f47709b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                i0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            p0Var.k(k0Var);
        }
    }
}
