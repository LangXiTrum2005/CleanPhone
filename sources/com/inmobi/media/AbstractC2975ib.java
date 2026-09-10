package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2975ib extends AbstractC2862e0 implements InterfaceC2830cj, InterfaceC2872ea, InterfaceC2913g {
    public final byte[] h;
    public final C3114o1 i;
    public final AbstractC3213s1 j;
    public final Hc k;
    public final Ac l;
    public final X m;
    public final saran n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2975ib(byte[] bArr, C3114o1 adManagerComponent, AbstractC3213s1 adUnitTimeout, Hc publisherCallbacks, Ac stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.h = bArr;
        this.i = adManagerComponent;
        this.j = adUnitTimeout;
        this.k = publisherCallbacks;
        this.l = stateMachine;
        this.m = new X(this.f, this.g);
        this.n = P4.a(this.b);
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        C3097n9 c3097n9 = this.e;
        if (c3097n9 != null) {
            c3097n9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.h;
        if (bArr != null && bArr.length != 0) {
            C2758a c2758a = new C2758a(bArr, this.d.a, this.e);
            this.j.d();
            cutely.wireman(this.n, null, null, new C2950hb(c2758a, this, null), 3, null);
        } else {
            C3097n9 c3097n10 = this.e;
            if (c3097n10 != null) {
                c3097n10.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
        F3.a(this.n);
    }

    @Override // com.inmobi.media.InterfaceC2872ea
    public final void e() {
        a(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC2913g
    public final void j() {
        C3097n9 c3097n9 = this.e;
        if (c3097n9 != null) {
            c3097n9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.l.a(new C3192r5(null, this.j, this.i), this);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3097n9 c3097n9 = this.e;
        if (c3097n9 != null) {
            c3097n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.l.a(new M6(map, inMobiAdRequestStatus, this.j, this.i, this.k, this.l), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3097n9 c3097n9 = this.e;
        if (c3097n9 != null) {
            c3097n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.l.a(new C2848db((short) 2143, inMobiAdRequestStatus, this.i, this.k, this.l), this);
    }
}
