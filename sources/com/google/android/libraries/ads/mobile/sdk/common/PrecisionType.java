package com.google.android.libraries.ads.mobile.sdk.common;

import p002kotlin.Metadata;
import p002kotlin.enums.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.PrecisionType[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.PrecisionType[]) from 0x002e: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.PrecisionType[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:47)
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/PrecisionType;", "", "UNKNOWN", "ESTIMATED", "PUBLISHER_PROVIDED", "PRECISE", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class PrecisionType {
    UNKNOWN,
    ESTIMATED,
    PUBLISHER_PROVIDED,
    PRECISE;

    static {
        attabal.attabal(precisionTypeArr);
    }

    public PrecisionType() {
        super(str, i);
    }

    public static PrecisionType[] values() {
        return (PrecisionType[]) f19412kowloon.clone();
    }
}
