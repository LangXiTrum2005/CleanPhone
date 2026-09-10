package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.o1.b;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayi implements zzayl {
    private static zzayi zzb;
    private final Context zzc;
    private final zzfvp zzd;
    private final zzfvw zze;
    private final zzfvy zzf;
    private final zzazn zzg;
    private final zzfuf zzh;
    private final Executor zzi;
    private final zzbbq zzj;
    private final zzfvv zzk;
    private final zzbac zzm;
    private final zzazu zzn;
    private final zzazl zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    public zzayi(Context context, zzfuf zzfufVar, zzfvp zzfvpVar, zzfvw zzfvwVar, zzfvy zzfvyVar, zzazn zzaznVar, Executor executor, zzfua zzfuaVar, zzbbq zzbbqVar, zzbac zzbacVar, zzazu zzazuVar, zzazl zzazlVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfufVar;
        this.zzd = zzfvpVar;
        this.zze = zzfvwVar;
        this.zzf = zzfvyVar;
        this.zzg = zzaznVar;
        this.zzi = executor;
        this.zzj = zzbbqVar;
        this.zzm = zzbacVar;
        this.zzn = zzazuVar;
        this.zzo = zzazlVar;
        this.zzr = false;
        this.zzk = new zzayg(this, zzfuaVar);
    }

    public static synchronized zzayi zza(Context context, zzauu zzauuVar, boolean z2) {
        zzfug zzfugVarZzh;
        zzfugVarZzh = zzfuh.zzh();
        zzfugVarZzh.zza(zzauuVar.zza());
        zzfugVarZzh.zzb(zzauuVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfugVarZzh.zzh(), z2);
    }

    private static synchronized zzayi zzs(Context context, Executor executor, zzfuh zzfuhVar, boolean z2) {
        try {
            if (zzb == null) {
                zzfuf zzfufVarZza = zzfuf.zza(context, executor, z2);
                zzayw zzaywVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeh)).booleanValue() ? zzayw.zza(context) : null;
                zzbac zzbacVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzei)).booleanValue() ? zzbac.zza(context, executor) : null;
                zzazu zzazuVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdq)).booleanValue() ? new zzazu() : null;
                zzazl zzazlVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdz)).booleanValue() ? new zzazl() : null;
                zzfuv zzfuvVarZza = zzfuv.zza(context, executor, zzfufVarZza, zzfuhVar);
                zzazm zzazmVar = new zzazm(context);
                zzazn zzaznVar = new zzazn(zzfuhVar, zzfuvVarZza, new zzbaa(context, zzazmVar), zzazmVar, zzaywVarZza, zzbacVarZza, zzazuVar, zzazlVar);
                zzbbq zzbbqVarZzb = zzfvc.zzb(context, zzfufVarZza);
                zzfua zzfuaVar = new zzfua();
                zzayi zzayiVar = new zzayi(context, zzfufVarZza, new zzfvp(context, zzbbqVarZzb), new zzfvw(context, zzbbqVarZzb, new zzayf(zzfufVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzda)).booleanValue()), new zzfvy(context, zzaznVar, zzfufVarZza, zzfuaVar, false), zzaznVar, executor, zzfuaVar, zzbbqVarZzb, zzbacVarZza, zzazuVar, zzazlVar);
                zzb = zzayiVar;
                zzayiVar.zzc();
                zzb.zzm();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final void zzt() {
        zzbac zzbacVar = this.zzm;
        if (zzbacVar != null) {
            zzbacVar.zzb();
        }
    }

    private final zzfvo zzu(int i2) {
        if (zzfvc.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcY)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    public final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfvo zzfvoVarZzu = zzu(1);
        if (zzfvoVarZzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfvoVarZzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzd(MotionEvent motionEvent) {
        zzfui zzfuiVarZzb = this.zzf.zzb();
        if (zzfuiVarZzb != null) {
            try {
                zzfuiVarZzb.zzd(null, motionEvent);
            } catch (zzfvx e2) {
                this.zzh.zzc(e2.zza(), -1L, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zze(int i2, int i3, int i4) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznp)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i2;
        float f2 = displayMetrics.density;
        float f3 = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i4, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdq)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfui zzfuiVarZzb = this.zzf.zzb();
        if (zzfuiVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfuiVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzazl zzazlVar = this.zzo;
        if (zzazlVar != null) {
            zzazlVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzj(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdq)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfui zzfuiVarZzb = this.zzf.zzb();
        if (zzfuiVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfuiVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdq)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfui zzfuiVarZzb = this.zzf.zzb();
        if (zzfuiVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfuiVarZzb.zza(context, null);
        this.zzh.zzd(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < b.f37307P) {
                        return;
                    }
                    zzfvo zzfvoVarZzc = this.zzf.zzc();
                    if ((zzfvoVarZzc == null || zzfvoVarZzc.zze(b.f37307P)) && zzfvc.zza(this.zzj)) {
                        this.zzi.execute(new zzayh(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: all -> 0x009f, zzibg -> 0x00a2, TryCatch #1 {zzibg -> 0x00a2, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:34:0x00a5, B:38:0x00be, B:44:0x00d7, B:45:0x00e4, B:47:0x00ea, B:49:0x00f2, B:50:0x00f4, B:41:0x00c8, B:42:0x00cf, B:23:0x0074, B:25:0x007a, B:27:0x008c, B:51:0x00fe, B:52:0x010b, B:53:0x0118), top: B:62:0x0021, outer: #2 }] */
    public final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfvo zzfvoVarZzu;
        zzbby zzbbyVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfvo zzfvoVarZzu2 = zzu(1);
        if (zzfvoVarZzu2 != null) {
            String strZza = zzfvoVarZzu2.zza().zza();
            strZzb = zzfvoVarZzu2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbbq zzbbqVar = this.zzj;
                zzfuf zzfufVar = this.zzh;
                zzfvt zzfvtVarZza = zzfuo.zza(context, 1, zzbbqVar, str, strZzb, "1", zzfufVar);
                byte[] bArr = zzfvtVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfufVar.zzb(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzbbs zzbbsVarZzd = zzbbs.zzd(zzhzl.zzs(bArr, 0, length), zziab.zza());
                        if (zzbbsVarZzd.zza().zza().isEmpty() || zzbbsVarZzd.zza().zzb().isEmpty() || zzbbsVarZzd.zzc().zzy().length == 0 || ((zzfvoVarZzu = zzu(1)) != null && (zzbbyVarZza = zzfvoVarZzu.zza()) != null && zzbbsVarZzd.zza().zza().equals(zzbbyVarZza.zza()) && zzbbsVarZzd.zza().zzb().equals(zzbbyVarZza.zzb()))) {
                            this.zzh.zzb(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfvv zzfvvVar = this.zzk;
                            int i2 = zzfvtVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcY)).booleanValue()) {
                                zZza = this.zzd.zza(zzbbsVarZzd, zzfvvVar);
                            } else if (i2 == 3) {
                                zZza = this.zze.zzb(zzbbsVarZzd);
                            } else if (i2 == 4) {
                                zZza = this.zze.zza(zzbbsVarZzd, zzfvvVar);
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfvo zzfvoVarZzu3 = zzu(1);
                                if (zzfvoVarZzu3 != null) {
                                    if (this.zzf.zza(zzfvoVarZzu3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzibg e2) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e2);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    public final /* synthetic */ zzfuf zzo() {
        return this.zzh;
    }

    public final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    public final /* synthetic */ void zzr(boolean z2) {
        this.zzq = z2;
    }
}
