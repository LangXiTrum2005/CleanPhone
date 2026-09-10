package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgxl extends zzgyd implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ListenableFuture zza;
    Object zzb;

    public zzgxl(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzk(listenableFuture);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgym.zzs(listenableFuture));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th) {
                try {
                    zzgze.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e2) {
            zzb(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e3) {
            zzb(e3.getCause());
        } catch (Exception e4) {
            zzb(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzd() {
        String strS;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strS = android.support.v4.media.a.s(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strS = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return strS.concat(strZzd);
            }
            return null;
        }
        int length = strS.length();
        String string2 = obj.toString();
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(string2.length() + length + 10 + 1), strS, "function=[", string2, d9.i.f24752e);
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;
}
