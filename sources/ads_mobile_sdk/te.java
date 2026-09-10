package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adsuki;
import saneness.adultoid;
import saneness.bostonian;
import saneness.coffeecake;
import saneness.dent;
import saneness.jugal;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class te implements dent {
    public final adultoid a;
    public final l13 b;
    public final formularize c;
    public final long d;
    public final int e;
    public final String f;
    public final yf2 g;
    public final boolean h;
    public final gy0 i;
    public final jugal j;
    public final d6 k;

    public te(coffeecake renderComponentProvider, l13 traceMetaSet, formularize baseRequest, long j, int i, String requestId, yf2 requestType, boolean z, gy0 inspectorAdLifecycleMonitor, jugal recursiveAdLoader, d6 adSourceResponseInfoCollector) {
        Intrinsics.checkNotNullParameter(renderComponentProvider, "renderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        this.a = renderComponentProvider;
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
        adsuki adsukiVar = (adsuki) this.a.get();
        formularize formularizeVar = this.c;
        r40 r40Var = (r40) adsukiVar;
        r40Var.getClass();
        formularizeVar.getClass();
        r40Var.g = formularizeVar;
        adConfiguration.getClass();
        r40Var.c = adConfiguration;
        ur urVar = serverTransaction.b.b;
        urVar.getClass();
        r40Var.b = urVar;
        r40Var.d = serverTransaction;
        yf2 yf2Var = this.g;
        yf2Var.getClass();
        r40Var.h = yf2Var;
        xb2 xb2Var = this.b.a;
        xb2Var.getClass();
        r40Var.j = xb2Var;
        j71 j71Var = this.b.b;
        j71Var.getClass();
        r40Var.k = j71Var;
        String str = this.f;
        str.getClass();
        r40Var.i = str;
        r40Var.e = Long.valueOf(this.d);
        r40Var.f = Integer.valueOf(this.e);
        r40Var.l = Boolean.valueOf(this.h);
        gy0 gy0Var = this.i;
        gy0Var.getClass();
        r40Var.m = gy0Var;
        jugal jugalVar = this.j;
        jugalVar.getClass();
        r40Var.o = jugalVar;
        d6 d6Var = this.k;
        d6Var.getClass();
        r40Var.n = d6Var;
        vilification.saneness(r40Var.b, ur.class);
        vilification.saneness(r40Var.c, h1.class);
        vilification.saneness(r40Var.d, jm2.class);
        vilification.saneness(r40Var.e, Long.class);
        vilification.saneness(r40Var.f, Integer.class);
        vilification.saneness(r40Var.g, formularize.class);
        vilification.saneness(r40Var.h, yf2.class);
        vilification.saneness(r40Var.i, String.class);
        vilification.saneness(r40Var.j, xb2.class);
        vilification.saneness(r40Var.k, j71.class);
        vilification.saneness(r40Var.l, Boolean.class);
        vilification.saneness(r40Var.m, gy0.class);
        vilification.saneness(r40Var.n, d6.class);
        vilification.saneness(r40Var.o, jugal.class);
        return (bostonian) new s40(r40Var.a, r40Var.b, r40Var.c, r40Var.d, r40Var.e, r40Var.f, r40Var.g, r40Var.h, r40Var.j, r40Var.k, r40Var.l, r40Var.m, r40Var.n, r40Var.o).z.get();
    }
}
