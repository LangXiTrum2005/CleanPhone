package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32356b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f32357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f32358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f32359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f32360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f32361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.b f32362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.b f32363i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f32360f != null && !b.this.f32361g.h()) {
                b.this.a();
                b.this.f32360f.d(b.this.f32361g);
            }
            b.this.e();
        }
    }

    public b(long j10) {
        if (this.f32355a < 0) {
            this.f32355a = 30L;
        } else {
            this.f32355a = j10;
        }
    }

    public void d() {
        Runnable runnable;
        if (this.f32356b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f32356b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f32358d = handlerThread;
            handlerThread.start();
            this.f32357c = new Handler(this.f32358d.getLooper());
            c();
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f32357c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.f32357c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f32360f;
            if (aVar != null) {
                aVar.d(this.f32361g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f32355a + "ms");
        Handler handler = this.f32357c;
        if (handler == null || (runnable = this.f32359e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f32355a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.f32356b) {
            this.f32356b = false;
            Handler handler = this.f32357c;
            if (handler != null && (runnable = this.f32359e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    private void c() {
        this.f32359e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.f32362h = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.f32357c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f32357c = null;
            }
            HandlerThread handlerThread = this.f32358d;
            try {
                if (handlerThread != null) {
                    try {
                        try {
                            handlerThread.quitSafely();
                            this.f32358d.join(1000L);
                        } catch (InterruptedException e10) {
                            q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                            Thread.currentThread().interrupt();
                        }
                    } catch (Exception e11) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f32358d = null;
                }
                this.f32359e = null;
                this.f32356b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f32358d = null;
                throw th2;
            }
        } catch (Exception e12) {
            f2.q(e12, new StringBuilder("销毁MonitorNetworkTimeout时发生异常："), "MonitorNetworkTimeout");
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.f32363i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f32362h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.f32362h.a();
            }
            if (this.f32363i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.f32363i.a();
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("取消任务时发生异常："), "MonitorNetworkTimeout");
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.f32361g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f32360f = aVar;
    }
}
