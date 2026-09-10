package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4247oi {
    public static final C4159ni Companion = new C4159ni(null);
    private final Integer diskPercentage;
    private final Long diskSize;
    private final Boolean enabled;

    public C4247oi() {
        this((Boolean) null, (Long) null, (Integer) null, 7, (AbstractC2471Hm) null);
    }

    public static /* synthetic */ C4247oi copy$default(C4247oi c4247oi, Boolean bool, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c4247oi.enabled;
        }
        if ((i & 2) != 0) {
            l = c4247oi.diskSize;
        }
        if ((i & 4) != 0) {
            num = c4247oi.diskPercentage;
        }
        return c4247oi.copy(bool, l, num);
    }

    public static final void write$Self(C4247oi c4247oi, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        Integer num;
        Long l;
        AbstractC2995aW.q(c4247oi, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || !AbstractC2995aW.i(c4247oi.enabled, Boolean.FALSE)) {
            interfaceC4596sh.r(d40, 0, C3969lb.f4651a, c4247oi.enabled);
        }
        if (interfaceC4596sh.j(d40) || (l = c4247oi.diskSize) == null || l.longValue() != 1000) {
            interfaceC4596sh.r(d40, 1, FJ.f3064a, c4247oi.diskSize);
        }
        if (interfaceC4596sh.j(d40) || (num = c4247oi.diskPercentage) == null || num.intValue() != 3) {
            interfaceC4596sh.r(d40, 2, AD.f2808a, c4247oi.diskPercentage);
        }
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final Long component2() {
        return this.diskSize;
    }

    public final Integer component3() {
        return this.diskPercentage;
    }

    public final C4247oi copy(Boolean bool, Long l, Integer num) {
        return new C4247oi(bool, l, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4247oi)) {
            return false;
        }
        C4247oi c4247oi = (C4247oi) obj;
        return AbstractC2995aW.i(this.enabled, c4247oi.enabled) && AbstractC2995aW.i(this.diskSize, c4247oi.diskSize) && AbstractC2995aW.i(this.diskPercentage, c4247oi.diskPercentage);
    }

    public final Integer getDiskPercentage() {
        return this.diskPercentage;
    }

    public final Long getDiskSize() {
        return this.diskSize;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.diskSize;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.diskPercentage;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
    }

    public /* synthetic */ C4247oi(Boolean bool, Long l, Integer num, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 1000L : l, (i & 4) != 0 ? 3 : num);
    }

    public /* synthetic */ C4247oi(int i, Boolean bool, Long l, Integer num, O40 o40) {
        this.enabled = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.diskSize = 1000L;
        } else {
            this.diskSize = l;
        }
        if ((i & 4) == 0) {
            this.diskPercentage = 3;
        } else {
            this.diskPercentage = num;
        }
    }

    public C4247oi(Boolean bool, Long l, Integer num) {
        this.enabled = bool;
        this.diskSize = l;
        this.diskPercentage = num;
    }

    public static /* synthetic */ void getDiskPercentage$annotations() {
    }

    public static /* synthetic */ void getDiskSize$annotations() {
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }
}
