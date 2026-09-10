package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4598si {
    public static final C4510ri Companion = new C4510ri(null);
    private final Long refreshTime;

    public C4598si() {
        this((Long) null, 1, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C4598si copy$default(C4598si c4598si, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = c4598si.refreshTime;
        }
        return c4598si.copy(l);
    }

    public static final void write$Self(C4598si c4598si, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4598si, "self");
        if (!AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) && c4598si.refreshTime == null) {
            return;
        }
        interfaceC4596sh.r(d40, 0, FJ.f3064a, c4598si.refreshTime);
    }

    public final Long component1() {
        return this.refreshTime;
    }

    public final C4598si copy(Long l) {
        return new C4598si(l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4598si) && AbstractC2995aW.i(this.refreshTime, ((C4598si) obj).refreshTime);
    }

    public final Long getRefreshTime() {
        return this.refreshTime;
    }

    public int hashCode() {
        Long l = this.refreshTime;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
    }

    public /* synthetic */ C4598si(Long l, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : l);
    }

    public /* synthetic */ C4598si(int i, Long l, O40 o40) {
        if ((i & 1) == 0) {
            this.refreshTime = null;
        } else {
            this.refreshTime = l;
        }
    }

    public C4598si(Long l) {
        this.refreshTime = l;
    }

    public static /* synthetic */ void getRefreshTime$annotations() {
    }
}
