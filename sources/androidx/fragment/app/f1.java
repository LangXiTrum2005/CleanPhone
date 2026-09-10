package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f4317a;

    public f1(g1 g1Var) {
        this.f4317a = g1Var;
    }

    @Override // androidx.fragment.app.d1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        g1 g1Var = this.f4317a;
        ArrayList arrayList3 = g1Var.f4334n;
        if (g1.J(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + g1Var.f4322a);
        }
        boolean zS = false;
        if (g1Var.f4325d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
        } else {
            a aVar = (a) l1.d.d(g1Var.f4325d, 1);
            g1Var.f4329h = aVar;
            Iterator it = aVar.f4226a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((q1) it.next()).f4447b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            zS = g1Var.S(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(g1.E((a) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zS;
    }
}
