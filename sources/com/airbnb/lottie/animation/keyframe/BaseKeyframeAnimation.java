package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.media3.extractor.text.ttml.a;
import com.airbnb.lottie.L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KeyframesWrapper f9645c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LottieValueCallback f9646e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9643a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9644b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9647h = -1.0f;

    public interface AnimationListener {
        void a();
    }

    public static final class EmptyKeyframeWrapper<T> implements KeyframesWrapper<T> {
        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final Keyframe b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean c(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float d() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return true;
        }
    }

    public interface KeyframesWrapper<T> {
        boolean a(float f);

        Keyframe b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    public static final class KeyframesWrapperImpl<T> implements KeyframesWrapper<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f9648a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Keyframe f9650c = null;
        public float d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Keyframe f9649b = f(0.0f);

        public KeyframesWrapperImpl(List list) {
            this.f9648a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean a(float f) {
            Keyframe keyframe = this.f9650c;
            Keyframe keyframe2 = this.f9649b;
            if (keyframe == keyframe2 && this.d == f) {
                return true;
            }
            this.f9650c = keyframe2;
            this.d = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final Keyframe b() {
            return this.f9649b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean c(float f) {
            Keyframe keyframe = this.f9649b;
            if (f >= keyframe.b() && f < keyframe.a()) {
                return !this.f9649b.c();
            }
            this.f9649b = f(f);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float d() {
            return ((Keyframe) this.f9648a.get(0)).b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float e() {
            return ((Keyframe) a.h(1, this.f9648a)).a();
        }

        public final Keyframe f(float f) {
            List list = this.f9648a;
            Keyframe keyframe = (Keyframe) a.h(1, list);
            if (f >= keyframe.b()) {
                return keyframe;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                Keyframe keyframe2 = (Keyframe) list.get(size);
                if (this.f9649b != keyframe2 && f >= keyframe2.b() && f < keyframe2.a()) {
                    return keyframe2;
                }
            }
            return (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class SingleKeyframeWrapper<T> implements KeyframesWrapper<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Keyframe f9651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f9652b = -1.0f;

        public SingleKeyframeWrapper(List list) {
            this.f9651a = (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean a(float f) {
            if (this.f9652b == f) {
                return true;
            }
            this.f9652b = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final Keyframe b() {
            return this.f9651a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean c(float f) {
            return !this.f9651a.c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float d() {
            return this.f9651a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float e() {
            return this.f9651a.a();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List list) {
        KeyframesWrapper singleKeyframeWrapper;
        if (list.isEmpty()) {
            singleKeyframeWrapper = new EmptyKeyframeWrapper();
        } else {
            singleKeyframeWrapper = list.size() == 1 ? new SingleKeyframeWrapper(list) : new KeyframesWrapperImpl(list);
        }
        this.f9645c = singleKeyframeWrapper;
    }

    public final void a(AnimationListener animationListener) {
        this.f9643a.add(animationListener);
    }

    public final Keyframe b() {
        Keyframe keyframeB = this.f9645c.b();
        L.a();
        return keyframeB;
    }

    public float c() {
        if (this.f9647h == -1.0f) {
            this.f9647h = this.f9645c.e();
        }
        return this.f9647h;
    }

    public final float d() {
        Keyframe keyframeB = b();
        if (keyframeB == null || keyframeB.c()) {
            return 0.0f;
        }
        return keyframeB.d.getInterpolation(e());
    }

    public final float e() {
        if (this.f9644b) {
            return 0.0f;
        }
        Keyframe keyframeB = b();
        if (keyframeB.c()) {
            return 0.0f;
        }
        return (this.d - keyframeB.b()) / (keyframeB.a() - keyframeB.b());
    }

    public Object f() {
        Interpolator interpolator;
        float fE = e();
        if (this.f9646e == null && this.f9645c.a(fE)) {
            return this.f;
        }
        Keyframe keyframeB = b();
        Interpolator interpolator2 = keyframeB.f9953e;
        Object objG = (interpolator2 == null || (interpolator = keyframeB.f) == null) ? g(keyframeB, d()) : h(keyframeB, fE, interpolator2.getInterpolation(fE), interpolator.getInterpolation(fE));
        this.f = objG;
        return objG;
    }

    public abstract Object g(Keyframe keyframe, float f);

    public Object h(Keyframe keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f9643a;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((AnimationListener) arrayList.get(i2)).a();
            i2++;
        }
    }

    public void j(float f) {
        KeyframesWrapper keyframesWrapper = this.f9645c;
        if (keyframesWrapper.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = keyframesWrapper.d();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = keyframesWrapper.d();
            }
            f = this.g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (keyframesWrapper.c(f)) {
            i();
        }
    }

    public final void k(LottieValueCallback lottieValueCallback) {
        LottieValueCallback lottieValueCallback2 = this.f9646e;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.getClass();
        }
        this.f9646e = lottieValueCallback;
    }
}
