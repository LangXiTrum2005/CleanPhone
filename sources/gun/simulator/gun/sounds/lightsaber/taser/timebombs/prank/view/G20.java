package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class G20 extends AbstractC2883Xj implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4530rv f3100a;
    public final InterfaceC3549gk b;
    public final int c;
    public InterfaceC3549gk d;
    public InterfaceC2857Wj e;

    public G20(InterfaceC4530rv interfaceC4530rv, InterfaceC3549gk interfaceC3549gk) {
        super(IR.f3217a, C2734Rq.f3684a);
        this.f3100a = interfaceC4530rv;
        this.b = interfaceC3549gk;
        this.c = ((Number) interfaceC3549gk.fold(0, F20.f)).intValue();
    }

    public final Object c(InterfaceC2857Wj interfaceC2857Wj, Object obj) {
        InterfaceC3549gk context = interfaceC2857Wj.getContext();
        AbstractC2995aW.w(context);
        InterfaceC3549gk interfaceC3549gk = this.d;
        if (interfaceC3549gk != context) {
            if (interfaceC3549gk instanceof C2655Op) {
                throw new IllegalStateException(AbstractC3375el.d0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C2655Op) interfaceC3549gk).f3525a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new J20(this))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = interfaceC2857Wj;
        InterfaceC3655hx interfaceC3655hx = I20.f3199a;
        InterfaceC4530rv interfaceC4530rv = this.f3100a;
        AbstractC2995aW.o(interfaceC4530rv, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = interfaceC3655hx.invoke(interfaceC4530rv, obj, this);
        if (!AbstractC2995aW.i(objInvoke, EnumC4602sk.f4993a)) {
            this.e = null;
        }
        return objInvoke;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        try {
            Object objC = c(interfaceC2857Wj, obj);
            return objC == EnumC4602sk.f4993a ? objC : C5033xf0.f5238a;
        } catch (Throwable th) {
            this.d = new C2655Op(interfaceC2857Wj.getContext(), th);
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4690tk
    public final InterfaceC4690tk getCallerFrame() {
        InterfaceC2857Wj interfaceC2857Wj = this.e;
        if (interfaceC2857Wj instanceof InterfaceC4690tk) {
            return (InterfaceC4690tk) interfaceC2857Wj;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        InterfaceC3549gk interfaceC3549gk = this.d;
        return interfaceC3549gk == null ? C2734Rq.f3684a : interfaceC3549gk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Throwable thA = IZ.a(obj);
        if (thA != null) {
            this.d = new C2655Op(getContext(), thA);
        }
        InterfaceC2857Wj interfaceC2857Wj = this.e;
        if (interfaceC2857Wj != null) {
            interfaceC2857Wj.resumeWith(obj);
        }
        return EnumC4602sk.f4993a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
