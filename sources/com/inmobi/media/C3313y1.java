package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3313y1 extends AbstractC3230se {
    public final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3333z5 f24113e;
    public final WeakReference f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3313y1(S0 adUnit, JSONObject response, InterfaceC3333z5 interfaceC3333z5) {
        super(adUnit, (byte) 4);
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(response, "response");
        this.d = response;
        this.f24113e = interfaceC3333z5;
        this.f = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.AbstractC3230se
    public final void a(Object obj) {
        F0 f0R;
        InMobiAdRequestStatus inMobiAdRequestStatus = (InMobiAdRequestStatus) obj;
        S0 s0 = (S0) this.f.get();
        if (s0 == null || (f0R = s0.r()) == null) {
            return;
        }
        if (inMobiAdRequestStatus != null) {
            s0.b(inMobiAdRequestStatus, true, (short) 2182);
            return;
        }
        s0.d((byte) 2);
        InterfaceC3333z5 interfaceC3333z5 = this.f24113e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).d("AuctionCloseWorker", "AdUnit " + s0 + " state - AVAILABLE");
        }
        s0.e(f0R);
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        super.c();
        S0 s0 = (S0) this.f.get();
        if (s0 == null) {
            return;
        }
        s0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (short) 2181);
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        C3312y0 c3312y0Y;
        S0 s0 = (S0) this.f.get();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if ((s0 != null ? s0.y() : null) == null) {
            b(inMobiAdRequestStatus);
            return;
        }
        try {
            AdConfig adConfigJ = s0.j();
            if (adConfigJ != null && (c3312y0Y = s0.y()) != null) {
                c3312y0Y.a(this.d, adConfigJ, this.f24113e);
            }
            b(null);
        } catch (Exception unused) {
            S0.e();
            b(inMobiAdRequestStatus);
        }
    }
}
