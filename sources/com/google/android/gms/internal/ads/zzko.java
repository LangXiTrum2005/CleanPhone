package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes4.dex */
final class zzko {
    final /* synthetic */ zzkp zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    public /* synthetic */ zzko(zzkp zzkpVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzkpVar);
        this.zza = zzkpVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzkm
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i2) {
                zzkp zzkpVar2 = this.zza.zza;
                if (zzkpVar2.zzac()) {
                    return;
                }
                zzkpVar2.zzT(1, 19, Integer.valueOf(i2));
            }
        };
        this.zzc = intConsumer;
        final zzdx zzdxVarZzd = zzkpVar.zzX().zzd(zzkpVar.zzW(), null);
        Objects.requireNonNull(zzdxVarZzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzkn
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzdxVarZzd.zzn(runnable);
            }
        }, intConsumer);
    }

    public final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
