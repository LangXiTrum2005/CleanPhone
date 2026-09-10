package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3108a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final DO c = new DO(new CopyOnWriteArrayList(), 0, null, 0);
    public final C3031aq d = new C3031aq(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public Gc0 f;
    public WU g;

    public final DO a(C5186zO c5186zO) {
        return new DO(this.c.c, 0, c5186zO, 0L);
    }

    public abstract InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j);

    public final void f(AO ao) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(ao);
        if (z && hashSet.isEmpty()) {
            g();
        }
    }

    public final void h(AO ao) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ao);
        if (zIsEmpty) {
            i();
        }
    }

    public Gc0 j() {
        return null;
    }

    public abstract C3693iO k();

    public boolean l() {
        return true;
    }

    public abstract void m();

    public final void n(AO ao, Bd0 bd0, WU wu) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        FW.h(looper == null || looper == looperMyLooper);
        this.g = wu;
        Gc0 gc0 = this.f;
        this.f3108a.add(ao);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(ao);
            o(bd0);
        } else if (gc0 != null) {
            h(ao);
            ao.a(this, gc0);
        }
    }

    public abstract void o(Bd0 bd0);

    public final void p(Gc0 gc0) {
        this.f = gc0;
        Iterator it = this.f3108a.iterator();
        while (it.hasNext()) {
            ((AO) it.next()).a(this, gc0);
        }
    }

    public abstract void q(InterfaceC4395qO interfaceC4395qO);

    public final void r(AO ao) {
        ArrayList arrayList = this.f3108a;
        arrayList.remove(ao);
        if (!arrayList.isEmpty()) {
            f(ao);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        s();
    }

    public abstract void s();

    public final void t(InterfaceC3120bq interfaceC3120bq) {
        CopyOnWriteArrayList<C2941Zp> copyOnWriteArrayList = this.d.c;
        for (C2941Zp c2941Zp : copyOnWriteArrayList) {
            if (c2941Zp.b == interfaceC3120bq) {
                copyOnWriteArrayList.remove(c2941Zp);
            }
        }
    }

    public final void u(EO eo) {
        CopyOnWriteArrayList<CO> copyOnWriteArrayList = this.c.c;
        for (CO co : copyOnWriteArrayList) {
            if (co.b == eo) {
                copyOnWriteArrayList.remove(co);
            }
        }
    }

    public void g() {
    }

    public void i() {
    }
}
