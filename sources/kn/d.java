package kn;

import ak.k;
import cn.i;
import cn.j;
import cn.j0;
import cn.j2;
import cn.l;
import cn.o1;
import cn.p1;
import com.google.android.gms.internal.play_billing.q1;
import hn.s;
import hn.u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class d implements i, e, j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44736f = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f44737a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44739c;
    private volatile /* synthetic */ Object state$volatile = f.f44742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f44738b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44740d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f44741e = f.f44745d;

    public d(k kVar) {
        this.f44737a = kVar;
    }

    @Override // cn.i
    public final void a(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44736f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == f.f44743b) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, f.f44744c)) {
                    ArrayList arrayList = this.f44738b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).a();
                    }
                    this.f44741e = f.f44745d;
                    this.f44738b = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // cn.j2
    public final void b(s sVar, int i10) {
        this.f44739c = sVar;
        this.f44740d = i10;
    }

    public final Object c(ck.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44736f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        b bVar = (b) obj;
        Object obj2 = this.f44741e;
        ArrayList<b> arrayList = this.f44738b;
        if (arrayList != null) {
            for (b bVar2 : arrayList) {
                if (bVar2 != bVar) {
                    bVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, f.f44743b);
            this.f44741e = f.f44745d;
            this.f44738b = null;
        }
        p1.f6754b.invoke(bVar.f44728a, null, obj2);
        return ((jk.c) bVar.f44729b).invoke(obj2, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ck.c cVar) throws IllegalAccessException, j0, InvocationTargetException {
        c cVar2;
        Object obj;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f44735h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f44735h = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj2 = cVar2.f44733f;
        int i11 = cVar2.f44735h;
        Object obj3 = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(obj2);
            cVar2.f44735h = 1;
            l lVar = new l(1, q1.t(cVar2));
            lVar.t();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44736f;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                obj = r.f53297a;
                u uVar = f.f44742a;
                if (obj4 == uVar) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj4, lVar)) {
                            lVar.w(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj4);
                } else {
                    if (!(obj4 instanceof List)) {
                        if (obj4 instanceof b) {
                            lVar.g(obj, null);
                            break;
                        }
                        throw new IllegalStateException(("unexpected state: " + obj4).toString());
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj4, uVar)) {
                            Iterator it = ((Iterable) obj4).iterator();
                            while (it.hasNext()) {
                                b bVarE = e(it.next());
                                n.c(bVarE);
                                bVarE.f44730c = null;
                                bVarE.f44731d = -1;
                                f(bVarE, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj4);
                }
            }
            Object objS = lVar.s();
            if (objS == obj3) {
                obj = objS;
            }
            if (obj != obj3) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj2);
            return obj2;
        }
        t9.e.z(obj2);
        cVar2.f44735h = 2;
        Object objC = c(cVar2);
        return objC == obj3 ? obj3 : objC;
    }

    public final b e(Object obj) {
        ArrayList arrayList = this.f44738b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((b) obj3).f44728a == obj) {
                obj2 = obj3;
                break;
            }
        }
        b bVar = (b) obj2;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(b bVar, boolean z10) {
        cn.q1 q1Var = bVar.f44728a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44736f;
        if (atomicReferenceFieldUpdater.get(this) instanceof b) {
            return;
        }
        if (!z10) {
            ArrayList arrayList = this.f44738b;
            n.c(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()).f44728a == q1Var) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + q1Var).toString());
                    }
                }
            }
        }
        o1.f6752b.invoke(q1Var, this, null);
        if (this.f44741e != f.f44745d) {
            atomicReferenceFieldUpdater.set(this, bVar);
            return;
        }
        if (!z10) {
            ArrayList arrayList2 = this.f44738b;
            n.c(arrayList2);
            arrayList2.add(bVar);
        }
        bVar.f44730c = this.f44739c;
        bVar.f44731d = this.f44740d;
        this.f44739c = null;
        this.f44740d = -1;
    }

    public final boolean g(Object obj, Object obj2) {
        return h(obj, obj2) == 0;
    }

    public final int h(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44736f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof j)) {
                if (n.a(obj3, f.f44743b) || (obj3 instanceof b)) {
                    return 3;
                }
                if (n.a(obj3, f.f44744c)) {
                    return 2;
                }
                if (n.a(obj3, f.f44742a)) {
                    List listC = j1.f.C(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListD0 = xj.n.D0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListD0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            b bVarE = e(obj);
            if (bVarE == null) {
                continue;
            } else {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, bVarE)) {
                        j jVar = (j) obj3;
                        this.f44741e = obj2;
                        u uVarM = jVar.m(r.f53297a, null);
                        if (uVarM == null) {
                            this.f44741e = f.f44745d;
                            return 2;
                        }
                        jVar.p(uVarM);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            }
        }
    }
}
