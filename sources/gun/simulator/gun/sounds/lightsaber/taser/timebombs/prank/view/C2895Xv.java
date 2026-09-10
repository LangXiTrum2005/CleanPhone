package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2895Xv implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3567gx f3999a;
    public final /* synthetic */ C3086bY b;

    public C2895Xv(InterfaceC3567gx interfaceC3567gx, C3086bY c3086bY) {
        this.f3999a = interfaceC3567gx;
        this.b = c3086bY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2869Wv c2869Wv;
        C2895Xv c2895Xv;
        if (interfaceC2857Wj instanceof C2869Wv) {
            c2869Wv = (C2869Wv) interfaceC2857Wj;
            int i = c2869Wv.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2869Wv.c = i - Integer.MIN_VALUE;
            } else {
                c2869Wv = new C2869Wv(this, interfaceC2857Wj);
            }
        } else {
            c2869Wv = new C2869Wv(this, interfaceC2857Wj);
        }
        Object objInvoke = c2869Wv.b;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2869Wv.c;
        if (i2 == 0) {
            AbstractC3375el.b0(objInvoke);
            c2869Wv.f3946a = this;
            c2869Wv.e = obj;
            c2869Wv.c = 1;
            objInvoke = this.f3999a.invoke(obj, c2869Wv);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            c2895Xv = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c2869Wv.e;
            c2895Xv = c2869Wv.f3946a;
            AbstractC3375el.b0(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return C5033xf0.f5238a;
        }
        c2895Xv.b.f4172a = obj;
        throw new C3218d(c2895Xv);
    }
}
