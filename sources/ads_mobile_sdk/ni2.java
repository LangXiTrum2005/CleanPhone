package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.bostonian;
import saneness.coffeecake;
import saneness.dent;
import saneness.nictation;
import saneness.sensatory;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class ni2 implements dent {
    public final adultoid a;
    public final l13 b;
    public final formularize c;
    public final long d;
    public final int e;
    public final String f;
    public final yf2 g;
    public final boolean h;
    public final gy0 i;
    public final sensatory j;
    public final d6 k;

    public ni2(coffeecake rewardedRenderComponentProvider, l13 traceMetaSet, formularize baseRequest, long j, int i, String requestId, yf2 requestType, boolean z, gy0 inspectorAdLifecycleMonitor, sensatory recursiveAdLoader, d6 adSourceResponseInfoCollector) {
        Intrinsics.checkNotNullParameter(rewardedRenderComponentProvider, "rewardedRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        this.a = rewardedRenderComponentProvider;
        this.b = traceMetaSet;
        this.c = baseRequest;
        this.d = j;
        this.e = i;
        this.f = requestId;
        this.g = requestType;
        this.h = z;
        this.i = inspectorAdLifecycleMonitor;
        this.j = recursiveAdLoader;
        this.k = adSourceResponseInfoCollector;
    }

    @Override // saneness.dent
    public final bostonian a(jm2 serverTransaction, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        nictation nictationVar = (nictation) this.a.get();
        formularize formularizeVar = this.c;
        w80 w80Var = (w80) nictationVar;
        w80Var.getClass();
        formularizeVar.getClass();
        w80Var.g = formularizeVar;
        adConfiguration.getClass();
        w80Var.c = adConfiguration;
        ur urVar = serverTransaction.b.b;
        urVar.getClass();
        w80Var.b = urVar;
        w80Var.d = serverTransaction;
        yf2 yf2Var = this.g;
        yf2Var.getClass();
        w80Var.h = yf2Var;
        xb2 xb2Var = this.b.a;
        xb2Var.getClass();
        w80Var.j = xb2Var;
        j71 j71Var = this.b.b;
        j71Var.getClass();
        w80Var.k = j71Var;
        String str = this.f;
        str.getClass();
        w80Var.i = str;
        w80Var.e = Long.valueOf(this.d);
        w80Var.f = Integer.valueOf(this.e);
        w80Var.l = Boolean.valueOf(this.h);
        gy0 gy0Var = this.i;
        gy0Var.getClass();
        w80Var.m = gy0Var;
        sensatory sensatoryVar = this.j;
        sensatoryVar.getClass();
        w80Var.o = sensatoryVar;
        d6 d6Var = this.k;
        d6Var.getClass();
        w80Var.n = d6Var;
        vilification.saneness(w80Var.b, ur.class);
        vilification.saneness(w80Var.c, h1.class);
        vilification.saneness(w80Var.d, jm2.class);
        vilification.saneness(w80Var.e, Long.class);
        vilification.saneness(w80Var.f, Integer.class);
        vilification.saneness(w80Var.g, formularize.class);
        vilification.saneness(w80Var.h, yf2.class);
        vilification.saneness(w80Var.i, String.class);
        vilification.saneness(w80Var.j, xb2.class);
        vilification.saneness(w80Var.k, j71.class);
        vilification.saneness(w80Var.l, Boolean.class);
        vilification.saneness(w80Var.m, gy0.class);
        vilification.saneness(w80Var.n, d6.class);
        vilification.saneness(w80Var.o, sensatory.class);
        return (bostonian) new x80(w80Var.a, w80Var.b, w80Var.c, w80Var.d, w80Var.e, w80Var.f, w80Var.g, w80Var.h, w80Var.j, w80Var.k, w80Var.l, w80Var.m, w80Var.n, w80Var.o).z.get();
    }
}
