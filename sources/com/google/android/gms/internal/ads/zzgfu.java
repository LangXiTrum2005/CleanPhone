package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfu extends zzgfz {
    private final Context zza;
    private final Map zzb;

    public zzgfu(zzavs zzavsVar, zzgev zzgevVar, Map map, Context context, zzgnc zzgncVar) {
        super("7lU8u/acj3glwX97dsCp50xaNaDZf5AvZZ8CZCZNZxVmN9GtRvkGNhtjwrrwJvh7", "R2aDW6OJL1JMomVNIKoK9g6amqmi0+KEXVHpRQdnX+U=", zzavsVar, zzgevVar, zzgncVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l2 = (Long) method.invoke("", this.zza);
                if (l2 == null) {
                    throw null;
                }
                lValueOf = l2;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.zzb.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    lValueOf = Long.valueOf(((zzawp) listenableFuture.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzavsVar) {
            zzavsVar.zzR(lValueOf.longValue());
        }
    }
}
