package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: CompoundButtonCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: compiled from: CompoundButtonCompat.java */
    public static class attabal {
        public static ColorStateList attabal(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        public static void dern(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        public static PorterDuff.Mode saneness(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        public static void wireman(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: compiled from: CompoundButtonCompat.java */
    public static class saneness {
        public static Drawable attabal(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable attabal(CompoundButton compoundButton) {
        return saneness.attabal(compoundButton);
    }

    public static PorterDuff.Mode dern(CompoundButton compoundButton) {
        return attabal.saneness(compoundButton);
    }

    public static void marial(CompoundButton compoundButton, PorterDuff.Mode mode) {
        attabal.wireman(compoundButton, mode);
    }

    public static ColorStateList saneness(CompoundButton compoundButton) {
        return attabal.attabal(compoundButton);
    }

    public static void wireman(CompoundButton compoundButton, ColorStateList colorStateList) {
        attabal.dern(compoundButton, colorStateList);
    }
}
