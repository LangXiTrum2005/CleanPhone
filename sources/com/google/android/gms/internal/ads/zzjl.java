package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzjl implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzadg, zzqy, zzyk, zzve, zzby, zzeu {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkp zza;

    public /* synthetic */ zzjl(zzkp zzkpVar, byte[] bArr) {
        Objects.requireNonNull(zzkpVar);
        this.zza = zzkpVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzkp zzkpVar = this.zza;
        zzkpVar.zzQ(surfaceTexture);
        zzkpVar.zzS(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkp zzkpVar = this.zza;
        zzkpVar.zzR(null);
        zzkpVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.zza.zzS(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.zza.zzS(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzeu
    public final void zza(zzfb zzfbVar) {
        this.zza.zzP(zzit.zzc(zzfbVar, 1003));
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzb(zzik zzikVar) {
        this.zza.zzV().zzN(zzikVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzc(String str, long j, long j2) {
        this.zza.zzV().zzO(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzd(zzv zzvVar, zzil zzilVar) {
        this.zza.zzV().zzP(zzvVar, zzilVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zze(int i2, long j) {
        this.zza.zzV().zzQ(i2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzf(final zzbv zzbvVar) {
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzt(zzbvVar);
            }
        };
        zzed zzedVarZzU = this.zza.zzU();
        zzedVarZzU.zzd(25, zzdyVar);
        zzedVarZzU.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzg(Object obj, long j) {
        zzkp zzkpVar = this.zza;
        zzkpVar.zzV().zzT(obj, j);
        if (zzkpVar.zzZ() == obj) {
            zzed zzedVarZzU = zzkpVar.zzU();
            zzedVarZzU.zzd(26, zzjk.zza);
            zzedVarZzU.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzh(String str) {
        this.zza.zzV().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzi(zzik zzikVar) {
        this.zza.zzV().zzS(zzikVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzj(long j, int i2) {
        this.zza.zzV().zzU(j, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzk(Exception exc) {
        this.zza.zzV().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzl(zzik zzikVar) {
        this.zza.zzV().zzC(zzikVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzm(String str, long j, long j2) {
        this.zza.zzV().zzD(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzn(zzv zzvVar, zzil zzilVar) {
        this.zza.zzV().zzE(zzvVar, zzilVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzo(long j) {
        this.zza.zzV().zzF(j);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzp(int i2, long j, long j2) {
        this.zza.zzV().zzG(i2, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzq(String str) {
        this.zza.zzV().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzr(zzik zzikVar) {
        this.zza.zzV().zzI(zzikVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzs(final boolean z2) {
        zzkp zzkpVar = this.zza;
        if (zzkpVar.zzaa() == z2) {
            return;
        }
        zzkpVar.zzab(z2);
        zzed zzedVarZzU = zzkpVar.zzU();
        zzedVarZzU.zzd(23, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjg
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzs(z2);
            }
        });
        zzedVarZzU.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzt(Exception exc) {
        this.zza.zzV().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzu(Exception exc) {
        this.zza.zzV().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzv(zzqz zzqzVar) {
        this.zza.zzV().zzL(zzqzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzw(zzqz zzqzVar) {
        this.zza.zzV().zzM(zzqzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final void zzx(final int i2) {
        this.zza.zzY().zza(new zzgpr() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i2);
            }
        }, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzji
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i2);
            }
        });
    }
}
