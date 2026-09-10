package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Sb extends AbstractC0451m implements InterfaceC0357gc, M0, InterfaceC0685z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vb f27183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0506p0 f27184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0285cc f27185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0321ec f27186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LevelPlayAdInfo f27187f;

    public Sb(Vb listener, C0506p0 adTools, C0285cc nativeAdProperties) {
        kotlin.jvm.internal.n.f(listener, "listener");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(nativeAdProperties, "nativeAdProperties");
        this.f27183b = listener;
        this.f27184c = adTools;
        this.f27185d = nativeAdProperties;
        this.f27187f = m();
    }

    private final LevelPlayAdInfo m() {
        String string = this.f27185d.b().toString();
        kotlin.jvm.internal.n.e(string, "nativeAdProperties.adId.toString()");
        String strC = this.f27185d.c();
        String string2 = this.f27185d.a().toString();
        kotlin.jvm.internal.n.e(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    public final void a(Pb nativeAdBinder) {
        kotlin.jvm.internal.n.f(nativeAdBinder, "nativeAdBinder");
        C0321ec c0321ec = this.f27186e;
        if (c0321ec != null) {
            c0321ec.a(new Xb(nativeAdBinder), this);
        } else {
            kotlin.jvm.internal.n.l("nativeAdUnit");
            throw null;
        }
    }

    @Override // com.ironsource.InterfaceC0685z0
    public void c(IronSourceError ironSourceError) {
        throw new cn.c0("An operation is not implemented: Not yet implemented", 4);
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f27183b.b(this.f27187f);
    }

    public final void n() {
        this.f27187f = m();
        C0321ec c0321ec = this.f27186e;
        if (c0321ec != null) {
            c0321ec.a(true);
        } else {
            kotlin.jvm.internal.n.l("nativeAdUnit");
            throw null;
        }
    }

    public final void o() {
        C0321ec c0321ecA = a(this.f27184c, this.f27185d);
        this.f27186e = c0321ecA;
        if (c0321ecA != null) {
            c0321ecA.a((M0) this);
        } else {
            kotlin.jvm.internal.n.l("nativeAdUnit");
            throw null;
        }
    }

    private final C0321ec a(C0506p0 c0506p0, C0285cc c0285cc) {
        IronLog.INTERNAL.verbose();
        return new C0321ec(c0506p0, C0339fc.f28669y.a(c0285cc, l().a()), this);
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f27187f = levelPlayAdInfoC;
            this.f27183b.a(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.InterfaceC0685z0
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        throw new cn.c0("An operation is not implemented: Not yet implemented", 4);
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f27183b.onNativeAdLoadFailed(ironSourceError);
    }
}
