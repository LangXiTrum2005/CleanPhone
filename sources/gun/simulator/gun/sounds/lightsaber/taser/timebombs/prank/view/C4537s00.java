package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4537s00 {
    public static final C4449r00 Companion = new C4449r00(null);
    private final C2577Lo device;
    private final C2361Dg ext;
    private final int ordinalView;
    private final C4274p00 request;
    private final C2517Jg user;

    public /* synthetic */ C4537s00(int i, C2577Lo c2577Lo, C2517Jg c2517Jg, C2361Dg c2361Dg, C4274p00 c4274p00, int i2, O40 o40) {
        if (17 != (i & 17)) {
            AbstractC4496rb.B(i, 17, C4362q00.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = c2577Lo;
        if ((i & 2) == 0) {
            this.user = null;
        } else {
            this.user = c2517Jg;
        }
        if ((i & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = c2361Dg;
        }
        if ((i & 8) == 0) {
            this.request = null;
        } else {
            this.request = c4274p00;
        }
        this.ordinalView = i2;
    }

    public static /* synthetic */ C4537s00 copy$default(C4537s00 c4537s00, C2577Lo c2577Lo, C2517Jg c2517Jg, C2361Dg c2361Dg, C4274p00 c4274p00, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c2577Lo = c4537s00.device;
        }
        if ((i2 & 2) != 0) {
            c2517Jg = c4537s00.user;
        }
        C2517Jg c2517Jg2 = c2517Jg;
        if ((i2 & 4) != 0) {
            c2361Dg = c4537s00.ext;
        }
        C2361Dg c2361Dg2 = c2361Dg;
        if ((i2 & 8) != 0) {
            c4274p00 = c4537s00.request;
        }
        C4274p00 c4274p01 = c4274p00;
        if ((i2 & 16) != 0) {
            i = c4537s00.ordinalView;
        }
        return c4537s00.copy(c2577Lo, c2517Jg2, c2361Dg2, c4274p01, i);
    }

    public static final void write$Self(C4537s00 c4537s00, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4537s00, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.B(d40, 0, C2447Go.INSTANCE, c4537s00.device);
        if (interfaceC4596sh.j(d40) || c4537s00.user != null) {
            interfaceC4596sh.r(d40, 1, C2465Hg.INSTANCE, c4537s00.user);
        }
        if (interfaceC4596sh.j(d40) || c4537s00.ext != null) {
            interfaceC4596sh.r(d40, 2, C2309Bg.INSTANCE, c4537s00.ext);
        }
        if (interfaceC4596sh.j(d40) || c4537s00.request != null) {
            interfaceC4596sh.r(d40, 3, C4098n00.INSTANCE, c4537s00.request);
        }
        interfaceC4596sh.g(4, c4537s00.ordinalView, d40);
    }

    public final C2577Lo component1() {
        return this.device;
    }

    public final C2517Jg component2() {
        return this.user;
    }

    public final C2361Dg component3() {
        return this.ext;
    }

    public final C4274p00 component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    public final C4537s00 copy(C2577Lo c2577Lo, C2517Jg c2517Jg, C2361Dg c2361Dg, C4274p00 c4274p00, int i) {
        AbstractC2995aW.q(c2577Lo, "device");
        return new C4537s00(c2577Lo, c2517Jg, c2361Dg, c4274p00, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4537s00)) {
            return false;
        }
        C4537s00 c4537s00 = (C4537s00) obj;
        return AbstractC2995aW.i(this.device, c4537s00.device) && AbstractC2995aW.i(this.user, c4537s00.user) && AbstractC2995aW.i(this.ext, c4537s00.ext) && AbstractC2995aW.i(this.request, c4537s00.request) && this.ordinalView == c4537s00.ordinalView;
    }

    public final C2577Lo getDevice() {
        return this.device;
    }

    public final C2361Dg getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final C4274p00 getRequest() {
        return this.request;
    }

    public final C2517Jg getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        C2517Jg c2517Jg = this.user;
        int iHashCode2 = (iHashCode + (c2517Jg == null ? 0 : c2517Jg.hashCode())) * 31;
        C2361Dg c2361Dg = this.ext;
        int iHashCode3 = (iHashCode2 + (c2361Dg == null ? 0 : c2361Dg.hashCode())) * 31;
        C4274p00 c4274p00 = this.request;
        return ((iHashCode3 + (c4274p00 != null ? c4274p00.hashCode() : 0)) * 31) + this.ordinalView;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RtbToken(device=");
        sb.append(this.device);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", ext=");
        sb.append(this.ext);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", ordinalView=");
        return DM.k(sb, this.ordinalView, ')');
    }

    public C4537s00(C2577Lo c2577Lo, C2517Jg c2517Jg, C2361Dg c2361Dg, C4274p00 c4274p00, int i) {
        AbstractC2995aW.q(c2577Lo, "device");
        this.device = c2577Lo;
        this.user = c2517Jg;
        this.ext = c2361Dg;
        this.request = c4274p00;
        this.ordinalView = i;
    }

    public /* synthetic */ C4537s00(C2577Lo c2577Lo, C2517Jg c2517Jg, C2361Dg c2361Dg, C4274p00 c4274p00, int i, int i2, AbstractC2471Hm abstractC2471Hm) {
        this(c2577Lo, (i2 & 2) != 0 ? null : c2517Jg, (i2 & 4) != 0 ? null : c2361Dg, (i2 & 8) != 0 ? null : c4274p00, i);
    }

    public static /* synthetic */ void getOrdinalView$annotations() {
    }
}
