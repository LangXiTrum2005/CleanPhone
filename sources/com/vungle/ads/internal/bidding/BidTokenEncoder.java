package com.vungle.ads.internal.bidding;

import android.content.Context;
import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.d9;
import com.p004ironsource.x4;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.RtbRequest;
import com.vungle.ads.internal.model.RtbToken;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.InputOutputUtils;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0002J\r\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020 H\u0001¢\u0006\u0002\b#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\nR$\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/bidding/BidTokenEncoder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidTokenRequestedMetric", "Lcom/vungle/ads/SingleValueMetric;", "enterBackgroundTime", "", "getEnterBackgroundTime$vungle_ads_release$annotations", "()V", "getEnterBackgroundTime$vungle_ads_release", "()J", "setEnterBackgroundTime$vungle_ads_release", "(J)V", "json", "Lkotlinx/serialization/json/Json;", "getJson$annotations", "ordinalView", "", "getOrdinalView$vungle_ads_release$annotations", "getOrdinalView$vungle_ads_release", "()I", "setOrdinalView$vungle_ads_release", "(I)V", "constructV6Token", "", "constructV6Token$vungle_ads_release", "encode", "Lcom/vungle/ads/internal/bidding/BidTokenEncoder$BiddingTokenInfo;", "generateBidToken", d9.h.t0, "", "onPause$vungle_ads_release", d9.h.u0, "onResume$vungle_ads_release", "BiddingTokenInfo", "Companion", "vungle-ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BidTokenEncoder {
    private static final String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;
    private SingleValueMetric bidTokenRequestedMetric;
    private final Context context;
    private long enterBackgroundTime;
    private final Json json;
    private int ordinalView;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/bidding/BidTokenEncoder$BiddingTokenInfo;", "", "bidToken", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getBidToken", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class BiddingTokenInfo {
        private final String bidToken;
        private final String errorMessage;

        public BiddingTokenInfo(String bidToken, String errorMessage) {
            Intrinsics.f(bidToken, "bidToken");
            Intrinsics.f(errorMessage, "errorMessage");
            this.bidToken = bidToken;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ BiddingTokenInfo copy$default(BiddingTokenInfo biddingTokenInfo, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = biddingTokenInfo.bidToken;
            }
            if ((i2 & 2) != 0) {
                str2 = biddingTokenInfo.errorMessage;
            }
            return biddingTokenInfo.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBidToken() {
            return this.bidToken;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final BiddingTokenInfo copy(String bidToken, String errorMessage) {
            Intrinsics.f(bidToken, "bidToken");
            Intrinsics.f(errorMessage, "errorMessage");
            return new BiddingTokenInfo(bidToken, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BiddingTokenInfo)) {
                return false;
            }
            BiddingTokenInfo biddingTokenInfo = (BiddingTokenInfo) other;
            return Intrinsics.a(this.bidToken, biddingTokenInfo.bidToken) && Intrinsics.a(this.errorMessage, biddingTokenInfo.errorMessage);
        }

        public final String getBidToken() {
            return this.bidToken;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode() + (this.bidToken.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BiddingTokenInfo(bidToken=");
            sb.append(this.bidToken);
            sb.append(", errorMessage=");
            return a.p(sb, this.errorMessage, ')');
        }
    }

    public BidTokenEncoder(Context context) {
        Intrinsics.f(context, "context");
        this.context = context;
        this.bidTokenRequestedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JsonBuilder) obj);
                return Unit.f43263a;
            }

            public final void invoke(JsonBuilder Json) {
                Intrinsics.f(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
                Json.setEncodeDefaults(true);
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        ActivityManager.INSTANCE.addLifecycleListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onBackground() {
                BidTokenEncoder.this.onPause$vungle_ads_release();
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onForeground() {
                BidTokenEncoder.this.onResume$vungle_ads_release();
            }
        });
    }

    /* JADX INFO: renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final VungleApiClient m3207constructV6Token$lambda0(Lazy<VungleApiClient> lazy) {
        return (VungleApiClient) lazy.getX();
    }

    private final BiddingTokenInfo generateBidToken() throws Throwable {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.bidTokenRequestedMetric, (LogEntry) null, (String) null, 6, (Object) null);
        try {
            String strConstructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            Logger.Companion companion = Logger.INSTANCE;
            companion.d(TAG, "BidToken: " + strConstructV6Token$vungle_ads_release);
            try {
                String str = "6:" + InputOutputUtils.INSTANCE.convertForSending(strConstructV6Token$vungle_ads_release);
                companion.d(TAG, "After conversion: " + str);
                return new BiddingTokenInfo(str, "");
            } catch (Throwable th) {
                String str2 = "Fail to gzip token data. " + th.getLocalizedMessage();
                new GzipEncodeError(str2).logErrorNoReturnValue$vungle_ads_release();
                return new BiddingTokenInfo("", str2);
            }
        } catch (Throwable th2) {
            String str3 = "Failed to encode TokenParameters. " + th2.getLocalizedMessage();
            new JsonEncodeError(str3).logErrorNoReturnValue$vungle_ads_release();
            return new BiddingTokenInfo("", str3);
        }
    }

    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }

    public final String constructV6Token$vungle_ads_release() {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        VungleApiClient vungleApiClientM3207constructV6Token$lambda0 = m3207constructV6Token$lambda0(LazyKt.a(LazyThreadSafetyMode.X, new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$constructV6Token$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        }));
        ConfigManager configManager = ConfigManager.INSTANCE;
        CommonRequestBody commonRequestBodyRequestBody = vungleApiClientM3207constructV6Token$lambda0.requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        RtbToken rtbToken = new RtbToken(commonRequestBodyRequestBody.getDevice(), commonRequestBodyRequestBody.getUser(), commonRequestBodyRequestBody.getExt(), new RtbRequest(VungleHeader.INSTANCE.getHeaderUa()), this.ordinalView);
        Json json = this.json;
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.b(RtbToken.class));
        Intrinsics.d(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.encodeToString(kSerializerSerializer, rtbToken);
    }

    public final BiddingTokenInfo encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    /* JADX INFO: renamed from: getEnterBackgroundTime$vungle_ads_release, reason: from getter */
    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    /* JADX INFO: renamed from: getOrdinalView$vungle_ads_release, reason: from getter */
    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final void onPause$vungle_ads_release() {
        Logger.INSTANCE.d(TAG, "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    public final void onResume$vungle_ads_release() {
        Logger.INSTANCE.d(TAG, "BidTokenEncoder#onForeground()");
        if (System.currentTimeMillis() > this.enterBackgroundTime + ConfigManager.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j) {
        this.enterBackgroundTime = j;
    }

    public final void setOrdinalView$vungle_ads_release(int i2) {
        this.ordinalView = i2;
    }
}
