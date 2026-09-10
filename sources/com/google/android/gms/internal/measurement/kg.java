package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kg implements Runnable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg f23683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23684b = mb.e(Thread.currentThread());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23687e;

    public kg(sg sgVar, boolean z10) {
        this.f23687e = false;
        this.f23683a = sgVar;
        this.f23687e = z10;
    }

    public final void a(ta.r rVar) {
        if (this.f23685c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.f23686d) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.f23686d = true;
        rVar.addListener(this, ta.c0.f50592a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        sg sgVar = this.f23683a;
        try {
            this.f23683a = null;
            boolean z10 = this.f23686d;
            if (!z10) {
                if (this.f23685c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f23685c = true;
                if (this.f23684b && !z10) {
                    mb.e(Thread.currentThread());
                }
            }
            if (sgVar != null) {
                sgVar.close();
            }
            if (this.f23687e) {
                dg.b(dg.c(), jg.f23629g);
            }
        } catch (Throwable th2) {
            if (sgVar != null) {
                try {
                    sgVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (this.f23685c || !(z10 = this.f23686d)) {
            mb.g().post(be.f23320c);
            return;
        }
        this.f23685c = true;
        if (!this.f23684b || z10) {
            return;
        }
        mb.e(Thread.currentThread());
    }
}
