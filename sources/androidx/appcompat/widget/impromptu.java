package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: compiled from: AppCompatEmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final EditText f5486attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final basify.attabal f5487saneness;

    public impromptu(EditText editText) {
        this.f5486attabal = editText;
        this.f5487saneness = new basify.attabal(editText, false);
    }

    public KeyListener attabal(KeyListener keyListener) {
        return saneness(keyListener) ? this.f5487saneness.attabal(keyListener) : keyListener;
    }

    public void beachfront(boolean z) {
        this.f5487saneness.wireman(z);
    }

    public boolean dern() {
        return this.f5487saneness.saneness();
    }

    public InputConnection marial(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f5487saneness.dern(inputConnection, editorInfo);
    }

    public boolean saneness(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void wireman(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f5486attabal.getContext().obtainStyledAttributes(attributeSet, beachfront.cutely.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(beachfront.cutely.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            beachfront(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
