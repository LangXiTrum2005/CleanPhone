package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.RootConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class L extends AbstractC3230se {
    public final InterfaceC3333z5 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f22934e;
    public K f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(S0 adUnit, InterfaceC3333z5 interfaceC3333z5) {
        super(adUnit, (byte) 0);
        Intrinsics.f(adUnit, "adUnit");
        this.d = interfaceC3333z5;
        this.f22934e = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.AbstractC3230se
    public final void a(Object obj) {
        C3312y0 c3312y0 = (C3312y0) obj;
        S0 s0 = (S0) this.f22934e.get();
        if (s0 == null) {
            return;
        }
        s0.b((byte) 0);
        if (this.f == null) {
            if (c3312y0 == null) {
                s0.a(s0.I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
                return;
            } else if (c3312y0.m()) {
                s0.c(c3312y0);
                return;
            } else {
                s0.d(c3312y0);
                return;
            }
        }
        Z zI = s0.I();
        K k = this.f;
        Intrinsics.c(k);
        InMobiAdRequestStatus inMobiAdRequestStatus = k.f22911a;
        K k2 = this.f;
        Intrinsics.c(k2);
        s0.a(zI, inMobiAdRequestStatus, k2.f22912b);
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        super.c();
        S0 s0 = (S0) this.f22934e.get();
        if (s0 == null) {
            return;
        }
        s0.b((byte) 0);
        s0.a(s0.I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2117);
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.d;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("AdFetcherTask", "executeTask " + this);
        }
        S0 s0 = (S0) this.f22934e.get();
        if (s0 == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.d;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("AdFetcherTask", "adUnit is null. fail");
            }
            this.f = new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 2111);
            b(null);
            return;
        }
        LinkedHashMap linkedHashMap = O2.f23027a;
        if (!((RootConfig) AbstractC3174p5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).getMonetizationDisabled()) {
            U0 u0S = s0.s();
            u0S.getClass();
            u0S.f = SystemClock.elapsedRealtime();
            try {
                InterfaceC3333z5 interfaceC3333z7 = this.d;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).a("AdFetcherTask", "getting ad from store");
                }
                b(s0.p().a(s0.h0(), s0.F()));
                return;
            } catch (K e2) {
                Intrinsics.e(S0.e(), "<get-TAG>(...)");
                this.f = e2;
                b(null);
                return;
            }
        }
        InterfaceC3333z5 interfaceC3333z8 = this.d;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).b("AdFetcherTask", "SDK will not perform this load operation as monetization has been disabled. Please contact InMobi for further info.");
        }
        this.f = new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
        b(null);
    }
}
