package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgco implements zzgcf, zzgcb, zzgcu {
    private static final zzied zza;
    private final Context zzb;
    private final zzgbj zzc;
    private final ExecutorService zzd;
    private final zzgbc zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzauv zzq = zzauw.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zziec zziecVarZzc = zzied.zzc();
        zziecVarZzc.zza(17);
        zza = (zzied) zziecVarZzc.zzbu();
    }

    public zzgco(Context context, zzgbj zzgbjVar, ExecutorService executorService, zzgbc zzgbcVar, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.zzb = context;
        this.zzc = zzgbjVar;
        this.zzd = executorService;
        this.zze = zzgbcVar;
        this.zzg = str;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = d;
        this.zzk = str2;
        this.zzl = j3;
        this.zzf = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final ListenableFuture zza() {
        return zzgym.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgcm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(int i2, long j, Throwable th, String str) {
        long jLongValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap map = this.zzt;
                            Integer numValueOf = Integer.valueOf(i2);
                            Long l2 = (Long) map.get(numValueOf);
                            if (l2 == null) {
                                l2 = 0L;
                            }
                            jLongValue = 1 + l2.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    list.add(new zzgcl(i2, j, th, str, jLongValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgcn
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzd();
                            }
                        }, this.zzi);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void zzc(zzgct zzgctVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgctVar.zza());
        }
    }

    public final void zzd() {
        zzauv zzauvVar;
        zzgtd zzgtdVarZzq;
        String string;
        synchronized (this.zzn) {
            zzauvVar = (zzauv) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgtdVarZzq = zzgtd.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgtdVarZzq.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            zzgcl zzgclVar = (zzgcl) zzgtdVarZzq.get(i2);
            if (i3 >= this.zzh) {
                zze((zzauw) zzauvVar.zzbu());
                zzauvVar.zzb();
                i3 = 0;
            }
            zzavn zzavnVarZza = zzavo.zza();
            zzavnVarZza.zza(zzgclVar.zza);
            zzavnVarZza.zzb(zzgclVar.zzb);
            zzavnVarZza.zze(zzgclVar.zze);
            String str = zzgclVar.zzd;
            if (str != null) {
                zzavnVarZza.zzf(str);
            }
            Throwable th = zzgclVar.zzc;
            zzavnVarZza.zzg(th == null ? 2 : 3);
            if (th != null) {
                zzavnVarZza.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                            zzavnVarZza.zzd(string);
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    string = "";
                }
            }
            zzauvVar.zza((zzavo) zzavnVarZza.zzbu());
            i2++;
            i3++;
        }
        if (i3 > 0) {
            zze((zzauw) zzauvVar.zzbu());
            zzauvVar.zzb();
        }
    }

    public final void zze(zzauw zzauwVar) {
        try {
            zzgcj zzgcjVarZza = zzgck.zza();
            zzgcjVarZza.zzb(zza);
            zzgch zzgchVarZza = zzgci.zza();
            zzgchVarZza.zza(zzauwVar);
            zzgcjVarZza.zza((zzgci) zzgchVarZza.zzbu());
            this.zze.zzb(this.zzg, ((zzgck) zzgcjVarZza.zzbu()).zzaN(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }

    public final /* synthetic */ void zzf() {
        int i2;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d = this.zzj;
        long j = this.zzl;
        Locale locale = Locale.getDefault();
        zzauv zzauvVarZza = zzauw.zza();
        zzauvVarZza.zzc(Build.VERSION.SDK_INT);
        zzauvVarZza.zzd(Build.MODEL);
        zzauvVarZza.zze(locale.getLanguage());
        zzauvVarZza.zzf(locale.getCountry());
        zzauvVarZza.zzi(str);
        zzauvVarZza.zzg(context.getPackageName());
        zzauvVarZza.zzl(j);
        if (d > 0.0d) {
            zzauvVarZza.zzk((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzauvVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i2 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i2 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i2 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i2 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzauvVarZza.zzm(i2);
        } catch (RuntimeException unused2) {
        }
        zzauw zzauwVar = (zzauw) zzauvVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzauwVar);
        }
    }
}
