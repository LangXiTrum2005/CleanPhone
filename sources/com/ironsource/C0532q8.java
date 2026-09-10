package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0532q8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30112c = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30114b;

    public C0532q8(int i10, String str) {
        this.f30114b = i10;
        this.f30113a = str == null ? "" : str;
    }

    public int a() {
        return this.f30114b;
    }

    public String b() {
        return this.f30113a;
    }

    public String toString() {
        return "error - code:" + this.f30114b + ", message:" + this.f30113a;
    }
}
