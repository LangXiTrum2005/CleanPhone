package com.smartdigimkt.l2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import com.smartdigimkt.v0.v;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36321a;

        public a(View view) {
            this.f36321a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.f36321a;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f36321a;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.l2.b$b, reason: collision with other inner class name */
    public class C0528b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36323a;

        public C0528b(List list) {
            this.f36323a = list;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            List list = this.f36323a;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (View view : this.f36323a) {
                if (view != null) {
                    view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    view.requestLayout();
                }
            }
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36325a;

        public c(View view) {
            this.f36325a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f36325a;
            if (view != null) {
                view.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f36325a.requestLayout();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36327a;

        public d(View view) {
            this.f36327a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f36327a;
            if (view != null) {
                view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f36327a.requestLayout();
                if (this.f36327a.getVisibility() != 0) {
                    this.f36327a.setVisibility(0);
                }
            }
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36329a;

        public e(View view) {
            this.f36329a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f36329a.getLayoutParams();
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f36329a.setLayoutParams(layoutParams);
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36331a;

        public f(View view) {
            this.f36331a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f36331a.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f36331a.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public void a(Map<String, Bitmap> map, com.smartdigimkt.c2.c cVar, View view) {
        if (view != null) {
            com.smartdigimkt.n2.a.a().a(map, cVar, view);
        }
    }

    public TranslateAnimation b(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(400L);
        view.setVisibility(0);
        return translateAnimation;
    }

    public ObjectAnimator c(View view) {
        ObjectAnimator objectAnimatorA = a(view, 1.0f, 1.0f, 5.0f, 2000L);
        objectAnimatorA.setRepeatCount(-1);
        return objectAnimatorA;
    }

    public ObjectAnimator d(View view) {
        ObjectAnimator objectAnimatorA = a(view, 1.0f, 1.0f, 2000L);
        objectAnimatorA.setRepeatCount(-1);
        return objectAnimatorA;
    }

    public ObjectAnimator a(View view) {
        ObjectAnimator objectAnimatorA = a(view, 2.0f, 1000L);
        objectAnimatorA.setRepeatCount(-1);
        return objectAnimatorA;
    }

    public void c(View view, long j) {
        if (view == null) {
            return;
        }
        a(view, 0, v.g(view.getContext().getApplicationContext()), j);
    }

    public void a(View view, long j) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(j);
        }
    }

    public void b(View view, long j) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(j).setListener(new a(view));
        }
    }

    private PropertyValuesHolder c(Property property, float f2) {
        float f3 = (-2.0f) * f2;
        float f4 = f2 * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f3), Keyframe.ofFloat(0.2f, f3), Keyframe.ofFloat(0.3f, f4), Keyframe.ofFloat(0.4f, f3), Keyframe.ofFloat(0.5f, f4), Keyframe.ofFloat(0.6f, f3), Keyframe.ofFloat(0.7f, f4), Keyframe.ofFloat(0.8f, f3), Keyframe.ofFloat(0.9f, f4), Keyframe.ofFloat(1.0f, 0.0f));
    }

    private PropertyValuesHolder b(Property property, float f2) {
        float f3 = f2 - 0.2f;
        float f4 = f2 + 0.3f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f2), Keyframe.ofFloat(0.1f, f2 - 0.4f), Keyframe.ofFloat(0.2f, f3), Keyframe.ofFloat(0.3f, f4), Keyframe.ofFloat(0.4f, f3), Keyframe.ofFloat(0.5f, f4), Keyframe.ofFloat(0.6f, f2 - 0.1f), Keyframe.ofFloat(0.7f, f4), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, 0.1f + f2), Keyframe.ofFloat(1.0f, f2));
    }

    public void a(List<View> list, int i2, int i3, long j) {
        ValueAnimator duration = ValueAnimator.ofInt(i2, i3).setDuration(j);
        duration.addUpdateListener(new C0528b(list));
        duration.start();
    }

    public void a(View view, int i2, int i3, int i4, int i5, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.addUpdateListener(new c(view));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i4, i5);
        valueAnimatorOfInt2.addUpdateListener(new d(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.setDuration(j);
        animatorSet.start();
    }

    private ObjectAnimator a(View view, float f2, float f3, float f4, long j) {
        return ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X, f2), b(View.SCALE_Y, f3), c(View.ROTATION_X, f4)).setDuration(j);
    }

    private void a(View view, int i2, int i3, long j) {
        ValueAnimator valueAnimatorOfInt;
        ValueAnimator valueAnimatorOfFloat;
        if (view.getLayoutParams().width == 0) {
            valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(i3, i2);
        }
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new e(view));
        if (view.getLayoutParams().width == 0) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new f(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
        animatorSet.start();
    }

    private ObjectAnimator a(View view, float f2, float f3, long j) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X, f2), a(View.SCALE_Y, f3)).setDuration(j);
    }

    public ObjectAnimator a(View view, float f2, long j) {
        return ObjectAnimator.ofPropertyValuesHolder(view, c(View.ROTATION, f2)).setDuration(j);
    }

    private PropertyValuesHolder a(Property property, float f2) {
        float f3 = f2 - 0.4f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f2), Keyframe.ofFloat(0.1f, f3), Keyframe.ofFloat(0.2f, f3), Keyframe.ofFloat(0.3f, f2), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f2), Keyframe.ofFloat(0.6f, f2), Keyframe.ofFloat(0.7f, f2), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, f2), Keyframe.ofFloat(1.0f, f2));
    }
}
