package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class EmojiTextWatcher implements TextWatcher {
    public final EditText X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public EmojiCompat.InitCallback f5040Y;
    public boolean Z = true;

    public static class InitCallbackImpl extends EmojiCompat.InitCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f5041a;

        public InitCallbackImpl(EditText editText) {
            this.f5041a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() {
            EmojiTextWatcher.a((EditText) this.f5041a.get(), 1);
        }
    }

    public EmojiTextWatcher(EditText editText) {
        this.X = editText;
    }

    public static void a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat emojiCompatA = EmojiCompat.a();
            if (editableText == null) {
                length = 0;
            } else {
                emojiCompatA.getClass();
                length = editableText.length();
            }
            emojiCompatA.g(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.X;
        if (editText.isInEditMode() || !this.Z || EmojiCompat.j == null || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = EmojiCompat.a().b();
        if (iB != 0) {
            if (iB == 1) {
                EmojiCompat.a().g((Spannable) charSequence, i2, i4 + i2);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        EmojiCompat emojiCompatA = EmojiCompat.a();
        if (this.f5040Y == null) {
            this.f5040Y = new InitCallbackImpl(editText);
        }
        emojiCompatA.h(this.f5040Y);
    }
}
