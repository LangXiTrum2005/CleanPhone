package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2848db extends AbstractC3015k2 {
    public final short d;
    public final InMobiAdRequestStatus e;
    public final Hc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2848db(short s, InMobiAdRequestStatus status, C3114o1 adManagerComponent, Hc publisherCallbacks, Ac stateMachine) {
        super(null, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = s;
        this.e = status;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9C = this.b.c();
        if (interfaceC3072m9C != null) {
            short s = this.d;
            ((C3097n9) interfaceC3072m9C).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s) + " " + this.e.getStatusCode() + " " + this.e.getMessage());
        }
        P4.a(this.b.a(), new C2822cb(this, null));
        C3063m0 c3063m0B = this.b.b();
        cutely.wireman(c3063m0B.a, null, null, new C2914g0(c3063m0B, this.d, null), 3, null);
        AbstractC3213s1 abstractC3213s1 = this.a;
        if (abstractC3213s1 != null) {
            abstractC3213s1.a();
        }
        j();
    }
}
