package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: CheckedTextViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: compiled from: CheckedTextViewCompat.java */
    public static class attabal {
        public static void attabal(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void saneness(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @Deprecated
    public static Drawable attabal(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    public static void dern(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        attabal.saneness(checkedTextView, mode);
    }

    public static void saneness(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        attabal.attabal(checkedTextView, colorStateList);
    }
}
