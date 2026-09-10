package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxm extends zzaxr {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxm(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", zzascVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzV(zzh.longValue());
        }
    }
}
