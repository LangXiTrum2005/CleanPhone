package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2687Pv implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZX f3579a;
    public final /* synthetic */ int b;
    public final /* synthetic */ InterfaceC4530rv c;

    public C2687Pv(ZX zx, int i, InterfaceC4530rv interfaceC4530rv) {
        this.f3579a = zx;
        this.b = i;
        this.c = interfaceC4530rv;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2661Ov c2661Ov;
        if (interfaceC2857Wj instanceof C2661Ov) {
            c2661Ov = (C2661Ov) interfaceC2857Wj;
            int i = c2661Ov.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2661Ov.c = i - Integer.MIN_VALUE;
            } else {
                c2661Ov = new C2661Ov(this, interfaceC2857Wj);
            }
        } else {
            c2661Ov = new C2661Ov(this, interfaceC2857Wj);
        }
        Object obj2 = c2661Ov.f3527a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2661Ov.c;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 == 0) {
            AbstractC3375el.b0(obj2);
            ZX zx = this.f3579a;
            int i3 = zx.f4074a + 1;
            zx.f4074a = i3;
            int i4 = this.b;
            InterfaceC4530rv interfaceC4530rv = this.c;
            if (i3 >= i4) {
                c2661Ov.c = 2;
                AbstractC2995aW.f(interfaceC4530rv, obj, c2661Ov);
                return enumC4602sk;
            }
            c2661Ov.c = 1;
            if (interfaceC4530rv.emit(obj, c2661Ov) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj2);
                return c5033xf0;
            }
            AbstractC3375el.b0(obj2);
        }
        return c5033xf0;
    }
}
