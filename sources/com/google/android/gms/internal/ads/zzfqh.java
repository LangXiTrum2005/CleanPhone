package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqh {
    private final zzfqz zzc;
    private final zzfqd zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzfqh(zzfqz zzfqzVar, zzfqd zzfqdVar, Context context, Clock clock) {
        this.zzc = zzfqzVar;
        this.zzd = zzfqdVar;
        this.zze = context;
        this.zzh = clock;
    }

    public static String zzh(String str, AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzy)).booleanValue()) {
            zzj(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z2) {
        try {
            if (z2) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfqy) it.next()).zzi();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfqy) it2.next()).zzh();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00e6, B:35:0x00fb, B:37:0x0101, B:34:0x00f8), top: B:43:0x0001 }] */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
                String strZzh = zzh(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
                hashSet.add(strZzh);
                ConcurrentMap concurrentMap = this.zza;
                zzfqy zzfqyVar = (zzfqy) concurrentMap.get(strZzh);
                if (zzfqyVar == null) {
                    ConcurrentMap concurrentMap2 = this.zzb;
                    if (concurrentMap2.containsKey(strZzh)) {
                        zzfqy zzfqyVar2 = (zzfqy) concurrentMap2.get(strZzh);
                        if (zzfqyVar2.zze.equals(zzftVar)) {
                            zzfqyVar2.zzv(zzftVar.zzd);
                            zzfqyVar2.zzi();
                            concurrentMap.put(strZzh, zzfqyVar2);
                            concurrentMap2.remove(strZzh);
                        } else {
                            arrayList.add(zzftVar);
                        }
                    } else {
                        arrayList.add(zzftVar);
                    }
                } else if (zzfqyVar.zze.equals(zzftVar)) {
                    zzfqyVar.zzv(zzftVar.zzd);
                } else {
                    this.zzb.put(strZzh, zzfqyVar);
                    concurrentMap.remove(strZzh);
                    arrayList.add(zzftVar);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfqy) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfqy zzfqyVar3 = (zzfqy) ((Map.Entry) it3.next()).getValue();
                zzfqyVar3.zzg();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzA)).booleanValue()) {
                    zzfqyVar3.zzq();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzB)).booleanValue()) {
                        zzfqyVar3.zzq();
                    }
                }
                if (!zzfqyVar3.zze()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzfqy zzfqyVar) {
        zzfqyVar.zzc();
        this.zza.put(str, zzfqyVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z2;
        try {
            Clock clock = this.zzh;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzfqy zzfqyVarZzq = zzq(str, adFormat);
            int iZzo = 0;
            z2 = zzfqyVarZzq != null && zzfqyVarZzq.zze();
            Long lValueOf = z2 ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzfqk zzfqkVar = new zzfqk(new zzfqj(str, adFormat), null);
            zzfqd zzfqdVar = this.zzd;
            int i2 = zzfqyVarZzq == null ? 0 : zzfqyVarZzq.zze.zzd;
            if (zzfqyVarZzq != null) {
                iZzo = zzfqyVarZzq.zzo();
            }
            zzfqdVar.zzd(i2, iZzo, jCurrentTimeMillis, lValueOf, zzfqyVarZzq != null ? zzfqyVarZzq.zzj() : null, zzfqkVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfqk zzfqkVar = new zzfqk(new zzfqj(str, adFormat), null);
        zzfqd zzfqdVar = this.zzd;
        Clock clock = this.zzh;
        zzfqdVar.zzf(clock.currentTimeMillis(), zzfqkVar, -1, -1, "1");
        zzfqy zzfqyVarZzq = zzq(str, adFormat);
        if (zzfqyVarZzq == null) {
            return null;
        }
        try {
            String strZzj = zzfqyVarZzq.zzj();
            Object objZzf = zzfqyVarZzq.zzf();
            Object objCast = objZzf == null ? null : cls.cast(objZzf);
            if (objCast != null) {
                zzfqdVar.zzh(clock.currentTimeMillis(), zzfqyVarZzq.zze.zzd, zzfqyVarZzq.zzo(), strZzj, zzfqkVar, "1");
            }
            return objCast;
        } catch (ClassCastException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e2);
            return null;
        }
    }

    private final synchronized zzfqy zzq(String str, AdFormat adFormat) {
        return (zzfqy) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e2) {
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e2);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzI)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfqg(this));
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e3);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzI)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfqf(this));
            }
            List<com.google.android.gms.ads.internal.client.zzft> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzft zzftVar : listZzm) {
                String str = zzftVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                zzfqy zzfqyVarZza = this.zzc.zza(zzftVar, zzceVar);
                if (adFormat != null && zzfqyVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzfqyVarZza.zzl(atomicInteger.get());
                    }
                    zzfqd zzfqdVar = this.zzd;
                    zzfqyVarZza.zzk(zzfqdVar);
                    zzn(zzh(str, adFormat), zzfqyVarZza);
                    enumMap.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfqdVar.zza(zzftVar.zzd, this.zzh.currentTimeMillis(), new zzfqk(new zzfqj(str, adFormat), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    public final synchronized zzcaf zzc(String str) {
        return (zzcaf) zzp(zzcaf.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized zzbed zze(String str) {
        return (zzbed) zzp(zzbed.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }
}
