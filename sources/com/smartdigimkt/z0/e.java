package com.smartdigimkt.z0;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40303c;
    private int d;

    public e(String str, String str2, int i2, int i3) {
        this.f40301a = str;
        this.f40302b = str2;
        this.f40303c = i2;
        this.d = i3;
    }

    public void a(String str) {
        this.f40302b = str;
    }

    public void b(String str) {
        this.f40301a = str;
    }

    public String c() {
        return this.f40302b;
    }

    public String d() {
        return this.f40301a;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f40303c;
    }

    public void a(int i2) {
        this.d = i2;
    }

    public void b(int i2) {
        this.f40303c = i2;
    }
}
