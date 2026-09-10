package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f36822d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36825c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f36825c = timeUnit.toNanos(j10);
        return this;
    }

    public t b() {
        this.f36825c = 0L;
        return this;
    }

    public long c() {
        if (this.f36823a) {
            return this.f36824b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f36823a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f36823a && this.f36824b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f36825c;
    }

    public t a(long j10) {
        this.f36823a = true;
        this.f36824b = j10;
        return this;
    }

    public t a() {
        this.f36823a = false;
        return this;
    }
}
