package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2877Xd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3981a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC4530rv c;
    public final /* synthetic */ AbstractC2929Zd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2877Xd(InterfaceC2857Wj interfaceC2857Wj, InterfaceC4530rv interfaceC4530rv, AbstractC2929Zd abstractC2929Zd) {
        super(2, interfaceC2857Wj);
        this.c = interfaceC4530rv;
        this.d = abstractC2929Zd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2877Xd c2877Xd = new C2877Xd(interfaceC2857Wj, this.c, this.d);
        c2877Xd.b = obj;
        return c2877Xd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2877Xd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3981a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
            AbstractC2929Zd abstractC2929Zd = this.d;
            int i2 = abstractC2929Zd.b;
            if (i2 == -3) {
                i2 = -2;
            }
            InterfaceC3567gx c2903Yd = new C2903Yd(abstractC2929Zd, null);
            UV uv = new UV(WD.H(interfaceC4514rk, abstractC2929Zd.f4081a), AbstractC3375el.a(i2, abstractC2929Zd.c, 4));
            uv.f0(3, uv, c2903Yd);
            this.f3981a = 1;
            Object objO = WD.o(this.c, uv, true, this);
            if (objO != enumC4602sk) {
                objO = c5033xf0;
            }
            if (objO == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }
}
