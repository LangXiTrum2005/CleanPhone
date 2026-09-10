package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class RequestConfiguration {

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgeRestrictedTreatment f10649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PublisherPrivacyPersonalizationState f10654f;

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @NonNull
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AgeRestrictedTreatment f10655a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10656b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10657c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f10658d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f10659e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PublisherPrivacyPersonalizationState f10660f = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.f10655a, this.f10656b, this.f10657c, this.f10658d, this.f10659e, this.f10660f);
        }

        @NonNull
        public Builder setAgeRestrictedTreatment(AgeRestrictedTreatment ageRestrictedTreatment) {
            this.f10655a = ageRestrictedTreatment;
            return this;
        }

        @NonNull
        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.f10658d = null;
                return this;
            }
            if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.f10658d = str;
                return this;
            }
            zzo.zzi("Invalid value passed to setMaxAdContentRating: ".concat(str));
            return this;
        }

        @NonNull
        public Builder setPublisherPrivacyPersonalizationState(@NonNull PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.f10660f = publisherPrivacyPersonalizationState;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForChildDirectedTreatment(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f10656b = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 57);
            sb2.append("Invalid value passed to setTagForChildDirectedTreatment: ");
            sb2.append(i10);
            zzo.zzi(sb2.toString());
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForUnderAgeOfConsent(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f10657c = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 52);
            sb2.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
            sb2.append(i10);
            zzo.zzi(sb2.toString());
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(List<String> list) {
            ArrayList arrayList = this.f10659e;
            arrayList.clear();
            if (list != null) {
                arrayList.addAll(list);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10662a;

        PublisherPrivacyPersonalizationState(int i10) {
            this.f10662a = i10;
        }

        public int getValue() {
            return this.f10662a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForChildDirectedTreatment {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(AgeRestrictedTreatment ageRestrictedTreatment, int i10, int i11, String str, ArrayList arrayList, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
        this.f10649a = ageRestrictedTreatment;
        this.f10650b = i10;
        this.f10651c = i11;
        this.f10652d = str;
        this.f10653e = arrayList;
        this.f10654f = publisherPrivacyPersonalizationState;
    }

    @NonNull
    public AgeRestrictedTreatment getAgeRestrictedTreatment() {
        AgeRestrictedTreatment ageRestrictedTreatment = this.f10649a;
        return ageRestrictedTreatment == null ? AgeRestrictedTreatment.UNSPECIFIED : ageRestrictedTreatment;
    }

    @NonNull
    public String getMaxAdContentRating() {
        String str = this.f10652d;
        return str == null ? "" : str;
    }

    @NonNull
    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.f10654f;
    }

    @Deprecated
    public int getTagForChildDirectedTreatment() {
        return this.f10650b;
    }

    @Deprecated
    public int getTagForUnderAgeOfConsent() {
        return this.f10651c;
    }

    @NonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.f10653e);
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setAgeRestrictedTreatment(this.f10649a);
        builder.setTagForChildDirectedTreatment(this.f10650b);
        builder.setTagForUnderAgeOfConsent(this.f10651c);
        builder.setMaxAdContentRating(this.f10652d);
        builder.setTestDeviceIds(this.f10653e);
        builder.setPublisherPrivacyPersonalizationState(this.f10654f);
        return builder;
    }

    @Nullable
    public final AgeRestrictedTreatment zza() {
        return this.f10649a;
    }
}
