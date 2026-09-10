package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {
    public static final String[] C0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property D0 = new AnonymousClass1(PointF.class, "topLeft");
    public static final Property E0 = new AnonymousClass2(PointF.class, "bottomRight");
    public static final Property F0 = new AnonymousClass3(PointF.class, "bottomRight");
    public static final Property G0 = new AnonymousClass4(PointF.class, "topLeft");
    public static final Property H0 = new AnonymousClass5(PointF.class, "position");

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.f8400a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.f8401b = iRound;
            int i2 = viewBounds2.f + 1;
            viewBounds2.f = i2;
            if (i2 == viewBounds2.g) {
                ViewUtils.a(viewBounds2.f8403e, viewBounds2.f8400a, iRound, viewBounds2.f8402c, viewBounds2.d);
                viewBounds2.f = 0;
                viewBounds2.g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.f8402c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.d = iRound;
            int i2 = viewBounds2.g + 1;
            viewBounds2.g = i2;
            if (viewBounds2.f == i2) {
                ViewUtils.a(viewBounds2.f8403e, viewBounds2.f8400a, viewBounds2.f8401b, viewBounds2.f8402c, iRound);
                viewBounds2.f = 0;
                viewBounds2.g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$4, reason: invalid class name */
    public class AnonymousClass4 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$5, reason: invalid class name */
    public class AnonymousClass5 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            ViewUtils.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public boolean X;

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
            this.X = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (!this.X) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            ViewUtils.a(null, 0, 0, Math.max(0, 0), Math.max(0, 0));
            throw null;
        }
    }

    public static class SuppressLayoutListener extends TransitionListenerAdapter {
        public boolean X = false;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ViewGroup f8399Y;

        public SuppressLayoutListener(ViewGroup viewGroup) {
            this.f8399Y = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void a() {
            ViewGroupUtils.a(this.f8399Y, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void d() {
            ViewGroupUtils.a(this.f8399Y, true);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            if (!this.X) {
                ViewGroupUtils.a(this.f8399Y, false);
            }
            transition.B(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
            ViewGroupUtils.a(this.f8399Y, false);
            this.X = true;
        }
    }

    public static class ViewBounds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8402c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f8403e;
        public int f;
        public int g;

        public ViewBounds(View view) {
            this.f8403e = view;
        }
    }

    public static void N(TransitionValues transitionValues) {
        View view = transitionValues.f8446b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = transitionValues.f8445a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", transitionValues.f8446b.getParent());
    }

    @Override // androidx.transition.Transition
    public final void e(TransitionValues transitionValues) {
        N(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        N(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator l(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        ChangeBounds changeBounds;
        Animator animatorA;
        if (transitionValues != null && transitionValues2 != null) {
            HashMap map = transitionValues.f8445a;
            HashMap map2 = transitionValues2.f8445a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view = transitionValues2.f8446b;
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i3 = rect.left;
                int i4 = rect2.left;
                int i5 = rect.top;
                int i6 = rect2.top;
                int i7 = rect.right;
                int i8 = rect2.right;
                int i9 = rect.bottom;
                int i10 = rect2.bottom;
                int i11 = i7 - i3;
                int i12 = i9 - i5;
                int i13 = i8 - i4;
                int i14 = i10 - i6;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                    i2 = 0;
                } else {
                    i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
                    if (i7 != i8 || i9 != i10) {
                        i2++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i2++;
                }
                if (i2 > 0) {
                    ViewUtils.a(view, i3, i5, i7, i9);
                    if (i2 != 2) {
                        changeBounds = this;
                        animatorA = (i3 == i4 && i5 == i6) ? ObjectAnimatorUtils.Api21Impl.a(view, F0, changeBounds.x0.a(i7, i9, i8, i10)) : ObjectAnimatorUtils.Api21Impl.a(view, G0, changeBounds.x0.a(i3, i5, i4, i6));
                    } else if (i11 == i13 && i12 == i14) {
                        changeBounds = this;
                        animatorA = ObjectAnimatorUtils.Api21Impl.a(view, H0, changeBounds.x0.a(i3, i5, i4, i6));
                    } else {
                        changeBounds = this;
                        ViewBounds viewBounds = new ViewBounds(view);
                        ObjectAnimator objectAnimatorA = ObjectAnimatorUtils.Api21Impl.a(viewBounds, D0, changeBounds.x0.a(i3, i5, i4, i6));
                        ObjectAnimator objectAnimatorA2 = ObjectAnimatorUtils.Api21Impl.a(viewBounds, E0, changeBounds.x0.a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                        animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                            private final ViewBounds mViewBounds;

                            {
                                this.mViewBounds = viewBounds;
                            }
                        });
                        animatorA = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        ViewGroupUtils.a(viewGroup4, true);
                        changeBounds.r().b(new SuppressLayoutListener(viewGroup4));
                    }
                    return animatorA;
                }
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final String[] t() {
        return C0;
    }
}
