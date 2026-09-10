package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class cp implements hemolysin {
    public final g6 a;
    public final e2 b;
    public final oh c;
    public final ch0 d;
    public final h1 e;

    public cp(g6 adSpamClient, e2 adEventEmitter, oh attributionReportingManager, ch0 firebaseAnalyticsEventHandler, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(attributionReportingManager, "attributionReportingManager");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsEventHandler, "firebaseAnalyticsEventHandler");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.a = adSpamClient;
        this.b = adEventEmitter;
        this.c = attributionReportingManager;
        this.d = firebaseAnalyticsEventHandler;
        this.e = adConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r10.n(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r10.c(r9, r0) == r1) goto L37;
     */
    @Override // saneness.hemolysin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gq0 r9, java.util.Map r10, wretchedly.dern r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cp.a(ads_mobile_sdk.gq0, java.util.Map, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NAME_CLICK;
    }
}
