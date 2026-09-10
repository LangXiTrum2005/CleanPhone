package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class K6 implements InterfaceC0637w6, C0547r6.b, C0547r6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f26397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0637w6.a f26398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0565s6 f26399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0601u6 f26400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0619v6 f26401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0547r6 f26402f;

    public K6(C0506p0 adTools, InterfaceC0637w6.a config, InterfaceC0565s6 fullscreenAdUnitFactory, InterfaceC0601u6 fullscreenAdUnitListener, InterfaceC0619v6 listener) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        kotlin.jvm.internal.n.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f26397a = adTools;
        this.f26398b = config;
        this.f26399c = fullscreenAdUnitFactory;
        this.f26400d = fullscreenAdUnitListener;
        this.f26401e = listener;
    }

    public final C0506p0 a() {
        return this.f26397a;
    }

    public final InterfaceC0637w6.a b() {
        return this.f26398b;
    }

    @Override // com.ironsource.C0547r6.b
    public void c(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26401e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC0637w6
    public void loadAd() {
        C0547r6 c0547r6A = this.f26399c.a(true, this.f26400d);
        c0547r6A.a(this);
        this.f26402f = c0547r6A;
    }

    @Override // com.ironsource.InterfaceC0637w6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        C0547r6 c0547r6 = this.f26402f;
        if (c0547r6 != null) {
            c0547r6.a(activity, this);
        }
    }

    @Override // com.ironsource.C0547r6.b
    public void b(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26401e.b(adInfo);
    }

    @Override // com.ironsource.C0547r6.b
    public void a(C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f26402f = null;
        this.f26401e.a();
    }

    @Override // com.ironsource.C0547r6.b
    public void b(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f26401e.a(ironSourceError);
    }

    @Override // com.ironsource.C0547r6.a
    public void a(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26401e.a(adInfo);
    }

    @Override // com.ironsource.C0547r6.a
    public void a(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f26401e.c(ironSourceError);
    }
}
