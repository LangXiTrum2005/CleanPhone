package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2642Oc extends C3007ae {
    public final InterfaceC3567gx e;

    public C2642Oc(InterfaceC3567gx interfaceC3567gx, InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        super(interfaceC3567gx, interfaceC3549gk, i, enumC5024xb);
        this.e = interfaceC3567gx;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3007ae, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public final Object c(VV vv, InterfaceC2857Wj interfaceC2857Wj) {
        C2616Nc c2616Nc;
        if (interfaceC2857Wj instanceof C2616Nc) {
            c2616Nc = (C2616Nc) interfaceC2857Wj;
            int i = c2616Nc.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2616Nc.d = i - Integer.MIN_VALUE;
            } else {
                c2616Nc = new C2616Nc(this, interfaceC2857Wj);
            }
        } else {
            c2616Nc = new C2616Nc(this, interfaceC2857Wj);
        }
        Object obj = c2616Nc.b;
        Object obj2 = EnumC4602sk.f4993a;
        int i2 = c2616Nc.d;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            c2616Nc.f3462a = vv;
            c2616Nc.d = 1;
            if (super.c(vv, c2616Nc) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vv = c2616Nc.f3462a;
            AbstractC3375el.b0(obj);
        }
        if (((UV) vv).d.u()) {
            return C5033xf0.f5238a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3007ae, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public final AbstractC2929Zd d(InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        return new C2642Oc(this.e, interfaceC3549gk, i, enumC5024xb);
    }
}
