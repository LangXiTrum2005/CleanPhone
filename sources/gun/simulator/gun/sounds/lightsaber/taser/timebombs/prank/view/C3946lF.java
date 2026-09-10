package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3946lF extends AbstractC2845Vx {
    public final T90 e;
    public final M40 f;

    public C3946lF(T90 t90, VE ve) {
        AbstractC2995aW.q(t90, "lexer");
        AbstractC2995aW.q(ve, "json");
        this.e = t90;
        this.f = ve.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final byte E() {
        Le0 le0;
        T90 t90 = this.e;
        String strL = t90.l();
        try {
            AbstractC2995aW.q(strL, "<this>");
            Re0 re0B0 = AbstractC2995aW.B0(strL);
            if (re0B0 != null) {
                int i = re0B0.f3667a;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0) {
                    le0 = null;
                } else {
                    le0 = new Le0((byte) i);
                }
            } else {
                le0 = null;
            }
            if (le0 != null) {
                return le0.f3365a;
            }
            Z90.h0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            T90.p(t90, AbstractC3950lJ.r("Failed to parse type 'UByte' for input '", strL, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final M40 a() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final int h() {
        T90 t90 = this.e;
        String strL = t90.l();
        try {
            AbstractC2995aW.q(strL, "<this>");
            Re0 re0B0 = AbstractC2995aW.B0(strL);
            if (re0B0 != null) {
                return re0B0.f3667a;
            }
            Z90.h0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            T90.p(t90, AbstractC3950lJ.r("Failed to parse type 'UInt' for input '", strL, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final long i() {
        T90 t90 = this.e;
        String strL = t90.l();
        try {
            AbstractC2995aW.q(strL, "<this>");
            We0 we0C0 = AbstractC2995aW.C0(strL);
            if (we0C0 != null) {
                return we0C0.f3931a;
            }
            Z90.h0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            T90.p(t90, AbstractC3950lJ.r("Failed to parse type 'ULong' for input '", strL, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final int k(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final short o() {
        C3099bf0 c3099bf0;
        T90 t90 = this.e;
        String strL = t90.l();
        try {
            AbstractC2995aW.q(strL, "<this>");
            Re0 re0B0 = AbstractC2995aW.B0(strL);
            if (re0B0 != null) {
                int i = re0B0.f3667a;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0) {
                    c3099bf0 = null;
                } else {
                    c3099bf0 = new C3099bf0((short) i);
                }
            } else {
                c3099bf0 = null;
            }
            if (c3099bf0 != null) {
                return c3099bf0.f4180a;
            }
            Z90.h0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            T90.p(t90, AbstractC3950lJ.r("Failed to parse type 'UShort' for input '", strL, '\''), 0, null, 6);
            throw null;
        }
    }
}
