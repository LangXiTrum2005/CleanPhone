package com.inmobi.media;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class S7 extends AbstractC3037gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f23176a;

    public S7(T7 t7) {
        this.f23176a = t7;
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(HashMap params) {
        Intrinsics.f(params, "params");
        P0 p0 = this.f23176a.f23221w;
        if (p0 != null) {
            p0.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void c() {
        P0 p0 = this.f23176a.f23221w;
        if (p0 != null) {
            p0.c();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void d(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        P0 p0 = this.f23176a.f23221w;
        if (p0 != null) {
            p0.b();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void e(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        P0 p0 = this.f23176a.f23221w;
        if (p0 != null) {
            p0.d();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc, com.inmobi.media.Fe
    public final void a() {
        P0 p0 = this.f23176a.f23221w;
        if (p0 != null) {
            p0.g();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void d() {
        P0 p0;
        T7 t7 = this.f23176a;
        if (t7.f23211a != 0 || (p0 = t7.f23221w) == null) {
            return;
        }
        p0.e();
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(Yd telemetryOnAdImpression) {
        Intrinsics.f(telemetryOnAdImpression, "telemetryOnAdImpression");
        P0 p0 = this.f23176a.f23221w;
        if (p0 != null) {
            telemetryOnAdImpression.f23382e = "nativeBeacon";
            if (p0.f23058a.Z()) {
                telemetryOnAdImpression.b();
            } else {
                p0.f23058a.D.a(telemetryOnAdImpression);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(String log) {
        Intrinsics.f(log, "log");
        P0 p0 = this.f23176a.f23221w;
        if (p0 != null) {
            InterfaceC3333z5 interfaceC3333z5 = p0.f23058a.j;
            if (interfaceC3333z5 != null) {
                String strE = S0.e();
                Intrinsics.e(strE, "<get-TAG>(...)");
                ((A5) interfaceC3333z5).a(strE, "onImraidLog");
            }
            if (p0.f23058a.Z()) {
                return;
            }
            F0 f0 = (F0) p0.f23059b.get();
            if (f0 != null) {
                f0.a(log);
                return;
            }
            InterfaceC3333z5 interfaceC3333z6 = p0.f23058a.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).b(strE2, "listener is null");
            }
        }
    }
}
