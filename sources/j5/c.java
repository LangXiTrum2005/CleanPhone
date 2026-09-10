package j5;

import d5.o;
import java.util.ArrayList;
import java.util.Iterator;
import m5.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43711a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k5.d f43713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f43714d;

    public c(k5.d dVar) {
        this.f43713c = dVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f43711a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f43711a.add(iVar.f45882a);
            }
        }
        if (this.f43711a.isEmpty()) {
            this.f43713c.b(this);
        } else {
            k5.d dVar = this.f43713c;
            synchronized (dVar.f44317c) {
                try {
                    if (dVar.f44318d.add(this)) {
                        if (dVar.f44318d.size() == 1) {
                            dVar.f44319e = dVar.a();
                            o.g().e(k5.d.f44314f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f44319e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f44319e;
                        this.f43712b = obj;
                        d(this.f43714d, obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d(this.f43714d, this.f43712b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f43711a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f43711a;
            i5.c cVar = (i5.c) bVar;
            synchronized (cVar.f42892c) {
                try {
                    i5.b bVar2 = cVar.f42890a;
                    if (bVar2 != null) {
                        bVar2.c(arrayList);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        ArrayList<String> arrayList2 = this.f43711a;
        i5.c cVar2 = (i5.c) bVar;
        synchronized (cVar2.f42892c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList2) {
                    if (cVar2.a(str)) {
                        o.g().e(i5.c.f42889d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                i5.b bVar3 = cVar2.f42890a;
                if (bVar3 != null) {
                    bVar3.f(arrayList3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
