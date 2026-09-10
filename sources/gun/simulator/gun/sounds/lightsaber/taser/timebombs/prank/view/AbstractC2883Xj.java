package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2883Xj extends AbstractC3677i9 {
    private final InterfaceC3549gk _context;
    private transient InterfaceC2857Wj intercepted;

    public AbstractC2883Xj(InterfaceC2857Wj interfaceC2857Wj) {
        this(interfaceC2857Wj, interfaceC2857Wj != null ? interfaceC2857Wj.getContext() : null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public InterfaceC3549gk getContext() {
        InterfaceC3549gk interfaceC3549gk = this._context;
        AbstractC2995aW.n(interfaceC3549gk);
        return interfaceC3549gk;
    }

    public final InterfaceC2857Wj intercepted() {
        InterfaceC2857Wj interfaceC2857WjInterceptContinuation = this.intercepted;
        if (interfaceC2857WjInterceptContinuation == null) {
            InterfaceC2909Yj interfaceC2909Yj = (InterfaceC2909Yj) getContext().get(G7.d);
            if (interfaceC2909Yj == null || (interfaceC2857WjInterceptContinuation = interfaceC2909Yj.interceptContinuation(this)) == null) {
                interfaceC2857WjInterceptContinuation = this;
            }
            this.intercepted = interfaceC2857WjInterceptContinuation;
        }
        return interfaceC2857WjInterceptContinuation;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public void releaseIntercepted() {
        InterfaceC2857Wj interfaceC2857Wj = this.intercepted;
        if (interfaceC2857Wj != null && interfaceC2857Wj != this) {
            InterfaceC3373ek interfaceC3373ek = getContext().get(G7.d);
            AbstractC2995aW.n(interfaceC3373ek);
            ((InterfaceC2909Yj) interfaceC3373ek).releaseInterceptedContinuation(interfaceC2857Wj);
        }
        this.intercepted = C2932Zg.f4085a;
    }

    public AbstractC2883Xj(InterfaceC2857Wj interfaceC2857Wj, InterfaceC3549gk interfaceC3549gk) {
        super(interfaceC2857Wj);
        this._context = interfaceC3549gk;
    }
}
