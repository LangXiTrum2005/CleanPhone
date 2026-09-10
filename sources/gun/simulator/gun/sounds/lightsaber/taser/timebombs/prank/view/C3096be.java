package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3096be extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4178a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC3184ce c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3096be(AbstractC3184ce abstractC3184ce, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = abstractC3184ce;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3096be c3096be = new C3096be(this.c, interfaceC2857Wj);
        c3096be.b = obj;
        return c3096be;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3096be) create((InterfaceC4530rv) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4178a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4530rv interfaceC4530rv = (InterfaceC4530rv) this.b;
            this.f4178a = 1;
            if (this.c.g(interfaceC4530rv, this) == enumC4602sk) {
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
