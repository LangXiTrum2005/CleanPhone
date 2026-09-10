package com.unity3d.ads.core.domain.exposure;

import aa.b;
import ak.f;
import ak.l;
import ak.m;
import an.h;
import android.util.Base64;
import bk.a;
import com.google.android.gms.internal.play_billing.q1;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.model.OnWebRequestComplete;
import com.unity3d.ads.adplayer.model.OnWebRequestFailed;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import d0.c;
import fn.a1;
import fn.d;
import fn.m0;
import fn.n0;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t9.e;
import wj.r;
import xj.b0;
import xj.k;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010\u0007\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a#\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u001b\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001aH\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000\u001a\u0013\u0010 \u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000\u001a\u0013\u0010!\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000\u001a\u001b\u0010\"\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010#\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010$\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u0013\u0010%\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u0013\u0010&\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000\u001a\u0013\u0010'\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000\u001a\u0013\u0010(\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u000b\u0010)\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010*\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u001b\u0010+\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010,\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u0013\u0010-\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u0013\u0010.\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000\u001a\u0013\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u000201H\u0000ø\u0001\u0000\u001a\u0013\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u000204H\u0000ø\u0001\u0000\u001a\u001b\u00105\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u00107\u001a\u00020\u00012\u0006\u00107\u001a\u0002082\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010<\u001a\u00020\u00012\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020@H\u0000ø\u0001\u0000\u001a\u001b\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010D\u001a\u00020\u00012\u0006\u0010D\u001a\u00020E2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010F\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010G\u001a\u00020HH\u0000ø\u0001\u0000\u001a\u000b\u0010I\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020L2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0000ø\u0001\u0000\u001a\u001b\u0010R\u001a\u00020\u00012\u0006\u0010R\u001a\u00020S2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010T\u001a\u00020\u00012\u0006\u0010U\u001a\u00020V2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010W\u001a\u00020\u00012\u0006\u0010W\u001a\u00020XH\u0000ø\u0001\u0000\u001a\u0013\u0010Y\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000\u001a\u0013\u0010Z\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010[\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010\\\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u0013\u0010]\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000\u001a\u000b\u0010^\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010_\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010`\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010a\u001a\u00020\u00012\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010c\u001a\u00020\u0001H\u0000ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"attributionRegisterClick", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "androidAttribution", "Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "attributionRegisterView", "clearStorage", "deleteStorage", "download", "cacheFile", "Lcom/unity3d/ads/core/domain/CacheFile;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "downloadWithProgress", "getAdContext", "getAndroidAdPlayerContext", "Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "adData", "Lcom/unity3d/ads/core/data/model/AdData;", HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "Lcom/unity3d/ads/core/data/model/ImpressionConfig;", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lcom/unity3d/ads/core/data/model/AdDataRefreshToken;", "isOMActivated", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "getAdContext-yLuu4LI", "(Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/domain/om/IsOMActivated;Lcom/unity3d/ads/core/data/model/AdObject;)Lcom/unity3d/ads/adplayer/ExposedFunction;", "getAllowedPii", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getConnectionType", "getDeviceMaxVolume", "getDeviceVolume", "getExtra", "getKeysStorage", "getPrivacy", "getPrivacyFsm", "getScreenHeight", "getScreenWidth", "getSessionToken", "getStorage", "hbTokenIncrementStarts", "hbTokenIncrementWins", "hbTokenReset", "incrementBannerImpressionCount", "isAttributionAvailable", "isFileCached", "getIfFileCache", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "isOfferwallAdReady", "getIsOfferwallAdReady", "Lcom/unity3d/ads/core/domain/offerwall/GetIsOfferwallAdReady;", "loadOfferwallAd", "Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "loadScarAd", "Lcom/unity3d/ads/core/domain/scar/LoadScarAd;", "markCampaignStateShown", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omGetData", "getOmData", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "omImpression", "omImpressionOccurred", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "omStartSession", "Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "openUrl", "handleOpenUrl", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "readStorage", "refreshAdData", ToolBar.REFRESH, "Lcom/unity3d/ads/core/domain/Refresh;", "request", "type", "Lcom/unity3d/services/core/network/model/RequestType;", "executeAdViewerRequest", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendOperativeEvent", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "sendPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "setAllowedPii", "setOpportunityTTL", "setOrientation", "setPrivacy", "setPrivacyFsm", "setStorage", "showOfferwallAd", "showScarAd", "updateCampaignState", "updateTrackingToken", "writeStorage", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonAdViewerExposedFunctionsKt {

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07781 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CacheFile $cacheFile;
        final /* synthetic */ SessionRepository $sessionRepository;

        public C07781(SessionRepository sessionRepository, CacheFile cacheFile, AdObject adObject) {
            this.$sessionRepository = sessionRepository;
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) throws JSONException {
            CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            boolean z10;
            String str;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$download$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$download$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, fVar);
            }
            CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$2 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            Object objInvoke$default = commonAdViewerExposedFunctionsKt$download$1$invoke$2.result;
            int i11 = commonAdViewerExposedFunctionsKt$download$1$invoke$2.label;
            if (i11 == 0) {
                e.z(objInvoke$default);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String url = jSONObject.getString("url");
                JSONArray jSONArray = (JSONArray) k.s0(2, objArr);
                int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                boolean disableCustomScheme = this.$sessionRepository.getFeatureFlags().getDisableCustomScheme();
                CacheFile cacheFile = this.$cacheFile;
                n.e(url, "url");
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.L$0 = url;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.Z$0 = disableCustomScheme;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.label = 1;
                objInvoke$default = CacheFile.DefaultImpls.invoke$default(cacheFile, url, adObject, jSONArray, iOptInt, 0, null, commonAdViewerExposedFunctionsKt$download$1$invoke$2, 48, null);
                a aVar = a.f5708a;
                if (objInvoke$default == aVar) {
                    return aVar;
                }
                z10 = disableCustomScheme;
                str = url;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = commonAdViewerExposedFunctionsKt$download$1$invoke$2.Z$0;
                str = (String) commonAdViewerExposedFunctionsKt$download$1$invoke$2.L$0;
                e.z(objInvoke$default);
            }
            CacheResult cacheResult = (CacheResult) objInvoke$default;
            if (!(cacheResult instanceof CacheResult.Success)) {
                if (cacheResult instanceof CacheResult.Failure) {
                    throw new IllegalStateException(((CacheResult.Failure) cacheResult).getError().name().toString());
                }
                throw new b((byte) 0, 20);
            }
            if (z10) {
                return str;
            }
            return "unity-ads-cache://unity.ads.cache/" + ((CacheResult.Success) cacheResult).getCachedFile().getName();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07861 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C07861(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, fVar);
            }
            Object privacy = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
            if (i11 == 0) {
                e.z(privacy);
                SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = 1;
                privacy = sessionRepository.getPrivacy(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1);
                a aVar = a.f5708a;
                if (privacy == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(privacy);
            }
            return ProtobufExtensionsKt.toBase64$default((ByteString) privacy, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07871 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C07871(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, fVar);
            }
            Object privacyFsm = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label;
            if (i11 == 0) {
                e.z(privacyFsm);
                SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label = 1;
                privacyFsm = sessionRepository.getPrivacyFsm(commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1);
                a aVar = a.f5708a;
                if (privacyFsm == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(privacyFsm);
            }
            return ProtobufExtensionsKt.toBase64$default((ByteString) privacyFsm, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "args", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07991 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

        public C07991(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
            this.$adObject = adObject;
            this.$loadOfferwallAd = loadOfferwallAd;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                String placementName = ((JSONObject) obj2).optString("placementName");
                this.$adObject.setOfferwallAd(true);
                this.$adObject.setOfferwallPlacementName(placementName);
                LoadOfferwallAd loadOfferwallAd = this.$loadOfferwallAd;
                n.e(placementName, "placementName");
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label = 1;
                Object objInvoke = loadOfferwallAd.invoke(placementName, commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "args", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08001 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadScarAd $loadScarAd;

        public C08001(AdObject adObject, LoadScarAd loadScarAd) {
            this.$adObject = adObject;
            this.$loadScarAd = loadScarAd;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(this, fVar);
            }
            CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
            Object obj = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.result;
            int i11 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.label;
            if (i11 == 0) {
                e.z(obj);
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                String adType = jSONObject.optString("type");
                String adUnitId = jSONObject.optString("adUnitId");
                String adString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_STRING);
                String queryId = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_QUERY_ID);
                int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH);
                this.$adObject.setScarAd(true);
                this.$adObject.setScarAdUnitId(adUnitId);
                this.$adObject.setScarQueryId(queryId);
                this.$adObject.setScarAdString(adString);
                LoadScarAd loadScarAd = this.$loadScarAd;
                n.e(adType, "adType");
                String placementId = this.$adObject.getPlacementId();
                n.e(adUnitId, "adUnitId");
                n.e(adString, "adString");
                n.e(queryId, "queryId");
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.label = 1;
                Object objInvoke = loadScarAd.invoke(adType, placementId, adUnitId, adString, queryId, iOptInt, commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08021 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmFinishSession $omFinishSession;

        public C08021(OmFinishSession omFinishSession, AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                OmFinishSession omFinishSession = this.$omFinishSession;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label = 1;
                Object objInvoke = omFinishSession.invoke(adObject, commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08031 implements ExposedFunction {
        final /* synthetic */ GetOmData $getOmData;

        public C08031(GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, fVar);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
            if (i11 == 0) {
                e.z(objInvoke);
                GetOmData getOmData = this.$getOmData;
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = 1;
                objInvoke = getOmData.invoke(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(objInvoke);
            }
            OMData oMData = (OMData) objInvoke;
            yj.f fVar2 = new yj.f();
            fVar2.put("version", oMData.getVersion());
            fVar2.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData.getPartnerName());
            fVar2.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData.getPartnerVersion());
            return fVar2.g();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08041 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

        public C08041(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                OmImpressionOccurred omImpressionOccurred = this.$omImpressionOccurred;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = 1;
                Object objInvoke = omImpressionOccurred.invoke(adObject, zBooleanValue, commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08051 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidOmInteraction $omStartSession;

        public C08051(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
            this.$omStartSession = androidOmInteraction;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                AndroidOmInteraction androidOmInteraction = this.$omStartSession;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = 1;
                Object objInvoke = androidOmInteraction.invoke(adObject, (JSONObject) obj2, commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08081 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Refresh $refresh;

        public C08081(Refresh refresh, AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
            ByteString refreshTokenByteString;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, fVar);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
            if (i11 == 0) {
                e.z(objInvoke);
                if (objArr.length == 0) {
                    refreshTokenByteString = ByteString.EMPTY;
                } else {
                    Object obj = objArr[0];
                    n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    String refreshToken = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
                    n.e(refreshToken, "refreshToken");
                    refreshTokenByteString = ProtobufExtensionsKt.fromBase64$default(refreshToken, false, 1, null);
                }
                Refresh refresh = this.$refresh;
                n.e(refreshTokenByteString, "refreshTokenByteString");
                ByteString opportunityId = this.$adObject.getOpportunityId();
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                objInvoke = refresh.invoke(refreshTokenByteString, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(objInvoke);
            }
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) objInvoke;
            if (adDataRefreshResponse.hasError()) {
                throw new IllegalArgumentException("Refresh failed");
            }
            yj.f fVar2 = new yj.f();
            ByteString adData = adDataRefreshResponse.getAdData();
            n.e(adData, "adRefreshResponse.adData");
            fVar2.put("adData", ProtobufExtensionsKt.toBase64$default(adData, false, 1, null));
            ByteString adDataRefreshToken = adDataRefreshResponse.getAdDataRefreshToken();
            n.e(adDataRefreshToken, "adRefreshResponse.adDataRefreshToken");
            fVar2.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null));
            ByteString trackingToken = adDataRefreshResponse.getTrackingToken();
            n.e(trackingToken, "adRefreshResponse.trackingToken");
            fVar2.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(trackingToken, false, 1, null));
            return fVar2.g();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "args", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08091 implements ExposedFunction {
        final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
        final /* synthetic */ RequestType $type;

        public C08091(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
            this.$executeAdViewerRequest = executeAdViewerRequest;
            this.$type = requestType;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$request$1$invoke$1 commonAdViewerExposedFunctionsKt$request$1$invoke$1;
            String str;
            Exception e10;
            String str2;
            String message;
            String str3;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$request$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$request$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$request$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$request$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$request$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$request$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                Object objO0 = k.o0(objArr);
                n.d(objO0, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) objO0;
                String str5 = (String) k.s0(1, objArr);
                try {
                    ExecuteAdViewerRequest executeAdViewerRequest = this.$executeAdViewerRequest;
                    RequestType requestType = this.$type;
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0 = str4;
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1 = str5;
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = 1;
                    Object objInvoke = executeAdViewerRequest.invoke(requestType, objArr, commonAdViewerExposedFunctionsKt$request$1$invoke$1);
                    a aVar = a.f5708a;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    str = str4;
                    obj = objInvoke;
                    str2 = str5;
                } catch (Exception e11) {
                    str = str4;
                    e10 = e11;
                    str2 = str5;
                    message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new OnWebRequestFailed(o.Q(str, str2, message));
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1;
                str = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0;
                try {
                    e.z(obj);
                } catch (Exception e12) {
                    e10 = e12;
                    message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new OnWebRequestFailed(o.Q(str, str2, message));
                }
            }
            HttpResponse httpResponse = (HttpResponse) obj;
            Object body = httpResponse.getBody();
            if (body instanceof String) {
                str3 = (String) body;
            } else {
                str3 = body instanceof byte[] ? new String((byte[]) body, an.a.f3768a) : null;
            }
            return new OnWebRequestComplete(o.Q(str, httpResponse.getUrlString(), str3, new Integer(httpResponse.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse.getHeaders())));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08111 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

        public C08111(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                n.e(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                GetOperativeEventApi getOperativeEventApi = this.$getOperativeEventApi;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = 1;
                Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08121 implements ExposedFunction {
        final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        public C08121(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, fVar);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
            if (i11 == 0) {
                e.z(objInvoke);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String privacyUpdateContentBase64 = jSONObject.optString("content");
                int iOptInt = jSONObject.optInt("version");
                SendPrivacyUpdateRequest sendPrivacyUpdateRequest = this.$sendPrivacyUpdateRequest;
                n.e(privacyUpdateContentBase64, "privacyUpdateContentBase64");
                ByteString byteStringFromBase64$default = ProtobufExtensionsKt.fromBase64$default(privacyUpdateContentBase64, false, 1, null);
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = 1;
                objInvoke = sendPrivacyUpdateRequest.invoke(iOptInt, byteStringFromBase64$default, commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(objInvoke);
            }
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) objInvoke;
            yj.f fVar2 = new yj.f();
            fVar2.put("version", new Integer(privacyUpdateResponse.getVersion()));
            ByteString content = privacyUpdateResponse.getContent();
            n.e(content, "response.content");
            fVar2.put("content", ProtobufExtensionsKt.toBase64$default(content, false, 1, null));
            return fVar2.g();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "args", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08151 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        public C08151(AdObject adObject) {
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                m0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                String stringUtf8 = this.$adObject.getOpportunityId().toStringUtf8();
                n.e(stringUtf8, "adObject.opportunityId.toStringUtf8()");
                DisplayMessage.SetOrientation setOrientation = new DisplayMessage.SetOrientation(stringUtf8, iIntValue);
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = 1;
                Object objEmit = displayMessages.emit(setOrientation, commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1);
                a aVar = a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08161 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C08161(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                SessionRepository sessionRepository = this.$sessionRepository;
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                n.e(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = 1;
                Object privacy = sessionRepository.setPrivacy(byteString, commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1);
                a aVar = a.f5708a;
                if (privacy == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lwj/r;", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C08171 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C08171(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
        public final Object invoke(Object[] objArr, f fVar) {
            CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1;
            if (fVar instanceof CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) fVar;
                int i10 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, fVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, fVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.result;
            int i11 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
            if (i11 == 0) {
                e.z(obj);
                SessionRepository sessionRepository = this.$sessionRepository;
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                n.e(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = 1;
                Object privacyFsm = sessionRepository.setPrivacyFsm(byteString, commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1);
                a aVar = a.f5708a;
                if (privacyFsm == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            return r.f53297a;
        }
    }

    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        n.f(androidAttribution, "androidAttribution");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, fVar);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        n.f(androidAttribution, "androidAttribution");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, fVar);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                m mVar = new m(q1.t(fVar));
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(mVar));
                return mVar.a();
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                m mVar = new m(q1.t(fVar));
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(mVar));
                return mVar.a();
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject, SessionRepository sessionRepository) {
        n.f(cacheFile, "cacheFile");
        n.f(adObject, "adObject");
        n.f(sessionRepository, "sessionRepository");
        return new C07781(sessionRepository, cacheFile, adObject);
    }

    public static final ExposedFunction downloadWithProgress(final CacheFile cacheFile, final AdObject adObject) {
        n.f(cacheFile, "cacheFile");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.downloadWithProgress.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) throws JSONException {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("url");
                JSONArray jSONArray = (JSONArray) k.s0(2, objArr);
                int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                Object objS0 = k.s0(1, objArr);
                Number number = objS0 instanceof Number ? (Number) objS0 : null;
                if (number == null) {
                    throw new IllegalStateException("intervalMs is required");
                }
                int iIntValue = number.intValue();
                String string2 = UUID.randomUUID().toString();
                n.e(string2, "randomUUID().toString()");
                return new wj.f(b0.Q(new wj.f("url", string), new wj.f("downloadId", string2)), new d(new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(cacheFile, string, adObject, jSONArray, iOptInt, iIntValue, string2, null), l.f3620a, -2, en.a.f40122a));
            }
        };
    }

    /* JADX INFO: renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m3233getAdContextyLuu4LI(AndroidGetAdPlayerContext getAndroidAdPlayerContext, String adData, String impressionConfig, String adDataRefreshToken, IsOMActivated isOMActivated, AdObject adObject) {
        n.f(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        n.f(adData, "adData");
        n.f(impressionConfig, "impressionConfig");
        n.f(adDataRefreshToken, "adDataRefreshToken");
        n.f(isOMActivated, "isOMActivated");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return Base64.encodeToString(((AllowedPiiOuterClass.AllowedPii) ((a1) deviceInfoRepository.getAllowedPii()).getValue()).toByteArray(), 2);
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return new Double(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return new Double(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getExtra(final SessionRepository sessionRepository, final AdObject adObject) {
        n.f(sessionRepository, "sessionRepository");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getExtra.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                InitializationConfigurationInternal initializationConfiguration;
                Map<String, String> extras;
                LoadConfiguration loadConfiguration;
                Map<String, String> extras2;
                ShowConfiguration showConfiguration;
                Map<String, String> extras3;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj2;
                int iHashCode = str.hashCode();
                if (iHashCode == 3237136) {
                    if (!str.equals("init") || (initializationConfiguration = sessionRepository.getInitializationConfiguration()) == null || (extras = initializationConfiguration.getExtras()) == null) {
                        return null;
                    }
                    return extras.get(str2);
                }
                if (iHashCode == 3327206) {
                    if (!str.equals("load") || (loadConfiguration = adObject.getLoadConfiguration()) == null || (extras2 = loadConfiguration.getExtras()) == null) {
                        return null;
                    }
                    return extras2.get(str2);
                }
                if (iHashCode == 3529469 && str.equals("show") && (showConfiguration = adObject.getShowConfiguration()) != null && (extras3 = showConfiguration.getExtras()) != null) {
                    return extras3.get(str2);
                }
                return null;
                return null;
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                m mVar = new m(q1.t(fVar));
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(mVar));
                return mVar.a();
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new C07861(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new C07871(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return new Integer(deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return new Integer(deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return ProtobufExtensionsKt.toBase64$default(sessionRepository.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                m mVar = new m(q1.t(fVar));
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(mVar));
                return mVar.a();
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                sessionRepository.incrementTokenStartsCount();
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository, final AdObject adObject) {
        n.f(sessionRepository, "sessionRepository");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                if (adObject.getWebViewLessLoadingRequiredData() == null) {
                    sessionRepository.incrementTokenWinsCount();
                }
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                sessionRepository.resetTokenCounters();
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                sessionRepository.incrementBannerImpressionCount();
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        n.f(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return androidAttribution.isAvailable(fVar);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIfFileCache) {
        n.f(getIfFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                return getIfFileCache.invoke((String) obj, fVar);
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        n.f(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isOfferwallAdReady.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String placementName = ((JSONObject) obj).optString("placementName");
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = getIsOfferwallAdReady;
                n.e(placementName, "placementName");
                return getIsOfferwallAdReady2.invoke(placementName, fVar);
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        n.f(loadOfferwallAd, "loadOfferwallAd");
        n.f(adObject, "adObject");
        return new C07991(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        n.f(loadScarAd, "loadScarAd");
        n.f(adObject, "adObject");
        return new C08001(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        n.f(campaignRepository, "campaignRepository");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                campaignRepository.setShowTimestamp(adObject.getOpportunityId());
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        n.f(omFinishSession, "omFinishSession");
        n.f(adObject, "adObject");
        return new C08021(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        n.f(getOmData, "getOmData");
        return new C08031(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        n.f(omImpressionOccurred, "omImpressionOccurred");
        n.f(adObject, "adObject");
        return new C08041(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction omStartSession, AdObject adObject) {
        n.f(omStartSession, "omStartSession");
        n.f(adObject, "adObject");
        return new C08051(omStartSession, adObject);
    }

    public static final ExposedFunction openUrl(final AdObject adObject, final HandleOpenUrl handleOpenUrl) {
        n.f(adObject, "adObject");
        n.f(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object objS0 = k.s0(1, objArr);
                JSONObject jSONObject = objS0 instanceof JSONObject ? (JSONObject) objS0 : null;
                String strOptString = jSONObject != null ? jSONObject.optString("packageName") : null;
                String strOptString2 = jSONObject != null ? jSONObject.optString("action", "android.intent.action.VIEW") : null;
                JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS) : null;
                return handleOpenUrl.invoke(adObject, str, strOptString, strOptString2, jSONObjectOptJSONObject != null ? JSONObjectExtensionsKt.toBuiltInMap(jSONObjectOptJSONObject) : null, jSONObject != null ? jSONObject.optBoolean(HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT) : false, fVar);
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                m mVar = new m(q1.t(fVar));
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(mVar));
                return mVar.a();
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        n.f(refresh, "refresh");
        n.f(adObject, "adObject");
        return new C08081(refresh, adObject);
    }

    public static final ExposedFunction request(RequestType type, ExecuteAdViewerRequest executeAdViewerRequest) {
        n.f(type, "type");
        n.f(executeAdViewerRequest, "executeAdViewerRequest");
        return new C08091(executeAdViewerRequest, type);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                String string;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                yj.f fVar2 = new yj.f();
                Iterator<String> itKeys = jSONObject.keys();
                n.e(itKeys, "tags.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    fVar2.put(next, jSONObject.getString(next));
                }
                yj.f fVarG = fVar2.g();
                Object objS0 = k.s0(2, objArr);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (objS0 == null || (string = objS0.toString()) == null) ? null : new Double(Double.parseDouble(string)), fVarG, (Map) null, adObject, (Integer) null, 40, (Object) null);
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        n.f(getOperativeEventApi, "getOperativeEventApi");
        n.f(adObject, "adObject");
        return new C08111(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        n.f(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new C08121(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                a1 a1Var;
                Object value;
                final AllowedPiiKt.Dsl dsl_create;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                n0 allowedPii = deviceInfoRepository.getAllowedPii();
                do {
                    a1Var = (a1) allowedPii;
                    value = a1Var.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.INSTANCE;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = ((AllowedPiiOuterClass.AllowedPii) value).toBuilder();
                    n.e(builder, "this.toBuilder()");
                    dsl_create = companion._create(builder);
                    Object objOpt = jSONObject.opt("idfa");
                    Boolean bool = objOpt instanceof Boolean ? (Boolean) objOpt : null;
                    if (bool != null) {
                        new q(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // qk.r
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // qk.j
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool);
                    }
                    Object objOpt2 = jSONObject.opt("idfv");
                    Boolean bool2 = objOpt2 instanceof Boolean ? (Boolean) objOpt2 : null;
                    if (bool2 != null) {
                        new q(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // qk.r
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // qk.j
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool2);
                    }
                    Object objOpt3 = jSONObject.opt("appset_id");
                    Boolean bool3 = objOpt3 instanceof Boolean ? (Boolean) objOpt3 : null;
                    if (bool3 != null) {
                        new q(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // qk.r
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // qk.j
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool3);
                    }
                } while (!a1Var.c0(value, dsl_create._build()));
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOpportunityTTL.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                n0 ttl = adObject.getTtl();
                int i10 = bn.a.f5743d;
                bn.a aVar = new bn.a(c.O(iIntValue, bn.c.SECONDS));
                a1 a1Var = (a1) ttl;
                a1Var.getClass();
                a1Var.e0(null, aVar);
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        n.f(adObject, "adObject");
        return new C08151(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new C08161(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new C08171(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                m mVar = new m(q1.t(fVar));
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(mVar));
                return mVar.a();
            }
        };
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        n.f(campaignRepository, "campaignRepository");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateCampaignState.1
            /* JADX WARN: Code duplicated, block: B:24:0x006c  */
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                CampaignStateOuterClass.Campaign campaign_build;
                Object objP0 = k.p0(objArr);
                JSONObject jSONObject = objP0 instanceof JSONObject ? (JSONObject) objP0 : null;
                if (jSONObject == null) {
                    throw new IllegalArgumentException("Update campaign state requires a JSONObject");
                }
                String data = jSONObject.optString("data");
                if (data == null || h.y0(data)) {
                    throw new IllegalArgumentException("Update campaign state requires a data string");
                }
                int iOptInt = jSONObject.optInt("dataVersion");
                if (iOptInt == 0) {
                    throw new IllegalArgumentException("Update campaign state requires a dataVersion integer");
                }
                ByteString opportunityId = adObject.getOpportunityId();
                String placementId = adObject.getPlacementId();
                n.e(data, "data");
                ByteString byteStringFromBase64$default = ProtobufExtensionsKt.fromBase64$default(data, false, 1, null);
                if (byteStringFromBase64$default.isEmpty()) {
                    throw new IllegalArgumentException("Update campaign state requires a non-empty data byte string");
                }
                CampaignStateOuterClass.Campaign campaign = campaignRepository.getCampaign(opportunityId);
                if (campaign != null) {
                    CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
                    CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
                    n.e(builder, "this.toBuilder()");
                    CampaignKt.Dsl dsl_create = companion._create(builder);
                    dsl_create.setData(byteStringFromBase64$default);
                    dsl_create.setDataVersion(iOptInt);
                    campaign_build = dsl_create._build();
                    if (campaign_build == null) {
                        CampaignKt.Dsl.Companion companion2 = CampaignKt.Dsl.INSTANCE;
                        CampaignStateOuterClass.Campaign.Builder builderNewBuilder = CampaignStateOuterClass.Campaign.newBuilder();
                        n.e(builderNewBuilder, "newBuilder()");
                        CampaignKt.Dsl dsl_create2 = companion2._create(builderNewBuilder);
                        dsl_create2.setData(byteStringFromBase64$default);
                        dsl_create2.setDataVersion(iOptInt);
                        dsl_create2.setPlacementId(placementId);
                        dsl_create2.setImpressionOpportunityId(opportunityId);
                        campaign_build = dsl_create2._build();
                    }
                } else {
                    CampaignKt.Dsl.Companion companion3 = CampaignKt.Dsl.INSTANCE;
                    CampaignStateOuterClass.Campaign.Builder builderNewBuilder2 = CampaignStateOuterClass.Campaign.newBuilder();
                    n.e(builderNewBuilder2, "newBuilder()");
                    CampaignKt.Dsl dsl_create3 = companion3._create(builderNewBuilder2);
                    dsl_create3.setData(byteStringFromBase64$default);
                    dsl_create3.setDataVersion(iOptInt);
                    dsl_create3.setPlacementId(placementId);
                    dsl_create3.setImpressionOpportunityId(opportunityId);
                    campaign_build = dsl_create3._build();
                }
                campaignRepository.setCampaign(opportunityId, campaign_build);
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String token = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (token != null && token.length() != 0) {
                    AdObject adObject2 = adObject;
                    n.e(token, "token");
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return r.f53297a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
            public final Object invoke(Object[] objArr, f fVar) {
                m mVar = new m(q1.t(fVar));
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(mVar));
                return mVar.a();
            }
        };
    }
}
