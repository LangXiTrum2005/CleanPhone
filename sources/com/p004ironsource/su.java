package com.p004ironsource;

import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ironsource/su;", "Lcom/ironsource/ox;", "Lcom/ironsource/z;", "instanceToShow", "", "c", m5.f25675p, "b", "a", "Lcom/ironsource/zp;", "d", "Lcom/ironsource/zp;", "outcomeReporter", "Lcom/ironsource/jx;", "e", "Lcom/ironsource/jx;", "waterfallInstances", "Lcom/ironsource/f0;", f.j, "Lcom/ironsource/f0;", "adInstanceLoadStrategy", "Lcom/ironsource/u2;", "adTools", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/zp;Lcom/ironsource/jx;Lcom/ironsource/f0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class su extends ox {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final zp outcomeReporter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final jx waterfallInstances;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC3355f0 adInstanceLoadStrategy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(u2 adTools, zp outcomeReporter, jx waterfallInstances, AbstractC3355f0 adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(outcomeReporter, "outcomeReporter");
        Intrinsics.f(waterfallInstances, "waterfallInstances");
        Intrinsics.f(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.outcomeReporter = outcomeReporter;
        this.waterfallInstances = waterfallInstances;
        this.adInstanceLoadStrategy = adInstanceLoadStrategy;
    }

    @Override // com.p004ironsource.ox
    public void a() {
        AbstractC3389z instanceToShow = this.adInstanceLoadStrategy.c().getInstanceToShow();
        if (instanceToShow != null) {
            this.outcomeReporter.a(this.waterfallInstances.b(), instanceToShow);
        }
    }

    @Override // com.p004ironsource.ox
    public void b(AbstractC3389z instance) {
        Intrinsics.f(instance, "instance");
    }

    @Override // com.p004ironsource.ox
    public void c(AbstractC3389z instanceToShow) {
        Intrinsics.f(instanceToShow, "instanceToShow");
        this.outcomeReporter.a(this.waterfallInstances.b(), instanceToShow);
    }

    @Override // com.p004ironsource.ox
    public void a(AbstractC3389z instance) {
        Intrinsics.f(instance, "instance");
        if (!this.adInstanceLoadStrategy.a(instance) && (!this.adInstanceLoadStrategy.a() || (instance = this.adInstanceLoadStrategy.c().getInstanceToShow()) == null)) {
            return;
        }
        this.outcomeReporter.a(this.waterfallInstances.b(), instance);
    }
}
