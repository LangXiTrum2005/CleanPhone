package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class nh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26287c = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26289b;

    public nh(int i2, String str) {
        this.f26289b = i2;
        this.f26288a = str == null ? "" : str;
    }

    public int a() {
        return this.f26289b;
    }

    public String b() {
        return this.f26288a;
    }

    public String toString() {
        return "error - code:" + this.f26289b + ", message:" + this.f26288a;
    }
}
