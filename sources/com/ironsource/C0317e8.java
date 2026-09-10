package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.e8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0317e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28521c;

    public C0317e8() {
        this.f28519a = 0;
        this.f28520b = 0;
        this.f28521c = "";
    }

    public int a() {
        return this.f28520b;
    }

    public String b() {
        return this.f28521c;
    }

    public int c() {
        return this.f28519a;
    }

    public boolean d() {
        return this.f28520b > 0 && this.f28519a > 0;
    }

    public boolean e() {
        return this.f28520b == 0 && this.f28519a == 0;
    }

    public String toString() {
        return this.f28521c;
    }

    public C0317e8(int i10, int i11, String str) {
        this.f28519a = i10;
        this.f28520b = i11;
        this.f28521c = str;
    }
}
