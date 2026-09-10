package com.chartboost.heliumsdk.network;

import com.chartboost.heliumsdk.network.model.AdLoadNotificationRequestBody;
import com.chartboost.heliumsdk.network.model.AuctionWinnerRequestBody;
import com.chartboost.heliumsdk.network.model.BannerSizeBody;
import com.chartboost.heliumsdk.network.model.BidRequestBody;
import com.chartboost.heliumsdk.network.model.ChartboostMediationHeaderMap;
import com.chartboost.heliumsdk.network.model.ImpressionRequestBody;
import com.chartboost.heliumsdk.network.model.MetricsRequestBody;
import com.chartboost.heliumsdk.network.model.QueueRequestBody;
import com.chartboost.heliumsdk.network.model.SimpleTrackingRequestBody;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonElement;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J5\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ5\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u001fH§@ø\u0001\u0000¢\u0006\u0002\u0010 J5\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\"H§@ø\u0001\u0000¢\u0006\u0002\u0010#J5\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020%H§@ø\u0001\u0000¢\u0006\u0002\u0010&J5\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u001fH§@ø\u0001\u0000¢\u0006\u0002\u0010 J5\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020)2\b\b\u0001\u0010\u000b\u001a\u00020*H§@ø\u0001\u0000¢\u0006\u0002\u0010+J5\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\"H§@ø\u0001\u0000¢\u0006\u0002\u0010#ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/network/ChartboostMediationApi;", "", "getConfig", "Lretrofit2/Response;", "", "url", "headers", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAppConfigHeaderMap;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAppConfigHeaderMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logAuctionWinner", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;", "body", "Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeBidRequest", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostBidRequestMediationHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/BidRequestBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostBidRequestMediationHeaderMap;Lcom/chartboost/heliumsdk/network/model/BidRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRewardedCallbackGetRequest", "callbackUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRewardedCallbackPostRequest", "Lkotlinx/serialization/json/JsonElement;", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackAdLoad", "Lcom/chartboost/heliumsdk/network/model/AdLoadNotificationRequestBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;Lcom/chartboost/heliumsdk/network/model/AdLoadNotificationRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackAdaptiveBannerSize", "Lcom/chartboost/heliumsdk/network/model/BannerSizeBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;Lcom/chartboost/heliumsdk/network/model/BannerSizeBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackChartboostImpression", "Lcom/chartboost/heliumsdk/network/model/ImpressionRequestBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;Lcom/chartboost/heliumsdk/network/model/ImpressionRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackClick", "Lcom/chartboost/heliumsdk/network/model/SimpleTrackingRequestBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;Lcom/chartboost/heliumsdk/network/model/SimpleTrackingRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackEvent", "Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackPartnerImpression", "trackQueueRequest", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostQueueRequestMediationHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/QueueRequestBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostQueueRequestMediationHeaderMap;Lcom/chartboost/heliumsdk/network/model/QueueRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackReward", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ChartboostMediationApi {
    @GET
    Object getConfig(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAppConfigHeaderMap chartboostMediationAppConfigHeaderMap, Continuation<? super Response<String>> continuation);

    @POST
    Object logAuctionWinner(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body AuctionWinnerRequestBody auctionWinnerRequestBody, Continuation<? super Response<String>> continuation);

    @POST
    Object makeBidRequest(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostBidRequestMediationHeaderMap chartboostBidRequestMediationHeaderMap, @Body BidRequestBody bidRequestBody, Continuation<? super Response<String>> continuation);

    @GET
    Object makeRewardedCallbackGetRequest(@Url String str, Continuation<? super Response<String>> continuation);

    @POST
    Object makeRewardedCallbackPostRequest(@Url String str, @Body JsonElement jsonElement, Continuation<? super Response<String>> continuation);

    @POST
    Object trackAdLoad(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body AdLoadNotificationRequestBody adLoadNotificationRequestBody, Continuation<? super Response<String>> continuation);

    @POST
    Object trackAdaptiveBannerSize(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body BannerSizeBody bannerSizeBody, Continuation<? super Response<String>> continuation);

    @POST
    Object trackChartboostImpression(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body ImpressionRequestBody impressionRequestBody, Continuation<? super Response<String>> continuation);

    @POST
    Object trackClick(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body SimpleTrackingRequestBody simpleTrackingRequestBody, Continuation<? super Response<String>> continuation);

    @POST
    Object trackEvent(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body MetricsRequestBody metricsRequestBody, Continuation<? super Response<String>> continuation);

    @POST
    Object trackPartnerImpression(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body ImpressionRequestBody impressionRequestBody, Continuation<? super Response<String>> continuation);

    @POST
    Object trackQueueRequest(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostQueueRequestMediationHeaderMap chartboostQueueRequestMediationHeaderMap, @Body QueueRequestBody queueRequestBody, Continuation<? super Response<String>> continuation);

    @POST
    Object trackReward(@Url String str, @HeaderMap ChartboostMediationHeaderMap.ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, @Body SimpleTrackingRequestBody simpleTrackingRequestBody, Continuation<? super Response<String>> continuation);
}
