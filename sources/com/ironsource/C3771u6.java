package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3771u6 implements InterfaceC3754t6, C3669o6.b, C3669o6.a {
    public static final a f = new a(null);
    public static final String g = "Fullscreen ProgressiveOnLoaded Strategy";
    private final C3681p0 a;
    private final InterfaceC3687p6 b;
    private final InterfaceC3720r6 c;
    private final InterfaceC3737s6 d;
    private InterfaceC3856z6 e;

    /* JADX INFO: renamed from: com.ironsource.u6$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3771u6(C3681p0 adTools, InterfaceC3687p6 factory, InterfaceC3720r6 fullscreenAdUnitListener, InterfaceC3737s6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = factory;
        this.c = fullscreenAdUnitListener;
        this.d = listener;
        this.e = new C3788v6(this);
    }

    public final C3681p0 a() {
        return this.a;
    }

    public final InterfaceC3687p6 b() {
        return this.b;
    }

    public final InterfaceC3720r6 c() {
        return this.c;
    }

    public final InterfaceC3737s6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3754t6
    public void loadAd() {
        this.e.loadAd();
    }

    public final void a(InterfaceC3856z6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.e = state;
    }

    @Override // com.ironsource.C3669o6.b
    public void b(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adUnit, adInfo);
    }

    @Override // com.ironsource.C3669o6.b
    public void c(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.c(adUnit, adInfo);
    }

    @Override // com.ironsource.InterfaceC3754t6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(activity);
    }

    @Override // com.ironsource.C3669o6.b
    public void b(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C3669o6.b
    public void a(C3669o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(adUnit);
    }

    @Override // com.ironsource.C3669o6.a
    public void a(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adUnit, adInfo);
    }

    @Override // com.ironsource.C3669o6.a
    public void a(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(adUnit, ironSourceError);
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.e().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + message);
    }
}
