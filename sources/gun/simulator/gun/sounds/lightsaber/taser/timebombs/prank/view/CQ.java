package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CQ implements InterfaceC3385er, InterfaceC4596sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2920a = new ArrayList();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void A(char c) {
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        ((AbstractC4623t) this).L(str, AbstractC4496rb.c(String.valueOf(c)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void B(D40 d40, int i, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        this.f2920a.add(I(d40, i));
        x(interfaceC4123nG, obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void C(D40 d40, int i, boolean z) {
        AbstractC2995aW.q(d40, "descriptor");
        ((AbstractC4623t) this).L(I(d40, i), new C5001xF(Boolean.valueOf(z), false));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void D(int i) {
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        ((AbstractC4623t) this).L(str, AbstractC4496rb.b(Integer.valueOf(i)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void E(AV av, int i, byte b) {
        AbstractC2995aW.q(av, "descriptor");
        ((AbstractC4623t) this).L(I(av, i), AbstractC4496rb.b(Byte.valueOf(b)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void F(String str) {
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String str2 = (String) J();
        AbstractC2995aW.q(str2, "tag");
        ((AbstractC4623t) this).L(str2, AbstractC4496rb.c(str));
    }

    public abstract void G(Object obj, double d);

    public abstract void H(Object obj, float f);

    public final String I(D40 d40, int i) {
        String strValueOf;
        AbstractC2995aW.q(d40, "<this>");
        switch (((KF) this).f) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                strValueOf = d40.e(i);
                break;
        }
        AbstractC2995aW.q(strValueOf, "nestedName");
        return strValueOf;
    }

    public final Object J() {
        ArrayList arrayList = this.f2920a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(AbstractC2340Cl.y(arrayList));
        }
        throw new P40("No tag in stack for requested element");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void b(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        if (!this.f2920a.isEmpty()) {
            J();
        }
        AbstractC4623t abstractC4623t = (AbstractC4623t) this;
        abstractC4623t.c.invoke(abstractC4623t.K());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void e(double d) {
        G(J(), d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void f(byte b) {
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        ((AbstractC4623t) this).L(str, AbstractC4496rb.b(Byte.valueOf(b)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void g(int i, int i2, D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        ((AbstractC4623t) this).L(I(d40, i), AbstractC4496rb.b(Integer.valueOf(i2)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void h(AV av, int i, char c) {
        AbstractC2995aW.q(av, "descriptor");
        ((AbstractC4623t) this).L(I(av, i), AbstractC4496rb.c(String.valueOf(c)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final InterfaceC3385er i(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC4623t abstractC4623t = (AbstractC4623t) this;
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        if (Q90.a(d40)) {
            return new C4535s(abstractC4623t, str);
        }
        abstractC4623t.f2920a.add(str);
        return abstractC4623t;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void k(D40 d40, int i, float f) {
        AbstractC2995aW.q(d40, "descriptor");
        H(I(d40, i), f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void l(D40 d40, int i, long j) {
        AbstractC2995aW.q(d40, "descriptor");
        ((AbstractC4623t) this).L(I(d40, i), AbstractC4496rb.b(Long.valueOf(j)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void m(D40 d40, int i) {
        AbstractC2995aW.q(d40, "enumDescriptor");
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        ((AbstractC4623t) this).L(str, AbstractC4496rb.c(d40.e(i)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void n(AV av, int i, short s) {
        AbstractC2995aW.q(av, "descriptor");
        ((AbstractC4623t) this).L(I(av, i), AbstractC4496rb.b(Short.valueOf(s)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void o(int i, String str, D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ((AbstractC4623t) this).L(I(d40, i), AbstractC4496rb.c(str));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final InterfaceC3385er q(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        String strI = I(av, i);
        D40 d40G = av.g(i);
        AbstractC4623t abstractC4623t = (AbstractC4623t) this;
        AbstractC2995aW.q(d40G, "inlineDescriptor");
        if (Q90.a(d40G)) {
            return new C4535s(abstractC4623t, strI);
        }
        abstractC4623t.f2920a.add(strI);
        return abstractC4623t;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void s(long j) {
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        ((AbstractC4623t) this).L(str, AbstractC4496rb.b(Long.valueOf(j)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public final void u(AV av, int i, double d) {
        AbstractC2995aW.q(av, "descriptor");
        G(I(av, i), d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void v(short s) {
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        ((AbstractC4623t) this).L(str, AbstractC4496rb.b(Short.valueOf(s)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void w(boolean z) {
        String str = (String) J();
        AbstractC2995aW.q(str, "tag");
        ((AbstractC4623t) this).L(str, new C5001xF(Boolean.valueOf(z), false));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public abstract void x(InterfaceC4123nG interfaceC4123nG, Object obj);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final void y(float f) {
        H(J(), f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public final InterfaceC4596sh z(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return ((AbstractC4623t) this).c(d40);
    }
}
