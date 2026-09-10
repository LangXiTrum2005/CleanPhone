package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3302dw extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4297a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC4443qv c;
    public final /* synthetic */ InterfaceC4221oQ d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3302dw(InterfaceC4443qv interfaceC4443qv, InterfaceC4221oQ interfaceC4221oQ, Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = interfaceC4443qv;
        this.d = interfaceC4221oQ;
        this.e = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3302dw c3302dw = new C3302dw(this.c, this.d, this.e, interfaceC2857Wj);
        c3302dw.b = obj;
        return c3302dw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3302dw) create((EnumC4901w60) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4297a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            int iOrdinal = ((EnumC4901w60) this.b).ordinal();
            InterfaceC4221oQ interfaceC4221oQ = this.d;
            if (iOrdinal == 0) {
                this.f4297a = 1;
                if (this.c.collect(interfaceC4221oQ, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else if (iOrdinal == 2) {
                SE se = AbstractC4637t60.f5016a;
                Object obj2 = this.e;
                if (obj2 == se) {
                    interfaceC4221oQ.b();
                } else {
                    interfaceC4221oQ.a(obj2);
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
