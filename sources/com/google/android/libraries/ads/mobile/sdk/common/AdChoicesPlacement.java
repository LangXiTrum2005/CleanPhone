package com.google.android.libraries.ads.mobile.sdk.common;

import p002kotlin.Metadata;
import p002kotlin.enums.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement[]) from 0x002e: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:47)
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesPlacement;", "", "", "a", "I", "getValue", "()I", "value", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_RIGHT", "BOTTOM_LEFT", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AdChoicesPlacement {
    TOP_LEFT(0),
    TOP_RIGHT(1),
    BOTTOM_RIGHT(2),
    BOTTOM_LEFT(3);


    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    static {
        attabal.attabal(adChoicesPlacementArr);
    }

    public AdChoicesPlacement(int i) {
        super(str, i);
        this.value = i;
    }

    public static AdChoicesPlacement[] values() {
        return (AdChoicesPlacement[]) f19400kowloon.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
