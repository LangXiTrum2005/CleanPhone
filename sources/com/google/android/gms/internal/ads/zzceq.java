package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzceq extends TextureView implements zzcfn {
    protected final zzcfe zza;
    protected final zzcfo zzb;

    public zzceq(Context context) {
        super(context);
        this.zza = new zzcfe();
        this.zzb = new zzcfo(context, this);
    }

    public void zzA(int i2) {
    }

    public void zzB(int i2) {
    }

    public void zzC(int i2) {
    }

    public abstract String zza();

    public abstract void zzb(zzcep zzcepVar);

    public abstract void zzc(String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i2);

    public abstract void zzj(float f, float f2);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    public Integer zzw() {
        return null;
    }

    public void zzx(String str, String[] strArr, Integer num) {
        zzc(str);
    }

    public void zzy(int i2) {
    }

    public void zzz(int i2) {
    }
}
