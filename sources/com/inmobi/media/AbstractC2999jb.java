package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2999jb extends AbstractC3361y implements InterfaceC2830cj, InterfaceC2872ea, InterfaceC2913g {
    public final C3336x b;
    public final AbstractC3213s1 c;
    public final Hc d;
    public final Ac e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2999jb(C3336x adComponent, AbstractC3213s1 adUnitTimeout, Hc publisherCallbacks, Ac stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adComponent;
        this.c = adUnitTimeout;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-LoadingState", "Initialize Called");
        }
        this.c.getClass();
        InterfaceC2830cj interfaceC2830cj = ((Cd) this).j.b.c;
        Uc uc = interfaceC2830cj instanceof Uc ? (Uc) interfaceC2830cj : null;
        if (uc != null) {
            C3097n9 c3097n9 = uc.a.a.a.c;
            if (c3097n9 != null) {
                c3097n9.a("NativeCreatedState", "Inflate Called");
            }
            uc.b.a(new Dd(uc.a, uc.b), uc);
        }
    }

    @Override // com.inmobi.media.InterfaceC2872ea
    public final void e() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), Re.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC2913g
    public final void j() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-LoadingState", "onDestroy");
        }
        this.e.a(new C3192r5(((Cd) this).j, this.c, this.b), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s));
        }
        this.e.a(new C2899fb(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }
}
