package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class D6 implements InterfaceC0637w6, C0547r6.b, C0547r6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f25940f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f25941g = "Fullscreen ProgressiveOnShown Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f25942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0565s6 f25943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0601u6 f25944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0619v6 f25945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private J6 f25946e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public D6(C0506p0 adTools, InterfaceC0565s6 factory, InterfaceC0601u6 fullscreenAdUnitListener, InterfaceC0619v6 listener) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(factory, "factory");
        kotlin.jvm.internal.n.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f25942a = adTools;
        this.f25943b = factory;
        this.f25944c = fullscreenAdUnitListener;
        this.f25945d = listener;
        this.f25946e = new E6(this, null, false, 4, null);
    }

    public final C0506p0 a() {
        return this.f25942a;
    }

    public final InterfaceC0565s6 b() {
        return this.f25943b;
    }

    public final InterfaceC0601u6 c() {
        return this.f25944c;
    }

    public final InterfaceC0619v6 d() {
        return this.f25945d;
    }

    @Override // com.ironsource.InterfaceC0637w6
    public void loadAd() {
        this.f25946e.loadAd();
    }

    @Override // com.ironsource.InterfaceC0637w6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f25946e.a(activity);
    }

    @Override // com.ironsource.C0547r6.b
    public void b(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25946e.c(adInfo);
    }

    @Override // com.ironsource.C0547r6.b
    public void c(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25946e.b(adInfo);
    }

    public final void a(J6 state) {
        kotlin.jvm.internal.n.f(state, "state");
        this.f25946e = state;
    }

    @Override // com.ironsource.C0547r6.b
    public void b(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f25946e.a(ironSourceError);
    }

    public final void a(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        this.f25942a.d().h().f("Fullscreen ProgressiveOnShown Strategy - ".concat(message));
    }

    @Override // com.ironsource.C0547r6.a
    public void a(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25946e.a(adInfo);
    }

    @Override // com.ironsource.C0547r6.a
    public void a(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f25946e.c(ironSourceError);
    }

    @Override // com.ironsource.C0547r6.b
    public void a(C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f25946e.a();
    }
}
