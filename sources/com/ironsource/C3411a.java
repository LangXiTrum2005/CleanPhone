package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3411a extends Thread {
    private static final int l = 1;
    private static final InterfaceC3429b m = new C0379a();
    private static final InterfaceC3707q9 n = new b();
    private final int d;
    private InterfaceC3429b a = m;
    private InterfaceC3707q9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$b */
    public class b implements InterfaceC3707q9 {
        @Override // com.ironsource.InterfaceC3707q9
        public void a(InterruptedException interruptedException) {
            interruptedException.getMessage();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3411a c3411a = C3411a.this;
            c3411a.h = (c3411a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C3411a(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public C3411a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        while (!isInterrupted() && this.j < this.i) {
            int i = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.a.a();
                    String str = C3631m4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new J5(C3631m4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.a.b();
        }
    }

    public int a() {
        return this.j;
    }

    public C3411a b(boolean z) {
        this.f = z;
        return this;
    }

    public C3411a a(InterfaceC3429b interfaceC3429b) {
        if (interfaceC3429b == null) {
            this.a = m;
            return this;
        }
        this.a = interfaceC3429b;
        return this;
    }

    public C3411a a(InterfaceC3707q9 interfaceC3707q9) {
        if (interfaceC3707q9 == null) {
            this.b = n;
            return this;
        }
        this.b = interfaceC3707q9;
        return this;
    }

    public C3411a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C3411a a(boolean z) {
        this.g = z;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    public class C0379a implements InterfaceC3429b {
        @Override // com.ironsource.InterfaceC3429b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        @Override // com.ironsource.InterfaceC3429b
        public void a() {
        }
    }
}
