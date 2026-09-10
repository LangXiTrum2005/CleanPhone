package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14806e;

    public ga(int i10, int i11, int i12, int i13) {
        switch (i13) {
            case 1:
                this.f14802a = i10 != Integer.MIN_VALUE ? d5.u.f(i10, "/") : "";
                this.f14803b = i11;
                this.f14804c = i12;
                this.f14805d = Integer.MIN_VALUE;
                this.f14806e = "";
                break;
            default:
                this.f14802a = i10 != Integer.MIN_VALUE ? l1.d.i(new StringBuilder(String.valueOf(i10).length() + 1), i10, "/") : "";
                this.f14803b = i11;
                this.f14804c = i12;
                this.f14805d = Integer.MIN_VALUE;
                this.f14806e = "";
                break;
        }
    }

    public void a() {
        int i10 = this.f14805d;
        this.f14805d = i10 == Integer.MIN_VALUE ? this.f14803b : i10 + this.f14804c;
        this.f14806e = this.f14802a + this.f14805d;
    }

    public void b() {
        if (this.f14805d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public void c() {
        int i10 = this.f14805d;
        int i11 = i10 == Integer.MIN_VALUE ? this.f14803b : i10 + this.f14804c;
        this.f14805d = i11;
        int length = String.valueOf(i11).length();
        String str = this.f14802a;
        this.f14806e = l1.d.k(new StringBuilder(str.length() + length), str, i11);
    }

    public void d() {
        if (this.f14805d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public ga(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11, 1);
    }
}
