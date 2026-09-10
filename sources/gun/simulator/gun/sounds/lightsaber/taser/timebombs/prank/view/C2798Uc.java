package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2798Uc extends AbstractC4349pp implements InterfaceC2772Tc, InterfaceC4690tk, InterfaceC5129yj0 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C2798Uc.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C2798Uc.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C2798Uc.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final InterfaceC2857Wj d;
    public final InterfaceC3549gk e;

    public C2798Uc(int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(i);
        this.d = interfaceC2857Wj;
        this.e = interfaceC2857Wj.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C4361q0.f4862a;
    }

    public static Object E(QR qr, Object obj, int i, InterfaceC2766Sw interfaceC2766Sw) {
        if ((obj instanceof C3013ah) || !WD.y(i)) {
            return obj;
        }
        if (interfaceC2766Sw != null || (qr instanceof AbstractC2746Sc)) {
            return new C2906Yg(obj, qr instanceof AbstractC2746Sc ? (AbstractC2746Sc) qr : null, interfaceC2766Sw, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        InterfaceC2857Wj interfaceC2857Wj = this.d;
        Throwable th = null;
        C4085mp c4085mp = interfaceC2857Wj instanceof C4085mp ? (C4085mp) interfaceC2857Wj : null;
        if (c4085mp != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4085mp.h;
                Object obj = atomicReferenceFieldUpdater.get(c4085mp);
                SE se = AbstractC4173np.b;
                if (obj != se) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c4085mp, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c4085mp) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c4085mp, se, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c4085mp) == se);
            }
            if (th == null) {
                return;
            }
            o();
            e(th);
        }
    }

    public final void B(InterfaceC2766Sw interfaceC2766Sw, Object obj) throws IllegalAccessException, InvocationTargetException {
        C(obj, this.c, interfaceC2766Sw);
    }

    public final void C(Object obj, int i, InterfaceC2766Sw interfaceC2766Sw) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof QR)) {
                if (obj2 instanceof C2850Wc) {
                    C2850Wc c2850Wc = (C2850Wc) obj2;
                    c2850Wc.getClass();
                    if (C2850Wc.c.compareAndSet(c2850Wc, 0, 1)) {
                        if (interfaceC2766Sw != null) {
                            l(interfaceC2766Sw, c2850Wc.f4134a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objE = E((QR) obj2, obj, i, interfaceC2766Sw);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!x()) {
                        o();
                    }
                    p(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final SE F(Object obj, InterfaceC2766Sw interfaceC2766Sw) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof QR)) {
                boolean z = obj2 instanceof C2906Yg;
                return null;
            }
            Object objE = E((QR) obj2, obj, this.c, interfaceC2766Sw);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!x()) {
                        o();
                    }
                    return AbstractC2824Vc.f3878a;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5129yj0
    public final void a(W30 w30, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(w30);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final void b(Object obj, CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof QR) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C3013ah) {
                return;
            }
            if (!(obj2 instanceof C2906Yg)) {
                C2906Yg c2906Yg = new C2906Yg(obj2, (AbstractC2746Sc) null, (InterfaceC2766Sw) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2906Yg)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C2906Yg c2906Yg2 = (C2906Yg) obj2;
            if (!(!(c2906Yg2.e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            C2906Yg c2906YgA = C2906Yg.a(c2906Yg2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2906YgA)) {
                    AbstractC2746Sc abstractC2746Sc = c2906Yg2.b;
                    if (abstractC2746Sc != null) {
                        k(abstractC2746Sc, cancellationException);
                    }
                    InterfaceC2766Sw interfaceC2766Sw = c2906Yg2.c;
                    if (interfaceC2766Sw != null) {
                        l(interfaceC2766Sw, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final InterfaceC2857Wj c() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final SE d(Throwable th) {
        return F(new C3013ah(false, th), null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final boolean e(Throwable th) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof QR)) {
                return false;
            }
            C2850Wc c2850Wc = new C2850Wc(this, th, (obj instanceof AbstractC2746Sc) || (obj instanceof W30));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2850Wc)) {
                    QR qr = (QR) obj;
                    if (qr instanceof AbstractC2746Sc) {
                        k((AbstractC2746Sc) obj, th);
                    } else if (qr instanceof W30) {
                        m((W30) obj, th);
                    }
                    if (!x()) {
                        o();
                    }
                    p(this.c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final Object g(Object obj) {
        return obj instanceof C2906Yg ? ((C2906Yg) obj).f4031a : obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4690tk
    public final InterfaceC4690tk getCallerFrame() {
        InterfaceC2857Wj interfaceC2857Wj = this.d;
        if (interfaceC2857Wj instanceof InterfaceC4690tk) {
            return (InterfaceC4690tk) interfaceC2857Wj;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4349pp
    public final Object i() {
        return g.get(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final boolean isActive() {
        return g.get(this) instanceof QR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final SE j(Object obj, InterfaceC2766Sw interfaceC2766Sw) {
        return F(obj, interfaceC2766Sw);
    }

    public final void k(AbstractC2746Sc abstractC2746Sc, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            abstractC2746Sc.a(th);
        } catch (Throwable th2) {
            AbstractC2995aW.Q(this.e, new C3770jF("Exception in invokeOnCancellation handler for " + this, th2, 8));
        }
    }

    public final void l(InterfaceC2766Sw interfaceC2766Sw, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            interfaceC2766Sw.invoke(th);
        } catch (Throwable th2) {
            AbstractC2995aW.Q(this.e, new C3770jF("Exception in resume onCancellation handler for " + this, th2, 8));
        }
    }

    public final void m(W30 w30, Throwable th) throws IllegalAccessException, InvocationTargetException {
        InterfaceC3549gk interfaceC3549gk = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            w30.g(i, interfaceC3549gk);
        } catch (Throwable th2) {
            AbstractC2995aW.Q(interfaceC3549gk, new C3770jF("Exception in invokeOnCancellation handler for " + this, th2, 8));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final void n(InterfaceC2766Sw interfaceC2766Sw) {
        w(interfaceC2766Sw instanceof AbstractC2746Sc ? (AbstractC2746Sc) interfaceC2766Sw : new C4700tp(interfaceC2766Sw, 1));
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        InterfaceC4612sp interfaceC4612sp = (InterfaceC4612sp) atomicReferenceFieldUpdater.get(this);
        if (interfaceC4612sp == null) {
            return;
        }
        interfaceC4612sp.c();
        atomicReferenceFieldUpdater.set(this, NR.f3457a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z = i == 4;
                InterfaceC2857Wj interfaceC2857Wj = this.d;
                if (z || !(interfaceC2857Wj instanceof C4085mp) || WD.y(i) != WD.y(this.c)) {
                    WD.Q(this, interfaceC2857Wj, z);
                    return;
                }
                AbstractC3899kk abstractC3899kk = ((C4085mp) interfaceC2857Wj).d;
                InterfaceC3549gk context = interfaceC2857Wj.getContext();
                if (abstractC3899kk.isDispatchNeeded(context)) {
                    abstractC3899kk.dispatch(context, this);
                    return;
                }
                AbstractC3210cs abstractC3210csA = AbstractC3270dc0.a();
                if (abstractC3210csA.q()) {
                    abstractC3210csA.i(this);
                    return;
                }
                abstractC3210csA.o(true);
                try {
                    WD.Q(this, interfaceC2857Wj, true);
                    do {
                    } while (abstractC3210csA.t());
                } catch (Throwable th) {
                    try {
                        h(th, null);
                    } finally {
                        abstractC3210csA.g(true);
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(PE pe) {
        return pe.k();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final void r(AbstractC3899kk abstractC3899kk) throws IllegalAccessException, InvocationTargetException {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        InterfaceC2857Wj interfaceC2857Wj = this.d;
        C4085mp c4085mp = interfaceC2857Wj instanceof C4085mp ? (C4085mp) interfaceC2857Wj : null;
        C(c5033xf0, (c4085mp != null ? c4085mp.d : null) == abstractC3899kk ? 4 : this.c, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = IZ.a(obj);
        if (thA != null) {
            obj = new C3013ah(false, thA);
        }
        C(obj, this.c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (zX) {
                    A();
                }
                Object obj = g.get(this);
                if (obj instanceof C3013ah) {
                    throw ((C3013ah) obj).f4134a;
                }
                if (WD.y(this.c)) {
                    InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) this.e.get(G7.e);
                    if (interfaceC5000xE != null && !interfaceC5000xE.isActive()) {
                        CancellationException cancellationExceptionK = interfaceC5000xE.k();
                        b(obj, cancellationExceptionK);
                        throw cancellationExceptionK;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC4612sp) h.get(this)) == null) {
            u();
        }
        if (zX) {
            A();
        }
        return EnumC4602sk.f4993a;
    }

    public final void t() {
        InterfaceC4612sp interfaceC4612spU = u();
        if (interfaceC4612spU != null && (!(g.get(this) instanceof QR))) {
            interfaceC4612spU.c();
            h.set(this, NR.f3457a);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC2340Cl.U(this.d));
        sb.append("){");
        Object obj = g.get(this);
        if (obj instanceof QR) {
            str = "Active";
        } else {
            str = obj instanceof C2850Wc ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC2340Cl.x(this));
        return sb.toString();
    }

    public final InterfaceC4612sp u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) this.e.get(G7.e);
        if (interfaceC5000xE == null) {
            return null;
        }
        InterfaceC4612sp interfaceC4612spJ = AbstractC3375el.J(interfaceC5000xE, true, new C2463He(this), 2);
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC4612spJ)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC4612spJ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc
    public final void v(Object obj) {
        p(this.c);
    }

    public final void w(Object obj) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C4361q0) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            if ((obj2 instanceof AbstractC2746Sc) || (obj2 instanceof W30)) {
                y(obj, obj2);
                throw null;
            }
            boolean z = obj2 instanceof C3013ah;
            if (z) {
                C3013ah c3013ah = (C3013ah) obj2;
                c3013ah.getClass();
                if (!C3013ah.b.compareAndSet(c3013ah, 0, 1)) {
                    y(obj, obj2);
                    throw null;
                }
                if (obj2 instanceof C2850Wc) {
                    if (!z) {
                        c3013ah = null;
                    }
                    Throwable th = c3013ah != null ? c3013ah.f4134a : null;
                    if (obj instanceof AbstractC2746Sc) {
                        k((AbstractC2746Sc) obj, th);
                        return;
                    } else {
                        AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((W30) obj, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj2 instanceof C2906Yg)) {
                if (obj instanceof W30) {
                    return;
                }
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C2906Yg c2906Yg = new C2906Yg(obj2, (AbstractC2746Sc) obj, (InterfaceC2766Sw) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2906Yg)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C2906Yg c2906Yg2 = (C2906Yg) obj2;
            if (c2906Yg2.b != null) {
                y(obj, obj2);
                throw null;
            }
            if (obj instanceof W30) {
                return;
            }
            AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            AbstractC2746Sc abstractC2746Sc = (AbstractC2746Sc) obj;
            Throwable th2 = c2906Yg2.e;
            if (th2 != null) {
                k(abstractC2746Sc, th2);
                return;
            }
            C2906Yg c2906YgA = C2906Yg.a(c2906Yg2, abstractC2746Sc, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2906YgA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.c == 2) {
            InterfaceC2857Wj interfaceC2857Wj = this.d;
            AbstractC2995aW.o(interfaceC2857Wj, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C4085mp.h.get((C4085mp) interfaceC2857Wj) != null) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
