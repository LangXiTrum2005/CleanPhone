package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
class RectEvaluator implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f8425a;

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i2 = rect3.left;
        int i3 = i2 + ((int) ((rect4.left - i2) * f));
        int i4 = rect3.top;
        int i5 = i4 + ((int) ((rect4.top - i4) * f));
        int i6 = rect3.right;
        int i7 = i6 + ((int) ((rect4.right - i6) * f));
        int i8 = rect3.bottom;
        int i9 = i8 + ((int) ((rect4.bottom - i8) * f));
        Rect rect5 = this.f8425a;
        if (rect5 == null) {
            return new Rect(i3, i5, i7, i9);
        }
        rect5.set(i3, i5, i7, i9);
        return rect5;
    }
}
