package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2543Kg {
    public static final C4770ug Companion = new C4770ug(null);
    private final G5 app;
    private final C2577Lo device;
    private C2361Dg ext;
    private C2439Gg request;
    private final C2517Jg user;

    public /* synthetic */ C2543Kg(int i, C2577Lo c2577Lo, G5 g5, C2517Jg c2517Jg, C2361Dg c2361Dg, C2439Gg c2439Gg, O40 o40) {
        if (1 != (i & 1)) {
            AbstractC4496rb.B(i, 1, C3891kg.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = c2577Lo;
        if ((i & 2) == 0) {
            this.app = null;
        } else {
            this.app = g5;
        }
        if ((i & 4) == 0) {
            this.user = null;
        } else {
            this.user = c2517Jg;
        }
        if ((i & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = c2361Dg;
        }
        if ((i & 16) == 0) {
            this.request = null;
        } else {
            this.request = c2439Gg;
        }
    }

    public static /* synthetic */ C2543Kg copy$default(C2543Kg c2543Kg, C2577Lo c2577Lo, G5 g5, C2517Jg c2517Jg, C2361Dg c2361Dg, C2439Gg c2439Gg, int i, Object obj) {
        if ((i & 1) != 0) {
            c2577Lo = c2543Kg.device;
        }
        if ((i & 2) != 0) {
            g5 = c2543Kg.app;
        }
        G5 g6 = g5;
        if ((i & 4) != 0) {
            c2517Jg = c2543Kg.user;
        }
        C2517Jg c2517Jg2 = c2517Jg;
        if ((i & 8) != 0) {
            c2361Dg = c2543Kg.ext;
        }
        C2361Dg c2361Dg2 = c2361Dg;
        if ((i & 16) != 0) {
            c2439Gg = c2543Kg.request;
        }
        return c2543Kg.copy(c2577Lo, g6, c2517Jg2, c2361Dg2, c2439Gg);
    }

    public static final void write$Self(C2543Kg c2543Kg, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2543Kg, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.B(d40, 0, C2447Go.INSTANCE, c2543Kg.device);
        if (interfaceC4596sh.j(d40) || c2543Kg.app != null) {
            interfaceC4596sh.r(d40, 1, E5.INSTANCE, c2543Kg.app);
        }
        if (interfaceC4596sh.j(d40) || c2543Kg.user != null) {
            interfaceC4596sh.r(d40, 2, C2465Hg.INSTANCE, c2543Kg.user);
        }
        if (interfaceC4596sh.j(d40) || c2543Kg.ext != null) {
            interfaceC4596sh.r(d40, 3, C2309Bg.INSTANCE, c2543Kg.ext);
        }
        if (!interfaceC4596sh.j(d40) && c2543Kg.request == null) {
            return;
        }
        interfaceC4596sh.r(d40, 4, C2387Eg.INSTANCE, c2543Kg.request);
    }

    public final C2577Lo component1() {
        return this.device;
    }

    public final G5 component2() {
        return this.app;
    }

    public final C2517Jg component3() {
        return this.user;
    }

    public final C2361Dg component4() {
        return this.ext;
    }

    public final C2439Gg component5() {
        return this.request;
    }

    public final C2543Kg copy(C2577Lo c2577Lo, G5 g5, C2517Jg c2517Jg, C2361Dg c2361Dg, C2439Gg c2439Gg) {
        AbstractC2995aW.q(c2577Lo, "device");
        return new C2543Kg(c2577Lo, g5, c2517Jg, c2361Dg, c2439Gg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2543Kg)) {
            return false;
        }
        C2543Kg c2543Kg = (C2543Kg) obj;
        return AbstractC2995aW.i(this.device, c2543Kg.device) && AbstractC2995aW.i(this.app, c2543Kg.app) && AbstractC2995aW.i(this.user, c2543Kg.user) && AbstractC2995aW.i(this.ext, c2543Kg.ext) && AbstractC2995aW.i(this.request, c2543Kg.request);
    }

    public final G5 getApp() {
        return this.app;
    }

    public final C2577Lo getDevice() {
        return this.device;
    }

    public final C2361Dg getExt() {
        return this.ext;
    }

    public final C2439Gg getRequest() {
        return this.request;
    }

    public final C2517Jg getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        G5 g5 = this.app;
        int iHashCode2 = (iHashCode + (g5 == null ? 0 : g5.hashCode())) * 31;
        C2517Jg c2517Jg = this.user;
        int iHashCode3 = (iHashCode2 + (c2517Jg == null ? 0 : c2517Jg.hashCode())) * 31;
        C2361Dg c2361Dg = this.ext;
        int iHashCode4 = (iHashCode3 + (c2361Dg == null ? 0 : c2361Dg.hashCode())) * 31;
        C2439Gg c2439Gg = this.request;
        return iHashCode4 + (c2439Gg != null ? c2439Gg.hashCode() : 0);
    }

    public final void setExt(C2361Dg c2361Dg) {
        this.ext = c2361Dg;
    }

    public final void setRequest(C2439Gg c2439Gg) {
        this.request = c2439Gg;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    public C2543Kg(C2577Lo c2577Lo, G5 g5, C2517Jg c2517Jg, C2361Dg c2361Dg, C2439Gg c2439Gg) {
        AbstractC2995aW.q(c2577Lo, "device");
        this.device = c2577Lo;
        this.app = g5;
        this.user = c2517Jg;
        this.ext = c2361Dg;
        this.request = c2439Gg;
    }

    public /* synthetic */ C2543Kg(C2577Lo c2577Lo, G5 g5, C2517Jg c2517Jg, C2361Dg c2361Dg, C2439Gg c2439Gg, int i, AbstractC2471Hm abstractC2471Hm) {
        this(c2577Lo, (i & 2) != 0 ? null : g5, (i & 4) != 0 ? null : c2517Jg, (i & 8) != 0 ? null : c2361Dg, (i & 16) != 0 ? null : c2439Gg);
    }
}
