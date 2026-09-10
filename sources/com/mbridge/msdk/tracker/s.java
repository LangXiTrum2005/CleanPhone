package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f37055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f37059e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f37063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HandlerThread f37064j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f37060f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f37061g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f37062h = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37065k = true;
    private long l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f37066m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f37067n = false;

    public s(k kVar) {
        this.f37055a = kVar.e();
        this.f37056b = kVar.j();
        this.f37057c = kVar.m();
        this.f37058d = kVar.k();
        this.f37059e = kVar;
    }

    private void m() {
        this.f37055a.c();
    }

    public void k() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        this.f37064j = handlerThread;
        handlerThread.start();
        b bVar = new b(this.f37064j.getLooper(), this);
        this.f37063i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f37063i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f37057c);
        this.f37065k = false;
    }

    public void l() {
        synchronized (this.f37062h) {
            try {
                if (!this.f37066m) {
                    this.f37066m = true;
                    m();
                }
                if (!this.f37067n) {
                    this.f37067n = true;
                    this.f37061g.addAndGet(this.f37055a.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List<i> c() {
        return this.f37055a.a(this.f37056b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f37060f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.d("TrackManager", this.f37059e.w() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f37061g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f36843a) {
            Log.d("TrackManager", this.f37059e.w() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f37061g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f37055a.b());
        }
        try {
            zA = this.f37059e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", this.f37059e.w() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", this.f37059e.w() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarN = this.f37059e.n();
        oVarN.a(new a(this.f37063i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f37059e.g().a(this.f37059e.v(), listC, this.f37059e.p());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", this.f37059e.w() + " report decorate request params failed ", e11);
            }
        }
        oVarN.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f37060f.set(0);
    }

    public void b() {
        this.f37063i.removeMessages(1);
        Handler handler = this.f37063i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f37061g.incrementAndGet();
    }

    public boolean f() {
        return this.f37061g.addAndGet(0) >= this.f37056b;
    }

    public boolean g() {
        return this.f37065k;
    }

    public void j() {
        this.f37065k = true;
        this.f37063i.removeMessages(1);
        this.f37063i.removeMessages(5);
        this.f37064j.quitSafely();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f37055a.c(list);
    }

    public void a(e eVar) {
        if (this.f37063i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f37060f.get(), this.l, this.f37057c);
        if (jA > this.f37057c) {
            Handler handler = this.f37063i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f37063i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f37070a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f37070a = sVar;
        }

        private void a(String str) {
            StringBuilder sb2 = new StringBuilder();
            wi.d.m(sb2, this.f37070a.f37059e.w(), " ", str);
            sb2.append(this.f37070a.f37061g.addAndGet(0));
            sb2.append(" 数据库记录数：");
            sb2.append(this.f37070a.f37055a.b());
            Log.d("TrackManager", sb2.toString());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    Log.e("TrackManager", this.f37070a.f37059e.w() + " removeMessages failed ", e10);
                }
            }
            if (this.f37070a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f37070a.f37060f.get(), this.f37070a.l, this.f37070a.f37057c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    Log.e("TrackManager", this.f37070a.f37059e.w() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 == 2 || i10 == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f37070a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f36843a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f37070a.l();
                b();
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f36843a && !y.b(eVar)) {
                a(defpackage.e.o("收到 Event( ", eVar.g(), " )，当前 Event 数量："));
            }
            if (y.a(eVar) || this.f37070a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.f37070a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    Log.e("TrackManager", this.f37070a.f37059e.w() + " report failed ", e10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f37068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f37069b;

        public a(Handler handler, s sVar) {
            this.f37068a = handler;
            this.f37069b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f37069b.b(tVar.a());
            this.f37069b.i();
            this.f37069b.l = 0L;
            if (this.f37069b.f()) {
                Handler handler = this.f37068a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.d("TrackManager", this.f37069b.f37059e.w() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f37069b.f37061g.addAndGet(0) + " 个，数据库记录数：" + this.f37069b.f37055a.b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f37069b.a(tVar.a(), str);
            this.f37069b.l = System.currentTimeMillis();
            int iD = this.f37069b.d();
            if (iD <= 10) {
                this.f37068a.removeMessages(3);
                Handler handler = this.f37068a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iD) * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.d("TrackManager", this.f37069b.f37059e.w() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f37069b.f37061g.addAndGet(0) + " 个，数据库记录数：" + this.f37069b.f37055a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    private void a(List<i> list) {
        this.f37055a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f36843a) {
            return;
        }
        int iA = this.f37055a.a();
        if (com.mbridge.msdk.tracker.a.f36843a) {
            Log.d("TrackManager", this.f37059e.w() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f37061g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f37055a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.l() && iVar.h() >= this.f37058d;
                boolean z11 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (!z10 && !z11) {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f37055a.a(list);
        this.f37061g.addAndGet(i10);
    }
}
