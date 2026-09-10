package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class sr2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public sr2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        k4 adServicesExtensionVersionSignalSource = (k4) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(adServicesExtensionVersionSignalSource, "adServicesExtensionVersionSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        adServicesExtensionVersionSignalSource.getClass();
        return new vn(adServicesExtensionVersionSignalSource, gp2Var, fr2Var, volunteer.attabal(flags, to0.AD_SERVICES_EXTENSION_VERSION), new jr2(flags));
    }
}
