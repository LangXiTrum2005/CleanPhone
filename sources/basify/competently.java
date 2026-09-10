package basify;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiTextWatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently implements TextWatcher {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final boolean f14942arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final EditText f14944kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public androidx.emoji2.text.dern.beachfront f14946monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f14947polloi = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f14945molybdenite = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f14943graveside = true;

    /* JADX INFO: compiled from: EmojiTextWatcher.java */
    public static class attabal extends androidx.emoji2.text.dern.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Reference<EditText> f14948attabal;

        public attabal(EditText editText) {
            this.f14948attabal = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.dern.beachfront
        public void saneness() {
            super.saneness();
            competently.dern(this.f14948attabal.get(), 1);
        }
    }

    public competently(EditText editText, boolean z) {
        this.f14944kowloon = editText;
        this.f14942arytenoidectomy = z;
    }

    public static void dern(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.dern.dern().arytenoidectomy(editableText);
            wireman.saneness(editableText, selectionStart, selectionEnd);
        }
    }

    public final androidx.emoji2.text.dern.beachfront attabal() {
        if (this.f14946monoploid == null) {
            this.f14946monoploid = new attabal(this.f14944kowloon);
        }
        return this.f14946monoploid;
    }

    public final boolean marial() {
        if (this.f14943graveside) {
            return (this.f14942arytenoidectomy || androidx.emoji2.text.dern.taiyuan()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f14944kowloon.isInEditMode() || marial() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iMarial = androidx.emoji2.text.dern.dern().marial();
        if (iMarial != 0) {
            if (iMarial == 1) {
                androidx.emoji2.text.dern.dern().molybdenite((Spannable) charSequence, i, i + i3, this.f14947polloi, this.f14945molybdenite);
                return;
            } else if (iMarial != 3) {
                return;
            }
        }
        androidx.emoji2.text.dern.dern().graveside(attabal());
    }

    public boolean saneness() {
        return this.f14943graveside;
    }

    public void wireman(boolean z) {
        if (this.f14943graveside != z) {
            if (this.f14946monoploid != null) {
                androidx.emoji2.text.dern.dern().adultoid(this.f14946monoploid);
            }
            this.f14943graveside = z;
            if (z) {
                dern(this.f14944kowloon, androidx.emoji2.text.dern.dern().marial());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
