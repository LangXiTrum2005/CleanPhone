package androidx.transition;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TransitionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoTransition f8436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f8437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f8438c;

    public static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public Transition X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ViewGroup f8439Y;

        /* JADX WARN: Code duplicated, block: B:101:0x020d  */
        /* JADX WARN: Code duplicated, block: B:103:0x021b  */
        /* JADX WARN: Code duplicated, block: B:104:0x0227  */
        /* JADX WARN: Code duplicated, block: B:108:0x0239  */
        /* JADX WARN: Code duplicated, block: B:135:0x01e5 A[EDGE_INSN: B:135:0x01e5->B:91:0x01e5 BREAK  A[LOOP:1: B:19:0x0083->B:90:0x01db], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:165:0x0205 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:29:0x0095  */
        /* JADX WARN: Code duplicated, block: B:30:0x009a  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:50:0x010b  */
        /* JADX WARN: Code duplicated, block: B:63:0x0152  */
        /* JADX WARN: Code duplicated, block: B:65:0x015e  */
        /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:80:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:94:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            Transition transition;
            int i2;
            TransitionValuesMaps transitionValuesMaps;
            TransitionValuesMaps transitionValuesMaps2;
            ArrayMap arrayMap;
            ArrayMap arrayMap2;
            int i3;
            int[] iArr;
            boolean z2;
            int i4;
            int i5;
            ArrayMap arrayMapS;
            int i6;
            Animator animator;
            Transition.AnimationInfo animationInfo;
            View view;
            TransitionValues transitionValues;
            TransitionValues transitionValues2;
            int i7;
            TransitionValuesMaps transitionValuesMaps3;
            boolean z3;
            int i8;
            View view2;
            TransitionValues transitionValues3;
            ArrayMap arrayMap3;
            int i9;
            int i10;
            View view3;
            View view4;
            SparseArray sparseArray;
            int size;
            int i11;
            View view5;
            View view6;
            LongSparseArray longSparseArray;
            int i12;
            int i13;
            View view7;
            TransitionValuesMaps transitionValuesMaps4;
            Iterator it;
            ViewGroup viewGroup = this.f8439Y;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList arrayList2 = TransitionManager.f8438c;
            ViewGroup viewGroup2 = this.f8439Y;
            boolean z4 = true;
            if (!arrayList2.remove(viewGroup2)) {
                return true;
            }
            final ArrayMap arrayMapB = TransitionManager.b();
            ArrayList arrayList3 = (ArrayList) arrayMapB.get(viewGroup2);
            if (arrayList3 != null) {
                arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
                transition = this.X;
                arrayList3.add(transition);
                transition.b(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public final void f(Transition transition2) {
                        ((ArrayList) arrayMapB.get(MultiListener.this.f8439Y)).remove(transition2);
                        transition2.B(this);
                    }
                });
                i2 = 0;
                transition.i(viewGroup2, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).D(viewGroup2);
                    }
                }
                transition.l0 = new ArrayList();
                transition.m0 = new ArrayList();
                transitionValuesMaps = transition.h0;
                transitionValuesMaps2 = transition.i0;
                arrayMap = new ArrayMap(transitionValuesMaps.f8448a);
                arrayMap2 = new ArrayMap(transitionValuesMaps2.f8448a);
                i3 = 0;
                while (true) {
                    iArr = transition.k0;
                    if (i3 < iArr.length) {
                        break;
                    }
                    i7 = iArr[i3];
                    if (i7 != z4) {
                        transitionValuesMaps3 = transitionValuesMaps;
                        z3 = z4;
                        for (i8 = arrayMap.Z - 1; i8 >= 0; i8--) {
                            view2 = (View) arrayMap.f(i8);
                            if (view2 == null && transition.x(view2) && (transitionValues3 = (TransitionValues) arrayMap2.remove(view2)) != null && transition.x(transitionValues3.f8446b)) {
                                transition.l0.add((TransitionValues) arrayMap.h(i8));
                                transition.m0.add(transitionValues3);
                            }
                        }
                    } else if (i7 != 2) {
                        transitionValuesMaps3 = transitionValuesMaps;
                        z3 = z4;
                        arrayMap3 = transitionValuesMaps3.d;
                        ArrayMap arrayMap4 = transitionValuesMaps2.d;
                        i9 = arrayMap3.Z;
                        for (i10 = 0; i10 < i9; i10++) {
                            view3 = (View) arrayMap3.j(i10);
                            if (view3 == null && transition.x(view3) && (view4 = (View) arrayMap4.get(arrayMap3.f(i10))) != null && transition.x(view4)) {
                                TransitionValues transitionValues4 = (TransitionValues) arrayMap.get(view3);
                                TransitionValues transitionValues5 = (TransitionValues) arrayMap2.get(view4);
                                if (transitionValues4 != null && transitionValues5 != null) {
                                    transition.l0.add(transitionValues4);
                                    transition.m0.add(transitionValues5);
                                    arrayMap.remove(view3);
                                    arrayMap2.remove(view4);
                                }
                            }
                        }
                    } else if (i7 != 3) {
                        transitionValuesMaps3 = transitionValuesMaps;
                        z3 = z4;
                        sparseArray = transitionValuesMaps3.f8449b;
                        SparseArray sparseArray2 = transitionValuesMaps2.f8449b;
                        size = sparseArray.size();
                        for (i11 = 0; i11 < size; i11++) {
                            view5 = (View) sparseArray.valueAt(i11);
                            if (view5 == null && transition.x(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && transition.x(view6)) {
                                TransitionValues transitionValues6 = (TransitionValues) arrayMap.get(view5);
                                TransitionValues transitionValues7 = (TransitionValues) arrayMap2.get(view6);
                                if (transitionValues6 != null && transitionValues7 != null) {
                                    transition.l0.add(transitionValues6);
                                    transition.m0.add(transitionValues7);
                                    arrayMap.remove(view5);
                                    arrayMap2.remove(view6);
                                }
                            }
                        }
                    } else if (i7 != 4) {
                        transitionValuesMaps3 = transitionValuesMaps;
                        z3 = z4;
                    } else {
                        longSparseArray = transitionValuesMaps.f8450c;
                        i12 = longSparseArray.i();
                        i13 = i2;
                        while (i13 < i12) {
                            view7 = (View) longSparseArray.j(i13);
                            if (view7 == null && transition.x(view7)) {
                                transitionValuesMaps4 = transitionValuesMaps;
                                View view8 = (View) transitionValuesMaps2.f8450c.d(longSparseArray.g(i13));
                                if (view8 != null && transition.x(view8)) {
                                    TransitionValues transitionValues8 = (TransitionValues) arrayMap.get(view7);
                                    TransitionValues transitionValues9 = (TransitionValues) arrayMap2.get(view8);
                                    if (transitionValues8 != null && transitionValues9 != null) {
                                        transition.l0.add(transitionValues8);
                                        transition.m0.add(transitionValues9);
                                        arrayMap.remove(view7);
                                        arrayMap2.remove(view8);
                                    }
                                }
                                i13++;
                                transitionValuesMaps = transitionValuesMaps4;
                                z4 = z4;
                            } else {
                                transitionValuesMaps4 = transitionValuesMaps;
                            }
                            i13++;
                            transitionValuesMaps = transitionValuesMaps4;
                            z4 = z4;
                        }
                        z3 = z4;
                        transitionValuesMaps3 = transitionValuesMaps;
                    }
                    i3++;
                    transitionValuesMaps = transitionValuesMaps3;
                    z4 = z3;
                    i2 = 0;
                }
                z2 = z4;
                for (i4 = 0; i4 < arrayMap.Z; i4++) {
                    transitionValues2 = (TransitionValues) arrayMap.j(i4);
                    if (transition.x(transitionValues2.f8446b)) {
                        transition.l0.add(transitionValues2);
                        transition.m0.add(null);
                    }
                }
                for (i5 = 0; i5 < arrayMap2.Z; i5++) {
                    transitionValues = (TransitionValues) arrayMap2.j(i5);
                    if (transition.x(transitionValues.f8446b)) {
                        transition.m0.add(transitionValues);
                        transition.l0.add(null);
                    }
                }
                arrayMapS = Transition.s();
                int i14 = arrayMapS.Z;
                WindowId windowId = viewGroup2.getWindowId();
                i6 = i14 - 1;
                while (i6 >= 0) {
                    animator = (Animator) arrayMapS.f(i6);
                    if (animator == null && (animationInfo = (Transition.AnimationInfo) arrayMapS.get(animator)) != null && (view = animationInfo.f8428a) != null && windowId.equals(animationInfo.d)) {
                        boolean z5 = z2;
                        TransitionValues transitionValuesU = transition.u(view, z5);
                        TransitionValues transitionValuesQ = transition.q(view, z5);
                        if (transitionValuesU == null && transitionValuesQ == null) {
                            transitionValuesQ = (TransitionValues) transition.i0.f8448a.get(view);
                        }
                        if (transitionValuesU != null || transitionValuesQ != null) {
                            TransitionValues transitionValues10 = animationInfo.f8430c;
                            Transition transition2 = animationInfo.f8431e;
                            if (transition2.w(transitionValues10, transitionValuesQ)) {
                                transition2.r().getClass();
                                if (animator.isRunning() || animator.isStarted()) {
                                    animator.cancel();
                                } else {
                                    arrayMapS.remove(animator);
                                }
                            }
                        }
                    }
                    i6--;
                    z2 = true;
                }
                transition.m(viewGroup2, transition.h0, transition.i0, transition.l0, transition.m0);
                transition.E();
                return true;
            }
            arrayList3 = new ArrayList();
            arrayMapB.put(viewGroup2, arrayList3);
            transition = this.X;
            arrayList3.add(transition);
            transition.b(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void f(Transition transition3) {
                    ((ArrayList) arrayMapB.get(MultiListener.this.f8439Y)).remove(transition3);
                    transition3.B(this);
                }
            });
            i2 = 0;
            transition.i(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).D(viewGroup2);
                }
            }
            transition.l0 = new ArrayList();
            transition.m0 = new ArrayList();
            transitionValuesMaps = transition.h0;
            transitionValuesMaps2 = transition.i0;
            arrayMap = new ArrayMap(transitionValuesMaps.f8448a);
            arrayMap2 = new ArrayMap(transitionValuesMaps2.f8448a);
            i3 = 0;
            while (true) {
                iArr = transition.k0;
                if (i3 < iArr.length) {
                    break;
                    break;
                }
                i7 = iArr[i3];
                if (i7 != z4) {
                    transitionValuesMaps3 = transitionValuesMaps;
                    z3 = z4;
                    while (i8 >= 0) {
                        view2 = (View) arrayMap.f(i8);
                        if (view2 == null) {
                        }
                    }
                } else if (i7 != 2) {
                    transitionValuesMaps3 = transitionValuesMaps;
                    z3 = z4;
                    arrayMap3 = transitionValuesMaps3.d;
                    ArrayMap arrayMap5 = transitionValuesMaps2.d;
                    i9 = arrayMap3.Z;
                    while (i10 < i9) {
                        view3 = (View) arrayMap3.j(i10);
                        if (view3 == null) {
                        }
                    }
                } else if (i7 != 3) {
                    transitionValuesMaps3 = transitionValuesMaps;
                    z3 = z4;
                    sparseArray = transitionValuesMaps3.f8449b;
                    SparseArray sparseArray3 = transitionValuesMaps2.f8449b;
                    size = sparseArray.size();
                    while (i11 < size) {
                        view5 = (View) sparseArray.valueAt(i11);
                        if (view5 == null) {
                        }
                    }
                } else if (i7 != 4) {
                    transitionValuesMaps3 = transitionValuesMaps;
                    z3 = z4;
                } else {
                    longSparseArray = transitionValuesMaps.f8450c;
                    i12 = longSparseArray.i();
                    i13 = i2;
                    while (i13 < i12) {
                        view7 = (View) longSparseArray.j(i13);
                        if (view7 == null) {
                            transitionValuesMaps4 = transitionValuesMaps;
                        } else {
                            transitionValuesMaps4 = transitionValuesMaps;
                        }
                        i13++;
                        transitionValuesMaps = transitionValuesMaps4;
                        z4 = z4;
                    }
                    z3 = z4;
                    transitionValuesMaps3 = transitionValuesMaps;
                }
                i3++;
                transitionValuesMaps = transitionValuesMaps3;
                z4 = z3;
                i2 = 0;
            }
            z2 = z4;
            while (i4 < arrayMap.Z) {
                transitionValues2 = (TransitionValues) arrayMap.j(i4);
                if (transition.x(transitionValues2.f8446b)) {
                    transition.l0.add(transitionValues2);
                    transition.m0.add(null);
                }
            }
            while (i5 < arrayMap2.Z) {
                transitionValues = (TransitionValues) arrayMap2.j(i5);
                if (transition.x(transitionValues.f8446b)) {
                    transition.m0.add(transitionValues);
                    transition.l0.add(null);
                }
            }
            arrayMapS = Transition.s();
            int i15 = arrayMapS.Z;
            WindowId windowId2 = viewGroup2.getWindowId();
            i6 = i15 - 1;
            while (i6 >= 0) {
                animator = (Animator) arrayMapS.f(i6);
                if (animator == null) {
                }
                i6--;
                z2 = true;
            }
            transition.m(viewGroup2, transition.h0, transition.i0, transition.l0, transition.m0);
            transition.E();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f8439Y;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList arrayList = TransitionManager.f8438c;
            ViewGroup viewGroup2 = this.f8439Y;
            arrayList.remove(viewGroup2);
            ArrayList arrayList2 = (ArrayList) TransitionManager.b().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).D(viewGroup2);
                }
            }
            this.X.j(true);
        }
    }

    static {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.D0 = false;
        autoTransition.N(new Fade(2));
        autoTransition.N(new ChangeBounds());
        autoTransition.N(new Fade(1));
        f8436a = autoTransition;
        f8437b = new ThreadLocal();
        f8438c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = f8438c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f8436a;
        }
        Transition transitionClone = transition.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).A(viewGroup);
            }
        }
        transitionClone.i(viewGroup, true);
        if (((Scene) viewGroup.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_current_scene)) != null) {
            throw null;
        }
        viewGroup.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_current_scene, null);
        MultiListener multiListener = new MultiListener();
        multiListener.X = transitionClone;
        multiListener.f8439Y = viewGroup;
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    public static ArrayMap b() {
        ArrayMap arrayMap;
        ThreadLocal threadLocal = f8437b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }
}
