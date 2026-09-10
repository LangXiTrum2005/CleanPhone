package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class PE implements InterfaceC5000xE, InterfaceC2541Ke, IT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3543a = AtomicReferenceFieldUpdater.newUpdater(PE.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(PE.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public PE(boolean z) {
        this._state = z ? QE.g : QE.f;
    }

    public static C2515Je V(C3159cJ c3159cJ) {
        while (c3159cJ.h()) {
            C3159cJ c3159cJD = c3159cJ.d();
            if (c3159cJD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3159cJ.b;
                Object obj = atomicReferenceFieldUpdater.get(c3159cJ);
                while (true) {
                    c3159cJ = (C3159cJ) obj;
                    if (!c3159cJ.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c3159cJ);
                }
            } else {
                c3159cJ = c3159cJD;
            }
        }
        while (true) {
            c3159cJ = c3159cJ.g();
            if (!c3159cJ.h()) {
                if (c3159cJ instanceof C2515Je) {
                    return (C2515Je) c3159cJ;
                }
                if (c3159cJ instanceof KR) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof NE)) {
            if (obj instanceof XC) {
                return ((XC) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof C3013ah ? "Cancelled" : "Completed";
        }
        NE ne = (NE) obj;
        if (ne.d()) {
            return "Cancelling";
        }
        return ne.e() ? "Completing" : "Active";
    }

    public final boolean A(Object obj) {
        SE se;
        Object objC0 = QE.f3595a;
        if (L()) {
            do {
                Object objN = N();
                if (!(objN instanceof XC) || ((objN instanceof NE) && ((NE) objN).e())) {
                    objC0 = QE.f3595a;
                    break;
                }
                objC0 = c0(objN, new C3013ah(false, G(obj)));
            } while (objC0 == QE.c);
            if (objC0 == QE.b) {
                return true;
            }
        }
        if (objC0 == QE.f3595a) {
            Throwable thG = null;
            loop1: while (true) {
                Object objN2 = N();
                if (objN2 instanceof NE) {
                    synchronized (objN2) {
                        try {
                            if (NE.d.get((NE) objN2) == QE.e) {
                                se = QE.d;
                            } else {
                                boolean zD = ((NE) objN2).d();
                                if (thG == null) {
                                    thG = G(obj);
                                }
                                ((NE) objN2).a(thG);
                                Throwable thC = zD ^ true ? ((NE) objN2).c() : null;
                                if (thC != null) {
                                    W(((NE) objN2).f3447a, thC);
                                }
                                se = QE.f3595a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objN2 instanceof XC) {
                    if (thG == null) {
                        thG = G(obj);
                    }
                    XC xc = (XC) objN2;
                    if (xc.isActive()) {
                        KR krM = M(xc);
                        if (krM == null) {
                            continue;
                        } else {
                            NE ne = new NE(krM, thG);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3543a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, xc, ne)) {
                                    W(krM, thG);
                                    se = QE.f3595a;
                                } else if (atomicReferenceFieldUpdater.get(this) != xc) {
                                }
                            }
                        }
                    } else {
                        Object objC1 = c0(objN2, new C3013ah(false, thG));
                        if (objC1 == QE.f3595a) {
                            throw new IllegalStateException(("Cannot happen in " + objN2).toString());
                        }
                        if (objC1 != QE.c) {
                            objC0 = objC1;
                            break;
                        }
                    }
                } else {
                    se = QE.d;
                }
                objC0 = se;
                break;
            }
        }
        if (objC0 != QE.f3595a && objC0 != QE.b) {
            if (objC0 == QE.d) {
                return false;
            }
            x(objC0);
        }
        return true;
    }

    public void B(CancellationException cancellationException) {
        A(cancellationException);
    }

    public final boolean C(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC2489Ie interfaceC2489Ie = (InterfaceC2489Ie) b.get(this);
        if (interfaceC2489Ie == null || interfaceC2489Ie == NR.f3457a) {
            return z;
        }
        return interfaceC2489Ie.a(th) || z;
    }

    public String D() {
        return "Job was cancelled";
    }

    public boolean E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return A(th) && K();
    }

    public final void F(XC xc, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        InterfaceC2489Ie interfaceC2489Ie = (InterfaceC2489Ie) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2489Ie != null) {
            interfaceC2489Ie.c();
            atomicReferenceFieldUpdater.set(this, NR.f3457a);
        }
        C3770jF c3770jF = null;
        C3013ah c3013ah = obj instanceof C3013ah ? (C3013ah) obj : null;
        Throwable th = c3013ah != null ? c3013ah.f4134a : null;
        if (xc instanceof GE) {
            try {
                ((GE) xc).j(th);
                return;
            } catch (Throwable th2) {
                P(new C3770jF("Exception in completion handler " + xc + " for " + this, th2, 8));
                return;
            }
        }
        KR krB = xc.b();
        if (krB != null) {
            Object objF = krB.f();
            AbstractC2995aW.o(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (C3159cJ c3159cJG = (C3159cJ) objF; !AbstractC2995aW.i(c3159cJG, krB); c3159cJG = c3159cJG.g()) {
                if (c3159cJG instanceof GE) {
                    GE ge = (GE) c3159cJG;
                    try {
                        ge.j(th);
                    } catch (Throwable th3) {
                        if (c3770jF != null) {
                            AbstractC2995aW.h(c3770jF, th3);
                        } else {
                            c3770jF = new C3770jF("Exception in completion handler " + ge + " for " + this, th3, 8);
                        }
                    }
                }
            }
            if (c3770jF != null) {
                P(c3770jF);
            }
        }
    }

    public final Throwable G(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        PE pe = (PE) ((IT) obj);
        Object objN = pe.N();
        if (objN instanceof NE) {
            thC = ((NE) objN).c();
        } else if (objN instanceof C3013ah) {
            thC = ((C3013ah) objN).f4134a;
        } else {
            if (objN instanceof XC) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objN).toString());
            }
            thC = null;
        }
        CancellationException c5176zE = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (c5176zE == null) {
            c5176zE = new C5176zE("Parent job is ".concat(b0(objN)), thC, pe);
        }
        return c5176zE;
    }

    public final Object H(NE ne, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thJ;
        C3013ah c3013ah = obj instanceof C3013ah ? (C3013ah) obj : null;
        Throwable th = c3013ah != null ? c3013ah.f4134a : null;
        synchronized (ne) {
            ne.d();
            ArrayList<Throwable> arrayListF = ne.f(th);
            thJ = J(ne, arrayListF);
            if (thJ != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thJ && th2 != thJ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC2995aW.h(thJ, th2);
                    }
                }
            }
        }
        if (thJ != null && thJ != th) {
            obj = new C3013ah(false, thJ);
        }
        if (thJ != null && (C(thJ) || O(thJ))) {
            AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C3013ah.b.compareAndSet((C3013ah) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3543a;
        Object yc = obj instanceof XC ? new YC((XC) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, ne, yc) && atomicReferenceFieldUpdater.get(this) == ne) {
        }
        F(ne, obj);
        return obj;
    }

    public final Object I() throws Throwable {
        Object objN = N();
        if (!(!(objN instanceof XC))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objN instanceof C3013ah) {
            throw ((C3013ah) objN).f4134a;
        }
        return QE.a(objN);
    }

    public final Throwable J(NE ne, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (ne.d()) {
                return new C5176zE(D(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof Jc0) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof Jc0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return this instanceof C2854Wg;
    }

    public final KR M(XC xc) {
        KR krB = xc.b();
        if (krB != null) {
            return krB;
        }
        if (xc instanceof C2708Qq) {
            return new KR();
        }
        if (xc instanceof GE) {
            Z((GE) xc);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + xc).toString());
    }

    public final Object N() {
        while (true) {
            Object obj = f3543a.get(this);
            if (!(obj instanceof RS)) {
                return obj;
            }
            ((RS) obj).a(this);
        }
    }

    public boolean O(Throwable th) {
        return false;
    }

    public final void Q(InterfaceC5000xE interfaceC5000xE) {
        NR nr = NR.f3457a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (interfaceC5000xE == null) {
            atomicReferenceFieldUpdater.set(this, nr);
            return;
        }
        interfaceC5000xE.start();
        InterfaceC2489Ie interfaceC2489IeB = interfaceC5000xE.b(this);
        atomicReferenceFieldUpdater.set(this, interfaceC2489IeB);
        if (!(N() instanceof XC)) {
            interfaceC2489IeB.c();
            atomicReferenceFieldUpdater.set(this, nr);
        }
    }

    public boolean R() {
        return this instanceof C2614Na;
    }

    public final boolean S(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(N(), obj);
            if (objC0 == QE.f3595a) {
                return false;
            }
            if (objC0 == QE.b) {
                return true;
            }
        } while (objC0 == QE.c);
        x(objC0);
        return true;
    }

    public final Object T(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(N(), obj);
            if (objC0 == QE.f3595a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C3013ah c3013ah = obj instanceof C3013ah ? (C3013ah) obj : null;
                throw new IllegalStateException(str, c3013ah != null ? c3013ah.f4134a : null);
            }
        } while (objC0 == QE.c);
        return objC0;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(KR kr, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objF = kr.f();
        AbstractC2995aW.o(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3770jF c3770jF = null;
        for (C3159cJ c3159cJG = (C3159cJ) objF; !AbstractC2995aW.i(c3159cJG, kr); c3159cJG = c3159cJG.g()) {
            if (c3159cJG instanceof AE) {
                GE ge = (GE) c3159cJG;
                try {
                    ge.j(th);
                } catch (Throwable th2) {
                    if (c3770jF != null) {
                        AbstractC2995aW.h(c3770jF, th2);
                    } else {
                        c3770jF = new C3770jF("Exception in completion handler " + ge + " for " + this, th2, 8);
                    }
                }
            }
        }
        if (c3770jF != null) {
            P(c3770jF);
        }
        C(th);
    }

    public final void Z(GE ge) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        KR kr = new KR();
        ge.getClass();
        C3159cJ.b.lazySet(kr, ge);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3159cJ.f4215a;
        atomicReferenceFieldUpdater2.lazySet(kr, ge);
        loop0: while (ge.f() == ge) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(ge, ge, kr)) {
                    kr.e(ge);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(ge) == ge);
        }
        C3159cJ c3159cJG = ge.g();
        do {
            atomicReferenceFieldUpdater = f3543a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, ge, c3159cJG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == ge);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C5176zE(D(), null, this);
        }
        B(cancellationException);
    }

    public final int a0(Object obj) {
        boolean z = obj instanceof C2708Qq;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3543a;
        if (z) {
            if (((C2708Qq) obj).f3629a) {
                return 0;
            }
            C2708Qq c2708Qq = QE.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2708Qq)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof WC)) {
            return 0;
        }
        KR kr = ((WC) obj).f3913a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kr)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC2489Ie b(PE pe) {
        return (InterfaceC2489Ie) AbstractC3375el.J(this, true, new C2515Je(pe), 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final Object c(C3361ee c3361ee) {
        Object objN;
        C5033xf0 c5033xf0;
        do {
            objN = N();
            boolean z = objN instanceof XC;
            c5033xf0 = C5033xf0.f5238a;
            if (!z) {
                AbstractC2995aW.w(c3361ee.getContext());
                return c5033xf0;
            }
        } while (a0(objN) < 0);
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(c3361ee));
        c2798Uc.t();
        c2798Uc.n(new C4700tp(m(false, true, new C4788up(c2798Uc, 3)), 0));
        Object objS = c2798Uc.s();
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        if (objS != enumC4602sk) {
            objS = c5033xf0;
        }
        return objS == enumC4602sk ? objS : c5033xf0;
    }

    public final Object c0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof XC)) {
            return QE.f3595a;
        }
        if (((obj instanceof C2708Qq) || (obj instanceof GE)) && !(obj instanceof C2515Je) && !(obj2 instanceof C3013ah)) {
            XC xc = (XC) obj;
            SE se = QE.f3595a;
            Object yc = obj2 instanceof XC ? new YC((XC) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3543a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, xc, yc)) {
                    X(obj2);
                    F(xc, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == xc);
            return QE.c;
        }
        XC xc2 = (XC) obj;
        KR krM = M(xc2);
        if (krM == null) {
            return QE.c;
        }
        C2515Je c2515JeV = null;
        NE ne = xc2 instanceof NE ? (NE) xc2 : null;
        if (ne == null) {
            ne = new NE(krM, null);
        }
        synchronized (ne) {
            if (ne.e()) {
                return QE.f3595a;
            }
            NE.b.set(ne, 1);
            if (ne != xc2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3543a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, xc2, ne)) {
                    if (atomicReferenceFieldUpdater2.get(this) != xc2) {
                        return QE.c;
                    }
                }
            }
            boolean zD = ne.d();
            C3013ah c3013ah = obj2 instanceof C3013ah ? (C3013ah) obj2 : null;
            if (c3013ah != null) {
                ne.a(c3013ah.f4134a);
            }
            Throwable thC = ne.c();
            if (!(!zD)) {
                thC = null;
            }
            if (thC != null) {
                W(krM, thC);
            }
            C2515Je c2515Je = xc2 instanceof C2515Je ? (C2515Je) xc2 : null;
            if (c2515Je == null) {
                KR krB = xc2.b();
                if (krB != null) {
                    c2515JeV = V(krB);
                }
            } else {
                c2515JeV = c2515Je;
            }
            if (c2515JeV != null) {
                while (AbstractC3375el.J(c2515JeV.e, false, new ME(this, ne, c2515JeV, obj2), 1) == NR.f3457a) {
                    c2515JeV = V(c2515JeV);
                    if (c2515JeV == null) {
                    }
                }
                return QE.b;
            }
            return H(ne, obj2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final Object fold(Object obj, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC3567gx, "operation");
        return interfaceC3567gx.invoke(obj, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final InterfaceC3373ek get(InterfaceC3461fk interfaceC3461fk) {
        return AbstractC2995aW.D(this, interfaceC3461fk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3373ek
    public final InterfaceC3461fk getKey() {
        return G7.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC5000xE getParent() {
        InterfaceC2489Ie interfaceC2489Ie = (InterfaceC2489Ie) b.get(this);
        if (interfaceC2489Ie != null) {
            return interfaceC2489Ie.getParent();
        }
        return null;
    }

    public Object h() {
        return I();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public boolean isActive() {
        Object objN = N();
        return (objN instanceof XC) && ((XC) objN).isActive();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final boolean isCancelled() {
        Object objN = N();
        return (objN instanceof C3013ah) || ((objN instanceof NE) && ((NE) objN).d());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final CancellationException k() {
        CancellationException cancellationException;
        Object objN = N();
        if (!(objN instanceof NE)) {
            if (objN instanceof XC) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objN instanceof C3013ah)) {
                return new C5176zE(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C3013ah) objN).f4134a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C5176zE(D(), th, this) : cancellationException;
        }
        Throwable thC = ((NE) objN).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = D();
        }
        return new C5176zE(strConcat, thC, this);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c2 A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC4612sp m(boolean z, boolean z2, InterfaceC2766Sw interfaceC2766Sw) {
        GE c4788up;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thC;
        if (z) {
            c4788up = interfaceC2766Sw instanceof AE ? (AE) interfaceC2766Sw : null;
            if (c4788up == null) {
                c4788up = new C3683iE(interfaceC2766Sw);
            }
        } else {
            c4788up = interfaceC2766Sw instanceof GE ? (GE) interfaceC2766Sw : null;
            if (c4788up == null) {
                c4788up = new C4788up(interfaceC2766Sw, 1);
            }
        }
        c4788up.d = this;
        while (true) {
            Object objN = N();
            if (objN instanceof C2708Qq) {
                C2708Qq c2708Qq = (C2708Qq) objN;
                if (c2708Qq.f3629a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3543a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objN, c4788up)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objN) {
                        }
                    }
                    return c4788up;
                }
                KR kr = new KR();
                XC wc = c2708Qq.f3629a ? kr : new WC(kr);
                do {
                    atomicReferenceFieldUpdater = f3543a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c2708Qq, wc)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c2708Qq);
            } else {
                if (!(objN instanceof XC)) {
                    if (z2) {
                        C3013ah c3013ah = objN instanceof C3013ah ? (C3013ah) objN : null;
                        interfaceC2766Sw.invoke(c3013ah != null ? c3013ah.f4134a : null);
                    }
                    return NR.f3457a;
                }
                KR krB = ((XC) objN).b();
                if (krB == null) {
                    AbstractC2995aW.o(objN, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Z((GE) objN);
                } else {
                    InterfaceC4612sp interfaceC4612sp = NR.f3457a;
                    if (z && (objN instanceof NE)) {
                        synchronized (objN) {
                            try {
                                thC = ((NE) objN).c();
                                if (thC == null || ((interfaceC2766Sw instanceof C2515Je) && !((NE) objN).e())) {
                                    if (w(objN, krB, c4788up)) {
                                        if (thC == null) {
                                            return c4788up;
                                        }
                                        interfaceC4612sp = c4788up;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thC != null) {
                            if (z2) {
                                interfaceC2766Sw.invoke(thC);
                            }
                            return interfaceC4612sp;
                        }
                        if (w(objN, krB, c4788up)) {
                            return c4788up;
                        }
                    } else {
                        thC = null;
                        if (thC != null) {
                            if (z2) {
                                interfaceC2766Sw.invoke(thC);
                            }
                            return interfaceC4612sp;
                        }
                        if (w(objN, krB, c4788up)) {
                            return c4788up;
                        }
                    }
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final InterfaceC3549gk minusKey(InterfaceC3461fk interfaceC3461fk) {
        return AbstractC2995aW.b0(this, interfaceC3461fk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC4612sp p(InterfaceC2766Sw interfaceC2766Sw) {
        return m(false, true, interfaceC2766Sw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final InterfaceC3549gk plus(InterfaceC3549gk interfaceC3549gk) {
        return AbstractC2995aW.f0(this, interfaceC3549gk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final boolean start() {
        int iA0;
        do {
            iA0 = a0(N());
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(U() + '{' + b0(N()) + '}');
        sb.append('@');
        sb.append(AbstractC2340Cl.x(this));
        return sb.toString();
    }

    public final boolean w(Object obj, KR kr, GE ge) {
        char c;
        OE oe = new OE(ge, this, obj);
        do {
            C3159cJ c3159cJD = kr.d();
            if (c3159cJD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3159cJ.b;
                Object obj2 = atomicReferenceFieldUpdater.get(kr);
                while (true) {
                    c3159cJD = (C3159cJ) obj2;
                    if (!c3159cJD.h()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(c3159cJD);
                }
            }
            C3159cJ.b.lazySet(ge, c3159cJD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3159cJ.f4215a;
            atomicReferenceFieldUpdater2.lazySet(ge, kr);
            oe.c = kr;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(c3159cJD, kr, oe)) {
                    if (oe.a(c3159cJD) != null) {
                        c = 2;
                        break;
                    }
                    c = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(c3159cJD) != kr) {
                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    public void y(Object obj) {
        x(obj);
    }

    public final Object z(InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        Object objN;
        do {
            objN = N();
            if (!(objN instanceof XC)) {
                if (objN instanceof C3013ah) {
                    throw ((C3013ah) objN).f4134a;
                }
                return QE.a(objN);
            }
        } while (a0(objN) < 0);
        LE le = new LE(WD.w(interfaceC2857Wj), this);
        le.t();
        le.n(new C4700tp(m(false, true, new C4788up(le, 2)), 0));
        return le.s();
    }

    public void Y() {
    }

    public void P(C3770jF c3770jF) {
        throw c3770jF;
    }

    public void X(Object obj) {
    }

    public void x(Object obj) {
    }
}
