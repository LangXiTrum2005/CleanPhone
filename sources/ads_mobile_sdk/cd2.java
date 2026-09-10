package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.ramallah;

/* JADX INFO: loaded from: classes.dex */
public final class cd2 extends qc2 {
    public final ramallah m;
    public final boolean n;
    public final gy0 o;
    public final d6 p;

    /* JADX WARN: Illegal instructions before constructor call */
    public cd2(ramallah recursiveAdLoader, l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, boolean z, gy0 inspectorAdLifecycleMonitor, d6 adSourceResponseInfoCollector, coffeecake placementIdWrapperProvider) {
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        Intrinsics.checkNotNullParameter(placementIdWrapperProvider, "placementIdWrapperProvider");
        Object obj = placementIdWrapperProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, (a22) obj);
        this.m = recursiveAdLoader;
        this.n = z;
        this.o = inspectorAdLifecycleMonitor;
        this.p = adSourceResponseInfoCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0102, code lost:
    
        if (r12 == r0) goto L21;
     */
    @Override // ads_mobile_sdk.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r11, wretchedly.dern r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cd2.a(boolean, wretchedly.dern):java.lang.Object");
    }
}
