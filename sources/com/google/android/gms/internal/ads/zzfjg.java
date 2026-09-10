package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfjg {
    private static zzfjg zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfjg(Context context, com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzb = context;
        this.zzc = zzcyVar;
    }

    public static zzfjg zza(Context context) {
        synchronized (zzfjg.class) {
            try {
                zzfjg zzfjgVar = zza;
                if (zzfjgVar != null) {
                    return zzfjgVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbil.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcy zzcyVarZzf = null;
                if (jLongValue > 0 && jLongValue <= 254380000) {
                    zzcyVarZzf = zzf(applicationContext);
                }
                zzfjg zzfjgVar2 = new zzfjg(applicationContext, zzcyVarZzf);
                zza = zzfjgVar2;
                return zzfjgVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static com.google.android.gms.ads.internal.client.zzcy zzf(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e2);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfc zzg() {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                return zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i2, boolean z2, int i3) {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i3, true, zZzJ);
        return (((Boolean) zzbil.zzc.zze()).booleanValue() && (zzfcVarZzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzfcVarZzg.zza(), true, zZzJ) : versionInfoParcel;
    }

    public final void zzc(zzbsz zzbszVar) {
        zzbsz adapterCreator;
        if (!((Boolean) zzbil.zza.zze()).booleanValue()) {
            AtomicReference atomicReference = this.zzd;
            while (!atomicReference.compareAndSet(null, zzbszVar) && atomicReference.get() == null) {
            }
            return;
        }
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator == null) {
            adapterCreator = zzbszVar;
        }
        while (!atomicReference2.compareAndSet(null, adapterCreator) && atomicReference2.get() == null) {
        }
    }

    public final zzbsz zzd() {
        return (zzbsz) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg = zzg();
        if (zzfcVarZzg != null) {
            return zzfcVarZzg.zzb();
        }
        return null;
    }
}
