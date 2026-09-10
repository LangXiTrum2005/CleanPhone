package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f3564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmojiTextViewHelper f3565b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f3564a = textView;
        this.f3565b = new EmojiTextViewHelper(textView);
    }

    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f3564a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f3282i, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        this.f3565b.c(z2);
    }

    public final void c(boolean z2) {
        this.f3565b.d(z2);
    }
}
