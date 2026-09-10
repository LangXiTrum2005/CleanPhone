package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3449fe implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3086bY f4375a;
    public final /* synthetic */ InterfaceC4514rk b;
    public final /* synthetic */ C3625he c;
    public final /* synthetic */ InterfaceC4530rv d;

    public C3449fe(C3086bY c3086bY, InterfaceC4514rk interfaceC4514rk, C3625he c3625he, InterfaceC4530rv interfaceC4530rv) {
        this.f4375a = c3086bY;
        this.b = interfaceC4514rk;
        this.c = c3625he;
        this.d = interfaceC4530rv;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3361ee c3361ee;
        C3449fe c3449fe;
        if (interfaceC2857Wj instanceof C3361ee) {
            c3361ee = (C3361ee) interfaceC2857Wj;
            int i = c3361ee.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3361ee.e = i - Integer.MIN_VALUE;
            } else {
                c3361ee = new C3361ee(this, interfaceC2857Wj);
            }
        } else {
            c3361ee = new C3361ee(this, interfaceC2857Wj);
        }
        Object obj2 = c3361ee.c;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c3361ee.e;
        if (i2 == 0) {
            AbstractC3375el.b0(obj2);
            InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) this.f4375a.f4172a;
            if (interfaceC5000xE != null) {
                interfaceC5000xE.a(new C2437Ge("Child of the scoped flow was cancelled"));
                c3361ee.f4326a = this;
                c3361ee.b = obj;
                c3361ee.getClass();
                c3361ee.e = 1;
                if (interfaceC5000xE.c(c3361ee) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            c3449fe = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c3361ee.b;
            c3449fe = c3361ee.f4326a;
            AbstractC3375el.b0(obj2);
        }
        c3449fe.f4375a.f4172a = WD.D(c3449fe.b, null, 4, new C3273de(c3449fe.c, c3449fe.d, obj, null), 1);
        return C5033xf0.f5238a;
    }
}
