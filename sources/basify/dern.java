package basify;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: compiled from: EmojiInputConnection.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern extends InputConnectionWrapper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TextView f14949attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f14950saneness;

    /* JADX INFO: compiled from: EmojiInputConnection.java */
    public static class attabal {
        public boolean attabal(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return androidx.emoji2.text.dern.beachfront(inputConnection, editable, i, i2, z);
        }

        public void saneness(EditorInfo editorInfo) {
            if (androidx.emoji2.text.dern.taiyuan()) {
                androidx.emoji2.text.dern.dern().dovishness(editorInfo);
            }
        }
    }

    public dern(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new attabal());
    }

    public final Editable attabal() {
        return this.f14949attabal.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f14950saneness.attabal(this, attabal(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f14950saneness.attabal(this, attabal(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public dern(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, attabal attabalVar) {
        super(inputConnection, false);
        this.f14949attabal = textView;
        this.f14950saneness = attabalVar;
        attabalVar.saneness(editorInfo);
    }
}
