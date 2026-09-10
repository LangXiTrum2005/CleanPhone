package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeTransform extends Transition {
    public static final String[] C0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final Property D0 = new AnonymousClass1(float[].class, "nonTranslations");
    public static final Property E0 = new AnonymousClass2(PointF.class, "translations");
    public static final boolean F0 = true;

    /* JADX INFO: renamed from: androidx.transition.ChangeTransform$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<PathAnimatorMatrix, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public final void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            float[] fArr2 = fArr;
            pathAnimatorMatrix2.getClass();
            System.arraycopy(fArr2, 0, pathAnimatorMatrix2.f8410c, 0, fArr2.length);
            pathAnimatorMatrix2.a();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeTransform$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<PathAnimatorMatrix, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public final void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            PointF pointF2 = pointF;
            pathAnimatorMatrix2.getClass();
            pathAnimatorMatrix2.d = pointF2.x;
            pathAnimatorMatrix2.f8411e = pointF2.y;
            pathAnimatorMatrix2.a();
        }
    }

    public static class GhostListener extends TransitionListenerAdapter {
        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void a() {
            throw null;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void d() {
            throw null;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            transition.B(this);
            if (Build.VERSION.SDK_INT != 28) {
                int i2 = GhostViewPort.g0;
                throw null;
            }
            if (!GhostViewPlatform.e0) {
                try {
                    if (!GhostViewPlatform.f8421Y) {
                        try {
                            GhostViewPlatform.X = Class.forName("android.view.GhostView");
                        } catch (ClassNotFoundException e2) {
                            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
                        }
                        GhostViewPlatform.f8421Y = true;
                    }
                    Method declaredMethod = GhostViewPlatform.X.getDeclaredMethod("removeGhost", View.class);
                    GhostViewPlatform.Z = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e3) {
                    Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e3);
                }
                GhostViewPlatform.e0 = true;
            }
            Method method = GhostViewPlatform.Z;
            if (method == null) {
                throw null;
            }
            try {
                method.invoke(null, null);
                throw null;
            } catch (IllegalAccessException unused) {
                throw null;
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
    }

    public static class Listener extends AnimatorListenerAdapter {
        public boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Matrix f8407Y = new Matrix();
        public final View Z;
        public final Transforms e0;
        public final PathAnimatorMatrix f0;

        public Listener(View view, Transforms transforms, PathAnimatorMatrix pathAnimatorMatrix, Matrix matrix) {
            this.Z = view;
            this.e0 = transforms;
            this.f0 = pathAnimatorMatrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.X = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z2 = this.X;
            View view = this.Z;
            if (!z2) {
                view.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_transform, null);
                view.setTag(com.charging.screenshow.battery.animations.themes.R.id.parent_matrix, null);
            }
            ViewUtils.f8453a.d(view, null);
            Transforms transforms = this.e0;
            transforms.getClass();
            String[] strArr = ChangeTransform.C0;
            view.setTranslationX(transforms.f8412a);
            view.setTranslationY(transforms.f8413b);
            ViewCompat.M(view, transforms.f8414c);
            view.setScaleX(transforms.d);
            view.setScaleY(transforms.f8415e);
            view.setRotationX(transforms.f);
            view.setRotationY(transforms.g);
            view.setRotation(transforms.f8416h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = this.f0.f8408a;
            Matrix matrix2 = this.f8407Y;
            matrix2.set(matrix);
            View view = this.Z;
            view.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_transform, matrix2);
            Transforms transforms = this.e0;
            transforms.getClass();
            String[] strArr = ChangeTransform.C0;
            view.setTranslationX(transforms.f8412a);
            view.setTranslationY(transforms.f8413b);
            ViewCompat.M(view, transforms.f8414c);
            view.setScaleX(transforms.d);
            view.setScaleY(transforms.f8415e);
            view.setRotationX(transforms.f);
            view.setRotationY(transforms.g);
            view.setRotation(transforms.f8416h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            String[] strArr = ChangeTransform.C0;
            View view = this.Z;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            ViewCompat.M(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
        }
    }

    public static class PathAnimatorMatrix {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f8408a = new Matrix();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f8409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f8410c;
        public float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8411e;

        public PathAnimatorMatrix(View view, float[] fArr) {
            this.f8409b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f8410c = fArr2;
            this.d = fArr2[2];
            this.f8411e = fArr2[5];
            a();
        }

        public final void a() {
            float f = this.d;
            float[] fArr = this.f8410c;
            fArr[2] = f;
            fArr[5] = this.f8411e;
            Matrix matrix = this.f8408a;
            matrix.setValues(fArr);
            ViewUtils.f8453a.d(this.f8409b, matrix);
        }
    }

    public static class Transforms {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f8412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f8413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f8414c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f8415e;
        public final float f;
        public final float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f8416h;

        public Transforms(View view) {
            this.f8412a = view.getTranslationX();
            this.f8413b = view.getTranslationY();
            this.f8414c = ViewCompat.p(view);
            this.d = view.getScaleX();
            this.f8415e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.f8416h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            return transforms.f8412a == this.f8412a && transforms.f8413b == this.f8413b && transforms.f8414c == this.f8414c && transforms.d == this.d && transforms.f8415e == this.f8415e && transforms.f == this.f && transforms.g == this.g && transforms.f8416h == this.f8416h;
        }

        public final int hashCode() {
            float f = this.f8412a;
            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f8413b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f8414c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f8415e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f8416h;
            return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    public static void N(TransitionValues transitionValues) {
        View view = transitionValues.f8446b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap map = transitionValues.f8445a;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new Transforms(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
    }

    @Override // androidx.transition.Transition
    public final void e(TransitionValues transitionValues) {
        N(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        N(transitionValues);
        if (F0) {
            return;
        }
        ((ViewGroup) transitionValues.f8446b.getParent()).startViewTransition(transitionValues.f8446b);
    }

    @Override // androidx.transition.Transition
    public final Animator l(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Animator animator = null;
        if (transitionValues != null && transitionValues2 != null) {
            HashMap map = transitionValues.f8445a;
            if (map.containsKey("android:changeTransform:parent")) {
                HashMap map2 = transitionValues2.f8445a;
                if (map2.containsKey("android:changeTransform:parent")) {
                    ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
                    Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
                    if (matrix != null) {
                        map.put("android:changeTransform:matrix", matrix);
                    }
                    Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
                    if (matrix2 != null) {
                        map.put("android:changeTransform:parentMatrix", matrix2);
                    }
                    Matrix matrix3 = (Matrix) map.get("android:changeTransform:matrix");
                    Matrix matrix4 = (Matrix) map2.get("android:changeTransform:matrix");
                    if (matrix3 == null) {
                        matrix3 = MatrixUtils.f8423a;
                    }
                    if (matrix4 == null) {
                        matrix4 = MatrixUtils.f8423a;
                    }
                    if (!matrix3.equals(matrix4)) {
                        Transforms transforms = (Transforms) map2.get("android:changeTransform:transforms");
                        View view = transitionValues2.f8446b;
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        ViewCompat.M(view, 0.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setRotationX(0.0f);
                        view.setRotationY(0.0f);
                        view.setRotation(0.0f);
                        float[] fArr = new float[9];
                        matrix3.getValues(fArr);
                        float[] fArr2 = new float[9];
                        matrix4.getValues(fArr2);
                        PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view, fArr);
                        Property property = D0;
                        FloatArrayEvaluator floatArrayEvaluator = new FloatArrayEvaluator();
                        floatArrayEvaluator.f8418a = new float[9];
                        Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(property, floatArrayEvaluator, fArr, fArr2), PropertyValuesHolderUtils.Api21Impl.a(E0, this.x0.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
                        Listener listener = new Listener(view, transforms, pathAnimatorMatrix, matrix4);
                        animatorOfPropertyValuesHolder.addListener(listener);
                        animatorOfPropertyValuesHolder.addPauseListener(listener);
                        animator = animatorOfPropertyValuesHolder;
                    }
                    if (!F0) {
                        viewGroup2.endViewTransition(transitionValues.f8446b);
                    }
                }
            }
        }
        return animator;
    }

    @Override // androidx.transition.Transition
    public final String[] t() {
        return C0;
    }
}
