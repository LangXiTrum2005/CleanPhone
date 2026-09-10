package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] C0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator D0 = new AnonymousClass1();
    public static final Property E0 = new AnonymousClass2(Matrix.class, "animatedTransform");

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$1, reason: invalid class name */
    public class AnonymousClass1 implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageViewUtils.a(imageView, matrix);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8405a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f8405a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8405a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final ImageView X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Matrix f8406Y;
        public final Matrix Z;
        public boolean e0 = true;

        public Listener(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.X = imageView;
            this.f8406Y = matrix;
            this.Z = matrix2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            if (this.e0) {
                ImageView imageView = this.X;
                imageView.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_image_transform, this.f8406Y);
                ImageViewUtils.a(imageView, this.Z);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            ImageView imageView = this.X;
            Matrix matrix = (Matrix) imageView.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.a(imageView, matrix);
                imageView.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_image_transform, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            this.e0 = z2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            ImageView imageView = this.X;
            imageView.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_image_transform, matrix);
            ImageViewUtils.a(imageView, this.Z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ImageView imageView = this.X;
            Matrix matrix = (Matrix) imageView.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.a(imageView, matrix);
                imageView.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            this.e0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.e0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.e0 = false;
        }
    }

    public static void N(TransitionValues transitionValues, boolean z2) {
        Matrix matrix;
        View view = transitionValues.f8446b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = transitionValues.f8445a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z2 ? (Matrix) imageView.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i2 = AnonymousClass3.f8405a[imageView.getScaleType().ordinal()];
                    if (i2 == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i2 != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float fMax = Math.max(width / f, height / f2);
                        int iRound = Math.round((width - (f * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final void e(TransitionValues transitionValues) {
        N(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        N(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator l(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        HashMap map = transitionValues.f8445a;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        HashMap map2 = transitionValues2.f8445a;
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z2 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z2) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.f8446b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Property property = E0;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            TypeEvaluator typeEvaluator = D0;
            Matrix matrix3 = MatrixUtils.f8423a;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, typeEvaluator, matrix3, matrix3);
        }
        if (matrix == null) {
            matrix = MatrixUtils.f8423a;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.f8423a;
        }
        ((AnonymousClass2) property).getClass();
        ImageViewUtils.a(imageView, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, new TransitionUtils.MatrixEvaluator(), matrix, matrix2);
        Listener listener = new Listener(imageView, matrix, matrix2);
        objectAnimatorOfObject.addListener(listener);
        objectAnimatorOfObject.addPauseListener(listener);
        b(listener);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] t() {
        return C0;
    }
}
