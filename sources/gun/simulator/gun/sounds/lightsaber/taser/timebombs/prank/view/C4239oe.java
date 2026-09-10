package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4239oe extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4799a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC3842k40 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4239oe(InterfaceC3842k40 interfaceC3842k40, Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = interfaceC3842k40;
        this.d = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4239oe c4239oe = new C4239oe(this.c, this.d, interfaceC2857Wj);
        c4239oe.b = obj;
        return c4239oe;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4239oe) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object objV;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4799a;
        Object c3799je = C5033xf0.f5238a;
        try {
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC3842k40 interfaceC3842k40 = this.c;
                Object obj2 = this.d;
                this.f4799a = 1;
                if (interfaceC3842k40.g(obj2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            objV = c3799je;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (!(!(objV instanceof HZ))) {
            c3799je = new C3799je(IZ.a(objV));
        }
        return new C4063me(c3799je);
    }
}
