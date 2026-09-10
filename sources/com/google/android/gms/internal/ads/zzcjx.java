package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcjx extends com.google.android.gms.ads.internal.client.zzec {
    private final zzcfk zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzeg zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzblg zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcjx(zzcfk zzcfkVar, float f, boolean z2, boolean z3) {
        this.zza = zzcfkVar;
        this.zzi = f;
        this.zzc = z2;
        this.zzd = z3;
    }

    private final void zzw(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzt(map2);
            }
        });
    }

    private final void zzx(final int i2, final int i3, final boolean z2, final boolean z3) {
        zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(i2, i3, z2, z3);
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        Object obj = this.zzb;
        boolean z2 = zzgaVar.zzb;
        boolean z3 = zzgaVar.zzc;
        synchronized (obj) {
            this.zzl = z2;
            this.zzm = z3;
        }
        boolean z4 = zzgaVar.zza;
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z4 ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void zzd(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z2) {
        zzw(true != z2 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() {
        boolean z2;
        synchronized (this.zzb) {
            z2 = this.zzh;
        }
        return z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() {
        int i2;
        synchronized (this.zzb) {
            i2 = this.zze;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(com.google.android.gms.ads.internal.client.zzeg zzegVar) {
        synchronized (this.zzb) {
            this.zzf = zzegVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() {
        boolean z2;
        synchronized (this.zzb) {
            try {
                z2 = false;
                if (this.zzc && this.zzl) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final com.google.android.gms.ads.internal.client.zzeg zzo() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        synchronized (this.zzb) {
            zzegVar = this.zzf;
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() {
        boolean z2;
        Object obj = this.zzb;
        boolean zZzn = zzn();
        synchronized (obj) {
            z2 = false;
            if (!zZzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z2;
        int i2;
        synchronized (this.zzb) {
            z2 = this.zzh;
            i2 = this.zze;
            this.zze = 3;
        }
        zzx(i2, 3, z2, z2);
    }

    public final void zzs(float f, float f2, int i2, boolean z2, float f3) {
        boolean z3;
        boolean z4;
        int i3;
        synchronized (this.zzb) {
            try {
                z3 = true;
                if (f2 == this.zzi && f3 == this.zzk) {
                    z3 = false;
                }
                this.zzi = f2;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzog)).booleanValue()) {
                    this.zzj = f;
                }
                z4 = this.zzh;
                this.zzh = z2;
                i3 = this.zze;
                this.zze = i2;
                float f4 = this.zzk;
                this.zzk = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.zza.zzE().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            try {
                zzblg zzblgVar = this.zzn;
                if (zzblgVar != null) {
                    zzblgVar.zze();
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
        zzx(i3, i2, z4, z2);
    }

    public final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final /* synthetic */ void zzu(int i2, int i3, boolean z2, boolean z3) {
        int i4;
        boolean z4;
        boolean z5;
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        com.google.android.gms.ads.internal.client.zzeg zzegVar2;
        com.google.android.gms.ads.internal.client.zzeg zzegVar3;
        synchronized (this.zzb) {
            try {
                boolean z6 = this.zzg;
                if (z6 || i3 != 1) {
                    i4 = i3;
                    z4 = false;
                } else {
                    i3 = 1;
                    i4 = 1;
                    z4 = true;
                }
                boolean z7 = i2 != i3;
                if (z7 && i4 == 1) {
                    z5 = true;
                    i4 = 1;
                } else {
                    z5 = false;
                }
                boolean z8 = z7 && i4 == 2;
                boolean z9 = z7 && i4 == 3;
                this.zzg = z6 || z4;
                if (z4) {
                    try {
                        com.google.android.gms.ads.internal.client.zzeg zzegVar4 = this.zzf;
                        if (zzegVar4 != null) {
                            zzegVar4.zze();
                        }
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
                if (z5 && (zzegVar3 = this.zzf) != null) {
                    zzegVar3.zzf();
                }
                if (z8 && (zzegVar2 = this.zzf) != null) {
                    zzegVar2.zzg();
                }
                if (z9) {
                    com.google.android.gms.ads.internal.client.zzeg zzegVar5 = this.zzf;
                    if (zzegVar5 != null) {
                        zzegVar5.zzh();
                    }
                    this.zza.zzz();
                }
                if (z2 != z3 && (zzegVar = this.zzf) != null) {
                    zzegVar.zzi(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzv(zzblg zzblgVar) {
        synchronized (this.zzb) {
            this.zzn = zzblgVar;
        }
    }
}
