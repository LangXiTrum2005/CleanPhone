package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class YP implements InterfaceC3551gl, InterfaceC3463fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4017a;
    public final Pools.Pool b;
    public int c;
    public IV d;
    public InterfaceC3463fl e;
    public List f;
    public boolean g;

    public YP(ArrayList arrayList, Pools.Pool pool) {
        this.b = pool;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f4017a = arrayList;
        this.c = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        return ((InterfaceC3551gl) this.f4017a.get(0)).a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
        List list = this.f;
        if (list != null) {
            this.b.release(list);
        }
        this.f = null;
        Iterator it = this.f4017a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3551gl) it.next()).b();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) {
        this.d = iv;
        this.e = interfaceC3463fl;
        this.f = (List) this.b.acquire();
        ((InterfaceC3551gl) this.f4017a.get(this.c)).c(iv, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
        this.g = true;
        Iterator it = this.f4017a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3551gl) it.next()).cancel();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3463fl
    public final void d(Exception exc) {
        List list = this.f;
        AbstractC2871Wx.V(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return ((InterfaceC3551gl) this.f4017a.get(0)).e();
    }

    public final void f() {
        if (this.g) {
            return;
        }
        if (this.c < this.f4017a.size() - 1) {
            this.c++;
            c(this.d, this.e);
        } else {
            AbstractC2871Wx.U(this.f);
            this.e.d(new C3039ay("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3463fl
    public final void k(Object obj) {
        if (obj != null) {
            this.e.k(obj);
        } else {
            f();
        }
    }
}
