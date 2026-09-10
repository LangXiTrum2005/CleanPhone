package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;

    @Nullable
    private static volatile zzda zze = null;
    private static volatile boolean zzf = false;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zza = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(zzcu.zza, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z2, zzdb zzdbVar) {
        if (zzczVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zza;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        synchronized (obj) {
                            try {
                                zzda zzdaVar = zze;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                if (zzdaVar == null || zzdaVar.zza() != context) {
                                    zzcg.zzd();
                                    zzdd.zzc();
                                    zzco.zze();
                                    zze = new zzcd(context, zzdn.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                        @Override // com.google.android.gms.internal.auth.zzdj
                                        public final Object zza() {
                                            Context context2 = context;
                                            int i2 = zzdc.zzd;
                                            return zzcp.zza(context2);
                                        }
                                    }));
                                    zzi.incrementAndGet();
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
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    public final Object zzb() {
        zzcl zzclVarZza;
        Object objZzb;
        if (!this.zzm && this.zzc == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i2 = zzi.get();
        if (this.zzk < i2) {
            synchronized (this) {
                try {
                    if (this.zzk < i2) {
                        zzda zzdaVar = zze;
                        if (zzdaVar == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        zzcz zzczVar = this.zzb;
                        boolean z2 = zzczVar.zzf;
                        if (zzczVar.zzb == null) {
                            Context contextZza = zzdaVar.zza();
                            String str = this.zzb.zza;
                            zzclVarZza = zzdd.zza(contextZza, null, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzdc.zzd();
                                }
                            });
                        } else if (zzcq.zza(zzdaVar.zza(), this.zzb.zzb)) {
                            boolean z3 = this.zzb.zzh;
                            zzclVarZza = zzcg.zza(zzdaVar.zza().getContentResolver(), this.zzb.zzb, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzdc.zzd();
                                }
                            });
                        } else {
                            zzclVarZza = null;
                        }
                        Object objZza = (zzclVarZza == null || (objZzb = zzclVarZza.zzb(zzc())) == null) ? null : zza(objZzb);
                        if (objZza == null) {
                            if (this.zzb.zze) {
                                objZza = null;
                            } else {
                                String strZzc = zzco.zza(zzdaVar.zza()).zzb(this.zzb.zze ? null : this.zzc);
                                if (strZzc != null) {
                                    objZza = zza(strZzc);
                                } else {
                                    objZza = null;
                                }
                            }
                            if (objZza == null) {
                                objZza = this.zzj;
                            }
                        }
                        zzdh zzdhVar = (zzdh) zzdaVar.zzb().zza();
                        if (zzdhVar.zzb()) {
                            zzci zzciVar = (zzci) zzdhVar.zza();
                            zzcz zzczVar2 = this.zzb;
                            String strZza = zzciVar.zza(zzczVar2.zzb, null, zzczVar2.zzd, this.zzc);
                            objZza = strZza == null ? this.zzj : zza(strZza);
                        }
                        this.zzl = objZza;
                        this.zzk = i2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zzb.zzd;
        return this.zzc;
    }
}
