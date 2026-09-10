package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5138yo {
    public static final C5050xo Companion = new C5050xo(null);
    private Integer ageRange;
    private Integer lengthOfResidence;
    private Integer medianHomeValueUSD;
    private Integer monthlyHousingPaymentUSD;

    public C5138yo() {
    }

    public static final void write$Self(C5138yo c5138yo, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c5138yo, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c5138yo.ageRange != null) {
            interfaceC4596sh.r(d40, 0, AD.f2808a, c5138yo.ageRange);
        }
        if (interfaceC4596sh.j(d40) || c5138yo.lengthOfResidence != null) {
            interfaceC4596sh.r(d40, 1, AD.f2808a, c5138yo.lengthOfResidence);
        }
        if (interfaceC4596sh.j(d40) || c5138yo.medianHomeValueUSD != null) {
            interfaceC4596sh.r(d40, 2, AD.f2808a, c5138yo.medianHomeValueUSD);
        }
        if (!interfaceC4596sh.j(d40) && c5138yo.monthlyHousingPaymentUSD == null) {
            return;
        }
        interfaceC4596sh.r(d40, 3, AD.f2808a, c5138yo.monthlyHousingPaymentUSD);
    }

    public final C5138yo setAgeRange(int i) {
        this.ageRange = Integer.valueOf(O3.Companion.fromAge$vungle_ads_release(i).getId());
        return this;
    }

    public final C5138yo setLengthOfResidence(int i) {
        this.lengthOfResidence = Integer.valueOf(EnumC4388qH.Companion.fromYears$vungle_ads_release(i).getId());
        return this;
    }

    public final C5138yo setMedianHomeValueUSD(int i) {
        this.medianHomeValueUSD = Integer.valueOf(UO.Companion.fromPrice$vungle_ads_release(i).getId());
        return this;
    }

    public final C5138yo setMonthlyHousingCosts(int i) {
        this.monthlyHousingPaymentUSD = Integer.valueOf(KP.Companion.fromCost$vungle_ads_release(i).getId());
        return this;
    }

    public /* synthetic */ C5138yo(int i, Integer num, Integer num2, Integer num3, Integer num4, O40 o40) {
        if ((i & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i & 2) == 0) {
            this.lengthOfResidence = null;
        } else {
            this.lengthOfResidence = num2;
        }
        if ((i & 4) == 0) {
            this.medianHomeValueUSD = null;
        } else {
            this.medianHomeValueUSD = num3;
        }
        if ((i & 8) == 0) {
            this.monthlyHousingPaymentUSD = null;
        } else {
            this.monthlyHousingPaymentUSD = num4;
        }
    }

    private static /* synthetic */ void getAgeRange$annotations() {
    }

    private static /* synthetic */ void getLengthOfResidence$annotations() {
    }

    private static /* synthetic */ void getMedianHomeValueUSD$annotations() {
    }

    private static /* synthetic */ void getMonthlyHousingPaymentUSD$annotations() {
    }
}
