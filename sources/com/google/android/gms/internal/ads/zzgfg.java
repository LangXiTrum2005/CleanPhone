package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartdigimkt.o1.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfg extends zzgfz {
    private final Map zza;
    private final Context zzb;
    private final zzgba zzc;
    private final long zzd;
    private final long zze;

    public zzgfg(zzavs zzavsVar, zzgev zzgevVar, Map map, Context context, zzgba zzgbaVar, zzgad zzgadVar, zzgnc zzgncVar) {
        super("psdxhJQzj8JPGxUndFNRSuISrw/zf4LHyLEfW3r2aQ42o49HP5NqkxdFySNU3Xfl", "izTl1LmxrTMVVIqTN/Y0k7CnXfH3YKnExw0TgvQ6jLg=", zzavsVar, zzgevVar, zzgncVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgbaVar;
        this.zzd = zzgadVar.zzj();
        this.zze = zzgadVar.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        zzawp zzawpVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        int i2 = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzawpVar = (zzawp) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzawpVar.zzb().length() > 1)) {
                strZzb = zzawpVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get(b.a3);
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgqr.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzavsVar) {
            try {
                zzavsVar.zzu(((Long) objArr[0]).longValue());
                zzavsVar.zzt((String) objArr[1]);
                zzavsVar.zzD((String) objArr[2]);
                zzavsVar.zzE((String) objArr[3]);
                zzgvy zzgvyVarZzi = zzgvy.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzavsVar.zzp(zzgvyVarZzi.zzj(bArr, 0, bArr.length));
                zzavsVar.zzo(strZzb);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i2 = 2;
                    }
                    zzavsVar.zzai(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
