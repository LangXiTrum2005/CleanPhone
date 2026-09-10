package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w1 f4481e;

    public u1(w1 w1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f4481e = w1Var;
        this.f4477a = obj;
        this.f4478b = arrayList;
        this.f4479c = obj2;
        this.f4480d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        w1 w1Var = this.f4481e;
        Object obj = this.f4477a;
        if (obj != null) {
            w1Var.u(obj, this.f4478b, null);
        }
        Object obj2 = this.f4479c;
        if (obj2 != null) {
            w1Var.u(obj2, this.f4480d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
