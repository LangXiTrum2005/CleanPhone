package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2392El {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3035a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public C2923Yx c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public C4351pr h;
    public YS i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public InterfaceC4650tG n;
    public IV o;
    public AbstractC2940Zo p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                EP ep = (EP) arrayListB.get(i);
                if (!arrayList.contains(ep.f3021a)) {
                    arrayList.add(ep.f3021a);
                }
                int i2 = 0;
                while (true) {
                    List list = ep.b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.f3035a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listG = this.c.b().g(this.d);
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                EP epB = ((FP) listG.get(i)).b(this.d, this.e, this.f, this.i);
                if (epB != null) {
                    arrayList.add(epB);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HI c(Class cls) {
        HI hi;
        C3789jY c3789jYB = this.c.b();
        Class cls2 = this.g;
        Class cls3 = this.k;
        II ii = c3789jYB.i;
        XP xp = (XP) ii.b.getAndSet(null);
        if (xp == null) {
            xp = new XP();
        }
        xp.f3967a = cls;
        xp.b = cls2;
        xp.c = cls3;
        synchronized (ii.f3210a) {
            hi = (HI) ii.f3210a.get(xp);
        }
        ii.b.set(xp);
        c3789jYB.i.getClass();
        if (II.c.equals(hi)) {
            return null;
        }
        if (hi != null) {
            return hi;
        }
        ArrayList arrayListE = c3789jYB.e(cls, cls2, cls3);
        HI hi2 = arrayListE.isEmpty() ? null : new HI(cls, cls2, cls3, arrayListE, c3789jYB.j);
        c3789jYB.i.a(cls, cls2, cls3, hi2);
        return hi2;
    }

    public final List d() {
        List list;
        C3789jY c3789jYB = this.c.b();
        Class<?> cls = this.d.getClass();
        Class cls2 = this.g;
        Class cls3 = this.k;
        C3692iN c3692iN = c3789jYB.h;
        XP xp = (XP) ((AtomicReference) c3692iN.b).getAndSet(null);
        if (xp == null) {
            xp = new XP(cls, cls2, cls3);
        } else {
            xp.f3967a = cls;
            xp.b = cls2;
            xp.c = cls3;
        }
        synchronized (((ArrayMap) c3692iN.c)) {
            list = (List) ((ArrayMap) c3692iN.c).get(xp);
        }
        ((AtomicReference) c3692iN.b).set(xp);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c3789jYB.f4557a.a(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : c3789jYB.c.F((Class) it.next(), cls2)) {
                    if (!c3789jYB.f.i(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            c3789jYB.h.K(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        return list2;
    }

    public final InterfaceC3473fr e(Object obj) {
        InterfaceC3473fr interfaceC3473fr;
        C5036xh c5036xh = this.c.b().b;
        Class<?> cls = obj.getClass();
        synchronized (c5036xh) {
            for (C3649hr c3649hr : c5036xh.f5240a) {
                if (c3649hr.f4476a.isAssignableFrom(cls)) {
                    interfaceC3473fr = c3649hr.b;
                }
            }
            interfaceC3473fr = null;
        }
        if (interfaceC3473fr != null) {
            return interfaceC3473fr;
        }
        throw new C3703iY(obj.getClass(), 3);
    }

    public final Gd0 f(Class cls) {
        Gd0 gd0 = (Gd0) this.j.get(cls);
        if (gd0 == null) {
            for (Map.Entry entry : this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    gd0 = (Gd0) entry.getValue();
                    break;
                }
            }
        }
        if (gd0 != null) {
            return gd0;
        }
        if (!this.j.isEmpty() || !this.q) {
            return Cf0.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
