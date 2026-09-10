package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4641t80 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5020a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C5081y80 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4641t80(C5081y80 c5081y80, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c5081y80;
        this.d = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4641t80 c4641t80 = new C4641t80(this.c, this.d, interfaceC2857Wj);
        c4641t80.b = obj;
        return c4641t80;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4641t80) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5020a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C5081y80 c5081y80 = this.c;
            boolean z = this.d;
            C5081y80.o(c5081y80, z);
            if (z) {
                c5081y80.w = true;
            }
            C4553s80 c4553s80 = new C4553s80(c5081y80, null);
            this.f5020a = 1;
            if (WD.X(c4553s80, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
