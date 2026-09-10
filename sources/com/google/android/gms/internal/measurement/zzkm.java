package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();

    @Nullable
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        Preconditions.j(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z2, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        try {
                            zzkh zzkhVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzkhVar == null || zzkhVar.zza() != context) {
                                if (zzkhVar != null) {
                                    zzjr.zzd();
                                    zzko.zzb();
                                    zzjy.zzc();
                                }
                                zze = new zzjn(context, Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzkl
                                    @Override // com.google.common.base.Supplier
                                    public final /* synthetic */ Object get() {
                                        int i2 = zzkm.zzc;
                                        return zzjz.zza(context);
                                    }
                                }));
                                zzh.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    @Nullable
    public abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x0047 A[PHI: r2
  0x0047: PHI (r2v1 com.google.common.base.Optional) = (r2v0 com.google.common.base.Optional), (r2v0 com.google.common.base.Optional), (r2v5 com.google.common.base.Optional) binds: [B:8:0x0016, B:10:0x001c, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzd() {
        String strZza;
        String strZze;
        Object objZze;
        int i2 = zzh.get();
        if (this.zzi < i2) {
            synchronized (this) {
                try {
                    if (this.zzi < i2) {
                        zzkh zzkhVar = zze;
                        Optional optionalD = Optional.d();
                        Object objZza = null;
                        if (zzkhVar == null || zzkhVar.zzb() == null) {
                            strZza = null;
                        } else {
                            Supplier supplierZzb = zzkhVar.zzb();
                            supplierZzb.getClass();
                            optionalD = (Optional) supplierZzb.get();
                            if (optionalD.h()) {
                                zzjt zzjtVar = (zzjt) optionalD.g();
                                zzkg zzkgVar = this.zza;
                                strZza = zzjtVar.zza(zzkgVar.zza, null, zzkgVar.zzc, this.zzb);
                            } else {
                                strZza = null;
                            }
                        }
                        Preconditions.o("Must call PhenotypeFlagInitializer.maybeInit() first", zzkhVar != null);
                        zzkg zzkgVar2 = this.zza;
                        Uri uri = zzkgVar2.zza;
                        if (uri == null) {
                            zzkhVar.zza();
                            throw null;
                        }
                        zzjr zzjrVarZza = zzka.zza(zzkhVar.zza(), uri) ? zzjr.zza(zzkhVar.zza().getContentResolver(), uri, zzkj.zza) : null;
                        Object objZza2 = (zzjrVarZza == null || (objZze = zzjrVarZza.zze(this.zzb)) == null) ? null : zza(objZze);
                        if (objZza2 == null) {
                            if (!zzkgVar2.zzd && (strZze = zzjy.zza(zzkhVar.zza()).zze(this.zzb)) != null) {
                                objZza = zza(strZze);
                            }
                            objZza2 = objZza == null ? this.zzg : objZza;
                        }
                        if (optionalD.h()) {
                            objZza2 = strZza == null ? this.zzg : zza(strZza);
                        }
                        this.zzj = objZza2;
                        this.zzi = i2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzj;
    }
}
