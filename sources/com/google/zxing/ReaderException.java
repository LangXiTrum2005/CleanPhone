package com.google.zxing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReaderException extends Exception {
    public static final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final StackTraceElement[] f21334Y;

    static {
        X = System.getProperty("surefire.test.class.path") != null;
        f21334Y = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
