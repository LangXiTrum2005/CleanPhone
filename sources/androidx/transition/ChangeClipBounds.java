package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] C0 = {"android:clipBounds:clip"};
    public static final Rect D0 = new Rect();

    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final Rect X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Rect f8404Y;
        public final View Z;

        public Listener(Rect rect, Rect rect2, View view) {
            this.Z = view;
            this.X = rect;
            this.f8404Y = rect2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            View view = this.Z;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.D0;
            }
            view.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_clip, clipBounds);
            view.setClipBounds(this.f8404Y);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            View view = this.Z;
            view.setClipBounds((Rect) view.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_clip));
            view.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_clip, null);
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

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            View view = this.Z;
            if (z2) {
                view.setClipBounds(this.X);
            } else {
                view.setClipBounds(this.f8404Y);
            }
        }
    }

    public static void N(TransitionValues transitionValues, boolean z2) {
        View view = transitionValues.f8446b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z2 ? (Rect) view.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != D0 ? clipBounds : null;
        HashMap map = transitionValues.f8445a;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
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
        if (!map.containsKey("android:clipBounds:clip")) {
            return null;
        }
        HashMap map2 = transitionValues2.f8445a;
        if (!map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.f8446b.setClipBounds(rect);
        Rect rect5 = new Rect();
        RectEvaluator rectEvaluator = new RectEvaluator();
        rectEvaluator.f8425a = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(transitionValues2.f8446b, (Property<View, V>) ViewUtils.f8455c, rectEvaluator, rect3, rect4);
        Listener listener = new Listener(rect, rect2, transitionValues2.f8446b);
        objectAnimatorOfObject.addListener(listener);
        b(listener);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] t() {
        return C0;
    }
}
