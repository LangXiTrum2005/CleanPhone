package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2899fb extends AbstractC3015k2 {
    public final Map d;
    public final InMobiAdRequestStatus e;
    public final Hc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2899fb(Map telemetryPayload, InMobiAdRequestStatus status, AbstractC3213s1 abstractC3213s1, InterfaceC3320w8 adManagerComponent, Hc publisherCallbacks, Ac stateMachine) {
        super(abstractC3213s1, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(telemetryPayload, "telemetryPayload");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = telemetryPayload;
        this.e = status;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9C = this.b.c();
        if (interfaceC3072m9C != null) {
            ((C3097n9) interfaceC3072m9C).b("AUM-LoadFailedState", "Initialize Called " + this.d + " " + this.e.getStatusCode() + " " + this.e.getMessage());
        }
        P4.a(this.b.a(), new C2873eb(this, null));
        C3063m0 c3063m0B = this.b.b();
        Map payload = this.d;
        c3063m0B.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        cutely.wireman(c3063m0B.a, null, null, new C2939h0(c3063m0B, payload, null), 3, null);
        AbstractC3213s1 abstractC3213s1 = this.a;
        if (abstractC3213s1 != null) {
            abstractC3213s1.a();
        }
        j();
    }
}
