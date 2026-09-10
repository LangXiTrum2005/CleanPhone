package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3205ri extends AbstractC3361y implements InterfaceC2830cj, InterfaceC2913g {
    public final Fc b;
    public final C3336x c;
    public final PublisherCallbacks d;
    public final AbstractC2907fj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3205ri(Fc adUnit, C3336x adComponent, PublisherCallbacks publisherCallbacks, AbstractC2907fj stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adUnit;
        this.c = adComponent;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.InterfaceC2913g
    public final void j() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-RenderedState", "onDestroy");
        }
        this.e.a(new C3192r5(this.b, null, this.c), this);
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }
}
