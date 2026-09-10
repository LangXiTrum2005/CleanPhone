package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0659xa extends AbstractC0451m implements O2, InterfaceC0695za {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0506p0 f31054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J2 f31055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<InterfaceC0687z2> f31056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LevelPlayAdInfo f31057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0677ya f31058f;

    public C0659xa(InterfaceC0687z2 listener, C0506p0 adTools, J2 bannerAdProperties, W2 bannerViewContainer) {
        kotlin.jvm.internal.n.f(listener, "listener");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.n.f(bannerViewContainer, "bannerViewContainer");
        this.f31054b = adTools;
        this.f31055c = bannerAdProperties;
        this.f31056d = new WeakReference<>(listener);
        this.f31057e = n();
        this.f31058f = Ua.f27313a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, m(), (64 & 64) != 0 ? new InterfaceC0510p4.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L2 a(C0659xa this$0, boolean z10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        return this$0.a(this$0.f31054b, this$0.f31055c, z10);
    }

    private final N2 m() {
        return new a4.a(this, 18);
    }

    private final LevelPlayAdInfo n() {
        String string = this.f31055c.b().toString();
        kotlin.jvm.internal.n.e(string, "bannerAdProperties.adId.toString()");
        String strC = this.f31055c.c();
        String string2 = this.f31055c.a().toString();
        kotlin.jvm.internal.n.e(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    public final void c() {
        this.f31058f.c();
    }

    public final void d() {
        this.f31058f.d();
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f31058f.f();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ wj.r g() {
        o();
        return wj.r.f53297a;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ wj.r h() {
        q();
        return wj.r.f53297a;
    }

    @Override // com.ironsource.InterfaceC0695za
    public void i() {
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            interfaceC0687z2.a(this.f31057e);
        }
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ wj.r j() {
        p();
        return wj.r.f53297a;
    }

    @Override // com.ironsource.InterfaceC0695za
    public void k() {
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            interfaceC0687z2.c(this.f31057e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC0695za
    public void onAdClicked() {
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            interfaceC0687z2.d(this.f31057e);
        }
    }

    @Override // com.ironsource.InterfaceC0695za
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31057e = adInfo;
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            interfaceC0687z2.b(this.f31057e);
        }
    }

    @Override // com.ironsource.InterfaceC0695za
    public void onAdLeftApplication() {
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            interfaceC0687z2.e(this.f31057e);
        }
    }

    @Override // com.ironsource.InterfaceC0695za
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31057e = adInfo;
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            interfaceC0687z2.a(adInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final L2 a(C0506p0 c0506p0, J2 j10, boolean z10) {
        IronLog.INTERNAL.verbose();
        return new L2(c0506p0, M2.f26533z.a(j10, l().a(), z10), this);
    }

    public final void b() {
        this.f31058f.b();
    }

    @Override // com.ironsource.InterfaceC0695za
    public void d(IronSourceError ironSourceError) {
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f31057e;
            String string = this.f31055c.b().toString();
            kotlin.jvm.internal.n.e(string, "bannerAdProperties.adId.toString()");
            interfaceC0687z2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f31055c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC0695za
    public void b(IronSourceError ironSourceError) {
        InterfaceC0687z2 interfaceC0687z2 = this.f31056d.get();
        if (interfaceC0687z2 != null) {
            String string = this.f31055c.b().toString();
            kotlin.jvm.internal.n.e(string, "bannerAdProperties.adId.toString()");
            interfaceC0687z2.a(new LevelPlayAdError(ironSourceError, string, this.f31055c.c()));
        }
    }
}
