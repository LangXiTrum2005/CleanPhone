package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3351xe implements InterfaceC2830cj, InterfaceC3204rh, I, InterfaceC2913g {
    public final Fc a;
    public final C3336x b;
    public final PublisherCallbacks c;
    public final AbstractC2907fj d;

    public C3351xe(Fc adUnit, C3336x adComponent, PublisherCallbacks publisherCallbacks, AbstractC2907fj stateMachine) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.a = adUnit;
        this.b = adComponent;
        this.c = publisherCallbacks;
        this.d = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        C3097n9 c3097n9 = this.b.a.c;
        if (c3097n9 != null) {
            c3097n9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.a.b.d();
    }

    @Override // com.inmobi.media.I
    public final void g() {
        C3097n9 c3097n9 = this.b.a.c;
        if (c3097n9 != null) {
            c3097n9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.d.a(new C3226se(this.a, this.b, this.c, this.d), this);
    }

    @Override // com.inmobi.media.InterfaceC2913g
    public final void j() {
        this.d.a(new C3192r5(this.a, null, this.b), this);
    }

    @Override // com.inmobi.media.InterfaceC3204rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        C3097n9 c3097n9 = this.b.a.c;
        if (c3097n9 != null) {
            c3097n9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Fc fc = this.a;
        fc.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        fc.b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }
}
