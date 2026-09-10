package com.umeng.analytics.pro;

/* JADX INFO: loaded from: classes3.dex */
public class de extends bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2557a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private static final long g = 1;
    protected int f;

    public de() {
        this.f = 0;
    }

    public int a() {
        return this.f;
    }

    public de(int i) {
        this.f = i;
    }

    public de(int i, String str) {
        super(str);
        this.f = i;
    }

    public de(String str) {
        super(str);
        this.f = 0;
    }

    public de(int i, Throwable th) {
        super(th);
        this.f = i;
    }

    public de(Throwable th) {
        super(th);
        this.f = 0;
    }

    public de(String str, Throwable th) {
        super(str, th);
        this.f = 0;
    }

    public de(int i, String str, Throwable th) {
        super(str, th);
        this.f = i;
    }
}
