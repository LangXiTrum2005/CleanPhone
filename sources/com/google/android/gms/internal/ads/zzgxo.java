package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgxo extends zzgxs {
    private static final zzgyu zza = new zzgyu(zzgxo.class);
    private zzgsz zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgxo(zzgsz zzgszVar, boolean z2, boolean z3) {
        super(zzgszVar.size());
        this.zzb = zzgszVar;
        this.zzc = z2;
        this.zzd = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i2, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i2, listenableFuture);
            }
        } finally {
            zzz(null);
        }
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i2, Future future) {
        try {
            zzw(i2, zzgzn.zza(future));
        } catch (ExecutionException e2) {
            zzE(e2.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgsz zzgszVar) {
        int iZzC = zzC();
        int i2 = 0;
        zzgqa.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgszVar != null) {
                zzgvr it = zzgszVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i2, future);
                    }
                    i2++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public void zzA(int i2) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final void zzc() {
        zzgsz zzgszVar = this.zzb;
        zzA(1);
        if ((zzgszVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgvr it = zzgszVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzd() {
        zzgsz zzgszVar = this.zzb;
        return zzgszVar != null ? "futures=".concat(zzgszVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgvr it = this.zzb.iterator();
            final int i2 = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i3 = i2 + 1;
                if (listenableFuture.isDone()) {
                    zzy(i2, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgxn
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i2, listenableFuture);
                        }
                    }, zzgyb.INSTANCE);
                }
                i2 = i3;
            }
            return;
        }
        zzgsz zzgszVar = this.zzb;
        final zzgsz zzgszVar2 = true != this.zzd ? null : zzgszVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgxm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgszVar2);
            }
        };
        zzgvr it2 = zzgszVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgszVar2);
            } else {
                listenableFuture2.addListener(runnable, zzgyb.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i2, Object obj);

    public abstract void zzx();
}
