package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/l4;", "Lcom/ironsource/jf;", "Lcom/ironsource/j4;", "settings", "", "a", "Lcom/ironsource/uk;", "observer", "b", "Lcom/ironsource/cg;", "Lcom/ironsource/cg;", "featureAvailabilityService", "Lcom/ironsource/m4;", "Lcom/ironsource/m4;", "handler", "<init>", "(Lcom/ironsource/cg;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class l4 implements jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cg featureAvailabilityService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private m4 handler;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/l4$a;", "", "Lcom/ironsource/j4;", "settings", "Lcom/ironsource/cg;", "featureAvailabilityService", "Lcom/ironsource/m4;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public final m4 a(j4 settings, cg featureAvailabilityService) {
            Intrinsics.f(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            StringBuilder sb = new StringBuilder("isAndroidxApplicationLifecycleEnabled: ");
            sb.append(settings != null ? Boolean.valueOf(settings.getIsAndroidxApplicationLifecycleEnabled()) : null);
            ironLog.verbose(sb.toString());
            boolean z2 = false;
            if (featureAvailabilityService.a()) {
                ds.i().a(new zb(ac.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.getMediationAdditionalData(false)));
            }
            if ((settings != null ? settings.getIsAndroidxApplicationLifecycleEnabled() : false) && featureAvailabilityService.a()) {
                z2 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z2);
            return z2 ? new t3() : new rg();
        }
    }

    public l4(cg featureAvailabilityService) {
        Intrinsics.f(featureAvailabilityService, "featureAvailabilityService");
        this.featureAvailabilityService = featureAvailabilityService;
    }

    @Override // com.p004ironsource.jf
    public void a(j4 settings) {
        if (this.handler == null) {
            this.handler = new a().a(settings, this.featureAvailabilityService);
        }
    }

    @Override // com.p004ironsource.m4
    public void b(uk observer) {
        Intrinsics.f(observer, "observer");
        m4 m4Var = this.handler;
        if (m4Var != null) {
            m4Var.b(observer);
        }
    }

    @Override // com.p004ironsource.m4
    public void a(uk observer) {
        Intrinsics.f(observer, "observer");
        m4 m4Var = this.handler;
        if (m4Var != null) {
            m4Var.a(observer);
        }
    }
}
