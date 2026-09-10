package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayk {
    protected volatile Boolean zzb;
    private final zzazt zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfwb zza = null;
    private static volatile Random zze = null;

    public zzayk(zzazt zzaztVar) {
        this.zzc = zzaztVar;
        zzaztVar.zzd().execute(new zzayj(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzayk.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i2, int i3, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzauy zzauyVarZza = zzavc.zza();
            zzauyVarZza.zza(this.zzc.zza.getPackageName());
            zzauyVarZza.zzb(j);
            if (str != null) {
                zzauyVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzauyVarZza.zzc(stringWriter.toString());
                zzauyVarZza.zzd(exc.getClass().getName());
            }
            zzfwa zzfwaVarZza = zza.zza(((zzavc) zzauyVarZza.zzbu()).zzaN());
            zzfwaVarZza.zzc(i2);
            if (i3 != -1) {
                zzfwaVarZza.zzb(i3);
            }
            zzfwaVarZza.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzazt zzb() {
        return this.zzc;
    }
}
