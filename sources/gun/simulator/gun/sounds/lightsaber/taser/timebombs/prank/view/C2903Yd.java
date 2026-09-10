package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2903Yd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4027a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC2929Zd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2903Yd(AbstractC2929Zd abstractC2929Zd, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = abstractC2929Zd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2903Yd c2903Yd = new C2903Yd(this.c, interfaceC2857Wj);
        c2903Yd.b = obj;
        return c2903Yd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2903Yd) create((VV) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4027a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            VV vv = (VV) this.b;
            this.f4027a = 1;
            if (this.c.c(vv, this) == enumC4602sk) {
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
