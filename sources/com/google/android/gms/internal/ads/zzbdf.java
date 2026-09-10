package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbdf {
    private final Object zza = new Object();
    private zzbdd zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzbdd();
                        }
                        this.zzb.zza(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzbde zzbdeVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbdd();
                }
                this.zzb.zzb(zzbdeVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzbde zzbdeVar) {
        synchronized (this.zza) {
            try {
                zzbdd zzbddVar = this.zzb;
                if (zzbddVar == null) {
                    return;
                }
                zzbddVar.zzc(zzbdeVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity zzd() {
        synchronized (this.zza) {
            try {
                zzbdd zzbddVar = this.zzb;
                if (zzbddVar == null) {
                    return null;
                }
                return zzbddVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zze() {
        synchronized (this.zza) {
            try {
                zzbdd zzbddVar = this.zzb;
                if (zzbddVar == null) {
                    return null;
                }
                return zzbddVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            try {
                zzbdd zzbddVar = this.zzb;
                if (zzbddVar == null) {
                    return false;
                }
                return zzbddVar.zzg().get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(zzdum zzdumVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbdd();
                }
                this.zzb.zzj(zzdumVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
