package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* JADX INFO: loaded from: classes.dex */
public final class CompoundButtonCompat {

    public static class Api21Impl {
        public static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        public static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    public static class Api23Impl {
        public static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        return Api23Impl.a(compoundButton);
    }

    public static ColorStateList b(MaterialRadioButton materialRadioButton) {
        return Api21Impl.a(materialRadioButton);
    }

    public static PorterDuff.Mode c(MaterialCheckBox materialCheckBox) {
        return Api21Impl.b(materialCheckBox);
    }

    public static void d(CompoundButton compoundButton, ColorStateList colorStateList) {
        Api21Impl.c(compoundButton, colorStateList);
    }

    public static void e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        Api21Impl.d(compoundButton, mode);
    }
}
