package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3549hb extends AbstractC3741sa implements Qb {
    private final UUID d;
    private final C3513fb e;
    private Nb f;
    private String g;
    private C3461cd h;
    private InterfaceC3584jb i;
    private AdapterNativeAdData j;
    private AdapterNativeAdViewBinder k;

    public /* synthetic */ C3549hb(UUID uuid, C3513fb c3513fb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C3772u7.a.a() : uuid, c3513fb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3549hb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Nb nb = this$0.f;
            if (nb == null) {
                Intrinsics.preprohormone("nativeAdController");
                nb = null;
            }
            nb.n();
            this$0.i = null;
        } catch (Throwable th) {
            C3631m4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3549hb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Nb nb = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C3681p0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Nb nb2 = this$0.f;
            if (nb2 == null) {
                Intrinsics.preprohormone("nativeAdController");
            } else {
                nb = nb2;
            }
            nb.o();
        }
    }

    private final Nb e() {
        this.h = a().c(this.g);
        UUID uuid = this.d;
        String strB = b();
        C3461cd c3461cd = this.h;
        if (c3461cd == null) {
            Intrinsics.preprohormone("placement");
            c3461cd = null;
        }
        Xb xb = new Xb(uuid, strB, c3461cd);
        a(xb);
        return new Nb(this, a(), xb);
    }

    @Override // com.ironsource.AbstractC3741sa
    public boolean d() {
        this.f = e();
        return true;
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.sakeen
            @Override // java.lang.Runnable
            public final void run() {
                C3549hb.a(this.f23403kowloon);
            }
        });
    }

    public final UUID g() {
        return this.d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC3531gb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC3531gb.a(icon.getDrawable(), icon.getUri());
    }

    public final AdapterNativeAdViewBinder l() {
        return this.k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.homozygous
            @Override // java.lang.Runnable
            public final void run() {
                C3549hb.b(this.f23256kowloon);
            }
        });
    }

    @Override // com.ironsource.Qb
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String string = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, string, b());
        b(new Runnable() { // from class: com.ironsource.immediately
            @Override // java.lang.Runnable
            public final void run() {
                C3549hb.a(this.f23268kowloon, levelPlayAdError);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3549hb(UUID adId, C3513fb nativeAd) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        super(new C3681p0(aVar, F0.b.MEDIATION));
        this.d = adId;
        this.e = nativeAd;
        this.g = "";
        a().e().a(new C3644n(aVar, adId, b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3549hb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC3584jb interfaceC3584jb = this$0.i;
        if (interfaceC3584jb != null) {
            interfaceC3584jb.b(this$0.e, adInfo);
        }
    }

    public final void a(final InterfaceC3584jb interfaceC3584jb) {
        a(new Runnable() { // from class: com.ironsource.molet
            @Override // java.lang.Runnable
            public final void run() {
                C3549hb.a(this.f23348kowloon, interfaceC3584jb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3549hb this$0, InterfaceC3584jb interfaceC3584jb) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i = interfaceC3584jb;
    }

    @Override // com.ironsource.Qb
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.deadwork
            @Override // java.lang.Runnable
            public final void run() {
                C3549hb.a(this.f23215kowloon, adInfo);
            }
        });
    }

    @Override // com.ironsource.Qb
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Kb kb = new Kb();
        Nb nb = this.f;
        if (nb == null) {
            Intrinsics.preprohormone("nativeAdController");
            nb = null;
        }
        nb.a(kb);
        this.j = kb.a();
        this.k = kb.b();
        b(new Runnable() { // from class: com.ironsource.lampshade
            @Override // java.lang.Runnable
            public final void run() {
                C3549hb.b(this.f23285kowloon, adInfo);
            }
        });
    }

    public final void b(final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.libyan
            @Override // java.lang.Runnable
            public final void run() {
                C3549hb.a(this.f23293kowloon, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3549hb this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC3584jb interfaceC3584jb = this$0.i;
        if (interfaceC3584jb != null) {
            interfaceC3584jb.a(this$0.e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3549hb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC3584jb interfaceC3584jb = this$0.i;
        if (interfaceC3584jb != null) {
            interfaceC3584jb.c(this$0.e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3549hb this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.g = placementName;
    }
}
