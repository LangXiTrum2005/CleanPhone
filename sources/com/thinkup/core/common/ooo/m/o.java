package com.thinkup.core.common.ooo.m;

import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.media.a;
import com.smartdigimkt.o1.b;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.o00;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static final String o = "TaskBusinessThreads";
    private final ExecutorService m;
    private final ConcurrentHashMap<String, Handler> m0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ExecutorService f42328n;
    private final ExecutorService o0;
    private volatile ExecutorService om;
    private final ExecutorService on;
    private volatile ExecutorService oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.ooo.m.o$o, reason: collision with other inner class name */
    public class RejectedExecutionHandlerC0689o implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC0689o() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Objects.toString(threadPoolExecutor);
            o.this.m.execute(runnable);
        }

        public /* synthetic */ RejectedExecutionHandlerC0689o(o oVar, byte b2) {
            this();
        }
    }

    public o() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.m = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, new SynchronousQueue(), new n());
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        byte b2 = 0;
        this.f42328n = new ThreadPoolExecutor(iAvailableProcessors + 1, iAvailableProcessors * 2, 60L, timeUnit, new LinkedBlockingQueue(100), new n(), new RejectedExecutionHandlerC0689o(this, b2));
        this.o0 = new ThreadPoolExecutor(0, 5, 60L, timeUnit, new LinkedBlockingQueue(), new n(), new RejectedExecutionHandlerC0689o(this, b2));
        this.on = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), new n(), new RejectedExecutionHandlerC0689o(this, b2));
    }

    private synchronized Handler m(String str) {
        Handler handler;
        Handler handler2 = this.m0.get(str);
        if (handler2 != null) {
            return handler2;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.setPriority(5);
            handlerThread.start();
            Thread.currentThread().getId();
            Thread.currentThread().getName();
            handler = new Handler(handlerThread.getLooper());
            try {
                this.m0.put(str, handler);
            } catch (Throwable th) {
                th = th;
                handler2 = handler;
                th.getMessage();
                com.thinkup.core.common.oo0.oo.m("create handler thread error", th.getMessage() + ", " + o00.o(th.getStackTrace()), o0n.m().o0m());
                handler = handler2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return handler;
    }

    private static void n() {
    }

    private static void o0() {
    }

    public final Handler o(int i2) {
        return m(m(i2));
    }

    public final void o(o0 o0Var, int i2) {
        String strM = m(i2);
        o0Var.o(strM);
        if (i2 != 1) {
            if (i2 != 13) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.o0.execute(o0Var);
                        return;
                    }
                    if (i2 != 5) {
                        if (i2 != 7) {
                            if (i2 != 8) {
                                if (i2 != 16) {
                                    if (i2 != 17) {
                                        this.m.execute(o0Var);
                                        return;
                                    } else {
                                        this.on.execute(o0Var);
                                        return;
                                    }
                                }
                                if (this.om == null) {
                                    synchronized (o.class) {
                                        try {
                                            if (this.om == null) {
                                                this.om = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n());
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                this.om.execute(o0Var);
                                return;
                            }
                        }
                    }
                }
                Handler handlerM = m(strM);
                if (handlerM != null) {
                    handlerM.post(o0Var);
                    return;
                }
                return;
            }
            this.f42328n.execute(o0Var);
            return;
        }
        if (this.oo == null) {
            synchronized (o.class) {
                try {
                    if (this.oo == null) {
                        this.oo = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.oo.execute(o0Var);
    }

    public static String m(int i2) {
        String strConcat = "def_t_".concat(String.valueOf(i2));
        switch (i2) {
            case 1:
                strConcat = "s_p";
                break;
            case 2:
                strConcat = "n_p";
                break;
            case 3:
                strConcat = "h_t_l";
                break;
            case 4:
                strConcat = "i_p";
                break;
            case 5:
                strConcat = "s_p_p_t";
                break;
            case 6:
                strConcat = "n_p_n_r";
                break;
            case 7:
                strConcat = "l_p_s_i";
                break;
            case 8:
                strConcat = "h_a_e";
                break;
            case 9:
                strConcat = "h_a_t";
                break;
            case 10:
                strConcat = "n_p_h_r";
                break;
            case 11:
                strConcat = "h_p_s";
                break;
            case 12:
                strConcat = b.X3;
                break;
            case 13:
                strConcat = "l_p_o_s_t";
                break;
            case 14:
                strConcat = "h_a_l";
                break;
            case 15:
                strConcat = "h_s_p";
                break;
            case 16:
                strConcat = "s_p_s_r_f_i";
                break;
            case 17:
                strConcat = "s_p_i";
                break;
            case 18:
                strConcat = "h_a_d_u";
                break;
        }
        return a.C("thinkup_", strConcat);
    }

    private Handler o(String str) {
        return m(str);
    }

    public final Executor o() {
        return this.f42328n;
    }

    private void o(o0 o0Var, String str) {
        Handler handlerM = m(str);
        if (handlerM != null) {
            handlerM.post(o0Var);
        }
    }

    public final ExecutorService m() {
        return this.m;
    }
}
