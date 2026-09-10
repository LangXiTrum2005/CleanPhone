package com.smartdigimkt.w6;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39562c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39563e;

    public j() {
    }

    public void a(String str) {
        this.f39561b = str;
    }

    public long b() {
        return this.f39562c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f39560a;
    }

    public String e() {
        return this.f39561b;
    }

    public String f() {
        return "unitId:" + e() + ",showCount:" + c() + ",clickCount:" + a() + ",expireTime:" + b();
    }

    public j(int i2, String str) {
        this.f39560a = i2;
        this.f39561b = str;
        this.d = 0;
        this.f39563e = 0;
        this.f39562c = -1L;
    }

    public void a(long j) {
        this.f39562c = j;
    }

    public void b(int i2) {
        this.d = i2;
    }

    public void c(int i2) {
        this.f39560a = i2;
    }

    public int a() {
        return this.f39563e;
    }

    public void a(int i2) {
        this.f39563e = i2;
    }
}
