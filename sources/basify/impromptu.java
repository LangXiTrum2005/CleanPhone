package basify;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: compiled from: EmojiTransformationMethod.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu implements TransformationMethod {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final TransformationMethod f14951kowloon;

    public impromptu(TransformationMethod transformationMethod) {
        this.f14951kowloon = transformationMethod;
    }

    public TransformationMethod attabal() {
        return this.f14951kowloon;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f14951kowloon;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.dern.dern().marial() != 1) ? charSequence : androidx.emoji2.text.dern.dern().arytenoidectomy(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f14951kowloon;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
