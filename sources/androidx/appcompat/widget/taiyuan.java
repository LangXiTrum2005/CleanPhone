package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: AppCompatEmojiTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TextView f5572attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final basify.beachfront f5573saneness;

    public taiyuan(TextView textView) {
        this.f5572attabal = textView;
        this.f5573saneness = new basify.beachfront(textView, false);
    }

    public InputFilter[] attabal(InputFilter[] inputFilterArr) {
        return this.f5573saneness.attabal(inputFilterArr);
    }

    public TransformationMethod beachfront(TransformationMethod transformationMethod) {
        return this.f5573saneness.marial(transformationMethod);
    }

    public void dern(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f5572attabal.getContext().obtainStyledAttributes(attributeSet, beachfront.cutely.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(beachfront.cutely.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            marial(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void marial(boolean z) {
        this.f5573saneness.wireman(z);
    }

    public boolean saneness() {
        return this.f5573saneness.saneness();
    }

    public void wireman(boolean z) {
        this.f5573saneness.dern(z);
    }
}
