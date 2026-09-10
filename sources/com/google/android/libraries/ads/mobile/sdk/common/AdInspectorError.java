package com.google.android.libraries.ads.mobile.sdk.common;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import complexometry.apical;
import p002kotlin.Metadata;
import p002kotlin.enums.attabal;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/AdInspectorError;", "Lcomplexometry/apical;", "Lcom/google/android/libraries/ads/mobile/sdk/common/AdInspectorError$ErrorCode;", "code", "", PglCryptUtils.KEY_MESSAGE, "<init>", "(Lcom/google/android/libraries/ads/mobile/sdk/common/AdInspectorError$ErrorCode;Ljava/lang/String;)V", "attabal", "Lcom/google/android/libraries/ads/mobile/sdk/common/AdInspectorError$ErrorCode;", "getCode", "()Lcom/google/android/libraries/ads/mobile/sdk/common/AdInspectorError$ErrorCode;", "saneness", "Ljava/lang/String;", "()Ljava/lang/String;", "ErrorCode", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AdInspectorError extends apical<ErrorCode> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final ErrorCode code;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final String message;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError$ErrorCode[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError$ErrorCode[]) from 0x002e: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError$ErrorCode[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:47)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/AdInspectorError$ErrorCode;", "", "", "a", "I", "getValue", "()I", "value", "INTERNAL_ERROR", "FAILED_TO_LOAD", "NOT_IN_TEST_MODE", "ALREADY_OPEN", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorCode {
        INTERNAL_ERROR(0),
        FAILED_TO_LOAD(1),
        NOT_IN_TEST_MODE(2),
        ALREADY_OPEN(3);


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
            return (ErrorCode[]) f19403kowloon.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public AdInspectorError(ErrorCode code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = code;
        this.message = message;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public String getMessage() {
        return this.message;
    }
}
