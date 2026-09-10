package com.smartdigimkt.x7;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39959c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39960e;
    private Object f;

    private e() {
    }

    public static e a() {
        return new e();
    }

    public int b() {
        return this.f39958b;
    }

    public Object c() {
        return this.f;
    }

    public int d() {
        return this.f39960e;
    }

    public long e() {
        return this.f39959c;
    }

    public String f() {
        return this.f39957a;
    }

    public boolean g() {
        return this.d;
    }

    public String toString() {
        return "HttpRespEntity{urlKey='" + this.f39957a + "', statusCode=" + this.f39958b + ", reqNextTime=" + this.f39959c + ", isIntercept=" + this.d + ", interceptStatusCode=" + this.f39960e + ", interceptResult=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    public void a(String str) {
        this.f39957a = str;
    }

    public void b(int i2) {
        this.f39960e = i2;
    }

    public void a(int i2) {
        this.f39958b = i2;
    }

    public void a(long j) {
        this.f39959c = j;
    }

    public void a(boolean z2) {
        this.d = z2;
    }

    public void a(Object obj) {
        this.f = obj;
    }
}
