package j6;

import android.os.Process;
import com.google.android.gms.internal.auth.o;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43715a = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f43715a) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = lo.d.f45629h;
                reentrantLock.lock();
                try {
                    lo.d dVarB = o.b();
                    if (dVarB == lo.d.l) {
                        lo.d.l = null;
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (dVarB != null) {
                            dVarB.j();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ a(String str) {
        super(str);
    }

    public /* synthetic */ a(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
