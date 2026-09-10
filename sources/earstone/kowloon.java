package earstone;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: RectEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Rect f25533attabal;

    public kowloon() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
        Rect rect3 = this.f25533attabal;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.f25533attabal;
    }

    public kowloon(Rect rect) {
        this.f25533attabal = rect;
    }
}
