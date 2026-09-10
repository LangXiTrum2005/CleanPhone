package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import androidx.core.util.Pools;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.At, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2296At implements Pools.Pool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5232zt f2842a;
    public final InterfaceC2348Ct b;
    public final Pools.Pool c;

    public C2296At(Pools.SynchronizedPool synchronizedPool, InterfaceC5232zt interfaceC5232zt, InterfaceC2348Ct interfaceC2348Ct) {
        this.c = synchronizedPool;
        this.f2842a = interfaceC5232zt;
        this.b = interfaceC2348Ct;
    }

    @Override // androidx.core.util.Pools.Pool
    public final Object acquire() {
        Object objAcquire = this.c.acquire();
        if (objAcquire == null) {
            objAcquire = this.f2842a.create();
            if (Log.isLoggable("FactoryPools", 2)) {
                objAcquire.getClass().toString();
            }
        }
        if (objAcquire instanceof InterfaceC2322Bt) {
            ((InterfaceC2322Bt) objAcquire).c().f4940a = false;
        }
        return objAcquire;
    }

    @Override // androidx.core.util.Pools.Pool
    public final boolean release(Object obj) {
        if (obj instanceof InterfaceC2322Bt) {
            ((InterfaceC2322Bt) obj).c().f4940a = true;
        }
        this.b.d(obj);
        return this.c.release(obj);
    }
}
