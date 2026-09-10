package basify;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import technofreak.cutely;

/* JADX INFO: compiled from: EmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f14932attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f14934saneness = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f14933dern = 0;

    /* JADX INFO: renamed from: basify.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    public static class C0128attabal extends saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final EditText f14935attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final competently f14936saneness;

        public C0128attabal(EditText editText, boolean z) {
            this.f14935attabal = editText;
            competently competentlyVar = new competently(editText, z);
            this.f14936saneness = competentlyVar;
            editText.addTextChangedListener(competentlyVar);
            editText.setEditableFactory(basify.saneness.getInstance());
        }

        @Override // basify.attabal.saneness
        public KeyListener attabal(KeyListener keyListener) {
            if (keyListener instanceof marial) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new marial(keyListener);
        }

        @Override // basify.attabal.saneness
        public InputConnection dern(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof dern ? inputConnection : new dern(this.f14935attabal, inputConnection, editorInfo);
        }

        @Override // basify.attabal.saneness
        public boolean saneness() {
            return this.f14936saneness.saneness();
        }

        @Override // basify.attabal.saneness
        public void wireman(boolean z) {
            this.f14936saneness.wireman(z);
        }
    }

    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    public static class saneness {
        public KeyListener attabal(KeyListener keyListener) {
            throw null;
        }

        public InputConnection dern(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public boolean saneness() {
            throw null;
        }

        public void wireman(boolean z) {
            throw null;
        }
    }

    public attabal(EditText editText, boolean z) {
        cutely.impromptu(editText, "editText cannot be null");
        this.f14932attabal = new C0128attabal(editText, z);
    }

    public KeyListener attabal(KeyListener keyListener) {
        return this.f14932attabal.attabal(keyListener);
    }

    public InputConnection dern(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f14932attabal.dern(inputConnection, editorInfo);
    }

    public boolean saneness() {
        return this.f14932attabal.saneness();
    }

    public void wireman(boolean z) {
        this.f14932attabal.wireman(z);
    }
}
