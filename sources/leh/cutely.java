package leh;

import android.view.animation.Interpolator;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SplashProgressBar.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lleh/cutely;", "Landroid/view/animation/Interpolator;", "<init>", "()V", "", "input", "getInterpolation", "(F)F", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cutely implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        if (input < 0.3f) {
            return input * 0.5f;
        }
        if (input < 0.5f) {
            return (((float) Math.pow((input - 0.3f) / 0.2f, 2.0f)) * 0.7f) + 0.15f;
        }
        float f = 1;
        return ((f - ((float) Math.pow(f - ((input - 0.5f) / 0.5f), 2.0f))) * 0.15f) + 0.85f;
    }
}
