package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2874Xa extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3975a;
    public final /* synthetic */ C3355eb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2874Xa(C3355eb c3355eb, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c3355eb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2874Xa(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2874Xa) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[RETURN] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC3410f70 enumC3410f70;
        EnumC3410f70 enumC3410f71;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3975a;
        C3355eb c3355eb = this.b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else if (i == 2) {
                AbstractC3375el.b0(obj);
                enumC3410f70 = c3355eb.y;
                if (enumC3410f70 != null) {
                    this.f3975a = 3;
                    obj = enumC3410f70.a(this);
                    if (obj == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                enumC3410f71 = EnumC3410f70.EmptyAudio;
                this.f3975a = 4;
                if (enumC3410f71.a(this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else if (i == 3) {
                AbstractC3375el.b0(obj);
                enumC3410f71 = EnumC3410f70.EmptyAudio;
                this.f3975a = 4;
                if (enumC3410f71.a(this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
        C2848Wa c2848Wa = new C2848Wa(c3355eb, null);
        this.f3975a = 1;
        if (WD.X(c2848Wa, executorC4433qn, this) == enumC4602sk) {
            return enumC4602sk;
        }
        EnumC3410f70 enumC3410f72 = c3355eb.x;
        if (enumC3410f72 != null) {
            this.f3975a = 2;
            obj = enumC3410f72.a(this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
            enumC3410f70 = c3355eb.y;
            if (enumC3410f70 != null) {
                this.f3975a = 3;
                obj = enumC3410f70.a(this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            enumC3410f70 = c3355eb.y;
            if (enumC3410f70 != null) {
                this.f3975a = 3;
                obj = enumC3410f70.a(this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        }
        enumC3410f71 = EnumC3410f70.EmptyAudio;
        this.f3975a = 4;
        if (enumC3410f71.a(this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
