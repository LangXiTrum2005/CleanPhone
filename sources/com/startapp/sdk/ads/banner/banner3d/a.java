package com.startapp.sdk.ads.banner.banner3d;

import com.startapp.sdk.ads.banner.BannerBase;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f40437a;

    public a(Banner3D banner3D) {
        this.f40437a = banner3D;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    @Override // java.lang.Runnable
    public final void run() {
        Banner3D banner3D = this.f40437a;
        if (!banner3D.loaded || banner3D.faces.size() == 0) {
            return;
        }
        Banner3D banner3D2 = this.f40437a;
        if (banner3D2.visible && banner3D2.isShown() && ((BannerBase) this.f40437a).drawn) {
            Banner3D banner3D3 = this.f40437a;
            this.f40437a.makeImpression(banner3D3.faces.get(banner3D3.getCurrentBannerIndex()));
            Banner3D banner3D4 = this.f40437a;
            if (!banner3D4.addedDisplayEvent) {
                banner3D4.addedDisplayEvent = true;
                banner3D4.addDisplayEventOnLoad();
            }
        }
        Banner3D banner3D5 = this.f40437a;
        if (banner3D5.rotationEnabled) {
            int iM = banner3D5.getBannerOptions().m();
            Banner3D banner3D6 = this.f40437a;
            banner3D5.rotate(iM * (!banner3D6.firstRotationFinished ? banner3D6.options.k() : 1));
        }
        Banner3D banner3D7 = this.f40437a;
        if (banner3D7.rotation > 90 - banner3D7.getBannerOptions().m()) {
            Banner3D banner3D8 = this.f40437a;
            if (banner3D8.rotation < banner3D8.getBannerOptions().m() + 90) {
                Banner3D banner3D9 = this.f40437a;
                if (banner3D9.firstRotation) {
                    Banner3D banner3D10 = this.f40437a;
                    banner3D10.postDelayed(this, banner3D10.getBannerOptions().n());
                    this.f40437a.rotating = true;
                } else {
                    if (banner3D9.attachedToWindow) {
                        banner3D9.postDelayed(this, banner3D9.getBannerOptions().b());
                    }
                    this.f40437a.rotating = false;
                }
            } else {
                Banner3D banner3D11 = this.f40437a;
                banner3D11.postDelayed(this, banner3D11.getBannerOptions().n());
                this.f40437a.rotating = true;
            }
        } else {
            Banner3D banner3D12 = this.f40437a;
            banner3D12.postDelayed(this, banner3D12.getBannerOptions().n());
            this.f40437a.rotating = true;
        }
        if (this.f40437a.getNextBannerIndex() == 0) {
            this.f40437a.firstRotation = false;
        }
    }
}
