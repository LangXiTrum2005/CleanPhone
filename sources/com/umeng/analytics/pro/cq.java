package com.umeng.analytics.pro;

/* JADX INFO: loaded from: classes3.dex */
public class cq extends bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2548a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private static final long h = 1;
    protected int g;

    public cq() {
        this.g = 0;
    }

    public int a() {
        return this.g;
    }

    public cq(int i) {
        this.g = i;
    }

    public cq(int i, String str) {
        super(str);
        this.g = i;
    }

    public cq(String str) {
        super(str);
        this.g = 0;
    }

    public cq(int i, Throwable th) {
        super(th);
        this.g = i;
    }

    public cq(Throwable th) {
        super(th);
        this.g = 0;
    }

    public cq(String str, Throwable th) {
        super(str, th);
        this.g = 0;
    }

    public cq(int i, String str, Throwable th) {
        super(str, th);
        this.g = i;
    }
}
