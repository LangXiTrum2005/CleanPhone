package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzx {
    private final zzgcd zza;
    private final zzgde zzb;
    private final zzglx zzc;
    private final zzgnc zzd;
    private final zzgbj zze;
    private final long zzf;
    private final zzija zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    public zzfzx(zzgcd zzgcdVar, zzgde zzgdeVar, zzglx zzglxVar, zzgnc zzgncVar, zzgbj zzgbjVar, zzija zzijaVar, zzgad zzgadVar) {
        this.zza = zzgcdVar;
        this.zzb = zzgdeVar;
        this.zzc = zzglxVar;
        this.zzd = zzgncVar;
        this.zze = zzgbjVar;
        this.zzf = zzgadVar.zzh();
        this.zzg = zzijaVar;
        this.zzh = zzgadVar.zzg();
        this.zzj = zzgadVar.zzq();
        this.zzk = zzgadVar.zzp();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzb(final Context context) {
        String string;
        boolean z2 = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z2 = true;
            }
        }
        zzgna zzgnaVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgnaVarZza.zza();
                    string = (String) zzgym.zzj(this.zza.zzb(), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfzw
                        @Override // com.google.android.gms.internal.ads.zzgxu
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzgzd.zza()).get(z2 ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzgnaVarZza.zzb(e2);
                    string = "";
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgnaVarZza.zzb(e);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                if (z2) {
                    string = ((zzggg) this.zzg.zzb()).zza(true, this.zzi);
                } else {
                    this.zzd.zzb(56);
                    string = Integer.toString(17);
                }
            } catch (Throwable th) {
                zzgnaVarZza.zzb(th);
                throw th;
            }
            zzgnaVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th2) {
            zzgnaVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgbj) = (r2 I:com.google.android.gms.internal.ads.zzfzx) (LINE:127) com.google.android.gms.internal.ads.zzfzx.zze com.google.android.gms.internal.ads.zzgbj, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzfzx] */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        final zzfzx zzfzxVar;
        ?? r2;
        String string;
        zzgna zzgnaVarZza = this.zzd.zza(4);
        try {
            try {
                zzgnaVarZza.zza();
                final String str2 = null;
                zzfzxVar = this;
                try {
                    string = (String) zzgym.zzj(this.zza.zzb(), new zzgxu(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzfzu
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ View zzc;
                        private final /* synthetic */ Activity zzd;

                        {
                            this.zzc = view;
                            this.zzd = activity;
                        }

                        @Override // com.google.android.gms.internal.ads.zzgxu
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                        }
                    }, zzgzd.zza()).get(zzfzxVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e = e2;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgnaVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgnaVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzfzxVar.zzd.zzb(57);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgnaVarZza.zzb(th3);
                    throw th3;
                }
            } catch (InterruptedException e4) {
                e = e4;
                zzfzxVar = this;
            } catch (ExecutionException e5) {
                e = e5;
                zzfzxVar = this;
            } catch (TimeoutException unused2) {
                zzfzxVar = this;
            } catch (Throwable th4) {
                th = th4;
            }
            zzgnaVarZza.zzc();
            zzfzxVar.zze.zzb();
            return string;
        } catch (Throwable th5) {
            zzgnaVarZza.zzc();
            r2.zze.zzb();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgbj) = (r2 I:com.google.android.gms.internal.ads.zzfzx) (LINE:127) com.google.android.gms.internal.ads.zzfzx.zze com.google.android.gms.internal.ads.zzgbj, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzfzx] */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        final zzfzx zzfzxVar;
        ?? r2;
        String string;
        zzgna zzgnaVarZza = this.zzd.zza(5);
        try {
            try {
                zzgnaVarZza.zza();
                final Activity activity2 = null;
                zzfzxVar = this;
                try {
                    string = (String) zzgym.zzj(this.zza.zzb(), new zzgxu(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzfzv
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ String zzc;
                        private final /* synthetic */ View zzd;

                        @Override // com.google.android.gms.internal.ads.zzgxu
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                        }
                    }, zzgzd.zza()).get(zzfzxVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e = e2;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgnaVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgnaVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzfzxVar.zzd.zzb(58);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgnaVarZza.zzb(th3);
                    throw th3;
                }
            } catch (InterruptedException e4) {
                e = e4;
                zzfzxVar = this;
            } catch (ExecutionException e5) {
                e = e5;
                zzfzxVar = this;
            } catch (TimeoutException unused2) {
                zzfzxVar = this;
            } catch (Throwable th4) {
                th = th4;
            }
            zzgnaVarZza.zzc();
            zzfzxVar.zze.zzb();
            return string;
        } catch (Throwable th5) {
            zzgnaVarZza.zzc();
            r2.zze.zzb();
            throw th5;
        }
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ ListenableFuture zzg(Context context, Void r2) {
        return this.zzb.zzb(context);
    }

    public final /* synthetic */ ListenableFuture zzh(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzc(context, null, view, activity);
    }

    public final /* synthetic */ ListenableFuture zzi(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
