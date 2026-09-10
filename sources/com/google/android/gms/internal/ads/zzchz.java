package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzchz extends zzcfb implements zzhz, zzmx {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzchj zzc;
    private final zzzu zzd;
    private final zzcfj zze;
    private final WeakReference zzf;
    private final zzxn zzg;
    private zzje zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcfa zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzchm zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
    public zzchz(Context context, zzcfj zzcfjVar, zzcfk zzcfkVar, Integer num) {
        final boolean z2;
        final zzha zzhaVar;
        this.zzb = context;
        this.zze = zzcfjVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcfkVar);
        zzchj zzchjVar = new zzchj();
        this.zzc = zzchjVar;
        zzzu zzzuVar = new zzzu(context);
        this.zzd = zzzuVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcfb.zzf().incrementAndGet();
        zzmr zzmrVar = new zzmr(context, new zzmn() { // from class: com.google.android.gms.internal.ads.zzchu
            @Override // com.google.android.gms.internal.ads.zzmn
            public final /* synthetic */ zzmi[] zza(Handler handler, zzadg zzadgVar, zzqy zzqyVar, zzyk zzykVar, zzve zzveVar) {
                return this.zza.zzW(handler, zzadgVar, zzqyVar, zzykVar, zzveVar);
            }
        });
        zzmrVar.zza(zzzuVar);
        zzmrVar.zzb(zzchjVar);
        zzms zzmsVarZzc = zzmrVar.zzc();
        this.zzh = zzmsVarZzc;
        zzmsVarZzc.zzD(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgpy.zzd(zzcfkVar != null ? zzcfkVar.zzn() : null).zza("");
        this.zzp = zzcfkVar != null ? zzcfkVar.zzp() : 0;
        final String strZze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcfkVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcC)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue()) {
                    z2 = zzcfjVar.zzi ? false : true;
                }
            } else if (zzcfjVar.zzi) {
            }
            final zzha zzhaVar2 = zzcfjVar.zzl ? new zzha() { // from class: com.google.android.gms.internal.ads.zzchp
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    return this.zza.zzS(strZze, z2);
                }
            } : zzcfjVar.zzh > 0 ? new zzha() { // from class: com.google.android.gms.internal.ads.zzchr
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    return this.zza.zzU(strZze, z2);
                }
            } : new zzha() { // from class: com.google.android.gms.internal.ads.zzchq
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    return this.zza.zzT(strZze, z2);
                }
            };
            zzhaVar = zzcfjVar.zzi ? new zzha() { // from class: com.google.android.gms.internal.ads.zzchs
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    return this.zza.zzV(zzhaVar2);
                }
            } : zzhaVar2;
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcht
                    @Override // com.google.android.gms.internal.ads.zzha
                    public final /* synthetic */ zzhb zza() {
                        int i2 = zzchz.zza;
                        zzhb zzhbVarZza = zzhaVar.zza();
                        byte[] bArr2 = bArr;
                        return new zzchn(new zzgw(bArr2), bArr2.length, zzhbVarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcho
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    int i2 = zzchz.zza;
                    return new zzgw(bArr2);
                }
            };
        }
        this.zzg = new zzxn(zzhaVar, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzp)).booleanValue() ? zzchw.zza : zzchv.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzcfb.zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzA(int i2) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzchi zzchiVar = (zzchi) ((WeakReference) it.next()).get();
            if (zzchiVar != null) {
                zzchiVar.zzk(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzE(boolean z2) {
        this.zzh.zzj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzF(int i2) {
        this.zzc.zzk(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzG(int i2) {
        this.zzc.zzl(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map mapZzj = ((zzhu) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (mapZzj != null) {
                        for (Map.Entry entry : mapZzj.entrySet()) {
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgpj.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzM(boolean z2) {
        if (this.zzh == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            this.zzh.zzF();
            if (i2 >= 2) {
                return;
            }
            zzzu zzzuVar = this.zzd;
            zzze zzzeVarZzd = zzzuVar.zzc().zzd();
            zzzeVarZzd.zzy(i2, !z2);
            zzzuVar.zzf(zzzeVarZzd);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final long zzO() {
        return this.zzl;
    }

    public final zzwi zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzakVarZzc = zzzVar.zzc();
        zzxn zzxnVar = this.zzg;
        zzxnVar.zza(this.zze.zzf);
        return zzxnVar.zzb(zzakVarZzc);
    }

    public final /* synthetic */ zzhb zzS(String str, boolean z2) {
        zzchz zzchzVar = true != z2 ? null : this;
        zzcfj zzcfjVar = this.zze;
        return new zzcic(str, zzchzVar, zzcfjVar.zzd, zzcfjVar.zze, zzcfjVar.zzm, zzcfjVar.zzn);
    }

    public final /* synthetic */ zzhb zzT(String str, boolean z2) {
        zzhi zzhiVar = new zzhi();
        zzhiVar.zzb(str);
        zzhiVar.zzf(true != z2 ? null : this);
        zzcfj zzcfjVar = this.zze;
        zzhiVar.zzc(zzcfjVar.zzd);
        zzhiVar.zzd(zzcfjVar.zze);
        zzhiVar.zze(true);
        return zzhiVar.zza();
    }

    public final /* synthetic */ zzhb zzU(String str, boolean z2) {
        zzchz zzchzVar = true != z2 ? null : this;
        zzcfj zzcfjVar = this.zze;
        zzchi zzchiVar = new zzchi(str, zzchzVar, zzcfjVar.zzd, zzcfjVar.zze, zzcfjVar.zzh);
        this.zzu.add(new WeakReference(zzchiVar));
        return zzchiVar;
    }

    public final /* synthetic */ zzhb zzV(zzha zzhaVar) {
        zzhb zzhbVarZza = zzhaVar.zza();
        zzchk zzchkVar = new zzchk() { // from class: com.google.android.gms.internal.ads.zzchx
            @Override // com.google.android.gms.internal.ads.zzchk
            public final /* synthetic */ void zza(boolean z2, long j) {
                this.zza.zzX(z2, j);
            }
        };
        return new zzchm(this.zzb, zzhbVarZza, this.zzo, this.zzp, this, zzchkVar);
    }

    public final /* synthetic */ zzmi[] zzW(Handler handler, zzadg zzadgVar, zzqy zzqyVar, zzyk zzykVar, zzve zzveVar) {
        zzus zzusVar = zzus.zzb;
        Context context = this.zzb;
        zzsw zzswVar = new zzsw(context, new zzty(context, null, null), zzusVar, false, handler, zzqyVar, new zzsl(context).zza());
        zzabu zzabuVar = new zzabu(context);
        zzabuVar.zza(zzusVar);
        zzabuVar.zzb(handler);
        zzabuVar.zzc(zzadgVar);
        return new zzmi[]{zzswVar, zzabuVar.zzd()};
    }

    public final /* synthetic */ void zzX(boolean z2, long j) {
        zzcfa zzcfaVar = this.zzk;
        if (zzcfaVar != null) {
            zzcfaVar.zzr(z2, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
        if (zzhbVar instanceof zzhu) {
            synchronized (this.zzq) {
                this.zzs.add((zzhu) zzhbVar);
            }
        } else if (zzhbVar instanceof zzchm) {
            this.zzt = (zzchm) zzhbVar;
            final zzcfk zzcfkVar = (zzcfk) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue() && zzcfkVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i2 = zzchz.zza;
                        zzcfkVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z2, int i2) {
        this.zzl += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zze(zzmv zzmvVar, int i2) {
        zzcfa zzcfaVar = this.zzk;
        if (zzcfaVar != null) {
            zzcfaVar.zzs(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzg(zzmv zzmvVar, zzau zzauVar) {
        zzcfa zzcfaVar = this.zzk;
        if (zzcfaVar != null) {
            zzcfaVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzh(zzmv zzmvVar, zzvx zzvxVar, zzwc zzwcVar, IOException iOException, boolean z2) {
        zzcfa zzcfaVar = this.zzk;
        if (zzcfaVar != null) {
            if (this.zze.zzj) {
                zzcfaVar.zzv("onLoadException", iOException);
            } else {
                zzcfaVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzk(zzmv zzmvVar, zzv zzvVar, zzil zzilVar) {
        zzcfk zzcfkVar = (zzcfk) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue() || zzcfkVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzvVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcfkVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzl(zzmv zzmvVar, zzv zzvVar, zzil zzilVar) {
        zzcfk zzcfkVar = (zzcfk) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue() || zzcfkVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzvVar.zzz));
        map.put("bitRate", String.valueOf(zzvVar.zzj));
        int i2 = zzvVar.zzv;
        int i3 = zzvVar.zzw;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        map.put("resolution", sb.toString());
        String str = zzvVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcfkVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzm(zzmv zzmvVar, int i2, long j) {
        this.zzm += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzo(zzmv zzmvVar, Object obj, long j) {
        zzcfa zzcfaVar = this.zzk;
        if (zzcfaVar != null) {
            zzcfaVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzp(zzmv zzmvVar, zzbv zzbvVar) {
        zzcfa zzcfaVar = this.zzk;
        if (zzcfaVar != null) {
            zzcfaVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z2) {
        zzwi zzwxVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z2;
            int length = uriArr.length;
            if (length == 1) {
                zzwxVar = zzR(uriArr[0]);
            } else {
                zzwi[] zzwiVarArr = new zzwi[length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    zzwiVarArr[i2] = zzR(uriArr[i2]);
                }
                zzwxVar = new zzwx(false, false, new zzvr(), zzwiVarArr);
            }
            this.zzh.zzG(zzwxVar);
            this.zzh.zzg();
            zzcfb.zzi().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzs(zzcfa zzcfaVar) {
        this.zzk = zzcfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzt() {
        zzje zzjeVar = this.zzh;
        if (zzjeVar != null) {
            zzjeVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzcfb.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzu(Surface surface, boolean z2) {
        zzje zzjeVar = this.zzh;
        if (zzjeVar != null) {
            zzjeVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzv(float f, boolean z2) {
        zzje zzjeVar = this.zzh;
        if (zzjeVar != null) {
            zzjeVar.zzB(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzx(long j) {
        this.zzh.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzy(int i2) {
        this.zzc.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzz(int i2) {
        this.zzc.zzn(i2);
    }
}
