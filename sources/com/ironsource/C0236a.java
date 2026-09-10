package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0236a extends Thread {
    private static final int l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC0254b f28134m = new C0051a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final InterfaceC0586t9 f28135n = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28139d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0254b f28136a = f28134m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0586t9 f28137b = f28135n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f28138c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28140e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28141f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28142g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f28143h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28144i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28145j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f28146k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements InterfaceC0586t9 {
        @Override // com.ironsource.InterfaceC0586t9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0236a c0236a = C0236a.this;
            c0236a.f28143h = (c0236a.f28143h + 1) % Integer.MAX_VALUE;
        }
    }

    public C0236a(int i10) {
        this.f28139d = i10;
    }

    public C0236a c() {
        this.f28140e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f28145j < this.f28144i) {
            int i11 = this.f28143h;
            this.f28138c.post(this.f28146k);
            try {
                Thread.sleep(this.f28139d);
                if (this.f28143h != i11) {
                    this.f28145j = 0;
                } else if (this.f28142g || !Debug.isDebuggerConnected()) {
                    this.f28145j++;
                    this.f28136a.a();
                    String str = C0474n4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new K5(C0474n4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.f28143h != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f28143h;
                }
            } catch (InterruptedException e10) {
                this.f28137b.a(e10);
                return;
            }
        }
        if (this.f28145j >= this.f28144i) {
            this.f28136a.b();
        }
    }

    public void a(int i10) {
        this.f28144i = i10;
    }

    public int b() {
        return this.f28144i;
    }

    public int a() {
        return this.f28145j;
    }

    public C0236a b(boolean z10) {
        this.f28141f = z10;
        return this;
    }

    public C0236a a(InterfaceC0254b interfaceC0254b) {
        if (interfaceC0254b == null) {
            this.f28136a = f28134m;
            return this;
        }
        this.f28136a = interfaceC0254b;
        return this;
    }

    public C0236a a(InterfaceC0586t9 interfaceC0586t9) {
        if (interfaceC0586t9 == null) {
            this.f28137b = f28135n;
            return this;
        }
        this.f28137b = interfaceC0586t9;
        return this;
    }

    public C0236a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f28140e = str;
        return this;
    }

    public C0236a a(boolean z10) {
        this.f28142g = z10;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String string = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    StringBuilder sbI = d5.u.i(string);
                    sbI.append(stackTraceElement.toString());
                    sbI.append(";\n");
                    string = sbI.toString();
                }
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0051a implements InterfaceC0254b {
        @Override // com.ironsource.InterfaceC0254b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        @Override // com.ironsource.InterfaceC0254b
        public void a() {
        }
    }
}
