package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: loaded from: classes.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f4956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4957b;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$1, reason: invalid class name */
    public static class AnonymousClass1 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$10, reason: invalid class name */
    public static class AnonymousClass10 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$11, reason: invalid class name */
    public static class AnonymousClass11 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$12, reason: invalid class name */
    public static class AnonymousClass12 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$13, reason: invalid class name */
    public static class AnonymousClass13 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$14, reason: invalid class name */
    public static class AnonymousClass14 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$15, reason: invalid class name */
    class AnonymousClass15 extends FloatPropertyCompat {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$2, reason: invalid class name */
    public static class AnonymousClass2 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$3, reason: invalid class name */
    public static class AnonymousClass3 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$4, reason: invalid class name */
    public static class AnonymousClass4 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$5, reason: invalid class name */
    public static class AnonymousClass5 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$6, reason: invalid class name */
    public static class AnonymousClass6 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$7, reason: invalid class name */
    public static class AnonymousClass7 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$8, reason: invalid class name */
    public static class AnonymousClass8 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$9, reason: invalid class name */
    public static class AnonymousClass9 extends ViewProperty {
    }

    public static class MassState {
    }

    public interface OnAnimationEndListener {
    }

    public interface OnAnimationUpdateListener {
    }

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public final boolean a(long j) {
        long j2 = this.f4957b;
        if (j2 == 0) {
            this.f4957b = j;
            throw null;
        }
        this.f4957b = j;
        b(j - j2);
        float fMin = Math.min(this.f4956a, 0.0f);
        this.f4956a = fMin;
        this.f4956a = Math.max(fMin, 0.0f);
        throw null;
    }

    public abstract boolean b(long j);
}
