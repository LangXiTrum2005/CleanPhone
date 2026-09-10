package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class WI {
    public static final VI Companion = new VI(null);
    private String country;
    private Integer dma;
    private String regionState;

    public WI() {
    }

    public static final void write$Self(WI wi, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(wi, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || wi.country != null) {
            interfaceC4596sh.r(d40, 0, W90.f3912a, wi.country);
        }
        if (interfaceC4596sh.j(d40) || wi.regionState != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, wi.regionState);
        }
        if (!interfaceC4596sh.j(d40) && wi.dma == null) {
            return;
        }
        interfaceC4596sh.r(d40, 2, AD.f2808a, wi.dma);
    }

    public final WI setCountry(String str) {
        AbstractC2995aW.q(str, com.umeng.analytics.pro.bc.O);
        this.country = str;
        return this;
    }

    public final WI setDma(int i) {
        this.dma = Integer.valueOf(i);
        return this;
    }

    public final WI setRegionState(String str) {
        AbstractC2995aW.q(str, "regionState");
        this.regionState = str;
        return this;
    }

    public /* synthetic */ WI(int i, String str, String str2, Integer num, O40 o40) {
        if ((i & 1) == 0) {
            this.country = null;
        } else {
            this.country = str;
        }
        if ((i & 2) == 0) {
            this.regionState = null;
        } else {
            this.regionState = str2;
        }
        if ((i & 4) == 0) {
            this.dma = null;
        } else {
            this.dma = num;
        }
    }

    private static /* synthetic */ void getCountry$annotations() {
    }

    private static /* synthetic */ void getDma$annotations() {
    }

    private static /* synthetic */ void getRegionState$annotations() {
    }
}
