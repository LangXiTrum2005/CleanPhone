package com.unity3d.ads.core.domain.adload;

import ak.f;
import an.h;
import bk.a;
import ck.c;
import ck.e;
import cn.a0;
import com.google.protobuf.ByteString;
import com.ironsource.Ve;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.CacheAssets;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJS\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/domain/adload/AndroidWebViewLessLoadStrategy;", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/domain/CacheAssets;", "cacheAssets", "Lcom/unity3d/ads/core/domain/AdRefresh;", "adRefresh", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/CacheAssets;Lcom/unity3d/ads/core/domain/AdRefresh;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Lcn/a0;", "scope", "", "webViewUrl", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/google/protobuf/ByteString;", "opportunityId", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", Ve.f27442n, "placementId", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lcom/unity3d/ads/core/data/model/LoadResult;", "invoke", "(Lcn/a0;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZLak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "Lcom/unity3d/ads/core/domain/AdRefresh;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidWebViewLessLoadStrategy implements WebViewLessLoadStrategy {
    private final AdRefresh adRefresh;
    private final AdRepository adRepository;
    private final CacheAssets cacheAssets;
    private final CampaignRepository campaignRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy", f = "AndroidWebViewLessLoadStrategy.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE, 60}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewLessLoadStrategy.this.invoke(null, null, null, null, null, null, null, false, this);
        }
    }

    public AndroidWebViewLessLoadStrategy(AdRepository adRepository, CampaignRepository campaignRepository, CacheAssets cacheAssets, AdRefresh adRefresh, SessionRepository sessionRepository) {
        n.f(adRepository, "adRepository");
        n.f(campaignRepository, "campaignRepository");
        n.f(cacheAssets, "cacheAssets");
        n.f(adRefresh, "adRefresh");
        n.f(sessionRepository, "sessionRepository");
        this.adRepository = adRepository;
        this.campaignRepository = campaignRepository;
        this.cacheAssets = cacheAssets;
        this.adRefresh = adRefresh;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x012c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy
    public Object invoke(a0 a0Var, String str, UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z10, f fVar) {
        AnonymousClass1 anonymousClass1;
        ByteString byteString2;
        String str3;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z11;
        AndroidWebViewLessLoadStrategy androidWebViewLessLoadStrategy;
        AdObject adObject;
        String message;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        boolean z12;
        AndroidWebViewLessLoadStrategy androidWebViewLessLoadStrategy2;
        ByteString byteString3;
        String str4;
        String objectId;
        JSONObject data;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objInvoke = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        a aVar = a.f5708a;
        if (i11 == 0) {
            t9.e.z(objInvoke);
            ByteString trackingToken = adResponse.getTrackingToken();
            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = new AdObject.WebViewLessLoadingRequiredData(str, adResponse, null, 4, null);
            n.e(trackingToken, "trackingToken");
            byteString2 = byteString;
            str3 = str2;
            AdObject adObject2 = new AdObject(a0Var, byteString2, str3, trackingToken, false, null, null, null, false, null, null, null, unityAdsLoadOptions, z10, diagnosticAdType, null, null, null, null, null, webViewLessLoadingRequiredData, 1019888, null);
            CacheAssets cacheAssets = this.cacheAssets;
            List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adResponse.getCampaignMetadata().getAssetsToCacheList();
            n.e(assetsToCacheList, "response.campaignMetadata.assetsToCacheList");
            anonymousClass1.L$0 = this;
            unityAdsLoadOptions2 = unityAdsLoadOptions;
            anonymousClass1.L$1 = unityAdsLoadOptions2;
            anonymousClass1.L$2 = byteString2;
            anonymousClass1.L$3 = str3;
            anonymousClass1.L$4 = adObject2;
            z11 = z10;
            anonymousClass1.Z$0 = z11;
            anonymousClass1.label = 1;
            objInvoke = cacheAssets.invoke(adObject2, assetsToCacheList, anonymousClass1);
            if (objInvoke != aVar) {
                androidWebViewLessLoadStrategy = this;
                adObject = adObject2;
            }
            return aVar;
        }
        if (i11 == 1) {
            boolean z13 = anonymousClass1.Z$0;
            adObject = (AdObject) anonymousClass1.L$4;
            String str5 = (String) anonymousClass1.L$3;
            ByteString byteString4 = (ByteString) anonymousClass1.L$2;
            UnityAdsLoadOptions unityAdsLoadOptions4 = (UnityAdsLoadOptions) anonymousClass1.L$1;
            androidWebViewLessLoadStrategy = (AndroidWebViewLessLoadStrategy) anonymousClass1.L$0;
            t9.e.z(objInvoke);
            str3 = str5;
            byteString2 = byteString4;
            unityAdsLoadOptions2 = unityAdsLoadOptions4;
            z11 = z13;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = anonymousClass1.Z$0;
            adObject = (AdObject) anonymousClass1.L$4;
            str4 = (String) anonymousClass1.L$3;
            byteString3 = (ByteString) anonymousClass1.L$2;
            unityAdsLoadOptions3 = (UnityAdsLoadOptions) anonymousClass1.L$1;
            androidWebViewLessLoadStrategy2 = (AndroidWebViewLessLoadStrategy) anonymousClass1.L$0;
            t9.e.z(objInvoke);
        }
        objectId = unityAdsLoadOptions3.getObjectId();
        if ((objectId != null || h.y0(objectId)) && (data = unityAdsLoadOptions3.getData()) != null && !data.has("adMarkup")) {
            androidWebViewLessLoadStrategy2.adRepository.enqueueOpportunityForPlacement(str4, byteString3);
        }
        if (z12) {
            androidWebViewLessLoadStrategy2.sessionRepository.incrementTokenWinsCount();
        }
        return new LoadResult.Success(adObject);
        CacheAssetsEvent cacheAssetsEvent = (CacheAssetsEvent) objInvoke;
        if (!(cacheAssetsEvent instanceof CacheAssetsEvent.Success)) {
            ErrorOuterClass.PublicErrorCode publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM;
            CacheAssetsEvent.Failure failure = cacheAssetsEvent instanceof CacheAssetsEvent.Failure ? (CacheAssetsEvent.Failure) cacheAssetsEvent : null;
            if (failure == null || (message = failure.getMessage()) == null) {
                message = "";
            }
            return new LoadResult.Failure(publicErrorCode, null, null, message, null, false, 54, null);
        }
        androidWebViewLessLoadStrategy.campaignRepository.setLoadTimestamp(byteString2);
        androidWebViewLessLoadStrategy.adRepository.addAd(byteString2, adObject);
        AdRefresh adRefresh = androidWebViewLessLoadStrategy.adRefresh;
        anonymousClass1.L$0 = androidWebViewLessLoadStrategy;
        anonymousClass1.L$1 = unityAdsLoadOptions2;
        anonymousClass1.L$2 = byteString2;
        anonymousClass1.L$3 = str3;
        anonymousClass1.L$4 = adObject;
        anonymousClass1.Z$0 = z11;
        anonymousClass1.label = 2;
        if (adRefresh.invoke(adObject, anonymousClass1) != aVar) {
            unityAdsLoadOptions3 = unityAdsLoadOptions2;
            z12 = z11;
            androidWebViewLessLoadStrategy2 = androidWebViewLessLoadStrategy;
            byteString3 = byteString2;
            str4 = str3;
            objectId = unityAdsLoadOptions3.getObjectId();
            if (objectId != null) {
                androidWebViewLessLoadStrategy2.adRepository.enqueueOpportunityForPlacement(str4, byteString3);
            } else {
                androidWebViewLessLoadStrategy2.adRepository.enqueueOpportunityForPlacement(str4, byteString3);
            }
            if (z12) {
                androidWebViewLessLoadStrategy2.sessionRepository.incrementTokenWinsCount();
            }
            return new LoadResult.Success(adObject);
        }
        return aVar;
    }
}
