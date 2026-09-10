package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35936e;

    public void a(String str) {
        this.f35933b = str;
    }

    public int b() {
        return this.f35935d;
    }

    public int c() {
        return this.f35934c;
    }

    public int d() {
        return this.f35932a;
    }

    public String e() {
        return this.f35933b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb2.append(this.f35932a);
        sb2.append(", session_id='");
        sb2.append(this.f35933b);
        sb2.append("', offset=");
        sb2.append(this.f35934c);
        sb2.append(", expectWidth=");
        sb2.append(this.f35935d);
        sb2.append(", expectHeight=");
        return u.g(sb2, this.f35936e, '}');
    }

    public int a() {
        return this.f35936e;
    }

    public void b(int i10) {
        this.f35935d = i10;
    }

    public void c(int i10) {
        this.f35934c = i10;
    }

    public void d(int i10) {
        this.f35932a = i10;
    }

    public void a(int i10) {
        this.f35936e = i10;
    }
}
