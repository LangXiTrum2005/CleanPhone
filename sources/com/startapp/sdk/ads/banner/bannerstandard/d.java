package com.startapp.sdk.ads.banner.bannerstandard;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f40461b;

    public d(BannerStandard bannerStandard, String str) {
        this.f40461b = bannerStandard;
        this.f40460a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40461b.reloadImpl(this.f40460a);
    }
}
