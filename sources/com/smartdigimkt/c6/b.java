package com.smartdigimkt.c6;

/* JADX INFO: loaded from: classes5.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int f34305b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f34306c = -2;
    public static final int d = -3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34307a;

    public b(String str) {
        b("-1: " + str);
    }

    public void b(String str) {
        this.f34307a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f34307a;
    }

    public b(String str, String str2) {
        b(str + ": " + str2);
    }
}
