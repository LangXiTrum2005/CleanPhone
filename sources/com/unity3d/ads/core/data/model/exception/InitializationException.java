package com.unity3d.ads.core.data.model.exception;

import cn.d2;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.UnityAdsErrorKt;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001!B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "throwable", "", "reason", "reasonDebug", IronSourceConstants.EVENTS_ERROR_CODE, "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;)V", "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "getMessage", "()Ljava/lang/String;", "getReason", "getReasonDebug", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class InitializationException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ErrorOuterClass.PublicErrorCode errorCode;
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException$Companion;", "", "()V", "parseFrom", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final InitializationException parseFrom(Exception e10) {
            String str;
            n.f(e10, "e");
            if (e10 instanceof d2 ? true : e10 instanceof NetworkTimeoutException) {
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_TIMEOUT, e10, "timeout", e10.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT);
            }
            if (e10 instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e10;
                return new InitializationException(gatewayException.getMessage(), gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug(), gatewayException.getErrorCode());
            }
            if (!(e10 instanceof UnityAdsNetworkException)) {
                return e10 instanceof InitializationException ? (InitializationException) e10 : new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_UNKNOWN_ERROR, e10, "unknown", e10.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN);
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e10;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_NETWORK_ERROR, e10, str, unityAdsNetworkException.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NETWORK);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th2, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : publicErrorCode);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th2, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th2 = initializationException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        if ((i10 & 16) != 0) {
            publicErrorCode = initializationException.errorCode;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        String str4 = str2;
        return initializationException.copy(str, th2, str4, str3, publicErrorCode2);
    }

    public final String component1() {
        return getMessage();
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final InitializationException copy(String message, Throwable throwable, String reason, String reasonDebug, ErrorOuterClass.PublicErrorCode errorCode) {
        n.f(message, "message");
        n.f(reason, "reason");
        return new InitializationException(message, throwable, reason, reasonDebug, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) other;
        return n.a(getMessage(), initializationException.getMessage()) && n.a(this.throwable, initializationException.throwable) && n.a(this.reason, initializationException.reason) && n.a(this.reasonDebug, initializationException.reasonDebug) && this.errorCode == initializationException.errorCode;
    }

    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
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

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Throwable th2 = this.throwable;
        int iE = u.e((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.reason);
        String str = this.reasonDebug;
        int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        ErrorOuterClass.PublicErrorCode publicErrorCode = this.errorCode;
        return iHashCode2 + (publicErrorCode != null ? publicErrorCode.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String message, Throwable th2, String reason, String str, ErrorOuterClass.PublicErrorCode publicErrorCode) {
        super(message);
        n.f(message, "message");
        n.f(reason, "reason");
        this.message = message;
        this.throwable = th2;
        this.reason = reason;
        this.reasonDebug = str;
        this.errorCode = publicErrorCode;
    }
}
