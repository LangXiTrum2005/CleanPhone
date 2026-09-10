package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4623t extends CQ implements InterfaceC4825vF {
    public final VE b;
    public final InterfaceC2766Sw c;
    public final C3067bF d;
    public String e;

    public AbstractC4623t(VE ve, InterfaceC2766Sw interfaceC2766Sw) {
        this.b = ve;
        this.c = interfaceC2766Sw;
        this.d = ve.f3865a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CQ
    public final void G(Object obj, double d) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        L(str, AbstractC4496rb.b(Double.valueOf(d)));
        if (this.d.k) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            Double dValueOf = Double.valueOf(d);
            String string = K().toString();
            AbstractC2995aW.q(string, "output");
            throw new C4034mF(AbstractC2871Wx.u0(dValueOf, str, string), 1);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CQ
    public final void H(Object obj, float f) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        L(str, AbstractC4496rb.b(Float.valueOf(f)));
        if (this.d.k) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            Float fValueOf = Float.valueOf(f);
            String string = K().toString();
            AbstractC2995aW.q(string, "output");
            throw new C4034mF(AbstractC2871Wx.u0(fValueOf, str, string), 1);
        }
    }

    public abstract AbstractC4122nF K();

    public abstract void L(String str, AbstractC4122nF abstractC4122nF);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final M40 a() {
        return this.b.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final InterfaceC4596sh c(D40 d40) {
        KF kf;
        AbstractC2995aW.q(d40, "descriptor");
        InterfaceC2766Sw c4140nX = AbstractC2853Wf.n0(this.f2920a) == null ? this.c : new C4140nX(this, 18);
        L40 kind = d40.getKind();
        boolean zI = AbstractC2995aW.i(kind, C3442fa0.b);
        VE ve = this.b;
        if (zI || (kind instanceof AbstractC3786jV)) {
            kf = new KF(ve, c4140nX, 2);
        } else if (AbstractC2995aW.i(kind, C3442fa0.c)) {
            D40 d40G = AbstractC4496rb.g(d40.g(0), ve.b);
            L40 kind2 = d40G.getKind();
            if ((kind2 instanceof DV) || AbstractC2995aW.i(kind2, K40.f3299a)) {
                AbstractC2995aW.q(c4140nX, "nodeConsumer");
                SF sf = new SF(ve, c4140nX, 1);
                sf.i = true;
                kf = sf;
            } else {
                if (!ve.f3865a.d) {
                    throw AbstractC2871Wx.H(d40G);
                }
                kf = new KF(ve, c4140nX, 2);
            }
        } else {
            kf = new KF(ve, c4140nX, 1);
        }
        String str = this.e;
        if (str != null) {
            kf.L(str, AbstractC4496rb.c(d40.h()));
            this.e = null;
        }
        return kf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4825vF
    public final VE d() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final boolean j(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return this.d.f4164a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4825vF
    public final void p(AbstractC4122nF abstractC4122nF) {
        AbstractC2995aW.q(abstractC4122nF, "element");
        x(C4561sF.f4969a, abstractC4122nF);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void t() {
        String str = (String) AbstractC2853Wf.n0(this.f2920a);
        if (str != null) {
            L(str, DF.f2962a);
        } else {
            this.c.invoke(DF.f2962a);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void x(InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        Object objN0 = AbstractC2853Wf.n0(this.f2920a);
        VE ve = this.b;
        if (objN0 == null) {
            D40 d40G = AbstractC4496rb.g(interfaceC4123nG.getDescriptor(), ve.b);
            if ((d40G.getKind() instanceof DV) || d40G.getKind() == K40.f3299a) {
                KF kf = new KF(ve, this.c, 0);
                kf.x(interfaceC4123nG, obj);
                AbstractC2995aW.q(interfaceC4123nG.getDescriptor(), "descriptor");
                kf.c.invoke(kf.K());
                return;
            }
        }
        if (!(interfaceC4123nG instanceof U) || ve.f3865a.i) {
            interfaceC4123nG.serialize(this, obj);
            return;
        }
        U u = (U) interfaceC4123nG;
        String strJ = AbstractC4496rb.j(interfaceC4123nG.getDescriptor(), ve);
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.Any");
        InterfaceC4123nG interfaceC4123nGR = WD.r(u, this, obj);
        AbstractC4496rb.i(interfaceC4123nGR.getDescriptor().getKind());
        this.e = strJ;
        interfaceC4123nGR.serialize(this, obj);
    }
}
