package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2778Ti extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3785a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2856Wi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2778Ti(C2856Wi c2856Wi, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c2856Wi;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2778Ti c2778Ti = new C2778Ti(this.c, interfaceC2857Wj);
        c2778Ti.b = obj;
        return c2778Ti;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2778Ti) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3785a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return obj;
        }
        AbstractC3375el.b0(obj);
        C2856Wi c2856Wi = this.c;
        if (c2856Wi.c) {
            return c2856Wi.e;
        }
        C2752Si c2752Si = new C2752Si(c2856Wi, null);
        this.f3785a = 1;
        Object objX = WD.X(c2752Si, AbstractC4437qp.b, this);
        return objX == enumC4602sk ? enumC4602sk : objX;
    }
}
