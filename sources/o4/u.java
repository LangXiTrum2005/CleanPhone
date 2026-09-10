package o4;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f47163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f47164b;

    /* JADX WARN: Code duplicated, block: B:100:0x0209  */
    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e1 A[EDGE_INSN: B:134:0x01e1->B:90:0x01e1 BREAK  A[LOOP:1: B:19:0x0085->B:89:0x01da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i10;
        k5.g gVar;
        k5.g gVar2;
        x.e eVar;
        x.e eVar2;
        int i11;
        int[] iArr;
        boolean z10;
        int i12;
        int i13;
        x.e eVarO;
        int i14;
        Animator animator;
        p pVar;
        View view;
        x xVar;
        x xVar2;
        int i15;
        boolean z11;
        int i16;
        View view2;
        x xVar3;
        x.e eVar3;
        int i17;
        int i18;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i19;
        View view5;
        View view6;
        x.g gVar3;
        int iE;
        int i20;
        View view7;
        boolean z12;
        Iterator it;
        r rVar = this.f47163a;
        ViewGroup viewGroup = this.f47164b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z13 = true;
        if (!v.f47167c.remove(viewGroup)) {
            return true;
        }
        x.e eVarA = v.a();
        ArrayList arrayList2 = (ArrayList) eVarA.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(rVar);
            rVar.a(new t(this, eVarA));
            i10 = 0;
            rVar.h(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).x(viewGroup);
                }
            }
            rVar.f47152i = new ArrayList();
            rVar.f47153j = new ArrayList();
            gVar = rVar.f47148e;
            gVar2 = rVar.f47149f;
            eVar = new x.e((x.e) gVar.f44325a);
            eVar2 = new x.e((x.e) gVar2.f44325a);
            i11 = 0;
            while (true) {
                iArr = rVar.f47151h;
                if (i11 < iArr.length) {
                    break;
                }
                i15 = iArr[i11];
                if (i15 != z13) {
                    z11 = z13;
                    for (i16 = eVar.f53506c - 1; i16 >= 0; i16--) {
                        view2 = (View) eVar.f(i16);
                        if (view2 == null && rVar.s(view2) && (xVar3 = (x) eVar2.remove(view2)) != null && rVar.s(xVar3.f47174b)) {
                            rVar.f47152i.add((x) eVar.h(i16));
                            rVar.f47153j.add(xVar3);
                        }
                    }
                } else if (i15 != 2) {
                    z11 = z13;
                    eVar3 = (x.e) gVar.f44328d;
                    x.e eVar4 = (x.e) gVar2.f44328d;
                    i17 = eVar3.f53506c;
                    for (i18 = 0; i18 < i17; i18++) {
                        view3 = (View) eVar3.j(i18);
                        if (view3 == null && rVar.s(view3) && (view4 = (View) eVar4.get(eVar3.f(i18))) != null && rVar.s(view4)) {
                            x xVar4 = (x) eVar.get(view3);
                            x xVar5 = (x) eVar2.get(view4);
                            if (xVar4 != null && xVar5 != null) {
                                rVar.f47152i.add(xVar4);
                                rVar.f47153j.add(xVar5);
                                eVar.remove(view3);
                                eVar2.remove(view4);
                            }
                        }
                    }
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        gVar3 = (x.g) gVar.f44327c;
                        x.g gVar4 = (x.g) gVar2.f44327c;
                        iE = gVar3.e();
                        i20 = i10;
                        while (i20 < iE) {
                            view7 = (View) gVar3.f(i20);
                            if (view7 == null && rVar.s(view7)) {
                                boolean z14 = z13;
                                View view8 = (View) gVar4.b(gVar3.c(i20));
                                if (view8 == null || !rVar.s(view8)) {
                                    z12 = z14;
                                } else {
                                    x xVar6 = (x) eVar.get(view7);
                                    x xVar7 = (x) eVar2.get(view8);
                                    if (xVar6 == null || xVar7 == null) {
                                        z12 = z14;
                                    } else {
                                        z12 = z14;
                                        rVar.f47152i.add(xVar6);
                                        rVar.f47153j.add(xVar7);
                                        eVar.remove(view7);
                                        eVar2.remove(view8);
                                    }
                                }
                            } else {
                                z12 = z13;
                            }
                            i20++;
                            z13 = z12;
                        }
                    }
                    z11 = z13;
                } else {
                    z11 = z13;
                    sparseArray = (SparseArray) gVar.f44326b;
                    SparseArray sparseArray2 = (SparseArray) gVar2.f44326b;
                    size = sparseArray.size();
                    for (i19 = 0; i19 < size; i19++) {
                        view5 = (View) sparseArray.valueAt(i19);
                        if (view5 == null && rVar.s(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && rVar.s(view6)) {
                            x xVar8 = (x) eVar.get(view5);
                            x xVar9 = (x) eVar2.get(view6);
                            if (xVar8 != null && xVar9 != null) {
                                rVar.f47152i.add(xVar8);
                                rVar.f47153j.add(xVar9);
                                eVar.remove(view5);
                                eVar2.remove(view6);
                            }
                        }
                    }
                }
                i11++;
                z13 = z11;
                i10 = 0;
            }
            z10 = z13;
            for (i12 = 0; i12 < eVar.f53506c; i12++) {
                xVar2 = (x) eVar.j(i12);
                if (rVar.s(xVar2.f47174b)) {
                    rVar.f47152i.add(xVar2);
                    rVar.f47153j.add(null);
                }
            }
            for (i13 = 0; i13 < eVar2.f53506c; i13++) {
                xVar = (x) eVar2.j(i13);
                if (rVar.s(xVar.f47174b)) {
                    rVar.f47153j.add(xVar);
                    rVar.f47152i.add(null);
                }
            }
            eVarO = r.o();
            int i21 = eVarO.f53506c;
            c cVar = y.f47176a;
            WindowId windowId = viewGroup.getWindowId();
            i14 = i21 - 1;
            while (i14 >= 0) {
                animator = (Animator) eVarO.f(i14);
                if (animator == null && (pVar = (p) eVarO.get(animator)) != null && (view = pVar.f47136a) != null && pVar.f47139d.f47107a.equals(windowId)) {
                    x xVar10 = pVar.f47138c;
                    boolean z15 = z10;
                    x xVarQ = rVar.q(view, z15);
                    x xVarN = rVar.n(view, z15);
                    if (xVarQ == null && xVarN == null) {
                        xVarN = (x) ((x.e) rVar.f47149f.f44325a).get(view);
                    }
                    if ((xVarQ != null || xVarN != null) && pVar.f47140e.r(xVar10, xVarN)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            eVarO.remove(animator);
                        }
                    }
                }
                i14--;
                z10 = true;
            }
            rVar.l(viewGroup, rVar.f47148e, rVar.f47149f, rVar.f47152i, rVar.f47153j);
            rVar.y();
            return true;
        }
        arrayList2 = new ArrayList();
        eVarA.put(viewGroup, arrayList2);
        arrayList2.add(rVar);
        rVar.a(new t(this, eVarA));
        i10 = 0;
        rVar.h(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((r) it.next()).x(viewGroup);
            }
        }
        rVar.f47152i = new ArrayList();
        rVar.f47153j = new ArrayList();
        gVar = rVar.f47148e;
        gVar2 = rVar.f47149f;
        eVar = new x.e((x.e) gVar.f44325a);
        eVar2 = new x.e((x.e) gVar2.f44325a);
        i11 = 0;
        while (true) {
            iArr = rVar.f47151h;
            if (i11 < iArr.length) {
                break;
                break;
            }
            i15 = iArr[i11];
            if (i15 != z13) {
                z11 = z13;
                while (i16 >= 0) {
                    view2 = (View) eVar.f(i16);
                    if (view2 == null) {
                    }
                }
            } else if (i15 != 2) {
                z11 = z13;
                eVar3 = (x.e) gVar.f44328d;
                x.e eVar5 = (x.e) gVar2.f44328d;
                i17 = eVar3.f53506c;
                while (i18 < i17) {
                    view3 = (View) eVar3.j(i18);
                    if (view3 == null) {
                    }
                }
            } else if (i15 != 3) {
                if (i15 == 4) {
                    gVar3 = (x.g) gVar.f44327c;
                    x.g gVar5 = (x.g) gVar2.f44327c;
                    iE = gVar3.e();
                    i20 = i10;
                    while (i20 < iE) {
                        view7 = (View) gVar3.f(i20);
                        if (view7 == null) {
                            z12 = z13;
                        } else {
                            z12 = z13;
                        }
                        i20++;
                        z13 = z12;
                    }
                }
                z11 = z13;
            } else {
                z11 = z13;
                sparseArray = (SparseArray) gVar.f44326b;
                SparseArray sparseArray3 = (SparseArray) gVar2.f44326b;
                size = sparseArray.size();
                while (i19 < size) {
                    view5 = (View) sparseArray.valueAt(i19);
                    if (view5 == null) {
                    }
                }
            }
            i11++;
            z13 = z11;
            i10 = 0;
        }
        z10 = z13;
        while (i12 < eVar.f53506c) {
            xVar2 = (x) eVar.j(i12);
            if (rVar.s(xVar2.f47174b)) {
                rVar.f47152i.add(xVar2);
                rVar.f47153j.add(null);
            }
        }
        while (i13 < eVar2.f53506c) {
            xVar = (x) eVar2.j(i13);
            if (rVar.s(xVar.f47174b)) {
                rVar.f47153j.add(xVar);
                rVar.f47152i.add(null);
            }
        }
        eVarO = r.o();
        int i22 = eVarO.f53506c;
        c cVar2 = y.f47176a;
        WindowId windowId2 = viewGroup.getWindowId();
        i14 = i22 - 1;
        while (i14 >= 0) {
            animator = (Animator) eVarO.f(i14);
            if (animator == null) {
            }
            i14--;
            z10 = true;
        }
        rVar.l(viewGroup, rVar.f47148e, rVar.f47149f, rVar.f47152i, rVar.f47153j);
        rVar.y();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f47164b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        v.f47167c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) v.a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((r) it.next()).x(viewGroup);
            }
        }
        this.f47163a.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
