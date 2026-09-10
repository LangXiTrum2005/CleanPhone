package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public abstract class zzcgx implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcgx(zzcfk zzcfkVar) {
        Context context = zzcfkVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcfkVar.zzs().afmaVersion);
        this.zzc = new WeakReference(zzcfkVar);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzcgp zzcgpVar) {
        return zze(str);
    }

    public void zzh(int i2) {
    }

    public void zzi(int i2) {
    }

    public void zzj(int i2) {
    }

    public void zzk(int i2) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j, long j2, boolean z2, long j3, long j4, long j5, int i2, int i3) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcgs(this, str, str2, j, j2, j3, j4, j5, z2, i2, i3));
    }

    public final void zzn(String str, String str2, int i2, int i3, long j, long j2, boolean z2, int i4, int i5) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcgt(this, str, str2, i2, i3, j, j2, z2, i4, i5));
    }

    public final void zzo(String str, String str2, int i2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcgu(this, str, str2, i2));
    }

    public final void zzp(String str, String str2, long j) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcgv(this, str, str2, j));
    }

    public final void zzq(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcgw(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void zzw(String str, Map map) {
        zzcfk zzcfkVar = (zzcfk) this.zzc.get();
        if (zzcfkVar != null) {
            zzcfkVar.zze("onPrecacheEvent", map);
        }
    }
}
