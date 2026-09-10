package ads_mobile_sdk;

import android.os.SystemClock;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;
import svd.AdUnitQualitySignals;
import svd.AppStats;

/* JADX INFO: loaded from: classes.dex */
public final class hc2 implements portwide {
    public final ah a;
    public final c7 b;
    public final formularize c;
    public final vg d;

    public hc2(ah appStatsTracker, c7 adUnitStatsTracker, formularize request, vg appState) {
        Intrinsics.checkNotNullParameter(appStatsTracker, "appStatsTracker");
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.a = appStatsTracker;
        this.b = adUnitStatsTracker;
        this.c = request;
        this.d = appState;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.QUALITY;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        long jElapsedRealtime;
        AppStats appStats;
        Integer num;
        c7 c7Var;
        String adUnitId;
        long rawValue;
        p002kotlin.time.saneness sanenessVar;
        ah ahVar = this.a;
        synchronized (ahVar.b) {
            try {
                Long l = ahVar.g;
                if (l != null) {
                    long jLongValue = l.longValue();
                    ahVar.a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
                } else {
                    jElapsedRealtime = 0;
                }
                appStats = new AppStats(String.valueOf(ahVar.d), ahVar.e.get(), ahVar.f.get(), jElapsedRealtime);
            } catch (Throwable th) {
                throw th;
            }
        }
        c7 c7Var2 = this.b;
        String adUnitId2 = this.c.getAdUnitId();
        if (adUnitId2 != null) {
            num = (Integer) c7Var2.b.get(adUnitId2);
            if (num == null) {
            }
            int iIntValue = num.intValue();
            c7Var = this.b;
            adUnitId = this.c.getAdUnitId();
            if (adUnitId != null) {
                sanenessVar = (p002kotlin.time.saneness) c7Var.d.get(adUnitId);
                if (sanenessVar != null) {
                    rawValue = sanenessVar.getRawValue();
                }
                return new tn0(new gc2(appStats, this.d.e.get(), new AdUnitQualitySignals(igo.attabal.wireman(iIntValue), igo.attabal.marial(p002kotlin.time.saneness.adultoid(rawValue)))));
            }
            c7Var.getClass();
            rawValue = c7.e;
            return new tn0(new gc2(appStats, this.d.e.get(), new AdUnitQualitySignals(igo.attabal.wireman(iIntValue), igo.attabal.marial(p002kotlin.time.saneness.adultoid(rawValue)))));
        }
        c7Var2.getClass();
        num = 0;
        int iIntValue2 = num.intValue();
        c7Var = this.b;
        adUnitId = this.c.getAdUnitId();
        if (adUnitId != null) {
            sanenessVar = (p002kotlin.time.saneness) c7Var.d.get(adUnitId);
            if (sanenessVar != null) {
                rawValue = sanenessVar.getRawValue();
            }
            return new tn0(new gc2(appStats, this.d.e.get(), new AdUnitQualitySignals(igo.attabal.wireman(iIntValue2), igo.attabal.marial(p002kotlin.time.saneness.adultoid(rawValue)))));
        }
        c7Var.getClass();
        rawValue = c7.e;
        return new tn0(new gc2(appStats, this.d.e.get(), new AdUnitQualitySignals(igo.attabal.wireman(iIntValue2), igo.attabal.marial(p002kotlin.time.saneness.adultoid(rawValue)))));
    }
}
