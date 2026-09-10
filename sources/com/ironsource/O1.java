package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class O1 implements InterfaceC0441l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7 f26682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P1 f26683b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public final P1 a(M1 m7, F7 featureAvailabilityService) {
            kotlin.jvm.internal.n.f(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (m7 != null ? Boolean.valueOf(m7.k()) : null));
            boolean z10 = false;
            if (featureAvailabilityService.a()) {
                C0359ge.i().a(new C0654x5(EnumC0672y5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((m7 != null ? m7.k() : false) && featureAvailabilityService.a()) {
                z10 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z10);
            return z10 ? new C0650x1() : new T7();
        }
    }

    public O1(F7 featureAvailabilityService) {
        kotlin.jvm.internal.n.f(featureAvailabilityService, "featureAvailabilityService");
        this.f26682a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC0441l7
    public void a(M1 m7) {
        if (this.f26683b == null) {
            this.f26683b = new a().a(m7, this.f26682a);
        }
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        P1 p10 = this.f26683b;
        if (p10 != null) {
            p10.b(observer);
        }
    }

    @Override // com.ironsource.P1
    public void a(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        P1 p10 = this.f26683b;
        if (p10 != null) {
            p10.a(observer);
        }
    }
}
