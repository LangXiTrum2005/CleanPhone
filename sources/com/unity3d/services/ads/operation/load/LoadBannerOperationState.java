package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.Configuration;
import ph.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class LoadBannerOperationState extends LoadOperationState {
    private c _scarAdMetadata;
    private UnityBannerSize _size;

    public LoadBannerOperationState(String str, String str2, UnityBannerSize unityBannerSize, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration);
        this.f38589id = str2;
        this._size = unityBannerSize;
    }

    public c getScarAdMetadata() {
        return this._scarAdMetadata;
    }

    public UnityBannerSize getSize() {
        return this._size;
    }

    public boolean isScarAd() {
        return this._scarAdMetadata != null;
    }

    public void setScarAdMetadata(c cVar) {
        this._scarAdMetadata = cVar;
    }

    public void setSize(UnityBannerSize unityBannerSize) {
        this._size = unityBannerSize;
    }
}
