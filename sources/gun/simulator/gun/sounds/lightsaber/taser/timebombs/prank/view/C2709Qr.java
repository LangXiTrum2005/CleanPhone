package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2709Qr implements InterfaceC4320pa0, GW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3630a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public C2709Qr(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a(Executor executor, InterfaceC2761Sr interfaceC2761Sr) {
        try {
            executor.getClass();
            if (!this.f3630a.containsKey(AbstractC3375el.class)) {
                this.f3630a.put(AbstractC3375el.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f3630a.get(AbstractC3375el.class)).put(interfaceC2761Sr, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
