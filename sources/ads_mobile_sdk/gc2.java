package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.eliminate;
import svd.AdUnitQualitySignals;
import svd.AppStats;
import svd.QualitySignals;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class gc2 implements eliminate {
    public final AppStats a;
    public final int b;
    public final AdUnitQualitySignals c;

    public gc2(AppStats appStats, int i, AdUnitQualitySignals adUnitQualitySignals) {
        Intrinsics.checkNotNullParameter(appStats, "appStats");
        Intrinsics.checkNotNullParameter(adUnitQualitySignals, "adUnitQualitySignals");
        this.a = appStats;
        this.b = i;
        this.c = adUnitQualitySignals;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        int i = this.b;
        if (i > 0) {
            signals.numberOfRegisteredWebViews = Integer.valueOf(i);
        }
        signals.qualitySignals = new QualitySignals(this.a);
        signals.adUnitQualitySignals = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc2)) {
            return false;
        }
        gc2 gc2Var = (gc2) obj;
        return Intrinsics.wireman(this.a, gc2Var.a) && this.b == gc2Var.b && Intrinsics.wireman(this.c, gc2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bonny.attabal(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "QualitySignal(appStats=" + this.a + ", numberOfRegisteredWebViews=" + this.b + ", adUnitQualitySignals=" + this.c + ")";
    }
}
