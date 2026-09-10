package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzci implements zzch {
    protected zzcf zzb;
    protected zzcf zzc;
    private zzcf zzd;
    private zzcf zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzci() {
        ByteBuffer byteBuffer = zzch.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzcf zzcfVar = zzcf.zza;
        this.zzd = zzcfVar;
        this.zze = zzcfVar;
        this.zzb = zzcfVar;
        this.zzc = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzcf zza(zzcf zzcfVar) throws zzcg {
        this.zzd = zzcfVar;
        this.zze = zzi(zzcfVar);
        return zzg() ? this.zze : zzcf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzch.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzc() {
        this.zzg = zzch.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzf() {
        zzc();
        this.zzf = zzch.zza;
        zzcf zzcfVar = zzcf.zza;
        this.zzd = zzcfVar;
        this.zze = zzcfVar;
        this.zzb = zzcfVar;
        this.zzc = zzcfVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public boolean zzg() {
        return this.zze != zzcf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public boolean zzh() {
        return this.zzh && this.zzg == zzch.zza;
    }

    public zzcf zzi(zzcf zzcfVar) throws zzcg {
        throw null;
    }

    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
