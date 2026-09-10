package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.bostonian;
import saneness.citrinin;
import saneness.coffeecake;
import saneness.dent;
import saneness.dialectally;
import saneness.excrescency;
import saneness.jestful;
import saneness.mountie;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class zi1 implements dent {
    public final ij a;
    public final dr1 b;
    public final adultoid c;
    public final l13 d;
    public final formularize e;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern f;
    public final long g;
    public final int h;
    public final String i;
    public final yf2 j;
    public final int k;
    public final boolean l;
    public final gy0 m;
    public final boolean n;
    public final rockless o;
    public final excrescency p;
    public final d6 q;

    public zi1(ij bannerRendererProvider, dr1 nativeRendererProvider, coffeecake multiFormatAdRenderComponentProvider, l13 traceMetaSet, formularize baseRequest, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, long j, int i, String requestId, yf2 requestType, int i2, boolean z, gy0 inspectorAdLifecycleMonitor, boolean z2, rockless refreshUpdateListener, excrescency recursiveAdLoader, d6 adSourceResponseInfoCollector) {
        Intrinsics.checkNotNullParameter(bannerRendererProvider, "bannerRendererProvider");
        Intrinsics.checkNotNullParameter(nativeRendererProvider, "nativeRendererProvider");
        Intrinsics.checkNotNullParameter(multiFormatAdRenderComponentProvider, "multiFormatAdRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(refreshUpdateListener, "refreshUpdateListener");
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        this.a = bannerRendererProvider;
        this.b = nativeRendererProvider;
        this.c = multiFormatAdRenderComponentProvider;
        this.d = traceMetaSet;
        this.e = baseRequest;
        this.f = nativeRequest;
        this.g = j;
        this.h = i;
        this.i = requestId;
        this.j = requestType;
        this.k = i2;
        this.l = z;
        this.m = inspectorAdLifecycleMonitor;
        this.n = z2;
        this.o = refreshUpdateListener;
        this.p = recursiveAdLoader;
        this.q = adSourceResponseInfoCollector;
    }

    @Override // saneness.dent
    public final bostonian a(jm2 serverTransaction, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        dialectally dialectallyVar = (dialectally) this.c.get();
        formularize formularizeVar = this.e;
        r70 r70Var = (r70) dialectallyVar;
        r70Var.getClass();
        formularizeVar.getClass();
        r70Var.g = formularizeVar;
        com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar = this.f;
        dernVar.getClass();
        r70Var.p = dernVar;
        adConfiguration.getClass();
        r70Var.c = adConfiguration;
        ur urVar = serverTransaction.b.b;
        urVar.getClass();
        r70Var.b = urVar;
        r70Var.d = serverTransaction;
        yf2 yf2Var = this.j;
        yf2Var.getClass();
        r70Var.h = yf2Var;
        xb2 xb2Var = this.d.a;
        xb2Var.getClass();
        r70Var.j = xb2Var;
        j71 j71Var = this.d.b;
        j71Var.getClass();
        r70Var.k = j71Var;
        String str = this.i;
        str.getClass();
        r70Var.i = str;
        r70Var.e = Long.valueOf(this.g);
        r70Var.f = Integer.valueOf(this.h);
        r70Var.o = Integer.valueOf(this.k);
        r70Var.l = Boolean.valueOf(this.l);
        gy0 gy0Var = this.m;
        gy0Var.getClass();
        r70Var.m = gy0Var;
        r70Var.q = Boolean.valueOf(this.n);
        rockless rocklessVar = this.o;
        rocklessVar.getClass();
        r70Var.r = rocklessVar;
        excrescency excrescencyVar = this.p;
        excrescencyVar.getClass();
        r70Var.s = excrescencyVar;
        d6 d6Var = this.q;
        d6Var.getClass();
        r70Var.n = d6Var;
        vilification.saneness(r70Var.b, ur.class);
        vilification.saneness(r70Var.c, h1.class);
        vilification.saneness(r70Var.d, jm2.class);
        vilification.saneness(r70Var.e, Long.class);
        vilification.saneness(r70Var.f, Integer.class);
        vilification.saneness(r70Var.g, formularize.class);
        vilification.saneness(r70Var.h, yf2.class);
        vilification.saneness(r70Var.i, String.class);
        vilification.saneness(r70Var.j, xb2.class);
        vilification.saneness(r70Var.k, j71.class);
        vilification.saneness(r70Var.l, Boolean.class);
        vilification.saneness(r70Var.m, gy0.class);
        vilification.saneness(r70Var.n, d6.class);
        vilification.saneness(r70Var.o, Integer.class);
        vilification.saneness(r70Var.p, com.google.android.libraries.ads.mobile.sdk.nativead.dern.class);
        vilification.saneness(r70Var.q, Boolean.class);
        vilification.saneness(r70Var.r, rockless.class);
        vilification.saneness(r70Var.s, excrescency.class);
        bostonian bostonianVar = (bostonian) new s70(r70Var.a, r70Var.b, r70Var.c, r70Var.d, r70Var.e, r70Var.f, r70Var.g, r70Var.h, r70Var.j, r70Var.k, r70Var.l, r70Var.m, r70Var.n, r70Var.o, r70Var.p, r70Var.q, r70Var.r, r70Var.s).u.get();
        int iOrdinal = adConfiguration.l.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 3 ? new mountie() : new citrinin(bostonianVar, this.b.a(serverTransaction, adConfiguration), xi1.a);
        }
        return new jestful(bostonianVar, this.a.a(serverTransaction, adConfiguration), vi1.a);
    }
}
