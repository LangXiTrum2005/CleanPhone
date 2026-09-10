package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgxf<V> extends zzgxg<V> {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgxg.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        public zza(boolean z2, Throwable th) {
            this.zzc = z2;
            this.zzd = th;
        }
    }

    final class zzb<V> implements Runnable {
        final zzgxf<V> zza;
        final ListenableFuture<? extends V> zzb;

        public zzb(zzgxf zzgxfVar, ListenableFuture listenableFuture) {
            this.zza = zzgxfVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzgxg.zzr(this.zza, this, zzgxf.zze(this.zzb))) {
                zzgxf.zzw(this.zza, false);
            }
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgxf.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    interface zze<V> extends ListenableFuture<V> {
        @Override // com.google.common.util.concurrent.ListenableFuture
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    abstract class zzf<V> extends zzgxf<V> implements zze<V> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(ListenableFuture listenableFuture) {
        Throwable thZzl;
        if (listenableFuture instanceof zze) {
            Object zzaVar = ((zzgxf) listenableFuture).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th = zzaVar2.zzd;
                    zzaVar = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((listenableFuture instanceof zzgzo) && (thZzl = ((zzgzo) listenableFuture).zzl()) != null) {
            return new zzc(thZzl);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!zzgxg.zzg) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzf = zzf(listenableFuture);
            if (!zIsCancelled) {
                return objZzf == null ? zzgxg.zze : objZzf;
            }
            String strValueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e2) {
            return new zzc(e2);
        } catch (CancellationException e3) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e3)) : new zza(false, e3);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e4)) : new zzc(e4.getCause());
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object zzg(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzgxg.zze) {
            return null;
        }
        return obj;
    }

    public static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzgxf zzgxfVar, boolean z2) {
        zzd zzdVar = null;
        while (true) {
            zzgxfVar.zzs();
            if (z2) {
                zzgxfVar.zzi();
            }
            zzgxfVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZzq = zzgxfVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZzq != null) {
                zzd zzdVar4 = zzdVarZzq.next;
                zzdVarZzq.next = zzdVar3;
                zzdVar3 = zzdVarZzq;
                zzdVarZzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgxfVar = zzbVar.zza;
                    if (zzgxfVar.valueField == zzbVar && zzgxg.zzr(zzgxfVar, zzbVar, zze(zzbVar.zzb))) {
                        z2 = false;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private final void zzx(StringBuilder sb) {
        try {
            Object objZzf = zzf(this);
            sb.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else if (objZzf == this) {
                sb.append("this future");
            } else {
                sb.append(objZzf.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objZzf)));
            }
            sb.append(d9.i.f24752e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(d9.i.f24752e);
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            Logger loggerZza = zzgxg.zzf.zza();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", androidx.media3.extractor.text.ttml.a.q(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxg, com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzgqa.zzk(runnable, "Runnable was null.");
        zzgqa.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzgxg.zzg) {
            zzaVar = new zza(z2, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z2 ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzgxf<V> zzgxfVar = this;
        boolean z3 = false;
        while (true) {
            if (zzgxg.zzr(zzgxfVar, obj, zzaVar)) {
                zzw(zzgxfVar, z2);
                if (obj instanceof zzb) {
                    ListenableFuture<? extends V> listenableFuture = ((zzb) obj).zzb;
                    if (listenableFuture instanceof zze) {
                        zzgxfVar = (zzgxf) listenableFuture;
                        obj = zzgxfVar.valueField;
                        if (!(obj == null) && !(obj instanceof zzb)) {
                            return true;
                        }
                        z3 = true;
                    } else {
                        listenableFuture.cancel(z2);
                    }
                }
                return true;
            }
            obj = zzgxfVar.valueField;
            if (zzh(obj)) {
                return z3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((zzb) obj).zzb;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    zzgze.zzb(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(d9.i.f24752e);
            } else {
                try {
                    strConcat = zzgqr.zzb(zzd());
                } catch (Throwable th2) {
                    zzgze.zzb(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    android.support.v4.media.a.A(sb, ", info=[", strConcat, d9.i.f24752e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzx(sb);
            }
        }
        sb.append(d9.i.f24752e);
        return sb.toString();
    }

    public boolean zza(Object obj) {
        if (obj == null) {
            obj = zzgxg.zze;
        }
        if (!zzgxg.zzr(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public boolean zzb(Throwable th) {
        th.getClass();
        if (!zzgxg.zzr(this, null, new zzc(th))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public void zzc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public void zzi() {
    }

    public final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    public final boolean zzk(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzgxg.zzr(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, listenableFuture);
            if (zzgxg.zzr(this, null, zzbVar)) {
                try {
                    listenableFuture.addListener(zzbVar, zzgyb.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzgxg.zzr(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            listenableFuture.cancel(((zza) obj).zzc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzt(j, timeUnit);
    }
}
