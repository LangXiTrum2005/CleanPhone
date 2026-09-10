package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.x6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0655x6 implements InterfaceC0637w6, C0547r6.b, C0547r6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31047f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f31048g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f31049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0565s6 f31050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0601u6 f31051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0619v6 f31052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C6 f31053e;

    /* JADX INFO: renamed from: com.ironsource.x6$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C0655x6(C0506p0 adTools, InterfaceC0565s6 factory, InterfaceC0601u6 fullscreenAdUnitListener, InterfaceC0619v6 listener) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(factory, "factory");
        kotlin.jvm.internal.n.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f31049a = adTools;
        this.f31050b = factory;
        this.f31051c = fullscreenAdUnitListener;
        this.f31052d = listener;
        this.f31053e = new C0673y6(this);
    }

    public final C0506p0 a() {
        return this.f31049a;
    }

    public final InterfaceC0565s6 b() {
        return this.f31050b;
    }

    public final InterfaceC0601u6 c() {
        return this.f31051c;
    }

    public final InterfaceC0619v6 d() {
        return this.f31052d;
    }

    @Override // com.ironsource.InterfaceC0637w6
    public void loadAd() {
        this.f31053e.loadAd();
    }

    public final void a(C6 state) {
        kotlin.jvm.internal.n.f(state, "state");
        this.f31053e = state;
    }

    @Override // com.ironsource.C0547r6.b
    public void b(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31053e.b(adUnit, adInfo);
    }

    @Override // com.ironsource.C0547r6.b
    public void c(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31053e.c(adUnit, adInfo);
    }

    @Override // com.ironsource.InterfaceC0637w6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f31053e.a(activity);
    }

    @Override // com.ironsource.C0547r6.b
    public void b(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f31053e.b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C0547r6.b
    public void a(C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f31053e.a(adUnit);
    }

    @Override // com.ironsource.C0547r6.a
    public void a(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31053e.a(adUnit, adInfo);
    }

    @Override // com.ironsource.C0547r6.a
    public void a(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f31053e.a(adUnit, ironSourceError);
    }

    public final void a(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        this.f31049a.d().h().f("Fullscreen ProgressiveOnLoaded Strategy - ".concat(message));
    }
}
