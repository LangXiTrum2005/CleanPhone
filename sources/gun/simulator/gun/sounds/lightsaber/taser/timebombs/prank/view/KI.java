package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class KI extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3309a;
    public final LI b;
    public final long c;
    public JI d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ OI j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KI(OI oi, Looper looper, LI li, JI ji, int i, long j) {
        super(looper);
        this.j = oi;
        this.b = li;
        this.d = ji;
        this.f3309a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(0)) {
            this.h = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.cancelLoad();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.j.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            JI ji = this.d;
            ji.getClass();
            ji.d(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.e = null;
            OI oi = this.j;
            ExecutorService executorService = oi.f3498a;
            KI ki = oi.b;
            ki.getClass();
            executorService.execute(ki);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.j.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        JI ji = this.d;
        ji.getClass();
        if (this.h) {
            ji.d(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                ji.c(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                AbstractC4038mJ.d("Unexpected exception handling load completed", e);
                this.j.c = new NI(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        C2868Wu c2868WuE = ji.e(this.b, jElapsedRealtime, j, iOException, i3);
        int i4 = c2868WuE.f3945a;
        if (i4 == 3) {
            this.j.c = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long jMin = c2868WuE.b;
            if (jMin == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jMin = Math.min((this.f - 1) * 1000, 5000);
            }
            OI oi2 = this.j;
            FW.s(oi2.b == null);
            oi2.b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.e = null;
                oi2.f3498a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.h;
                this.g = Thread.currentThread();
            }
            if (z) {
                FW.c("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.load();
                    FW.A();
                } catch (Throwable th) {
                    FW.A();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Error e2) {
            if (!this.i) {
                AbstractC4038mJ.d("Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.i) {
                return;
            }
            AbstractC4038mJ.d("Unexpected exception loading stream", e3);
            obtainMessage(2, new NI(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.i) {
                return;
            }
            AbstractC4038mJ.d("OutOfMemory error loading stream", e4);
            obtainMessage(2, new NI(e4)).sendToTarget();
        }
    }
}
