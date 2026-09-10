package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzgz;
import com.google.android.gms.internal.play_billing.zzhb;
import com.inmobi.media.core.config.models.CrashConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends BillingClient {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f16471adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f16472apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f16473arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public volatile int f16474attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public kowloon f16475beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.zzs f16476competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public PendingPurchasesParams f16477cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f16478cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f16479cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Handler f16480dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f16481dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f16482formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f16483gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f16484graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f16485impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public volatile marial f16486impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f16487kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Context f16488marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f16489molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f16490monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f16491polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public boolean f16492preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f16493rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f16494saneness;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public ExecutorService f16495stratoscope;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f16496taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f16497triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public volatile rotuma f16498wireman;

    public attabal(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, kowloon kowloonVar, ExecutorService executorService) {
        this.f16474attabal = 0;
        this.f16480dern = new Handler(Looper.getMainLooper());
        this.f16472apical = 0;
        this.f16494saneness = str;
        attabal(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, null);
    }

    public static /* bridge */ /* synthetic */ zzcz merc(attabal attabalVar, String str, int i) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = com.google.android.gms.internal.play_billing.zzb.zzc(attabalVar.f16497triweekly, attabalVar.f16481dovishness, attabalVar.f16477cord.attabal(), attabalVar.f16477cord.saneness(), attabalVar.f16494saneness);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleZzj = attabalVar.f16497triweekly ? attabalVar.f16476competently.zzj(true != attabalVar.f16481dovishness ? 9 : 19, attabalVar.f16488marial.getPackageName(), str, string, bundleZzc) : attabalVar.f16476competently.zzi(3, attabalVar.f16488marial.getPackageName(), str, string);
                molybdenite molybdeniteVarAttabal = graveside.attabal(bundleZzj, "BillingClient", "getPurchase()");
                BillingResult billingResultAttabal = molybdeniteVarAttabal.attabal();
                if (billingResultAttabal != arytenoidectomy.f16450formularize) {
                    attabalVar.walach(zzcb.zza(molybdeniteVarAttabal.saneness(), 9, billingResultAttabal));
                    return new zzcz(billingResultAttabal, list);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        BillingResult billingResult = arytenoidectomy.f16447cutely;
                        attabalVar.walach(zzcb.zza(51, 9, billingResult));
                        return new zzcz(billingResult, null);
                    }
                }
                if (z) {
                    attabalVar.walach(zzcb.zza(26, 9, arytenoidectomy.f16447cutely));
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new zzcz(arytenoidectomy.f16450formularize, arrayList);
                }
                list = null;
            } catch (Exception e2) {
                BillingResult billingResult2 = arytenoidectomy.f16453impassible;
                attabalVar.walach(zzcb.zza(52, 9, billingResult2));
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzcz(billingResult2, null);
            }
        }
    }

    public static /* bridge */ /* synthetic */ triweekly milliradian(attabal attabalVar, String str) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = com.google.android.gms.internal.play_billing.zzb.zzc(attabalVar.f16497triweekly, attabalVar.f16481dovishness, attabalVar.f16477cord.attabal(), attabalVar.f16477cord.saneness(), attabalVar.f16494saneness);
        String string = null;
        while (attabalVar.f16482formularize) {
            try {
                Bundle bundleZzh = attabalVar.f16476competently.zzh(6, attabalVar.f16488marial.getPackageName(), str, string, bundleZzc);
                molybdenite molybdeniteVarAttabal = graveside.attabal(bundleZzh, "BillingClient", "getPurchaseHistory()");
                BillingResult billingResultAttabal = molybdeniteVarAttabal.attabal();
                if (billingResultAttabal != arytenoidectomy.f16450formularize) {
                    attabalVar.walach(zzcb.zza(molybdeniteVarAttabal.saneness(), 11, billingResultAttabal));
                    return new triweekly(billingResultAttabal, null);
                }
                ArrayList<String> stringArrayList = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str2 = stringArrayList2.get(i);
                    String str3 = stringArrayList3.get(i);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        BillingResult billingResult = arytenoidectomy.f16447cutely;
                        attabalVar.walach(zzcb.zza(51, 11, billingResult));
                        return new triweekly(billingResult, null);
                    }
                }
                if (z) {
                    attabalVar.walach(zzcb.zza(26, 11, arytenoidectomy.f16447cutely));
                }
                string = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new triweekly(arytenoidectomy.f16450formularize, arrayList);
                }
            } catch (RemoteException e2) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                BillingResult billingResult2 = arytenoidectomy.f16453impassible;
                attabalVar.walach(zzcb.zza(59, 11, billingResult2));
                return new triweekly(billingResult2, null);
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new triweekly(arytenoidectomy.f16458monoploid, null);
    }

    public static String starveling() {
        try {
            return (String) nictation.attabal.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return slumberous.attabal.f37634attabal;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = arytenoidectomy.f16466taiyuan;
            walach(zzcb.zza(26, 3, billingResult2));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.f16497triweekly) {
            BillingResult billingResult3 = arytenoidectomy.f16463saneness;
            walach(zzcb.zza(27, 3, billingResult3));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.lerp(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.graveside(acknowledgePurchaseResponseListener);
            }
        }, grimness()) == null) {
            BillingResult billingResultPrivatdozent = privatdozent();
            walach(zzcb.zza(25, 3, billingResultPrivatdozent));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultPrivatdozent);
        }
    }

    public final /* synthetic */ void adultoid(BillingResult billingResult) {
        if (this.f16498wireman.wireman() != null) {
            this.f16498wireman.wireman().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final void attabal(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, UserChoiceBillingListener userChoiceBillingListener, String str, kowloon kowloonVar) {
        this.f16488marial = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.f16488marial.getPackageName());
        if (kowloonVar != null) {
            this.f16475beachfront = kowloonVar;
        } else {
            this.f16475beachfront = new monoploid(this.f16488marial, (zzgu) zzgtVarZzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f16498wireman = new rotuma(this.f16488marial, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.f16475beachfront);
        this.f16477cord = pendingPurchasesParams;
        this.f16478cuirassed = userChoiceBillingListener != null;
    }

    public final void clubfoot(BillingResult billingResult, int i, int i2) {
        zzge zzgeVar = null;
        zzga zzgaVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i3 = zzcb.zza;
            try {
                zzgd zzgdVarZzy = zzge.zzy();
                zzgdVarZzy.zzm(5);
                zzgz zzgzVarZzy = zzhb.zzy();
                zzgzVarZzy.zzl(i2);
                zzgdVarZzy.zzl((zzhb) zzgzVarZzy.zzf());
                zzgeVar = (zzge) zzgdVarZzy.zzf();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            }
            peridotite(zzgeVar);
            return;
        }
        int i4 = zzcb.zza;
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(billingResult.getResponseCode());
            zzggVarZzy.zzm(billingResult.getDebugMessage());
            zzggVarZzy.zzo(i);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(5);
            zzgz zzgzVarZzy2 = zzhb.zzy();
            zzgzVarZzy2.zzl(i2);
            zzfzVarZzy.zzm((zzhb) zzgzVarZzy2.zzf());
            zzgaVar = (zzga) zzfzVarZzy.zzf();
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e2);
        }
        walach(zzgaVar);
    }

    public final /* synthetic */ Object coi(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.f16476competently.zzt(12, this.f16488marial.getPackageName(), bundle, new impassible(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.nosophobia(consumeParams, consumeResponseListener);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.dovishness(consumeResponseListener, consumeParams);
            }
        }, grimness()) == null) {
            BillingResult billingResultPrivatdozent = privatdozent();
            walach(zzcb.zza(25, 4, billingResultPrivatdozent));
            consumeResponseListener.onConsumeResponse(billingResultPrivatdozent, consumeParams.getPurchaseToken());
        }
    }

    public final /* synthetic */ void cord(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 14, billingResult));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
        } else {
            if (!this.f16493rotuma) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = arytenoidectomy.f16470yemenite;
                walach(zzcb.zza(66, 15, billingResult2));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
                return;
            }
            if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzz
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.czestochowa(alternativeBillingOnlyReportingDetailsListener);
                    return null;
                }
            }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzaa
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.gintrap(alternativeBillingOnlyReportingDetailsListener);
                }
            }, grimness()) == null) {
                BillingResult billingResultPrivatdozent = privatdozent();
                walach(zzcb.zza(25, 15, billingResultPrivatdozent));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultPrivatdozent, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 24, billingResult));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
        } else {
            if (!this.f16492preprohormone) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = arytenoidectomy.f16461preprohormone;
                walach(zzcb.zza(103, 24, billingResult2));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
                return;
            }
            if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzab
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.sensatory(externalOfferReportingDetailsListener);
                    return null;
                }
            }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.rotuma(externalOfferReportingDetailsListener);
                }
            }, grimness()) == null) {
                BillingResult billingResultPrivatdozent = privatdozent();
                walach(zzcb.zza(25, 24, billingResultPrivatdozent));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultPrivatdozent, null);
            }
        }
    }

    public final String creditor(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.f16488marial.getPackageName();
        }
        return null;
    }

    public final /* synthetic */ void cuirassed(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 23, billingResult));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final /* synthetic */ Bundle cultivated(String str, String str2) throws Exception {
        return this.f16476competently.zzf(3, this.f16488marial.getPackageName(), str, str2, null);
    }

    public final /* synthetic */ Void czestochowa(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        try {
            this.f16476competently.zzm(21, this.f16488marial.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.f16494saneness), new beachfront(alternativeBillingOnlyReportingDetailsListener, this.f16475beachfront, this.f16472apical, null));
        } catch (Exception unused) {
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            walach(zzcb.zza(70, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
        }
        return null;
    }

    public final /* synthetic */ void dovishness(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 4, billingResult));
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ Object empress(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        ArrayList arrayList;
        String strZzg;
        int i;
        Bundle bundleZzk;
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                arrayList = null;
                strZzg = "";
                i = 0;
            } else {
                int i3 = i2 + 20;
                ArrayList<String> arrayList3 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                bundle.putString("playBillingLibraryVersion", this.f16494saneness);
                try {
                    if (this.f16487kowloon) {
                        com.google.android.gms.internal.play_billing.zzs zzsVar = this.f16476competently;
                        String packageName = this.f16488marial.getPackageName();
                        int i4 = this.f16472apical;
                        boolean zAttabal = this.f16477cord.attabal();
                        boolean zOverspeculate = overspeculate();
                        String str3 = this.f16494saneness;
                        arrayList = null;
                        try {
                            Bundle bundle2 = new Bundle();
                            if (i4 >= 9) {
                                bundle2.putString("playBillingLibraryVersion", str3);
                            }
                            if (i4 >= 9 && zAttabal) {
                                bundle2.putBoolean("enablePendingPurchases", true);
                            }
                            if (zOverspeculate) {
                                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                            }
                            bundleZzk = zzsVar.zzl(10, packageName, str, bundle, bundle2);
                        } catch (Exception e) {
                            e = e;
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e);
                            walach(zzcb.zza(43, 8, arytenoidectomy.f16453impassible));
                            strZzg = "Service connection is disconnected.";
                            i = -1;
                        }
                    } else {
                        arrayList = null;
                        bundleZzk = this.f16476competently.zzk(3, this.f16488marial.getPackageName(), str, bundle);
                    }
                    strZzg = "Item is unavailable for purchase.";
                    if (bundleZzk == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                        walach(zzcb.zza(44, 8, arytenoidectomy.f16468trm));
                        break;
                    }
                    if (bundleZzk.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                            walach(zzcb.zza(46, 8, arytenoidectomy.f16468trm));
                            break;
                        }
                        for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                            try {
                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                arrayList2.add(skuDetails);
                            } catch (JSONException e2) {
                                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e2);
                                strZzg = "Error trying to decode SkuDetails.";
                                walach(zzcb.zza(47, 8, arytenoidectomy.attabal(6, "Error trying to decode SkuDetails.")));
                                i = 6;
                            }
                        }
                        i2 = i3;
                        arrayList2 = arrayList;
                    } else {
                        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzk, "BillingClient");
                        strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzk, "BillingClient");
                        if (iZzb != 0) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + iZzb);
                            walach(zzcb.zza(23, 8, arytenoidectomy.attabal(iZzb, strZzg)));
                            i = iZzb;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                            walach(zzcb.zza(45, 8, arytenoidectomy.attabal(6, strZzg)));
                            i = 6;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    arrayList = null;
                }
            }
            skuDetailsResponseListener.onSkuDetailsResponse(arytenoidectomy.attabal(i, strZzg), arrayList2);
            return arrayList;
        }
        i = 4;
        arrayList2 = arrayList;
        skuDetailsResponseListener.onSkuDetailsResponse(arytenoidectomy.attabal(i, strZzg), arrayList2);
        return arrayList;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        peridotite(zzcb.zzc(12));
        try {
            try {
                if (this.f16498wireman != null) {
                    this.f16498wireman.beachfront();
                }
                if (this.f16486impromptu != null) {
                    this.f16486impromptu.dern();
                }
                if (this.f16486impromptu != null && this.f16476competently != null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unbinding from service.");
                    this.f16488marial.unbindService(this.f16486impromptu);
                    this.f16486impromptu = null;
                }
                this.f16476competently = null;
                ExecutorService executorService = this.f16495stratoscope;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f16495stratoscope = null;
                }
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "There was an exception while ending connection!", e);
            }
        } finally {
            this.f16474attabal = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.f16471adultoid) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = arytenoidectomy.f16446cuirassed;
            walach(zzcb.zza(32, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        String str = this.f16494saneness;
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzw
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.lotta(bundle, billingConfigResponseListener);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.preprohormone(billingConfigResponseListener);
            }
        }, grimness()) == null) {
            BillingResult billingResultPrivatdozent = privatdozent();
            walach(zzcb.zza(25, 13, billingResultPrivatdozent));
            billingConfigResponseListener.onBillingConfigResponse(billingResultPrivatdozent, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.f16474attabal;
    }

    public final /* synthetic */ void gintrap(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 15, billingResult));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final /* synthetic */ void graveside(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 3, billingResult));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final Handler grimness() {
        return Looper.myLooper() == null ? this.f16480dern : new Handler(Looper.myLooper());
    }

    public final Future hydrovane(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.f16495stratoscope == null) {
            this.f16495stratoscope = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new saneness(this));
        }
        try {
            final Future futureSubmit = this.f16495stratoscope.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public final /* synthetic */ Void igbo(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {
        try {
            this.f16476competently.zzq(22, this.f16488marial.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.f16494saneness), new cutely(new WeakReference(activity), resultReceiver, null));
        } catch (Exception e) {
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            walach(zzcb.zzb(98, 25, billingResult, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        } else {
            if (!this.f16493rotuma) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = arytenoidectomy.f16470yemenite;
                walach(zzcb.zza(66, 14, billingResult2));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult2);
                return;
            }
            if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.underbelly(alternativeBillingOnlyAvailabilityListener);
                    return null;
                }
            }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.cord(alternativeBillingOnlyAvailabilityListener);
                }
            }, grimness()) == null) {
                BillingResult billingResultPrivatdozent = privatdozent();
                walach(zzcb.zza(25, 14, billingResultPrivatdozent));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultPrivatdozent);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 23, billingResult));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        } else {
            if (!this.f16492preprohormone) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = arytenoidectomy.f16461preprohormone;
                walach(zzcb.zza(103, 23, billingResult2));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult2);
                return;
            }
            if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.preterite(externalOfferAvailabilityListener);
                    return null;
                }
            }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzar
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.cuirassed(externalOfferAvailabilityListener);
                }
            }, grimness()) == null) {
                BillingResult billingResultPrivatdozent = privatdozent();
                walach(zzcb.zza(25, 23, billingResultPrivatdozent));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultPrivatdozent);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            if (billingResult.getResponseCode() != 0) {
                walach(zzcb.zza(2, 5, billingResult));
                return billingResult;
            }
            peridotite(zzcb.zzc(5));
            return billingResult;
        }
        BillingResult billingResult2 = arytenoidectomy.f16442attabal;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    BillingResult billingResult3 = this.f16479cutely ? arytenoidectomy.f16450formularize : arytenoidectomy.f16441arytenoidectomy;
                    clubfoot(billingResult3, 10, 3);
                    return billingResult3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    BillingResult billingResult4 = this.f16491polloi ? arytenoidectomy.f16450formularize : arytenoidectomy.f16457molybdenite;
                    clubfoot(billingResult4, 31, 6);
                    return billingResult4;
                }
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    BillingResult billingResult5 = this.f16473arytenoidectomy ? arytenoidectomy.f16450formularize : arytenoidectomy.f16451gintrap;
                    clubfoot(billingResult5, 30, 5);
                    return billingResult5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    BillingResult billingResult6 = this.f16489molybdenite ? arytenoidectomy.f16450formularize : arytenoidectomy.f16452graveside;
                    clubfoot(billingResult6, 19, 8);
                    return billingResult6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    BillingResult billingResult7 = this.f16490monoploid ? arytenoidectomy.f16450formularize : arytenoidectomy.f16439adultoid;
                    clubfoot(billingResult7, 21, 7);
                    return billingResult7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    BillingResult billingResult8 = this.f16489molybdenite ? arytenoidectomy.f16450formularize : arytenoidectomy.f16452graveside;
                    clubfoot(billingResult8, 61, 9);
                    return billingResult8;
                }
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    BillingResult billingResult9 = this.f16484graveside ? arytenoidectomy.f16450formularize : arytenoidectomy.f16449dovishness;
                    clubfoot(billingResult9, 20, 10);
                    return billingResult9;
                }
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    BillingResult billingResult10 = this.f16471adultoid ? arytenoidectomy.f16450formularize : arytenoidectomy.f16446cuirassed;
                    clubfoot(billingResult10, 32, 11);
                    return billingResult10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    BillingResult billingResult11 = this.f16471adultoid ? arytenoidectomy.f16450formularize : arytenoidectomy.f16465stratoscope;
                    clubfoot(billingResult11, 33, 12);
                    return billingResult11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    BillingResult billingResult12 = this.f16483gintrap ? arytenoidectomy.f16450formularize : arytenoidectomy.f16459oilcan;
                    clubfoot(billingResult12, 60, 13);
                    return billingResult12;
                }
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    BillingResult billingResult13 = this.f16493rotuma ? arytenoidectomy.f16450formularize : arytenoidectomy.f16470yemenite;
                    clubfoot(billingResult13, 66, 14);
                    return billingResult13;
                }
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    BillingResult billingResult14 = this.f16492preprohormone ? arytenoidectomy.f16450formularize : arytenoidectomy.f16461preprohormone;
                    clubfoot(billingResult14, 103, 18);
                    return billingResult14;
                }
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    BillingResult billingResult15 = this.f16485impassible ? arytenoidectomy.f16450formularize : arytenoidectomy.f16460polloi;
                    clubfoot(billingResult15, 35, 4);
                    return billingResult15;
                }
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    BillingResult billingResult16 = this.f16496taiyuan ? arytenoidectomy.f16450formularize : arytenoidectomy.f16455kowloon;
                    clubfoot(billingResult16, 9, 2);
                    return billingResult16;
                }
                break;
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unsupported feature: ".concat(str));
        BillingResult billingResult17 = arytenoidectomy.f16445cord;
        clubfoot(billingResult17, 34, 1);
        return billingResult17;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.f16474attabal != 2 || this.f16476competently == null || this.f16486impromptu == null) ? false : true;
    }

    public final /* synthetic */ void kattegat(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 16, billingResult));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:161:0x0403  */
    /* JADX WARN: Code duplicated, block: B:174:0x0434  */
    /* JADX WARN: Code duplicated, block: B:176:0x0438 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x043d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0441  */
    /* JADX WARN: Code duplicated, block: B:181:0x0444  */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        String productId;
        String productType;
        String str;
        String str2;
        Future futureHydrovane;
        int i;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z2;
        Intent intent;
        String str9;
        int i2;
        final int i3;
        String str10;
        final attabal attabalVar = this;
        String str11 = "proxyPackageVersion";
        if (attabalVar.f16498wireman == null || attabalVar.f16498wireman.wireman() == null) {
            BillingResult billingResult = arytenoidectomy.f16464sealless;
            attabalVar.walach(zzcb.zza(12, 2, billingResult));
            return billingResult;
        }
        if (!attabalVar.isReady()) {
            BillingResult billingResult2 = arytenoidectomy.f16453impassible;
            attabalVar.walach(zzcb.zza(2, 2, billingResult2));
            attabalVar.saran(billingResult2);
            return billingResult2;
        }
        ArrayList<SkuDetails> arrayListZzf = billingFlowParams.zzf();
        List listZzg = billingFlowParams.zzg();
        SkuDetails skuDetails = (SkuDetails) com.google.android.gms.internal.play_billing.zzan.zza(arrayListZzf, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzan.zza(listZzg, null);
        if (skuDetails != null) {
            productId = skuDetails.getSku();
            productType = skuDetails.getType();
        } else {
            productId = productDetailsParams.zza().getProductId();
            productType = productDetailsParams.zza().getProductType();
        }
        String str12 = "BillingClient";
        if (productType.equals("subs") && !attabalVar.f16496taiyuan) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support subscriptions.");
            BillingResult billingResult3 = arytenoidectomy.f16455kowloon;
            attabalVar.walach(zzcb.zza(9, 2, billingResult3));
            attabalVar.saran(billingResult3);
            return billingResult3;
        }
        if (billingFlowParams.impromptu() && !attabalVar.f16482formularize) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support extra params for buy intent.");
            BillingResult billingResult4 = arytenoidectomy.f16454impromptu;
            attabalVar.walach(zzcb.zza(18, 2, billingResult4));
            attabalVar.saran(billingResult4);
            return billingResult4;
        }
        if (arrayListZzf.size() > 1 && !attabalVar.f16489molybdenite) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support multi-item purchases.");
            BillingResult billingResult5 = arytenoidectomy.f16452graveside;
            attabalVar.walach(zzcb.zza(19, 2, billingResult5));
            attabalVar.saran(billingResult5);
            return billingResult5;
        }
        if (!listZzg.isEmpty() && !attabalVar.f16484graveside) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            BillingResult billingResult6 = arytenoidectomy.f16449dovishness;
            attabalVar.walach(zzcb.zza(20, 2, billingResult6));
            attabalVar.saran(billingResult6);
            return billingResult6;
        }
        if (attabalVar.f16482formularize) {
            boolean z3 = attabalVar.f16497triweekly;
            boolean z4 = attabalVar.f16481dovishness;
            boolean zAttabal = attabalVar.f16477cord.attabal();
            boolean zSaneness = attabalVar.f16477cord.saneness();
            boolean z5 = attabalVar.f16478cuirassed;
            String str13 = attabalVar.f16494saneness;
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str13);
            if (billingFlowParams.zza() != 0) {
                bundle.putInt("prorationMode", billingFlowParams.zza());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzb())) {
                bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzb());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzc())) {
                bundle.putString("obfuscatedProfileId", billingFlowParams.zzc());
            }
            if (billingFlowParams.zzo()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzd())) {
                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzd());
            }
            if (TextUtils.isEmpty(null)) {
                str3 = null;
            } else {
                str3 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle.putString("originalExternalTransactionId", billingFlowParams.zze());
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("paymentsPurchaseParams", str10);
            }
            if (z3 && zAttabal) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                str10 = str3;
                z = true;
            }
            if (z4 && zSaneness) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (arrayListZzf.isEmpty()) {
                str4 = "proxyPackageVersion";
                str = "BUY_INTENT";
                str5 = productId;
                str6 = productType;
                str7 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listZzg.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listZzg.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                for (int i4 = 0; i4 < listZzg.size(); i4++) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) listZzg.get(i4);
                    ProductDetails productDetailsZza = productDetailsParams2.zza();
                    if (!productDetailsZza.attabal().isEmpty()) {
                        arrayList3.add(productDetailsZza.attabal());
                    }
                    arrayList4.add(productDetailsParams2.zzb());
                    if (!TextUtils.isEmpty(productDetailsZza.zzc())) {
                        arrayList5.add(productDetailsZza.zzc());
                    }
                    if (i4 > 0) {
                        arrayList.add(((BillingFlowParams.ProductDetailsParams) listZzg.get(i4)).zza().getProductId());
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) listZzg.get(i4)).zza().getProductType());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                str5 = productId;
                ArrayList<String> arrayList7 = new ArrayList<>();
                str6 = productType;
                ArrayList<String> arrayList8 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList9 = new ArrayList<>();
                ArrayList<String> arrayList10 = new ArrayList<>();
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (SkuDetails skuDetails2 : arrayListZzf) {
                    if (!skuDetails2.attabal().isEmpty()) {
                        arrayList6.add(skuDetails2.attabal());
                    }
                    String strZzc = skuDetails2.zzc();
                    String str14 = str12;
                    String strZzb = skuDetails2.zzb();
                    int iZza = skuDetails2.zza();
                    String strZze = skuDetails2.zze();
                    arrayList7.add(strZzc);
                    z6 |= !TextUtils.isEmpty(strZzc);
                    arrayList8.add(strZzb);
                    z7 |= !TextUtils.isEmpty(strZzb);
                    arrayList9.add(Integer.valueOf(iZza));
                    z8 |= iZza != 0;
                    z9 |= !TextUtils.isEmpty(strZze);
                    arrayList10.add(strZze);
                    str11 = str11;
                    str12 = str14;
                }
                str4 = str11;
                str7 = str12;
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z6) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z7) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z8) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z9) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (arrayListZzf.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayListZzf.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListZzf.size() - 1);
                    for (int i5 = 1; i5 < arrayListZzf.size(); i5++) {
                        arrayList11.add(((SkuDetails) arrayListZzf.get(i5)).getSku());
                        arrayList12.add(((SkuDetails) arrayListZzf.get(i5)).getType());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList12);
                }
            }
            attabalVar = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !attabalVar.f16490monoploid) {
                BillingResult billingResult7 = arytenoidectomy.f16439adultoid;
                attabalVar.walach(zzcb.zza(21, 2, billingResult7));
                attabalVar.saran(billingResult7);
                return billingResult7;
            }
            if (skuDetails == null || TextUtils.isEmpty(skuDetails.zzd())) {
                if (productDetailsParams == null || TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                    str8 = null;
                    z2 = false;
                } else {
                    bundle.putString("skuPackageName", productDetailsParams.zza().zza());
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("accountName", str8);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    str2 = str7;
                    com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Activity's intent is null.");
                } else {
                    str2 = str7;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str9 = str4;
                            try {
                                bundle.putString(str9, attabalVar.f16488marial.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString(str9, "package not found");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str9 = str4;
                        }
                    }
                }
                if (!attabalVar.f16484graveside && !listZzg.isEmpty()) {
                    i2 = 17;
                } else if (attabalVar.f16491polloi || !z2) {
                    if (attabalVar.f16497triweekly) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                    }
                    final String str15 = str5;
                    final String str16 = str6;
                    futureHydrovane = attabalVar.hydrovane(new Callable() { // from class: com.android.billingclient.api.zzas
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.permissivist(i3, str15, str16, billingFlowParams, bundle);
                        }
                    }, 5000L, null, attabalVar.f16480dern);
                    i = 78;
                } else {
                    i2 = 15;
                }
                i3 = i2;
                final String str17 = str5;
                final String str18 = str6;
                futureHydrovane = attabalVar.hydrovane(new Callable() { // from class: com.android.billingclient.api.zzas
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.permissivist(i3, str17, str18, billingFlowParams, bundle);
                    }
                }, 5000L, null, attabalVar.f16480dern);
                i = 78;
            } else {
                bundle.putString("skuPackageName", skuDetails.zzd());
            }
            str8 = null;
            z2 = true;
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("accountName", str8);
            }
            intent = activity.getIntent();
            if (intent == null) {
                str2 = str7;
                com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Activity's intent is null.");
            } else {
                str2 = str7;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra2);
                    str9 = str4;
                    bundle.putString(str9, attabalVar.f16488marial.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                }
            }
            if (!attabalVar.f16484graveside) {
                if (attabalVar.f16491polloi) {
                    if (attabalVar.f16497triweekly) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                        i3 = i2;
                    }
                } else if (attabalVar.f16497triweekly) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (attabalVar.f16491polloi) {
                if (attabalVar.f16497triweekly) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (attabalVar.f16497triweekly) {
                i3 = 9;
            } else {
                i2 = 6;
                i3 = i2;
            }
            final String str19 = str5;
            final String str110 = str6;
            futureHydrovane = attabalVar.hydrovane(new Callable() { // from class: com.android.billingclient.api.zzas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.permissivist(i3, str19, str110, billingFlowParams, bundle);
                }
            }, 5000L, null, attabalVar.f16480dern);
            i = 78;
        } else {
            str = "BUY_INTENT";
            final String str20 = productId;
            final String str21 = productType;
            str2 = "BillingClient";
            futureHydrovane = attabalVar.hydrovane(new Callable() { // from class: com.android.billingclient.api.zzr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.cultivated(str20, str21);
                }
            }, 5000L, null, attabalVar.f16480dern);
            i = 80;
        }
        try {
            if (futureHydrovane == null) {
                BillingResult billingResult8 = arytenoidectomy.f16453impassible;
                attabalVar.walach(zzcb.zza(25, 2, billingResult8));
                attabalVar.saran(billingResult8);
                return billingResult8;
            }
            Bundle bundle2 = (Bundle) futureHydrovane.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle2, str2);
            String strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle2, str2);
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str22 = str;
                intent2.putExtra(str22, (PendingIntent) bundle2.getParcelable(str22));
                activity.startActivity(intent2);
                return arytenoidectomy.f16450formularize;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Unable to buy item, Error response code: " + iZzb);
            BillingResult billingResultAttabal = arytenoidectomy.attabal(iZzb, strZzg);
            if (bundle2 != null) {
                i = 23;
            }
            attabalVar.walach(zzcb.zza(i, 2, billingResultAttabal));
            attabalVar.saran(billingResultAttabal);
            return billingResultAttabal;
        } catch (CancellationException e) {
            e = e;
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            BillingResult billingResult9 = arytenoidectomy.f16467triweekly;
            attabalVar.walach(zzcb.zza(4, 2, billingResult9));
            attabalVar.saran(billingResult9);
            return billingResult9;
        } catch (TimeoutException e2) {
            e = e2;
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            BillingResult billingResult10 = arytenoidectomy.f16467triweekly;
            attabalVar.walach(zzcb.zza(4, 2, billingResult10));
            attabalVar.saran(billingResult10);
            return billingResult10;
        } catch (Exception e3) {
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Exception while launching billing flow. Try to reconnect", e3);
            BillingResult billingResult11 = arytenoidectomy.f16453impassible;
            attabalVar.walach(zzcb.zza(5, 2, billingResult11));
            attabalVar.saran(billingResult11);
            return billingResult11;
        }
    }

    public final /* synthetic */ Object lerp(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            com.google.android.gms.internal.play_billing.zzs zzsVar = this.f16476competently;
            String packageName = this.f16488marial.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.f16494saneness;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleZzd = zzsVar.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(arytenoidectomy.attabal(com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzd, "BillingClient")));
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error acknowledge purchase!", e);
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(28, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return null;
        }
    }

    public final /* synthetic */ Object lotta(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        try {
            this.f16476competently.zzp(18, this.f16488marial.getPackageName(), bundle, new taiyuan(billingConfigResponseListener, this.f16475beachfront, this.f16472apical, null));
        } catch (DeadObjectException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e);
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(62, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got an exception.", e2);
            BillingResult billingResult2 = arytenoidectomy.f16447cutely;
            walach(zzcb.zza(62, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
        }
        return null;
    }

    public final void mathsort(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 11, billingResult));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (hydrovane(new wireman(this, str, purchaseHistoryResponseListener), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.oilcan(purchaseHistoryResponseListener);
            }
        }, grimness()) == null) {
            BillingResult billingResultPrivatdozent = privatdozent();
            walach(zzcb.zza(25, 11, billingResultPrivatdozent));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultPrivatdozent, null);
        }
    }

    public final /* synthetic */ Object nosophobia(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int iZza;
        String strZzg;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.f16497triweekly) {
                com.google.android.gms.internal.play_billing.zzs zzsVar = this.f16476competently;
                String packageName = this.f16488marial.getPackageName();
                boolean z = this.f16497triweekly;
                String str = this.f16494saneness;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleZze = zzsVar.zze(9, packageName, purchaseToken, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZze, "BillingClient");
            } else {
                iZza = this.f16476competently.zza(3, this.f16488marial.getPackageName(), purchaseToken);
                strZzg = "";
            }
            BillingResult billingResultAttabal = arytenoidectomy.attabal(iZza, strZzg);
            if (iZza == 0) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultAttabal, purchaseToken);
                return null;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
            walach(zzcb.zza(23, 4, billingResultAttabal));
            consumeResponseListener.onConsumeResponse(billingResultAttabal, purchaseToken);
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error consuming purchase!", e);
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(29, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, purchaseToken);
            return null;
        }
    }

    public final /* synthetic */ void oilcan(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 11, billingResult));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
    }

    public final boolean overspeculate() {
        return this.f16481dovishness && this.f16477cord.saneness();
    }

    public final void peridotite(zzge zzgeVar) {
        this.f16475beachfront.attabal(zzgeVar, this.f16472apical);
    }

    public final /* synthetic */ Bundle permissivist(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.f16476competently.zzg(i, this.f16488marial.getPackageName(), str, str2, null, bundle);
    }

    public final /* synthetic */ void preprohormone(BillingConfigResponseListener billingConfigResponseListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 13, billingResult));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final /* synthetic */ Void preterite(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        try {
            this.f16476competently.zzs(22, this.f16488marial.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.f16494saneness), new formularize(externalOfferAvailabilityListener, this.f16475beachfront, this.f16472apical, null));
        } catch (Exception e) {
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            walach(zzcb.zzb(91, 23, billingResult, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final BillingResult privatdozent() {
        return (this.f16474attabal == 0 || this.f16474attabal == 3) ? arytenoidectomy.f16453impassible : arytenoidectomy.f16447cutely;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 7, billingResult));
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.f16484graveside) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = arytenoidectomy.f16449dovishness;
                walach(zzcb.zza(20, 7, billingResult2));
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.sayid(queryProductDetailsParams, productDetailsResponseListener);
                    return null;
                }
            }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.stratoscope(productDetailsResponseListener);
                }
            }, grimness()) == null) {
                BillingResult billingResultPrivatdozent = privatdozent();
                walach(zzcb.zza(25, 7, billingResultPrivatdozent));
                productDetailsResponseListener.onProductDetailsResponse(billingResultPrivatdozent, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        mathsort(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        splinterproof(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 8, billingResult));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = arytenoidectomy.f16443beachfront;
            walach(zzcb.zza(49, 8, billingResult2));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = arytenoidectomy.f16456marial;
            walach(zzcb.zza(48, 8, billingResult3));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (hydrovane(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzac
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.empress(this.zzb, this.zzc, null, this.zzd);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzad
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.sealless(skuDetailsResponseListener);
            }
        }, grimness()) == null) {
            BillingResult billingResultPrivatdozent = privatdozent();
            walach(zzcb.zza(25, 8, billingResultPrivatdozent));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultPrivatdozent, null);
        }
    }

    public final /* synthetic */ void rotuma(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 24, billingResult));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    public final void saneness(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzc zzcVar, String str, kowloon kowloonVar) {
        this.f16488marial = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.f16488marial.getPackageName());
        if (kowloonVar != null) {
            this.f16475beachfront = kowloonVar;
        } else {
            this.f16475beachfront = new monoploid(this.f16488marial, (zzgu) zzgtVarZzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f16498wireman = new rotuma(this.f16488marial, purchasesUpdatedListener, null, zzcVar, null, this.f16475beachfront);
        this.f16477cord = pendingPurchasesParams;
        this.f16478cuirassed = zzcVar != null;
        this.f16488marial.getPackageName();
    }

    public final BillingResult saran(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.f16480dern.post(new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.adultoid(billingResult);
            }
        });
        return billingResult;
    }

    public final /* synthetic */ Object sayid(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String strZzg;
        int iZzb;
        int i;
        ArrayList arrayList = new ArrayList();
        String strZzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzai zzaiVarZza = queryProductDetailsParams.zza();
        int size = zzaiVarZza.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                int i3 = i2 + 20;
                ArrayList arrayList2 = new ArrayList(zzaiVarZza.subList(i2, i3 > size ? size : i3));
                ArrayList<String> arrayList3 = new ArrayList<>();
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i4)).zza());
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                bundle.putString("playBillingLibraryVersion", this.f16494saneness);
                try {
                    com.google.android.gms.internal.play_billing.zzs zzsVar = this.f16476competently;
                    int i5 = true != this.f16483gintrap ? 17 : 20;
                    String packageName = this.f16488marial.getPackageName();
                    boolean zOverspeculate = overspeculate();
                    String str = this.f16494saneness;
                    creditor(queryProductDetailsParams);
                    creditor(queryProductDetailsParams);
                    creditor(queryProductDetailsParams);
                    int i6 = i5;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("playBillingLibraryVersion", str);
                    bundle2.putBoolean("enablePendingPurchases", true);
                    bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                    if (zOverspeculate) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    int size3 = arrayList2.size();
                    int i7 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    while (i7 < size3) {
                        QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i7);
                        com.google.android.gms.internal.play_billing.zzs zzsVar2 = zzsVar;
                        arrayList4.add(null);
                        z |= !TextUtils.isEmpty(null);
                        String strZzb2 = product.zzb();
                        com.google.android.gms.internal.play_billing.zzai zzaiVar = zzaiVarZza;
                        if (strZzb2.equals("first_party")) {
                            com.google.android.gms.internal.play_billing.zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                            arrayList5.add(null);
                            z2 = true;
                        }
                        i7++;
                        zzaiVarZza = zzaiVar;
                        zzsVar = zzsVar2;
                    }
                    com.google.android.gms.internal.play_billing.zzai zzaiVar2 = zzaiVarZza;
                    com.google.android.gms.internal.play_billing.zzs zzsVar3 = zzsVar;
                    if (z) {
                        bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                    }
                    if (!arrayList5.isEmpty()) {
                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                    }
                    if (z2 && !TextUtils.isEmpty(null)) {
                        bundle2.putString("accountName", null);
                    }
                    Bundle bundleZzl = zzsVar3.zzl(i6, packageName, strZzb, bundle, bundle2);
                    i = 4;
                    strZzg = "Item is unavailable for purchase.";
                    if (bundleZzl == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        walach(zzcb.zza(44, 7, arytenoidectomy.f16468trm));
                    } else {
                        if (!bundleZzl.containsKey("DETAILS_LIST")) {
                            iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzl, "BillingClient");
                            strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzl, "BillingClient");
                            if (iZzb == 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                walach(zzcb.zza(45, 7, arytenoidectomy.attabal(6, strZzg)));
                                iZzb = 6;
                                break;
                            }
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                            walach(zzcb.zza(23, 7, arytenoidectomy.attabal(iZzb, strZzg)));
                            break;
                        }
                        ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                            walach(zzcb.zza(46, 7, arytenoidectomy.f16468trm));
                        } else {
                            for (int i8 = 0; i8 < stringArrayList.size(); i8++) {
                                try {
                                    ProductDetails productDetails = new ProductDetails(stringArrayList.get(i8));
                                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                    arrayList.add(productDetails);
                                } catch (JSONException e) {
                                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                    strZzg = "Error trying to decode SkuDetails.";
                                    i = 6;
                                    walach(zzcb.zza(47, 7, arytenoidectomy.attabal(6, "Error trying to decode SkuDetails.")));
                                }
                            }
                            i2 = i3;
                            zzaiVarZza = zzaiVar2;
                        }
                    }
                } catch (Exception e2) {
                    i = 6;
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                    walach(zzcb.zza(43, 7, arytenoidectomy.f16447cutely));
                    strZzg = "An internal error occurred.";
                }
                iZzb = i;
                break;
            }
            strZzg = "";
            iZzb = 0;
            break;
        }
        productDetailsResponseListener.onProductDetailsResponse(arytenoidectomy.attabal(iZzb, strZzg), arrayList);
        return null;
    }

    public final /* synthetic */ void sealless(SkuDetailsResponseListener skuDetailsResponseListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 8, billingResult));
        skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ Void sensatory(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        try {
            this.f16476competently.zzn(22, this.f16488marial.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.f16494saneness), new competently(externalOfferReportingDetailsListener, this.f16475beachfront, this.f16472apical, null));
        } catch (Exception e) {
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            walach(zzcb.zzb(94, 24, billingResult, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 16, billingResult));
            return billingResult;
        }
        if (!this.f16493rotuma) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = arytenoidectomy.f16470yemenite;
            walach(zzcb.zza(66, 16, billingResult2));
            return billingResult2;
        }
        final zzax zzaxVar = new zzax(this, this.f16480dern, alternativeBillingOnlyInformationDialogListener);
        if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.wostteth(activity, zzaxVar, alternativeBillingOnlyInformationDialogListener);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.kattegat(alternativeBillingOnlyInformationDialogListener);
            }
        }, this.f16480dern) != null) {
            return arytenoidectomy.f16450formularize;
        }
        BillingResult billingResultPrivatdozent = privatdozent();
        walach(zzcb.zza(25, 16, billingResultPrivatdozent));
        return billingResultPrivatdozent;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 25, billingResult));
            return billingResult;
        }
        if (!this.f16492preprohormone) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = arytenoidectomy.f16461preprohormone;
            walach(zzcb.zza(103, 25, billingResult2));
            return billingResult2;
        }
        final zzay zzayVar = new zzay(this, this.f16480dern, externalOfferInformationDialogListener);
        if (hydrovane(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.igbo(activity, zzayVar, externalOfferInformationDialogListener);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.supplicat(externalOfferInformationDialogListener);
            }
        }, this.f16480dern) != null) {
            return arytenoidectomy.f16450formularize;
        }
        BillingResult billingResultPrivatdozent = privatdozent();
        walach(zzcb.zza(25, 25, billingResultPrivatdozent));
        return billingResultPrivatdozent;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            return arytenoidectomy.f16453impassible;
        }
        if (!this.f16473arytenoidectomy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return arytenoidectomy.f16451gintrap;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        igbo.competently.attabal(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f16494saneness);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.attabal());
        final zzaw zzawVar = new zzaw(this, this.f16480dern, inAppMessageResponseListener);
        hydrovane(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.coi(bundle, activity, zzawVar);
                return null;
            }
        }, 5000L, null, this.f16480dern);
        return arytenoidectomy.f16450formularize;
    }

    public final void splinterproof(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(2, 9, billingResult));
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid product type.");
                BillingResult billingResult2 = arytenoidectomy.f16444competently;
                walach(zzcb.zza(50, 9, billingResult2));
                purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            if (hydrovane(new dern(this, str, purchasesResponseListener), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzae
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.yemenite(purchasesResponseListener);
                }
            }, grimness()) == null) {
                BillingResult billingResultPrivatdozent = privatdozent();
                walach(zzcb.zza(25, 9, billingResultPrivatdozent));
                purchasesResponseListener.onQueryPurchasesResponse(billingResultPrivatdozent, com.google.android.gms.internal.play_billing.zzai.zzk());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            peridotite(zzcb.zzc(6));
            billingClientStateListener.onBillingSetupFinished(arytenoidectomy.f16450formularize);
            return;
        }
        int i = 1;
        if (this.f16474attabal == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            BillingResult billingResult = arytenoidectomy.f16469wireman;
            walach(zzcb.zza(37, 6, billingResult));
            billingClientStateListener.onBillingSetupFinished(billingResult);
            return;
        }
        if (this.f16474attabal == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            BillingResult billingResult2 = arytenoidectomy.f16453impassible;
            walach(zzcb.zza(38, 6, billingResult2));
            billingClientStateListener.onBillingSetupFinished(billingResult2);
            return;
        }
        this.f16474attabal = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.f16486impromptu = new marial(this, billingClientStateListener, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f16488marial.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f16494saneness);
                    if (this.f16488marial.bindService(intent2, this.f16486impromptu, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.f16474attabal = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        BillingResult billingResult3 = arytenoidectomy.f16448dern;
        walach(zzcb.zza(i, 6, billingResult3));
        billingClientStateListener.onBillingSetupFinished(billingResult3);
    }

    public final /* synthetic */ void stratoscope(ProductDetailsResponseListener productDetailsResponseListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 7, billingResult));
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
    }

    public final /* synthetic */ void supplicat(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 25, billingResult));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final /* synthetic */ Void underbelly(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        try {
            this.f16476competently.zzr(21, this.f16488marial.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.f16494saneness), new apical(alternativeBillingOnlyAvailabilityListener, this.f16475beachfront, this.f16472apical, null));
        } catch (Exception unused) {
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            walach(zzcb.zza(69, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final void walach(zzga zzgaVar) {
        this.f16475beachfront.wireman(zzgaVar, this.f16472apical);
    }

    public final /* synthetic */ Void wostteth(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {
        try {
            this.f16476competently.zzo(21, this.f16488marial.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.f16494saneness), new impromptu(new WeakReference(activity), resultReceiver, null));
        } catch (Exception unused) {
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            walach(zzcb.zza(74, 16, billingResult));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
        }
        return null;
    }

    public final /* synthetic */ void yemenite(PurchasesResponseListener purchasesResponseListener) {
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        walach(zzcb.zza(24, 9, billingResult));
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzai.zzk());
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        mathsort(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        splinterproof(str, purchasesResponseListener);
    }

    public attabal(String str, Context context, kowloon kowloonVar, ExecutorService executorService) {
        this.f16474attabal = 0;
        this.f16480dern = new Handler(Looper.getMainLooper());
        this.f16472apical = 0;
        String strStarveling = starveling();
        this.f16494saneness = strStarveling;
        this.f16488marial = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strStarveling);
        zzgtVarZzy.zzm(this.f16488marial.getPackageName());
        this.f16475beachfront = new monoploid(this.f16488marial, (zzgu) zzgtVarZzy.zzf());
        this.f16488marial.getPackageName();
    }

    public attabal(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzck zzckVar, kowloon kowloonVar, ExecutorService executorService) {
        this.f16474attabal = 0;
        this.f16480dern = new Handler(Looper.getMainLooper());
        this.f16472apical = 0;
        this.f16494saneness = starveling();
        this.f16488marial = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(starveling());
        zzgtVarZzy.zzm(this.f16488marial.getPackageName());
        this.f16475beachfront = new monoploid(this.f16488marial, (zzgu) zzgtVarZzy.zzf());
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f16498wireman = new rotuma(this.f16488marial, null, null, null, null, this.f16475beachfront);
        this.f16477cord = pendingPurchasesParams;
        this.f16488marial.getPackageName();
    }

    public attabal(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzc zzcVar, kowloon kowloonVar, ExecutorService executorService) {
        String strStarveling = starveling();
        this.f16474attabal = 0;
        this.f16480dern = new Handler(Looper.getMainLooper());
        this.f16472apical = 0;
        this.f16494saneness = strStarveling;
        saneness(context, purchasesUpdatedListener, pendingPurchasesParams, null, strStarveling, null);
    }

    public attabal(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, kowloon kowloonVar, ExecutorService executorService) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, starveling(), null, userChoiceBillingListener, null, null);
    }
}
