package com.smartdigimkt.h0;

/* JADX INFO: loaded from: classes5.dex */
public class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35564c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35565e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35566h;

    public b() {
        this(30000, 0);
    }

    @Override // com.smartdigimkt.h0.m
    public boolean a(com.smartdigimkt.i0.a aVar) {
        int i2 = this.f35563b + 1;
        this.f35563b = i2;
        return i2 <= this.f35564c;
    }

    @Override // com.smartdigimkt.h0.m
    public int b() {
        return this.f35566h;
    }

    @Override // com.smartdigimkt.h0.m
    public int c() {
        return this.f;
    }

    @Override // com.smartdigimkt.h0.m
    public int d() {
        return this.d;
    }

    @Override // com.smartdigimkt.h0.m
    public int e() {
        return this.g;
    }

    @Override // com.smartdigimkt.h0.m
    public int f() {
        return this.f35564c;
    }

    @Override // com.smartdigimkt.h0.m
    public int g() {
        return this.f35562a;
    }

    @Override // com.smartdigimkt.h0.m
    public int h() {
        return this.f35563b;
    }

    public b(int i2, int i3) {
        this.d = 2;
        this.f35565e = 0;
        this.f = 0;
        this.g = 0;
        this.f35566h = 0;
        this.f35562a = i2 <= 0 ? 30000 : i2;
        this.f35564c = i3;
    }

    @Override // com.smartdigimkt.h0.m
    public int a() {
        return this.f35565e;
    }

    public b(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.d = 2;
        this.f35565e = 0;
        this.f = 0;
        this.g = 0;
        this.f35566h = 0;
        this.f35565e = Math.max(i2, 0);
        this.f = Math.max(i3, 0);
        this.g = Math.max(i4, 0);
        this.f35566h = Math.max(i5, 0);
        this.f35564c = Math.max(i6, 0);
        this.d = i7;
    }

    public b(int i2, int i3, int i4, int i5, int i6) {
        this.d = 2;
        this.f35565e = 0;
        this.f = 0;
        this.g = 0;
        this.f35566h = 0;
        this.f35565e = Math.max(i2, 0);
        this.f = Math.max(i3, 0);
        this.g = Math.max(i4, 0);
        this.f35566h = Math.max(i5, 0);
        this.f35564c = Math.max(i6, 0);
    }
}
