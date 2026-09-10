package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartdigimkt.q0.b;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdzp {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzduu zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdxp zzl;
    private final VersionInfoParcel zzm;
    private final zzdhq zzo;
    private final zzfnr zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcdt zze = new zzcdt();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public zzdzp(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzduu zzduuVar, ScheduledExecutorService scheduledExecutorService, zzdxp zzdxpVar, VersionInfoParcel versionInfoParcel, zzdhq zzdhqVar, zzfnr zzfnrVar) {
        this.zzh = zzduuVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdxpVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdhqVar;
        this.zzp = zzfnrVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized ListenableFuture zzu() {
        String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzgym.zza(strZzd);
        }
        final zzcdt zzcdtVar = new zzcdt();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzcdtVar);
            }
        });
        return zzcdtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z2, String str2, int i2) {
        this.zzn.put(str, new zzbpm(str, z2, i2, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzbpt zzbptVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbptVar.zzb(this.zza.zzd());
                } catch (RemoteException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbiq.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcr)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zze();
                        this.zzo.zze();
                        zzcdt zzcdtVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzh
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf();
                            }
                        };
                        Executor executor = this.zzi;
                        zzcdtVar.addListener(runnable, executor);
                        this.zza = true;
                        ListenableFuture listenableFutureZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzj
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzh();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzct)).longValue(), TimeUnit.SECONDS);
                        zzgym.zzr(listenableFutureZzu, new zzdzf(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbpm zzbpmVar = (zzbpm) map.get(str);
            arrayList.add(new zzbpm(str, zzbpmVar.zzb, zzbpmVar.zzc, zzbpmVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    public final /* synthetic */ void zzg(final zzcdt zzcdtVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzcdt zzcdtVar2 = zzcdtVar;
                if (zIsEmpty) {
                    zzcdtVar2.zzd(new Exception());
                } else {
                    zzcdtVar2.zzc(strZzd);
                }
            }
        });
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
                this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzi(Object obj, zzcdt zzcdtVar, String str, long j, zzfne zzfneVar) {
        synchronized (obj) {
            try {
                if (!zzcdtVar.isDone()) {
                    zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j));
                    this.zzl.zzc(str, "timeout");
                    this.zzo.zzc(str, "timeout");
                    zzfnr zzfnrVar = this.zzp;
                    zzfneVar.zzk(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                    zzfneVar.zzd(false);
                    zzfnrVar.zzb(zzfneVar.zzm());
                    zzcdtVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzj(zzfne zzfneVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfneVar.zzd(true);
        this.zzp.zzb(zzfneVar.zzm());
        return null;
    }

    public final /* synthetic */ void zzk(String str, zzbpq zzbpqVar, zzfji zzfjiVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbpqVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfjiVar.zzA(context, zzbpqVar, list);
            } catch (RemoteException e2) {
                throw new zzgqy(e2);
            } catch (zzfir unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                zzbpqVar.zzf(sb.toString());
            }
        } catch (RemoteException e3) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
    }

    public final /* synthetic */ void zzl(String str) {
        final zzdzp zzdzpVar = this;
        Context context = zzdzpVar.zzf;
        int i2 = 5;
        final zzfne zzfneVarZzn = zzfne.zzn(context, 5);
        zzfneVarZzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(b.i0);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfne zzfneVarZzn2 = zzfne.zzn(context, i2);
                zzfneVarZzn2.zza();
                zzfneVarZzn2.zzi(next);
                final Object obj = new Object();
                final zzcdt zzcdtVar = new zzcdt();
                ListenableFuture listenableFutureZzi = zzgym.zzi(zzcdtVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcs)).longValue(), TimeUnit.SECONDS, zzdzpVar.zzk);
                zzdzpVar.zzl.zza(next);
                zzdzpVar.zzo.zza(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                listenableFutureZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzcdtVar, next, jElapsedRealtime, zzfneVarZzn2);
                    }
                }, zzdzpVar.zzi);
                arrayList.add(listenableFutureZzi);
                try {
                    try {
                        final zzdzg zzdzgVar = new zzdzg(this, obj, next, jElapsedRealtime, zzfneVarZzn2, zzcdtVar);
                        zzdzpVar = this;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i3 = 0;
                                while (i3 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zzbpw(strOptString, bundle));
                                    i3++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzdzpVar.zzm(next, false, "", 0);
                        try {
                            final zzfji zzfjiVarZza = zzdzpVar.zzh.zza(next, new JSONObject());
                            zzdzpVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzm
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzk(next, zzdzgVar, zzfjiVarZza, arrayList2);
                                }
                            });
                        } catch (zzfir e2) {
                            try {
                                String string = "Failed to create Adapter.";
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzos)).booleanValue()) {
                                    String message = e2.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    string = sb.toString();
                                }
                                zzdzgVar.zzf(string);
                            } catch (RemoteException e3) {
                                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                            }
                        }
                        i2 = 5;
                    } catch (JSONException e4) {
                        e = e4;
                        zzdzpVar = this;
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                        zzdzpVar.zzo.zzd("MalformedJson");
                        zzdzpVar.zzl.zzd("MalformedJson");
                        zzdzpVar.zze.zzd(e);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
                        zzfnr zzfnrVar = zzdzpVar.zzp;
                        zzfneVarZzn.zzj(e);
                        zzfneVarZzn.zzd(false);
                        zzfnrVar.zzb(zzfneVarZzn.zzm());
                    }
                } catch (JSONException e5) {
                    e = e5;
                    zzdzpVar = this;
                }
            }
            zzgym.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzl
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfneVarZzn);
                    return null;
                }
            }, zzdzpVar.zzi);
        } catch (JSONException e6) {
            e = e6;
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
            zzdzpVar.zzo.zzd("MalformedJson");
            zzdzpVar.zzl.zzd("MalformedJson");
            zzdzpVar.zze.zzd(e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
            zzfnr zzfnrVar2 = zzdzpVar.zzp;
            zzfneVarZzn.zzj(e);
            zzfneVarZzn.zzd(false);
            zzfnrVar2.zzb(zzfneVarZzn.zzm());
        }
    }

    public final /* synthetic */ void zzn(boolean z2) {
        this.zzc = true;
    }

    public final /* synthetic */ long zzo() {
        return this.zzd;
    }

    public final /* synthetic */ zzcdt zzp() {
        return this.zze;
    }

    public final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    public final /* synthetic */ zzdxp zzr() {
        return this.zzl;
    }

    public final /* synthetic */ zzdhq zzs() {
        return this.zzo;
    }

    public final /* synthetic */ zzfnr zzt() {
        return this.zzp;
    }
}
