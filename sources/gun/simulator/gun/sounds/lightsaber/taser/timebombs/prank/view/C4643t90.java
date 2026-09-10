package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4643t90 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5022a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC4731u90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4643t90(InterfaceC4731u90 interfaceC4731u90, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = interfaceC4731u90;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4643t90 c4643t90 = new C4643t90(this.c, interfaceC2857Wj);
        c4643t90.b = obj;
        return c4643t90;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        ((C4643t90) create((InterfaceC4530rv) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
        return EnumC4602sk.f4993a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5022a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C3566gw c3566gw = new C3566gw(new WX(), (InterfaceC4530rv) this.b);
            this.f5022a = 1;
            if (this.c.collect(c3566gw, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        throw new C3770jF(6, 0);
    }
}
