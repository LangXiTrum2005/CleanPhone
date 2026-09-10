package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfwv implements Closeable {
    public static zzfxh zza() {
        return new zzfxh();
    }

    public static zzfxh zzb(zzgqs<Integer> zzgqsVar, zzgqs<Integer> zzgqsVar2, zzfwx zzfwxVar) {
        return new zzfxh(zzgqsVar, zzgqsVar2, zzfwxVar);
    }

    public static zzfxh zzc(final int i2, zzfwx zzfwxVar) {
        return new zzfxh(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzfwu
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        }, zzfwt.zza, zzfwxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}
