package com.mbridge.msdk.advanced.request;

import androidx.annotation.NonNull;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31550e;

    public void a(String str) {
        this.f31547b = str;
    }

    public int b() {
        return this.f31549d;
    }

    public int c() {
        return this.f31548c;
    }

    public int d() {
        return this.f31546a;
    }

    public String e() {
        return this.f31547b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb2.append(this.f31546a);
        sb2.append(", session_id='");
        sb2.append(this.f31547b);
        sb2.append("', offset=");
        sb2.append(this.f31548c);
        sb2.append(", expectWidth=");
        sb2.append(this.f31549d);
        sb2.append(", expectHeight=");
        return u.g(sb2, this.f31550e, '}');
    }

    public int a() {
        return this.f31550e;
    }

    public void b(int i10) {
        this.f31549d = i10;
    }

    public void c(int i10) {
        this.f31548c = i10;
    }

    public void d(int i10) {
        this.f31546a = i10;
    }

    public void a(int i10) {
        this.f31550e = i10;
    }
}
