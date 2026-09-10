package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.u;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
@zzq
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f7177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7182f;

    public final Intent a(j3 j3Var, long j10) {
        Intent intentB = b();
        intentB.putExtra("RESPONSE_CODE", 6);
        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        BillingResult billingResultG = wi.d.g(6, "An internal error occurred.");
        int i10 = zzcg.zza;
        intentB.putExtra("FAILURE_LOGGING_PAYLOAD", zzcg.zzb(j3Var, 2, billingResultG, null, m3.BROADCAST_ACTION_UNSPECIFIED).a());
        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentB.putExtra("billingClientTransactionId", j10);
        intentB.putExtra("wasServiceAutoReconnected", this.f7182f);
        return intentB;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        j3 j3Var;
        Intent intentA;
        int i12;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int responseCode = u.e(intent, "ProxyBillingActivity").getResponseCode();
            if (i11 != -1) {
                u.h("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
            } else if (responseCode != 0) {
                i11 = -1;
                u.h("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
            } else {
                i11 = -1;
            }
            if (intent == null) {
                u.h("ProxyBillingActivity", "Got null data with resultCode " + i11 + "!");
                if (i11 == -1) {
                    j3Var = j3.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i11 == 0) {
                    j3Var = j3.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i11 == 3) {
                    j3Var = j3.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
                } else if (i11 != 4) {
                    j3Var = i11 != 5 ? j3.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : j3.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE;
                } else {
                    j3Var = j3.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
                }
                intentA = a(j3Var, this.f7181e);
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentA = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intentA.setPackage(getApplicationContext().getPackageName());
                    intentA.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    Intent intentB = b();
                    intentB.putExtras(intent.getExtras());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentA = intentB;
                }
                intentA.putExtra("billingClientTransactionId", this.f7181e);
                intentA.putExtra("wasServiceAutoReconnected", this.f7182f);
            } else {
                u.h("ProxyBillingActivity", "Got null bundle!");
                intentA = a(j3.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.f7181e);
            }
            if (i10 == 110) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentA);
        } else if (i10 == 101) {
            if (intent == null) {
                u.h("ProxyBillingActivity", "Got null intent!");
            } else {
                int i13 = u.f24478a;
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    u.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i12 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.f7177a;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i12, extras);
                }
            }
            i12 = 0;
            resultReceiver = this.f7177a;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i12, extras);
            }
        } else {
            u.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f7178b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            u.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f7178b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f7177a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f7179c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f7180d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f7181e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f7182f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        u.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f7180d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f7179c = true;
                this.f7180d = InterfaceC0435l1.d.b.f29111h;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f7177a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f7180d = InterfaceC0435l1.d.b.f29105b;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f7181e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f7182f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f7178b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f7180d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            u.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f7177a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA = a(j3.INTENT_SENDER_EXCEPTION, this.f7181e);
                if (this.f7179c) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
            this.f7178b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f7178b) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f7179c) {
                intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f7180d;
            if (i10 == 110 || i10 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentB.putExtra("billingClientTransactionId", this.f7181e);
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f7177a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f7178b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f7179c);
        bundle.putInt("activity_code", this.f7180d);
        bundle.putLong("billingClientTransactionId", this.f7181e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f7182f);
    }
}
