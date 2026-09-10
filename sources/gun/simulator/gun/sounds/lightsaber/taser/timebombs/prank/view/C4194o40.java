package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4194o40 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4370q40 f4775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4194o40(C4370q40 c4370q40, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4775a = c4370q40;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4194o40(this.f4775a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4194o40 c4194o40 = (C4194o40) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4194o40.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C4370q40 c4370q40 = this.f4775a;
        InterfaceC2714Qw interfaceC2714Qw = c4370q40.c;
        if (interfaceC2714Qw != null) {
            interfaceC2714Qw.invoke();
        }
        c4370q40.k = System.currentTimeMillis();
        return C5033xf0.f5238a;
    }
}
