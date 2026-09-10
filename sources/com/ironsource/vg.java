package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Vg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27498c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f27499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vc f27500b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Vg a(V0 adTools, AbstractC0649x0 adUnitData, Vc outcomeReporter, Pg waterfallInstances, H adInstanceLoadStrategy) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
            kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
            kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
            kotlin.jvm.internal.n.f(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new C0682yf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new J4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public Vg(C0506p0 adTools, Vc outcomeReporter) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
        this.f27499a = adTools;
        this.f27500b = outcomeReporter;
    }

    private final void b(B b10, List<? extends B> list) {
        for (B b11 : list) {
            if (b11 == b10) {
                b10.a(true);
                return;
            } else {
                b11.a(false);
                IronLog.INTERNAL.verbose(C0506p0.a(this.f27499a, wi.d.h(b11.q(), " - not ready to show"), (String) null, 2, (Object) null));
            }
        }
    }

    public abstract void a();

    public abstract void a(B b10);

    public final void a(B instanceToShow, List<? extends B> orderedInstances) {
        kotlin.jvm.internal.n.f(instanceToShow, "instanceToShow");
        kotlin.jvm.internal.n.f(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(B b10);

    public abstract void c(B b10);

    public final void a(B instance, String str, C0462ma publisherDataHolder) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        this.f27500b.a(instance, str, publisherDataHolder);
    }
}
