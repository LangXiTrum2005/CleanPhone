package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgxs extends zzgxf.zzf {
    private static final zzgxp zzbg;
    private static final zzgyu zzbh = new zzgyu(zzgxs.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzgxp zzgxrVar;
        byte[] bArr = null;
        try {
            zzgxrVar = new zzgxq(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgxrVar = new zzgxr(bArr);
        }
        zzbg = zzgxrVar;
        if (th != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgxs(int i2) {
        this.remainingField = i2;
    }

    public final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbg.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbg.zzb(this);
    }

    public abstract void zzf(Set set);
}
