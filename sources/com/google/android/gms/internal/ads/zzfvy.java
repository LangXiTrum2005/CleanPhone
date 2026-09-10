package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvy {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfvz zzc;
    private final zzfuf zzd;
    private final zzfua zze;
    private final boolean zzf;
    private zzfvn zzg;
    private final Object zzh = new Object();

    public zzfvy(Context context, zzfvz zzfvzVar, zzfuf zzfufVar, zzfua zzfuaVar, boolean z2) {
        this.zzb = context;
        this.zzc = zzfvzVar;
        this.zzd = zzfufVar;
        this.zze = zzfuaVar;
        this.zzf = z2;
    }

    private final synchronized Class zzd(zzfvo zzfvoVar) throws zzfvx {
        try {
            if (zzfvoVar.zza() == null) {
                throw new zzfvx(4010, "mc");
            }
            String strZza = zzfvoVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfvoVar.zzb())) {
                    throw new zzfvx(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfvoVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfvoVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    throw new zzfvx(2008, e);
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    throw new zzfvx(2008, e);
                } catch (SecurityException e4) {
                    e = e4;
                    throw new zzfvx(2008, e);
                }
            } catch (GeneralSecurityException e5) {
                throw new zzfvx(2026, e5);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean zza(zzfvo zzfvoVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfvn zzfvnVar = new zzfvn(zzd(zzfvoVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfvoVar.zzd(), null, new Bundle(), 2), zzfvoVar, this.zzc, this.zzd, this.zzf);
                if (!zzfvnVar.zzf()) {
                    throw new zzfvx(4000, "init failed");
                }
                int iZzh = zzfvnVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfvx(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfvn zzfvnVar2 = this.zzg;
                    if (zzfvnVar2 != null) {
                        try {
                            zzfvnVar2.zzg();
                        } catch (zzfvx e2) {
                            this.zzd.zzc(e2.zza(), -1L, e2);
                        }
                        this.zzg = zzfvnVar;
                    } else {
                        this.zzg = zzfvnVar;
                    }
                    throw th;
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e3) {
                throw new zzfvx(2004, e3);
            }
        } catch (zzfvx e4) {
            this.zzd.zzc(e4.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e5);
            return false;
        }
    }

    public final zzfui zzb() {
        zzfvn zzfvnVar;
        synchronized (this.zzh) {
            zzfvnVar = this.zzg;
        }
        return zzfvnVar;
    }

    public final zzfvo zzc() {
        synchronized (this.zzh) {
            try {
                zzfvn zzfvnVar = this.zzg;
                if (zzfvnVar == null) {
                    return null;
                }
                return zzfvnVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
