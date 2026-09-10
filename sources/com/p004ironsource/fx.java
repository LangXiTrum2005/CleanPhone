package com.p004ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tR\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0013\u00101\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u00100¨\u00064"}, d2 = {"Lcom/ironsource/fx;", "Lcom/ironsource/e0;", "Lcom/ironsource/jx;", "waterfallInstances", "", "a", f.j, "", "e", "Lcom/ironsource/z;", "showingAdInstance", "c", "d", "Lcom/ironsource/c0;", "adInstanceFactory", "Lcom/ironsource/i0;", "adInstancePresenter", "b", m5.f25675p, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/u1;", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/mx;", "Lcom/ironsource/mx;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/hx;", "Lcom/ironsource/hx;", "waterfallFetcher", "Lcom/ironsource/f0;", "Lcom/ironsource/f0;", "adInstanceLoadStrategy", "Lcom/ironsource/ox;", "Lcom/ironsource/ox;", "waterfallReporter", "", g.f40227p, "Ljava/util/List;", "instancesReadyToShow", h.f36614b, "Lcom/ironsource/z;", i.f37957c, "Z", "isDestroyed", "()Lcom/ironsource/z;", "instanceToShow", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/u1;Lcom/ironsource/mx;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fx implements InterfaceC3352e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hx waterfallFetcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private AbstractC3355f0 adInstanceLoadStrategy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ox waterfallReporter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<AbstractC3389z> instancesReadyToShow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private AbstractC3389z showingAdInstance;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/ironsource/fx$a", "Lcom/ironsource/ix;", "Lcom/ironsource/jx;", "waterfallInstances", "", "a", "", "errorCode", "", "errorReason", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ix {
        public a() {
        }

        @Override // com.p004ironsource.ix
        public void a(int errorCode, String errorReason) {
            Intrinsics.f(errorReason, "errorReason");
            if (fx.this.isDestroyed) {
                return;
            }
            fx.this.listener.a(errorCode, errorReason);
        }

        @Override // com.p004ironsource.ix
        public void a(jx waterfallInstances) {
            Intrinsics.f(waterfallInstances, "waterfallInstances");
            if (fx.this.isDestroyed) {
                return;
            }
            fx.this.a(waterfallInstances);
        }
    }

    public fx(u2 adTools, u1 adUnitData, mx listener) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(listener, "listener");
        this.adTools = adTools;
        this.adUnitData = adUnitData;
        this.listener = listener;
        this.waterfallFetcher = hx.INSTANCE.a(adTools, adUnitData);
        this.instancesReadyToShow = new ArrayList();
    }

    private final void d(AbstractC3389z showingAdInstance) {
        this.showingAdInstance = showingAdInstance;
        this.instancesReadyToShow.remove(showingAdInstance);
    }

    private final boolean e() {
        return this.showingAdInstance != null;
    }

    private final void f() {
        AbstractC3355f0 abstractC3355f0 = this.adInstanceLoadStrategy;
        AbstractC3355f0.b bVarD = abstractC3355f0 != null ? abstractC3355f0.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.listener.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (!bVarD.f()) {
            Iterator<AbstractC3389z> it = bVarD.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            ox oxVar = this.waterfallReporter;
            if (oxVar != null) {
                oxVar.a();
            }
        }
    }

    public final void b() {
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "dispose", (String) null, 2, (Object) null));
        Iterator<T> it = this.instancesReadyToShow.iterator();
        while (it.hasNext()) {
            ((AbstractC3389z) it.next()).c();
        }
        this.instancesReadyToShow.clear();
        this.adTools.getEventSender().getTroubleshoot().a();
    }

    public final AbstractC3389z c() {
        AbstractC3355f0.c cVarC;
        AbstractC3355f0 abstractC3355f0 = this.adInstanceLoadStrategy;
        if (abstractC3355f0 == null || (cVarC = abstractC3355f0.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    private final void c(AbstractC3389z showingAdInstance) {
        d(showingAdInstance);
        b();
    }

    public final void a() {
        this.isDestroyed = true;
        AbstractC3389z abstractC3389z = this.showingAdInstance;
        if (abstractC3389z != null) {
            abstractC3389z.b();
        }
    }

    public final void b(AbstractC3389z instance) {
        Intrinsics.f(instance, "instance");
        ox oxVar = this.waterfallReporter;
        if (oxVar != null) {
            oxVar.a(instance, this.adUnitData.l(), this.adUnitData.getPublisherDataHolder());
        }
    }

    public final boolean d() {
        Iterator<AbstractC3389z> it = this.instancesReadyToShow.iterator();
        while (it.hasNext()) {
            if (it.next().y()) {
                return true;
            }
        }
        return false;
    }

    public final void a(InterfaceC3348c0 adInstanceFactory) {
        Intrinsics.f(adInstanceFactory, "adInstanceFactory");
        this.waterfallFetcher.a(adInstanceFactory, new a());
    }

    public final void a(InterfaceC3361i0 adInstancePresenter) {
        AbstractC3389z abstractC3389zC;
        Intrinsics.f(adInstancePresenter, "adInstancePresenter");
        AbstractC3355f0 abstractC3355f0 = this.adInstanceLoadStrategy;
        AbstractC3355f0.c cVarC = abstractC3355f0 != null ? abstractC3355f0.c() : null;
        if (cVarC == null || (abstractC3389zC = cVarC.c()) == null) {
            return;
        }
        c(abstractC3389zC);
        ox oxVar = this.waterfallReporter;
        if (oxVar != null) {
            oxVar.a(cVarC.c(), cVarC.d());
        }
        cVarC.c().a(adInstancePresenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(jx waterfallInstances) {
        AbstractC3355f0 abstractC3355f0A = AbstractC3355f0.INSTANCE.a(this.adUnitData, waterfallInstances);
        this.adInstanceLoadStrategy = abstractC3355f0A;
        this.waterfallReporter = ox.INSTANCE.a(this.adTools, this.adUnitData, this.waterfallFetcher.getOutcomeReporter(), waterfallInstances, abstractC3355f0A);
        f();
    }

    @Override // com.p004ironsource.InterfaceC3352e0
    public void a(IronSourceError error, AbstractC3389z instance) {
        Intrinsics.f(error, "error");
        Intrinsics.f(instance, "instance");
        if (this.isDestroyed) {
            return;
        }
        f();
    }

    @Override // com.p004ironsource.InterfaceC3352e0
    public void a(AbstractC3389z instance) {
        Intrinsics.f(instance, "instance");
        if (this.isDestroyed || e()) {
            instance.c();
            return;
        }
        ox oxVar = this.waterfallReporter;
        if (oxVar != null) {
            oxVar.a(instance);
        }
        this.instancesReadyToShow.add(instance);
        if (this.instancesReadyToShow.size() == 1) {
            ox oxVar2 = this.waterfallReporter;
            if (oxVar2 != null) {
                oxVar2.b(instance);
            }
            this.listener.b(instance);
            return;
        }
        AbstractC3355f0 abstractC3355f0 = this.adInstanceLoadStrategy;
        if (abstractC3355f0 == null || !abstractC3355f0.a(instance)) {
            return;
        }
        this.listener.a(instance);
    }
}
