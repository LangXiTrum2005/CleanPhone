package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Jc implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private E2 f26352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<G2> f26353b = new WeakReference<>(null);

    public final void a(E2 loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        this.f26352a = loadListener;
    }

    @Override // com.ironsource.Ic
    public void onBannerClick() {
        G2 g10 = this.f26353b.get();
        if (g10 != null) {
            g10.onBannerClick();
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        E2 e10 = this.f26352a;
        if (e10 != null) {
            e10.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadSuccess(K9 adInstance, C0353g8 adContainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adContainer, "adContainer");
        E2 e10 = this.f26352a;
        if (e10 != null) {
            e10.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerShowSuccess() {
        G2 g10 = this.f26353b.get();
        if (g10 != null) {
            g10.onBannerShowSuccess();
        }
    }

    public final void a(G2 showListener) {
        kotlin.jvm.internal.n.f(showListener, "showListener");
        this.f26353b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.Ic
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Ic
    public void onBannerInitFailed(String str) {
    }
}
