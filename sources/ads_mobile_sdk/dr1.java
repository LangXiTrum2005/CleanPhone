package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.bostonian;
import saneness.coffeecake;
import saneness.dent;
import saneness.desuperheat;
import saneness.excrescency;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class dr1 implements dent {
    public final adultoid a;
    public final l13 b;
    public final formularize c;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern d;
    public final long e;
    public final int f;
    public final String g;
    public final yf2 h;
    public final int i;
    public final boolean j;
    public final gy0 k;
    public final boolean l;
    public final rockless m;
    public final excrescency n;
    public final d6 o;

    public dr1(coffeecake nativeRenderComponentProvider, l13 traceMetaSet, formularize baseRequest, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, long j, int i, String requestId, yf2 requestType, int i2, boolean z, gy0 inspectorAdLifecycleMonitor, boolean z2, rockless refreshUpdateListener, excrescency recursiveAdLoader, d6 adSourceResponseInfoCollector) {
        Intrinsics.checkNotNullParameter(nativeRenderComponentProvider, "nativeRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(refreshUpdateListener, "refreshUpdateListener");
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        this.a = nativeRenderComponentProvider;
        this.b = traceMetaSet;
        this.c = baseRequest;
        this.d = nativeRequest;
        this.e = j;
        this.f = i;
        this.g = requestId;
        this.h = requestType;
        this.i = i2;
        this.j = z;
        this.k = inspectorAdLifecycleMonitor;
        this.l = z2;
        this.m = refreshUpdateListener;
        this.n = recursiveAdLoader;
        this.o = adSourceResponseInfoCollector;
    }

    @Override // saneness.dent
    public final bostonian a(jm2 serverTransaction, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        desuperheat desuperheatVar = (desuperheat) this.a.get();
        formularize formularizeVar = this.c;
        x70 x70Var = (x70) desuperheatVar;
        x70Var.getClass();
        formularizeVar.getClass();
        x70Var.g = formularizeVar;
        com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar = this.d;
        dernVar.getClass();
        x70Var.p = dernVar;
        adConfiguration.getClass();
        x70Var.c = adConfiguration;
        ur urVar = serverTransaction.b.b;
        urVar.getClass();
        x70Var.b = urVar;
        x70Var.d = serverTransaction;
        yf2 yf2Var = this.h;
        yf2Var.getClass();
        x70Var.h = yf2Var;
        xb2 xb2Var = this.b.a;
        xb2Var.getClass();
        x70Var.j = xb2Var;
        j71 j71Var = this.b.b;
        j71Var.getClass();
        x70Var.k = j71Var;
        String str = this.g;
        str.getClass();
        x70Var.i = str;
        x70Var.e = Long.valueOf(this.e);
        x70Var.f = Integer.valueOf(this.f);
        x70Var.o = Integer.valueOf(this.i);
        x70Var.l = Boolean.valueOf(this.j);
        gy0 gy0Var = this.k;
        gy0Var.getClass();
        x70Var.m = gy0Var;
        x70Var.q = Boolean.valueOf(this.l);
        rockless rocklessVar = this.m;
        rocklessVar.getClass();
        x70Var.r = rocklessVar;
        excrescency excrescencyVar = this.n;
        excrescencyVar.getClass();
        x70Var.s = excrescencyVar;
        d6 d6Var = this.o;
        d6Var.getClass();
        x70Var.n = d6Var;
        vilification.saneness(x70Var.b, ur.class);
        vilification.saneness(x70Var.c, h1.class);
        vilification.saneness(x70Var.d, jm2.class);
        vilification.saneness(x70Var.e, Long.class);
        vilification.saneness(x70Var.f, Integer.class);
        vilification.saneness(x70Var.g, formularize.class);
        vilification.saneness(x70Var.h, yf2.class);
        vilification.saneness(x70Var.i, String.class);
        vilification.saneness(x70Var.j, xb2.class);
        vilification.saneness(x70Var.k, j71.class);
        vilification.saneness(x70Var.l, Boolean.class);
        vilification.saneness(x70Var.m, gy0.class);
        vilification.saneness(x70Var.n, d6.class);
        vilification.saneness(x70Var.o, Integer.class);
        vilification.saneness(x70Var.p, com.google.android.libraries.ads.mobile.sdk.nativead.dern.class);
        vilification.saneness(x70Var.q, Boolean.class);
        vilification.saneness(x70Var.r, rockless.class);
        vilification.saneness(x70Var.s, excrescency.class);
        return (bostonian) new y70(x70Var.a, x70Var.b, x70Var.c, x70Var.d, x70Var.e, x70Var.f, x70Var.g, x70Var.h, x70Var.j, x70Var.k, x70Var.o, x70Var.p).K.get();
    }
}
