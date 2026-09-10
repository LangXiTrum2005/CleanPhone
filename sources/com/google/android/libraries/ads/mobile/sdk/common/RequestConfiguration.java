package com.google.android.libraries.ads.mobile.sdk.common;

import ads_mobile_sdk.ip0;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.laky;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0006\b\u000e\"#$%J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0014\u0010 ¨\u0006&"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "", "Landroid/content/Context;", "context", "", "competently", "(Landroid/content/Context;)Z", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForChildDirectedTreatment;", "attabal", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForChildDirectedTreatment;", "wireman", "()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForChildDirectedTreatment;", "tagForChildDirectedTreatment", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForUnderAgeOfConsent;", "saneness", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForUnderAgeOfConsent;", "marial", "()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForUnderAgeOfConsent;", "tagForUnderAgeOfConsent", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$MaxAdContentRating;", "dern", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$MaxAdContentRating;", "()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$MaxAdContentRating;", "maxAdContentRating", "", "", "Ljava/util/List;", "beachfront", "()Ljava/util/List;", "testDeviceIds", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$PublisherPrivacyPersonalizationState;", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$PublisherPrivacyPersonalizationState;", "()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$PublisherPrivacyPersonalizationState;", "publisherPrivacyPersonalizationState", "MaxAdContentRating", "PublisherPrivacyPersonalizationState", "TagForChildDirectedTreatment", "TagForUnderAgeOfConsent", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RequestConfiguration {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final TagForChildDirectedTreatment tagForChildDirectedTreatment;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final MaxAdContentRating maxAdContentRating;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final TagForUnderAgeOfConsent tagForUnderAgeOfConsent;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List testDeviceIds;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$MaxAdContentRating[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$MaxAdContentRating[]) from 0x0042: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$MaxAdContentRating[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:67)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$MaxAdContentRating;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "MAX_AD_CONTENT_RATING_UNSPECIFIED", "MAX_AD_CONTENT_RATING_G", "MAX_AD_CONTENT_RATING_PG", "MAX_AD_CONTENT_RATING_T", "MAX_AD_CONTENT_RATING_MA", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class MaxAdContentRating {
        MAX_AD_CONTENT_RATING_UNSPECIFIED(""),
        MAX_AD_CONTENT_RATING_G(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G),
        MAX_AD_CONTENT_RATING_PG(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG),
        MAX_AD_CONTENT_RATING_T(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_T),
        MAX_AD_CONTENT_RATING_MA(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_MA);


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f19419arytenoidectomy;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String value;

        static {
            f19419arytenoidectomy = p002kotlin.enums.attabal.attabal(maxAdContentRatingArr);
        }

        public MaxAdContentRating(String str) {
            super(str, i);
            this.value = str;
        }

        public static pussyfooter.attabal a() {
            return f19419arytenoidectomy;
        }

        public static MaxAdContentRating[] values() {
            return (MaxAdContentRating[]) f19420kowloon.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$PublisherPrivacyPersonalizationState[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$PublisherPrivacyPersonalizationState[]) from 0x0024: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$PublisherPrivacyPersonalizationState[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:37)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$PublisherPrivacyPersonalizationState;", "", "", "a", "I", "getValue", "()I", "value", "DEFAULT", "ENABLED", "DISABLED", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f19421arytenoidectomy;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        static {
            f19421arytenoidectomy = p002kotlin.enums.attabal.attabal(publisherPrivacyPersonalizationStateArr);
        }

        public PublisherPrivacyPersonalizationState(int i) {
            super(str, i);
            this.value = i;
        }

        public static pussyfooter.attabal a() {
            return f19421arytenoidectomy;
        }

        public static PublisherPrivacyPersonalizationState[] values() {
            return (PublisherPrivacyPersonalizationState[]) f19422kowloon.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$TagForChildDirectedTreatment[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$TagForChildDirectedTreatment[]) from 0x0025: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$TagForChildDirectedTreatment[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:38)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForChildDirectedTreatment;", "", "", "a", "I", "getValue", "()I", "value", "TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED", "TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE", "TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class TagForChildDirectedTreatment {
        TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED(-1),
        TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE(0),
        TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE(1);


        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        static {
            p002kotlin.enums.attabal.attabal(tagForChildDirectedTreatmentArr);
        }

        public TagForChildDirectedTreatment(int i) {
            super(str, i);
            this.value = i;
        }

        public static TagForChildDirectedTreatment[] values() {
            return (TagForChildDirectedTreatment[]) f19423kowloon.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$TagForUnderAgeOfConsent[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$TagForUnderAgeOfConsent[]) from 0x0025: INVOKE (r0v1 com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration$TagForUnderAgeOfConsent[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:38)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForUnderAgeOfConsent;", "", "", "a", "I", "getValue", "()I", "value", "TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED", "TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE", "TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class TagForUnderAgeOfConsent {
        TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED(-1),
        TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE(0),
        TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE(1);


        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        static {
            p002kotlin.enums.attabal.attabal(tagForUnderAgeOfConsentArr);
        }

        public TagForUnderAgeOfConsent(int i) {
            super(str, i);
            this.value = i;
        }

        public static TagForUnderAgeOfConsent[] values() {
            return (TagForUnderAgeOfConsent[]) f19424kowloon.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$attabal;", "", "<init>", "()V", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "attabal", "()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForChildDirectedTreatment;", "tagForChildDirectedTreatment", "wireman", "(Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForChildDirectedTreatment;)Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$attabal;", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForUnderAgeOfConsent;", "tagForUnderAgeOfConsent", "marial", "(Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$TagForUnderAgeOfConsent;)Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$attabal;", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$MaxAdContentRating;", "maxAdContentRating", "saneness", "(Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$MaxAdContentRating;)Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$attabal;", "", "", "testDeviceIds", "beachfront", "(Ljava/util/List;)Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$attabal;", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$PublisherPrivacyPersonalizationState;", "publisherPrivacyPersonalizationState", "dern", "(Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$PublisherPrivacyPersonalizationState;)Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration$attabal;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public TagForChildDirectedTreatment f19425attabal = TagForChildDirectedTreatment.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public TagForUnderAgeOfConsent f19428saneness = TagForUnderAgeOfConsent.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public MaxAdContentRating f19426dern = MaxAdContentRating.MAX_AD_CONTENT_RATING_UNSPECIFIED;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final ArrayList f19429wireman = adultoid.competently("B3EEABB8EE11C2BE770B684D95219ECB");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public PublisherPrivacyPersonalizationState f19427marial = PublisherPrivacyPersonalizationState.DEFAULT;

        public final RequestConfiguration attabal() {
            return new RequestConfiguration(this.f19425attabal, this.f19428saneness, this.f19426dern, this.f19429wireman, this.f19427marial, 0);
        }

        public final attabal beachfront(List<String> testDeviceIds) {
            Intrinsics.checkNotNullParameter(testDeviceIds, "testDeviceIds");
            this.f19429wireman.clear();
            this.f19429wireman.addAll(testDeviceIds);
            this.f19429wireman.add("B3EEABB8EE11C2BE770B684D95219ECB");
            return this;
        }

        public final attabal dern(PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            Intrinsics.checkNotNullParameter(publisherPrivacyPersonalizationState, "publisherPrivacyPersonalizationState");
            this.f19427marial = publisherPrivacyPersonalizationState;
            return this;
        }

        public final attabal marial(TagForUnderAgeOfConsent tagForUnderAgeOfConsent) {
            Intrinsics.checkNotNullParameter(tagForUnderAgeOfConsent, "tagForUnderAgeOfConsent");
            this.f19428saneness = tagForUnderAgeOfConsent;
            return this;
        }

        public final attabal saneness(MaxAdContentRating maxAdContentRating) {
            Intrinsics.checkNotNullParameter(maxAdContentRating, "maxAdContentRating");
            this.f19426dern = maxAdContentRating;
            return this;
        }

        public final attabal wireman(TagForChildDirectedTreatment tagForChildDirectedTreatment) {
            Intrinsics.checkNotNullParameter(tagForChildDirectedTreatment, "tagForChildDirectedTreatment");
            this.f19425attabal = tagForChildDirectedTreatment;
            return this;
        }
    }

    public /* synthetic */ RequestConfiguration(TagForChildDirectedTreatment tagForChildDirectedTreatment, TagForUnderAgeOfConsent tagForUnderAgeOfConsent, MaxAdContentRating maxAdContentRating, ArrayList arrayList, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, int i) {
        this(tagForChildDirectedTreatment, tagForUnderAgeOfConsent, maxAdContentRating, arrayList, publisherPrivacyPersonalizationState);
    }

    public final attabal attabal() {
        return new attabal().wireman(this.tagForChildDirectedTreatment).marial(this.tagForUnderAgeOfConsent).saneness(this.maxAdContentRating).dern(this.publisherPrivacyPersonalizationState).beachfront(this.testDeviceIds);
    }

    public final List<String> beachfront() {
        return this.testDeviceIds;
    }

    public final boolean competently(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List list = this.testDeviceIds;
        laky lakyVar = ip0.f;
        return CollectionsKt.permissivist(list, laky.dern(context));
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.publisherPrivacyPersonalizationState;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final TagForUnderAgeOfConsent getTagForUnderAgeOfConsent() {
        return this.tagForUnderAgeOfConsent;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final MaxAdContentRating getMaxAdContentRating() {
        return this.maxAdContentRating;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final TagForChildDirectedTreatment getTagForChildDirectedTreatment() {
        return this.tagForChildDirectedTreatment;
    }

    public RequestConfiguration(TagForChildDirectedTreatment tagForChildDirectedTreatment, TagForUnderAgeOfConsent tagForUnderAgeOfConsent, MaxAdContentRating maxAdContentRating, ArrayList arrayList, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
        this.tagForChildDirectedTreatment = tagForChildDirectedTreatment;
        this.tagForUnderAgeOfConsent = tagForUnderAgeOfConsent;
        this.maxAdContentRating = maxAdContentRating;
        this.testDeviceIds = arrayList;
        this.publisherPrivacyPersonalizationState = publisherPrivacyPersonalizationState;
    }
}
