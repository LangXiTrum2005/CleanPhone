package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25702c;
    private String d;

    public mc(int i2, String str, String str2, String str3) {
        this.f25702c = i2;
        this.f25701b = str2;
        this.f25700a = str;
        this.d = str3;
    }

    public void a() {
        ha.a(this);
    }

    public String b() {
        return this.f25701b;
    }

    public int c() {
        return this.f25702c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f25700a;
    }

    public mc(String str, String str2, String str3) {
        this.f25702c = -1;
        this.f25701b = str2;
        this.f25700a = str;
        this.d = str3;
    }
}
