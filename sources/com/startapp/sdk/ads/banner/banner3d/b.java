package com.startapp.sdk.ads.banner.banner3d;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f40438a;

    public b(Banner3D banner3D) {
        this.f40438a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40438a.rotationEnabled = true;
    }
}
