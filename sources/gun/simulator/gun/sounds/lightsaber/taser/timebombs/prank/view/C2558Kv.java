package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2558Kv implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WX f3330a;
    public final /* synthetic */ InterfaceC4530rv b;
    public final /* synthetic */ InterfaceC3567gx c;

    public C2558Kv(WX wx, InterfaceC4530rv interfaceC4530rv, InterfaceC3567gx interfaceC3567gx) {
        this.f3330a = wx;
        this.b = interfaceC4530rv;
        this.c = interfaceC3567gx;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2532Jv c2532Jv;
        C2558Kv c2558Kv;
        if (interfaceC2857Wj instanceof C2532Jv) {
            c2532Jv = (C2532Jv) interfaceC2857Wj;
            int i = c2532Jv.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2532Jv.e = i - Integer.MIN_VALUE;
            } else {
                c2532Jv = new C2532Jv(this, interfaceC2857Wj);
            }
        } else {
            c2532Jv = new C2532Jv(this, interfaceC2857Wj);
        }
        Object objInvoke = c2532Jv.c;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2532Jv.e;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 == 0) {
            AbstractC3375el.b0(objInvoke);
            if (this.f3330a.f3924a) {
                c2532Jv.e = 1;
                return this.b.emit(obj, c2532Jv) == enumC4602sk ? enumC4602sk : c5033xf0;
            }
            c2532Jv.f3289a = this;
            c2532Jv.b = obj;
            c2532Jv.e = 2;
            objInvoke = this.c.invoke(obj, c2532Jv);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            c2558Kv = this;
            if (!((Boolean) objInvoke).booleanValue()) {
                c2558Kv.f3330a.f3924a = true;
                c2532Jv.f3289a = null;
                c2532Jv.b = null;
                c2532Jv.e = 3;
                if (c2558Kv.b.emit(obj, c2532Jv) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i2 == 1) {
                AbstractC3375el.b0(objInvoke);
            }
            if (i2 == 2) {
                obj = c2532Jv.b;
                c2558Kv = c2532Jv.f3289a;
                AbstractC3375el.b0(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    c2558Kv.f3330a.f3924a = true;
                    c2532Jv.f3289a = null;
                    c2532Jv.b = null;
                    c2532Jv.e = 3;
                    if (c2558Kv.b.emit(obj, c2532Jv) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objInvoke);
            }
        }
        return c5033xf0;
    }
}
