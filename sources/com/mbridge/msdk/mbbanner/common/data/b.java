package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34428c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34430e;

    public b(String str, String str2, int i10, int i11) {
        this.f34426a = str;
        this.f34427b = str2;
        this.f34429d = i10;
        this.f34430e = i11;
    }

    public void a(int i10) {
        this.f34429d = i10;
    }

    public void b(String str) {
        this.f34427b = str;
    }

    public int c() {
        return this.f34429d;
    }

    public String d() {
        return this.f34427b;
    }

    public String a() {
        return this.f34428c;
    }

    public int b() {
        return this.f34430e;
    }

    public void a(String str) {
        this.f34428c = str;
    }
}
