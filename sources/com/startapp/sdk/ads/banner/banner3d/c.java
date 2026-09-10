package com.startapp.sdk.ads.banner.banner3d;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f40439a;

    public c(Banner3D banner3D) {
        this.f40439a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Banner3D banner3D = this.f40439a;
        banner3D.loadBanners(banner3D.adsItems, false);
    }
}
