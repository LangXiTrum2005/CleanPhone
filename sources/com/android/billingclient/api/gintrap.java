package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzga;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap extends BroadcastReceiver {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f16513attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final /* synthetic */ rotuma f16514dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f16515saneness;

    public gintrap(rotuma rotumaVar, boolean z) {
        this.f16514dern = rotumaVar;
        this.f16515saneness = z;
    }

    public final synchronized void attabal(Context context, IntentFilter intentFilter) {
        try {
            if (this.f16513attabal) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f16515saneness ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f16513attabal = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void dern(Context context) {
        if (!this.f16513attabal) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f16513attabal = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            kowloon kowloonVar = this.f16514dern.f16536marial;
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            kowloonVar.marial(zzcb.zza(11, 1, billingResult));
            rotuma rotumaVar = this.f16514dern;
            if (rotumaVar.f16537saneness != null) {
                rotumaVar.f16537saneness.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        BillingResult billingResultZze = com.google.android.gms.internal.play_billing.zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listZzi = com.google.android.gms.internal.play_billing.zzb.zzi(extras);
            if (billingResultZze.getResponseCode() == 0) {
                this.f16514dern.f16536marial.saneness(zzcb.zzc(i));
            } else {
                wireman(extras, billingResultZze, i);
            }
            this.f16514dern.f16537saneness.onPurchasesUpdated(billingResultZze, listZzi);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (billingResultZze.getResponseCode() != 0) {
                wireman(extras, billingResultZze, i);
                this.f16514dern.f16537saneness.onPurchasesUpdated(billingResultZze, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            rotuma rotumaVar2 = this.f16514dern;
            if (rotumaVar2.f16534dern == null && rotumaVar2.f16538wireman == null) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                kowloon kowloonVar2 = this.f16514dern.f16536marial;
                BillingResult billingResult2 = arytenoidectomy.f16447cutely;
                kowloonVar2.marial(zzcb.zza(77, i, billingResult2));
                this.f16514dern.f16537saneness.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                kowloon kowloonVar3 = this.f16514dern.f16536marial;
                BillingResult billingResult3 = arytenoidectomy.f16447cutely;
                kowloonVar3.marial(zzcb.zza(16, i, billingResult3));
                this.f16514dern.f16537saneness.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            try {
                if (this.f16514dern.f16538wireman != null) {
                    this.f16514dern.f16538wireman.userSelectedAlternativeBilling(new UserChoiceDetails(string));
                } else {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject != null) {
                                arrayList.add(new zze(jSONObjectOptJSONObject, null));
                            }
                        }
                    }
                    this.f16514dern.f16534dern.zza();
                }
                this.f16514dern.f16536marial.saneness(zzcb.zzc(i));
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                kowloon kowloonVar4 = this.f16514dern.f16536marial;
                BillingResult billingResult4 = arytenoidectomy.f16447cutely;
                kowloonVar4.marial(zzcb.zza(17, i, billingResult4));
                this.f16514dern.f16537saneness.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.zzai.zzk());
            }
        }
    }

    public final synchronized void saneness(Context context, IntentFilter intentFilter, String str) {
        gintrap gintrapVar;
        try {
            try {
                if (this.f16513attabal) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    gintrapVar = this;
                    context.registerReceiver(gintrapVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f16515saneness ? 4 : 2);
                } else {
                    gintrapVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                gintrapVar.f16513attabal = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void wireman(Bundle bundle, BillingResult billingResult, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f16514dern.f16536marial.marial(zzcb.zza(23, i, billingResult));
            return;
        }
        try {
            this.f16514dern.f16536marial.marial(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.zzcd.zza()));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }
}
