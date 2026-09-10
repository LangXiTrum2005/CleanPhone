package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4857vf0 extends C4016m30 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4857vf0(InterfaceC2857Wj interfaceC2857Wj, InterfaceC3549gk interfaceC3549gk) {
        C4945wf0 c4945wf0 = C4945wf0.f5191a;
        super(interfaceC2857Wj, interfaceC3549gk.get(c4945wf0) == null ? interfaceC3549gk.plus(c4945wf0) : interfaceC3549gk);
        this.e = new ThreadLocal();
        if (interfaceC2857Wj.getContext().get(G7.d) instanceof AbstractC3899kk) {
            return;
        }
        Object objC = AbstractC3181cc0.c(interfaceC3549gk, null);
        AbstractC3181cc0.a(interfaceC3549gk, objC);
        h0(interfaceC3549gk, objC);
    }

    public final boolean g0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void h0(InterfaceC3549gk interfaceC3549gk, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new C4839vT(interfaceC3549gk, obj));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4016m30, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void y(Object obj) {
        if (this.threadLocalIsSet) {
            C4839vT c4839vT = (C4839vT) this.e.get();
            if (c4839vT != null) {
                AbstractC3181cc0.a((InterfaceC3549gk) c4839vT.f5132a, c4839vT.b);
            }
            this.e.remove();
        }
        Object objJ0 = AbstractC2995aW.j0(obj);
        InterfaceC2857Wj interfaceC2857Wj = this.d;
        InterfaceC3549gk context = interfaceC2857Wj.getContext();
        Object objC = AbstractC3181cc0.c(context, null);
        C4857vf0 c4857vf0W = objC != AbstractC3181cc0.f4230a ? WD.W(interfaceC2857Wj, context, objC) : null;
        try {
            this.d.resumeWith(objJ0);
        } finally {
            if (c4857vf0W == null || c4857vf0W.g0()) {
                AbstractC3181cc0.a(context, objC);
            }
        }
    }
}
