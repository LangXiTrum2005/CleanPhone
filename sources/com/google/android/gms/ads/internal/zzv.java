package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzaze;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbvr;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzecl;
import com.google.android.gms.internal.ads.zzecm;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv {
    private static final zzv zza = new zzv();
    private final zzbyi zzA;
    private final zzci zzB;
    private final zzccx zzC;
    private final zzcaj zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcfk zze;
    private final zzaa zzf;
    private final zzaze zzg;
    private final zzbzm zzh;
    private final zzab zzi;
    private final zzbar zzj;
    private final Clock zzk;
    private final zzf zzl;
    private final zzbcr zzm;
    private final zzbdk zzn;
    private final zzay zzo;
    private final zzbvr zzp;
    private final zzcac zzq;
    private final zzbnx zzr;
    private final zzz zzs;
    private final zzbt zzt;
    private final zzad zzu;
    private final zzae zzv;
    private final zzboz zzw;
    private final zzbu zzx;
    private final zzecm zzy;
    private final zzbbg zzz;

    public zzv() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcfk zzcfkVar = new zzcfk();
        int i = Build.VERSION.SDK_INT;
        zzaa zzyVar = i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new com.google.android.gms.ads.internal.util.zzv() : i >= 24 ? new com.google.android.gms.ads.internal.util.zzu() : new com.google.android.gms.ads.internal.util.zzt();
        zzaze zzazeVar = new zzaze();
        zzbzm zzbzmVar = new zzbzm();
        zzab zzabVar = new zzab();
        zzbar zzbarVar = new zzbar();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbcr zzbcrVar = new zzbcr();
        zzbdk zzbdkVar = new zzbdk();
        zzay zzayVar = new zzay();
        zzbvr zzbvrVar = new zzbvr();
        zzcac zzcacVar = new zzcac();
        zzbnx zzbnxVar = new zzbnx();
        zzz zzzVar = new zzz();
        zzbt zzbtVar = new zzbt();
        zzad zzadVar = new zzad();
        zzae zzaeVar = new zzae();
        zzboz zzbozVar = new zzboz();
        zzbu zzbuVar = new zzbu();
        zzecl zzeclVar = new zzecl();
        zzbbg zzbbgVar = new zzbbg();
        zzbyi zzbyiVar = new zzbyi();
        zzci zzciVar = new zzci();
        zzccx zzccxVar = new zzccx();
        zzcaj zzcajVar = new zzcaj();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzcfkVar;
        this.zzf = zzyVar;
        this.zzg = zzazeVar;
        this.zzh = zzbzmVar;
        this.zzi = zzabVar;
        this.zzj = zzbarVar;
        this.zzk = defaultClock;
        this.zzl = zzfVar;
        this.zzm = zzbcrVar;
        this.zzn = zzbdkVar;
        this.zzo = zzayVar;
        this.zzp = zzbvrVar;
        this.zzq = zzcacVar;
        this.zzr = zzbnxVar;
        this.zzt = zzbtVar;
        this.zzs = zzzVar;
        this.zzu = zzadVar;
        this.zzv = zzaeVar;
        this.zzw = zzbozVar;
        this.zzx = zzbuVar;
        this.zzy = zzeclVar;
        this.zzz = zzbbgVar;
        this.zzA = zzbyiVar;
        this.zzB = zzciVar;
        this.zzC = zzccxVar;
        this.zzD = zzcajVar;
    }

    public static zzcfk zzA() {
        return zza.zze;
    }

    public static zzecm zzB() {
        return zza.zzy;
    }

    public static Clock zzC() {
        return zza.zzk;
    }

    public static zzf zza() {
        return zza.zzl;
    }

    public static zzaze zzb() {
        return zza.zzg;
    }

    public static zzbar zzc() {
        return zza.zzj;
    }

    public static zzbbg zzd() {
        return zza.zzz;
    }

    public static zzbcr zze() {
        return zza.zzm;
    }

    public static zzbdk zzf() {
        return zza.zzn;
    }

    public static zzbnx zzg() {
        return zza.zzr;
    }

    public static zzboz zzh() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzi() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzj() {
        return zza.zzc;
    }

    public static zzz zzk() {
        return zza.zzs;
    }

    public static zzad zzl() {
        return zza.zzu;
    }

    public static zzae zzm() {
        return zza.zzv;
    }

    public static zzbvr zzn() {
        return zza.zzp;
    }

    public static zzbyi zzo() {
        return zza.zzA;
    }

    public static zzbzm zzp() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzq() {
        return zza.zzd;
    }

    public static zzaa zzr() {
        return zza.zzf;
    }

    public static zzab zzs() {
        return zza.zzi;
    }

    public static zzay zzt() {
        return zza.zzo;
    }

    public static zzbt zzu() {
        return zza.zzt;
    }

    public static zzbu zzv() {
        return zza.zzx;
    }

    public static zzci zzw() {
        return zza.zzB;
    }

    public static zzcac zzx() {
        return zza.zzq;
    }

    public static zzcaj zzy() {
        return zza.zzD;
    }

    public static zzccx zzz() {
        return zza.zzC;
    }
}
