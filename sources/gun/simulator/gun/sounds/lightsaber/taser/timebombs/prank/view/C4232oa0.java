package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4232oa0 implements InterfaceC4286p60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4286p60 f4793a;
    public final InterfaceC3567gx b;

    public C4232oa0(InterfaceC4286p60 interfaceC4286p60, InterfaceC3567gx interfaceC3567gx) {
        this.f4793a = interfaceC4286p60;
        this.b = interfaceC3567gx;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        C4144na0 c4144na0;
        if (interfaceC2857Wj instanceof C4144na0) {
            c4144na0 = (C4144na0) interfaceC2857Wj;
            int i = c4144na0.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4144na0.c = i - Integer.MIN_VALUE;
            } else {
                c4144na0 = new C4144na0(this, interfaceC2857Wj);
            }
        } else {
            c4144na0 = new C4144na0(this, interfaceC2857Wj);
        }
        Object obj = c4144na0.f4749a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c4144na0.c;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            C4056ma0 c4056ma0 = new C4056ma0(interfaceC4530rv, this.b);
            c4144na0.c = 1;
            if (this.f4793a.collect(c4056ma0, c4144na0) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        throw new C3770jF(6, 0);
    }
}
