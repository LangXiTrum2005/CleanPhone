package ads_mobile_sdk;

import complexometry.formularize;
import liquory.beachfront;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.bostonian;
import saneness.coffeecake;
import saneness.dent;
import saneness.drawling;
import saneness.indulgency;
import saneness.phytopathogen;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class ij implements dent {
    public final adultoid a;
    public final l13 b;
    public final formularize c;
    public final beachfront d;
    public final phytopathogen e;
    public final boolean f;
    public final long g;
    public final int h;
    public final String i;
    public final boolean j;
    public final rockless k;
    public final indulgency l;
    public final gy0 m;
    public final d6 n;

    public ij(coffeecake bannerRenderComponentProvider, l13 traceMetaSet, formularize baseRequest, beachfront bannerRequest, phytopathogen refreshListener, boolean z, long j, int i, String requestId, boolean z2, rockless refreshUpdateListener, indulgency recursiveAdLoader, gy0 inspectorAdLifecycleMonitor, d6 adSourceResponseInfoCollector) {
        Intrinsics.checkNotNullParameter(bannerRenderComponentProvider, "bannerRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(refreshUpdateListener, "refreshUpdateListener");
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        this.a = bannerRenderComponentProvider;
        this.b = traceMetaSet;
        this.c = baseRequest;
        this.d = bannerRequest;
        this.e = refreshListener;
        this.f = z;
        this.g = j;
        this.h = i;
        this.i = requestId;
        this.j = z2;
        this.k = refreshUpdateListener;
        this.l = recursiveAdLoader;
        this.m = inspectorAdLifecycleMonitor;
        this.n = adSourceResponseInfoCollector;
    }

    @Override // saneness.dent
    public final bostonian a(jm2 serverTransaction, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        drawling drawlingVar = (drawling) this.a.get();
        formularize formularizeVar = this.c;
        v40 v40Var = (v40) drawlingVar;
        v40Var.getClass();
        formularizeVar.getClass();
        v40Var.g = formularizeVar;
        beachfront beachfrontVar = this.d;
        beachfrontVar.getClass();
        v40Var.p = beachfrontVar;
        adConfiguration.getClass();
        v40Var.c = adConfiguration;
        v40Var.h = yf2.f;
        ur urVar = serverTransaction.b.b;
        urVar.getClass();
        v40Var.b = urVar;
        v40Var.d = serverTransaction;
        phytopathogen phytopathogenVar = this.e;
        phytopathogenVar.getClass();
        v40Var.o = phytopathogenVar;
        xb2 xb2Var = this.b.a;
        xb2Var.getClass();
        v40Var.j = xb2Var;
        j71 j71Var = this.b.b;
        j71Var.getClass();
        v40Var.k = j71Var;
        String str = this.i;
        str.getClass();
        v40Var.i = str;
        v40Var.e = Long.valueOf(this.g);
        v40Var.f = Integer.valueOf(this.h);
        v40Var.l = Boolean.valueOf(this.f);
        v40Var.q = Boolean.valueOf(this.j);
        indulgency indulgencyVar = this.l;
        indulgencyVar.getClass();
        v40Var.r = indulgencyVar;
        rockless rocklessVar = this.k;
        rocklessVar.getClass();
        v40Var.s = rocklessVar;
        gy0 gy0Var = this.m;
        gy0Var.getClass();
        v40Var.m = gy0Var;
        d6 d6Var = this.n;
        d6Var.getClass();
        v40Var.n = d6Var;
        vilification.saneness(v40Var.b, ur.class);
        vilification.saneness(v40Var.c, h1.class);
        vilification.saneness(v40Var.d, jm2.class);
        vilification.saneness(v40Var.e, Long.class);
        vilification.saneness(v40Var.f, Integer.class);
        vilification.saneness(v40Var.g, formularize.class);
        vilification.saneness(v40Var.h, yf2.class);
        vilification.saneness(v40Var.i, String.class);
        vilification.saneness(v40Var.j, xb2.class);
        vilification.saneness(v40Var.k, j71.class);
        vilification.saneness(v40Var.l, Boolean.class);
        vilification.saneness(v40Var.m, gy0.class);
        vilification.saneness(v40Var.n, d6.class);
        vilification.saneness(v40Var.o, phytopathogen.class);
        vilification.saneness(v40Var.p, beachfront.class);
        vilification.saneness(v40Var.q, Boolean.class);
        vilification.saneness(v40Var.r, indulgency.class);
        vilification.saneness(v40Var.s, rockless.class);
        return (bostonian) new w40(v40Var.a, v40Var.b, v40Var.c, v40Var.d, v40Var.e, v40Var.f, v40Var.g, v40Var.h, v40Var.j, v40Var.k, v40Var.l, v40Var.m, v40Var.n, v40Var.o, v40Var.p, v40Var.q, v40Var.r, v40Var.s).D.get();
    }
}
