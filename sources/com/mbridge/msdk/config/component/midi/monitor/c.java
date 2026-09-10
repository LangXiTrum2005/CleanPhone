package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.Xa;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32297c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f32301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HandlerThread f32302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f32303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f32304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f32305k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32306m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32298d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32299e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32300f = false;
    private int l = 0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f32305k != null) {
                c.this.f32305k.a("Video first frame render timeout : " + c.this.f32296b + "ms");
            }
            c.this.h();
        }
    }

    public c(int i10, String str) {
        this.f32295a = 3;
        this.f32306m = str;
        this.f32296b = i10 > 0 ? i10 : Xa.C;
        this.f32295a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f32302h = handlerThread;
            handlerThread.start();
            this.f32301g = new Handler(this.f32302h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f32301g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    private void d() {
        this.f32303i = new a();
        this.f32304j = new b();
    }

    public boolean e() {
        return this.f32298d;
    }

    public void f() {
        Runnable runnable;
        if (!this.f32298d || this.f32300f) {
            return;
        }
        this.f32300f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f32297c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f32301g;
        if (handler != null && (runnable = this.f32304j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f32296b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        h();
    }

    public void g() {
        Runnable runnable;
        if (this.f32301g == null) {
            h();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f32305k;
            if (aVar != null) {
                aVar.a("playerHandler is null");
            }
        }
        if (this.f32298d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f32298d = true;
        this.f32299e = false;
        this.f32300f = false;
        this.l = 0;
        this.f32297c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f32296b + "ms");
        Handler handler = this.f32301g;
        if (handler != null && (runnable = this.f32304j) != null) {
            handler.postDelayed(runnable, this.f32296b);
        }
        a();
    }

    public void h() {
        if (this.f32298d) {
            this.f32298d = false;
            Handler handler = this.f32301g;
            if (handler != null) {
                Runnable runnable = this.f32303i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f32304j;
                if (runnable2 != null) {
                    this.f32301g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f32298d || this.f32299e || TextUtils.isEmpty(this.f32306m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.l);
                if (this.l >= this.f32295a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f32301g;
                if (handler == null || (runnable2 = this.f32303i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f32299e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f32305k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f32301g;
            if (handler2 == null || (runnable3 = this.f32303i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("检查本地地址异常："), "MonitorPlayerTimeout");
            Handler handler3 = this.f32301g;
            if (handler3 == null || (runnable = this.f32303i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f32306m.startsWith("file://") || this.f32306m.startsWith("/")) {
                File file = new File(this.f32306m.replace("file://", ""));
                if (file.exists() && file.isFile()) {
                    return this.f32306m;
                }
            }
            if (this.f32306m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarA = com.mbridge.msdk.config.component.common.file.a.a(this.f32306m, -1, null);
                String strA = bVarA != null ? bVarA.a() : "";
                File file2 = new File(strA.replace("file://", ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("获取本地视频地址异常："), "MonitorPlayerTimeout");
            return null;
        }
    }

    public void b() {
        try {
            h();
            Handler handler = this.f32301g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f32301g = null;
            }
            HandlerThread handlerThread = this.f32302h;
            try {
                if (handlerThread != null) {
                    try {
                        try {
                            handlerThread.quitSafely();
                            this.f32302h.join(1000L);
                        } catch (InterruptedException e10) {
                            q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                            Thread.currentThread().interrupt();
                        }
                    } catch (Exception e11) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f32302h = null;
                }
                this.f32303i = null;
                this.f32304j = null;
                this.f32305k = null;
                this.f32298d = false;
                this.f32299e = false;
                this.f32300f = false;
                this.l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f32302h = null;
                throw th2;
            }
        } catch (Exception e12) {
            f2.q(e12, new StringBuilder("销毁MonitorPlayerTimeout时发生异常："), "MonitorPlayerTimeout");
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f32305k = aVar;
    }
}
