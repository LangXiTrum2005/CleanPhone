package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2328Bz extends BF {
    public static volatile C2328Bz o;
    public final /* synthetic */ int k;
    public final Object l;
    public volatile Handler m;
    public final ThreadPoolExecutor n;

    public C2328Bz(int i) {
        this.k = i;
        if (i != 1) {
            this.l = new Object();
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            this.n = new ThreadPoolExecutor(iAvailableProcessors + 1, (iAvailableProcessors * 2) + 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2302Az());
        } else {
            this.l = new Object();
            int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
            this.n = new ThreadPoolExecutor(iAvailableProcessors2 + 1, (iAvailableProcessors2 * 2) + 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2731Rn());
        }
    }

    public static C2328Bz u() {
        if (o != null) {
            return o;
        }
        synchronized (C2328Bz.class) {
            try {
                if (o == null) {
                    o = new C2328Bz(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o;
    }

    private void w(long j, Runnable runnable) {
        if (this.m == null) {
            synchronized (this.l) {
                try {
                    if (this.m == null) {
                        this.m = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.m.postDelayed(runnable, j);
    }

    private void x(Runnable runnable) {
        if (this.m == null) {
            synchronized (this.l) {
                try {
                    if (this.m == null) {
                        this.m = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.m.post(runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final boolean n() {
        switch (this.k) {
            case 0:
                return Looper.getMainLooper().getThread() == Thread.currentThread();
            default:
                return Looper.getMainLooper().getThread() == Thread.currentThread();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final void q(Runnable runnable) {
        switch (this.k) {
            case 0:
                x(runnable);
                return;
            default:
                if (this.m == null) {
                    synchronized (this.l) {
                        try {
                            if (this.m == null) {
                                this.m = new Handler(Looper.getMainLooper());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                this.m.post(runnable);
                return;
        }
    }

    public final void t(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.n;
        switch (this.k) {
            case 0:
                threadPoolExecutor.execute(runnable);
                break;
            default:
                threadPoolExecutor.execute(runnable);
                break;
        }
    }

    public final void v(long j, Runnable runnable) {
        switch (this.k) {
            case 0:
                w(j, runnable);
                return;
            default:
                if (this.m == null) {
                    synchronized (this.l) {
                        try {
                            if (this.m == null) {
                                this.m = new Handler(Looper.getMainLooper());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                this.m.postDelayed(runnable, j);
                return;
        }
    }

    public final void y(Runnable runnable) {
        switch (this.k) {
            case 0:
                if (this.m != null) {
                    this.m.removeCallbacks(runnable);
                }
                break;
            default:
                if (this.m != null) {
                    this.m.removeCallbacks(runnable);
                }
                break;
        }
    }
}
