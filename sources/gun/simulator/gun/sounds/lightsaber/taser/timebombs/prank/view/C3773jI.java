package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3773jI extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4547a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4213oI c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3773jI(C4213oI c4213oI, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c4213oI;
        this.d = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3773jI c3773jI = new C3773jI(this.c, this.d, interfaceC2857Wj);
        c3773jI.b = obj;
        return c3773jI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3773jI) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4547a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4213oI c4213oI = this.c;
            boolean z = this.d;
            super/*gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.My*/.f(z);
            if (z) {
                c4213oI.E = true;
                c4213oI.X = true;
            }
            C3687iI c3687iI = new C3687iI(c4213oI, null);
            this.f4547a = 1;
            if (WD.X(c3687iI, AbstractC4437qp.b, this) == enumC4602sk) {
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
