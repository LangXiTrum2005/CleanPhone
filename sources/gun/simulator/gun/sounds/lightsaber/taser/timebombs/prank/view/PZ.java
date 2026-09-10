package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PZ {
    public static final OZ Companion = new OZ(null);
    private Float earningsByPlacementUSD;
    private Boolean isUserAPurchaser;
    private Boolean isUserASubscriber;
    private Float last30DaysMeanSpendUSD;
    private Float last30DaysMedianSpendUSD;
    private Float last30DaysPlacementFillRate;
    private Float last30DaysTotalSpendUSD;
    private Float last30DaysUserLtvUSD;
    private Float last30DaysUserPltvUSD;
    private Float last7DaysMeanSpendUSD;
    private Float last7DaysMedianSpendUSD;
    private Float last7DaysPlacementFillRate;
    private Float last7DaysTotalSpendUSD;
    private Float last7DaysUserLtvUSD;
    private Float last7DaysUserPltvUSD;
    private List<String> topNAdomain;
    private Float totalEarningsUSD;

    public /* synthetic */ PZ(int i, Float f, Float f2, List list, Boolean bool, Boolean bool2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, O40 o40) {
        if ((i & 1) == 0) {
            this.totalEarningsUSD = null;
        } else {
            this.totalEarningsUSD = f;
        }
        if ((i & 2) == 0) {
            this.earningsByPlacementUSD = null;
        } else {
            this.earningsByPlacementUSD = f2;
        }
        if ((i & 4) == 0) {
            this.topNAdomain = null;
        } else {
            this.topNAdomain = list;
        }
        if ((i & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
        if ((i & 16) == 0) {
            this.isUserASubscriber = null;
        } else {
            this.isUserASubscriber = bool2;
        }
        if ((i & 32) == 0) {
            this.last7DaysTotalSpendUSD = null;
        } else {
            this.last7DaysTotalSpendUSD = f3;
        }
        if ((i & 64) == 0) {
            this.last7DaysMedianSpendUSD = null;
        } else {
            this.last7DaysMedianSpendUSD = f4;
        }
        if ((i & 128) == 0) {
            this.last7DaysMeanSpendUSD = null;
        } else {
            this.last7DaysMeanSpendUSD = f5;
        }
        if ((i & 256) == 0) {
            this.last30DaysTotalSpendUSD = null;
        } else {
            this.last30DaysTotalSpendUSD = f6;
        }
        if ((i & 512) == 0) {
            this.last30DaysMedianSpendUSD = null;
        } else {
            this.last30DaysMedianSpendUSD = f7;
        }
        if ((i & 1024) == 0) {
            this.last30DaysMeanSpendUSD = null;
        } else {
            this.last30DaysMeanSpendUSD = f8;
        }
        if ((i & 2048) == 0) {
            this.last7DaysUserPltvUSD = null;
        } else {
            this.last7DaysUserPltvUSD = f9;
        }
        if ((i & 4096) == 0) {
            this.last7DaysUserLtvUSD = null;
        } else {
            this.last7DaysUserLtvUSD = f10;
        }
        if ((i & 8192) == 0) {
            this.last30DaysUserPltvUSD = null;
        } else {
            this.last30DaysUserPltvUSD = f11;
        }
        if ((i & 16384) == 0) {
            this.last30DaysUserLtvUSD = null;
        } else {
            this.last30DaysUserLtvUSD = f12;
        }
        if ((32768 & i) == 0) {
            this.last7DaysPlacementFillRate = null;
        } else {
            this.last7DaysPlacementFillRate = f13;
        }
        if ((i & 65536) == 0) {
            this.last30DaysPlacementFillRate = null;
        } else {
            this.last30DaysPlacementFillRate = f14;
        }
    }

    public static final void write$Self(PZ pz, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(pz, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || pz.totalEarningsUSD != null) {
            interfaceC4596sh.r(d40, 0, C4179nv.f4766a, pz.totalEarningsUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.earningsByPlacementUSD != null) {
            interfaceC4596sh.r(d40, 1, C4179nv.f4766a, pz.earningsByPlacementUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.topNAdomain != null) {
            interfaceC4596sh.r(d40, 2, new T5(W90.f3912a, 0), pz.topNAdomain);
        }
        if (interfaceC4596sh.j(d40) || pz.isUserAPurchaser != null) {
            interfaceC4596sh.r(d40, 3, C3969lb.f4651a, pz.isUserAPurchaser);
        }
        if (interfaceC4596sh.j(d40) || pz.isUserASubscriber != null) {
            interfaceC4596sh.r(d40, 4, C3969lb.f4651a, pz.isUserASubscriber);
        }
        if (interfaceC4596sh.j(d40) || pz.last7DaysTotalSpendUSD != null) {
            interfaceC4596sh.r(d40, 5, C4179nv.f4766a, pz.last7DaysTotalSpendUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last7DaysMedianSpendUSD != null) {
            interfaceC4596sh.r(d40, 6, C4179nv.f4766a, pz.last7DaysMedianSpendUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last7DaysMeanSpendUSD != null) {
            interfaceC4596sh.r(d40, 7, C4179nv.f4766a, pz.last7DaysMeanSpendUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last30DaysTotalSpendUSD != null) {
            interfaceC4596sh.r(d40, 8, C4179nv.f4766a, pz.last30DaysTotalSpendUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last30DaysMedianSpendUSD != null) {
            interfaceC4596sh.r(d40, 9, C4179nv.f4766a, pz.last30DaysMedianSpendUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last30DaysMeanSpendUSD != null) {
            interfaceC4596sh.r(d40, 10, C4179nv.f4766a, pz.last30DaysMeanSpendUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last7DaysUserPltvUSD != null) {
            interfaceC4596sh.r(d40, 11, C4179nv.f4766a, pz.last7DaysUserPltvUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last7DaysUserLtvUSD != null) {
            interfaceC4596sh.r(d40, 12, C4179nv.f4766a, pz.last7DaysUserLtvUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last30DaysUserPltvUSD != null) {
            interfaceC4596sh.r(d40, 13, C4179nv.f4766a, pz.last30DaysUserPltvUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last30DaysUserLtvUSD != null) {
            interfaceC4596sh.r(d40, 14, C4179nv.f4766a, pz.last30DaysUserLtvUSD);
        }
        if (interfaceC4596sh.j(d40) || pz.last7DaysPlacementFillRate != null) {
            interfaceC4596sh.r(d40, 15, C4179nv.f4766a, pz.last7DaysPlacementFillRate);
        }
        if (!interfaceC4596sh.j(d40) && pz.last30DaysPlacementFillRate == null) {
            return;
        }
        interfaceC4596sh.r(d40, 16, C4179nv.f4766a, pz.last30DaysPlacementFillRate);
    }

    public final PZ setEarningsByPlacement(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.earningsByPlacementUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setIsUserAPurchaser(boolean z) {
        this.isUserAPurchaser = Boolean.valueOf(z);
        return this;
    }

    public final PZ setIsUserASubscriber(boolean z) {
        this.isUserASubscriber = Boolean.valueOf(z);
        return this;
    }

    public final PZ setLast30DaysMeanSpendUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysMeanSpendUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast30DaysMedianSpendUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysMedianSpendUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast30DaysPlacementFillRate(float f) {
        if (C3526gX.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.last30DaysPlacementFillRate = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast30DaysTotalSpendUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysTotalSpendUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast30DaysUserLtvUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysUserLtvUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast30DaysUserPltvUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysUserPltvUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast7DaysMeanSpendUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysMeanSpendUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast7DaysMedianSpendUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysMedianSpendUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast7DaysPlacementFillRate(float f) {
        if (C3526gX.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.last7DaysPlacementFillRate = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast7DaysTotalSpendUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysTotalSpendUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast7DaysUserLtvUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysUserLtvUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setLast7DaysUserPltvUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysUserPltvUSD = Float.valueOf(f);
        }
        return this;
    }

    public final PZ setTopNAdomain(List<String> list) {
        this.topNAdomain = list != null ? AbstractC2853Wf.v0(list) : null;
        return this;
    }

    public final PZ setTotalEarningsUsd(float f) {
        if (C3526gX.isInRange$default(C3526gX.INSTANCE, f, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalEarningsUSD = Float.valueOf(f);
        }
        return this;
    }

    public PZ() {
    }

    private static /* synthetic */ void getEarningsByPlacementUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysMeanSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysMedianSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysPlacementFillRate$annotations() {
    }

    private static /* synthetic */ void getLast30DaysTotalSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysUserLtvUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysUserPltvUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysMeanSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysMedianSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysPlacementFillRate$annotations() {
    }

    private static /* synthetic */ void getLast7DaysTotalSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysUserLtvUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysUserPltvUSD$annotations() {
    }

    private static /* synthetic */ void getTopNAdomain$annotations() {
    }

    private static /* synthetic */ void getTotalEarningsUSD$annotations() {
    }

    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    private static /* synthetic */ void isUserASubscriber$annotations() {
    }
}
