package com.google.android.libraries.ads.mobile.sdk.initialization;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import p002kotlin.Metadata;
import p002kotlin.enums.attabal;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/initialization/AdapterStatus;", "", InMobiNetworkValues.DESCRIPTION, "", "getDescription", "()Ljava/lang/String;", "initializationState", "Lcom/google/android/libraries/ads/mobile/sdk/initialization/AdapterStatus$InitializationState;", "getInitializationState", "()Lcom/google/android/libraries/ads/mobile/sdk/initialization/AdapterStatus$InitializationState;", "latency", "", "getLatency", "()I", "InitializationState", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AdapterStatus {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus$InitializationState[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus$InitializationState[]) from 0x0038: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus$InitializationState[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:57)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/initialization/AdapterStatus$InitializationState;", "", "", "a", "I", "getState", "()I", "state", "NOT_STARTED", "INITIALIZING", "COMPLETE", "TIMED_OUT", "FAILED", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class InitializationState {
        NOT_STARTED(0),
        INITIALIZING(1),
        COMPLETE(2),
        TIMED_OUT(3),
        FAILED(4);


        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int state;

        static {
            attabal.attabal(initializationStateArr);
        }

        public InitializationState(int i) {
            super(str, i);
            this.state = i;
        }

        public static InitializationState[] values() {
            return (InitializationState[]) f19430kowloon.clone();
        }

        public final int getState() {
            return this.state;
        }
    }

    String getDescription();

    InitializationState getInitializationState();

    int getLatency();
}
