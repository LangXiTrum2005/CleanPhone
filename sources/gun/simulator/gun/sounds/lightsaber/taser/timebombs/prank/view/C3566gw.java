package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3566gw implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4438a = 1;
    public final /* synthetic */ InterfaceC4530rv b;
    public final /* synthetic */ Object c;

    public C3566gw(InterfaceC4530rv interfaceC4530rv, InterfaceC3567gx interfaceC3567gx) {
        this.b = interfaceC4530rv;
        this.c = interfaceC3567gx;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, InterfaceC2857Wj interfaceC2857Wj) {
        C4555s90 c4555s90;
        if (interfaceC2857Wj instanceof C4555s90) {
            c4555s90 = (C4555s90) interfaceC2857Wj;
            int i2 = c4555s90.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4555s90.c = i2 - Integer.MIN_VALUE;
            } else {
                c4555s90 = new C4555s90(this, interfaceC2857Wj);
            }
        } else {
            c4555s90 = new C4555s90(this, interfaceC2857Wj);
        }
        Object obj = c4555s90.f4965a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i3 = c4555s90.c;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i3 == 0) {
            AbstractC3375el.b0(obj);
            if (i > 0) {
                Object obj2 = this.c;
                if (!((WX) obj2).f3924a) {
                    ((WX) obj2).f3924a = true;
                    EnumC4901w60 enumC4901w60 = EnumC4901w60.f5168a;
                    c4555s90.c = 1;
                    if (this.b.emit(enumC4901w60, c4555s90) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3478fw c3478fw;
        Object obj2;
        InterfaceC4530rv interfaceC4530rv;
        switch (this.f4438a) {
            case 0:
                if (interfaceC2857Wj instanceof C3478fw) {
                    c3478fw = (C3478fw) interfaceC2857Wj;
                    int i = c3478fw.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c3478fw.b = i - Integer.MIN_VALUE;
                    } else {
                        c3478fw = new C3478fw(this, interfaceC2857Wj);
                    }
                } else {
                    c3478fw = new C3478fw(this, interfaceC2857Wj);
                }
                Object obj3 = c3478fw.f4392a;
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i2 = c3478fw.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        interfaceC4530rv = c3478fw.e;
                        obj2 = c3478fw.d;
                        AbstractC3375el.b0(obj3);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj3);
                    }
                    return C5033xf0.f5238a;
                }
                AbstractC3375el.b0(obj3);
                InterfaceC3567gx interfaceC3567gx = (InterfaceC3567gx) this.c;
                c3478fw.d = obj;
                InterfaceC4530rv interfaceC4530rv2 = this.b;
                c3478fw.e = interfaceC4530rv2;
                c3478fw.b = 1;
                if (interfaceC3567gx.invoke(obj, c3478fw) == enumC4602sk) {
                    return enumC4602sk;
                }
                obj2 = obj;
                interfaceC4530rv = interfaceC4530rv2;
                c3478fw.d = null;
                c3478fw.e = null;
                c3478fw.b = 2;
                if (interfaceC4530rv.emit(obj2, c3478fw) == enumC4602sk) {
                    return enumC4602sk;
                }
                return C5033xf0.f5238a;
            default:
                return c(((Number) obj).intValue(), interfaceC2857Wj);
        }
    }

    public C3566gw(WX wx, InterfaceC4530rv interfaceC4530rv) {
        this.c = wx;
        this.b = interfaceC4530rv;
    }
}
