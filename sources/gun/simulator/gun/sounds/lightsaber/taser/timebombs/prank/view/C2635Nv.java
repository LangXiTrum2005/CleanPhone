package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2635Nv implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4443qv f3483a;
    public final /* synthetic */ int b = 1;

    public C2635Nv(BX bx) {
        this.f3483a = bx;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rv] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        C2609Mv c2609Mv;
        if (interfaceC2857Wj instanceof C2609Mv) {
            c2609Mv = (C2609Mv) interfaceC2857Wj;
            int i = c2609Mv.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2609Mv.b = i - Integer.MIN_VALUE;
            } else {
                c2609Mv = new C2609Mv(this, interfaceC2857Wj);
            }
        } else {
            c2609Mv = new C2609Mv(this, interfaceC2857Wj);
        }
        Object obj = c2609Mv.f3429a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2609Mv.b;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                ZX zx = new ZX();
                InterfaceC4443qv interfaceC4443qv = this.f3483a;
                C2687Pv c2687Pv = new C2687Pv(zx, this.b, interfaceC4530rv);
                c2609Mv.d = interfaceC4530rv;
                c2609Mv.b = 1;
                Object objCollect = interfaceC4443qv.collect(c2687Pv, c2609Mv);
                interfaceC4530rv = objCollect;
                if (objCollect == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC4530rv interfaceC4530rv2 = c2609Mv.d;
                AbstractC3375el.b0(obj);
                interfaceC4530rv = interfaceC4530rv2;
            }
        } catch (C3218d e) {
            if (e.f4252a != interfaceC4530rv) {
                throw e;
            }
        }
        return C5033xf0.f5238a;
    }
}
