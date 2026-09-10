package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes4.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19531e;
    public EditText f;
    public final a g;

    public PasswordToggleEndIconDelegate(EndCompoundLayout endCompoundLayout, int i2) {
        super(endCompoundLayout);
        this.f19531e = R.drawable.design_password_eye;
        this.g = new a(this, 2);
        if (i2 != 0) {
            this.f19531e = i2;
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void b() {
        q();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return this.f19531e;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean k() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
