package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbdb {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbda zzbdaVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzbdaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzbda zzbdaVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzbda zzbdaVar2 = (zzbda) it.next();
                    if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                        if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze() && !zzbdaVar.equals(zzbdaVar2) && zzbdaVar2.zzc().equals(zzbdaVar.zzc())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzbdaVar.equals(zzbdaVar2) && zzbdaVar2.zzb().equals(zzbdaVar.zzb())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzbda zzbdaVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    int size = list.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String string = sb.toString();
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                    list.remove(0);
                }
                int i3 = this.zza;
                this.zza = i3 + 1;
                zzbdaVar.zzk(i3);
                zzbdaVar.zzh();
                list.add(zzbdaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
