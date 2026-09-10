package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2480Hv implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4530rv f3192a;
    public final /* synthetic */ C3086bY b;

    public C2480Hv(InterfaceC4530rv interfaceC4530rv, C3086bY c3086bY) {
        this.f3192a = interfaceC4530rv;
        this.b = c3086bY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C2454Gv c2454Gv;
        C2480Hv c2480Hv;
        if (interfaceC2857Wj instanceof C2454Gv) {
            c2454Gv = (C2454Gv) interfaceC2857Wj;
            int i = c2454Gv.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2454Gv.d = i - Integer.MIN_VALUE;
            } else {
                c2454Gv = new C2454Gv(this, interfaceC2857Wj);
            }
        } else {
            c2454Gv = new C2454Gv(this, interfaceC2857Wj);
        }
        Object obj2 = c2454Gv.b;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2454Gv.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2480Hv = c2454Gv.f3143a;
            try {
                AbstractC3375el.b0(obj2);
                return C5033xf0.f5238a;
            } catch (Throwable th) {
                th = th;
                c2480Hv.b.f4172a = th;
                throw th;
            }
        }
        AbstractC3375el.b0(obj2);
        try {
            InterfaceC4530rv interfaceC4530rv = this.f3192a;
            c2454Gv.f3143a = this;
            c2454Gv.d = 1;
            if (interfaceC4530rv.emit(obj, c2454Gv) == enumC4602sk) {
                return enumC4602sk;
            }
            return C5033xf0.f5238a;
        } catch (Throwable th2) {
            th = th2;
            c2480Hv = this;
            c2480Hv.b.f4172a = th;
            throw th;
        }
    }
}
