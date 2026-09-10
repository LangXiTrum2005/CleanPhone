package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2938h extends AbstractC2907fj implements InterfaceC3064m1, InterfaceC2872ea, InterfaceC2913g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2938h(saran coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    public final void a(byte[] bArr) {
        (bArr != null ? Integer.valueOf(bArr.length) : "null").toString();
        InterfaceC2830cj interfaceC2830cj = ((Ac) this).c;
        Y4 y4 = interfaceC2830cj instanceof Y4 ? (Y4) interfaceC2830cj : null;
        if (y4 != null) {
            y4.a(bArr);
        }
    }

    public final void c() {
        InterfaceC2830cj interfaceC2830cj = ((Ac) this).c;
        Y4 y4 = interfaceC2830cj instanceof Y4 ? (Y4) interfaceC2830cj : null;
        if (y4 == null) {
            Kb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        C3097n9 c3097n9 = y4.e;
        if (c3097n9 != null) {
            c3097n9.a("AUM-CreatedState", "fetch called");
        }
        C2811c0 c2811c0 = y4.f;
        c2811c0.getClass();
        c2811c0.a = SystemClock.elapsedRealtime();
        C3063m0 c3063m0 = y4.g;
        cutely.wireman(c3063m0.a, null, null, new C2888f0(c3063m0, null), 3, null);
        if (y4.b()) {
            C3097n9 c3097n10 = y4.e;
            if (c3097n10 != null) {
                c3097n10.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3114o1 adManagerComponent = y4.h;
        Ac stateMachine = y4.j;
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C2796bb adUnitTimeout = new C2796bb(adManagerComponent, stateMachine);
        Tc tc = (Tc) y4;
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        C3097n9 c3097n11 = tc.e;
        if (c3097n11 != null) {
            c3097n11.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        tc.m.a(new C2798bd(tc.k, adUnitTimeout, tc.m, tc.l), tc);
    }

    @Override // com.inmobi.media.InterfaceC2872ea
    public final void e() {
        InterfaceC2830cj interfaceC2830cj = ((Ac) this).c;
        InterfaceC2872ea interfaceC2872ea = interfaceC2830cj instanceof InterfaceC2872ea ? (InterfaceC2872ea) interfaceC2830cj : null;
        if (interfaceC2872ea != null) {
            interfaceC2872ea.e();
        }
    }

    public final void g() {
        InterfaceC2830cj interfaceC2830cj = ((Ac) this).c;
        AbstractC3205ri abstractC3205ri = interfaceC2830cj instanceof AbstractC3205ri ? (AbstractC3205ri) interfaceC2830cj : null;
        if (abstractC3205ri != null) {
            InterfaceC3072m9 interfaceC3072m9L = abstractC3205ri.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).a("AUM-RenderedState", "onAdImpression");
            }
            P4.a(abstractC3205ri.k(), new C3156pi(abstractC3205ri, null));
        }
    }

    @Override // com.inmobi.media.InterfaceC2913g
    public final void j() {
        InterfaceC2830cj interfaceC2830cj = ((Ac) this).c;
        InterfaceC2913g interfaceC2913g = interfaceC2830cj instanceof InterfaceC2913g ? (InterfaceC2913g) interfaceC2830cj : null;
        if (interfaceC2913g != null) {
            interfaceC2913g.j();
        }
    }

    public final void a(InMobiAdRequestStatus status, short s) {
        Intrinsics.checkNotNullParameter(status, "status");
        Objects.toString(status);
        InterfaceC2830cj interfaceC2830cj = ((Ac) this).c;
        AbstractC2999jb abstractC2999jb = interfaceC2830cj instanceof AbstractC2999jb ? (AbstractC2999jb) interfaceC2830cj : null;
        if (abstractC2999jb != null) {
            Intrinsics.checkNotNullParameter(status, "status");
            InterfaceC3072m9 interfaceC3072m9L = abstractC2999jb.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC2999jb.a(status, s);
        }
    }

    public final void a(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Objects.toString(params);
        InterfaceC2830cj interfaceC2830cj = ((Ac) this).c;
        AbstractC3205ri abstractC3205ri = interfaceC2830cj instanceof AbstractC3205ri ? (AbstractC3205ri) interfaceC2830cj : null;
        if (abstractC3205ri != null) {
            Intrinsics.checkNotNullParameter(params, "params");
            InterfaceC3072m9 interfaceC3072m9L = abstractC3205ri.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).a("AUM-RenderedState", com.ironsource.If.f);
            }
            P4.a(abstractC3205ri.k(), new C3131oi(abstractC3205ri, params, null));
        }
    }
}
