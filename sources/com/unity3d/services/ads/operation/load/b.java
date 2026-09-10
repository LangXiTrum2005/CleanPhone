package com.unity3d.services.ads.operation.load;

import android.webkit.ValueCallback;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.webview.WebView;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.LogEntry;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f42854Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.Z = obj;
        this.e0 = obj2;
        this.f42854Y = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ((LoadOperationState) this.Z).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) this.e0, (String) this.f42854Y);
                break;
            case 1:
                ((IUnityAdsInitializationListener) this.Z).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.e0, (String) this.f42854Y);
                break;
            case 2:
                WebView.evaluateJavascript$lambda$1((WebView) this.Z, (String) this.f42854Y, (ValueCallback) this.e0);
                break;
            case 3:
                AnalyticsClient.m3139logError$lambda2((Sdk.SDKError.Reason) this.Z, (String) this.f42854Y, (LogEntry) this.e0);
                break;
            case 4:
                AssetDownloader.m3208download$lambda0((DownloadRequest) this.Z, (AssetDownloader) this.e0, (AssetDownloadListener) this.f42854Y);
                break;
            case 5:
                DefaultAdLoader.AnonymousClass1.m3222onResponse$lambda0((DefaultAdLoader) this.Z, (Placement) this.e0, (Response) this.f42854Y);
                break;
            default:
                VungleWebClient.m3267shouldOverrideUrlLoading$lambda16$lambda6$lambda5((VungleWebClient) this.Z, (android.webkit.WebView) this.e0, (String) this.f42854Y);
                break;
        }
    }

    public /* synthetic */ b(Object obj, String str, Object obj2, int i2) {
        this.X = i2;
        this.Z = obj;
        this.f42854Y = str;
        this.e0 = obj2;
    }
}
