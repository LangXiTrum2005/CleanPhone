package basify;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiInputFilter.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman implements InputFilter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TextView f14957attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public androidx.emoji2.text.dern.beachfront f14958saneness;

    /* JADX INFO: compiled from: EmojiInputFilter.java */
    public static class attabal extends androidx.emoji2.text.dern.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Reference<TextView> f14959attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Reference<wireman> f14960saneness;

        public attabal(TextView textView, wireman wiremanVar) {
            this.f14959attabal = new WeakReference(textView);
            this.f14960saneness = new WeakReference(wiremanVar);
        }

        public final boolean dern(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.dern.beachfront
        public void saneness() {
            CharSequence text;
            CharSequence charSequenceArytenoidectomy;
            super.saneness();
            TextView textView = this.f14959attabal.get();
            if (dern(textView, this.f14960saneness.get()) && textView.isAttachedToWindow() && text != (charSequenceArytenoidectomy = androidx.emoji2.text.dern.dern().arytenoidectomy((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceArytenoidectomy);
                int selectionEnd = Selection.getSelectionEnd(charSequenceArytenoidectomy);
                textView.setText(charSequenceArytenoidectomy);
                if (charSequenceArytenoidectomy instanceof Spannable) {
                    wireman.saneness((Spannable) charSequenceArytenoidectomy, selectionStart, selectionEnd);
                }
            }
        }
    }

    public wireman(TextView textView) {
        this.f14957attabal = textView;
    }

    public static void saneness(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public final androidx.emoji2.text.dern.beachfront attabal() {
        if (this.f14958saneness == null) {
            this.f14958saneness = new attabal(this.f14957attabal, this);
        }
        return this.f14958saneness;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f14957attabal.isInEditMode()) {
            return charSequence;
        }
        int iMarial = androidx.emoji2.text.dern.dern().marial();
        if (iMarial != 0) {
            if (iMarial == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f14957attabal.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.dern.dern().monoploid(charSequence, 0, charSequence.length());
            }
            if (iMarial != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.dern.dern().graveside(attabal());
        return charSequence;
    }
}
