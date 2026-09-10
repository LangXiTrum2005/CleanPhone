package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f3562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmojiEditTextHelper f3563b;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f3562a = editText;
        this.f3563b = new EmojiEditTextHelper(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? this.f3563b.a(keyListener) : keyListener;
    }

    public final void b(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f3562a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f3282i, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            this.f3563b.c(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
