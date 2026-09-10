package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class TD extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3762a;
    public final /* synthetic */ InterfaceC3567gx b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TD(InterfaceC2857Wj interfaceC2857Wj, InterfaceC3549gk interfaceC3549gk, InterfaceC3567gx interfaceC3567gx, Object obj) {
        super(interfaceC2857Wj, interfaceC3549gk);
        this.b = interfaceC3567gx;
        this.c = obj;
        AbstractC2995aW.o(interfaceC2857Wj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        int i = this.f3762a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f3762a = 2;
            AbstractC3375el.b0(obj);
            return obj;
        }
        this.f3762a = 1;
        AbstractC3375el.b0(obj);
        InterfaceC3567gx interfaceC3567gx = this.b;
        AbstractC2995aW.o(interfaceC3567gx, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        WD.h(2, interfaceC3567gx);
        return interfaceC3567gx.invoke(this.c, this);
    }
}
