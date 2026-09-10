package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpu {
    private final Map zza;
    private final zzfqz zzb;
    private final zzfqd zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;
    private final zzfpp zzi;

    public zzfpu(zzfqz zzfqzVar, zzfqd zzfqdVar, Context context, Clock clock, zzfpp zzfppVar) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfqzVar;
        this.zzc = zzfqdVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzfppVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzy)).booleanValue()) {
            zzl(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z2) {
        try {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                for (zzfqy zzfqyVar : ((Map) it.next()).values()) {
                    if (z2) {
                        zzfqyVar.zzi();
                    } else {
                        zzfqyVar.zzh();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized Object zzo(Class cls, AdFormat adFormat, String str) {
        zzfqd zzfqdVar = this.zzc;
        Clock clock = this.zzg;
        zzfqdVar.zze(clock.currentTimeMillis(), "2");
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzfqy zzfqyVar = (zzfqy) ((Map) map.get(adFormat)).get(str);
        if (zzfqyVar != null && adFormat.equals(zzfqyVar.zzn())) {
            zzfqj zzfqjVar = new zzfqj(zzfqyVar.zze.zza, zzfqyVar.zzn());
            zzfqjVar.zza(str);
            zzfqk zzfqkVar = new zzfqk(zzfqjVar, null);
            zzfqdVar.zzf(clock.currentTimeMillis(), zzfqkVar, zzfqyVar.zze.zzd, zzfqyVar.zzo(), "2");
            try {
                String strZzj = zzfqyVar.zzj();
                Object objZzf = zzfqyVar.zzf();
                Object objCast = objZzf == null ? null : cls.cast(objZzf);
                if (objCast != null) {
                    zzfqdVar.zzh(clock.currentTimeMillis(), zzfqyVar.zze.zzd, zzfqyVar.zzo(), strZzj, zzfqkVar, "2");
                }
                return objCast;
            } catch (ClassCastException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PreloadAdManager.pollAd");
                com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e2);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzp(AdFormat adFormat) {
        int size;
        int iMax;
        try {
            Map map = this.zza;
            size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
            int iOrdinal = adFormat.ordinal();
            if (iOrdinal == 1) {
                iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfq)).intValue(), 1);
            } else if (iOrdinal == 2) {
                iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfr)).intValue(), 1);
            } else if (iOrdinal != 5) {
                iMax = 0;
            } else {
                iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfs)).intValue(), 1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return size < iMax;
    }

    public final synchronized boolean zza(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        zzfqy zzfqyVarZzb;
        try {
            if (!this.zzf.getAndSet(true)) {
                if (this.zze == null) {
                    synchronized (this) {
                        if (this.zze == null) {
                            try {
                                this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                            } catch (ClassCastException e2) {
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e2);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzI)).intValue());
                } else {
                    try {
                        this.zze.registerDefaultNetworkCallback(new zzfps(this));
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e3);
                        this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzI)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfpt(this));
            }
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && zzp(adFormat) && (zzfqyVarZzb = this.zzb.zzb(str, zzftVar, zzchVar)) != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzfqyVarZzb.zzl(atomicInteger.get());
                    }
                    zzfqd zzfqdVar = this.zzc;
                    zzfqyVarZzb.zzk(zzfqdVar);
                    zzfpp zzfppVar = this.zzi;
                    if (zzfppVar != null) {
                        zzfppVar.zzd(str, adFormat, zzfqyVarZzb);
                    } else {
                        zzfqyVarZzb.zzc();
                    }
                    ((Map) map.get(adFormat)).put(str, zzfqyVarZzb);
                    zzfqj zzfqjVar = new zzfqj(zzftVar.zza, adFormat);
                    zzfqjVar.zza(str);
                    zzfqdVar.zza(zzftVar.zzd, this.zzg.currentTimeMillis(), new zzfqk(zzfqjVar, null), "2");
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(AdFormat adFormat, String str) {
        zzfqk zzfqkVar;
        try {
            Clock clock = this.zzg;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Map map = this.zza;
            int iZzo = 0;
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzfqy zzfqyVar = (zzfqy) ((Map) map.get(adFormat)).get(str);
            String strZzj = zzfqyVar == null ? null : zzfqyVar.zzj();
            boolean z2 = strZzj != null && adFormat.equals(zzfqyVar.zzn());
            Long lValueOf = z2 ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzfqyVar == null) {
                zzfqkVar = null;
            } else {
                zzfqj zzfqjVar = new zzfqj(zzfqyVar.zze.zza, adFormat);
                zzfqjVar.zza(str);
                zzfqkVar = new zzfqk(zzfqjVar, null);
            }
            zzfqd zzfqdVar = this.zzc;
            int i2 = zzfqyVar == null ? 0 : zzfqyVar.zze.zzd;
            if (zzfqyVar != null) {
                iZzo = zzfqyVar.zzo();
            }
            zzfqdVar.zzd(i2, iZzo, jCurrentTimeMillis, lValueOf, strZzj, zzfqkVar, "2");
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzcaf zzc(String str) {
        return (zzcaf) zzo(zzcaf.class, AdFormat.REWARDED, str);
    }

    public final synchronized zzbed zzd(String str) {
        return (zzbed) zzo(zzbed.class, AdFormat.APP_OPEN_AD, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzo(com.google.android.gms.ads.internal.client.zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzft zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (map.containsKey(adFormat)) {
            zzfqy zzfqyVar = (zzfqy) ((Map) map.get(adFormat)).get(str);
            this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfqyVar == null ? null : zzfqyVar.zze.zza, adFormat, zzfqyVar == null ? -1 : zzfqyVar.zze.zzd, zzfqyVar != null ? zzfqyVar.zzo() : -1);
            if (zzfqyVar != null) {
                return zzfqyVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzfqy zzfqyVar = (zzfqy) ((Map) map.get(adFormat)).get(str);
        int iZzo = zzfqyVar != null ? zzfqyVar.zzo() : 0;
        this.zzc.zzp(iZzo, this.zzg.currentTimeMillis(), str, zzfqyVar == null ? null : zzfqyVar.zze.zza, adFormat, zzfqyVar == null ? -1 : zzfqyVar.zze.zzd);
        return iZzo;
    }

    public final synchronized Map zzh(int i2) {
        try {
            HashMap map = new HashMap();
            AdFormat adFormat = AdFormat.getAdFormat(i2);
            if (adFormat != null) {
                Map map2 = this.zza;
                if (map2.containsKey(adFormat)) {
                    for (zzfqy zzfqyVar : ((Map) map2.get(adFormat)).values()) {
                        map.put(zzfqyVar.zzm(), zzfqyVar.zze);
                    }
                    this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        zzfqy zzfqyVar;
        try {
            Map map = this.zza;
            if (map.containsKey(adFormat) && (zzfqyVar = (zzfqy) ((Map) map.get(adFormat)).get(str)) != null) {
                ((Map) map.get(adFormat)).remove(str);
                zzfqyVar.zzg();
                zzfpp zzfppVar = this.zzi;
                if (zzfppVar != null) {
                    zzfppVar.zze(str, adFormat);
                }
                zzfqyVar.zzq();
                zzfqd zzfqdVar = this.zzc;
                long jCurrentTimeMillis = this.zzg.currentTimeMillis();
                com.google.android.gms.ads.internal.client.zzft zzftVar = zzfqyVar.zze;
                zzfqdVar.zzm(jCurrentTimeMillis, str, zzftVar.zza, adFormat, zzftVar.zzd, zzfqyVar.zzo());
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzj(int i2) {
        try {
            AdFormat adFormat = AdFormat.getAdFormat(i2);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat)) {
                    Map map2 = (Map) map.get(adFormat);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzfqy zzfqyVar = (zzfqy) map2.get(str);
                        if (zzfqyVar != null) {
                            zzfqyVar.zzg();
                            zzfpp zzfppVar = this.zzi;
                            if (zzfppVar != null) {
                                zzfppVar.zze(str, adFormat);
                            }
                            zzfqyVar.zzq();
                            String strValueOf = String.valueOf(str);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    map2.clear();
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
                    this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
