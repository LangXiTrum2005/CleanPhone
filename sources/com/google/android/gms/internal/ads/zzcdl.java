package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class zzcdl implements ThreadFactory {
    final /* synthetic */ String zza;
    private final AtomicInteger zzb = new AtomicInteger(1);

    public zzcdl(String str) {
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zzb.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(Z.d(str, 12, length));
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
