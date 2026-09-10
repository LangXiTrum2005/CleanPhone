package com.smartdigimkt.t5;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.CountDownView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f38723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f38724c;
    com.smartdigimkt.v6.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.smartdigimkt.w5.c.a f38725e;
    int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ViewGroup f38726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.smartdigimkt.w5.d.a f38727i;
    Handler j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Thread f38728l;
    protected long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected long f38729n;
    protected CountDownView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.smartdigimkt.k7.f.c f38730p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38722a = getClass().getSimpleName();
    protected boolean k = false;
    com.smartdigimkt.w5.c.a f = new C0618a();

    /* JADX INFO: renamed from: com.smartdigimkt.t5.a$a, reason: collision with other inner class name */
    public class C0618a implements com.smartdigimkt.w5.c.a {
        public C0618a() {
        }

        @Override // com.smartdigimkt.w5.c.a
        public void a(int i2, int i3) {
            CountDownView countDownView = a.this.o;
            if (countDownView != null) {
                countDownView.setClickViewAlpha(1.0d);
            }
            if (a.this.c() != null && (a.this.c() instanceof com.smartdigimkt.l5.b)) {
                ((com.smartdigimkt.l5.b) a.this.c()).setClickViewAlpha(1.0d);
            }
            com.smartdigimkt.w5.c.a aVar = a.this.f38725e;
            if (aVar != null) {
                aVar.a(i2, i3);
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = a.this;
            aVar.a(aVar.m);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                a aVar = a.this;
                if (!aVar.k) {
                    return;
                }
                if (aVar.f38726h != null && (aVar.e().getParent() instanceof View) && a.this.f38730p.a((View) a.this.e().getParent(), a.this.e(), 50, 0)) {
                    Handler handler = a.this.j;
                    if (handler != null) {
                        try {
                            handler.sendEmptyMessage(1);
                        } catch (Throwable unused) {
                        }
                        try {
                            Thread.sleep(200L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        try {
                            Thread.sleep(10L);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    a aVar2 = a.this;
                    long j = aVar2.m;
                    if (j >= aVar2.f38729n) {
                        aVar2.i();
                    } else {
                        aVar2.m = j + 200;
                    }
                } else {
                    try {
                        Thread.sleep(1000L);
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
            }
        }
    }

    public a(Context context, f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w5.c.a aVar2, int i2, ViewGroup viewGroup) {
        this.f38723b = context.getApplicationContext();
        this.f38724c = fVar;
        this.d = aVar;
        this.f38725e = aVar2;
        this.g = i2;
        this.f38726h = viewGroup;
        this.f38730p = new com.smartdigimkt.k7.f.c((fVar == null || fVar.i() == null) ? 1 : fVar.i().M1());
        this.j = new b(Looper.getMainLooper());
    }

    public void b() {
    }

    public View c() {
        com.smartdigimkt.w5.d.a aVar = this.f38727i;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public View d() {
        com.smartdigimkt.w5.d.a aVar = this.f38727i;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public View e() {
        return this.f38726h;
    }

    public void f() {
    }

    public void g() {
        i();
    }

    public void h() {
        if (c() != null) {
            com.smartdigimkt.j7.c.a(c());
        }
    }

    public void i() {
        this.k = false;
        this.f38728l = null;
    }

    public void a(ViewGroup viewGroup) {
        if (i.b(this.f38724c, this.d)) {
            return;
        }
        a(false);
    }

    public void b(long j) {
        View viewC = c();
        if (j > 0) {
            j = Math.min(j, 30L);
        } else if (j < 0) {
            j = Math.max(j, -30L);
        }
        long j2 = j * 1000;
        if (viewC != null) {
            CountDownView countDownView = new CountDownView(this.f38723b);
            this.o = countDownView;
            Context context = this.f38723b;
            countDownView.setCountDownEndDrawable(com.smartdigimkt.j7.c.a(context, h.a(context, "myoffer_base_close_icon", k.d)));
            this.o.setDuration(Math.abs(j2));
            if (Math.abs(j2) > 0) {
                c(Math.abs(j2));
            } else {
                a(0L);
            }
            if (j2 >= 0) {
                this.o.setVisibility(0);
            } else {
                this.o.setVisibility(8);
            }
            a();
        }
    }

    public void c(long j) {
        if (this.f38728l != null) {
            return;
        }
        this.m = 0L;
        this.f38729n = j;
        this.k = true;
        Thread thread = new Thread(new c());
        this.f38728l = thread;
        thread.setName("sdm_type_endcard_improve_progress");
        this.f38728l.start();
    }

    public void a(boolean z2) {
        String strValueOf;
        int iU0;
        int iA = i.a(this.d, this.f38726h.getContext());
        g gVar = this.d.t;
        int iV = gVar.V();
        if (iV != 3) {
            iU0 = 0;
            if (iV != 4) {
                strValueOf = iV != 5 ? "" : String.valueOf(gVar.Y0());
            } else {
                strValueOf = String.valueOf(gVar.G0());
            }
        } else {
            strValueOf = String.valueOf(gVar.P0());
            iU0 = gVar.U0();
        }
        com.smartdigimkt.i7.d.a(this.f38724c, this.d, iA, z2, gVar.V(), strValueOf, iU0, gVar.V());
    }

    public void a(com.smartdigimkt.w5.d.a aVar) {
        this.f38727i = aVar;
    }

    public void a(long j) {
        CountDownView countDownView = this.o;
        if (countDownView != null) {
            countDownView.refresh(j);
            if (this.m >= this.f38729n) {
                this.o.setVisibility(0);
            }
        }
    }

    public void a() {
        View viewC = c();
        if (viewC == null || this.o == null) {
            return;
        }
        ((ViewGroup) viewC.getParent()).addView(this.o, viewC.getLayoutParams());
        h();
    }
}
