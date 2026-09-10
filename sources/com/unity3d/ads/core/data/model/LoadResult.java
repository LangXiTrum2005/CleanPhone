package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import d5.u;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult;", "", "()V", "Companion", "Failure", "Success", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "Lcom/unity3d/ads/core/data/model/LoadResult$Success;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class LoadResult {
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "error", "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "message", "", "throwable", "", "reason", "reasonDebug", "isScarAd", "", "(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Z)V", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "()Z", "getMessage", "()Ljava/lang/String;", "getReason", "getReasonDebug", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class Failure extends LoadResult {
        private final ErrorOuterClass.PublicErrorCode error;
        private final boolean isScarAd;
        private final String message;
        private final String reason;
        private final String reasonDebug;
        private final Throwable throwable;

        public /* synthetic */ Failure(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th2, String str2, String str3, boolean z10, int i10, g gVar) {
            this(publicErrorCode, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : th2, str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th2, String str2, String str3, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                publicErrorCode = failure.error;
            }
            if ((i10 & 2) != 0) {
                str = failure.message;
            }
            if ((i10 & 4) != 0) {
                th2 = failure.throwable;
            }
            if ((i10 & 8) != 0) {
                str2 = failure.reason;
            }
            if ((i10 & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            if ((i10 & 32) != 0) {
                z10 = failure.isScarAd;
            }
            String str4 = str3;
            boolean z11 = z10;
            return failure.copy(publicErrorCode, str, th2, str2, str4, z11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ErrorOuterClass.PublicErrorCode getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsScarAd() {
            return this.isScarAd;
        }

        public final Failure copy(ErrorOuterClass.PublicErrorCode error, String message, Throwable throwable, String reason, String reasonDebug, boolean isScarAd) {
            n.f(error, "error");
            n.f(reason, "reason");
            return new Failure(error, message, throwable, reason, reasonDebug, isScarAd);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.error == failure.error && n.a(this.message, failure.message) && n.a(this.throwable, failure.throwable) && n.a(this.reason, failure.reason) && n.a(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd;
        }

        public final ErrorOuterClass.PublicErrorCode getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [int] */
        /* JADX WARN: Type inference failed for: r4v2, types: [int] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th2 = this.throwable;
            int iE = u.e((iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.reason);
            String str2 = this.reasonDebug;
            int iHashCode3 = (iE + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z10 = this.isScarAd;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode3 + r10;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(error=");
            sb2.append(this.error);
            sb2.append(", message=");
            sb2.append(this.message);
            sb2.append(", throwable=");
            sb2.append(this.throwable);
            sb2.append(", reason=");
            sb2.append(this.reason);
            sb2.append(", reasonDebug=");
            sb2.append(this.reasonDebug);
            sb2.append(", isScarAd=");
            return e.t(sb2, this.isScarAd, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(ErrorOuterClass.PublicErrorCode error, String str, Throwable th2, String reason, String str2, boolean z10) {
            super(null);
            n.f(error, "error");
            n.f(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th2;
            this.reason = reason;
            this.reasonDebug = str2;
            this.isScarAd = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult$Success;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class Success extends LoadResult {
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AdObject adObject) {
            super(null);
            n.f(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdObject getAdObject() {
            return this.adObject;
        }

        public final Success copy(AdObject adObject) {
            n.f(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && n.a(this.adObject, ((Success) other).adObject);
        }

        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    public /* synthetic */ LoadResult(g gVar) {
        this();
    }

    private LoadResult() {
    }
}
