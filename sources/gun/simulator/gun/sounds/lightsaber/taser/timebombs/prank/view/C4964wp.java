package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4964wp implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5199a = 1;
    public final Object b;
    public final Object c;
    public final Object d;

    public C4964wp(C5052xp c5052xp, C3086bY c3086bY, InterfaceC4530rv interfaceC4530rv) {
        this.b = c5052xp;
        this.c = c3086bY;
        this.d = interfaceC4530rv;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4876vp c4876vp;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5199a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                if (interfaceC2857Wj instanceof C4876vp) {
                    c4876vp = (C4876vp) interfaceC2857Wj;
                    int i2 = c4876vp.c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c4876vp.c = i2 - Integer.MIN_VALUE;
                    } else {
                        c4876vp = new C4876vp(this, interfaceC2857Wj);
                    }
                } else {
                    c4876vp = new C4876vp(this, interfaceC2857Wj);
                }
                Object obj5 = c4876vp.f5156a;
                int i3 = c4876vp.c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj5);
                    return c5033xf0;
                }
                AbstractC3375el.b0(obj5);
                C5052xp c5052xp = (C5052xp) obj4;
                Object objInvoke = c5052xp.b.invoke(obj);
                C3086bY c3086bY = (C3086bY) obj2;
                Object obj6 = c3086bY.f4172a;
                if (obj6 != YR.f4019a && ((Boolean) c5052xp.c.invoke(obj6, objInvoke)).booleanValue()) {
                    return c5033xf0;
                }
                c3086bY.f4172a = objInvoke;
                c4876vp.c = 1;
                return ((InterfaceC4530rv) obj3).emit(obj, c4876vp) == enumC4602sk ? enumC4602sk : c5033xf0;
            default:
                Object objG0 = AbstractC3375el.g0((InterfaceC3549gk) obj4, obj, obj2, (InterfaceC3567gx) obj3, interfaceC2857Wj);
                return objG0 == enumC4602sk ? objG0 : c5033xf0;
        }
    }

    public C4964wp(InterfaceC4530rv interfaceC4530rv, InterfaceC3549gk interfaceC3549gk) {
        this.b = interfaceC3549gk;
        this.c = AbstractC3181cc0.b(interfaceC3549gk);
        this.d = new C4769uf0(interfaceC4530rv, null);
    }
}
