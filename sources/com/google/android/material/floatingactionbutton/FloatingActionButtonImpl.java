package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class FloatingActionButtonImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ShapeAppearanceModel f19291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19293c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19294e;
    public float f;
    public Animator g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MotionSpec f19295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MotionSpec f19296i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19297l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f19298n;
    public ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f19299p;
    public ViewTreeObserver.OnPreDrawListener q;
    public static final FastOutLinearInInterpolator r = AnimationUtils.f19080c;
    public static final int s = R.attr.motionDurationLong2;
    public static final int t = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f19288u = R.attr.motionDurationMedium1;
    public static final int v = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f19289w = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] x = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] y = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f19290z = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f19286A = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f19287B = new int[0];

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1, reason: invalid class name */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        public boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ boolean f19300Y;
        public final /* synthetic */ FloatingActionButton.AnonymousClass1 Z;

        public AnonymousClass1(boolean z2, FloatingActionButton.AnonymousClass1 anonymousClass1) {
            this.f19300Y = z2;
            this.Z = anonymousClass1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.X = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            floatingActionButtonImpl.m = 0;
            floatingActionButtonImpl.g = null;
            if (!this.X) {
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButton.AnonymousClass1 f19301Y;

        public AnonymousClass2(boolean z2, FloatingActionButton.AnonymousClass1 anonymousClass1) {
            this.X = z2;
            this.f19301Y = anonymousClass1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            floatingActionButtonImpl.m = 0;
            floatingActionButtonImpl.g = null;
            FloatingActionButton.AnonymousClass1 anonymousClass1 = this.f19301Y;
            if (anonymousClass1 != null) {
                anonymousClass1.f19283a.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$4, reason: invalid class name */
    class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ float f19302Y;
        public final /* synthetic */ float Z;
        public final /* synthetic */ float e0;
        public final /* synthetic */ float f0;
        public final /* synthetic */ float g0;
        public final /* synthetic */ float h0;
        public final /* synthetic */ Matrix i0;

        public AnonymousClass4(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.X = f;
            this.f19302Y = f2;
            this.Z = f3;
            this.e0 = f4;
            this.f0 = f5;
            this.g0 = f6;
            this.h0 = f7;
            this.i0 = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FloatingActionButtonImpl.this.getClass();
            AnimationUtils.b(this.X, this.f19302Y, 0.0f, 0.2f, fFloatValue);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$5, reason: invalid class name */
    class AnonymousClass5 implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FloatEvaluator f19303a;

        @Override // android.animation.TypeEvaluator
        public final Float evaluate(float f, Float f2, Float f3) {
            float fFloatValue = this.f19303a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$6, reason: invalid class name */
    class AnonymousClass6 implements ViewTreeObserver.OnPreDrawListener {
        public AnonymousClass6() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            throw null;
        }
    }

    public class DisabledElevationAnimation extends ShadowAnimatorImpl {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            return 0.0f;
        }
    }

    public class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            throw null;
        }
    }

    public class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            throw null;
        }
    }

    public interface InternalTransformationCallback {
        void a();

        void b();
    }

    public interface InternalVisibilityChangedListener {
    }

    public class ResetElevationAnimation extends ShadowAnimatorImpl {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            throw null;
        }
    }

    public abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean X;

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.X = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.X) {
                a();
                this.X = true;
            }
            valueAnimator.getAnimatedFraction();
        }
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        throw null;
    }

    public final AnimatorSet b(MotionSpec motionSpec, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.ALPHA, f);
        motionSpec.c("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, f2);
        motionSpec.c("scale").a(objectAnimatorOfFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            anonymousClass5.f19303a = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(anonymousClass5);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, f2);
        motionSpec.c("scale").a(objectAnimatorOfFloat3);
        if (i2 == 26) {
            AnonymousClass5 anonymousClass6 = new AnonymousClass5();
            anonymousClass6.f19303a = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(anonymousClass6);
        }
        arrayList.add(objectAnimatorOfFloat3);
        a(f3, null);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject((Object) null, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            /* JADX INFO: renamed from: a */
            public final Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                FloatingActionButtonImpl.this.k = f4;
                return super.evaluate(f4, matrix, matrix2);
            }
        }, new Matrix(null));
        motionSpec.c("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f, float f2, float f3, int i2, int i3) {
        new AnimatorSet();
        new ArrayList();
        ValueAnimator.ofFloat(0.0f, 1.0f);
        throw null;
    }

    public float d() {
        return this.d;
    }

    public void e(Rect rect) {
        if (this.f19292b) {
            throw null;
        }
        float fD = this.f19293c ? d() + this.f : 0.0f;
        int iMax = Math.max(0, (int) Math.ceil(fD));
        int iMax2 = Math.max(0, (int) Math.ceil(fD * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public void f() {
        throw null;
    }

    public void g() {
    }

    public void h(int[] iArr) {
        throw null;
    }

    public void i(float f, float f2, float f3) {
        f();
        k();
        throw null;
    }

    public final void j() {
        ArrayList arrayList = this.f19299p;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InternalTransformationCallback) it.next()).a();
            }
        }
    }

    public final void k() {
        e(null);
        Preconditions.d(null, "Didn't initialize content background");
        throw null;
    }
}
