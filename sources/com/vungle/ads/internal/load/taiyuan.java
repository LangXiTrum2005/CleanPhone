package com.vungle.ads.internal.load;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.Ie;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.b;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.cuirassed;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.polloi;
import java.net.SocketTimeoutException;
import monacal.Placement;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultAdLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/vungle/ads/internal/load/taiyuan;", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/attabal;", "sdkExecutors", "Lwebby/saneness;", "omInjector", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloader", "Lcom/vungle/ads/internal/util/polloi;", "pathProvider", "Lcom/vungle/ads/internal/load/AdRequest;", "adRequest", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/attabal;Lwebby/saneness;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/polloi;Lcom/vungle/ads/internal/load/AdRequest;)V", "", "throwable", "Lcom/vungle/ads/VungleError;", "retrofitToVungleError", "(Ljava/lang/Throwable;)Lcom/vungle/ads/VungleError;", "", "requestAd", "()V", "onAdLoadReady", "", "placement", "Lcom/vungle/ads/trm;", X3.i.O, "Lcom/vungle/ads/internal/network/attabal;", "Lmonacal/attabal;", "getAdCall", "(Ljava/lang/String;Lcom/vungle/ads/trm;)Lcom/vungle/ads/internal/network/attabal;", "getApiErrorPrefix", "()Ljava/lang/String;", "Lmonacal/impromptu;", "fetchAdMetadata", "(Lcom/vungle/ads/trm;Lmonacal/impromptu;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class taiyuan extends BaseAdLoader {

    /* JADX INFO: compiled from: DefaultAdLoader.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/vungle/ads/internal/load/taiyuan$attabal", "Lcom/vungle/ads/internal/network/saneness;", "Lmonacal/attabal;", "Lcom/vungle/ads/internal/network/attabal;", NotificationCompat.CATEGORY_CALL, "Lcom/vungle/ads/internal/network/marial;", Ie.n, "", "onResponse", "(Lcom/vungle/ads/internal/network/attabal;Lcom/vungle/ads/internal/network/marial;)V", "", "t", "onFailure", "(Lcom/vungle/ads/internal/network/attabal;Ljava/lang/Throwable;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class attabal implements com.vungle.ads.internal.network.saneness<monacal.attabal> {
        final /* synthetic */ Placement $placement;

        public attabal(Placement placement) {
            this.$placement = placement;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onFailure$lambda-1, reason: not valid java name */
        public static final void m3230onFailure$lambda1(taiyuan this$0, Throwable th) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onAdLoadFailed(this$0.retrofitToVungleError(th).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onResponse$lambda-0, reason: not valid java name */
        public static final void m3231onResponse$lambda0(taiyuan this$0, Placement placement, com.vungle.ads.internal.network.marial marialVar) throws Throwable {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(placement, "$placement");
            if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
                this$0.onAdLoadFailed(new AdRetryError().setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            if (marialVar != null && !marialVar.isSuccessful()) {
                this$0.onAdLoadFailed(new APIFailedStatusCodeError(this$0.getApiErrorPrefix() + " API: " + marialVar.code()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            monacal.attabal attabalVar = marialVar != null ? (monacal.attabal) marialVar.body() : null;
            if ((attabalVar != null ? attabalVar.adUnit() : null) != null) {
                this$0.handleAdMetaData$vungle_ads_release(attabalVar, new cuirassed(Sdk$SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
                return;
            }
            this$0.onAdLoadFailed(new AdResponseEmptyError(this$0.getApiErrorPrefix() + " ad response is empty").setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
        }

        @Override // com.vungle.ads.internal.network.saneness
        public void onFailure(com.vungle.ads.internal.network.attabal<monacal.attabal> call, final Throwable t) {
            VungleThreadPoolExecutor background_executor = taiyuan.this.getSdkExecutors().getBACKGROUND_EXECUTOR();
            final taiyuan taiyuanVar = taiyuan.this;
            background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.competently
                @Override // java.lang.Runnable
                public final void run() {
                    taiyuan.attabal.m3230onFailure$lambda1(taiyuanVar, t);
                }
            });
        }

        @Override // com.vungle.ads.internal.network.saneness
        public void onResponse(com.vungle.ads.internal.network.attabal<monacal.attabal> call, final com.vungle.ads.internal.network.marial<monacal.attabal> response) {
            VungleThreadPoolExecutor background_executor = taiyuan.this.getSdkExecutors().getBACKGROUND_EXECUTOR();
            final taiyuan taiyuanVar = taiyuan.this;
            final Placement placement = this.$placement;
            background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.impromptu
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    taiyuan.attabal.m3231onResponse$lambda0(taiyuanVar, placement, response);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taiyuan(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.attabal sdkExecutors, webby.saneness omInjector, Downloader downloader, polloi pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VungleError retrofitToVungleError(Throwable throwable) {
        if (throwable instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getApiErrorPrefix());
        sb.append(" request fail: ");
        sb.append(throwable != null ? throwable.getMessage() : null);
        return new NetworkUnreachable(sb.toString());
    }

    public void fetchAdMetadata(VungleAdSize adSize, Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        if (getVungleApiClient().checkIsRetryAfterActive(placement.getReferenceId())) {
            onAdLoadFailed(new AdRetryActiveError().setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.attabal<monacal.attabal> adCall = getAdCall(placement.getReferenceId(), adSize);
        if (adCall != null) {
            adCall.enqueue(new attabal(placement));
            return;
        }
        onAdLoadFailed(new NetworkUnreachable(getApiErrorPrefix() + " is null").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
    }

    public com.vungle.ads.internal.network.attabal<monacal.attabal> getAdCall(String placement, VungleAdSize adSize) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return getVungleApiClient().requestAd(placement, adSize);
    }

    public String getApiErrorPrefix() {
        return b.JSON_KEY_ADS;
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
    }
}
