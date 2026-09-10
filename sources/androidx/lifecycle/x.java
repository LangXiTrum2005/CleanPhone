package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r.a f4608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f4609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f4610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fn.a1 f4615j;

    public x(v vVar) {
        this.f4571a = new AtomicReference();
        this.f4607b = true;
        this.f4608c = new r.a();
        n nVar = n.f4565b;
        this.f4609d = nVar;
        this.f4614i = new ArrayList();
        this.f4610e = new WeakReference(vVar);
        this.f4615j = fn.g.c(nVar);
    }

    @Override // androidx.lifecycle.o
    public final void a(u observer) {
        t fVar;
        Object obj;
        v vVar;
        m mVar;
        kotlin.jvm.internal.n.f(observer, "observer");
        d("addObserver");
        n nVar = this.f4609d;
        n nVar2 = n.f4564a;
        if (nVar != nVar2) {
            nVar2 = n.f4565b;
        }
        w wVar = new w();
        HashMap map = z.f4622a;
        boolean z10 = observer instanceof t;
        boolean z11 = observer instanceof DefaultLifecycleObserver;
        int i10 = 1;
        if (z10 && z11) {
            fVar = new f((DefaultLifecycleObserver) observer, (t) observer);
        } else if (z11) {
            fVar = new f((DefaultLifecycleObserver) observer, (t) null);
        } else if (z10) {
            fVar = (t) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (z.b(cls) == 2) {
                Object obj2 = z.f4623b.get(cls);
                kotlin.jvm.internal.n.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    z.a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                h[] hVarArr = new h[size];
                if (size > 0) {
                    z.a((Constructor) list.get(0), observer);
                    throw null;
                }
                fVar = new j4.b(hVarArr, i10);
            } else {
                fVar = new f(observer);
            }
        }
        wVar.f4603b = fVar;
        wVar.f4602a = nVar2;
        r.a aVar = this.f4608c;
        r.c cVarB = aVar.b(observer);
        if (cVarB != null) {
            obj = cVarB.f49208b;
        } else {
            HashMap map2 = aVar.f49203e;
            r.c cVar = new r.c(observer, wVar);
            aVar.f49217d++;
            r.c cVar2 = aVar.f49215b;
            if (cVar2 == null) {
                aVar.f49214a = cVar;
                aVar.f49215b = cVar;
            } else {
                cVar2.f49209c = cVar;
                cVar.f49210d = cVar2;
                aVar.f49215b = cVar;
            }
            map2.put(observer, cVar);
            obj = null;
        }
        if (((w) obj) == null && (vVar = (v) this.f4610e.get()) != null) {
            boolean z12 = this.f4611f != 0 || this.f4612g;
            n nVarC = c(observer);
            this.f4611f++;
            while (wVar.f4602a.compareTo(nVarC) < 0 && this.f4608c.f49203e.containsKey(observer)) {
                n nVar3 = wVar.f4602a;
                ArrayList arrayList = this.f4614i;
                arrayList.add(nVar3);
                k kVar = m.Companion;
                n state = wVar.f4602a;
                kVar.getClass();
                kotlin.jvm.internal.n.f(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 1) {
                    mVar = m.ON_CREATE;
                } else if (iOrdinal != 2) {
                    mVar = iOrdinal != 3 ? null : m.ON_RESUME;
                } else {
                    mVar = m.ON_START;
                }
                if (mVar == null) {
                    throw new IllegalStateException("no event up from " + wVar.f4602a);
                }
                wVar.a(vVar, mVar);
                arrayList.remove(arrayList.size() - 1);
                nVarC = c(observer);
            }
            if (!z12) {
                h();
            }
            this.f4611f--;
        }
    }

    @Override // androidx.lifecycle.o
    public final void b(u observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        d("removeObserver");
        this.f4608c.h(observer);
    }

    public final n c(u uVar) {
        w wVar;
        HashMap map = this.f4608c.f49203e;
        r.c cVar = map.containsKey(uVar) ? ((r.c) map.get(uVar)).f49210d : null;
        n nVar = (cVar == null || (wVar = (w) cVar.f49208b) == null) ? null : wVar.f4602a;
        ArrayList arrayList = this.f4614i;
        n nVar2 = arrayList.isEmpty() ? null : (n) l1.d.d(arrayList, 1);
        n state1 = this.f4609d;
        kotlin.jvm.internal.n.f(state1, "state1");
        if (nVar == null || nVar.compareTo(state1) >= 0) {
            nVar = state1;
        }
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    public final void d(String str) {
        if (this.f4607b) {
            q.a.L().f48509b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(defpackage.e.o("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(m event) {
        kotlin.jvm.internal.n.f(event, "event");
        d("handleLifecycleEvent");
        f(event.d());
    }

    public final void f(n nVar) {
        n nVar2 = this.f4609d;
        if (nVar2 == nVar) {
            return;
        }
        n nVar3 = n.f4565b;
        n nVar4 = n.f4564a;
        if (nVar2 == nVar3 && nVar == nVar4) {
            throw new IllegalStateException(("no event down from " + this.f4609d + " in component " + this.f4610e.get()).toString());
        }
        this.f4609d = nVar;
        if (this.f4612g || this.f4611f != 0) {
            this.f4613h = true;
            return;
        }
        this.f4612g = true;
        h();
        this.f4612g = false;
        if (this.f4609d == nVar4) {
            this.f4608c = new r.a();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(n.f4566c);
    }

    public final void h() {
        m mVar;
        m mVar2;
        v vVar = (v) this.f4610e.get();
        if (vVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            r.a aVar = this.f4608c;
            if (aVar.f49217d != 0) {
                r.c cVar = aVar.f49214a;
                kotlin.jvm.internal.n.c(cVar);
                n nVar = ((w) cVar.f49208b).f4602a;
                r.c cVar2 = this.f4608c.f49215b;
                kotlin.jvm.internal.n.c(cVar2);
                n nVar2 = ((w) cVar2.f49208b).f4602a;
                if (nVar == nVar2 && this.f4609d == nVar2) {
                    break;
                }
                this.f4613h = false;
                n nVar3 = this.f4609d;
                r.c cVar3 = this.f4608c.f49214a;
                kotlin.jvm.internal.n.c(cVar3);
                int iCompareTo = nVar3.compareTo(((w) cVar3.f49208b).f4602a);
                ArrayList arrayList = this.f4614i;
                if (iCompareTo < 0) {
                    r.a aVar2 = this.f4608c;
                    r.b bVar = new r.b(aVar2.f49215b, aVar2.f49214a, 1);
                    aVar2.f49216c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f4613h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        kotlin.jvm.internal.n.e(entry, "next()");
                        u uVar = (u) entry.getKey();
                        w wVar = (w) entry.getValue();
                        while (wVar.f4602a.compareTo(this.f4609d) > 0 && !this.f4613h && this.f4608c.f49203e.containsKey(uVar)) {
                            k kVar = m.Companion;
                            n state = wVar.f4602a;
                            kVar.getClass();
                            kotlin.jvm.internal.n.f(state, "state");
                            int iOrdinal = state.ordinal();
                            if (iOrdinal == 2) {
                                mVar2 = m.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                mVar2 = iOrdinal != 4 ? null : m.ON_PAUSE;
                            } else {
                                mVar2 = m.ON_STOP;
                            }
                            if (mVar2 == null) {
                                throw new IllegalStateException("no event down from " + wVar.f4602a);
                            }
                            arrayList.add(mVar2.d());
                            wVar.a(vVar, mVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                r.c cVar4 = this.f4608c.f49215b;
                if (!this.f4613h && cVar4 != null && this.f4609d.compareTo(((w) cVar4.f49208b).f4602a) > 0) {
                    r.a aVar3 = this.f4608c;
                    aVar3.getClass();
                    r.d dVar = new r.d(aVar3);
                    aVar3.f49216c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f4613h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        u uVar2 = (u) entry2.getKey();
                        w wVar2 = (w) entry2.getValue();
                        while (wVar2.f4602a.compareTo(this.f4609d) < 0 && !this.f4613h && this.f4608c.f49203e.containsKey(uVar2)) {
                            arrayList.add(wVar2.f4602a);
                            k kVar2 = m.Companion;
                            n state2 = wVar2.f4602a;
                            kVar2.getClass();
                            kotlin.jvm.internal.n.f(state2, "state");
                            int iOrdinal2 = state2.ordinal();
                            if (iOrdinal2 == 1) {
                                mVar = m.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                mVar = iOrdinal2 != 3 ? null : m.ON_RESUME;
                            } else {
                                mVar = m.ON_START;
                            }
                            if (mVar == null) {
                                throw new IllegalStateException("no event up from " + wVar2.f4602a);
                            }
                            wVar2.a(vVar, mVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f4613h = false;
        this.f4615j.d0(this.f4609d);
    }
}
