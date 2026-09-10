package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zziz extends zzf {

    @VisibleForTesting
    protected zzir zza;
    private volatile zzir zzb;
    private volatile zzir zzc;
    private final Map zzd;

    @GuardedBy("activityLock")
    private Activity zze;

    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzir zzg;
    private zzir zzh;

    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zziz(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzA(zzir zzirVar, zzir zzirVar2, long j, boolean z, Bundle bundle) {
        long j2;
        zzg();
        boolean z2 = false;
        boolean z3 = (zzirVar2 != null && zzirVar2.zzc == zzirVar.zzc && zzis.zza(zzirVar2.zzb, zzirVar.zzb) && zzis.zza(zzirVar2.zza, zzirVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlp.zzK(zzirVar, bundle2, true);
            if (zzirVar2 != null) {
                String str = zzirVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzirVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzirVar2.zzc);
            }
            if (z2) {
                zzkn zzknVar = this.zzt.zzu().zzb;
                long j3 = j - zzknVar.zzb;
                zzknVar.zzb = j;
                if (j3 > 0) {
                    this.zzt.zzv().zzI(bundle2, j3);
                }
            }
            if (!this.zzt.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzirVar.zze ? "auto" : MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            long jCurrentTimeMillis = this.zzt.zzax().currentTimeMillis();
            if (zzirVar.zze) {
                long j4 = zzirVar.zzf;
                if (j4 != 0) {
                    j2 = j4;
                }
                this.zzt.zzq().zzH(str3, "_vs", j2, bundle2);
            }
            j2 = jCurrentTimeMillis;
            this.zzt.zzq().zzH(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            zzB(this.zza, true, j);
        }
        this.zza = zzirVar;
        if (zzirVar.zze) {
            this.zzh = zzirVar;
        }
        this.zzt.zzt().zzG(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzB(zzir zzirVar, boolean z, long j) {
        this.zzt.zzd().zzf(this.zzt.zzax().elapsedRealtime());
        if (!this.zzt.zzu().zzb.zzd(zzirVar != null && zzirVar.zzd, z, j) || zzirVar == null) {
            return;
        }
        zzirVar.zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzp(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzizVar.zzA(zzirVar, zzirVar2, j, true, zzizVar.zzt.zzv().zzu(null, "screen_view", bundle, null, false));
    }

    @MainThread
    private final zzir zzy(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzir zzirVar = (zzir) this.zzd.get(activity);
        if (zzirVar == null) {
            zzir zzirVar2 = new zzir(null, zzl(activity.getClass(), "Activity"), this.zzt.zzv().zzq());
            this.zzd.put(activity, zzirVar2);
            zzirVar = zzirVar2;
        }
        return this.zzg != null ? this.zzg : zzirVar;
    }

    @MainThread
    private final void zzz(Activity activity, zzir zzirVar, boolean z) {
        zzir zzirVar2;
        zzir zzirVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzirVar.zzb == null) {
            zzirVar2 = new zzir(zzirVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzirVar.zzc, zzirVar.zze, zzirVar.zzf);
        } else {
            zzirVar2 = zzirVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzirVar2;
        this.zzt.zzaB().zzp(new zziu(this, zzirVar2, zzirVar3, this.zzt.zzax().elapsedRealtime(), z));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zzir zzi() {
        return this.zzb;
    }

    @WorkerThread
    public final zzir zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.zza;
        }
        zzir zzirVar = this.zza;
        return zzirVar != null ? zzirVar : this.zzh;
    }

    @VisibleForTesting
    public final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzt.zzf();
        return str2.substring(0, 100);
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzir(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzt.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long jElapsedRealtime = this.zzt.zzax().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziw(this, jElapsedRealtime));
        } else {
            zzir zzirVarZzy = zzy(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzt.zzaB().zzp(new zzix(this, zzirVarZzy, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaB().zzp(new zziy(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaB().zzp(new zziv(this));
        } else {
            zzz(activity, zzy(activity), false);
            zzd zzdVarZzd = this.zzt.zzd();
            zzdVarZzd.zzt.zzaB().zzp(new zzc(zzdVarZzd, zzdVarZzd.zzt.zzax().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzir zzirVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zzirVar = (zzir) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzirVar.zzc);
        bundle2.putString("name", zzirVar.zza);
        bundle2.putString("referrer_name", zzirVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzw(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r5, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzx(android.os.Bundle, long):void");
    }
}
