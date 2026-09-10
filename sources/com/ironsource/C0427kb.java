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

/* JADX INFO: renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0427kb extends AbstractC0623va implements Vb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UUID f29044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0392ib f29045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sb f29046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f29047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0358gd f29048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC0463mb f29049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AdapterNativeAdData f29050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AdapterNativeAdViewBinder f29051k;

    public /* synthetic */ C0427kb(UUID uuid, C0392ib c0392ib, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? C0638w7.f30930a.a() : uuid, c0392ib);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0427kb this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Sb sb2 = this$0.f29046f;
            if (sb2 == null) {
                kotlin.jvm.internal.n.l("nativeAdController");
                throw null;
            }
            sb2.n();
            this$0.f29049i = null;
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0427kb this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C0506p0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Sb sb2 = this$0.f29046f;
            if (sb2 != null) {
                sb2.o();
            } else {
                kotlin.jvm.internal.n.l("nativeAdController");
                throw null;
            }
        }
    }

    @Override // com.ironsource.AbstractC0623va
    public boolean d() {
        this.f29046f = e();
        return true;
    }

    public final AdapterNativeAdViewBinder l() {
        return this.f29051k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.f29050j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new ji(this, 0));
    }

    @Override // com.ironsource.Vb
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String string = this.f29044d.toString();
        kotlin.jvm.internal.n.e(string, "adId.toString()");
        b(new ki(25, this, new LevelPlayAdError(ironSourceError, string, b())));
    }

    private final Sb e() {
        this.f29048h = a().c(this.f29047g);
        UUID uuid = this.f29044d;
        String strB = b();
        C0358gd c0358gd = this.f29048h;
        if (c0358gd == null) {
            kotlin.jvm.internal.n.l("placement");
            throw null;
        }
        C0285cc c0285cc = new C0285cc(uuid, strB, c0358gd);
        a(c0285cc);
        return new Sb(this, a(), c0285cc);
    }

    public final void f() {
        a(new ji(this, 1));
    }

    public final UUID g() {
        return this.f29044d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.f29050j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.f29050j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.f29050j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC0409jb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f29050j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC0409jb.a(icon.getDrawable(), icon.getUri());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0427kb(UUID adId, C0392ib nativeAd) {
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(nativeAd, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        super(new C0506p0(aVar, F0.b.MEDIATION));
        this.f29044d = adId;
        this.f29045e = nativeAd;
        this.f29047g = "";
        a().d().a(new C0469n(aVar, adId, b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0427kb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        InterfaceC0463mb interfaceC0463mb = this$0.f29049i;
        if (interfaceC0463mb != null) {
            interfaceC0463mb.b(this$0.f29045e, adInfo);
        }
    }

    public final void a(InterfaceC0463mb interfaceC0463mb) {
        a(new ki(23, this, interfaceC0463mb));
    }

    @Override // com.ironsource.Vb
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new ii(this, adInfo, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0427kb this$0, InterfaceC0463mb interfaceC0463mb) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f29049i = interfaceC0463mb;
    }

    public final void b(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        a(new ki(24, this, placementName));
    }

    @Override // com.ironsource.Vb
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Pb pb2 = new Pb();
        Sb sb2 = this.f29046f;
        if (sb2 != null) {
            sb2.a(pb2);
            this.f29050j = pb2.a();
            this.f29051k = pb2.b();
            b(new ii(this, adInfo, 0));
            return;
        }
        kotlin.jvm.internal.n.l("nativeAdController");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0427kb this$0, LevelPlayAdError levelPlayError) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(levelPlayError, "$levelPlayError");
        InterfaceC0463mb interfaceC0463mb = this$0.f29049i;
        if (interfaceC0463mb != null) {
            interfaceC0463mb.a(this$0.f29045e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0427kb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        InterfaceC0463mb interfaceC0463mb = this$0.f29049i;
        if (interfaceC0463mb != null) {
            interfaceC0463mb.c(this$0.f29045e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0427kb this$0, String placementName) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(placementName, "$placementName");
        this$0.f29047g = placementName;
    }
}
