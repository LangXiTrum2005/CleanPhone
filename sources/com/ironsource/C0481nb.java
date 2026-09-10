package com.ironsource;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.nb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0481nb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29839d = "do_not_sell";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C0481nb f29841f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0624vb f29842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.c f29843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29838c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<String> f29840e = xj.o.Q("admob_tfcd", "admob_tfua", "BidMachine_COPPA", "chartboost_coppa", "DT_COPPA", com.ironsource.mediationsdk.metadata.a.f29605b, "LevelPlay_ChildDirected", "meta_mixed_audience", "Mintegral_COPPA", "Moloco_COPPA", "Pangle_COPPA", "UnityAds_COPPA", "Vungle_COPPA", "Yandex_COPPA");

    /* JADX INFO: renamed from: com.ironsource.nb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final List<String> a() {
            return C0481nb.f29840e;
        }

        public final C0481nb b() {
            return C0481nb.f29841f;
        }

        private a() {
        }

        public final void a(C0481nb testInstance) {
            kotlin.jvm.internal.n.f(testInstance, "testInstance");
            C0481nb.f29841f = testInstance;
        }
    }

    static {
        C0624vb c0624vb = new C0624vb();
        com.ironsource.mediationsdk.c cVarB = com.ironsource.mediationsdk.c.b();
        kotlin.jvm.internal.n.e(cVarB, "getInstance()");
        f29841f = new C0481nb(c0624vb, cVarB);
    }

    public C0481nb(C0624vb tools, com.ironsource.mediationsdk.c adapterRepository) {
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adapterRepository, "adapterRepository");
        this.f29842a = tools;
        this.f29843b = adapterRepository;
    }

    public final void b(boolean z10) {
        this.f29842a.c(new li(this, z10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0481nb this$0, boolean z10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f29842a.b(z10);
        Iterator<String> it = f29840e.iterator();
        while (it.hasNext()) {
            this$0.f29843b.c(it.next(), j1.f.C(String.valueOf(z10)));
        }
    }

    public final void a(Map<String, Boolean> networkConsents) {
        kotlin.jvm.internal.n.f(networkConsents, "networkConsents");
        this.f29842a.c(new ki(27, this, networkConsents));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0481nb this$0, Map networkConsents) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(networkConsents, "$networkConsents");
        this$0.f29842a.a((Map<String, Boolean>) networkConsents);
        this$0.f29843b.a((Map<String, Boolean>) networkConsents);
    }

    public final void a(boolean z10) {
        this.f29842a.c(new li(this, z10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0481nb this$0, boolean z10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f29842a.a(z10);
        this$0.f29843b.c("do_not_sell", j1.f.C(String.valueOf(z10)));
    }
}
