package com.ironsource;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0261b6 implements Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0279c6 f28271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<InterfaceC0297d6> f28272b = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.ironsource.b6$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28273a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f28274b = "impressions";

        private a() {
        }
    }

    public final void a(InterfaceC0279c6 loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        this.f28271a = loadListener;
    }

    @Override // com.ironsource.Kc
    public void onInterstitialAdRewarded(String str, int i10) {
        InterfaceC0297d6 interfaceC0297d6 = this.f28272b.get();
        if (interfaceC0297d6 != null) {
            interfaceC0297d6.onAdInstanceDidReward(str, i10);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClick() {
        InterfaceC0297d6 interfaceC0297d6 = this.f28272b.get();
        if (interfaceC0297d6 != null) {
            interfaceC0297d6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClose() {
        InterfaceC0297d6 interfaceC0297d6 = this.f28272b.get();
        if (interfaceC0297d6 != null) {
            interfaceC0297d6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC0297d6 interfaceC0297d6;
        if (!kotlin.jvm.internal.n.a(str, "impressions") || (interfaceC0297d6 = this.f28272b.get()) == null) {
            return;
        }
        interfaceC0297d6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadFailed(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        InterfaceC0279c6 interfaceC0279c6 = this.f28271a;
        if (interfaceC0279c6 != null) {
            interfaceC0279c6.a(description);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadSuccess(K9 adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        InterfaceC0279c6 interfaceC0279c6 = this.f28271a;
        if (interfaceC0279c6 != null) {
            interfaceC0279c6.a(adInstance);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialOpen() {
        InterfaceC0297d6 interfaceC0297d6 = this.f28272b.get();
        if (interfaceC0297d6 != null) {
            interfaceC0297d6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowFailed(String str) {
        InterfaceC0297d6 interfaceC0297d6 = this.f28272b.get();
        if (interfaceC0297d6 != null) {
            interfaceC0297d6.a(str);
        }
    }

    public final void a(InterfaceC0297d6 showListener) {
        kotlin.jvm.internal.n.f(showListener, "showListener");
        this.f28272b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitFailed(String str) {
    }
}
