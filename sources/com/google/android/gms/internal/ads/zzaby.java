package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaby extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabx zzd;
    private boolean zze;

    public /* synthetic */ zzaby(zzabx zzabxVar, SurfaceTexture surfaceTexture, boolean z2, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzabxVar;
        this.zza = z2;
    }

    public static synchronized boolean zza(Context context) {
        int i2;
        if (!zzc) {
            try {
                if (zzdv.zza(context)) {
                    i2 = zzdv.zzb() ? 1 : 2;
                } else {
                    i2 = 0;
                }
            } catch (zzdu e2) {
                zzee.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e2.getMessage())));
            }
            zzb = i2;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzaby zzb(Context context, boolean z2) {
        boolean z3 = true;
        if (z2 && !zza(context)) {
            z3 = false;
        }
        zzgqa.zzi(z3);
        return new zzabx().zza(z2 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzabx zzabxVar = this.zzd;
        synchronized (zzabxVar) {
            try {
                if (!this.zze) {
                    zzabxVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
