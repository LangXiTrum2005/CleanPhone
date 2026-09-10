package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3226se extends AbstractC3205ri implements Sl, Ck {
    public final Fc f;
    public final C3336x g;
    public final PublisherCallbacks h;
    public final AbstractC2907fj i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3226se(Fc adUnit, C3336x adComponent, PublisherCallbacks publisherCallbacks, AbstractC2907fj stateMachine) {
        super(adUnit, adComponent, publisherCallbacks, stateMachine);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adUnit;
        this.g = adComponent;
        this.h = publisherCallbacks;
        this.i = stateMachine;
    }

    @Override // com.inmobi.media.Sl
    public final void a(boolean z) {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeRenderedState", "onAudioStateChanged " + z);
        }
        P4.a(k(), new C2928ge(this, z, null));
    }

    @Override // com.inmobi.media.Sl
    public final void b() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        P4.a(k(), new C3002je(this, null));
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.i.a(new C3351xe(this.f, this.g, this.h, this.i), this);
    }

    @Override // com.inmobi.media.Sl
    public final void f() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        P4.a(k(), new C3052le(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void h() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        P4.a(k(), new C2978ie(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void i() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        P4.a(k(), new C3027ke(this, null));
    }
}
