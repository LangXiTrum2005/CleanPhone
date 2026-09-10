package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgxe extends zzgyd implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    ListenableFuture zza;
    Class zzb;
    Object zzc;

    public zzgxe(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objZzs;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = listenableFuture instanceof zzgzo ? ((zzgzo) listenableFuture).zzl() : null;
            objZzs = th == null ? zzgym.zzs(listenableFuture) : null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e2.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                androidx.media3.extractor.text.ttml.a.C(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            zza(objZzs);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(listenableFuture);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th2) {
            try {
                zzgze.zza(th2);
                zzb(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzd() {
        String strS;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZzd = super.zzd();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strS = android.support.v4.media.a.s(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strS = "";
        }
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return strS.concat(strZzd);
            }
            return null;
        }
        int length = strS.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, strS, "exceptionType=[", string2, "], fallback=[");
        return android.support.v4.media.a.r(sb, string3, d9.i.f24752e);
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th) throws Exception;
}
