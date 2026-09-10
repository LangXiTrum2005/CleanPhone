package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WU f3503a;
    public final NO e;
    public final InterfaceC3050b4 h;
    public final InterfaceC3481fz i;
    public boolean k;
    public Bd0 l;
    public D60 j = new D60();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public OO(NO no, InterfaceC3050b4 interfaceC3050b4, Qa0 qa0, WU wu) {
        this.f3503a = wu;
        this.e = no;
        this.h = interfaceC3050b4;
        this.i = qa0;
    }

    public final Gc0 a(int i, List list, D60 d60) {
        if (!list.isEmpty()) {
            this.j = d60;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                MO mo = (MO) list.get(i2 - i);
                ArrayList arrayList = this.b;
                if (i2 > 0) {
                    MO mo2 = (MO) arrayList.get(i2 - 1);
                    mo.d = mo2.f3403a.o.e.p() + mo2.d;
                    mo.e = false;
                    mo.c.clear();
                } else {
                    mo.d = 0;
                    mo.e = false;
                    mo.c.clear();
                }
                int iP = mo.f3403a.o.e.p();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((MO) arrayList.get(i3)).d += iP;
                }
                arrayList.add(i2, mo);
                this.d.put(mo.b, mo);
                if (this.k) {
                    e(mo);
                    if (this.c.isEmpty()) {
                        this.g.add(mo);
                    } else {
                        LO lo = (LO) this.f.get(mo);
                        if (lo != null) {
                            lo.f3352a.f(lo.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final Gc0 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Gc0.f3128a;
        }
        int iP = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            MO mo = (MO) arrayList.get(i);
            mo.d = iP;
            iP += mo.f3403a.o.e.p();
        }
        return new C3171cV(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            MO mo = (MO) it.next();
            if (mo.c.isEmpty()) {
                LO lo = (LO) this.f.get(mo);
                if (lo != null) {
                    lo.f3352a.f(lo.b);
                }
                it.remove();
            }
        }
    }

    public final void d(MO mo) {
        if (mo.e && mo.c.isEmpty()) {
            LO lo = (LO) this.f.remove(mo);
            lo.getClass();
            G9 g9 = lo.f3352a;
            g9.r(lo.b);
            C3692iN c3692iN = lo.c;
            g9.u(c3692iN);
            g9.t(c3692iN);
            this.g.remove(mo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AO, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(MO mo) {
        C4920wM c4920wM = mo.f3403a;
        ?? r1 = new AO() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GO
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AO
            public final void a(G9 g9, Gc0 gc0) {
                ((C2918Ys) this.f3120a.e).h.d(22);
            }
        };
        C3692iN c3692iN = new C3692iN(this, mo, 29);
        this.f.put(mo, new LO(c4920wM, r1, c3692iN));
        int i = Ug0.f3833a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        DO r7 = c4920wM.c;
        r7.getClass();
        CO co = new CO();
        co.f2918a = handler;
        co.b = c3692iN;
        r7.c.add(co);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        C3031aq c3031aq = c4920wM.d;
        c3031aq.getClass();
        C2941Zp c2941Zp = new C2941Zp();
        c2941Zp.f4094a = handler2;
        c2941Zp.b = c3692iN;
        c3031aq.c.add(c2941Zp);
        c4920wM.n(r1, this.l, this.f3503a);
    }

    public final void f(InterfaceC4395qO interfaceC4395qO) {
        IdentityHashMap identityHashMap = this.c;
        MO mo = (MO) identityHashMap.remove(interfaceC4395qO);
        mo.getClass();
        mo.f3403a.q(interfaceC4395qO);
        mo.c.remove(((C4656tM) interfaceC4395qO).f5032a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(mo);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            MO mo = (MO) arrayList.remove(i3);
            this.d.remove(mo.b);
            int i4 = -mo.f3403a.o.e.p();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((MO) arrayList.get(i5)).d += i4;
            }
            mo.e = true;
            if (this.k) {
                d(mo);
            }
        }
    }
}
