package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] D0 = {"android:visibility:visibility", "android:visibility:parent"};
    public int C0 = 3;

    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f8461Y;
        public final ViewGroup Z;
        public boolean f0;
        public boolean g0 = false;
        public final boolean e0 = true;

        public DisappearListener(View view, int i2) {
            this.X = view;
            this.f8461Y = i2;
            this.Z = (ViewGroup) view.getParent();
            h(true);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            h(false);
            if (this.g0) {
                return;
            }
            ViewUtils.b(this.X, this.f8461Y);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            h(true);
            if (this.g0) {
                return;
            }
            ViewUtils.b(this.X, 0);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            transition.B(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        public final void h(boolean z2) {
            ViewGroup viewGroup;
            if (!this.e0 || this.f0 == z2 || (viewGroup = this.Z) == null) {
                return;
            }
            this.f0 = z2;
            ViewGroupUtils.a(viewGroup, z2);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.g0 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.g0) {
                ViewUtils.b(this.X, this.f8461Y);
                ViewGroup viewGroup = this.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                ViewUtils.b(this.X, 0);
                ViewGroup viewGroup = this.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            if (!this.g0) {
                ViewUtils.b(this.X, this.f8461Y);
                ViewGroup viewGroup = this.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final ViewGroup X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final View f8462Y;
        public final View Z;
        public boolean e0 = true;

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.X = viewGroup;
            this.f8462Y = view;
            this.Z = view2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            transition.B(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
            if (this.e0) {
                h();
            }
        }

        public final void h() {
            this.Z.setTag(com.charging.screenshow.battery.animations.themes.R.id.save_overlay_view, null);
            this.X.getOverlay().remove(this.f8462Y);
            this.e0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.X.getOverlay().remove(this.f8462Y);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f8462Y;
            if (view.getParent() == null) {
                this.X.getOverlay().add(view);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                View view = this.Z;
                View view2 = this.f8462Y;
                view.setTag(com.charging.screenshow.battery.animations.themes.R.id.save_overlay_view, view2);
                this.X.getOverlay().add(view2);
                this.e0 = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            h();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
        }
    }

    public static class VisibilityInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8465c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f8466e;
        public ViewGroup f;
    }

    public static void N(TransitionValues transitionValues) {
        int visibility = transitionValues.f8446b.getVisibility();
        HashMap map = transitionValues.f8445a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", transitionValues.f8446b.getParent());
        int[] iArr = new int[2];
        transitionValues.f8446b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static VisibilityInfo O(TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfo = new VisibilityInfo();
        visibilityInfo.f8463a = false;
        visibilityInfo.f8464b = false;
        if (transitionValues != null) {
            HashMap map = transitionValues.f8445a;
            if (map.containsKey("android:visibility:visibility")) {
                visibilityInfo.f8465c = ((Integer) map.get("android:visibility:visibility")).intValue();
                visibilityInfo.f8466e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                visibilityInfo.f8465c = -1;
                visibilityInfo.f8466e = null;
            }
        } else {
            visibilityInfo.f8465c = -1;
            visibilityInfo.f8466e = null;
        }
        if (transitionValues2 != null) {
            HashMap map2 = transitionValues2.f8445a;
            if (map2.containsKey("android:visibility:visibility")) {
                visibilityInfo.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                visibilityInfo.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                visibilityInfo.d = -1;
                visibilityInfo.f = null;
            }
        } else {
            visibilityInfo.d = -1;
            visibilityInfo.f = null;
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i2 = visibilityInfo.f8465c;
            int i3 = visibilityInfo.d;
            if (i2 != i3 || visibilityInfo.f8466e != visibilityInfo.f) {
                if (i2 != i3) {
                    if (i2 == 0) {
                        visibilityInfo.f8464b = false;
                        visibilityInfo.f8463a = true;
                        return visibilityInfo;
                    }
                    if (i3 == 0) {
                        visibilityInfo.f8464b = true;
                        visibilityInfo.f8463a = true;
                        return visibilityInfo;
                    }
                } else {
                    if (visibilityInfo.f == null) {
                        visibilityInfo.f8464b = false;
                        visibilityInfo.f8463a = true;
                        return visibilityInfo;
                    }
                    if (visibilityInfo.f8466e == null) {
                        visibilityInfo.f8464b = true;
                        visibilityInfo.f8463a = true;
                        return visibilityInfo;
                    }
                }
            }
        } else {
            if (transitionValues == null && visibilityInfo.d == 0) {
                visibilityInfo.f8464b = true;
                visibilityInfo.f8463a = true;
                return visibilityInfo;
            }
            if (transitionValues2 == null && visibilityInfo.f8465c == 0) {
                visibilityInfo.f8464b = false;
                visibilityInfo.f8463a = true;
            }
        }
        return visibilityInfo;
    }

    public Animator P(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    @Override // androidx.transition.Transition
    public void e(TransitionValues transitionValues) {
        N(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void h(TransitionValues transitionValues) {
        N(transitionValues);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x020d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (O(q(r4, false), u(r4, false)).f8463a != false) goto L9;
     */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r24, androidx.transition.TransitionValues r25, androidx.transition.TransitionValues r26) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.l(android.view.ViewGroup, androidx.transition.TransitionValues, androidx.transition.TransitionValues):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final String[] t() {
        return D0;
    }

    @Override // androidx.transition.Transition
    public final boolean w(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.f8445a.containsKey("android:visibility:visibility") != transitionValues.f8445a.containsKey("android:visibility:visibility")) {
            return false;
        }
        VisibilityInfo visibilityInfoO = O(transitionValues, transitionValues2);
        if (visibilityInfoO.f8463a) {
            return visibilityInfoO.f8465c == 0 || visibilityInfoO.d == 0;
        }
        return false;
    }
}
