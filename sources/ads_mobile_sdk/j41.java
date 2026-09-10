package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class j41 implements coi {
    public final coffeecake a;

    public j41(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        xi bannerRefreshSignalSource = (xi) this.a.get();
        Intrinsics.checkNotNullParameter(bannerRefreshSignalSource, "bannerRefreshSignalSource");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.SEQUENTIAL;
        fr2 fr2Var = fr2.BACKGROUND;
        return new nt1(bannerRefreshSignalSource, bq2Var, gp2Var, zs2.b.a);
    }
}
