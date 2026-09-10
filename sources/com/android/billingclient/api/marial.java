package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzhl;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements ServiceConnection {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final /* synthetic */ attabal f16521beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public BillingClientStateListener f16523marial;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f16522dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f16524wireman = false;

    public /* synthetic */ marial(attabal attabalVar, BillingClientStateListener billingClientStateListener, zzbb zzbbVar) {
        this.f16521beachfront = attabalVar;
        this.f16523marial = billingClientStateListener;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:129:0x023f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0244  */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x0213, please report this as an issue */
    public final /* synthetic */ Object attabal() throws Exception {
        Bundle bundle;
        int i;
        int i2;
        String strSubstring;
        int iZzy;
        synchronized (this.f16522dern) {
            try {
                if (!this.f16524wireman) {
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                    }
                    int i3 = 3;
                    try {
                        String packageName = this.f16521beachfront.f16488marial.getPackageName();
                        iZzy = 3;
                        int i4 = 22;
                        while (true) {
                            if (i4 < 3) {
                                i4 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    iZzy = this.f16521beachfront.f16476competently.zzy(i4, packageName, "subs");
                                } catch (Exception e) {
                                    e = e;
                                    i3 = iZzy;
                                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    if (e instanceof DeadObjectException) {
                                        i2 = 101;
                                    } else if (e instanceof RemoteException) {
                                        i2 = 100;
                                    } else {
                                        if (e instanceof SecurityException) {
                                            i2 = 102;
                                        } else {
                                            i = 42;
                                        }
                                        if (i == 42) {
                                            strSubstring = e.getClass().getSimpleName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage());
                                            if (strSubstring.length() > 70) {
                                                strSubstring = strSubstring.substring(0, 70);
                                            }
                                        } else {
                                            strSubstring = null;
                                        }
                                        this.f16521beachfront.f16474attabal = 0;
                                        this.f16521beachfront.f16476competently = null;
                                        iZzy = i3;
                                    }
                                    i = i2;
                                    if (i == 42) {
                                        strSubstring = e.getClass().getSimpleName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage());
                                        if (strSubstring.length() > 70) {
                                            strSubstring = strSubstring.substring(0, 70);
                                        }
                                    } else {
                                        strSubstring = null;
                                    }
                                    this.f16521beachfront.f16474attabal = 0;
                                    this.f16521beachfront.f16476competently = null;
                                    iZzy = i3;
                                }
                            } else {
                                iZzy = this.f16521beachfront.f16476competently.zzc(i4, packageName, "subs", bundle);
                            }
                            if (iZzy == 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                break;
                            }
                            i4--;
                        }
                        boolean z = true;
                        this.f16521beachfront.f16479cutely = i4 >= 5;
                        this.f16521beachfront.f16496taiyuan = i4 >= 3;
                        if (i4 < 3) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "In-app billing API does not support subscription on this device.");
                            i = 9;
                        } else {
                            i = 1;
                        }
                        for (int i5 = 22; i5 >= 3; i5--) {
                            iZzy = bundle == null ? this.f16521beachfront.f16476competently.zzy(i5, packageName, "inapp") : this.f16521beachfront.f16476competently.zzc(i5, packageName, "inapp", bundle);
                            if (iZzy == 0) {
                                this.f16521beachfront.f16472apical = i5;
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "mHighestLevelSupportedForInApp: " + this.f16521beachfront.f16472apical);
                                break;
                            }
                        }
                        attabal attabalVar = this.f16521beachfront;
                        attabalVar.f16492preprohormone = attabalVar.f16472apical >= 22;
                        attabal attabalVar2 = this.f16521beachfront;
                        attabalVar2.f16493rotuma = attabalVar2.f16472apical >= 21;
                        attabal attabalVar3 = this.f16521beachfront;
                        attabalVar3.f16483gintrap = attabalVar3.f16472apical >= 20;
                        attabal attabalVar4 = this.f16521beachfront;
                        attabalVar4.f16481dovishness = attabalVar4.f16472apical >= 19;
                        attabal attabalVar5 = this.f16521beachfront;
                        attabalVar5.f16471adultoid = attabalVar5.f16472apical >= 18;
                        attabal attabalVar6 = this.f16521beachfront;
                        attabalVar6.f16484graveside = attabalVar6.f16472apical >= 17;
                        attabal attabalVar7 = this.f16521beachfront;
                        attabalVar7.f16489molybdenite = attabalVar7.f16472apical >= 16;
                        attabal attabalVar8 = this.f16521beachfront;
                        attabalVar8.f16491polloi = attabalVar8.f16472apical >= 15;
                        attabal attabalVar9 = this.f16521beachfront;
                        attabalVar9.f16490monoploid = attabalVar9.f16472apical >= 14;
                        attabal attabalVar10 = this.f16521beachfront;
                        attabalVar10.f16473arytenoidectomy = attabalVar10.f16472apical >= 12;
                        attabal attabalVar11 = this.f16521beachfront;
                        attabalVar11.f16487kowloon = attabalVar11.f16472apical >= 10;
                        attabal attabalVar12 = this.f16521beachfront;
                        attabalVar12.f16497triweekly = attabalVar12.f16472apical >= 9;
                        attabal attabalVar13 = this.f16521beachfront;
                        attabalVar13.f16485impassible = attabalVar13.f16472apical >= 8;
                        attabal attabalVar14 = this.f16521beachfront;
                        if (attabalVar14.f16472apical < 6) {
                            z = false;
                        }
                        attabalVar14.f16482formularize = z;
                        if (this.f16521beachfront.f16472apical < 3) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i = 36;
                        }
                        if (iZzy == 0) {
                            this.f16521beachfront.f16474attabal = 2;
                            if (this.f16521beachfront.f16498wireman != null) {
                                this.f16521beachfront.f16498wireman.competently(this.f16521beachfront.f16493rotuma);
                            }
                        } else {
                            this.f16521beachfront.f16474attabal = 0;
                            this.f16521beachfront.f16476competently = null;
                        }
                        strSubstring = null;
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (iZzy == 0) {
                        this.f16521beachfront.peridotite(zzcb.zzc(6));
                        wireman(arytenoidectomy.f16450formularize);
                    } else {
                        attabal attabalVar15 = this.f16521beachfront;
                        BillingResult billingResult = arytenoidectomy.f16442attabal;
                        attabalVar15.walach(zzcb.zzb(i, 6, billingResult, strSubstring));
                        wireman(billingResult);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public final void dern() {
        synchronized (this.f16522dern) {
            this.f16523marial = null;
            this.f16524wireman = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        this.f16521beachfront.f16476competently = com.google.android.gms.internal.play_billing.zzr.zzu(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzaz
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.attabal();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.saneness();
            }
        };
        attabal attabalVar = this.f16521beachfront;
        if (attabalVar.hydrovane(callable, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, runnable, attabalVar.grimness()) == null) {
            attabal attabalVar2 = this.f16521beachfront;
            BillingResult billingResultPrivatdozent = attabalVar2.privatdozent();
            attabalVar2.walach(zzcb.zza(25, 6, billingResultPrivatdozent));
            wireman(billingResultPrivatdozent);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        this.f16521beachfront.f16475beachfront.dern(zzhl.zzz());
        this.f16521beachfront.f16476competently = null;
        this.f16521beachfront.f16474attabal = 0;
        synchronized (this.f16522dern) {
            try {
                BillingClientStateListener billingClientStateListener = this.f16523marial;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingServiceDisconnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void saneness() {
        this.f16521beachfront.f16474attabal = 0;
        this.f16521beachfront.f16476competently = null;
        BillingResult billingResult = arytenoidectomy.f16467triweekly;
        this.f16521beachfront.walach(zzcb.zza(24, 6, billingResult));
        wireman(billingResult);
    }

    public final void wireman(BillingResult billingResult) {
        synchronized (this.f16522dern) {
            try {
                BillingClientStateListener billingClientStateListener = this.f16523marial;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingSetupFinished(billingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
