package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2791Tv extends Ea0 implements InterfaceC3655hx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3800a;
    public int b;
    public /* synthetic */ InterfaceC4530rv c;
    public /* synthetic */ Object d;
    public final /* synthetic */ InterfaceC3215cx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2791Tv(InterfaceC3215cx interfaceC3215cx, InterfaceC2857Wj interfaceC2857Wj, int i) {
        super(3, interfaceC2857Wj);
        this.f3800a = i;
        this.e = interfaceC3215cx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        int i = this.f3800a;
        InterfaceC3215cx interfaceC3215cx = this.e;
        switch (i) {
            case 0:
                C2791Tv c2791Tv = new C2791Tv((InterfaceC3567gx) interfaceC3215cx, (InterfaceC2857Wj) obj3, 0);
                c2791Tv.c = (InterfaceC4530rv) obj;
                c2791Tv.d = obj2;
                return c2791Tv.invokeSuspend(c5033xf0);
            default:
                C2791Tv c2791Tv2 = new C2791Tv((InterfaceC3655hx) interfaceC3215cx, (InterfaceC2857Wj) obj3, 1);
                c2791Tv2.c = (InterfaceC4530rv) obj;
                c2791Tv2.d = (Object[]) obj2;
                return c2791Tv2.invokeSuspend(c5033xf0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        InterfaceC4530rv interfaceC4530rv;
        InterfaceC4530rv interfaceC4530rv2;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3800a;
        InterfaceC3215cx interfaceC3215cx = this.e;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    AbstractC3375el.b0(obj);
                    interfaceC4530rv = this.c;
                    Object obj2 = this.d;
                    this.c = interfaceC4530rv;
                    this.b = 1;
                    obj = ((InterfaceC3567gx) interfaceC3215cx).invoke(obj2, this);
                    if (obj != enumC4602sk) {
                    }
                    return enumC4602sk;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                    return c5033xf0;
                }
                interfaceC4530rv = this.c;
                AbstractC3375el.b0(obj);
                this.c = null;
                this.b = 2;
                if (interfaceC4530rv.emit(obj, this) != enumC4602sk) {
                    return c5033xf0;
                }
                return enumC4602sk;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    AbstractC3375el.b0(obj);
                    interfaceC4530rv2 = this.c;
                    Object[] objArr = (Object[]) this.d;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.c = interfaceC4530rv2;
                    this.b = 1;
                    obj = ((InterfaceC3655hx) interfaceC3215cx).invoke(obj3, obj4, this);
                    if (obj != enumC4602sk) {
                    }
                    return enumC4602sk;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                    return c5033xf0;
                }
                interfaceC4530rv2 = this.c;
                AbstractC3375el.b0(obj);
                this.c = null;
                this.b = 2;
                if (interfaceC4530rv2.emit(obj, this) != enumC4602sk) {
                    return c5033xf0;
                }
                return enumC4602sk;
        }
    }
}
