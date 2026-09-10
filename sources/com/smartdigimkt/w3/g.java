package com.smartdigimkt.w3;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39279c = 0;
    public static final int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39280e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39282b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private g(int i2, String str, Throwable th, int i3) {
        super(str, th);
        this.f39281a = i2;
        this.f39282b = i3;
    }

    public static g a(Exception exc, int i2) {
        return new g(1, null, exc, i2);
    }

    public Exception b() {
        com.smartdigimkt.p4.a.b(this.f39281a == 1);
        return (Exception) getCause();
    }

    public IOException c() {
        com.smartdigimkt.p4.a.b(this.f39281a == 0);
        return (IOException) getCause();
    }

    public RuntimeException d() {
        com.smartdigimkt.p4.a.b(this.f39281a == 2);
        return (RuntimeException) getCause();
    }

    public static g a(IOException iOException) {
        return new g(0, null, iOException, -1);
    }

    public static g a(RuntimeException runtimeException) {
        return new g(2, null, runtimeException, -1);
    }
}
