package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezd implements zzezx {
    public static final /* synthetic */ int zzb = 0;
    private static final zzeze zzc = new zzeze(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzgyw zzd;
    private final ScheduledExecutorService zze;
    private final zzepk zzf;
    private final Context zzg;
    private final zzfik zzh;
    private final zzepf zzi;
    private final zzduu zzj;
    private final zzdzr zzk;
    private final int zzl;

    public zzezd(zzgyw zzgywVar, ScheduledExecutorService scheduledExecutorService, String str, zzepk zzepkVar, Context context, zzfik zzfikVar, zzepf zzepfVar, zzduu zzduuVar, zzdzr zzdzrVar, int i2) {
        this.zzd = zzgywVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzepkVar;
        this.zzg = context;
        this.zzh = zzfikVar;
        this.zzi = zzepfVar;
        this.zzj = zzduuVar;
        this.zzk = zzdzrVar;
        this.zzl = i2;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzepo zzepoVar = (zzepo) ((Map.Entry) it.next()).getValue();
            String str = zzepoVar.zza;
            list.add(zzh(str, Collections.singletonList(zzepoVar.zze), zzg(str), zzepoVar.zzb, zzepoVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgye zzh(final String str, final List list, final Bundle bundle, final boolean z2, final boolean z3) {
        zzgxt zzgxtVar = new zzgxt() { // from class: com.google.android.gms.internal.ads.zzeyy
            @Override // com.google.android.gms.internal.ads.zzgxt
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z2, z3);
            }
        };
        zzgyw zzgywVar = this.zzd;
        zzgye zzgyeVarZzw = zzgye.zzw(zzgym.zzf(zzgxtVar, zzgywVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcd)).booleanValue()) {
            zzgyeVarZzw = (zzgye) zzgym.zzi(zzgyeVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbW)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgye) zzgym.zzg(zzgyeVarZzw, Throwable.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzeyz
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i2 = zzezd.zzb;
                String str2 = str;
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzou)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgywVar);
    }

    private final void zzi(zzbuy zzbuyVar, Bundle bundle, List list, zzepn zzepnVar) throws RemoteException {
        zzbuyVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzepnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        if (this.zzl == 2) {
            return zzgym.zza(zzc);
        }
        zzfik zzfikVar = this.zzh;
        if (zzfikVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcj)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfikVar.zzd)))) {
                return zzgym.zza(zzc);
            }
        }
        return zzgym.zzf(new zzgxt() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzgxt
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 32;
    }

    public final /* synthetic */ ListenableFuture zzc() {
        final String str;
        zzezd zzezdVar;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmm)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzch)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfa)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcq)).booleanValue()) {
            zzezdVar = this;
            zzf(arrayList, zzezdVar.zzf.zzd(zzezdVar.zza, lowerCase));
        } else {
            zzepk zzepkVar = this.zzf;
            for (Map.Entry entry : zzepkVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzezdVar = this;
            zzf(arrayList, zzepkVar.zzb());
        }
        return zzgym.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = zzezd.zzb;
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzeze(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfa)).booleanValue()) {
                    return new zzeze(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, zzezdVar.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z2, boolean z3) throws RemoteException {
        final zzbuy zzbuyVar;
        zzbuy zzbuyVarZzb;
        final zzcdt zzcdtVar = new zzcdt();
        if (z3) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzci)).booleanValue()) {
                try {
                    zzbuyVarZzb = this.zzj.zzb(str);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e2);
                    zzbuyVar = null;
                }
            } else {
                zzepf zzepfVar = this.zzi;
                zzepfVar.zza(str);
                zzbuyVarZzb = zzepfVar.zzb(str);
            }
            zzbuyVar = zzbuyVarZzb;
        } else {
            zzbuyVarZzb = this.zzj.zzb(str);
            zzbuyVar = zzbuyVarZzb;
        }
        if (zzbuyVar == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbY)).booleanValue()) {
                throw null;
            }
            zzepn.zzd(str, zzcdtVar);
            return zzcdtVar;
        }
        final zzepn zzepnVar = new zzepn(str, zzbuyVar, zzcdtVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcd)).booleanValue()) {
            this.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzepnVar.zzc();
                }
            }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbW)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (!z2) {
            zzepnVar.zzb();
            return zzcdtVar;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzck)).booleanValue()) {
            this.zzd.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeza
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzbuyVar, bundle, list, zzepnVar, zzcdtVar);
                }
            });
            return zzcdtVar;
        }
        zzi(zzbuyVar, bundle, list, zzepnVar);
        return zzcdtVar;
    }

    public final /* synthetic */ void zze(zzbuy zzbuyVar, Bundle bundle, List list, zzepn zzepnVar, zzcdt zzcdtVar) {
        try {
            zzi(zzbuyVar, bundle, list, zzepnVar);
        } catch (RemoteException e2) {
            zzcdtVar.zzd(e2);
        }
    }
}
