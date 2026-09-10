package j2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.a0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f43662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f43664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f43665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f43667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f43669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f43670j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Looper looper, j jVar, h hVar, int i10, long j10) {
        super(looper);
        this.f43670j = mVar;
        this.f43662b = jVar;
        this.f43664d = hVar;
        this.f43661a = i10;
        this.f43663c = j10;
    }

    public final void a(boolean z10) {
        this.f43669i = z10;
        this.f43665e = null;
        if (hasMessages(1)) {
            this.f43668h = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f43668h = true;
                    this.f43662b.cancelLoad();
                    Thread thread = this.f43667g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f43670j.f43675b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = this.f43664d;
            hVar.getClass();
            hVar.b(this.f43662b, jElapsedRealtime, jElapsedRealtime - this.f43663c, true);
            this.f43664d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f43663c;
        h hVar = this.f43664d;
        hVar.getClass();
        hVar.n(this.f43662b, jElapsedRealtime, j10, this.f43666f);
        this.f43665e = null;
        m mVar = this.f43670j;
        k2.a aVar = mVar.f43674a;
        i iVar = mVar.f43675b;
        iVar.getClass();
        aVar.execute(iVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f43669i) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            b();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f43670j.f43675b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f43663c;
        h hVar = this.f43664d;
        hVar.getClass();
        if (this.f43668h) {
            hVar.b(this.f43662b, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                hVar.j(this.f43662b, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                l1.a.f("LoadTask", "Unexpected exception handling load completed", e10);
                this.f43670j.f43676c = new l(e10);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f43665e = iOException;
        int i12 = this.f43666f + 1;
        this.f43666f = i12;
        a0 a0VarD = hVar.d(this.f43662b, jElapsedRealtime, j10, iOException, i12);
        int i13 = a0VarD.f11791a;
        if (i13 == 3) {
            this.f43670j.f43676c = this.f43665e;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f43666f = 1;
            }
            long jMin = a0VarD.f11792b;
            if (jMin == C.TIME_UNSET) {
                jMin = Math.min((this.f43666f - 1) * 1000, 5000);
            }
            m mVar = this.f43670j;
            go.k.t(mVar.f43675b == null);
            mVar.f43675b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f43668h;
                this.f43667g = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f43662b.getClass().getSimpleName()));
                try {
                    this.f43662b.load();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f43667g = null;
                Thread.interrupted();
            }
            if (this.f43669i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f43669i) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.f43669i) {
                return;
            }
            l1.a.f("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new l(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.f43669i) {
                return;
            }
            l1.a.f("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new l(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.f43669i) {
                l1.a.f("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
