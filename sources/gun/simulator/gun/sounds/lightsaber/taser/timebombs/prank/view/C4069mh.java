package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4069mh implements InterfaceC3543gh, InterfaceC3805jh {
    public static final C3981lh g = new C3981lh(0);
    public final C2709Qr d;
    public final InterfaceC3893kh f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4707a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final AtomicReference e = new AtomicReference();

    public C4069mh(Executor executor, List list, List list2, InterfaceC3893kh interfaceC3893kh) {
        int i = 1;
        C2709Qr c2709Qr = new C2709Qr(executor);
        this.d = c2709Qr;
        this.f = interfaceC3893kh;
        ArrayList<C3190ch> arrayList = new ArrayList();
        arrayList.add(C3190ch.b(c2709Qr, C2709Qr.class, InterfaceC4320pa0.class, GW.class));
        arrayList.add(C3190ch.b(this, InterfaceC3805jh.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C3190ch c3190ch = (C3190ch) it.next();
            if (c3190ch != null) {
                arrayList.add(c3190ch);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((AW) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (C3419fE unused) {
                    it3.remove();
                }
            }
            if (this.f4707a.isEmpty()) {
                AbstractC2340Cl.r(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f4707a.keySet());
                arrayList4.addAll(arrayList);
                AbstractC2340Cl.r(arrayList4);
            }
            for (C3190ch c3190ch2 : arrayList) {
                this.f4707a.put(c3190ch2, new C3157cH(new C3914ku(i, this, c3190ch2)));
            }
            arrayList3.addAll(h(arrayList));
            arrayList3.addAll(i());
            g();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = (Boolean) this.e.get();
        if (bool != null) {
            f(this.f4707a, bool.booleanValue());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final Object a(Class cls) {
        return e(RW.a(cls));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final Set b(RW rw) {
        return (Set) j(rw).get();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final AW c(Class cls) {
        return d(RW.a(cls));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final synchronized AW d(RW rw) {
        AbstractC3375el.l(rw, "Null interface requested.");
        return (AW) this.b.get(rw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh
    public final Object e(RW rw) {
        AW awD = d(rw);
        if (awD == null) {
            return null;
        }
        return awD.get();
    }

    public final void f(Map map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C3190ch c3190ch = (C3190ch) entry.getKey();
            AW aw = (AW) entry.getValue();
            int i = c3190ch.d;
            if (i == 1 || (i == 2 && z)) {
                aw.get();
            }
        }
        C2709Qr c2709Qr = this.d;
        synchronized (c2709Qr) {
            arrayDeque = c2709Qr.b;
            if (arrayDeque != null) {
                c2709Qr.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                AbstractC3950lJ.z(it.next());
                throw null;
            }
        }
    }

    public final void g() {
        for (C3190ch c3190ch : this.f4707a.keySet()) {
            for (C5226zo c5226zo : c3190ch.c) {
                if (c5226zo.b == 2 && !this.c.containsKey(c5226zo.f5344a)) {
                    HashMap map = this.c;
                    RW rw = c5226zo.f5344a;
                    Set setEmptySet = Collections.emptySet();
                    C3772jH c3772jH = new C3772jH();
                    c3772jH.b = null;
                    c3772jH.f4546a = Collections.newSetFromMap(new ConcurrentHashMap());
                    c3772jH.f4546a.addAll(setEmptySet);
                    map.put(rw, c3772jH);
                } else if (this.b.containsKey(c5226zo.f5344a)) {
                    continue;
                } else {
                    int i = c5226zo.b;
                    if (i == 1) {
                        throw new AP("Unsatisfied dependency for component " + c3190ch + ": " + c5226zo.f5344a, 4);
                    }
                    if (i != 2) {
                        HashMap map2 = this.b;
                        RW rw2 = c5226zo.f5344a;
                        C2953a0 c2953a0 = WS.c;
                        C3981lh c3981lh = WS.d;
                        WS ws = new WS();
                        ws.f3920a = c2953a0;
                        ws.b = c3981lh;
                        map2.put(rw2, ws);
                    }
                }
            }
        }
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3190ch c3190ch = (C3190ch) it.next();
            if (c3190ch.e == 0) {
                AW aw = (AW) this.f4707a.get(c3190ch);
                for (RW rw : c3190ch.b) {
                    HashMap map = this.b;
                    if (map.containsKey(rw)) {
                        arrayList2.add(new RunnableC3976le0(23, (WS) ((AW) map.get(rw)), aw));
                    } else {
                        map.put(rw, aw);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f4707a.entrySet()) {
            C3190ch c3190ch = (C3190ch) entry.getKey();
            if (c3190ch.e != 0) {
                AW aw = (AW) entry.getValue();
                for (RW rw : c3190ch.b) {
                    if (!map.containsKey(rw)) {
                        map.put(rw, new HashSet());
                    }
                    ((Set) map.get(rw)).add(aw);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.c;
            if (map2.containsKey(key)) {
                C3772jH c3772jH = (C3772jH) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC3976le0(24, c3772jH, (AW) it.next()));
                }
            } else {
                RW rw2 = (RW) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C3772jH c3772jH2 = new C3772jH();
                c3772jH2.b = null;
                c3772jH2.f4546a = Collections.newSetFromMap(new ConcurrentHashMap());
                c3772jH2.f4546a.addAll(set);
                map2.put(rw2, c3772jH2);
            }
        }
        return arrayList;
    }

    public final synchronized AW j(RW rw) {
        C3772jH c3772jH = (C3772jH) this.c.get(rw);
        if (c3772jH != null) {
            return c3772jH;
        }
        return g;
    }
}
