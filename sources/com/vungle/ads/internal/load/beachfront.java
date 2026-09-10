package com.vungle.ads.internal.load;

import android.content.Context;
import com.ironsource.X3;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.polloi;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CSBAdLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/load/beachfront;", "Lcom/vungle/ads/internal/load/taiyuan;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/attabal;", "sdkExecutors", "Lwebby/saneness;", "omInjector", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloader", "Lcom/vungle/ads/internal/util/polloi;", "pathProvider", "Lcom/vungle/ads/internal/load/AdRequest;", "adRequest", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/attabal;Lwebby/saneness;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/polloi;Lcom/vungle/ads/internal/load/AdRequest;)V", "", "placement", "Lcom/vungle/ads/trm;", X3.i.O, "Lcom/vungle/ads/internal/network/attabal;", "Lmonacal/attabal;", "getAdCall", "(Ljava/lang/String;Lcom/vungle/ads/trm;)Lcom/vungle/ads/internal/network/attabal;", "getApiErrorPrefix", "()Ljava/lang/String;", "adPayload", "Lcom/vungle/ads/VungleError;", "validateAdMetadata", "(Lmonacal/attabal;)Lcom/vungle/ads/VungleError;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class beachfront extends taiyuan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beachfront(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.attabal sdkExecutors, webby.saneness omInjector, Downloader downloader, polloi pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.taiyuan
    public com.vungle.ads.internal.network.attabal<monacal.attabal> getAdCall(String placement, VungleAdSize adSize) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return getVungleApiClient().requestCSBAd(placement, adSize, getAdRequest().getCsbData());
    }

    @Override // com.vungle.ads.internal.load.taiyuan
    public String getApiErrorPrefix() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public VungleError validateAdMetadata(monacal.attabal adPayload) {
        Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        VungleError vungleErrorValidateAdMetadata = super.validateAdMetadata(adPayload);
        if (vungleErrorValidateAdMetadata != null) {
            return vungleErrorValidateAdMetadata;
        }
        if (adPayload.getCSBResponse() == null) {
            return new AdResponseEmptyError("CSB response is missing from ad payload");
        }
        return null;
    }
}
