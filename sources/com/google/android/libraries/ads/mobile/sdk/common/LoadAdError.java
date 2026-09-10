package com.google.android.libraries.ads.mobile.sdk.common;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3414a2;
import complexometry.ResponseInfo;
import complexometry.apical;
import p002kotlin.Metadata;
import p002kotlin.enums.attabal;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "Lcomplexometry/apical;", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError$ErrorCode;", "code", "", PglCryptUtils.KEY_MESSAGE, "Lcomplexometry/molybdenite;", "responseInfo", "<init>", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError$ErrorCode;Ljava/lang/String;Lcomplexometry/molybdenite;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError$ErrorCode;", "()Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError$ErrorCode;", "saneness", "Ljava/lang/String;", "dern", "Lcomplexometry/molybdenite;", "getResponseInfo", "()Lcomplexometry/molybdenite;", "ErrorCode", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoadAdError extends apical<ErrorCode> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final ErrorCode code;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final ResponseInfo responseInfo;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final String message;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.LoadAdError$ErrorCode[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.LoadAdError$ErrorCode[]) from 0x007b: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.LoadAdError$ErrorCode[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:124)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError$ErrorCode;", "", "", "a", "I", "getValue", "()I", "value", "INTERNAL_ERROR", "INVALID_REQUEST", "NETWORK_ERROR", "NO_FILL", "TIMEOUT", "CANCELLED", "NOT_FOUND", "APP_ID_MISSING", "REQUEST_ID_MISMATCH", "INVALID_AD_RESPONSE", "AD_RESPONSE_ALREADY_USED", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorCode {
        INTERNAL_ERROR(0),
        INVALID_REQUEST(1),
        NETWORK_ERROR(2),
        NO_FILL(3),
        TIMEOUT(4),
        CANCELLED(5),
        NOT_FOUND(7),
        APP_ID_MISSING(8),
        REQUEST_ID_MISMATCH(10),
        INVALID_AD_RESPONSE(11),
        AD_RESPONSE_ALREADY_USED(12);


        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        static {
            attabal.attabal(errorCodeArr);
        }

        public ErrorCode(int i) {
            super(str, i);
            this.value = i;
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) f19411kowloon.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public LoadAdError(ErrorCode code, String message, ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = code;
        this.message = message;
        this.responseInfo = responseInfo;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public ErrorCode getCode() {
        return this.code;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadAdError)) {
            return false;
        }
        LoadAdError loadAdError = (LoadAdError) other;
        return this.code == loadAdError.code && Intrinsics.wireman(this.message, loadAdError.message) && Intrinsics.wireman(this.responseInfo, loadAdError.responseInfo);
    }

    public int hashCode() {
        int iAttabal = licking.attabal(this.message, this.code.hashCode() * 31, 31);
        ResponseInfo responseInfo = this.responseInfo;
        return iAttabal + (responseInfo == null ? 0 : responseInfo.hashCode());
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return "LoadAdError(code=" + this.code + ", message=" + this.message + ", responseInfo=" + this.responseInfo + ")";
    }
}
