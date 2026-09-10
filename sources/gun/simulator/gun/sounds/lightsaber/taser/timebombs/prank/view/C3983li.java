package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3983li {
    public static final C3895ki Companion = new C3895ki(null);
    private final Long afterClickDuration;
    private final Boolean allowAutoRedirect;

    public C3983li() {
        this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C3983li copy$default(C3983li c3983li, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c3983li.allowAutoRedirect;
        }
        if ((i & 2) != 0) {
            l = c3983li.afterClickDuration;
        }
        return c3983li.copy(bool, l);
    }

    public static final void write$Self(C3983li c3983li, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        Long l;
        AbstractC2995aW.q(c3983li, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || !AbstractC2995aW.i(c3983li.allowAutoRedirect, Boolean.FALSE)) {
            interfaceC4596sh.r(d40, 0, C3969lb.f4651a, c3983li.allowAutoRedirect);
        }
        if (interfaceC4596sh.j(d40) || (l = c3983li.afterClickDuration) == null || l.longValue() != Long.MAX_VALUE) {
            interfaceC4596sh.r(d40, 1, FJ.f3064a, c3983li.afterClickDuration);
        }
    }

    public final Boolean component1() {
        return this.allowAutoRedirect;
    }

    public final Long component2() {
        return this.afterClickDuration;
    }

    public final C3983li copy(Boolean bool, Long l) {
        return new C3983li(bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3983li)) {
            return false;
        }
        C3983li c3983li = (C3983li) obj;
        return AbstractC2995aW.i(this.allowAutoRedirect, c3983li.allowAutoRedirect) && AbstractC2995aW.i(this.afterClickDuration, c3983li.afterClickDuration);
    }

    public final Long getAfterClickDuration() {
        return this.afterClickDuration;
    }

    public final Boolean getAllowAutoRedirect() {
        return this.allowAutoRedirect;
    }

    public int hashCode() {
        Boolean bool = this.allowAutoRedirect;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.afterClickDuration;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
    }

    public /* synthetic */ C3983li(Boolean bool, Long l, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Long.MAX_VALUE : l);
    }

    public /* synthetic */ C3983li(int i, Boolean bool, Long l, O40 o40) {
        this.allowAutoRedirect = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.afterClickDuration = Long.MAX_VALUE;
        } else {
            this.afterClickDuration = l;
        }
    }

    public C3983li(Boolean bool, Long l) {
        this.allowAutoRedirect = bool;
        this.afterClickDuration = l;
    }

    public static /* synthetic */ void getAfterClickDuration$annotations() {
    }

    public static /* synthetic */ void getAllowAutoRedirect$annotations() {
    }
}
