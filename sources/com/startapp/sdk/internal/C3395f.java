package com.startapp.sdk.internal;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.startapp.sdk.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C3395f extends Thread implements Handler.Callback, Printer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3393d f40945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3394e f40946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3392c f40947c;
    public y3 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f40948e;
    public final AtomicLong f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f40949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40950i;

    public C3395f(long j, boolean z2) {
        super("startapp-anr");
        this.f40945a = new C3390a();
        this.f40946b = new C3391b();
        this.f40947c = new C3392c();
        this.f40948e = new Handler(Looper.getMainLooper(), this);
        this.f = new AtomicLong(0L);
        this.f40949h = new AtomicReference("");
        this.g = j;
        this.f40950i = z2;
    }

    public final void a() {
        long jA = this.g;
        boolean zA = false;
        boolean z2 = true;
        while (!isInterrupted()) {
            if (this.f.getAndAdd(jA) == 0) {
                if (zA && !a((String) this.f40949h.get())) {
                    this.f40945a.remove();
                    zA = false;
                }
                this.f40948e.sendEmptyMessage(101);
                z2 = true;
            }
            try {
                synchronized (this) {
                    try {
                        wait(jA);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long j = this.f.get();
                String str = (String) this.f40949h.get();
                if (j > 0 && !zA && (z2 || a(str))) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        zA = true;
                    } else {
                        jA = this.f40946b.a(j);
                        if (jA > 0) {
                            z2 = false;
                        } else {
                            zA = this.f40945a.a(str, j);
                            jA = this.g;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f40947c.getClass();
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f.set(0L);
        return true;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f40949h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f40949h.set("");
            this.f.set(0L);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        this.f40945a.a();
        this.f40945a.remove();
        if (this.f40950i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    public final boolean a(String str) {
        boolean z2 = (this.f40950i && TextUtils.isEmpty(str)) ? false : true;
        y3 y3Var = this.d;
        return z2 && (y3Var == null || !vi.c(y3Var.f41703a.f41559a));
    }
}
