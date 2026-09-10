package com.smartdigimkt.a4;

import com.smartdigimkt.a4.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface f<T extends i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f33643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33644b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f33645c = 2;
    public static final int d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f33646e = 4;

    public static class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int d();

    Map<String, String> e();

    T f();

    byte[] g();

    a h();
}
