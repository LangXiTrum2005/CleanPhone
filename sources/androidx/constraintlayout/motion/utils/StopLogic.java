package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class StopLogic extends MotionInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3802a;

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public final float a() {
        float f = this.f3802a;
        if (f > 0.0f) {
            f -= 0.0f;
            if (f >= 0.0f) {
                float f2 = f - 0.0f;
                if (f2 < 0.0f) {
                    return 0.0f - ((f2 * 0.0f) / 0.0f);
                }
                return 0.0f;
            }
        }
        return 0.0f + ((f * 0.0f) / 0.0f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        this.f3802a = f;
        throw null;
    }
}
