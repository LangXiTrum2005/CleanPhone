package androidx.transition;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition {
    public int E0;
    public ArrayList C0 = new ArrayList();
    public boolean D0 = true;
    public boolean F0 = false;
    public int G0 = 0;

    /* JADX INFO: renamed from: androidx.transition.TransitionSet$2, reason: invalid class name */
    class AnonymousClass2 extends TransitionListenerAdapter {
        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
            throw null;
        }
    }

    public static class TransitionSetListener extends TransitionListenerAdapter {
        public TransitionSet X;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void e(Transition transition) {
            TransitionSet transitionSet = this.X;
            if (transitionSet.F0) {
                return;
            }
            transitionSet.L();
            transitionSet.F0 = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            TransitionSet transitionSet = this.X;
            int i2 = transitionSet.E0 - 1;
            transitionSet.E0 = i2;
            if (i2 == 0) {
                transitionSet.F0 = false;
                transitionSet.p();
            }
            transition.B(this);
        }
    }

    @Override // androidx.transition.Transition
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.C0.get(i2)).A(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition B(Transition.TransitionListener transitionListener) {
        super.B(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void C(View view) {
        for (int i2 = 0; i2 < this.C0.size(); i2++) {
            ((Transition) this.C0.get(i2)).C(view);
        }
        this.g0.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void D(View view) {
        super.D(view);
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.C0.get(i2)).D(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void E() {
        if (this.C0.isEmpty()) {
            L();
            p();
            return;
        }
        TransitionSetListener transitionSetListener = new TransitionSetListener();
        transitionSetListener.X = this;
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).b(transitionSetListener);
        }
        this.E0 = this.C0.size();
        if (this.D0) {
            Iterator it2 = this.C0.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).E();
            }
            return;
        }
        for (int i2 = 1; i2 < this.C0.size(); i2++) {
            Transition transition = (Transition) this.C0.get(i2 - 1);
            final Transition transition2 = (Transition) this.C0.get(i2);
            transition.b(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void f(Transition transition3) {
                    transition2.E();
                    transition3.B(this);
                }
            });
        }
        Transition transition3 = (Transition) this.C0.get(0);
        if (transition3 != null) {
            transition3.E();
        }
    }

    @Override // androidx.transition.Transition
    public final void F(long j) {
        ArrayList arrayList;
        this.Z = j;
        if (j < 0 || (arrayList = this.C0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.C0.get(i2)).F(j);
        }
    }

    @Override // androidx.transition.Transition
    public final void G(Transition.EpicenterCallback epicenterCallback) {
        this.w0 = epicenterCallback;
        this.G0 |= 8;
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.C0.get(i2)).G(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public final void H(TimeInterpolator timeInterpolator) {
        this.G0 |= 1;
        ArrayList arrayList = this.C0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Transition) this.C0.get(i2)).H(timeInterpolator);
            }
        }
        this.e0 = timeInterpolator;
    }

    @Override // androidx.transition.Transition
    public final void I(PathMotion pathMotion) {
        super.I(pathMotion);
        this.G0 |= 4;
        if (this.C0 != null) {
            for (int i2 = 0; i2 < this.C0.size(); i2++) {
                ((Transition) this.C0.get(i2)).I(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void J() {
        this.G0 |= 2;
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.C0.get(i2)).J();
        }
    }

    @Override // androidx.transition.Transition
    public final void K(long j) {
        this.f8426Y = j;
    }

    @Override // androidx.transition.Transition
    public final String M(String str) {
        String strM = super.M(str);
        for (int i2 = 0; i2 < this.C0.size(); i2++) {
            StringBuilder sbX = android.support.v4.media.a.x(strM, IOUtils.LINE_SEPARATOR_UNIX);
            sbX.append(((Transition) this.C0.get(i2)).M(str + "  "));
            strM = sbX.toString();
        }
        return strM;
    }

    public final void N(Transition transition) {
        this.C0.add(transition);
        transition.j0 = this;
        long j = this.Z;
        if (j >= 0) {
            transition.F(j);
        }
        if ((this.G0 & 1) != 0) {
            transition.H(this.e0);
        }
        if ((this.G0 & 2) != 0) {
            transition.J();
        }
        if ((this.G0 & 4) != 0) {
            transition.I(this.x0);
        }
        if ((this.G0 & 8) != 0) {
            transition.G(this.w0);
        }
    }

    @Override // androidx.transition.Transition
    public final void c(View view) {
        for (int i2 = 0; i2 < this.C0.size(); i2++) {
            ((Transition) this.C0.get(i2)).c(view);
        }
        this.g0.add(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.C0.get(i2)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public final void e(TransitionValues transitionValues) {
        if (x(transitionValues.f8446b)) {
            for (Transition transition : this.C0) {
                if (transition.x(transitionValues.f8446b)) {
                    transition.e(transitionValues);
                    transitionValues.f8447c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.C0.get(i2)).g(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        if (x(transitionValues.f8446b)) {
            for (Transition transition : this.C0) {
                if (transition.x(transitionValues.f8446b)) {
                    transition.h(transitionValues);
                    transitionValues.f8447c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: k */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.C0 = new ArrayList();
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transitionClone = ((Transition) this.C0.get(i2)).clone();
            transitionSet.C0.add(transitionClone);
            transitionClone.j0 = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void m(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f8426Y;
        int size = this.C0.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = (Transition) this.C0.get(i2);
            if (j > 0 && (this.D0 || i2 == 0)) {
                long j2 = transition.f8426Y;
                if (j2 > 0) {
                    transition.K(j2 + j);
                } else {
                    transition.K(j);
                }
            }
            transition.m(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        for (int i2 = 0; i2 < this.C0.size(); i2++) {
            if (((Transition) this.C0.get(i2)).v()) {
                return true;
            }
        }
        return false;
    }
}
