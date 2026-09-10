package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f36310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f36311b;

    public e(IOException iOException) {
        super(iOException);
        this.f36310a = iOException;
        this.f36311b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f36310a, (Throwable) iOException);
        this.f36311b = iOException;
    }

    public IOException d() {
        return this.f36310a;
    }

    public IOException g() {
        return this.f36311b;
    }
}
