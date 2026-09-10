package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p004ironsource.d9;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzip implements zzlg {
    public static final zzgtd zza = zzgtd.zzn(d9.h.f24719b, "content", "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzaan zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgtg zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzip() {
        zzaan zzaanVar = new zzaan(true, 65536);
        zzgtg zzgtgVarZza = zzgtg.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzaanVar;
        this.zze = zzfj.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzf = zzfj.zzq(1000L);
        this.zzg = zzfj.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzh = zzfj.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzi = zzfj.zzq(1000L);
        this.zzj = zzfj.zzq(1000L);
        this.zzk = zzfj.zzq(2000L);
        this.zzl = zzfj.zzq(1000L);
        this.zzm = zzfj.zzq(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgtg.zzc(zzgtgVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzpn zzpnVar) {
        Integer num = (Integer) this.zzn.get(zzpnVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpn zzpnVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzio zzioVar = (zzio) concurrentHashMap.get(zzpnVar);
        if (zzioVar != null) {
            int i2 = zzioVar.zza - 1;
            zzioVar.zza = i2;
            if (i2 == 0) {
                concurrentHashMap.remove(zzpnVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzaan zzaanVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((zzio) it.next()).zzc;
        }
        zzaanVar.zzf(i2);
    }

    private final boolean zzp(zzlf zzlfVar) {
        zzbf zzbfVar = zzlfVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzlfVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i2, int i3, String str, String str2) {
        zzgqa.zzh(i2 >= i3, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzpn zzpnVar) {
        zzio zzioVar = (zzio) this.zzo.get(zzpnVar);
        zzioVar.getClass();
        return zzioVar.zzc() * 65536;
    }

    private final int zzs(zzpn zzpnVar) {
        zzio zzioVar = (zzio) this.zzo.get(zzpnVar);
        zzioVar.getClass();
        return zzioVar.zzc;
    }

    private static final boolean zzt(boolean z2) {
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zza(zzpn zzpnVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzp;
        zzgqa.zzj(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzio zzioVar = (zzio) concurrentHashMap.get(zzpnVar);
        if (zzioVar == null) {
            concurrentHashMap.put(zzpnVar, new zzio());
        } else {
            zzioVar.zza++;
        }
        zzio zzioVar2 = (zzio) concurrentHashMap.get(zzpnVar);
        zzioVar2.getClass();
        int iZzm = zzm(zzpnVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzioVar2.zzc = iZzm;
        zzioVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzb(zzlf zzlfVar, zzyh zzyhVar, zzzw[] zzzwVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpn zzpnVar = zzlfVar.zza;
        int iZzm = zzm(zzpnVar);
        zzio zzioVar = (zzio) concurrentHashMap.get(zzpnVar);
        zzioVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzlfVar);
            int length = zzzwVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < length) {
                    zzzw zzzwVar = zzzwVarArr[i2];
                    if (zzzwVar != null) {
                        switch (zzzwVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i4 = 144310272;
                                break;
                            case 2:
                                i4 = !zZzp ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i4 = 131072;
                                break;
                            case 4:
                                i4 = 26214400;
                                break;
                        }
                        i3 += i4;
                    }
                    i2++;
                } else {
                    iZzm = Math.max(13107200, i3);
                }
            }
        }
        zzioVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzc(zzpn zzpnVar) {
        zzn(zzpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzd(zzpn zzpnVar) {
        zzn(zzpnVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final zzaah zze(zzpn zzpnVar) {
        return new zzin(this, zzpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final long zzf(zzpn zzpnVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzg(zzpn zzpnVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzh(zzlf zzlfVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpn zzpnVar = zzlfVar.zza;
        zzio zzioVar = (zzio) concurrentHashMap.get(zzpnVar);
        zzioVar.getClass();
        int iZzr = zzr(zzpnVar);
        int iZzs = zzs(zzpnVar);
        if (zzpnVar.equals(zzpn.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzlfVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j = zZzp ? this.zzh : this.zzg;
        float f = zzlfVar.zzf;
        if (f > 1.0f) {
            jMin = Math.min(zzfj.zzv(jMin, f), j);
        }
        long j2 = zzlfVar.zze;
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z2 = zzt(zZzp) || iZzr < iZzs;
            zzioVar.zzb = z2;
            if (!z2 && j2 < 500000) {
                zzee.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || iZzr >= iZzs) {
            zzioVar.zzb = false;
        }
        return zzioVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzi(zzlf zzlfVar) {
        long jMin;
        boolean z2;
        boolean z3 = zzlfVar.zzg;
        long j = zzlfVar.zze;
        float f = zzlfVar.zzf;
        boolean zZzp = zzp(zzlfVar);
        long jZzw = zzfj.zzw(j, f);
        if (z3) {
            if (zZzp) {
                jMin = this.zzl;
                z2 = true;
            } else {
                jMin = this.zzk;
                z2 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z2 = true;
        } else {
            jMin = this.zzi;
            z2 = false;
        }
        long j2 = zzlfVar.zzh;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin <= 0 || jZzw >= jMin) {
            return true;
        }
        if (!zzt(z2)) {
            zzpn zzpnVar = zzlfVar.zza;
            if (zzr(zzpnVar) >= zzs(zzpnVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzj(zzpn zzpnVar, zzbf zzbfVar, zzwg zzwgVar, long j) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzio) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzaan zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}
