package androidx.core.view;

import A.H;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Impl f4487a;

    public static class Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f4492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Interpolator f4493c;
        public final long d;

        public Impl(int i2, Interpolator interpolator, long j) {
            this.f4491a = i2;
            this.f4493c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.f4493c;
            return interpolator != null ? interpolator.getInterpolation(this.f4492b) : this.f4492b;
        }

        public int c() {
            return this.f4491a;
        }

        public void d(float f) {
            this.f4492b = f;
        }
    }

    public static class Impl21 extends Impl {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final PathInterpolator f4494e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final FastOutLinearInInterpolator f = new FastOutLinearInInterpolator();
        public static final DecelerateInterpolator g = new DecelerateInterpolator();

        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Callback f4495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public WindowInsetsCompat f4496b;

            public Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                this.f4495a = callback;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                WindowInsetsCompat windowInsetsCompatA = ViewCompat.Api23Impl.a(view);
                this.f4496b = windowInsetsCompatA != null ? new WindowInsetsCompat.Builder(windowInsetsCompatA).f4509a.b() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                WindowInsetsCompat.Impl impl;
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.f4496b = WindowInsetsCompat.p(view, windowInsets);
                    return Impl21.i(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompatP = WindowInsetsCompat.p(view, windowInsets);
                if (this.f4496b == null) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    this.f4496b = ViewCompat.Api23Impl.a(view);
                }
                if (this.f4496b == null) {
                    this.f4496b = windowInsetsCompatP;
                    return Impl21.i(view, windowInsets);
                }
                Callback callbackJ = Impl21.j(view);
                if (callbackJ != null && Objects.equals(callbackJ.f4490a, windowInsets)) {
                    return Impl21.i(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f4496b;
                int i2 = 1;
                int i3 = 0;
                while (true) {
                    impl = windowInsetsCompatP.f4505a;
                    if (i2 > 256) {
                        break;
                    }
                    if (!impl.g(i2).equals(windowInsetsCompat.f4505a.g(i2))) {
                        i3 |= i2;
                    }
                    i2 <<= 1;
                }
                if (i3 == 0) {
                    return Impl21.i(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat2 = this.f4496b;
                if ((i3 & 8) != 0) {
                    interpolator = impl.g(8).d > windowInsetsCompat2.f4505a.g(8).d ? Impl21.f4494e : Impl21.f;
                } else {
                    interpolator = Impl21.g;
                }
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i3, interpolator, 160L);
                windowInsetsAnimationCompat.f4487a.d(0.0f);
                final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.f4487a.a());
                Insets insetsG = impl.g(i3);
                Insets insetsG2 = windowInsetsCompat2.f4505a.g(i3);
                int iMin = Math.min(insetsG.f4297a, insetsG2.f4297a);
                int i4 = insetsG.f4298b;
                int i5 = insetsG2.f4298b;
                int iMin2 = Math.min(i4, i5);
                int i6 = insetsG.f4299c;
                int i7 = insetsG2.f4299c;
                int iMin3 = Math.min(i6, i7);
                int i8 = insetsG.d;
                final int i9 = i3;
                int i10 = insetsG2.d;
                final BoundsCompat boundsCompat = new BoundsCompat(Insets.b(iMin, iMin2, iMin3, Math.min(i8, i10)), Insets.b(Math.max(insetsG.f4297a, insetsG2.f4297a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i10)));
                Impl21.f(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = windowInsetsAnimationCompat;
                        windowInsetsAnimationCompat2.f4487a.d(animatedFraction);
                        float fB = windowInsetsAnimationCompat2.f4487a.b();
                        PathInterpolator pathInterpolator = Impl21.f4494e;
                        WindowInsetsCompat windowInsetsCompat3 = windowInsetsCompatP;
                        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat3);
                        int i11 = 1;
                        while (true) {
                            WindowInsetsCompat.BuilderImpl builderImpl = builder.f4509a;
                            if (i11 > 256) {
                                Impl21.g(view, builderImpl.b(), Collections.singletonList(windowInsetsAnimationCompat2));
                                return;
                            }
                            int i12 = i9 & i11;
                            WindowInsetsCompat.Impl impl2 = windowInsetsCompat3.f4505a;
                            if (i12 == 0) {
                                builderImpl.c(i11, impl2.g(i11));
                            } else {
                                Insets insetsG3 = impl2.g(i11);
                                Insets insetsG4 = windowInsetsCompat2.f4505a.g(i11);
                                float f = 1.0f - fB;
                                builderImpl.c(i11, WindowInsetsCompat.l(insetsG3, (int) (((double) ((insetsG3.f4297a - insetsG4.f4297a) * f)) + 0.5d), (int) (((double) ((insetsG3.f4298b - insetsG4.f4298b) * f)) + 0.5d), (int) (((double) ((insetsG3.f4299c - insetsG4.f4299c) * f)) + 0.5d), (int) (((double) ((insetsG3.d - insetsG4.d) * f)) + 0.5d)));
                            }
                            i11 <<= 1;
                        }
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = windowInsetsAnimationCompat;
                        windowInsetsAnimationCompat2.f4487a.d(1.0f);
                        Impl21.e(view, windowInsetsAnimationCompat2);
                    }
                });
                OneShotPreDrawListener.a(view, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Impl21.h(view, windowInsetsAnimationCompat, boundsCompat);
                        duration.start();
                    }
                });
                this.f4496b = windowInsetsCompatP;
                return Impl21.i(view, windowInsets);
            }
        }

        public static void e(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                callbackJ.a();
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), windowInsetsAnimationCompat);
                }
            }
        }

        public static void f(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z2) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                callbackJ.f4490a = windowInsets;
                if (!z2) {
                    callbackJ.b();
                    z2 = true;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    f(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, windowInsets, z2);
                }
            }
        }

        public static void g(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                callbackJ.c(windowInsetsCompat, list);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    g(viewGroup.getChildAt(i2), windowInsetsCompat, list);
                }
            }
        }

        public static void h(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                callbackJ.d(boundsCompat);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    h(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static Callback j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).f4495a;
            }
            return null;
        }
    }

    public static class Impl30 extends Impl {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f4500e;

        public static class ProxyCallback extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Callback f4501a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List f4502b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ArrayList f4503c;
            public final HashMap d;

            public ProxyCallback(Callback callback) {
                super(0);
                this.d = new HashMap();
                this.f4501a = callback;
            }

            public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        windowInsetsAnimationCompat.f4487a = new Impl30(windowInsetsAnimation);
                    }
                    this.d.put(windowInsetsAnimation, windowInsetsAnimationCompat);
                }
                return windowInsetsAnimationCompat;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                Callback callback = this.f4501a;
                a(windowInsetsAnimation);
                callback.a();
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                Callback callback = this.f4501a;
                a(windowInsetsAnimation);
                callback.b();
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f4503c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f4503c = arrayList2;
                    this.f4502b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationK = H.k(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatA = a(windowInsetsAnimationK);
                    windowInsetsAnimationCompatA.f4487a.d(windowInsetsAnimationK.getFraction());
                    this.f4503c.add(windowInsetsAnimationCompatA);
                }
                Callback callback = this.f4501a;
                WindowInsetsCompat windowInsetsCompatP = WindowInsetsCompat.p(null, windowInsets);
                callback.c(windowInsetsCompatP, this.f4502b);
                return windowInsetsCompatP.o();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                Callback callback = this.f4501a;
                a(windowInsetsAnimation);
                BoundsCompat boundsCompat = new BoundsCompat(bounds);
                callback.d(boundsCompat);
                H.n();
                return H.i(boundsCompat.f4488a.d(), boundsCompat.f4489b.d());
            }
        }

        public Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f4500e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final long a() {
            return this.f4500e.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final float b() {
            return this.f4500e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final int c() {
            return this.f4500e.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final void d(float f) {
            this.f4500e.setFraction(f);
        }
    }

    public WindowInsetsAnimationCompat(int i2, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4487a = new Impl30(H.j(i2, interpolator, j));
        } else {
            this.f4487a = new Impl21(i2, interpolator, j);
        }
    }

    public final float a() {
        return this.f4487a.b();
    }

    public final int b() {
        return this.f4487a.c();
    }

    public static final class BoundsCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Insets f4488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Insets f4489b;

        public BoundsCompat(Insets insets, Insets insets2) {
            this.f4488a = insets;
            this.f4489b = insets2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f4488a + " upper=" + this.f4489b + "}";
        }

        public BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.f4488a = Insets.c(bounds.getLowerBound());
            this.f4489b = Insets.c(bounds.getUpperBound());
        }
    }

    public static abstract class Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WindowInsets f4490a;

        @Retention(RetentionPolicy.SOURCE)
        public @interface DispatchMode {
        }

        public abstract WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list);

        public void a() {
        }

        public void b() {
        }

        public BoundsCompat d(BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }
}
