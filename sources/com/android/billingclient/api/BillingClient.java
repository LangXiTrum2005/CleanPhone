package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BillingClient {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile PendingPurchasesParams f7079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f7080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile PurchasesUpdatedListener f7081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile UserChoiceBillingListener f7082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f7083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f7084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f7085g;

        public /* synthetic */ Builder(Context context) {
            this.f7080b = context;
        }

        public final boolean a() {
            try {
                Context context = this.f7080b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }

        @NonNull
        public BillingClient build() {
            Context context = this.f7080b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f7081c == null) {
                if (this.f7082d != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (this.f7083e || this.f7084f) {
                    return a() ? new j(context, this) : new a(context, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f7079a == null) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            this.f7079a.getClass();
            if (this.f7081c == null) {
                PendingPurchasesParams pendingPurchasesParams = this.f7079a;
                return a() ? new j(pendingPurchasesParams, context, this) : new a(pendingPurchasesParams, context, this);
            }
            if (this.f7082d == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.f7079a;
                PurchasesUpdatedListener purchasesUpdatedListener = this.f7081c;
                return a() ? new j(pendingPurchasesParams2, context, purchasesUpdatedListener, this) : new a(pendingPurchasesParams2, context, purchasesUpdatedListener, this);
            }
            PendingPurchasesParams pendingPurchasesParams3 = this.f7079a;
            PurchasesUpdatedListener purchasesUpdatedListener2 = this.f7081c;
            UserChoiceBillingListener userChoiceBillingListener = this.f7082d;
            return a() ? new j(pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, this) : new a(pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, this);
        }

        @NonNull
        @zzf
        public Builder enableAlternativeBillingOnly() {
            this.f7083e = true;
            return this;
        }

        @NonNull
        @zzg
        public Builder enableAutoServiceReconnection() {
            this.f7085g = true;
            return this;
        }

        @NonNull
        @zzh
        public Builder enableExternalOffer() {
            this.f7084f = true;
            return this;
        }

        @NonNull
        @zzn
        public Builder enablePendingPurchases(@NonNull PendingPurchasesParams pendingPurchasesParams) {
            this.f7079a = pendingPurchasesParams;
            return this;
        }

        @NonNull
        @zzp
        public Builder enableUserChoiceBilling(@NonNull UserChoiceBillingListener userChoiceBillingListener) {
            this.f7082d = userChoiceBillingListener;
            return this;
        }

        @NonNull
        public Builder setListener(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f7081c = purchasesUpdatedListener;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @NonNull
        @zzf
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";

        @NonNull
        @zzi
        public static final String BILLING_CONFIG = "ggg";

        @NonNull
        @zzh
        public static final String EXTERNAL_OFFER = "kkk";

        @NonNull
        public static final String IN_APP_MESSAGING = "bbb";

        @NonNull
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";

        @NonNull
        public static final String PRODUCT_DETAILS = "fff";

        @NonNull
        public static final String SUBSCRIPTIONS = "subscriptions";

        @NonNull
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @zzk
    @Retention(RetentionPolicy.SOURCE)
    public @interface OnPurchasesUpdatedSubResponseCode {
        public static final int NO_APPLICABLE_SUB_RESPONSE_CODE = 0;
        public static final int PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS = 1;
        public static final int USER_INELIGIBLE = 2;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    @NonNull
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context);
    }

    public abstract void acknowledgePurchase(@NonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @NonNull AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(@NonNull ConsumeParams consumeParams, @NonNull ConsumeResponseListener consumeResponseListener);

    @zzf
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzh
    public abstract void createExternalOfferReportingDetailsAsync(@NonNull ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    @zzi
    public abstract void getBillingConfigAsync(@NonNull GetBillingConfigParams getBillingConfigParams, @NonNull BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    @zzf
    public abstract void isAlternativeBillingOnlyAvailableAsync(@NonNull AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzh
    public abstract void isExternalOfferAvailableAsync(@NonNull ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    @NonNull
    public abstract BillingResult isFeatureSupported(@NonNull String str);

    public abstract boolean isReady();

    @NonNull
    public abstract BillingResult launchBillingFlow(@NonNull Activity activity, @NonNull BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(@NonNull QueryProductDetailsParams queryProductDetailsParams, @NonNull ProductDetailsResponseListener productDetailsResponseListener);

    public abstract void queryPurchasesAsync(@NonNull QueryPurchasesParams queryPurchasesParams, @NonNull PurchasesResponseListener purchasesResponseListener);

    @NonNull
    @zzf
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(@NonNull Activity activity, @NonNull AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @NonNull
    @zzh
    public abstract BillingResult showExternalOfferInformationDialog(@NonNull Activity activity, @NonNull ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    @NonNull
    public abstract BillingResult showInAppMessages(@NonNull Activity activity, @NonNull InAppMessageParams inAppMessageParams, @NonNull InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);
}
