package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4188o10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4772a;
    public final /* synthetic */ String b;
    public final /* synthetic */ RussianRouletteActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4188o10(RussianRouletteActivity russianRouletteActivity, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = str;
        this.c = russianRouletteActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4188o10(this.c, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4188o10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4772a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            AbstractC3197ck0.b = true;
            String str = this.b;
            AbstractC2995aW.q(str, "<set-?>");
            AbstractC3197ck0.c = str;
            this.f4772a = 1;
            int i2 = RussianRouletteActivity.t;
            RussianRouletteActivity russianRouletteActivity = this.c;
            russianRouletteActivity.getClass();
            if (WD.X(new O10(russianRouletteActivity, str, null), AbstractC4437qp.b, this) == enumC4602sk) {
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
