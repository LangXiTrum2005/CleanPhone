package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f47872d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f47873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f47874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f47875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.storage.androidcleaner.R.attr.autoCompleteTextViewStyle);
        o2.a(context);
        n2.a(getContext(), this);
        g9.k kVarZ = g9.k.z(getContext(), attributeSet, f47872d, com.storage.androidcleaner.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) kVarZ.f41771c).hasValue(0)) {
            setDropDownBackgroundDrawable(kVarZ.s(0));
        }
        kVarZ.B();
        o oVar = new o(this);
        this.f47873a = oVar;
        oVar.d(attributeSet, com.storage.androidcleaner.R.attr.autoCompleteTextViewStyle);
        u0 u0Var = new u0(this);
        this.f47874b = u0Var;
        u0Var.f(attributeSet, com.storage.androidcleaner.R.attr.autoCompleteTextViewStyle);
        u0Var.b();
        b0 b0Var = new b0(this);
        this.f47875c = b0Var;
        b0Var.e(attributeSet, com.storage.androidcleaner.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerD = b0Var.d(keyListener);
        if (keyListenerD == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerD);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f47873a;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f47874b;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f47873a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f47873a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f47874b.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f47874b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        qk.i0.U(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f47875c.f(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f47873a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        o oVar = this.f47873a;
        if (oVar != null) {
            oVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f47874b;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f47874b;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(com.google.android.gms.internal.auth.o.i(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f47875c.g(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f47875c.d(keyListener));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f47873a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f47873a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        u0 u0Var = this.f47874b;
        u0Var.h(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        u0 u0Var = this.f47874b;
        u0Var.i(mode);
        u0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        u0 u0Var = this.f47874b;
        if (u0Var != null) {
            u0Var.g(context, i10);
        }
    }
}
