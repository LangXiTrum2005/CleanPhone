package y5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferAvailabilityListener;
import com.android.billingclient.api.ExternalOfferReportingDetails;
import com.android.billingclient.api.ExternalOfferReportingDetailsListener;
import com.android.billingclient.api.k;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.play_billing.e;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.u;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.internal.auth.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54207b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f54208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f54210e;

    public b(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, wi.b bVar, int i10) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback", 1);
        this.f54210e = alternativeBillingOnlyAvailabilityListener;
        this.f54208c = bVar;
        this.f54209d = i10;
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean w1(int i10, Parcel parcel, Parcel parcel2) {
        switch (this.f54207b) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) e.a(parcel);
                e.b(parcel);
                AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener = (AlternativeBillingOnlyReportingDetailsListener) this.f54210e;
                int i11 = this.f54209d;
                m3 m3Var = m3.BROADCAST_ACTION_UNSPECIFIED;
                d dVar = this.f54208c;
                if (bundle == null) {
                    BillingResult billingResult = k.f7274h;
                    ((wi.b) dVar).d(zzcg.zzb(j3.NULL_BUNDLE_FROM_CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL, 15, billingResult, null, m3Var), i11);
                    alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
                    return true;
                }
                int iA = u.a(bundle, "BillingClient");
                BillingResult billingResultA = k.a(iA, u.f(bundle, "BillingClient"));
                if (iA != 0) {
                    u.h("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iA);
                    ((wi.b) dVar).d(zzcg.zzb(j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 15, billingResultA, null, m3Var), i11);
                    alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, null);
                    return true;
                }
                try {
                    alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
                    return true;
                } catch (JSONException e10) {
                    u.i("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e10);
                    BillingResult billingResult2 = k.f7274h;
                    ((wi.b) dVar).d(zzcg.zzb(j3.ERROR_DECODING_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS, 15, billingResult2, null, m3Var), i11);
                    alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
                    return true;
                }
            case 1:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) e.a(parcel);
                e.b(parcel);
                ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener = (ExternalOfferReportingDetailsListener) this.f54210e;
                int i12 = this.f54209d;
                m3 m3Var2 = m3.BROADCAST_ACTION_UNSPECIFIED;
                d dVar2 = this.f54208c;
                if (bundle2 == null) {
                    BillingResult billingResult3 = k.f7274h;
                    ((wi.b) dVar2).d(zzcg.zzb(j3.NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL, 24, billingResult3, null, m3Var2), i12);
                    externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult3, null);
                    return true;
                }
                int iA2 = u.a(bundle2, "BillingClient");
                BillingResult billingResultA2 = k.a(iA2, u.f(bundle2, "BillingClient"));
                if (iA2 != 0) {
                    u.h("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iA2);
                    ((wi.b) dVar2).d(zzcg.zzb(j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 24, billingResultA2, null, m3Var2), i12);
                    externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA2, null);
                    return true;
                }
                try {
                    externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA2, new ExternalOfferReportingDetails(bundle2.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
                    return true;
                } catch (JSONException e11) {
                    u.i("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e11);
                    BillingResult billingResult4 = k.f7274h;
                    ((wi.b) dVar2).d(zzcg.zzb(j3.ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS, 24, billingResult4, null, m3Var2), i12);
                    externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult4, null);
                    return true;
                }
            case 2:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) e.a(parcel);
                e.b(parcel);
                AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener = (AlternativeBillingOnlyAvailabilityListener) this.f54210e;
                int i13 = this.f54209d;
                m3 m3Var3 = m3.BROADCAST_ACTION_UNSPECIFIED;
                d dVar3 = this.f54208c;
                if (bundle3 == null) {
                    BillingResult billingResult5 = k.f7274h;
                    ((wi.b) dVar3).d(zzcg.zzb(j3.NULL_BUNDLE_FROM_IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL, 14, billingResult5, null, m3Var3), i13);
                    alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult5);
                    return true;
                }
                int iA3 = u.a(bundle3, "BillingClient");
                BillingResult billingResultA3 = k.a(iA3, u.f(bundle3, "BillingClient"));
                if (iA3 != 0) {
                    u.h("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iA3);
                    ((wi.b) dVar3).d(zzcg.zzb(j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 14, billingResultA3, null, m3Var3), i13);
                }
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultA3);
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) e.a(parcel);
                e.b(parcel);
                ExternalOfferAvailabilityListener externalOfferAvailabilityListener = (ExternalOfferAvailabilityListener) this.f54210e;
                int i14 = this.f54209d;
                m3 m3Var4 = m3.BROADCAST_ACTION_UNSPECIFIED;
                d dVar4 = this.f54208c;
                if (bundle4 == null) {
                    BillingResult billingResult6 = k.f7274h;
                    ((wi.b) dVar4).d(zzcg.zzb(j3.NULL_BUNDLE_FROM_IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL, 23, billingResult6, null, m3Var4), i14);
                    externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult6);
                    return true;
                }
                int iA4 = u.a(bundle4, "BillingClient");
                BillingResult billingResultA4 = k.a(iA4, u.f(bundle4, "BillingClient"));
                if (iA4 != 0) {
                    u.h("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iA4);
                    ((wi.b) dVar4).d(zzcg.zzb(j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 23, billingResultA4, null, m3Var4), i14);
                }
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultA4);
                return true;
        }
    }

    public b(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, wi.b bVar, int i10) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback", 1);
        this.f54210e = alternativeBillingOnlyReportingDetailsListener;
        this.f54208c = bVar;
        this.f54209d = i10;
    }

    public b(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, wi.b bVar, int i10) {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback", 1);
        this.f54210e = externalOfferAvailabilityListener;
        this.f54208c = bVar;
        this.f54209d = i10;
    }

    public b(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, wi.b bVar, int i10) {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback", 1);
        this.f54210e = externalOfferReportingDetailsListener;
        this.f54208c = bVar;
        this.f54209d = i10;
    }
}
