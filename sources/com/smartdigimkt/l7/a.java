package com.smartdigimkt.l7;

import android.os.Handler;
import android.os.HandlerThread;
import com.smartdigimkt.n8.h;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    private static final String j = "TaskBusinessThreads";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f36371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f36372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f36373c;
    private volatile ExecutorService d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile ExecutorService f36374e;
    private final ExecutorService f;
    private final ConcurrentHashMap<String, Handler> g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile ScheduledExecutorService f36375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile ExecutorService f36376i;

    public class b implements RejectedExecutionHandler {
        private b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Objects.toString(threadPoolExecutor);
            a.this.f36371a.execute(runnable);
        }
    }

    public a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f36371a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, new SynchronousQueue(), new c());
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int i2 = iAvailableProcessors + 1;
        int i3 = iAvailableProcessors * 2;
        b(android.support.v4.media.a.g(i2, i3, "create limit thread pool: corePoolSize = ", " maxPoolSize = "));
        this.f36372b = new ThreadPoolExecutor(i2, i3, 60L, timeUnit, new LinkedBlockingQueue(100), new c(), new b());
        this.f36373c = new ThreadPoolExecutor(5, 5, 60L, timeUnit, new LinkedBlockingQueue(), new c(), new b());
        this.f = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), new c(), new b());
    }

    private void b(String str) {
    }

    private void e() {
    }

    public ExecutorService c() {
        return this.f36371a;
    }

    public ScheduledExecutorService d() {
        if (this.f36375h == null) {
            synchronized (a.class) {
                try {
                    if (this.f36375h == null) {
                        this.f36375h = new ScheduledThreadPoolExecutor(0, new c(), new b());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f36375h;
    }

    public Handler a(int i2) {
        return a(b(i2));
    }

    public String b(int i2) {
        String str;
        String strH = android.support.v4.media.a.h(i2, "def_t_");
        switch (i2) {
            case 1:
                str = "s_p";
                break;
            case 2:
                str = "n_p";
                break;
            case 3:
                str = "h_t_l";
                break;
            case 4:
                str = "i_p";
                break;
            case 5:
                str = "s_p_p_t";
                break;
            case 6:
                str = "n_p_n_r";
                break;
            case 7:
                str = "l_p_s_i";
                break;
            case 8:
                str = "h_a_e";
                break;
            case 9:
                str = "h_a_t";
                break;
            case 10:
                str = "n_p_h_r";
                break;
            case 11:
                str = "h_p_s";
                break;
            case 12:
                str = com.smartdigimkt.o1.b.X3;
                break;
            case 13:
                str = "l_p_o_s_t";
                break;
            case 14:
                str = "h_a_l";
                break;
            case 15:
                str = "h_s_p";
                break;
            case 16:
                str = "s_p_s_r_f_i";
                break;
            case 17:
                str = "s_p_i";
                break;
            case 18:
                str = "h_a_d_u";
                break;
            default:
                return android.support.v4.media.a.C("sdm_", strH);
        }
        strH = str;
        return android.support.v4.media.a.C("sdm_", strH);
    }

    public void a(d dVar, int i2) {
        String strB = b(i2);
        dVar.a(strB);
        if (i2 != 1) {
            if (i2 != 13) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.f36373c.execute(dVar);
                        return;
                    }
                    if (i2 != 5) {
                        if (i2 != 7) {
                            if (i2 != 8) {
                                if (i2 != 16) {
                                    if (i2 != 17) {
                                        this.f36371a.execute(dVar);
                                        return;
                                    } else {
                                        this.f.execute(dVar);
                                        return;
                                    }
                                }
                                if (this.f36374e == null) {
                                    synchronized (a.class) {
                                        try {
                                            if (this.f36374e == null) {
                                                b("startRun() >>> init mSaveRequestFailInfoThreadPool");
                                                this.f36374e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c());
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                this.f36374e.execute(dVar);
                                return;
                            }
                        }
                    }
                }
                a(dVar, strB);
                return;
            }
            this.f36372b.execute(dVar);
            e();
            return;
        }
        if (this.d == null) {
            synchronized (a.class) {
                try {
                    if (this.d == null) {
                        b("startRun() >>> init mSingleThreadPool");
                        this.d = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.d.execute(dVar);
    }

    private void a(d dVar, String str) {
        Handler handlerA = a(str);
        if (handlerA != null) {
            handlerA.post(dVar);
        }
    }

    private Handler a(String str) {
        return a(str, 5);
    }

    private synchronized Handler a(String str, int i2) {
        Handler handler;
        Handler handler2 = this.g.get(str);
        if (handler2 != null) {
            return handler2;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.setPriority(i2);
            handlerThread.start();
            b("create handler thread: curThreadId = " + Thread.currentThread().getId() + " curThreadName = " + Thread.currentThread().getName() + " handlerThread name: " + str);
            handler = new Handler(handlerThread.getLooper());
            try {
                this.g.put(str, handler);
            } catch (Throwable th) {
                th = th;
                handler2 = handler;
                th.getMessage();
                com.smartdigimkt.i7.d.a("create handler thread error", th.getMessage() + ", " + h.a(th.getStackTrace()), com.smartdigimkt.m6.b.p().q());
                handler = handler2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return handler;
    }

    public Executor b() {
        if (this.f36376i == null) {
            synchronized (a.class) {
                try {
                    if (this.f36376i == null) {
                        this.f36376i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f36376i;
    }

    public Executor a() {
        return this.f36372b;
    }
}
