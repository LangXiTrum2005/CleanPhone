package com.google.android.libraries.ads.mobile.sdk.nativead;

import com.ironsource.X3;
import com.ironsource.mediationsdk.j;
import complexometry.kowloon;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003 !\"R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "Lcomplexometry/attabal;", "Lacidy/dern;", "getAdEventCallback", "()Lacidy/dern;", "setAdEventCallback", "(Lacidy/dern;)V", "adEventCallback", "", "getHeadline", "()Ljava/lang/String;", "headline", "getBody", "body", "getCallToAction", "callToAction", "getAdvertiser", X3.i.F0, "", "getStarRating", "()Ljava/lang/Double;", "starRating", "getStore", X3.i.U, "Lcomplexometry/kowloon;", "getIcon", "()Lcomplexometry/kowloon;", "icon", "Lacidy/saneness;", "getMediaContent", "()Lacidy/saneness;", "mediaContent", "NativeAdType", "NativeMediaAspectRatio", "SwipeGestureDirection", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface NativeAd extends complexometry.attabal {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$NativeAdType[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$NativeAdType[]) from 0x0024: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$NativeAdType[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:37)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeAdType;", "", "NATIVE", "CUSTOM_NATIVE", j.a, "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class NativeAdType {
        NATIVE,
        CUSTOM_NATIVE,
        BANNER;

        static {
            p002kotlin.enums.attabal.attabal(nativeAdTypeArr);
        }

        public NativeAdType() {
            super(str, i);
        }

        public static NativeAdType[] values() {
            return (NativeAdType[]) f19443kowloon.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$NativeMediaAspectRatio[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$NativeMediaAspectRatio[]) from 0x0038: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$NativeMediaAspectRatio[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:57)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeMediaAspectRatio;", "", "UNKNOWN", "ANY", "LANDSCAPE", "PORTRAIT", "SQUARE", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class NativeMediaAspectRatio {
        UNKNOWN,
        ANY,
        LANDSCAPE,
        PORTRAIT,
        SQUARE;

        static {
            p002kotlin.enums.attabal.attabal(nativeMediaAspectRatioArr);
        }

        public NativeMediaAspectRatio() {
            super(str, i);
        }

        public static NativeMediaAspectRatio[] values() {
            return (NativeMediaAspectRatio[]) f19444kowloon.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$SwipeGestureDirection[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$SwipeGestureDirection[]) from 0x0031: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd$SwipeGestureDirection[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:50)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$SwipeGestureDirection;", "", "", "a", "I", "getValue", "()I", "value", "RIGHT", "LEFT", "UP", "DOWN", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class SwipeGestureDirection {
        RIGHT(1),
        LEFT(2),
        UP(4),
        DOWN(8);


        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        static {
            p002kotlin.enums.attabal.attabal(swipeGestureDirectionArr);
        }

        public SwipeGestureDirection(int i) {
            super(str, i);
            this.value = i;
        }

        public static SwipeGestureDirection[] values() {
            return (SwipeGestureDirection[]) f19445kowloon.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    acidy.dern getAdEventCallback();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    String getHeadline();

    kowloon getIcon();

    acidy.saneness getMediaContent();

    Double getStarRating();

    String getStore();

    void setAdEventCallback(acidy.dern dernVar);
}
