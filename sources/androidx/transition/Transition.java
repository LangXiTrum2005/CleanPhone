package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public ArrayList l0;
    public ArrayList m0;
    public TransitionListener[] n0;
    public EpicenterCallback w0;
    public static final Animator[] y0 = new Animator[0];
    public static final int[] z0 = {2, 1, 3, 4};
    public static final PathMotion A0 = new AnonymousClass1();
    public static final ThreadLocal B0 = new ThreadLocal();
    public final String X = getClass().getName();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f8426Y = -1;
    public long Z = -1;
    public TimeInterpolator e0 = null;
    public final ArrayList f0 = new ArrayList();
    public final ArrayList g0 = new ArrayList();
    public TransitionValuesMaps h0 = new TransitionValuesMaps();
    public TransitionValuesMaps i0 = new TransitionValuesMaps();
    public TransitionSet j0 = null;
    public final int[] k0 = z0;
    public final ArrayList o0 = new ArrayList();
    public Animator[] p0 = y0;
    public int q0 = 0;
    public boolean r0 = false;
    public boolean s0 = false;
    public Transition t0 = null;
    public ArrayList u0 = null;
    public ArrayList v0 = new ArrayList();
    public PathMotion x0 = A0;

    /* JADX INFO: renamed from: androidx.transition.Transition$1, reason: invalid class name */
    public class AnonymousClass1 extends PathMotion {
        @Override // androidx.transition.PathMotion
        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public static class AnimationInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f8428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TransitionValues f8430c;
        public WindowId d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Transition f8431e;
        public Animator f;
    }

    public static class ArrayListManager {
    }

    public static abstract class EpicenterCallback {
    }

    public static class Impl26 {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    public class SeekController extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {
        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }
    }

    public interface TransitionListener {
        void a();

        default void b(Transition transition) {
            e(transition);
        }

        default void c(Transition transition) {
            f(transition);
        }

        void d();

        void e(Transition transition);

        void f(Transition transition);

        void g(Transition transition);
    }

    public interface TransitionNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f8433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f8434c;
        public static final a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f8435e;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.transition.a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.transition.a] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.a] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.transition.a] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.transition.a] */
        static {
            final int i2 = 0;
            f8432a = new TransitionNotification() { // from class: androidx.transition.a
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i2) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.c(transition);
                            break;
                        case 2:
                            transitionListener.g(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i3 = 1;
            f8433b = new TransitionNotification() { // from class: androidx.transition.a
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i3) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.c(transition);
                            break;
                        case 2:
                            transitionListener.g(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i4 = 2;
            f8434c = new TransitionNotification() { // from class: androidx.transition.a
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i4) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.c(transition);
                            break;
                        case 2:
                            transitionListener.g(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i5 = 3;
            d = new TransitionNotification() { // from class: androidx.transition.a
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i5) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.c(transition);
                            break;
                        case 2:
                            transitionListener.g(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i6 = 4;
            f8435e = new TransitionNotification() { // from class: androidx.transition.a
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i6) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.c(transition);
                            break;
                        case 2:
                            transitionListener.g(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
        }

        void a(TransitionListener transitionListener, Transition transition, boolean z2);
    }

    public static void d(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        transitionValuesMaps.f8448a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = transitionValuesMaps.f8449b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strO = ViewCompat.o(view);
        if (strO != null) {
            ArrayMap arrayMap = transitionValuesMaps.d;
            if (arrayMap.containsKey(strO)) {
                arrayMap.put(strO, null);
            } else {
                arrayMap.put(strO, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                LongSparseArray longSparseArray = transitionValuesMaps.f8450c;
                if (longSparseArray.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    longSparseArray.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) longSparseArray.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    longSparseArray.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayMap s() {
        ThreadLocal threadLocal = B0;
        ArrayMap arrayMap = (ArrayMap) threadLocal.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(arrayMap2);
        return arrayMap2;
    }

    public static boolean y(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.f8445a.get(str);
        Object obj2 = transitionValues2.f8445a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(ViewGroup viewGroup) {
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.p0);
        this.p0 = y0;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.p0 = animatorArr;
        z(this, TransitionNotification.d, false);
        this.r0 = true;
    }

    public Transition B(TransitionListener transitionListener) {
        Transition transition;
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.t0) != null) {
                transition.B(transitionListener);
            }
            if (this.u0.size() == 0) {
                this.u0 = null;
            }
        }
        return this;
    }

    public void C(View view) {
        this.g0.remove(view);
    }

    public void D(View view) {
        if (this.r0) {
            if (!this.s0) {
                ArrayList arrayList = this.o0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.p0);
                this.p0 = y0;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.p0 = animatorArr;
                z(this, TransitionNotification.f8435e, false);
            }
            this.r0 = false;
        }
    }

    public void E() {
        L();
        final ArrayMap arrayMapS = s();
        for (Animator animator : this.v0) {
            if (arrayMapS.containsKey(animator)) {
                L();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            arrayMapS.remove(animator2);
                            Transition.this.o0.remove(animator2);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator2) {
                            Transition.this.o0.add(animator2);
                        }
                    });
                    long j = this.Z;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f8426Y;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.e0;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            Transition.this.p();
                            animator2.removeListener(this);
                        }
                    });
                    animator.start();
                }
            }
        }
        this.v0.clear();
        p();
    }

    public void F(long j) {
        this.Z = j;
    }

    public void G(EpicenterCallback epicenterCallback) {
        this.w0 = epicenterCallback;
    }

    public void H(TimeInterpolator timeInterpolator) {
        this.e0 = timeInterpolator;
    }

    public void I(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.x0 = A0;
        } else {
            this.x0 = pathMotion;
        }
    }

    public void K(long j) {
        this.f8426Y = j;
    }

    public final void L() {
        if (this.q0 == 0) {
            z(this, TransitionNotification.f8432a, false);
            this.s0 = false;
        }
        this.q0++;
    }

    public String M(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.Z != -1) {
            sb.append("dur(");
            sb.append(this.Z);
            sb.append(") ");
        }
        if (this.f8426Y != -1) {
            sb.append("dly(");
            sb.append(this.f8426Y);
            sb.append(") ");
        }
        if (this.e0 != null) {
            sb.append("interp(");
            sb.append(this.e0);
            sb.append(") ");
        }
        ArrayList arrayList = this.f0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.g0;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void b(TransitionListener transitionListener) {
        if (this.u0 == null) {
            this.u0 = new ArrayList();
        }
        this.u0.add(transitionListener);
    }

    public void c(View view) {
        this.g0.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.p0);
        this.p0 = y0;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.p0 = animatorArr;
        z(this, TransitionNotification.f8434c, false);
    }

    public abstract void e(TransitionValues transitionValues);

    public final void f(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            TransitionValues transitionValues = new TransitionValues(view);
            if (z2) {
                h(transitionValues);
            } else {
                e(transitionValues);
            }
            transitionValues.f8447c.add(this);
            g(transitionValues);
            if (z2) {
                d(this.h0, view, transitionValues);
            } else {
                d(this.i0, view, transitionValues);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    public void g(TransitionValues transitionValues) {
    }

    public abstract void h(TransitionValues transitionValues);

    public final void i(ViewGroup viewGroup, boolean z2) {
        j(z2);
        ArrayList arrayList = this.f0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.g0;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (viewFindViewById != null) {
                TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                if (z2) {
                    h(transitionValues);
                } else {
                    e(transitionValues);
                }
                transitionValues.f8447c.add(this);
                g(transitionValues);
                if (z2) {
                    d(this.h0, viewFindViewById, transitionValues);
                } else {
                    d(this.i0, viewFindViewById, transitionValues);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z2) {
                h(transitionValues2);
            } else {
                e(transitionValues2);
            }
            transitionValues2.f8447c.add(this);
            g(transitionValues2);
            if (z2) {
                d(this.h0, view, transitionValues2);
            } else {
                d(this.i0, view, transitionValues2);
            }
        }
    }

    public final void j(boolean z2) {
        if (z2) {
            this.h0.f8448a.clear();
            this.h0.f8449b.clear();
            this.h0.f8450c.b();
        } else {
            this.i0.f8448a.clear();
            this.i0.f8449b.clear();
            this.i0.f8450c.b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.v0 = new ArrayList();
            transition.h0 = new TransitionValuesMaps();
            transition.i0 = new TransitionValuesMaps();
            transition.l0 = null;
            transition.m0 = null;
            transition.t0 = this;
            transition.u0 = null;
            return transition;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator l(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public void m(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int i3;
        View view;
        TransitionValues transitionValues;
        Animator animator;
        TransitionValues transitionValues2;
        ArrayMap arrayMapS = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        r().getClass();
        int i4 = 0;
        while (i4 < size) {
            TransitionValues transitionValues3 = (TransitionValues) arrayList.get(i4);
            TransitionValues transitionValues4 = (TransitionValues) arrayList2.get(i4);
            if (transitionValues3 != null && !transitionValues3.f8447c.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f8447c.contains(this)) {
                transitionValues4 = null;
            }
            if ((transitionValues3 != null || transitionValues4 != null) && (transitionValues3 == null || transitionValues4 == null || w(transitionValues3, transitionValues4))) {
                Animator animatorL = l(viewGroup, transitionValues3, transitionValues4);
                if (animatorL != null) {
                    String str = this.X;
                    if (transitionValues4 != null) {
                        view = transitionValues4.f8446b;
                        String[] strArrT = t();
                        if (strArrT != null && strArrT.length > 0) {
                            transitionValues2 = new TransitionValues(view);
                            TransitionValues transitionValues5 = (TransitionValues) transitionValuesMaps2.f8448a.get(view);
                            i2 = size;
                            if (transitionValues5 != null) {
                                int i5 = 0;
                                while (i5 < strArrT.length) {
                                    HashMap map = transitionValues2.f8445a;
                                    int i6 = i4;
                                    String str2 = strArrT[i5];
                                    map.put(str2, transitionValues5.f8445a.get(str2));
                                    i5++;
                                    i4 = i6;
                                }
                            }
                            i3 = i4;
                            int i7 = arrayMapS.Z;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = animatorL;
                                    break;
                                }
                                AnimationInfo animationInfo = (AnimationInfo) arrayMapS.get((Animator) arrayMapS.f(i8));
                                if (animationInfo.f8430c != null && animationInfo.f8428a == view && animationInfo.f8429b.equals(str) && animationInfo.f8430c.equals(transitionValues2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i2 = size;
                            i3 = i4;
                            animator = animatorL;
                            transitionValues2 = null;
                        }
                        animatorL = animator;
                        transitionValues = transitionValues2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = transitionValues3.f8446b;
                        transitionValues = null;
                    }
                    if (animatorL != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        AnimationInfo animationInfo2 = new AnimationInfo();
                        animationInfo2.f8428a = view;
                        animationInfo2.f8429b = str;
                        animationInfo2.f8430c = transitionValues;
                        animationInfo2.d = windowId;
                        animationInfo2.f8431e = this;
                        animationInfo2.f = animatorL;
                        arrayMapS.put(animatorL, animationInfo2);
                        this.v0.add(animatorL);
                    }
                }
                i4 = i3 + 1;
                size = i2;
            }
            i2 = size;
            i3 = i4;
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                AnimationInfo animationInfo3 = (AnimationInfo) arrayMapS.get((Animator) this.v0.get(sparseIntArray.keyAt(i9)));
                animationInfo3.f.setStartDelay(animationInfo3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i9)) - Long.MAX_VALUE));
            }
        }
    }

    public final void p() {
        int i2 = this.q0 - 1;
        this.q0 = i2;
        if (i2 == 0) {
            z(this, TransitionNotification.f8433b, false);
            for (int i3 = 0; i3 < this.h0.f8450c.i(); i3++) {
                View view = (View) this.h0.f8450c.j(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.i0.f8450c.i(); i4++) {
                View view2 = (View) this.i0.f8450c.j(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.s0 = true;
        }
    }

    public final TransitionValues q(View view, boolean z2) {
        TransitionSet transitionSet = this.j0;
        if (transitionSet != null) {
            return transitionSet.q(view, z2);
        }
        ArrayList arrayList = z2 ? this.l0 : this.m0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            TransitionValues transitionValues = (TransitionValues) arrayList.get(i2);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.f8446b == view) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return (TransitionValues) (z2 ? this.m0 : this.l0).get(i2);
        }
        return null;
    }

    public final Transition r() {
        TransitionSet transitionSet = this.j0;
        return transitionSet != null ? transitionSet.r() : this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return M("");
    }

    public final TransitionValues u(View view, boolean z2) {
        TransitionSet transitionSet = this.j0;
        if (transitionSet != null) {
            return transitionSet.u(view, z2);
        }
        return (TransitionValues) (z2 ? this.h0 : this.i0).f8448a.get(view);
    }

    public boolean v() {
        return !this.o0.isEmpty();
    }

    public boolean w(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            String[] strArrT = t();
            if (strArrT != null) {
                for (String str : strArrT) {
                    if (y(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = transitionValues.f8445a.keySet().iterator();
                while (it.hasNext()) {
                    if (y(transitionValues, transitionValues2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.g0;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void z(Transition transition, TransitionNotification transitionNotification, boolean z2) {
        Transition transition2 = this.t0;
        if (transition2 != null) {
            transition2.z(transition, transitionNotification, z2);
        }
        ArrayList arrayList = this.u0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.u0.size();
        TransitionListener[] transitionListenerArr = this.n0;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.n0 = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.u0.toArray(transitionListenerArr);
        for (int i2 = 0; i2 < size; i2++) {
            transitionNotification.a(transitionListenerArr2[i2], transition, z2);
            transitionListenerArr2[i2] = null;
        }
        this.n0 = transitionListenerArr2;
    }

    public void J() {
    }
}
