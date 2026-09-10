package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzidf {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i2, long j);

    public abstract void zzb(Object obj, int i2, int i3);

    public abstract void zzc(Object obj, int i2, long j);

    public abstract void zzd(Object obj, int i2, zzhzl zzhzlVar);

    public abstract void zze(Object obj, int i2, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzicp zzicpVar, int i2) throws IOException {
        int iZzc = zzicpVar.zzc();
        int i3 = iZzc >>> 3;
        int i4 = iZzc & 7;
        if (i4 == 0) {
            zza(obj, i3, zzicpVar.zzh());
            return true;
        }
        if (i4 == 1) {
            zzc(obj, i3, zzicpVar.zzj());
            return true;
        }
        if (i4 == 2) {
            zzd(obj, i3, zzicpVar.zzq());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw new zzibg("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i3, zzicpVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i5 = i3 << 3;
        int i6 = i2 + 1;
        if (i6 >= zza) {
            throw new zzibg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzicpVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzicpVar, i6)) {
        }
        if ((i5 | 4) != zzicpVar.zzc()) {
            throw new zzibg("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i3, zzg(objZzf));
        return true;
    }
}
