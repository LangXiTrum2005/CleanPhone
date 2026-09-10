package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2830Vi extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3887a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2856Wi c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2830Vi(C2856Wi c2856Wi, Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c2856Wi;
        this.d = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2830Vi c2830Vi = new C2830Vi(this.c, this.d, interfaceC2857Wj);
        c2830Vi.b = obj;
        return c2830Vi;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2830Vi) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3887a;
        Object obj2 = this.d;
        C2856Wi c2856Wi = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            if (!AbstractC2995aW.i(c2856Wi.e, obj2) || !c2856Wi.c) {
                C2804Ui c2804Ui = new C2804Ui(c2856Wi, obj2, null);
                this.f3887a = 1;
                if (WD.X(c2804Ui, AbstractC4437qp.b, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        c2856Wi.e = obj2;
        return C5033xf0.f5238a;
    }
}
