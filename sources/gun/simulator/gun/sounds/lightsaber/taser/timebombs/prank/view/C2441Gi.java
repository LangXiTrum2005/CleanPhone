package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2441Gi {
    public static final C2415Fi Companion = new C2415Fi(null);
    private final Integer errorLogLevel;
    private final Boolean metricsEnabled;

    public C2441Gi() {
        this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C2441Gi copy$default(C2441Gi c2441Gi, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c2441Gi.errorLogLevel;
        }
        if ((i & 2) != 0) {
            bool = c2441Gi.metricsEnabled;
        }
        return c2441Gi.copy(num, bool);
    }

    public static final void write$Self(C2441Gi c2441Gi, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2441Gi, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2441Gi.errorLogLevel != null) {
            interfaceC4596sh.r(d40, 0, AD.f2808a, c2441Gi.errorLogLevel);
        }
        if (!interfaceC4596sh.j(d40) && c2441Gi.metricsEnabled == null) {
            return;
        }
        interfaceC4596sh.r(d40, 1, C3969lb.f4651a, c2441Gi.metricsEnabled);
    }

    public final Integer component1() {
        return this.errorLogLevel;
    }

    public final Boolean component2() {
        return this.metricsEnabled;
    }

    public final C2441Gi copy(Integer num, Boolean bool) {
        return new C2441Gi(num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2441Gi)) {
            return false;
        }
        C2441Gi c2441Gi = (C2441Gi) obj;
        return AbstractC2995aW.i(this.errorLogLevel, c2441Gi.errorLogLevel) && AbstractC2995aW.i(this.metricsEnabled, c2441Gi.metricsEnabled);
    }

    public final Integer getErrorLogLevel() {
        return this.errorLogLevel;
    }

    public final Boolean getMetricsEnabled() {
        return this.metricsEnabled;
    }

    public int hashCode() {
        Integer num = this.errorLogLevel;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.metricsEnabled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
    }

    public /* synthetic */ C2441Gi(Integer num, Boolean bool, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool);
    }

    public /* synthetic */ C2441Gi(int i, Integer num, Boolean bool, O40 o40) {
        if ((i & 1) == 0) {
            this.errorLogLevel = null;
        } else {
            this.errorLogLevel = num;
        }
        if ((i & 2) == 0) {
            this.metricsEnabled = null;
        } else {
            this.metricsEnabled = bool;
        }
    }

    public C2441Gi(Integer num, Boolean bool) {
        this.errorLogLevel = num;
        this.metricsEnabled = bool;
    }

    public static /* synthetic */ void getErrorLogLevel$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$annotations() {
    }
}
