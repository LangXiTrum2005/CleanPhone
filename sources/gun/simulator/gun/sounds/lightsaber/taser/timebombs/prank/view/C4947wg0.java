package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4947wg0 implements Ka0, InterfaceC4522ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5192a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4947wg0(ScheduledExecutorServiceC4435qo scheduledExecutorServiceC4435qo, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f5192a = i;
        this.c = scheduledExecutorServiceC4435qo;
        this.d = obj;
        this.b = j;
        this.e = timeUnit;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4522ro
    public final ScheduledFuture a(Wm0 wm0) {
        int i = this.f5192a;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        ScheduledExecutorServiceC4435qo scheduledExecutorServiceC4435qo = (ScheduledExecutorServiceC4435qo) this.c;
        switch (i) {
            case 1:
                scheduledExecutorServiceC4435qo.getClass();
                RunnableC4259oo runnableC4259oo = new RunnableC4259oo(scheduledExecutorServiceC4435qo, (Runnable) obj2, wm0, 1);
                return scheduledExecutorServiceC4435qo.b.schedule(runnableC4259oo, j, (TimeUnit) obj);
            default:
                scheduledExecutorServiceC4435qo.getClass();
                OJ oj = new OJ(scheduledExecutorServiceC4435qo, (Callable) obj2, wm0, 2);
                return scheduledExecutorServiceC4435qo.b.schedule(oj, j, (TimeUnit) obj);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
    public final Object execute() {
        C5123yg0 c5123yg0 = (C5123yg0) this.c;
        Iterable iterable = (Iterable) this.d;
        Sd0 sd0 = (Sd0) this.e;
        E20 e20 = (E20) c5123yg0.c;
        e20.getClass();
        if (iterable.iterator().hasNext()) {
            e20.k(new C2351Cw(e20, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + E20.o(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 2));
        }
        e20.k(new C5069y20(((C5211zg0) c5123yg0.g).a() + this.b, sd0));
        return null;
    }

    public /* synthetic */ C4947wg0(C5123yg0 c5123yg0, Iterable iterable, Sd0 sd0, long j) {
        this.f5192a = 0;
        this.c = c5123yg0;
        this.d = iterable;
        this.e = sd0;
        this.b = j;
    }
}
