package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.bostonian;
import saneness.coffeecake;
import saneness.denizen;
import saneness.dent;
import saneness.ramallah;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class r81 implements dent {
    public final adultoid a;
    public final l13 b;
    public final formularize c;
    public final long d;
    public final int e;
    public final String f;
    public final yf2 g;
    public final boolean h;
    public final gy0 i;
    public final ramallah j;
    public final d6 k;

    public r81(coffeecake interstitialRenderComponentProvider, l13 traceMetaSet, formularize baseRequest, long j, int i, String requestId, yf2 requestType, boolean z, gy0 inspectorAdLifecycleMonitor, ramallah recursiveAdLoader, d6 adSourceResponseInfoCollector) {
        Intrinsics.checkNotNullParameter(interstitialRenderComponentProvider, "interstitialRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        this.a = interstitialRenderComponentProvider;
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
        denizen denizenVar = (denizen) this.a.get();
        formularize formularizeVar = this.c;
        p70 p70Var = (p70) denizenVar;
        p70Var.getClass();
        formularizeVar.getClass();
        p70Var.g = formularizeVar;
        adConfiguration.getClass();
        p70Var.c = adConfiguration;
        ur urVar = serverTransaction.b.b;
        urVar.getClass();
        p70Var.b = urVar;
        p70Var.d = serverTransaction;
        yf2 yf2Var = this.g;
        yf2Var.getClass();
        p70Var.h = yf2Var;
        xb2 xb2Var = this.b.a;
        xb2Var.getClass();
        p70Var.j = xb2Var;
        j71 j71Var = this.b.b;
        j71Var.getClass();
        p70Var.k = j71Var;
        String str = this.f;
        str.getClass();
        p70Var.i = str;
        p70Var.e = Long.valueOf(this.d);
        p70Var.f = Integer.valueOf(this.e);
        p70Var.l = Boolean.valueOf(this.h);
        gy0 gy0Var = this.i;
        gy0Var.getClass();
        p70Var.m = gy0Var;
        ramallah ramallahVar = this.j;
        ramallahVar.getClass();
        p70Var.o = ramallahVar;
        d6 d6Var = this.k;
        d6Var.getClass();
        p70Var.n = d6Var;
        vilification.saneness(p70Var.b, ur.class);
        vilification.saneness(p70Var.c, h1.class);
        vilification.saneness(p70Var.d, jm2.class);
        vilification.saneness(p70Var.e, Long.class);
        vilification.saneness(p70Var.f, Integer.class);
        vilification.saneness(p70Var.g, formularize.class);
        vilification.saneness(p70Var.h, yf2.class);
        vilification.saneness(p70Var.i, String.class);
        vilification.saneness(p70Var.j, xb2.class);
        vilification.saneness(p70Var.k, j71.class);
        vilification.saneness(p70Var.l, Boolean.class);
        vilification.saneness(p70Var.m, gy0.class);
        vilification.saneness(p70Var.n, d6.class);
        vilification.saneness(p70Var.o, ramallah.class);
        return (bostonian) new q70(p70Var.a, p70Var.b, p70Var.c, p70Var.d, p70Var.e, p70Var.f, p70Var.g, p70Var.h, p70Var.j, p70Var.k, p70Var.l, p70Var.m, p70Var.n, p70Var.o).z.get();
    }
}
