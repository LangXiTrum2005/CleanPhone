package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3151pd extends AbstractC3361y implements InterfaceC3204rh, InterfaceC2830cj, I, InterfaceC2913g {
    public final Fc b;
    public final C3336x c;
    public final AbstractC3213s1 d;
    public final Ac e;
    public final C2799be f;
    public final C3336x g;
    public final Fc h;
    public final Hc i;
    public final Ac j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3151pd(C2799be nativePubData, C3336x adComponent, Fc adUnit, AbstractC3213s1 adUnitTimeout, Hc nativeCallback, Ac stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(nativePubData, "nativePubData");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adUnit;
        this.c = adComponent;
        this.d = adUnitTimeout;
        this.e = stateMachine;
        this.f = nativePubData;
        this.g = adComponent;
        this.h = adUnit;
        this.i = nativeCallback;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        InterfaceC3072m9 interfaceC3072m9L2 = l();
        if (interfaceC3072m9L2 != null) {
            ((C3097n9) interfaceC3072m9L2).a("AUM-LoadedState", "Initialize Called");
        }
        this.d.e();
        C2811c0 c2811c0 = this.a.a.d;
        c2811c0.getClass();
        c2811c0.g = SystemClock.elapsedRealtime();
        P4.a(k(), new C3126od(this, null));
    }

    @Override // com.inmobi.media.I
    public final void g() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-LoadedState", "onAdDisplayed");
        }
        InterfaceC3072m9 interfaceC3072m9L2 = l();
        if (interfaceC3072m9L2 != null) {
            ((C3097n9) interfaceC3072m9L2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.j.a(new C3226se(this.h, this.g, this.i, this.j), this);
    }

    @Override // com.inmobi.media.InterfaceC2913g
    public final void j() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-LoadedState", "onDestroy");
        }
        this.e.a(new C3192r5(this.b, this.d, this.c), this);
    }

    @Override // com.inmobi.media.InterfaceC3204rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Fc fc = this.h;
        fc.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        fc.b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }
}
