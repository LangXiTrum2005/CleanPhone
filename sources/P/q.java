package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f47760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f47761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f47762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f47763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        o2.a(context);
        n2.a(getContext(), this);
        s sVar = new s(this);
        this.f47760a = sVar;
        sVar.c(attributeSet, R.attr.checkboxStyle);
        o oVar = new o(this);
        this.f47761b = oVar;
        oVar.d(attributeSet, R.attr.checkboxStyle);
        u0 u0Var = new u0(this);
        this.f47762c = u0Var;
        u0Var.f(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.checkboxStyle);
    }

    @NonNull
    private w getEmojiTextViewHelper() {
        if (this.f47763d == null) {
            this.f47763d = new w(this);
        }
        return this.f47763d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f47761b;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f47762c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f47761b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f47761b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportButtonTintList() {
        s sVar = this.f47760a;
        if (sVar != null) {
            return (ColorStateList) sVar.f47788a;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportButtonTintMode() {
        s sVar = this.f47760a;
        if (sVar != null) {
            return (PorterDuff.Mode) sVar.f47789b;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f47762c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f47762c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f47761b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        o oVar = this.f47761b;
        if (oVar != null) {
            oVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        s sVar = this.f47760a;
        if (sVar != null) {
            if (sVar.f47792e) {
                sVar.f47792e = false;
            } else {
                sVar.f47792e = true;
                sVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f47762c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f47762c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f47761b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f47761b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        s sVar = this.f47760a;
        if (sVar != null) {
            sVar.f47788a = colorStateList;
            sVar.f47790c = true;
            sVar.a();
        }
    }

    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        s sVar = this.f47760a;
        if (sVar != null) {
            sVar.f47789b = mode;
            sVar.f47791d = true;
            sVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        u0 u0Var = this.f47762c;
        u0Var.h(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        u0 u0Var = this.f47762c;
        u0Var.i(mode);
        u0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(com.google.android.gms.internal.auth.o.i(getContext(), i10));
    }
}
