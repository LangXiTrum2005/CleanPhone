package o4;

import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import cc.a2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m0.s0;
import m0.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f47141s = {2, 1, 3, 4};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ne.c f47142t = new ne.c(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ThreadLocal f47143u = new ThreadLocal();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f47152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f47153j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f47159q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47144a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47145b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f47146c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f47147d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k5.g f47148e = new k5.g(12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k5.g f47149f = new k5.g(12);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f47150g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f47151h = f47141s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f47154k = new ArrayList();
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f47155m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47156n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f47157o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f47158p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ne.c f47160r = f47142t;

    public static void c(k5.g gVar, View view, x xVar) {
        x.e eVar = (x.e) gVar.f44325a;
        x.e eVar2 = (x.e) gVar.f44328d;
        SparseArray sparseArray = (SparseArray) gVar.f44326b;
        x.g gVar2 = (x.g) gVar.f44327c;
        eVar.put(view, xVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = s0.f45746a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (eVar2.containsKey(transitionName)) {
                eVar2.put(transitionName, null);
            } else {
                eVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gVar2.f53498a) {
                    int i10 = gVar2.f53501d;
                    long[] jArr = gVar2.f53499b;
                    Object[] objArr = gVar2.f53500c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        Object obj = objArr[i12];
                        if (obj != x.h.f53502a) {
                            if (i12 != i11) {
                                jArr[i11] = jArr[i12];
                                objArr[i11] = obj;
                                objArr[i12] = null;
                            }
                            i11++;
                        }
                    }
                    gVar2.f53498a = false;
                    gVar2.f53501d = i11;
                }
                if (y.a.b(gVar2.f53499b, gVar2.f53501d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar2.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar2.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar2.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static x.e o() {
        ThreadLocal threadLocal = f47143u;
        x.e eVar = (x.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        x.e eVar2 = new x.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean t(x xVar, x xVar2, String str) {
        Object obj = xVar.f47173a.get(str);
        Object obj2 = xVar2.f47173a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void B(ne.c cVar) {
        if (cVar == null) {
            this.f47160r = f47142t;
        } else {
            this.f47160r = cVar;
        }
    }

    public void D(long j10) {
        this.f47145b = j10;
    }

    public final void E() {
        if (this.l == 0) {
            ArrayList arrayList = this.f47157o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f47157o.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q) arrayList2.get(i10)).e(this);
                }
            }
            this.f47156n = false;
        }
        this.l++;
    }

    public String F(String str) {
        StringBuilder sbI = d5.u.i(str);
        sbI.append(getClass().getSimpleName());
        sbI.append("@");
        sbI.append(Integer.toHexString(hashCode()));
        sbI.append(": ");
        String string = sbI.toString();
        if (this.f47145b != -1) {
            string = defpackage.e.r(d5.u.j(string, "dly("), this.f47145b, ") ");
        }
        ArrayList arrayList = this.f47146c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f47147d;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strH = wi.d.h(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strH = wi.d.h(strH, ", ");
                }
                StringBuilder sbI2 = d5.u.i(strH);
                sbI2.append(arrayList.get(i10));
                strH = sbI2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strH = wi.d.h(strH, ", ");
                }
                StringBuilder sbI3 = d5.u.i(strH);
                sbI3.append(arrayList2.get(i11));
                strH = sbI3.toString();
            }
        }
        return wi.d.h(strH, ")");
    }

    public void a(q qVar) {
        if (this.f47157o == null) {
            this.f47157o = new ArrayList();
        }
        this.f47157o.add(qVar);
    }

    public void b(View view) {
        this.f47147d.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f47154k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f47157o;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f47157o.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((q) arrayList3.get(i10)).b();
        }
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z10) {
                g(xVar);
            } else {
                d(xVar);
            }
            xVar.f47175c.add(this);
            f(xVar);
            if (z10) {
                c(this.f47148e, view, xVar);
            } else {
                c(this.f47149f, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public abstract void g(x xVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        ArrayList arrayList = this.f47146c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f47147d;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                x xVar = new x(viewFindViewById);
                if (z10) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f47175c.add(this);
                f(xVar);
                if (z10) {
                    c(this.f47148e, viewFindViewById, xVar);
                } else {
                    c(this.f47149f, viewFindViewById, xVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            x xVar2 = new x(view);
            if (z10) {
                g(xVar2);
            } else {
                d(xVar2);
            }
            xVar2.f47175c.add(this);
            f(xVar2);
            if (z10) {
                c(this.f47148e, view, xVar2);
            } else {
                c(this.f47149f, view, xVar2);
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            ((x.e) this.f47148e.f44325a).clear();
            ((SparseArray) this.f47148e.f44326b).clear();
            ((x.g) this.f47148e.f44327c).a();
        } else {
            ((x.e) this.f47149f.f44325a).clear();
            ((SparseArray) this.f47149f.f44326b).clear();
            ((x.g) this.f47149f.f44327c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public r clone() {
        try {
            r rVar = (r) super.clone();
            rVar.f47158p = new ArrayList();
            rVar.f47148e = new k5.g(12);
            rVar.f47149f = new k5.g(12);
            rVar.f47152i = null;
            rVar.f47153j = null;
            return rVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, k5.g gVar, k5.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i10;
        int i11;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        x.e eVarO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            x xVar3 = (x) arrayList.get(i12);
            x xVar4 = (x) arrayList2.get(i12);
            if (xVar3 != null && !xVar3.f47175c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f47175c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null) && ((xVar3 == null || xVar4 == null || r(xVar3, xVar4)) && (animatorK = k(viewGroup, xVar3, xVar4)) != null)) {
                String str = this.f47144a;
                if (xVar4 != null) {
                    view = xVar4.f47174b;
                    String[] strArrP = p();
                    if (strArrP != null && strArrP.length > 0) {
                        xVar2 = new x(view);
                        x xVar5 = (x) ((x.e) gVar2.f44325a).get(view);
                        i10 = size;
                        if (xVar5 != null) {
                            int i13 = 0;
                            while (i13 < strArrP.length) {
                                String str2 = strArrP[i13];
                                xVar2.f47173a.put(str2, xVar5.f47173a.get(str2));
                                i13++;
                                i12 = i12;
                                xVar5 = xVar5;
                            }
                        }
                        i11 = i12;
                        int i14 = eVarO.f53506c;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= i14) {
                                animator = animatorK;
                                break;
                            }
                            p pVar = (p) eVarO.get((Animator) eVarO.f(i15));
                            if (pVar.f47138c != null && pVar.f47136a == view && pVar.f47137b.equals(str) && pVar.f47138c.equals(xVar2)) {
                                animator = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        i10 = size;
                        i11 = i12;
                        animator = animatorK;
                        xVar2 = null;
                    }
                    animatorK = animator;
                    xVar = xVar2;
                } else {
                    i10 = size;
                    i11 = i12;
                    view = xVar3.f47174b;
                    xVar = null;
                }
                if (animatorK != null) {
                    c cVar = y.f47176a;
                    d0 d0Var = new d0(viewGroup);
                    p pVar2 = new p();
                    pVar2.f47136a = view;
                    pVar2.f47137b = str;
                    pVar2.f47138c = xVar;
                    pVar2.f47139d = d0Var;
                    pVar2.f47140e = this;
                    eVarO.put(animatorK, pVar2);
                    this.f47158p.add(animatorK);
                }
            } else {
                i10 = size;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator2 = (Animator) this.f47158p.get(sparseIntArray.keyAt(i16));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i16)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.l - 1;
        this.l = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f47157o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f47157o.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((q) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < ((x.g) this.f47148e.f44327c).e(); i12++) {
                View view = (View) ((x.g) this.f47148e.f44327c).f(i12);
                if (view != null) {
                    WeakHashMap weakHashMap = s0.f45746a;
                    view.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < ((x.g) this.f47149f.f44327c).e(); i13++) {
                View view2 = (View) ((x.g) this.f47149f.f44327c).f(i13);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = s0.f45746a;
                    view2.setHasTransientState(false);
                }
            }
            this.f47156n = true;
        }
    }

    public final x n(View view, boolean z10) {
        w wVar = this.f47150g;
        if (wVar != null) {
            return wVar.n(view, z10);
        }
        ArrayList arrayList = z10 ? this.f47152i : this.f47153j;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            x xVar = (x) arrayList.get(i10);
            if (xVar == null) {
                return null;
            }
            if (xVar.f47174b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (x) (z10 ? this.f47153j : this.f47152i).get(i10);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final x q(View view, boolean z10) {
        w wVar = this.f47150g;
        if (wVar != null) {
            return wVar.q(view, z10);
        }
        return (x) ((x.e) (z10 ? this.f47148e : this.f47149f).f44325a).get(view);
    }

    public boolean r(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] strArrP = p();
            if (strArrP != null) {
                for (String str : strArrP) {
                    if (t(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.f47173a.keySet().iterator();
                while (it.hasNext()) {
                    if (t(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean s(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f47146c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f47147d;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public final String toString() {
        return F("");
    }

    public void u(View view) {
        if (this.f47156n) {
            return;
        }
        ArrayList arrayList = this.f47154k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f47157o;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f47157o.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((q) arrayList3.get(i10)).a();
            }
        }
        this.f47155m = true;
    }

    public void v(q qVar) {
        ArrayList arrayList = this.f47157o;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(qVar);
        if (this.f47157o.size() == 0) {
            this.f47157o = null;
        }
    }

    public void w(View view) {
        this.f47147d.remove(view);
    }

    public void x(View view) {
        if (this.f47155m) {
            if (!this.f47156n) {
                ArrayList arrayList = this.f47154k;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f47157o;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f47157o.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((q) arrayList3.get(i10)).d();
                    }
                }
            }
            this.f47155m = false;
        }
    }

    public void y() {
        E();
        x.e eVarO = o();
        for (Animator animator : this.f47158p) {
            if (eVarO.containsKey(animator)) {
                E();
                if (animator != null) {
                    animator.addListener(new v0(this, eVarO));
                    long j10 = this.f47145b;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    animator.addListener(new o(this, 0));
                    animator.start();
                }
            }
        }
        this.f47158p.clear();
        m();
    }

    public void z(a2 a2Var) {
        this.f47159q = a2Var;
    }

    public void A() {
    }

    public void C() {
    }

    public void f(x xVar) {
    }
}
