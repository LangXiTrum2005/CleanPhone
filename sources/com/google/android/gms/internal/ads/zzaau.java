package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaau extends Handler implements Runnable {
    final /* synthetic */ zzaaz zza;
    private final zzaav zzb;
    private final long zzc;
    private zzaar zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaau(zzaaz zzaazVar, Looper looper, zzaav zzaavVar, zzaar zzaarVar, int i2, long j) {
        super(looper);
        Objects.requireNonNull(zzaazVar);
        this.zza = zzaazVar;
        this.zzb = zzaavVar;
        this.zzd = zzaarVar;
        this.zzc = j;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzaar zzaarVar = this.zzd;
        zzaarVar.getClass();
        zzaarVar.zzC(this.zzb, jElapsedRealtime, j, this.zzf);
        this.zze = null;
        zzaaz zzaazVar = this.zza;
        zzaau zzaauVarZzj = zzaazVar.zzj();
        zzaauVarZzj.getClass();
        zzaazVar.zzi().execute(zzaauVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            zzd();
            return;
        }
        if (i2 == 4) {
            throw ((Error) message.obj);
        }
        zzaaz zzaazVar = this.zza;
        zzaazVar.zzk(null);
        long j = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        zzaar zzaarVar = this.zzd;
        zzaarVar.getClass();
        if (this.zzh) {
            zzaarVar.zzA(this.zzb, jElapsedRealtime, j2, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 2) {
            try {
                zzaarVar.zzB(this.zzb, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e2) {
                zzee.zzf("LoadTask", "Unexpected exception handling load completed", e2);
                this.zza.zzl(new zzaay(e2));
                return;
            }
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i4 = this.zzf + 1;
        this.zzf = i4;
        zzaat zzaatVarZzz = zzaarVar.zzz(this.zzb, jElapsedRealtime, j2, iOException, i4);
        if (zzaatVarZzz.zzb() == 3) {
            zzaazVar.zzl(this.zze);
        } else if (zzaatVarZzz.zzb() != 2) {
            if (zzaatVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzaatVarZzz.zzc() != -9223372036854775807L ? zzaatVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z2) {
                zzaav zzaavVar = this.zzb;
                String simpleName = zzaavVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    zzaavVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(3, new zzaay(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new zzaay(e4)).sendToTarget();
        } catch (Error e5) {
            if (!this.zzi) {
                zzee.zzf("LoadTask", "Unexpected error loading stream", e5);
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        }
    }

    public final void zza(int i2) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i2) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzaaz zzaazVar = this.zza;
        zzgqa.zzi(zzaazVar.zzj() == null);
        zzaazVar.zzk(this);
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z2) {
        this.zzi = z2;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzaar zzaarVar = this.zzd;
            zzaarVar.getClass();
            zzaarVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
