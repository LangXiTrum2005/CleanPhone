package com.p004ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.a;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3343a extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f24227l = 1;
    private static final InterfaceC3345b m = new C0259a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final gj f24228n = new b();
    private final int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3345b f24229a = m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gj f24230b = f24228n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f24231c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f24232e = "";
    private boolean f = false;
    private boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f24233h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24234i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    public class C0259a implements InterfaceC3345b {
        @Override // com.p004ironsource.InterfaceC3345b
        public void a() {
        }

        @Override // com.p004ironsource.InterfaceC3345b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$b */
    public class b implements gj {
        @Override // com.p004ironsource.gj
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3343a c3343a = C3343a.this;
            c3343a.f24233h = (c3343a.f24233h + 1) % Integer.MAX_VALUE;
        }
    }

    public C3343a(int i2) {
        this.d = i2;
    }

    public int a() {
        return this.j;
    }

    public int b() {
        return this.f24234i;
    }

    public C3343a c() {
        this.f24232e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i2 = -1;
        while (!isInterrupted() && this.j < this.f24234i) {
            int i3 = this.f24233h;
            this.f24231c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.f24233h != i3) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.f24229a.a();
                    String str = q9.f26549l;
                    if (str != null && !str.trim().isEmpty()) {
                        new mc(q9.f26549l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.f24233h != i2) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i2 = this.f24233h;
                }
            } catch (InterruptedException e2) {
                this.f24230b.a(e2);
                return;
            }
        }
        if (this.j >= this.f24234i) {
            this.f24229a.b();
        }
    }

    public C3343a b(boolean z2) {
        this.f = z2;
        return this;
    }

    public C3343a a(InterfaceC3345b interfaceC3345b) {
        if (interfaceC3345b == null) {
            this.f24229a = m;
            return this;
        }
        this.f24229a = interfaceC3345b;
        return this;
    }

    public C3343a a(gj gjVar) {
        if (gjVar == null) {
            this.f24230b = f24228n;
            return this;
        }
        this.f24230b = gjVar;
        return this;
    }

    public C3343a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f24232e = str;
        return this;
    }

    public C3343a a(boolean z2) {
        this.g = z2;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String string = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    StringBuilder sbW = a.w(string);
                    sbW.append(stackTraceElement.toString());
                    sbW.append(";\n");
                    string = sbW.toString();
                }
            }
        }
        return string;
    }

    public void a(int i2) {
        this.f24234i = i2;
    }
}
