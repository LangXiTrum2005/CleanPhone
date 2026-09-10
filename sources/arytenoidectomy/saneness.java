package arytenoidectomy;

import android.os.Bundle;

/* JADX INFO: compiled from: CustomTabColorSchemeParams.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Integer f14384attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Integer f14385dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Integer f14386saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Integer f14387wireman;

    /* JADX INFO: compiled from: CustomTabColorSchemeParams.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Integer f14388attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Integer f14389dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Integer f14390saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Integer f14391wireman;

        public saneness attabal() {
            return new saneness(this.f14388attabal, this.f14390saneness, this.f14389dern, this.f14391wireman);
        }

        public attabal saneness(int i) {
            this.f14388attabal = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public saneness(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f14384attabal = num;
        this.f14386saneness = num2;
        this.f14385dern = num3;
        this.f14387wireman = num4;
    }

    public Bundle attabal() {
        Bundle bundle = new Bundle();
        Integer num = this.f14384attabal;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f14386saneness;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f14385dern;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f14387wireman;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
