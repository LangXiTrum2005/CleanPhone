package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3671o8 {
    public static final int c = 1001;
    private String a;
    private int b;

    public C3671o8(int i, String str) {
        this.b = i;
        this.a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "error - code:" + this.b + ", message:" + this.a;
    }
}
