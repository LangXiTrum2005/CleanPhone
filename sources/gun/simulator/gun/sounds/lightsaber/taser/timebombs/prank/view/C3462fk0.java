package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3462fk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4382a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC4340pk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3462fk0(AbstractC4340pk0 abstractC4340pk0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = abstractC4340pk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3462fk0 c3462fk0 = new C3462fk0(this.c, interfaceC2857Wj);
        c3462fk0.b = obj;
        return c3462fk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3462fk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4382a;
        AbstractC4340pk0 abstractC4340pk0 = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            if (!(abstractC4340pk0 instanceof C3355eb)) {
                C3374ek0 c3374ek0 = new C3374ek0(abstractC4340pk0, null);
                this.f4382a = 1;
                if (WD.X(c3374ek0, AbstractC4437qp.b, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        abstractC4340pk0.k(abstractC4340pk0.b.getMagazineCapacity());
        Weapon weapon = abstractC4340pk0.b;
        if (weapon.getCartridgeClip() > 0) {
            abstractC4340pk0.l(weapon.getCartridgeClip());
        }
        return C5033xf0.f5238a;
    }
}
