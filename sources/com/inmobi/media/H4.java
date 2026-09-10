package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class H4 extends AbstractC3230se {
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3333z5 f22858e;
    public final WeakReference f;
    public K g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4(S0 adUnit, long j, InterfaceC3333z5 interfaceC3333z5) {
        super(adUnit, (byte) 2);
        Intrinsics.f(adUnit, "adUnit");
        this.d = j;
        this.f22858e = interfaceC3333z5;
        this.f = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.AbstractC3230se
    public final void a(Object obj) {
        byte[] bArr = (byte[]) obj;
        S0 s0 = (S0) this.f.get();
        if (s0 == null) {
            return;
        }
        if (this.g != null) {
            InterfaceC3333z5 interfaceC3333z5 = this.f22858e;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).d("GetSignalsWorker", "AdUnit " + s0 + " state - FAILED");
            }
            s0.d((byte) 3);
        }
        F0 f0R = s0.r();
        if (f0R == null) {
            return;
        }
        K k = this.g;
        if (k != null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f22858e;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("GetSignalsWorker", "get signals failed", k);
            }
            s0.a(k.f22912b, this.d);
            f0R.b(new InMobiAdRequestStatus(k.f22911a.getStatusCode()));
            return;
        }
        if (bArr != null) {
            s0.b(this.d);
            f0R.a(bArr);
            InterfaceC3333z5 interfaceC3333z7 = this.f22858e;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("GetSignalsWorker", "callback - onRequestCreated");
                return;
            }
            return;
        }
        s0.d((byte) 3);
        InterfaceC3333z5 interfaceC3333z8 = this.f22858e;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).d("GetSignalsWorker", "AdUnit " + this + " state - FAILED");
        }
        InterfaceC3333z5 interfaceC3333z9 = this.f22858e;
        if (interfaceC3333z9 != null) {
            ((A5) interfaceC3333z9).b("GetSignalsWorker", "no request created - fail");
        }
        s0.a(13, this.d);
        f0R.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        super.c();
        S0 s0 = (S0) this.f.get();
        if (s0 == null) {
            return;
        }
        F0 f0R = s0.r();
        InterfaceC3333z5 interfaceC3333z5 = this.f22858e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("GetSignalsWorker", "onOOM");
        }
        if (f0R != null) {
            f0R.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        S0 s0 = (S0) this.f.get();
        if ((s0 != null ? s0.H() : null) == null) {
            InterfaceC3333z5 interfaceC3333z5 = this.f22858e;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("GetSignalsWorker", "OAManager is null");
            }
            b(null);
            return;
        }
        if (s0.r() == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f22858e;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("GetSignalsWorker", "listener is null");
            }
            b(null);
            return;
        }
        try {
            C2969ca c2969caH = s0.H();
            b(c2969caH != null ? new C2986da(c2969caH.f23493a).a() : null);
        } catch (K e2) {
            this.g = e2;
            b(null);
        }
    }
}
