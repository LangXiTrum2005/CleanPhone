package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.storage.androidcleaner.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f47784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f47785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f47786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f47787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        o2.a(context);
        n2.a(getContext(), this);
        u0 u0Var = new u0(this);
        this.f47786c = u0Var;
        u0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        u0Var.b();
        o oVar = new o(this);
        this.f47785b = oVar;
        oVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f47784a = new s(this);
        Context context2 = getContext();
        int[] iArr = j.a.l;
        g9.k kVarZ = g9.k.z(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        Context context3 = getContext();
        TypedArray typedArray2 = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        m0.p0.b(this, context3, iArr, attributeSet, typedArray2, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(com.google.android.gms.internal.auth.o.i(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(com.google.android.gms.internal.auth.o.i(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(com.google.android.gms.internal.auth.o.i(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(kVarZ.q(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(h1.c(typedArray.getInt(3, -1), null));
            }
            kVarZ.B();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th2) {
            kVarZ.B();
            throw th2;
        }
    }

    @NonNull
    private w getEmojiTextViewHelper() {
        if (this.f47787d == null) {
            this.f47787d = new w(this);
        }
        return this.f47787d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u0 u0Var = this.f47786c;
        if (u0Var != null) {
            u0Var.b();
        }
        o oVar = this.f47785b;
        if (oVar != null) {
            oVar.a();
        }
        s sVar = this.f47784a;
        if (sVar != null) {
            sVar.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f47785b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f47785b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCheckMarkTintList() {
        s sVar = this.f47784a;
        if (sVar != null) {
            return (ColorStateList) sVar.f47788a;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        s sVar = this.f47784a;
        if (sVar != null) {
            return (PorterDuff.Mode) sVar.f47789b;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f47786c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f47786c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        qk.i0.U(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f47785b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        o oVar = this.f47785b;
        if (oVar != null) {
            oVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        s sVar = this.f47784a;
        if (sVar != null) {
            if (sVar.f47792e) {
                sVar.f47792e = false;
            } else {
                sVar.f47792e = true;
                sVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f47786c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f47786c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f47785b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f47785b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        s sVar = this.f47784a;
        if (sVar != null) {
            sVar.f47788a = colorStateList;
            sVar.f47790c = true;
            sVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        s sVar = this.f47784a;
        if (sVar != null) {
            sVar.f47789b = mode;
            sVar.f47791d = true;
            sVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        u0 u0Var = this.f47786c;
        u0Var.h(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        u0 u0Var = this.f47786c;
        u0Var.i(mode);
        u0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        u0 u0Var = this.f47786c;
        if (u0Var != null) {
            u0Var.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(com.google.android.gms.internal.auth.o.i(getContext(), i10));
    }
}
