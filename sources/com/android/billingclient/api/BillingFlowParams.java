package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class BillingFlowParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SubscriptionUpdateParams f7090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f7091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f7092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7093g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f7096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f7097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SubscriptionUpdateParams.Builder f7099f;

        @NonNull
        public BillingFlowParams build() {
            r rVarT;
            ArrayList arrayList = this.f7097d;
            boolean z10 = true;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList arrayList2 = this.f7096c;
            boolean z12 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z11) {
                ArrayList arrayList3 = this.f7096c;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        if (((ProductDetailsParams) it.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.f7097d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f7097d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f7097d.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList4 = this.f7097d;
                    int size = arrayList4.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList4.get(i10);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strZzd = skuDetails.zzd();
                    ArrayList arrayList5 = this.f7097d;
                    int size2 = arrayList5.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList5.get(i11);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            if ((!z11 || ((SkuDetails) this.f7097d.get(0)).zzd().isEmpty()) && (!z12 || ((ProductDetailsParams) this.f7096c.get(0)).zza().zza().isEmpty())) {
                z10 = false;
            }
            billingFlowParams.f7087a = z10;
            billingFlowParams.f7088b = this.f7094a;
            billingFlowParams.f7089c = this.f7095b;
            billingFlowParams.f7090d = this.f7099f.build();
            ArrayList arrayList6 = this.f7097d;
            billingFlowParams.f7092f = arrayList6 != null ? new ArrayList(arrayList6) : new ArrayList();
            billingFlowParams.f7093g = this.f7098e;
            ArrayList arrayList7 = this.f7096c;
            if (arrayList7 != null) {
                rVarT = r.t(arrayList7);
            } else {
                p pVar = r.f24456b;
                rVarT = v.f24489e;
            }
            billingFlowParams.f7091e = rVarT;
            return billingFlowParams;
        }

        @NonNull
        public Builder setIsOfferPersonalized(boolean z10) {
            this.f7098e = z10;
            return this;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.f7094a = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.f7095b = str;
            return this;
        }

        @NonNull
        public Builder setProductDetailsParamsList(@NonNull List<ProductDetailsParams> list) {
            this.f7096c = new ArrayList(list);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f7097d = arrayList;
            return this;
        }

        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.f7104a);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.f7106c);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.f7105b);
            this.f7099f = builderNewBuilder;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class ProductDetailsParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductDetails f7100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7101b;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ProductDetails f7102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f7103b;

            @NonNull
            public ProductDetailsParams build() {
                if (this.f7102a != null) {
                    return new ProductDetailsParams(this);
                }
                throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
            }

            @NonNull
            public Builder setOfferToken(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f7103b = str;
                return this;
            }

            @NonNull
            public Builder setProductDetails(@NonNull ProductDetails productDetails) {
                this.f7102a = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.getOfferToken() != null) {
                        this.f7103b = oneTimePurchaseOfferDetails.getOfferToken();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder) {
            this.f7100a = builder.f7102a;
            this.f7101b = builder.f7103b;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder();
        }

        @NonNull
        public final ProductDetails zza() {
            return this.f7100a;
        }

        @Nullable
        public final String zzb() {
            return this.f7101b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class SubscriptionUpdateParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7106c;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f7107a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f7108b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f7109c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f7110d;

            @NonNull
            public SubscriptionUpdateParams build() {
                boolean z10 = true;
                if (TextUtils.isEmpty(this.f7107a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f7108b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f7109c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams();
                subscriptionUpdateParams.f7104a = this.f7107a;
                subscriptionUpdateParams.f7106c = this.f7110d;
                subscriptionUpdateParams.f7105b = this.f7108b;
                return subscriptionUpdateParams;
            }

            @NonNull
            public Builder setOldPurchaseToken(@NonNull String str) {
                this.f7107a = str;
                return this;
            }

            @NonNull
            @zze
            public Builder setOriginalExternalTransactionId(@NonNull String str) {
                this.f7108b = str;
                return this;
            }

            @NonNull
            public Builder setSubscriptionReplacementMode(int i10) {
                this.f7110d = i10;
                return this;
            }

            @NonNull
            @Deprecated
            public final Builder zzb(@NonNull String str) {
                this.f7107a = str;
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        @NonNull
        public static Builder newBuilder() {
            Builder builder = new Builder();
            builder.f7110d = 0;
            return builder;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
        builderNewBuilder.f7109c = true;
        builder.f7099f = builderNewBuilder;
        return builder;
    }

    public int zza() {
        return 0;
    }

    public final int zzb() {
        return this.f7090d.f7106c;
    }

    public long zzc() {
        return 0L;
    }

    @Nullable
    public final String zze() {
        return this.f7088b;
    }

    @Nullable
    public final String zzf() {
        return this.f7089c;
    }

    @Nullable
    public String zzg() {
        return null;
    }

    @Nullable
    public final String zzh() {
        return this.f7090d.f7104a;
    }

    @Nullable
    public final String zzi() {
        return this.f7090d.f7105b;
    }

    @NonNull
    public final ArrayList zzj() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f7092f);
        return arrayList;
    }

    @NonNull
    public final List zzk() {
        return this.f7091e;
    }

    public final boolean zzs() {
        return this.f7093g;
    }
}
