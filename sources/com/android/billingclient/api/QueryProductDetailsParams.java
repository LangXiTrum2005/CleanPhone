package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.r;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class QueryProductDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f7196a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f7197a;

        @NonNull
        public QueryProductDetailsParams build() {
            if (this.f7197a != null) {
                return new QueryProductDetailsParams(this);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f7197a = r.t(list);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Product {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7199b;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f7200a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f7201b;

            @NonNull
            public Product build() {
                if ("first_party".equals(this.f7201b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f7200a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f7201b != null) {
                    return new Product(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.f7200a = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.f7201b = str;
                return this;
            }
        }

        public /* synthetic */ Product(Builder builder) {
            this.f7198a = builder.f7200a;
            this.f7199b = builder.f7201b;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder();
        }

        @NonNull
        public final String zza() {
            return this.f7198a;
        }

        @NonNull
        public final String zzb() {
            return this.f7199b;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder) {
        this.f7196a = builder.f7197a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public final r zza() {
        return this.f7196a;
    }

    @NonNull
    public final String zzb() {
        return ((Product) this.f7196a.get(0)).zzb();
    }
}
