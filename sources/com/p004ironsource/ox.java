package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J \u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0006H&R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/ox;", "", "Lcom/ironsource/z;", "winnerInstance", "", "orderedInstances", "", "b", "instanceToShow", "a", m5.f25675p, "", "placementName", "Lcom/ironsource/xk;", "publisherDataHolder", "c", "Lcom/ironsource/m1;", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/zp;", "Lcom/ironsource/zp;", "outcomeReporter", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/zp;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class ox {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zp outcomeReporter;

    /* JADX INFO: renamed from: com.ironsource.ox$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/ironsource/ox$a;", "", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/zp;", "outcomeReporter", "Lcom/ironsource/jx;", "waterfallInstances", "Lcom/ironsource/f0;", "adInstanceLoadStrategy", "Lcom/ironsource/ox;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final ox a(u2 adTools, u1 adUnitData, zp outcomeReporter, jx waterfallInstances, AbstractC3355f0 adInstanceLoadStrategy) {
            Intrinsics.f(adTools, "adTools");
            Intrinsics.f(adUnitData, "adUnitData");
            Intrinsics.f(outcomeReporter, "outcomeReporter");
            Intrinsics.f(waterfallInstances, "waterfallInstances");
            Intrinsics.f(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.getCom.ironsource.mediationsdk.d.z java.lang.String() ? new su(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new na(adTools, outcomeReporter, waterfallInstances);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ox(m1 adTools, zp outcomeReporter) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(outcomeReporter, "outcomeReporter");
        this.adTools = adTools;
        this.outcomeReporter = outcomeReporter;
    }

    private final void b(AbstractC3389z winnerInstance, List<? extends AbstractC3389z> orderedInstances) {
        for (AbstractC3389z abstractC3389z : orderedInstances) {
            if (abstractC3389z == winnerInstance) {
                winnerInstance.a(true);
                return;
            }
            abstractC3389z.a(false);
            IronLog.INTERNAL.verbose(m1.a(this.adTools, abstractC3389z.getInstanceSignature() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(AbstractC3389z instance);

    public final void a(AbstractC3389z instance, String placementName, xk publisherDataHolder) {
        Intrinsics.f(instance, "instance");
        Intrinsics.f(publisherDataHolder, "publisherDataHolder");
        this.outcomeReporter.a(instance, placementName, publisherDataHolder);
    }

    public abstract void b(AbstractC3389z instance);

    public abstract void c(AbstractC3389z instanceToShow);

    public final void a(AbstractC3389z instanceToShow, List<? extends AbstractC3389z> orderedInstances) {
        Intrinsics.f(instanceToShow, "instanceToShow");
        Intrinsics.f(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }
}
