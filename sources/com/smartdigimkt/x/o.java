package com.smartdigimkt.x;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39801c;

    public o(String str, String str2, int i2) {
        this.f39800b = str;
        this.f39799a = str2;
        this.f39801c = i2;
    }

    public String b() {
        return this.f39800b;
    }

    public String c() {
        return this.f39799a;
    }

    public void b(String str) {
        this.f39800b = str;
    }

    public void c(String str) {
        this.f39799a = str;
    }
}
