package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class P90 extends AbstractC2871Wx implements InterfaceC4825vF {
    public final C4157nh l;
    public final VE m;
    public final int n;
    public final InterfaceC4825vF[] o;
    public final M40 p;
    public final C3067bF q;
    public boolean r;
    public String s;

    public P90(C4157nh c4157nh, VE ve, int i, InterfaceC4825vF[] interfaceC4825vFArr) {
        AbstractC2995aW.q(c4157nh, "composer");
        AbstractC2995aW.q(ve, "json");
        AbstractC3950lJ.x(i, "mode");
        this.l = c4157nh;
        this.m = ve;
        this.n = i;
        this.o = interfaceC4825vFArr;
        this.p = ve.b;
        this.q = ve.f3865a;
        int iD = DM.D(i);
        if (interfaceC4825vFArr != null) {
            InterfaceC4825vF interfaceC4825vF = interfaceC4825vFArr[iD];
            if (interfaceC4825vF == null && interfaceC4825vF == this) {
                return;
            }
            interfaceC4825vFArr[iD] = this;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void A(char c) {
        F(String.valueOf(c));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void D(int i) {
        if (this.r) {
            F(String.valueOf(i));
        } else {
            this.l.e(i);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void F(String str) {
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.l.i(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx
    public final void Y(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        int iD = DM.D(this.n);
        boolean z = true;
        C4157nh c4157nh = this.l;
        if (iD == 1) {
            if (!c4157nh.b) {
                c4157nh.d(',');
            }
            c4157nh.b();
            return;
        }
        if (iD == 2) {
            if (c4157nh.b) {
                this.r = true;
                c4157nh.b();
                return;
            }
            if (i % 2 == 0) {
                c4157nh.d(',');
                c4157nh.b();
            } else {
                c4157nh.d(':');
                c4157nh.j();
                z = false;
            }
            this.r = z;
            return;
        }
        if (iD != 3) {
            if (!c4157nh.b) {
                c4157nh.d(',');
            }
            c4157nh.b();
            F(d40.e(i));
            c4157nh.d(':');
            c4157nh.j();
            return;
        }
        if (i == 0) {
            this.r = true;
        }
        if (i == 1) {
            c4157nh.d(',');
            c4157nh.j();
            this.r = false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final M40 a() {
        return this.p;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void b(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        int i = this.n;
        AbstractC3888ke0.b(i);
        C4157nh c4157nh = this.l;
        c4157nh.k();
        c4157nh.b();
        c4157nh.d(AbstractC3888ke0.b(i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final InterfaceC4596sh c(D40 d40) {
        InterfaceC4825vF interfaceC4825vF;
        AbstractC2995aW.q(d40, "descriptor");
        VE ve = this.m;
        int iA = AbstractC4496rb.A(d40, ve);
        char cA = AbstractC3888ke0.a(iA);
        C4157nh c4157nh = this.l;
        c4157nh.d(cA);
        c4157nh.a();
        if (this.s != null) {
            c4157nh.b();
            String str = this.s;
            AbstractC2995aW.n(str);
            F(str);
            c4157nh.d(':');
            c4157nh.j();
            F(d40.h());
            this.s = null;
        }
        if (this.n == iA) {
            return this;
        }
        InterfaceC4825vF[] interfaceC4825vFArr = this.o;
        return (interfaceC4825vFArr == null || (interfaceC4825vF = interfaceC4825vFArr[DM.D(iA)]) == null) ? new P90(c4157nh, ve, iA, interfaceC4825vFArr) : interfaceC4825vF;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4825vF
    public final VE d() {
        return this.m;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void e(double d) {
        boolean z = this.r;
        C4157nh c4157nh = this.l;
        if (z) {
            F(String.valueOf(d));
        } else {
            c4157nh.f4754a.c(String.valueOf(d));
        }
        if (this.q.k) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw AbstractC2871Wx.G(Double.valueOf(d), c4157nh.f4754a.toString());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void f(byte b) {
        if (this.r) {
            F(String.valueOf((int) b));
        } else {
            this.l.c(b);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final InterfaceC3385er i(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        if (!Q90.a(d40)) {
            return this;
        }
        C4157nh c4245oh = this.l;
        if (!(c4245oh instanceof C4245oh)) {
            c4245oh = new C4245oh(c4245oh.f4754a, this.r);
        }
        return new P90(c4245oh, this.m, this.n, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final boolean j(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return this.q.f4164a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void m(D40 d40, int i) {
        AbstractC2995aW.q(d40, "enumDescriptor");
        F(d40.e(i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4825vF
    public final void p(AbstractC4122nF abstractC4122nF) {
        AbstractC2995aW.q(abstractC4122nF, "element");
        x(C4561sF.f4969a, abstractC4122nF);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void r(D40 d40, int i, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        if (obj != null || this.q.f) {
            super.r(d40, i, interfaceC4123nG, obj);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void s(long j) {
        if (this.r) {
            F(String.valueOf(j));
        } else {
            this.l.f(j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void t() {
        this.l.g("null");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void v(short s) {
        if (this.r) {
            F(String.valueOf((int) s));
        } else {
            this.l.h(s);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void w(boolean z) {
        if (this.r) {
            F(String.valueOf(z));
        } else {
            this.l.f4754a.c(String.valueOf(z));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void x(InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        if (interfaceC4123nG instanceof U) {
            VE ve = this.m;
            if (!ve.f3865a.i) {
                U u = (U) interfaceC4123nG;
                String strJ = AbstractC4496rb.j(interfaceC4123nG.getDescriptor(), ve);
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.Any");
                InterfaceC4123nG interfaceC4123nGR = WD.r(u, this, obj);
                AbstractC4496rb.i(interfaceC4123nGR.getDescriptor().getKind());
                this.s = strJ;
                interfaceC4123nGR.serialize(this, obj);
                return;
            }
        }
        interfaceC4123nG.serialize(this, obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void y(float f) {
        boolean z = this.r;
        C4157nh c4157nh = this.l;
        if (z) {
            F(String.valueOf(f));
        } else {
            c4157nh.f4754a.c(String.valueOf(f));
        }
        if (this.q.k) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw AbstractC2871Wx.G(Float.valueOf(f), c4157nh.f4754a.toString());
        }
    }
}
