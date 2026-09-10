package com.startapp.sdk.ads.banner;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements BannerRequest.Callback {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f40477Y;
    public final /* synthetic */ BannerRequest.Callback Z;

    public /* synthetic */ e(BannerRequest bannerRequest, BannerRequest.Callback callback, int i2) {
        this.X = i2;
        this.f40477Y = bannerRequest;
        this.Z = callback;
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public final void onFinished(BannerCreator bannerCreator, String str) {
        switch (this.X) {
            case 0:
                this.f40477Y.lambda$loadInnerAd$2(this.Z, bannerCreator, str);
                break;
            default:
                this.f40477Y.lambda$load$0(this.Z, bannerCreator, str);
                break;
        }
    }
}
