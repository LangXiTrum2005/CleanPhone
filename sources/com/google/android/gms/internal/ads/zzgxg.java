package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgxg<V> extends zzgzo implements ListenableFuture<V> {
    private static final zza zzbi;
    static final Object zze = new Object();
    static final zzgyu zzf = new zzgyu(zzgxf.class);
    static final boolean zzg;
    volatile zzgxf.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzgxg zzgxgVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzd(zzgxg zzgxgVar, zzgxf.zzd zzdVar, zzgxf.zzd zzdVar2);

        public abstract zze zze(zzgxg zzgxgVar, zze zzeVar);

        public abstract zzgxf.zzd zzf(zzgxg zzgxgVar, zzgxf.zzd zzdVar);

        public abstract boolean zzg(zzgxg zzgxgVar, Object obj, Object obj2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgxg<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgxg.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgxg<?>, zzgxf.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgxg.class, zzgxf.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgxg<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgxg.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzc(zzgxg zzgxgVar, zze zzeVar, zze zzeVar2) {
            AtomicReferenceFieldUpdater<? super zzgxg<?>, zze> atomicReferenceFieldUpdater = zzc;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgxgVar, zzeVar, zzeVar2)) {
                if (atomicReferenceFieldUpdater.get(zzgxgVar) != zzeVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzd(zzgxg zzgxgVar, zzgxf.zzd zzdVar, zzgxf.zzd zzdVar2) {
            AtomicReferenceFieldUpdater<? super zzgxg<?>, zzgxf.zzd> atomicReferenceFieldUpdater = zzd;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgxgVar, zzdVar, zzdVar2)) {
                if (atomicReferenceFieldUpdater.get(zzgxgVar) != zzdVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final zze zze(zzgxg zzgxgVar, zze zzeVar) {
            return zzc.getAndSet(zzgxgVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final zzgxf.zzd zzf(zzgxg zzgxgVar, zzgxf.zzd zzdVar) {
            return zzd.getAndSet(zzgxgVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzg(zzgxg zzgxgVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super zzgxg<?>, Object> atomicReferenceFieldUpdater = zze;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgxgVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(zzgxgVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzc(zzgxg zzgxgVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgxgVar) {
                try {
                    if (zzgxgVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzgxgVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzd(zzgxg zzgxgVar, zzgxf.zzd zzdVar, zzgxf.zzd zzdVar2) {
            synchronized (zzgxgVar) {
                try {
                    if (zzgxgVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzgxgVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final zze zze(zzgxg zzgxgVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgxgVar) {
                try {
                    zzeVar2 = zzgxgVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzgxgVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final zzgxf.zzd zzf(zzgxg zzgxgVar, zzgxf.zzd zzdVar) {
            zzgxf.zzd zzdVar2;
            synchronized (zzgxgVar) {
                try {
                    zzdVar2 = zzgxgVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzgxgVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzg(zzgxg zzgxgVar, Object obj, Object obj2) {
            synchronized (zzgxgVar) {
                try {
                    if (zzgxgVar.valueField != obj) {
                        return false;
                    }
                    zzgxgVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(zzgxh.zza);
            }
            try {
                zzc = unsafe.objectFieldOffset(zzgxg.class.getDeclaredField("waitersField"));
                zzb = unsafe.objectFieldOffset(zzgxg.class.getDeclaredField("listenersField"));
                zzd = unsafe.objectFieldOffset(zzgxg.class.getDeclaredField("valueField"));
                zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzc(zzgxg zzgxgVar, zze zzeVar, zze zzeVar2) {
            return a.a(zza, zzgxgVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzd(zzgxg zzgxgVar, zzgxf.zzd zzdVar, zzgxf.zzd zzdVar2) {
            return a.a(zza, zzgxgVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final zze zze(zzgxg zzgxgVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgxgVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzgxgVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final zzgxf.zzd zzf(zzgxg zzgxgVar, zzgxf.zzd zzdVar) {
            zzgxf.zzd zzdVar2;
            do {
                zzdVar2 = zzgxgVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzgxgVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxg.zza
        public final boolean zzg(zzgxg zzgxgVar, Object obj, Object obj2) {
            return a.a(zza, zzgxgVar, zzd, obj, obj2);
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z2) {
        }

        public zze() {
            zzgxg.zzv(this, Thread.currentThread());
        }
    }

    static {
        boolean z2;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        zzg = z2;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains(d9.d)) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e2) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e2;
                } catch (Error | Exception e3) {
                    th = e3;
                    th2 = e2;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zzbi = zzcVar;
        if (th != null) {
            zzgyu zzgyuVar = zzf;
            Logger loggerZza = zzgyuVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgyuVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                        }
                    } else if (!zzbi.zzc(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static boolean zzr(zzgxg zzgxgVar, Object obj, Object obj2) {
        return zzbi.zzg(zzgxgVar, obj, obj2);
    }

    public static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbi.zza(zzeVar, thread);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    public final boolean zzp(zzgxf.zzd zzdVar, zzgxf.zzd zzdVar2) {
        return zzbi.zzd(this, zzdVar, zzdVar2);
    }

    public final zzgxf.zzd zzq(zzgxf.zzd zzdVar) {
        return zzbi.zzf(this, zzdVar);
    }

    public final void zzs() {
        for (zze zzeVarZze = zzbi.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzt(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzgxf.zzh(obj)) {
            return zzgxf.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                while (true) {
                    zza zzaVar = zzbi;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzgxf.zzh(obj2)) {
                                return zzgxf.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                        break;
                    }
                    zzeVar = this.waitersField;
                    if (zzeVar == zze.zza) {
                    }
                }
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgxf.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzgxf.zzh(obj4)) {
                return zzgxf.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        androidx.datastore.preferences.protobuf.a.A(sb, "Waited ", j, " ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                androidx.datastore.preferences.protobuf.a.A(sb2, strConcat, jConvert, " ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z2) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.a.s(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
    }

    public final Object zzu() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzgxf.zzh(obj2)) {
            return zzgxf.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbi;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzgxf.zzh(obj)));
                    return zzgxf.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzgxf.zzg(obj3);
    }
}
