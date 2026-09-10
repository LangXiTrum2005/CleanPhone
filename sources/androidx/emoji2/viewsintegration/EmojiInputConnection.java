package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: loaded from: classes.dex */
final class EmojiInputConnection extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f5028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmojiCompatDeleteHelper f5029b;

    public static class EmojiCompatDeleteHelper {
    }

    public EmojiInputConnection(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        EmojiCompatDeleteHelper emojiCompatDeleteHelper = new EmojiCompatDeleteHelper();
        super(inputConnection, false);
        this.f5028a = editText;
        this.f5029b = emojiCompatDeleteHelper;
        if (EmojiCompat.j != null) {
            EmojiCompat.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f5028a.getEditableText();
        this.f5029b.getClass();
        return EmojiCompat.c(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f5028a.getEditableText();
        this.f5029b.getClass();
        return EmojiCompat.c(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
