package com.unity3d.ads.core.data.model;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import cn.a0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d5.u;
import fn.n0;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0086\u0001Bö\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0010\u00104\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b4\u00100J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b;\u00100J\u0010\u0010<\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u008d\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$HÆ\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bK\u0010-J\u0010\u0010M\u001a\u00020LHÖ\u0001¢\u0006\u0004\bM\u0010NJ\u001a\u0010P\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010-R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010T\u001a\u0004\bX\u0010+\"\u0004\bY\u0010ZR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010[\u001a\u0004\b\n\u00100\"\u0004\b\\\u0010]R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010V\u001a\u0004\b^\u0010-\"\u0004\b_\u0010`R$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010V\u001a\u0004\ba\u0010-\"\u0004\bb\u0010`R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010V\u001a\u0004\bc\u0010-\"\u0004\bd\u0010`R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010[\u001a\u0004\b\u000e\u00100\"\u0004\be\u0010]R$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010V\u001a\u0004\bf\u0010-\"\u0004\bg\u0010`R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010h\u001a\u0004\bi\u00107R$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010V\u001a\u0004\bj\u0010-\"\u0004\bk\u0010`R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010l\u001a\u0004\bm\u0010:R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\b\u0015\u00100R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010n\u001a\u0004\bo\u0010=R-\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001a\u0010p\u001a\u0004\bq\u0010?\"\u0004\br\u0010sR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010p\u001a\u0004\bt\u0010?\"\u0004\bu\u0010sR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010v\u001a\u0004\bw\u0010B\"\u0004\bx\u0010yR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010z\u001a\u0004\b{\u0010D\"\u0004\b|\u0010}R,\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010~\u001a\u0004\b\u007f\u0010F\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b%\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010H\"\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0087\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "Lcn/a0;", "adScope", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "placementId", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "", "isScarAd", "scarQueryId", "scarAdUnitId", "scarAdString", "isOfferwallAd", "offerwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "adPlayer", "playerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "Lfn/n0;", "Lbn/a;", "ttl", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "Lcom/unity3d/ads/LoadConfiguration;", "loadConfiguration", "Lcom/unity3d/ads/ShowConfiguration;", "showConfiguration", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "webViewLessLoadingRequiredData", "<init>", "(Lcn/a0;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lfn/n0;Lfn/n0;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "component1", "()Lcn/a0;", "component2", "()Lcom/google/protobuf/ByteString;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "component12", "component13", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "component14", "component15", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "component16", "()Lfn/n0;", "component17", "component18", "()Lcom/unity3d/ads/LoadConfiguration;", "component19", "()Lcom/unity3d/ads/ShowConfiguration;", "component20", "()Ljava/lang/ref/WeakReference;", "component21", "()Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "copy", "(Lcn/a0;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lfn/n0;Lfn/n0;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)Lcom/unity3d/ads/core/data/model/AdObject;", InAppPurchaseConstants.METHOD_TO_STRING, "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcn/a0;", "getAdScope", "Lcom/google/protobuf/ByteString;", "getOpportunityId", "Ljava/lang/String;", "getPlacementId", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "Z", "setScarAd", "(Z)V", "getScarQueryId", "setScarQueryId", "(Ljava/lang/String;)V", "getScarAdUnitId", "setScarAdUnitId", "getScarAdString", "setScarAdString", "setOfferwallAd", "getOfferwallPlacementName", "setOfferwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "getAdPlayer", "getPlayerServerId", "setPlayerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "getLoadOptions", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "Lfn/n0;", "getTtl", "setTtl", "(Lfn/n0;)V", "getState", "setState", "Lcom/unity3d/ads/LoadConfiguration;", "getLoadConfiguration", "setLoadConfiguration", "(Lcom/unity3d/ads/LoadConfiguration;)V", "Lcom/unity3d/ads/ShowConfiguration;", "getShowConfiguration", "setShowConfiguration", "(Lcom/unity3d/ads/ShowConfiguration;)V", "Ljava/lang/ref/WeakReference;", "getActivity", "setActivity", "(Ljava/lang/ref/WeakReference;)V", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "getWebViewLessLoadingRequiredData", "setWebViewLessLoadingRequiredData", "(Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "WebViewLessLoadingRequiredData", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class AdObject {
    private WeakReference<Activity> activity;
    private final AdPlayer adPlayer;
    private final a0 adScope;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private LoadConfiguration loadConfiguration;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private ShowConfiguration showConfiguration;
    private n0 state;
    private ByteString trackingToken;
    private n0 ttl;
    private WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;

    public AdObject(a0 adScope, ByteString opportunityId, String placementId, ByteString trackingToken, boolean z10, String str, String str2, String str3, boolean z11, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, n0 ttl, n0 state, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        n.f(adScope, "adScope");
        n.f(opportunityId, "opportunityId");
        n.f(placementId, "placementId");
        n.f(trackingToken, "trackingToken");
        n.f(loadOptions, "loadOptions");
        n.f(adType, "adType");
        n.f(ttl, "ttl");
        n.f(state, "state");
        this.adScope = adScope;
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z10;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z12;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdObject copy$default(AdObject adObject, a0 a0Var, ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, n0 n0Var, n0 n0Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i10, Object obj) {
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        WeakReference weakReference2;
        a0 a0Var2 = (i10 & 1) != 0 ? adObject.adScope : a0Var;
        ByteString byteString3 = (i10 & 2) != 0 ? adObject.opportunityId : byteString;
        String str7 = (i10 & 4) != 0 ? adObject.placementId : str;
        ByteString byteString4 = (i10 & 8) != 0 ? adObject.trackingToken : byteString2;
        boolean z13 = (i10 & 16) != 0 ? adObject.isScarAd : z10;
        String str8 = (i10 & 32) != 0 ? adObject.scarQueryId : str2;
        String str9 = (i10 & 64) != 0 ? adObject.scarAdUnitId : str3;
        String str10 = (i10 & 128) != 0 ? adObject.scarAdString : str4;
        boolean z14 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? adObject.isOfferwallAd : z11;
        String str11 = (i10 & 512) != 0 ? adObject.offerwallPlacementName : str5;
        AdPlayer adPlayer2 = (i10 & 1024) != 0 ? adObject.adPlayer : adPlayer;
        String str12 = (i10 & a.f29616n) != 0 ? adObject.playerServerId : str6;
        UnityAdsLoadOptions unityAdsLoadOptions2 = (i10 & 4096) != 0 ? adObject.loadOptions : unityAdsLoadOptions;
        boolean z15 = (i10 & Segment.SIZE) != 0 ? adObject.isHeaderBidding : z12;
        a0 a0Var3 = a0Var2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? adObject.adType : diagnosticAdType;
        n0 n0Var3 = (i10 & 32768) != 0 ? adObject.ttl : n0Var;
        n0 n0Var4 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? adObject.state : n0Var2;
        LoadConfiguration loadConfiguration2 = (i10 & 131072) != 0 ? adObject.loadConfiguration : loadConfiguration;
        ShowConfiguration showConfiguration2 = (i10 & 262144) != 0 ? adObject.showConfiguration : showConfiguration;
        WeakReference weakReference3 = (i10 & 524288) != 0 ? adObject.activity : weakReference;
        if ((i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            weakReference2 = weakReference3;
            webViewLessLoadingRequiredData2 = adObject.webViewLessLoadingRequiredData;
        } else {
            webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
            weakReference2 = weakReference3;
        }
        return adObject.copy(a0Var3, byteString3, str7, byteString4, z13, str8, str9, str10, z14, str11, adPlayer2, str12, unityAdsLoadOptions2, z15, diagnosticAdType2, n0Var3, n0Var4, loadConfiguration2, showConfiguration2, weakReference2, webViewLessLoadingRequiredData2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a0 getAdScope() {
        return this.adScope;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final n0 getTtl() {
        return this.ttl;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final n0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final WeakReference<Activity> component20() {
        return this.activity;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsScarAd() {
        return this.isScarAd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScarAdString() {
        return this.scarAdString;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final AdObject copy(a0 adScope, ByteString opportunityId, String placementId, ByteString trackingToken, boolean isScarAd, String scarQueryId, String scarAdUnitId, String scarAdString, boolean isOfferwallAd, String offerwallPlacementName, AdPlayer adPlayer, String playerServerId, UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, n0 ttl, n0 state, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> activity, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        n.f(adScope, "adScope");
        n.f(opportunityId, "opportunityId");
        n.f(placementId, "placementId");
        n.f(trackingToken, "trackingToken");
        n.f(loadOptions, "loadOptions");
        n.f(adType, "adType");
        n.f(ttl, "ttl");
        n.f(state, "state");
        return new AdObject(adScope, opportunityId, placementId, trackingToken, isScarAd, scarQueryId, scarAdUnitId, scarAdString, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state, loadConfiguration, showConfiguration, activity, webViewLessLoadingRequiredData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) other;
        return n.a(this.adScope, adObject.adScope) && n.a(this.opportunityId, adObject.opportunityId) && n.a(this.placementId, adObject.placementId) && n.a(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && n.a(this.scarQueryId, adObject.scarQueryId) && n.a(this.scarAdUnitId, adObject.scarAdUnitId) && n.a(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && n.a(this.offerwallPlacementName, adObject.offerwallPlacementName) && n.a(this.adPlayer, adObject.adPlayer) && n.a(this.playerServerId, adObject.playerServerId) && n.a(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && n.a(this.ttl, adObject.ttl) && n.a(this.state, adObject.state) && n.a(this.loadConfiguration, adObject.loadConfiguration) && n.a(this.showConfiguration, adObject.showConfiguration) && n.a(this.activity, adObject.activity) && n.a(this.webViewLessLoadingRequiredData, adObject.webViewLessLoadingRequiredData);
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final a0 getAdScope() {
        return this.adScope;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    public final n0 getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final n0 getTtl() {
        return this.ttl;
    }

    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = (this.trackingToken.hashCode() + u.e((this.opportunityId.hashCode() + (this.adScope.hashCode() * 31)) * 31, 31, this.placementId)) * 31;
        boolean z10 = this.isScarAd;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        int i10 = (iHashCode + r0) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        ?? r2 = z11;
        if (z11) {
            r2 = 1;
        }
        int i11 = (iHashCode4 + r2) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (this.loadOptions.hashCode() + ((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        boolean z12 = this.isHeaderBidding;
        int iHashCode8 = (this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + ((iHashCode7 + (z12 ? 1 : z12)) * 31)) * 31)) * 31)) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int iHashCode9 = (iHashCode8 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int iHashCode10 = (iHashCode9 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        int iHashCode11 = (iHashCode10 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.webViewLessLoadingRequiredData;
        return iHashCode11 + (webViewLessLoadingRequiredData != null ? webViewLessLoadingRequiredData.hashCode() : 0);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setActivity(WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final void setLoadConfiguration(LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final void setOfferwallAd(boolean z10) {
        this.isOfferwallAd = z10;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setShowConfiguration(ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final void setState(n0 n0Var) {
        n.f(n0Var, "<set-?>");
        this.state = n0Var;
    }

    public final void setTrackingToken(ByteString byteString) {
        n.f(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(n0 n0Var) {
        n.f(n0Var, "<set-?>");
        this.ttl = n0Var;
    }

    public final void setWebViewLessLoadingRequiredData(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    public String toString() {
        return "AdObject(adScope=" + this.adScope + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ", loadConfiguration=" + this.loadConfiguration + ", showConfiguration=" + this.showConfiguration + ", activity=" + this.activity + ", webViewLessLoadingRequiredData=" + this.webViewLessLoadingRequiredData + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "", "webviewUrl", "", "adResponse", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adRefreshState", "Lcom/unity3d/ads/core/data/model/AdRefreshState;", "(Ljava/lang/String;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "getAdRefreshState", "()Lcom/unity3d/ads/core/data/model/AdRefreshState;", "setAdRefreshState", "(Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "getWebviewUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class WebViewLessLoadingRequiredData {
        private AdRefreshState adRefreshState;
        private AdResponseOuterClass.AdResponse adResponse;
        private final String webviewUrl;

        public WebViewLessLoadingRequiredData(String webviewUrl, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            n.f(webviewUrl, "webviewUrl");
            n.f(adResponse, "adResponse");
            this.webviewUrl = webviewUrl;
            this.adResponse = adResponse;
            this.adRefreshState = adRefreshState;
        }

        public static /* synthetic */ WebViewLessLoadingRequiredData copy$default(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = webViewLessLoadingRequiredData.webviewUrl;
            }
            if ((i10 & 2) != 0) {
                adResponse = webViewLessLoadingRequiredData.adResponse;
            }
            if ((i10 & 4) != 0) {
                adRefreshState = webViewLessLoadingRequiredData.adRefreshState;
            }
            return webViewLessLoadingRequiredData.copy(str, adResponse, adRefreshState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        public final WebViewLessLoadingRequiredData copy(String webviewUrl, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            n.f(webviewUrl, "webviewUrl");
            n.f(adResponse, "adResponse");
            return new WebViewLessLoadingRequiredData(webviewUrl, adResponse, adRefreshState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewLessLoadingRequiredData)) {
                return false;
            }
            WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = (WebViewLessLoadingRequiredData) other;
            return n.a(this.webviewUrl, webViewLessLoadingRequiredData.webviewUrl) && n.a(this.adResponse, webViewLessLoadingRequiredData.adResponse) && this.adRefreshState == webViewLessLoadingRequiredData.adRefreshState;
        }

        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        public int hashCode() {
            int iHashCode = (this.adResponse.hashCode() + (this.webviewUrl.hashCode() * 31)) * 31;
            AdRefreshState adRefreshState = this.adRefreshState;
            return iHashCode + (adRefreshState == null ? 0 : adRefreshState.hashCode());
        }

        public final void setAdRefreshState(AdRefreshState adRefreshState) {
            this.adRefreshState = adRefreshState;
        }

        public final void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
            n.f(adResponse, "<set-?>");
            this.adResponse = adResponse;
        }

        public String toString() {
            return "WebViewLessLoadingRequiredData(webviewUrl=" + this.webviewUrl + ", adResponse=" + this.adResponse + ", adRefreshState=" + this.adRefreshState + ')';
        }

        public /* synthetic */ WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i10, g gVar) {
            this(str, adResponse, (i10 & 4) != 0 ? null : adRefreshState);
        }
    }

    public /* synthetic */ AdObject(a0 a0Var, ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, n0 n0Var, n0 n0Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i10, g gVar) {
        this(a0Var, byteString, str, byteString2, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z11, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : adPlayer, (i10 & a.f29616n) != 0 ? null : str6, unityAdsLoadOptions, z12, diagnosticAdType, (32768 & i10) != 0 ? fn.g.c(null) : n0Var, (65536 & i10) != 0 ? fn.g.c(AdObjectState.INIT) : n0Var2, (131072 & i10) != 0 ? null : loadConfiguration, (262144 & i10) != 0 ? null : showConfiguration, (524288 & i10) != 0 ? null : weakReference, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : webViewLessLoadingRequiredData);
    }
}
