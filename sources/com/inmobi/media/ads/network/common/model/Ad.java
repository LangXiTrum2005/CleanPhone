package com.inmobi.media.ads.network.common.model;

import com.inmobi.media.A8;
import com.inmobi.media.Gg;
import com.inmobi.media.Hg;
import com.inmobi.media.O0;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R*\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u00168\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001bR(\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001bR\u001a\u0010+\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001bR\u001a\u0010-\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001bR\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010?\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b?\u0010\u0019\u001a\u0004\b@\u0010\u001bR\u0019\u0010B\u001a\u0004\u0018\u00010A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010G\u001a\u0004\u0018\u00010F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010P\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010\u0019\u001a\u0004\bQ\u0010\u001bR\"\u0010R\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0019\u001a\u0004\bS\u0010\u001b\"\u0004\bT\u0010UR \u0010W\u001a\b\u0012\u0004\u0012\u00020V0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u00102\u001a\u0004\bX\u00104R \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u00102\u001a\u0004\b[\u00104R\u0014\u0010\\\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u0016\u0010]\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0013\u0010`\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/Ad;", "", "<init>", "()V", "Lcom/inmobi/media/Gg;", "getPubContent", "()Lcom/inmobi/media/Gg;", "Lcom/inmobi/media/O0;", "_features", "Lcom/inmobi/media/O0;", "_pubContent", "Lcom/inmobi/media/Gg;", "", "insertionTimestampInMillis", "J", "getInsertionTimestampInMillis", "()J", "setInsertionTimestampInMillis", "(J)V", "expiryTimestampInMillis", "getExpiryTimestampInMillis", "setExpiryTimestampInMillis", "", "value", "markupType", "Ljava/lang/String;", "getMarkupType", "()Ljava/lang/String;", "getMarkupType$annotations", "tracking", "getTracking", "getTracking$annotations", "expiry", "Ljava/lang/Long;", "getExpiry", "()Ljava/lang/Long;", "", "allowAutoRedirection", "Z", "getAllowAutoRedirection", "()Z", "creativeId", "getCreativeId", "impressionId", "getImpressionId", "telemetryMetadataBlob", "getTelemetryMetadataBlob", "", "Lcom/inmobi/media/ads/network/common/model/Viewability;", "viewability", "Ljava/util/List;", "getViewability", "()Ljava/util/List;", "Lorg/json/JSONObject;", "transaction", "Lorg/json/JSONObject;", "getTransaction", "()Lorg/json/JSONObject;", "", "rewards", "Ljava/util/Map;", "getRewards", "()Ljava/util/Map;", "baseEventUrl", "getBaseEventUrl", "Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "metaInfo", "Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "getMetaInfo", "()Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "Lcom/inmobi/media/ads/network/common/model/ContextData;", "contextData", "Lcom/inmobi/media/ads/network/common/model/ContextData;", "getContextData", "()Lcom/inmobi/media/ads/network/common/model/ContextData;", "Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "adQualityControl", "Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "getAdQualityControl", "()Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "bidBundle", "getBidBundle", "webVast", "getWebVast", "setWebVast", "(Ljava/lang/String;)V", "Lcom/inmobi/media/ads/network/common/model/Trackers;", "trackers", "getTrackers$media_release", "Lcom/inmobi/media/ads/network/common/model/TrackingInfo;", "trackingInfo", "getTrackingInfo$media_release", "pubContent", "sf", "getFeatures", "()Lcom/inmobi/media/O0;", X3.a.v, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Ad {

    @A8
    private O0 _features;

    @A8
    private Gg _pubContent;
    private final AdQualityControl adQualityControl;
    private final boolean allowAutoRedirection;
    private final String baseEventUrl;
    private final String bidBundle;
    private final ContextData contextData;

    @A8
    private long expiryTimestampInMillis;
    private final MetaInfo metaInfo;
    private final String sf;

    @A8
    private long insertionTimestampInMillis = System.currentTimeMillis();
    private String markupType = "unknown";
    private final String tracking = "unknown";
    private Long expiry = -1L;
    private final String creativeId = "";
    private final String impressionId = "";
    private final String telemetryMetadataBlob = "";
    private final List<Viewability> viewability = new ArrayList();
    private final JSONObject transaction = new JSONObject();
    private final Map<String, String> rewards = new HashMap();
    private String webVast = "";
    private final List<Trackers> trackers = new ArrayList();
    private final List<TrackingInfo> trackingInfo = new ArrayList();
    private final String pubContent = "";

    public final AdQualityControl getAdQualityControl() {
        return this.adQualityControl;
    }

    public final boolean getAllowAutoRedirection() {
        return this.allowAutoRedirection;
    }

    public final String getBaseEventUrl() {
        return this.baseEventUrl;
    }

    public final String getBidBundle() {
        return this.bidBundle;
    }

    public final ContextData getContextData() {
        return this.contextData;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final Long getExpiry() {
        return this.expiry;
    }

    public final long getExpiryTimestampInMillis() {
        return this.expiryTimestampInMillis;
    }

    public final O0 getFeatures() {
        O0 o0 = this._features;
        if (o0 != null) {
            return o0;
        }
        String str = this.sf;
        if (str == null) {
            return null;
        }
        O0 o1 = new O0(str);
        this._features = o1;
        return o1;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final long getInsertionTimestampInMillis() {
        return this.insertionTimestampInMillis;
    }

    public final String getMarkupType() {
        return this.markupType;
    }

    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public final Gg getPubContent() throws IllegalStateException {
        Gg gg = this._pubContent;
        if (gg != null) {
            return gg;
        }
        Gg ggA = Hg.a(this.pubContent, this.markupType);
        this._pubContent = ggA;
        return ggA;
    }

    public final Map<String, String> getRewards() {
        return this.rewards;
    }

    public final String getTelemetryMetadataBlob() {
        return this.telemetryMetadataBlob;
    }

    public final List<Trackers> getTrackers$media_release() {
        return this.trackers;
    }

    public final String getTracking() {
        return this.tracking;
    }

    public final List<TrackingInfo> getTrackingInfo$media_release() {
        return this.trackingInfo;
    }

    public final JSONObject getTransaction() {
        return this.transaction;
    }

    public final List<Viewability> getViewability() {
        return this.viewability;
    }

    public final String getWebVast() {
        return this.webVast;
    }

    public final void setExpiryTimestampInMillis(long j) {
        this.expiryTimestampInMillis = j;
    }

    public final void setInsertionTimestampInMillis(long j) {
        this.insertionTimestampInMillis = j;
    }

    public final void setWebVast(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.webVast = str;
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getTracking$annotations() {
    }
}
