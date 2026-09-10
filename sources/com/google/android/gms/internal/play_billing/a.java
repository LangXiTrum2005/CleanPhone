package com.google.android.gms.internal.play_billing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.android.billingclient.api.zzcg;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.google.android.gms.internal.auth.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i10) {
        super(str, 1);
        this.f24212b = i10;
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean w1(int i10, Parcel parcel, Parcel parcel2) {
        switch (this.f24212b) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) e.a(parcel);
                e.b(parcel);
                com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) this;
                ResultReceiver resultReceiver = eVar.f7258d;
                if (bundle != null) {
                    if (bundle.containsKey("RESPONSE_CODE")) {
                        int iA = u.a(bundle, "BillingClient");
                        if (iA != 0) {
                            u.h("BillingClient", "Unable to launch intent for alternative billing only dialog" + iA);
                            resultReceiver.send(iA, bundle);
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                            if (pendingIntent == null) {
                                u.g("BillingClient", "User has acknowledged the alternative billing only dialog before.");
                                resultReceiver.send(0, bundle);
                            } else {
                                try {
                                    Activity activity = (Activity) eVar.f7257c.get();
                                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
                                    intent.putExtra("alternative_billing_only_dialog_result_receiver", resultReceiver);
                                    intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
                                    activity.startActivity(intent);
                                } catch (RuntimeException e10) {
                                    u.i("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e10);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("RESPONSE_CODE", 6);
                                    bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
                                    bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
                                    String name = e10.getClass().getName();
                                    String message = e10.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
                                    resultReceiver.send(6, bundle2);
                                }
                            }
                        }
                    } else {
                        u.h("BillingClient", "Response bundle doesn't contain a response code");
                        resultReceiver.send(6, bundle);
                    }
                    break;
                } else {
                    resultReceiver.send(6, null);
                }
                return true;
            case 1:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) e.a(parcel);
                e.b(parcel);
                com.android.billingclient.api.f fVar = (com.android.billingclient.api.f) this;
                int i11 = fVar.f7261e;
                m3 m3Var = m3.BROADCAST_ACTION_UNSPECIFIED;
                y5.d dVar = fVar.f7260d;
                BillingConfigResponseListener billingConfigResponseListener = fVar.f7259c;
                if (bundle3 != null) {
                    int iA2 = u.a(bundle3, "BillingClient");
                    String strF = u.f(bundle3, "BillingClient");
                    BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(iA2);
                    builderNewBuilder.setDebugMessage(strF);
                    if (iA2 != 0) {
                        u.h("BillingClient", "getBillingConfig() failed. Response code: " + iA2);
                        BillingResult billingResultBuild = builderNewBuilder.build();
                        ((wi.b) dVar).d(zzcg.zzb(j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 13, billingResultBuild, null, m3Var), i11);
                        billingConfigResponseListener.onBillingConfigResponse(billingResultBuild, null);
                    } else if (bundle3.containsKey("BILLING_CONFIG")) {
                        try {
                            billingConfigResponseListener.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle3.getString("BILLING_CONFIG")));
                        } catch (JSONException e11) {
                            u.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e11);
                            BillingResult billingResult = com.android.billingclient.api.k.f7274h;
                            ((wi.b) dVar).d(zzcg.zzb(j3.ERROR_DECODING_BILLING_CONFIG_DATA, 13, billingResult, null, m3Var), i11);
                            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
                        }
                    } else {
                        u.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        builderNewBuilder.setResponseCode(6);
                        BillingResult billingResultBuild2 = builderNewBuilder.build();
                        ((wi.b) dVar).d(zzcg.zzb(j3.MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE, 13, billingResultBuild2, null, m3Var), i11);
                        billingConfigResponseListener.onBillingConfigResponse(billingResultBuild2, null);
                    }
                    break;
                } else {
                    BillingResult billingResult2 = com.android.billingclient.api.k.f7274h;
                    ((wi.b) dVar).d(zzcg.zzb(j3.NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL, 13, billingResult2, null, m3Var), i11);
                    billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) e.a(parcel);
                e.b(parcel);
                com.android.billingclient.api.g gVar = (com.android.billingclient.api.g) this;
                ResultReceiver resultReceiver2 = gVar.f7263d;
                if (bundle4 == null) {
                    resultReceiver2.send(6, null);
                    return true;
                }
                if (!bundle4.containsKey("RESPONSE_CODE")) {
                    u.h("BillingClient", "Response bundle doesn't contain a response code");
                    resultReceiver2.send(6, bundle4);
                    return true;
                }
                int iA3 = u.a(bundle4, "BillingClient");
                if (iA3 != 0) {
                    u.h("BillingClient", "Unable to launch intent for external offer dialog" + iA3);
                    resultReceiver2.send(iA3, bundle4);
                    return true;
                }
                PendingIntent pendingIntent2 = (PendingIntent) bundle4.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
                if (pendingIntent2 == null) {
                    u.h("BillingClient", "The PendingIntent for the external offer dialog is null");
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("RESPONSE_CODE", 6);
                    bundle5.putString("DEBUG_MESSAGE", "An internal error occurred.");
                    resultReceiver2.send(6, bundle5);
                    return true;
                }
                try {
                    Activity activity2 = (Activity) gVar.f7262c.get();
                    Intent intent2 = new Intent(activity2, (Class<?>) ProxyBillingActivityV2.class);
                    intent2.putExtra("external_payment_dialog_result_receiver", resultReceiver2);
                    intent2.putExtra("external_payment_dialog_pending_intent", pendingIntent2);
                    activity2.startActivity(intent2);
                    return true;
                } catch (RuntimeException e12) {
                    u.i("BillingClient", "Runtime error while launching intent for the external offer dialog.", e12);
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt("RESPONSE_CODE", 6);
                    bundle6.putString("DEBUG_MESSAGE", "An internal error occurred.");
                    bundle6.putInt("INTERNAL_LOG_ERROR_REASON", 98);
                    String name2 = e12.getClass().getName();
                    String message2 = e12.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    bundle6.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name2 + ": " + message2);
                    resultReceiver2.send(6, bundle6);
                    return true;
                }
            default:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle7 = (Bundle) e.a(parcel);
                e.b(parcel);
                com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) this;
                ResultReceiver resultReceiver3 = hVar.f7265d;
                if (resultReceiver3 != null) {
                    if (bundle7 == null) {
                        resultReceiver3.send(0, null);
                    } else {
                        Activity activity3 = (Activity) hVar.f7264c.get();
                        PendingIntent pendingIntent3 = (PendingIntent) bundle7.getParcelable("KEY_LAUNCH_INTENT");
                        if (activity3 == null || pendingIntent3 == null) {
                            resultReceiver3.send(0, null);
                            u.h("BillingClient", "Unable to launch intent for in-app messaging");
                        } else {
                            try {
                                Intent intent3 = new Intent(activity3, (Class<?>) ProxyBillingActivity.class);
                                intent3.putExtra("in_app_message_result_receiver", resultReceiver3);
                                intent3.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent3);
                                activity3.startActivity(intent3);
                            } catch (CancellationException e13) {
                                resultReceiver3.send(0, null);
                                u.i("BillingClient", "Exception caught while launching intent for in-app messaging.", e13);
                            }
                        }
                    }
                    break;
                } else {
                    u.h("BillingClient", "Unable to send result for in-app messaging");
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
