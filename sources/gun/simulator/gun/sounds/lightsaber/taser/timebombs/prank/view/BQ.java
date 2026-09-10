package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BQ implements InterfaceC2548Kl, InterfaceC4421qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2871a = new ArrayList();
    public boolean b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final boolean A(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return F(O(d40, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final int B(D40 d40) {
        AbstractC2995aW.q(d40, "enumDescriptor");
        r rVar = (r) this;
        String str = (String) P();
        AbstractC2995aW.q(str, "tag");
        return BF.m(d40, rVar.c, rVar.T(str).a(), "");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public abstract boolean C();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final int D(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        String strO = O(d40, i);
        r rVar = (r) this;
        try {
            return Integer.parseInt(rVar.T(strO).a());
        } catch (IllegalArgumentException unused) {
            rVar.V("int");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final byte E() {
        return G(P());
    }

    public abstract boolean F(Object obj);

    public abstract byte G(Object obj);

    public abstract char H(Object obj);

    public abstract double I(Object obj);

    public abstract float J(Object obj);

    public abstract InterfaceC2548Kl K(Object obj, D40 d40);

    public abstract short L(Object obj);

    public abstract String M(Object obj);

    public String N(D40 d40, int i) {
        AbstractC2995aW.q(d40, CampaignEx.JSON_KEY_DESC);
        return d40.e(i);
    }

    public final String O(D40 d40, int i) {
        AbstractC2995aW.q(d40, "<this>");
        String strN = N(d40, i);
        AbstractC2995aW.q(strN, "nestedName");
        return strN;
    }

    public final Object P() {
        ArrayList arrayList = this.f2871a;
        Object objRemove = arrayList.remove(AbstractC2340Cl.y(arrayList));
        this.b = true;
        return objRemove;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final short e(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return L(O(av, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final InterfaceC2548Kl f(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return K(P(), d40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final int h() {
        r rVar = (r) this;
        String str = (String) P();
        AbstractC2995aW.q(str, "tag");
        try {
            return Integer.parseInt(rVar.T(str).a());
        } catch (IllegalArgumentException unused) {
            rVar.V("int");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final long i() {
        r rVar = (r) this;
        String str = (String) P();
        AbstractC2995aW.q(str, "tag");
        try {
            return Long.parseLong(rVar.T(str).a());
        } catch (IllegalArgumentException unused) {
            rVar.V("long");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final String l(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return M(O(d40, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final float m(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return J(O(d40, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final double n(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return I(O(av, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final short o() {
        return L(P());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final float p() {
        return J(P());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final double q() {
        return I(P());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final boolean r() {
        return F(P());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final Object s(D40 d40, int i, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC4123nG, "deserializer");
        String strO = O(d40, i);
        Va0 va0 = new Va0(this, interfaceC4123nG, obj, 0);
        this.f2871a.add(strO);
        Object objInvoke = va0.invoke();
        if (!this.b) {
            P();
        }
        this.b = false;
        return objInvoke;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final char t(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return H(O(av, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final char u() {
        return H(P());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final InterfaceC2548Kl v(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return K(O(av, i), av.g(i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final long w(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        String strO = O(d40, i);
        r rVar = (r) this;
        try {
            return Long.parseLong(rVar.T(strO).a());
        } catch (IllegalArgumentException unused) {
            rVar.V("long");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final byte x(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return G(O(av, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final String y() {
        return M(P());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final Object z(D40 d40, int i, InterfaceC2369Do interfaceC2369Do, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC2369Do, "deserializer");
        String strO = O(d40, i);
        Va0 va0 = new Va0(this, interfaceC2369Do, obj, 1);
        this.f2871a.add(strO);
        Object objInvoke = va0.invoke();
        if (!this.b) {
            P();
        }
        this.b = false;
        return objInvoke;
    }
}
